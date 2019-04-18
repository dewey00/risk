package com.iapi.drools.dao.impl;

import java.io.IOException;
import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.searchbox.core.*;
import io.searchbox.params.Parameters;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iapi.drools.dao.IElasticSearchDao;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.SearchResult.Hit;

/**
 * @author repair by chengguojun 2018/12/11
 */
@Service
public class ElasticSearchDaoImpl implements IElasticSearchDao {

    @Autowired
    private JestClient client;
    private Logger logger = LogManager.getLogger(ElasticSearchDaoImpl.class);



    @Override
    public String getElasticSearchIndices() {
        Cat indicesBuilder = new Cat.IndicesBuilder().build();
        return getIndexInfo(indicesBuilder);
    }
    @Override
    public String getElasticSearchIndices(String index) {
        Cat indicesBuilder = new Cat.IndicesBuilder().addIndex(index).build();
        return getIndexInfo(indicesBuilder);
    }

    private String getIndexInfo(Cat indicesBuilder) {
        String result="";
        try {
            CatResult nodesInfoResult = client.execute(indicesBuilder);
            JsonObject jsonObject = nodesInfoResult.getJsonObject();
            JsonArray jsonArray = jsonObject.getAsJsonArray("result");
            List<Object>  list = new ArrayList<>();
            for (JsonElement object:jsonArray){
                JsonObject obj = object.getAsJsonObject();
                list.add(obj.get("index"));
            }
            result = StringUtils.join(list,",");
        } catch (Exception e) {
            logger.error(e);
        }
        return result.replace("\"","");
    }

    @Override
    public HashMap getFirstResultMap(QueryBuilder queryBuilder, String index) {
        SearchResult searchResult = searchFunction(queryBuilder, index);
        return getHashMap(searchResult);
    }

    private HashMap getHashMap(SearchResult searchResult) {
        if (searchResult != null) {
            Hit<HashMap, Void> hit = searchResult.getFirstHit(HashMap.class);
            if (hit != null) {
                return hit.source;
            }
        }
        return null;
    }


    @Override
    public Map getFirstResultMapByJson(String queryJson, String index) {
        SearchResult searchResult = searchFunctionByJson(queryJson, index);
        return getHashMap(searchResult);
    }

    @Override
    public List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index) {
        SearchResult searchResult = searchFunction(queryBuilder, index);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    /**
     * @param queryBuilder d
     * @param index d
     * @param routing d
     * @return d
     */
    @Override
    public List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index, String routing) {
        SearchResult searchResult = searchFunction(queryBuilder, index, routing);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    /**
     * @param queryBuilder d
     * @param index d
     * @param size d
     * @param routing e
     * @return  d
     */
    @Override
    public List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index, int size, String routing) {
        SearchResult searchResult = searchFunction(queryBuilder, index, size, routing);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    @Override
    public List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index, int size) {
        SearchResult searchResult = searchFunction(queryBuilder, index, size);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    /**
     *
     * @Author cheng
     * @Description 处理查询结果
     * @Date 9:58 2018/12/13
     * @Param [searchResult, list]
     */
    private void executeSearchResult(SearchResult searchResult, List<HashMap> list) {
        if (searchResult.isSucceeded()) {
            List<Hit<HashMap, Void>> searchResultHits = searchResult.getHits(HashMap.class);
            for (Hit<HashMap, Void> searchResultHit : searchResultHits) {
                if (searchResultHit != null) {
                    list.add(searchResultHit.source);
                }
            }
        }
    }

    @Override
    public List<HashMap> getListResultsByJson(String queryJson, String index) {
        SearchResult searchResult = searchFunctionByJson(queryJson, index);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    @Override
    public List<HashMap> getListResultsByJson(String queryJson, String index, String routing) {
        SearchResult searchResult = searchFunctionByJson(queryJson, index, routing);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    /**
     * 查询遍历抽取
     *
     * @param json QueryBuilder
     */
    private SearchResult searchFunctionByJson(String json, String index) {
        logger.info("dsl \n " + json + "\n");
        Search search = new Search
                .Builder(json)
                .addIndex(index)
                .build();
        return getSearchResult(index, search);
    }

    private SearchResult searchFunctionByJson(String json, String index, String routing) {
        logger.info("dsl \n " + json + "\n");
        Search search = new Search
                .Builder(json).setParameter(Parameters.ROUTING, routing)
                .addIndex(index)
                .build();
        return getSearchResult(index, search);
    }

    private SearchResult getSearchResult(String index, Search search) {
        try {
            long start = System.currentTimeMillis();
            SearchResult searchResult = client.execute(search);

            long end = System.currentTimeMillis();
            logger.info("total :" + searchResult.getTotal() + "条; " + " 查询 " + index + " 耗时 " + (end - start) + " 毫秒");
            return searchResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询遍历抽取
     *
     * @param queryBuilder QueryBuilder
     */
    private SearchResult searchFunction(QueryBuilder queryBuilder, String index) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(queryBuilder);
        // 查询语句
        String dsl = searchSourceBuilder.toString();
        logger.info("dsl \n " + dsl + "\n");
        Search search = new Search.Builder(dsl).addIndex(index).build();
        return getSearchResult(index, search);
    }

    /**
     * 查询遍历抽取
     *
     * @param queryBuilder QueryBuilder
     */
    private SearchResult searchFunction(QueryBuilder queryBuilder, String index, int size) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(queryBuilder).size(size);
        // 查询语句
        String dsl = searchSourceBuilder.toString();
        logger.info("dsl \n " + dsl + "\n");
        Search search = new Search.Builder(dsl).addIndex(index).build();
        return getSearchResult(index, search);
    }

    /**
     * 查询遍历抽取
     *
     * @param queryBuilder QueryBuilder
     */
    private SearchResult searchFunction(QueryBuilder queryBuilder, String index, String routing) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(queryBuilder);
        // 查询语句
        String dsl = searchSourceBuilder.toString();
        logger.info("dsl \n " + dsl + "\n");
        Search search = new Search.Builder(dsl)
                .addIndex(index)
                .setParameter(Parameters.ROUTING, routing)
                .build();
        return getSearchResult(index, search);
    }

    /**
     * 查询遍历抽取
     *
     * @param queryBuilder QueryBuilder
     */
    private SearchResult searchFunction(QueryBuilder queryBuilder, String index, int size, String routing) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(queryBuilder).size(size);
        // 查询语句
        String dsl = searchSourceBuilder.toString();
        logger.info("dsl \n " + dsl + "\n");
        Search search = new Search.Builder(dsl)
                .addIndex(index)
                .setParameter(Parameters.ROUTING, routing)
                .build();
        return getSearchResult(index, search);
    }

    @Override
    public List<HashMap> queryScroll(String dsl, String indexName) {
        logger.info("dsl \n " + dsl + "\n");
        List<HashMap> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        Search search = new Search.Builder(dsl)
                .addIndex(indexName)
                .setParameter(Parameters.SIZE, 10000)
                .setParameter(Parameters.SCROLL, "1m")
                .build();
        execScrollResult(indexName, list, start, search,10000);
        return list;
    }

    /**
     * 深度分页查询
     *
     * @param dsl d
     * @param indexName d
     * @param size d
     * @return d
     */
    @Override
    public List<HashMap> queryScroll(String dsl, String indexName, int size)   {
        logger.info("dsl \n " + dsl + "\n");
        List<HashMap> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        Search search = new Search.Builder(dsl)
                .addIndex(indexName)
                .setParameter(Parameters.SIZE, 10000)
                .setParameter(Parameters.SCROLL, "1m")
                .build();
        execScrollResult(indexName, list, start, search, 10000);
        return list;
    }

    @Override
    public List<HashMap> queryScroll(String index, String field, String text, String routing, int size) {
        QueryBuilder queryBuilder = QueryBuilders.matchPhraseQuery(field,text);
        return queryScroll(queryBuilder,index,routing,size);
    }

    private void execScrollResult(String indexName, List<HashMap> list, long start, Search search,int size) {
        try {
            JestResult result = client.execute(search);
            if (result.isSucceeded()) {
                List<HashMap> initList = result.getSourceAsObjectList(HashMap.class);
                list.addAll(initList);
                long total = ((SearchResult) result).getTotal();
                long end = System.currentTimeMillis();
                logger.info("total :" + total + "条; " + " 查询 " + indexName + " 耗时 " + (end - start) + " 毫秒");
                String scrollId = result.getJsonObject().get("_scroll_id").getAsString();
                if (total > size) {
                    long startOne = System.currentTimeMillis();
                    //初始化返回一个 _scroll_id，_scroll_id 用来下次取数据用
                    while (true) {
                        SearchScroll scroll = new SearchScroll.Builder(scrollId, "1m").build();
                        result = client.execute(scroll);
                        List<HashMap> iPv4List = result.getSourceAsObjectList(HashMap.class);
                        if (!iPv4List.isEmpty()) {
                            list.addAll(iPv4List);
                        } else {
                            break;
                        }
                        scrollId = result.getJsonObject().getAsJsonPrimitive("_scroll_id").getAsString();
                    }
                    long endOne = System.currentTimeMillis();
                    logger.info("total :" + total + " ; " + "   " + (endOne - startOne) + " ms");
                }
                // 清除scroll
                ClearScroll clearScroll = new ClearScroll.Builder().addScrollId(scrollId).build();
                client.execute(clearScroll);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param dsl c
     * @param indexName c
     * @param size d
     * @param routing d
     * @return d
     */
    @Override
    public List<HashMap> queryScroll(String dsl, String indexName, String routing,int size)  {
        logger.info("dsl \n " + dsl + "\n");
        List<HashMap> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        size=10000;
        Search search = new Search.Builder(dsl)
                .addIndex(indexName)
                .setParameter(Parameters.SIZE, size)
                .setParameter(Parameters.ROUTING, routing)
                .setParameter(Parameters.SCROLL, "1m")
                .build();
        execScrollResult(indexName, list, start, search, size);
        return list;
    }

    /**
     * @param dsl d
     * @param indexName d
     * @param routing d
     * @return d

     */
    @Override
    public List<HashMap> queryScroll(String dsl, String indexName, String routing)  {
        logger.info("dsl \n " + dsl + "\n");
        List<HashMap> list = new ArrayList<>();
        long start = System.currentTimeMillis();

        Search search = new Search.Builder(dsl)
                .addIndex(indexName)
                .setParameter(Parameters.SCROLL, "1m")
                .setParameter(Parameters.ROUTING, routing)
                .setParameter(Parameters.SIZE, 10000)
                .build();
        execScrollResult(indexName, list, start, search, 10000);
        return list;
    }

    @Override
    public List<HashMap> queryScroll(QueryBuilder queryBuilder, String indexName, String routing)   {
        return queryScroll(queryBuilder,indexName,routing,10000);
    }
    @Override
    public List<HashMap> queryScroll(QueryBuilder queryBuilder, String indexName) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder().query(queryBuilder);
        String dsl = searchSourceBuilder.toString();
        logger.info("dsl \n " + dsl + "\n");
        return queryScroll(dsl, indexName);
    }
    @Override
    public List<HashMap> queryScroll(QueryBuilder queryBuilder, String indexName, String routing, int size) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(queryBuilder);
        String dsl = searchSourceBuilder.toString();
        logger.info("dsl \n " + dsl + "\n");
        size=10000;
        List<HashMap> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        Search search = new Search.Builder(dsl)
                .addIndex(indexName).setParameter(Parameters.ROUTING, routing)
                .setParameter(Parameters.SIZE, size)
                .setParameter(Parameters.SCROLL, "1m")
                .build();
        execScrollResult(indexName, list, start, search,size);
        return list;
    }

    @Override
    public List<HashMap> queryByMatchPhrase(String index, String field, String text) {
        QueryBuilder queryBuilder = QueryBuilders.matchPhraseQuery(field,text);
        SearchResult searchResult = searchFunction(queryBuilder, index);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    @Override
    public List<HashMap> queryByMatchPhrase(String index, String field, String text, String routing) {
        QueryBuilder queryBuilder = QueryBuilders.matchPhraseQuery(field,text);
        SearchResult searchResult = searchFunction(queryBuilder, index,routing);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    @Override
    public List<HashMap> queryByTerms(String index,String field,String ...strings) {
        QueryBuilder queryBuilder = QueryBuilders.termsQuery(field,strings);
        SearchResult searchResult = searchFunction(queryBuilder, index);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    @Override
    public List<HashMap> queryByTerms(String index,String routing,String field,String ...strings) {
        QueryBuilder queryBuilder = QueryBuilders.termsQuery(field,strings);
        SearchResult searchResult = searchFunction(queryBuilder, index,routing);
        List<HashMap> list = new ArrayList<>();
        executeSearchResult(searchResult, list);
        return list;
    }

    @Override
    public Map<String, Object> bulkOperationWithCustomGson(Object source, String index, String type, String id) throws IOException {
        Map<String, Object> map = new HashMap<>(0);
        Bulk bulk = new Bulk.Builder().addAction(new Index.Builder(source).index(index).type(type).id(id).build()).build();
        return getStringObjectMap(map, bulk);
    }

    @Override
    public Map<String, Object> bulkOperationWithCustomGson(Object source, String index, String type) throws IOException {
        Map<String, Object> map = new HashMap<>(0);
        Bulk bulk = new Bulk.Builder()
                .addAction(new Index.Builder(source).index(index).type(type).build())
                .build();
        return getStringObjectMap(map, bulk);
    }
    private Map<String, Object> getStringObjectMap(Map<String, Object> map, Bulk bulk) throws IOException {
        BulkResult result = client.execute(bulk);
        if (result.isSucceeded()) {
            List<BulkResult.BulkResultItem> items = result.getItems();
            if (!items.isEmpty()) {
                BulkResult.BulkResultItem firstItem = items.get(0);
                map.put("operation", firstItem.operation);
                map.put("index", firstItem.index);
                map.put("type", firstItem.type);
                map.put("id", firstItem.id);
                map.put("status", firstItem.status);
                map.put("error", firstItem.error);
                map.put("errorType", firstItem.errorType);
                map.put("errorReason", firstItem.errorReason);
                map.put("version", firstItem.version);
                logger.info(String.format("success add  index = %s ,id = %s,status = %s ",firstItem.index,firstItem.id,firstItem.status));
            }
        } else {
            logger.error(result.getJsonString());
            map.put("ErrorMessage", result.getErrorMessage());
        }
        return map;
    }

}
