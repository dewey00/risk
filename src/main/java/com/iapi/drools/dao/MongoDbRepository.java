package com.iapi.drools.dao;

import com.iapi.drools.bean.log.LogRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;


public interface MongoDbRepository extends MongoRepository<LogRequest, String> {
    Page<LogRequest> findByTimestampBetweenAndLevelString(Date timestamp, Date timestamp2, String levelString, Pageable pageable);

}
