package com.iapi.drools.service;

import com.iapi.drools.bean.indexitem.IndexItem;
import com.iapi.drools.bean.indexitem.RequestIndexItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author cheng
 * @Description //
 * @Date 16:58 2019/1/18
 * @Param
 * @return
 */
public interface IndexItemService {

    /**
     * @return java.lang.String
     * @Author cheng
     * @Description 添加
     * @Date 17:05 2019/1/18
     * @Param [indexItems]
     */
    String addIndexItem(RequestIndexItem indexItems);

    /**
     * @return java.lang.String
     * @Author
     * @Description //
     * @Date 17:01 2019/1/21
     * @Param [indexItems]
     */
    String updateIndexItem(IndexItem indexItems);

    String deleteIndexItem(String script);

    IndexItem findIndexItem(String script);

    String clearScript();

    /**
     * 执行脚本
     *
     * @Author cheng
     * @Date 15:18 2019/2/18
     * @Param [paramMap, listImm, dictionariesCode, iapiDmAirports, resultMap]
     */
    void executeScript(Map<String, Object> scriptMap, List<HashMap> listImm, List<HashMap> dictionaries, List<HashMap> iapiDmAirports,List<HashMap> evtf, List<HashMap> ps,Map<String, Object> resultMap);

    /**
     * 查询全部指标项
     *
     * @return java.util.List<com.iapi.drools.bean.indexitem.IndexItem>
     * @Author cheng
     * @Description
     * @Date 14:56 2019/2/25
     * @Param []
     */
    List<IndexItem> findAllScript();

    Map<String, Object> execTestScript();

    /**
    * @Author cheng
    * @Description 验证语法
    * @Date 11:28 2019/3/7
    * @Param [indexItem]
    * @return java.lang.String
    *
    */
    String validateScript(RequestIndexItem indexItems);

    /**
    * 重新加载脚本
     *
     * @Author cheng
    * @Description //TODO
    * @Date 10:45 2019/3/11
    * @Param []
    * @return void
    *
    */
    void reloadScript();

    /**
     * 重建引擎对象重新加载脚本
     *
     * @Author cheng
     * @Description //TODO
     * @Date 10:45 2019/3/11
     * @Param []
     * @return void
     *
     */
    void reCreateEngine();

}
