package com.iapi.drools.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.iapi.drools.bean.RequestMessage;
import com.iapi.drools.bean.ResponseMessage;
import com.iapi.drools.bean.TbRiskIapi;
import org.elasticsearch.index.query.QueryBuilder;

/**
 * @Author cheng
 * @Description
 * @Date 10:54 2019/2/16
 */
public interface IElasticSearchService {
    /**
     * 查询人员id
     *
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description //TODO
     * @Date 14:54 2019/2/26
     * @Param [message]
     */
    List<HashMap> queryPersonId(RequestMessage message);
    List<HashMap> queryPersonId(String nationality,String passportno,String birthday,String name,String genders);

    /**
     * 异步查询
     *
     * @param indexName s
     * @param name      s
     * @param text      s
     * @return s
     */
    CompletableFuture<List<HashMap>> queryMatchByAsync(String indexName, String name, String text);

    /**
     * 异步查询
     *
     * @param indexName s
     * @param name      s
     * @param text      s
     * @param routing   s
     * @return s
     */
    CompletableFuture<List<HashMap>> queryMatchByAsync(String indexName, String name, String text, String routing);


    /**
     * 异步查询
     *
     * @return List<HashMap>
     * @Author cheng
     * @Description 异步查询 使用queryBuilder配置
     * @Date 10:34 2018/12/20
     * @Param [queryBuilder, index] [QueryBuilder,索引名称]
     */
    CompletableFuture<List<HashMap>> queryByAsyncAndQueryBuilder(QueryBuilder queryBuilder, String index);

    /**
     * 异步查询
     *
     * @param queryBuilder s
     * @param index        s
     * @param size         s
     * @return s
     */
    CompletableFuture<List<HashMap>> queryByAsyncAndQueryBuilder(QueryBuilder queryBuilder, String index, int size);


    /**
     * 滚动异步查询
     *
     * @param queryBuilder s
     * @param indexName    s
     * @return s
     */
    CompletableFuture<List<HashMap>> queryAllByScroll(QueryBuilder queryBuilder, String indexName);


    /**
     * 滚动异步查询
     *
     * @param queryBuilder s
     * @param indexName    s
     * @param routing      s
     * @return s
     */
    CompletableFuture<List<HashMap>> queryAllByScroll(QueryBuilder queryBuilder, String indexName, String routing);

    /**
     * 滚动异步查询
     *
     * @return java.util.concurrent.CompletableFuture<java.util.List   <   java.util.HashMap>>
     * @Author cheng
     * @Date 15:07 2019/2/26
     * @Param [index, field, text, routing, size]
     */
    CompletableFuture<List<HashMap>> queryAllByScroll(String index, String field, String text, String routing, int size);

    /**
     * 滚动异步查询
     *
     * @param queryBuilder s
     * @param indexName    s
     * @param routing      s
     * @param size         s
     * @return s
     */
    CompletableFuture<List<HashMap>> queryAllByScroll(QueryBuilder queryBuilder, String indexName, String routing, int size);

    /**
     * s
     *
     * @param map       s
     * @param indexName s
     * @return s
     */
    List<HashMap> queryMatchYears(String indexName, Map<String, Object> map);


    /**
     * 增加数据
     *
     * @param data  json
     */
    void tbRiskIapi(TbRiskIapi data) throws IOException;
    void tbRiskIapi(HashMap data) throws IOException;

    /**
     * 增加数据
     *
     * @param data  json
     */
    void indexItemResult(ResponseMessage data,String id) throws IOException;



}
