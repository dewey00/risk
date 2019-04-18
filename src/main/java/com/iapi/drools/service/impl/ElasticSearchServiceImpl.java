package com.iapi.drools.service.impl;

import com.iapi.drools.bean.RequestMessage;
import com.iapi.drools.bean.ResponseMessage;
import com.iapi.drools.bean.TbRiskIapi;
import com.iapi.drools.dao.IElasticSearchDao;
import com.iapi.drools.service.IElasticSearchService;
import com.iapi.drools.utils.DateUtils;
import com.iapi.drools.utils.ElasticSearchIndexes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;

/**
 * @author cheng
 */
@Service
public class ElasticSearchServiceImpl implements IElasticSearchService {


    @Autowired
    private IElasticSearchDao elasticSearchDao;

    private Logger logger = LogManager.getLogger(ElasticSearchServiceImpl.class);
    private final String TYPE = "doc";


    /**
     * @param message s
     * @return s
     */
    @Override
    public List<HashMap> queryPersonId(RequestMessage message) {
        logger.info("select persId");
        String qCHN = "CHN";
        String qTWN = "TWN";
        String qHKG = "HKG";
        String qMAC = "MAC";
        List<HashMap> list = new ArrayList<>();
        try {
            TbRiskIapi tbRiskIapi = message.getRisk_iapi();
            //国籍
            String nationality = null == message.getNationality() ? "" : message.getNationality();
            //证件号码
            String passportno = null == message.getPassportno() ? "" : message.getPassportno();
            //出生日期
            String birthday = null == message.getBirthday() ? "" : message.getBirthday();
            //姓名
            String names = null == message.getName() ? "" : message.getName();
            // 性别
            String genders = tbRiskIapi.getGender();
            String gender = "";
            HashMap<String, String> hashMap = new HashMap<>(3);
            hashMap.put("F", "2");
            hashMap.put("M", "1");
            hashMap.put("U", "0");
            if (!"".equals(genders)) {
                gender = hashMap.get(genders);
            }
            //国籍不是中国人的，并且不是港澳台
            if (!qCHN.equals(nationality) && !qTWN.equals(nationality) && !qHKG.equals(nationality) && !qMAC.equals(nationality)) {
                QueryBuilder queryBuilder = QueryBuilders.boolQuery().should(
                        QueryBuilders.boolQuery()
                                .must(QueryBuilders.matchPhraseQuery("country_code", nationality))
                                .must(QueryBuilders.matchPhraseQuery("cert_no", passportno))
                                .must(QueryBuilders.matchPhraseQuery("gender", gender))
                                .must(QueryBuilders.matchPhraseQuery("birth_date", birthday))
                ).should(
                        QueryBuilders.boolQuery()
                                .must(QueryBuilders.matchPhraseQuery("country_code", nationality))
                                .must(QueryBuilders.matchPhraseQuery("eng_name", names))
                                .must(QueryBuilders.matchPhraseQuery("gender", gender))
                                .must(QueryBuilders.matchPhraseQuery("birth_date", birthday))
                );
                list = elasticSearchDao.queryScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_FGN_VISA);
            }
            // 国籍是中国人的
            else {
                // 中国大陆人员签证信息
                if (qCHN.equals(nationality)) {
                    QueryBuilder queryBuilder = QueryBuilders.matchPhraseQuery("cert_no", passportno);
                    list = elasticSearchDao.queryScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_CHN_ISSUE);
                }
                // 中国港澳台人员签证信息
                else {
                    QueryBuilder queryBuilder = QueryBuilders.boolQuery()
                            .must(QueryBuilders.matchPhraseQuery("passport_hmt_no", nationality))
                            .must(QueryBuilders.matchPhraseQuery("country_code", passportno));
                    list = elasticSearchDao.queryScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_HMT_ISSUE);
                }
            }
        } catch (Exception e) {
            logger.error("ElasticSearchServiceImpl -> queryPersonId " + e);
        }

        return list;
    }

    @Override
    public List<HashMap> queryPersonId(String nationality, String passportno, String birthday, String name, String genders) {
        logger.info("select persId");
        String qTWN = "TWN";
        String qCHN = "CHN";
        String qMAC = "MAC";
        String qHKG = "HKG";
        List<HashMap> list = new ArrayList<>();
        try {
            HashMap<String, String> hashMap = new HashMap<>(3);
            hashMap.put("U", "0");
            hashMap.put("F", "2");
            hashMap.put("M", "1");
            String gender = "";
            if (genders != null) {
                gender = hashMap.get(genders);
            }
            if (!qCHN.equals(nationality) && !qTWN.equals(nationality) && !qHKG.equals(nationality) && !qMAC.equals(nationality)) {
                QueryBuilder queryBuilder = QueryBuilders.boolQuery().should(
                        QueryBuilders.boolQuery()
                                .must(QueryBuilders.matchPhraseQuery("cert_no", passportno))
                                .must(QueryBuilders.matchPhraseQuery("country_code", nationality))
                                .must(QueryBuilders.matchPhraseQuery("gender", gender))
                                .must(QueryBuilders.matchPhraseQuery("birth_date", birthday))
                ).should(
                        QueryBuilders.boolQuery()
                                .must(QueryBuilders.matchPhraseQuery("country_code", nationality))
                                .must(QueryBuilders.matchPhraseQuery("eng_name", name))
                                .must(QueryBuilders.matchPhraseQuery("gender", gender))
                                .must(QueryBuilders.matchPhraseQuery("birth_date", birthday))
                );
                list = elasticSearchDao.queryScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_FGN_VISA);
            } else {
                if (qCHN.equals(nationality)) {
                    QueryBuilder queryBuilder = QueryBuilders.matchPhraseQuery("cert_no", passportno);
                    list = elasticSearchDao.queryScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_CHN_ISSUE);
                } else {
                    QueryBuilder queryBuilder = QueryBuilders.boolQuery()
                            .must(QueryBuilders.matchPhraseQuery("country_code", passportno))
                            .must(QueryBuilders.matchPhraseQuery("passport_hmt_no", nationality));
                    list = elasticSearchDao.queryScroll(queryBuilder, ElasticSearchIndexes.DCAP_F_PER_CERT_HMT_ISSUE);
                }
            }
        } catch (Exception e) {
            logger.error("ElasticSearchServiceImpl -> queryPersonId " + e);
        }

        return list;
    }


    /**
     * 异步查询
     *
     * @param indexName 是
     * @param name      s
     * @param text      s
     * @return s
     */
    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryMatchByAsync(String indexName, String name, String text) {
        List<HashMap> results = elasticSearchDao.queryByMatchPhrase(indexName, name, text);
        return CompletableFuture.completedFuture(results);
    }

    /**
     * @param indexName s
     * @param name      s
     * @param text      s
     * @param routing   路由查詢
     * @return s
     */
    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryMatchByAsync(String indexName, String name, String text, String routing) {
        List<HashMap> results = elasticSearchDao.queryByMatchPhrase(indexName, name, text, routing);
        return CompletableFuture.completedFuture(results);
    }

    /**
     * @Author cheng
     * @Description 异步查询 使用queryBuilder配置
     * @Date 10:34 2018/12/20
     * @Param [queryBuilders, index] [QueryBuilders,索引名称]
     */
    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryByAsyncAndQueryBuilder(QueryBuilder queryBuilders, String index) {
        List<HashMap> result = elasticSearchDao.getListResultsByQueryBuilder(queryBuilders, index);
        return CompletableFuture.completedFuture(result);
    }

    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryByAsyncAndQueryBuilder(QueryBuilder queryBuilders, String index, int size) {
        List<HashMap> result = elasticSearchDao.getListResultsByQueryBuilder(queryBuilders, index, size);
        return CompletableFuture.completedFuture(result);
    }

    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryAllByScroll(QueryBuilder queryBuilder, String indexName) {
        List<HashMap> results = elasticSearchDao.queryScroll(queryBuilder, indexName);
        return CompletableFuture.completedFuture(results);
    }

    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryAllByScroll(QueryBuilder queryBuilder, String indexName, String routing) {
        List<HashMap> results = elasticSearchDao.queryScroll(queryBuilder, indexName, routing);
        return CompletableFuture.completedFuture(results);
    }

    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryAllByScroll(String index, String field, String text, String routing, int size) {
        List<HashMap> results = elasticSearchDao.queryScroll(index, field, text, routing, size);
        return CompletableFuture.completedFuture(results);
    }

    @Async
    @Override
    public CompletableFuture<List<HashMap>> queryAllByScroll(QueryBuilder queryBuilder, String indexName, String routing, int size) {
        List<HashMap> results = elasticSearchDao.queryScroll(queryBuilder, indexName, routing, size);
        return CompletableFuture.completedFuture(results);
    }


    @Override
    public List<HashMap> queryMatchYears(String indexName, Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        if (null != map.get("years") && !"".equals(map.get("years")) && null != map.get("field") && !"".equals(map.get("field"))) {
            Integer years = Integer.parseInt(map.get("years").toString());
            String timeField = map.get("field").toString();
            map.remove("years");
            map.remove("field");
            //当前时间
            String currentTime = DateUtils.currentTime("yyyyMMddHHmmss");

            Date date = new Date();
            Date rollYear = DateUtils.rollYear(date, years);
            //减去 years后的时间
            String year = DateUtils.dateStr(rollYear, "yyyyMMddHHmmss");

            //查询条件设定
            stringBuilder.append("{");
            stringBuilder.append("\"size\": 10000,");
            stringBuilder.append("\"query\": {\"bool\": {");
            stringBuilder.append("\"must\": [{");
            stringBuilder.append("\"range\": {\"");
            stringBuilder.append(timeField);
            stringBuilder.append("\": {");
            stringBuilder.append("\"from\":\"");
            stringBuilder.append(year);
            stringBuilder.append("\",\"to\": \"");
            stringBuilder.append(currentTime);
            stringBuilder.append("\"}}},");
            for (String key : map.keySet()) {
                stringBuilder.append("{\"match_phrase\": {\"");
                stringBuilder.append(key);
                stringBuilder.append("\": \"");
                stringBuilder.append(map.get(key));
                stringBuilder.append("\"}},");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append("]}}}");
        }
        String query = stringBuilder.toString();
        logger.info("时间范围" + query);
        return elasticSearchDao.getListResultsByJson(query, indexName);
    }

    @Async
    @Override
    public void tbRiskIapi(TbRiskIapi data) throws IOException {
        String id = data.getSerial();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String str = format.format(new Date());
        String index = String.format("tb-riskiapi-%s", str);
        elasticSearchDao.bulkOperationWithCustomGson(data, index, TYPE, id);
    }

    @Async
    @Override
    public void tbRiskIapi(HashMap data) throws IOException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String id = String.valueOf(data.get("serial"));
        String str = format.format(new Date());
        String index = String.format("tb-riskiapi-%s", str);
        elasticSearchDao.bulkOperationWithCustomGson(data, index, TYPE, id);
    }

    @Async
    @Override
    public void indexItemResult(ResponseMessage responseMessage, String id) throws IOException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String str = format.format(new Date());
        String index = String.format("tb-riskiapi-result-%s", str);
        HashMap<String, Object> h1 = new HashMap<>(20);
        h1.put("nationality", responseMessage.getNationality());
        h1.put("passportno", responseMessage.getPassportno());
        h1.put("birthday", responseMessage.getBirthday());
        h1.put("name", responseMessage.getName());
        h1.put("person_id", responseMessage.getPerson_id());
        h1.put("serial", id);
        h1.put("risk_status", responseMessage.getRisk_status());
        h1.put("event", responseMessage.getEvent());
        List<Map<String, Object>> targetResult = responseMessage.getTarget_result();
        List<Map<String, Object>> modelItem = responseMessage.getModel_item();
        HashMap<Object, Object> targetResultm = new HashMap<>(targetResult.size());
        HashMap<Object, Object> modelItemm = new HashMap<>(modelItem.size());
        for (Map<String, Object> m : targetResult) {
            targetResultm.put(m.get("target_id"),m.get("target_value"));
        }
        for (Map<String, Object> m : modelItem) {
            modelItemm.put(m.get("model_code"),m.get("match"));
        }
        h1.put("targetResult",targetResultm);
        h1.put("modelItem",modelItemm);


        elasticSearchDao.bulkOperationWithCustomGson(h1, index, TYPE, id);





    }

}
