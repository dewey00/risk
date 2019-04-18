package com.iapi.drools;

import com.google.gson.Gson;
import com.iapi.drools.bean.log.LogRequest;
import com.iapi.drools.bean.log.LogSearchRequest;
import com.iapi.drools.bean.log.LogSearchResponse;
import com.iapi.drools.bean.log.MongodbWatcher;
import com.iapi.drools.config.WrapperZk;
import com.iapi.drools.dao.IElasticSearchDao;
import com.iapi.drools.dao.MongoDbRepository;
import com.iapi.drools.service.DistributedLockByZookeeper;
import com.iapi.drools.service.IElasticSearchService;
import com.iapi.drools.service.MongoDbService;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.searchbox.client.JestResult;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.framework.recipes.cache.*;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.bson.Document;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.domain.*;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.monitor.AbstractMonitor;
import org.springframework.data.mongodb.monitor.AssertMetrics;
import org.springframework.data.mongodb.monitor.OperationCounters;
import org.springframework.data.mongodb.monitor.ServerInfo;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsSpringbootApplicationTests {

     @Autowired
    IElasticSearchDao elasticSearchDao;
    @Test
    public void contextLoads() {

//       String indices =  elasticSearchDao.getElasticSearchIndices("wenshu*");
//        System.out.println("indices = "+indices.replace("\"",""));
        QueryBuilder queryBuilder = QueryBuilders.matchAllQuery();
        List<HashMap> s = elasticSearchDao.queryScroll(queryBuilder,"my-index-*");
        System.out.println(s.size());
        System.out.println(s);

    }

}
