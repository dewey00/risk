package com.iapi.drools.dao;

import com.iapi.drools.bean.rule.Model;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongodbRes extends MongoRepository<Model,String> {

    @Override
    void deleteAll();
}
