package com.iapi.drools.dao.impl;

import com.iapi.drools.bean.indexitem.IndexItem;
import com.iapi.drools.dao.IndexItemDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName IndexItemDaoImpl
 * @Description 增删改查
 * @Author ChengGuojun
 * @Date 2019-01-18 17:43
 * @Version 1.0
 */
@Repository
public class IndexItemDaoImpl implements IndexItemDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    private Logger logger = LogManager.getLogger(IndexItemDaoImpl.class);

    @Override
    public String addItems(List<IndexItem> items) {
        String flag = "IndexItemDaoImpl  addItems error";
        try{
            mongoTemplate.insert(items,IndexItem.class);
            flag = "success";
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e);
        }
        return flag;
    }

    @Override
    public String updateItems(IndexItem items) {
        String flag = "IndexItemDaoImpl  updateItems error";
        try{
            Criteria criteria = Criteria.where("item").is(items.getItem());
            Query query = Query.query(criteria);
            mongoTemplate.remove(query, IndexItem.class);
            mongoTemplate.save(items);
            flag = "success";
            logger.info("IndexItemDaoImpl "+items);
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public String deleteItem(String script) {
        String flag = "delete item  error ";
        try {
            Criteria criteria = Criteria.where("item").is(script);
            Query query = Query.query(criteria);
            mongoTemplate.remove(query, IndexItem.class);
            flag = "success";
        } catch (Exception e) {
           e.printStackTrace();
           logger.error("delete  "+script);
        }
        return flag;

    }

    @Override
    public IndexItem findIndexItem(String script) {
        Criteria criteria = Criteria.where("item").is(script);
        Query query = Query.query(criteria);
        return mongoTemplate.findOne(query,IndexItem.class);
    }

    @Override
    public String clearScript() {
        String flag = "clear  items  error ";
        try {
            mongoTemplate.remove(new Query(), "indexItem");
            flag="success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<IndexItem> findAll() {
        return mongoTemplate.findAll(IndexItem.class);
    }





}
