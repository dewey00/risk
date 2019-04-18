package com.iapi.drools.service.impl;

import com.iapi.drools.bean.indexitem.IndexItem;
import com.iapi.drools.bean.indexitem.RequestIndexItem;
import com.iapi.drools.dao.IElasticSearchDao;
import com.iapi.drools.dao.IndexItemDao;
import com.iapi.drools.service.IndexItemService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @ClassName IndexItemServiceImpl
 * @Description
 * @Author ChengGuojun
 * @Date 2019-01-18 16:59
 * @Version 1.0
 */
@Service
public class IndexItemServiceImpl implements IndexItemService {
    private Logger logger = LogManager.getLogger(IndexItemServiceImpl.class);
    @Autowired
    IndexItemDao indexItemDao;

    @Autowired
    IElasticSearchDao elasticSearchDao;
    @Autowired
    GroovyAsync groovyAsync;

    @Autowired
    private ScriptEngine engine;

    /**
     * @return java.lang.String
     * @Author cheng
     * @Description 调用增删改查直接入库
     * @Date 10:24 2019/1/21
     * @Param [indexItems]
     */
    @Override
    public String addIndexItem(RequestIndexItem indexItems) {
        String success = "success";
        String msg = validateScript(indexItems);
        if (success.equals(msg)) {
            List<IndexItem> items = indexItems.getIndexItems();
            return indexItemDao.addItems(items);
        } else {
            return msg;
        }
    }

    @Override
    public String updateIndexItem(IndexItem indexItems) {
        List<IndexItem> items = new ArrayList<>();
        items.add(indexItems);
        RequestIndexItem requestIndexItem = new RequestIndexItem();
        requestIndexItem.setIndexItems(items);
        String success = "success";
        String msg = validateScript(requestIndexItem);
        if (success.equals(msg)) {
            return indexItemDao.updateItems(indexItems);
        } else {
            return msg;
        }
    }

    @Override
    public String deleteIndexItem(String script) {
        return indexItemDao.deleteItem(script);
    }

    @Override
    public IndexItem findIndexItem(String script) {
        return indexItemDao.findIndexItem(script);
    }

    @Override
    public String clearScript() {
        return indexItemDao.clearScript();
    }


    /**
     * @return void
     * @Author cheng
     * @Description //该方法执行脚本
     * @Date 11:34 2019/1/21
     * @Param [map, dictionariesCode, iapiDmAirport]
     */
    @Override
    public void executeScript(Map<String, Object> personInfo, List<HashMap> listImm, List<HashMap> tbRiskDictDetails, List<HashMap> iapiDmAirports, List<HashMap> evtf, List<HashMap> ps, Map<String, Object> resultMap) {
//        查询脚本
        long start = System.currentTimeMillis();
        List<IndexItem> items = indexItemDao.findAll();
        long end = System.currentTimeMillis();
        System.out.println("mongo select time = " + (end - start) + " ms");
        System.out.println("engine: "+engine);
        Invocable inv = (Invocable) engine;
        //定义参数数组
        Object[] params = {personInfo, listImm, tbRiskDictDetails, iapiDmAirports, evtf, ps, elasticSearchDao};
        List<CompletableFuture<HashMap<String, Object>>> objs = new ArrayList<>();
        for (IndexItem item : items) {
            // 指标项名称
            String itName = item.getItem();
            CompletableFuture<HashMap<String, Object>> obj = groovyAsync.asyncGroovyScript(inv, itName, params);
            objs.add(obj);
        }
        for (CompletableFuture<HashMap<String, Object>> defMethod : objs) {
            try {
                HashMap<String, Object> d = defMethod.get();
                resultMap.putAll(d);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        end = System.currentTimeMillis();
        logger.info("resultMap = " + resultMap + "   time = " + (end - start)+"ms  objSize =" +objs.size());
        System.gc();
    }

    @Override
    public List<IndexItem> findAllScript() {
        return indexItemDao.findAll();
    }

    @Override
    public Map<String, Object> execTestScript() {
        Map<String, Object> map = new HashMap<>(0);
        List<HashMap> weeks = new ArrayList<>();
        List<HashMap> lm = new ArrayList<>();
        HashMap<String, Object> m1 = new HashMap<>(0);
        m1.put("id", 0);
        m1.put("name", "春");
        HashMap<String, Object> m2 = new HashMap<>(0);
        m2.put("id", 1);
        m2.put("name", "夏");
        HashMap<String, Object> m3 = new HashMap<>(0);
        m3.put("id", 2);
        m3.put("name", "秋");
        HashMap<String, Object> m4 = new HashMap<>(0);
        m4.put("id", 3);
        m4.put("name", "冬");
        lm.add(m1);
        lm.add(m2);
        lm.add(m3);
        lm.add(m4);
        map.put("pers_id", "1");
        executeScript(map, weeks, weeks, weeks, weeks, lm, map);
        return map;
    }

    @Override
    public String validateScript(RequestIndexItem indexItems) {
        List<IndexItem> items = indexItems.getIndexItems();
        String script = createScript(items);
        try {
            engine.eval(script);
        } catch (ScriptException e) {
            items = indexItemDao.findAll();
            script = createScript(items);
            try {
                engine.eval(script);
            } catch (ScriptException e1) {
                e1.printStackTrace();
            }
            return e.getMessage();
        }
        return "success";
    }

    @Override
    public void reloadScript() {
      List<IndexItem>  items = indexItemDao.findAll();
      String  script = createScript(items);
        try {
            engine.eval(script);
            System.out.println("engine: "+engine);
        } catch (ScriptException e1) {
            logger.error(e1);
        }finally {
            System.gc();
        }
    }

    @Override
    public void reCreateEngine() {
        logger.info("reCreateEngine");
        engine = engine.getFactory().getScriptEngine();
    }

    private String createScript(List<IndexItem> items) {
//        系统换行符
        String line = System.lineSeparator();
        //1、 脚本内容只是方法体内的一部分
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(line);
        stringBuilder.append(line);
        for (IndexItem item : items) {
            String content = item.getContent();
            String itemName = item.getItem();
            if (itemName != null) {
                String method = " def %s(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {";
                String defName = String.format(method, itemName);
                stringBuilder.append(defName);
                stringBuilder.append(line);
                stringBuilder.append("    ");
                stringBuilder.append(content);
                stringBuilder.append(line);
                stringBuilder.append("    }");
                stringBuilder.append(line);
            }
        }
        stringBuilder.append(line);
        return stringBuilder.toString();

    }


}
