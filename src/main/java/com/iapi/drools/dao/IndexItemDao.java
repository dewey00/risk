package com.iapi.drools.dao;

import com.iapi.drools.bean.indexitem.IndexItem;

import java.util.List;

/**
 * @ClassName IndexItemDao
 * @Description 增删改查
 * @Author ChengGuojun
 * @Date 2019-01-18 17:43
 * @Version 1.0
 */
public interface IndexItemDao {

    /**
    * @Author cheng
    * @Description 添加到指标项脚本表
    * @Date 10:28 2019/1/21
    * @Param [items]
    * @return java.lang.String
    *
    */
    String addItems(List<IndexItem> items);

    String updateItems(IndexItem items);

    String deleteItem(String script);

    IndexItem findIndexItem(String script);

    String clearScript();

    List<IndexItem> findAll();



}
