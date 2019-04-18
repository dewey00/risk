package com.iapi.drools.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonObject;

import io.searchbox.client.JestResult;
import io.searchbox.core.SearchResult;
import io.searchbox.core.SearchResult.Hit;
import org.elasticsearch.index.query.QueryBuilder;

/**
 * @Author cheng
 * @Description //TODO
 * @Date 17:23 2019/2/25
 * @Param
 * @return
 */
public interface IElasticSearchDao {

    /**
     * 返回索引名称
     *
     * @return java.lang.String
     * @Author cheng
     * @Description //TODO
     * @Date 10:13 2019/2/26
     * @Param []
     */
    String getElasticSearchIndices();
    /**
    * 添加索引
     *
     * @Author cheng
    * @Date 14:59 2019/3/7
    * @Param index
    *
    */

    /**
     * 返回索引名称
     *
     * @return java.lang.String
     * @Author cheng
     * @Description //TODO
     * @Date 10:13 2019/2/26
     * @Param [indexPattern]
     */
    String getElasticSearchIndices(String indexPattern);
    /**
     * repair by 程国军 2018/12/11
     *
     * @param queryBuilder QueryBuilder 查询对象
     * @param index        查询索引
     * @return 返回查询对象
     */
    HashMap getFirstResultMap(QueryBuilder queryBuilder, String index);

    /**
     * repair by 程国军 2018/12/11
     *
     * @param json  QueryBuilder 查询对象
     * @param index 查询索引
     * @return 返回集合
     */
    List<HashMap> getListResultsByJson(String json, String index);

    /**
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description //TODO
     * @Date 16:02 2019/2/16
     * @Param [json, index, s]
     */
    List<HashMap> getListResultsByJson(String json, String index, String routing);

    /**
     * repair by 程国军 2018/12/11
     *
     * @param json  QueryBuilder 查询对象
     * @param index 查询索引
     * @return 返回查询对象
     */
    Map getFirstResultMapByJson(String json, String index);

    /**
     * repair by 程国军 2018/12/11
     *
     * @param queryBuilder QueryBuilder 查询对象
     * @param index        查询索引
     * @return 返回集合
     */
    List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index);

    /**
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description
     * @Date 17:50 2019/2/25
     * @Param [queryBuilder, index, routing]
     */
    List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index, String routing);

    /**
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description
     * @Date 17:50 2019/2/25
     * @Param [queryBuilder, index, size, routing]
     */
    List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index, int size, String routing);

    /**
     * repair by 程国军 2018/12/11
     *
     * @param queryBuilder QueryBuilder 查询对象
     * @param index        查询索引
     * @return 返回集合
     */
    List<HashMap> getListResultsByQueryBuilder(QueryBuilder queryBuilder, String index, int size);


    /**
     * 深度分页查询
     *
     * @param dsl       查询语句
     * @param indexName 索引名
     * @param size      一次滚动条数
     * @return List<HashMap>
     * @throws Exception e
     */
    List<HashMap> queryScroll(String dsl, String indexName, int size);
    List<HashMap> queryScroll(String index, String field, String text, String routing, int size);

    /**
     * 深度分页查询
     *
     * @param dsl       查询语句
     * @param indexName 索引名
     * @return List<HashMap>
     * @throws Exception e
     */
    List<HashMap> queryScroll(String dsl, String indexName);

    /**
     * 查询
     *
     * @return java.util.List<java.util.HashMap>
     * @Description
     * @Date 17:31 2019/2/25
     * @Param dsl
     * @Param indexName  c
     * @Param size
     * @Param routing
     */
    List<HashMap> queryScroll(String dsl, String indexName, String routing,int size);

    /**
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description
     * @Date 17:51 2019/2/25
     * @Param [dsl, indexName, routing]
     */
    List<HashMap> queryScroll(String dsl, String indexName, String routing);

    /**
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description
     * @Date 17:51 2019/2/25
     * @Param [queryBuilder, indexName]
     */
    List<HashMap> queryScroll(QueryBuilder queryBuilder, String indexName) ;

    /**
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description
     * @Date 17:51 2019/2/25
     * @Param [queryBuilder, indexName, routing]
     */
    List<HashMap> queryScroll(QueryBuilder queryBuilder, String indexName, String routing);
    /**
     * @return java.util.List<java.util.HashMap>
     * @Author cheng
     * @Description
     * @Date 17:51 2019/2/25
     * @Param [queryBuilder, indexName, routing]
     */
    List<HashMap> queryScroll(QueryBuilder queryBuilder, String indexName, String routing,int size);
    /**
    * @Author cheng
    * @Description 脚本查询使用
    * @Date 11:45 2019/2/26
    * @Param [index, field, text]
    * @return java.util.List<java.util.HashMap>
    *
    */
    List<HashMap> queryByMatchPhrase(String index,String field,String text);
    List<HashMap> queryByMatchPhrase(String index,String field,String text,String routing);
    List<HashMap> queryByTerms(String index,String field,String ...strings);
    List<HashMap> queryByTerms(String index,String routing,String field,String ...strings);


    /**
     * 添加
     *
     * @param source data
     * @param index  tableName
     * @param type   doc
     * @param id     pk
     * @return ""
     */
    Map<String, Object> bulkOperationWithCustomGson(Object source, String index, String type, String id) throws IOException;


    /**
     * 添加
     *
     * @param source data
     * @param index  tableName
     * @param type   doc
     * @return ""
     */
    Map<String, Object> bulkOperationWithCustomGson(Object source, String index, String type) throws IOException;


}
