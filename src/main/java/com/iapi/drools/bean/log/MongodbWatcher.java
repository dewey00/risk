package com.iapi.drools.bean.log;

import com.mongodb.MongoClient;
import org.bson.Document;
import org.springframework.data.mongodb.monitor.AbstractMonitor;

import java.io.Serializable;

/**
 * @Package com.iapi.drools.bean.log
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-31 10:38
 */
public class MongodbWatcher extends AbstractMonitor implements Serializable {

    private final long serialVersionUID = 2L;

    public MongodbWatcher(MongoClient mongoClient) {
        super(mongoClient);
    }





}
