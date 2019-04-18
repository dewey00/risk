package com.iapi.drools.service.impl;

import com.iapi.drools.bean.TbRiskIapi;
import com.iapi.drools.service.IDynamicItemService;
import com.iapi.drools.service.IElasticSearchService;
import com.iapi.drools.service.IndexItemService;
import com.iapi.drools.utils.ElasticSearchIndexes;
import com.iapi.drools.utils.MapSortUtils;
import com.iapi.drools.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.elasticsearch.index.query.QueryBuilder;

/**
 * @ClassName DynamicItem
 * @Description
 * @Author ChengGuojun
 * @Date 2019-02-26 16:20
 * @Version 1.0
 */
@Service
public class DynamicItemImpl implements IDynamicItemService {
    private Logger logger = LogManager.getLogger(DynamicItemImpl.class);
    /**
     * personId
     */
    private static final String PERSID = "pers_id";

    @Autowired
    private IElasticSearchService iElasticSearchService;

    @Autowired
    private IndexItemService indexItemService;

    /**
     * person 各指标项计算，返回计算后各指标项的值
     *
     * @param personId    人员ID
     * @param passPortNo  证件号码
     * @param nationality 国籍
     * @param name        英文姓名
     * @param birthday    出生日期
     * @param tbRiskIapi  接口对象
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @date 2018年10月24日 上午9:23:58
     */
    @Override
    public Map<String, Object> dynamicItem(String personId, String passPortNo, String nationality, String name, String birthday, TbRiskIapi tbRiskIapi) {
        // 开始标记
        long startFlag = System.currentTimeMillis();
        QueryBuilder queryAll = QueryBuilders.matchAllQuery();
        CompletableFuture<List<HashMap>> tbRiskDictionariesDetails = iElasticSearchService.queryAllByScroll(queryAll, ElasticSearchIndexes.TB_RISK_DICTIONARIES_ETAILS);
        // 机场查国籍
        CompletableFuture<List<HashMap>> iapiDmAirport = iElasticSearchService.queryAllByScroll(queryAll, ElasticSearchIndexes.IAPI_DM_AIRPORT);

        List<HashMap> listImm = new ArrayList<>();
        List<HashMap> evtf = new ArrayList<>();
        List<HashMap> personInfo = new ArrayList<>();
        if (StringUtils.isNotEmpty(personId)) {
            //出入境信息表
            CompletableFuture<List<HashMap>> dcapFPerActPsrImmC = iElasticSearchService.queryAllByScroll(ElasticSearchIndexes.DCAP_F_PER_ACT_PSR_IMM, PERSID, personId, personId, 100);
            // 涉外案事件人员信息
            CompletableFuture<List<HashMap>> dcapFEvtFgnCasPersonC = iElasticSearchService.queryAllByScroll(ElasticSearchIndexes.DCAP_F_EVT_FGN_CAS_PERSON, PERSID, personId, personId, 100);
            String qCHN = "CHN";
            String qTWN = "TWN";
            String qHKG = "HKG";
            String qMAC = "MAC";
            QueryBuilder queryBuilder = QueryBuilders.matchPhraseQuery("pers_id", personId);
            if (qCHN.equals(nationality)) {
                CompletableFuture<List<HashMap>> lists = iElasticSearchService.queryAllByScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_CHN_ISSUE);
                List<HashMap> list = getList(lists);
                if(list!=null){
                    for (HashMap l: list) {
                        if("1".equals(l.get("data_src_flag")) || "2".equals(l.get("data_src_flag"))){
                            personInfo.add(l);
                        }
                    }
                }
            } else if (qTWN.equals(nationality) || qHKG.equals(nationality) || qMAC.equals(nationality)) {
                CompletableFuture<List<HashMap>> lists = iElasticSearchService.queryAllByScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_HMT_ISSUE);
                List<HashMap> list = getList(lists);
                if(list!=null){
                    for (HashMap l: list) {
                        if("52".equals(l.get("data_source")) || "53".equals(l.get("data_source"))){
                            personInfo.add(l);
                        }
                    }
                }
            } else {
                CompletableFuture<List<HashMap>> lists = iElasticSearchService.queryAllByScroll(ElasticSearchIndexes.DCAP_F_PER_CERT_FGN_VISA, PERSID, personId, personId, 100);
                List<HashMap> list = getList(lists);
                if(list!=null){
                    for (HashMap l : list) {
                        if ("1".equals(l.get("data_src_flag")) || "2".equals(l.get("data_src_flag")) || "54".equals(l.get("data_src_flag"))) {
                            personInfo.add(l);
                        }
                    }
                }
            }
            listImm = getList(dcapFPerActPsrImmC);
            evtf = getList(dcapFEvtFgnCasPersonC);
        }
        List<HashMap> dictionaries = getList(tbRiskDictionariesDetails);
        List<HashMap> iapiDmAirports = getList(iapiDmAirport);
        // 执行动态脚本
        Map<String, Object> scriptMap = MapSortUtils.objectToMap(tbRiskIapi);
        scriptMap.put("pers_id", personId);
        scriptMap.put("passPortNo", passPortNo);
        scriptMap.put("nationality", nationality);
        scriptMap.put("name", name);
        scriptMap.put("birthday", birthday);
        // 赋值完成 返回map
        Map<String, Object> resultMap = new HashMap<>(0);
        indexItemService.executeScript(scriptMap, listImm, dictionaries, iapiDmAirports, evtf, personInfo, resultMap);
        // 计算时间
        long initFlag = System.currentTimeMillis();
        logger.info("dynamicItem time   " + (initFlag - startFlag));
        return resultMap;
    }

    @Override
    public Map<String, Object> dynamicItem(String personId, String passPortNo, String nationality, String name, String birthday, HashMap scriptMap) {
        // 开始标记
        long startFlag = System.currentTimeMillis();
        QueryBuilder queryAll = QueryBuilders.matchAllQuery();
        CompletableFuture<List<HashMap>> iapiDmAirport = iElasticSearchService.queryAllByScroll(queryAll, ElasticSearchIndexes.IAPI_DM_AIRPORT);
        CompletableFuture<List<HashMap>> tbRiskDictionariesDetails = iElasticSearchService.queryAllByScroll(queryAll, ElasticSearchIndexes.TB_RISK_DICTIONARIES_ETAILS);
        // 机场查国籍
        List<HashMap> personInfo = new ArrayList<>();
        List<HashMap> evtf = new ArrayList<>();
        List<HashMap> listImm = new ArrayList<>();
        if (StringUtils.isNotEmpty(personId)) {
            // 涉外案事件人员信息
            CompletableFuture<List<HashMap>> dcapFEvtFgnCasPersonC = iElasticSearchService.queryAllByScroll(ElasticSearchIndexes.DCAP_F_EVT_FGN_CAS_PERSON, PERSID, personId, personId, 10000);
            //出入境信息表
            CompletableFuture<List<HashMap>> dcapFPerActPsrImmC = iElasticSearchService.queryAllByScroll(ElasticSearchIndexes.DCAP_F_PER_ACT_PSR_IMM, PERSID, personId, personId, 10000);
            String qCHN = "CHN";
            String qTWN = "TWN";
            String qMAC = "MAC";
            String qHKG = "HKG";
            QueryBuilder queryBuilder = QueryBuilders.matchPhraseQuery("pers_id", personId);
            if (qTWN.equals(nationality) || qMAC.equals(nationality)|| qHKG.equals(nationality) ) {
                CompletableFuture<List<HashMap>> lists = iElasticSearchService.queryAllByScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_HMT_ISSUE);
                List<HashMap> list = getList(lists);
                if(list!=null){
                    for (HashMap l: list) {
                        if("52".equals(l.get("data_source")) || "53".equals(l.get("data_source"))){
                            personInfo.add(l);
                        }
                    }
                }
            }else if (qCHN.equals(nationality)) {
                CompletableFuture<List<HashMap>> lists = iElasticSearchService.queryAllByScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_CHN_ISSUE);
                List<HashMap> list = getList(lists);
                if(list!=null){
                    for (HashMap l: list) {
                        if("1".equals(l.get("data_src_flag")) || "2".equals(l.get("data_src_flag"))){
                            personInfo.add(l);
                        }
                    }
                }
            } else {
                CompletableFuture<List<HashMap>> lists = iElasticSearchService.queryAllByScroll(ElasticSearchIndexes.DCAP_F_PER_CERT_FGN_VISA, PERSID, personId, personId, 10000);
                List<HashMap> list = getList(lists);
                if(list!=null){
                    for (HashMap l : list) {
                        if ("1".equals(l.get("data_src_flag")) || "2".equals(l.get("data_src_flag")) || "54".equals(l.get("data_src_flag"))) {
                            personInfo.add(l);
                        }
                    }
                }
            }
            evtf = getList(dcapFEvtFgnCasPersonC);
            listImm = getList(dcapFPerActPsrImmC);
        }
        List<HashMap> dictionaries = getList(tbRiskDictionariesDetails);
        List<HashMap> iapiDmAirports = getList(iapiDmAirport);
        Map<String, Object> resultMap = new HashMap<>(0);
        // 执行动态脚本
        scriptMap.put("pers_id", personId);
        scriptMap.put("passPortNo", passPortNo);
        scriptMap.put("name", name);
        scriptMap.put("nationality", nationality);
        scriptMap.put("birthday", birthday);
        // 赋值完成 返回map
        indexItemService.executeScript(scriptMap, listImm, dictionaries, iapiDmAirports, evtf, personInfo, resultMap);
        // 计算时间
        long initFlag = System.currentTimeMillis();
        logger.info("dynamicItem time   " + (initFlag - startFlag));
        return resultMap;

    }

    private List<HashMap> getList(CompletableFuture<List<HashMap>> listCompletableFuture) {
        try {
            return listCompletableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            logger.error(e);
            return null;
        }
    }


}
