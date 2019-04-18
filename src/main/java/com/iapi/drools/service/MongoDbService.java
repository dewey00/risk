package com.iapi.drools.service;

import com.iapi.drools.bean.log.LogSearchResponse;

import org.bson.Document;

/**
 * @Package com.iapi.drools.service
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript log mongodb
 * @Date 2018-10-29 16:08
 */
public interface MongoDbService {
    LogSearchResponse findByTimestampBetweenAndLevelString(String timestamp, String timestamp2, String levelString, int showCount, int currentPage);
    /**
    * @Author cheng
    * @Description mongodb 状态
    * @Date 14:55 2019/2/25
    * @Param []
    * @return org.bson.Document
    *
    */
    Document getMongoDbStatus();
}
