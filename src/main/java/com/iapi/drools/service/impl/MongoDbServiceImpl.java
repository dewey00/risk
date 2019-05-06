package com.iapi.drools.service.impl;

import com.iapi.drools.bean.log.LogContent;
import com.iapi.drools.bean.log.LogRequest;
import com.iapi.drools.bean.log.LogSearchResponse;
import com.iapi.drools.bean.log.MongodbWatcher;
import com.iapi.drools.dao.MongoDbRepository;
import com.iapi.drools.service.MongoDbService;
import com.mongodb.MongoClient;
import org.apache.commons.lang.time.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Package com.iapi.drools.service.impl
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-29 16:32
 */
@Service
public class MongoDbServiceImpl implements MongoDbService {

    @Autowired
    MongoDbRepository mongoDbRepository;

    @Autowired
    MongoClient mongoClient;


    private Logger logger = LogManager.getLogger(MongoDbServiceImpl.class);

    @Override
    public LogSearchResponse findByTimestampBetweenAndLevelString(String startTime, String endTime, String levelString, int showCount, int currentPage) {
        LogSearchResponse logSearchResponse = new LogSearchResponse();

        try{
            Date timestamp = DateUtils.parseDate(startTime, new String[]{"yyyyMMddHHmmss","yyyy-MM-dd HH:mm:ss"});
            Date timestamp2 = DateUtils.parseDate(endTime, new String[]{"yyyyMMddHHmmss","yyyy-MM-dd HH:mm:ss"});
            Page<LogRequest> logRequests = mongoDbRepository.findByTimestampBetweenAndLevelString(timestamp,timestamp2 ,levelString, PageRequest.of(currentPage, showCount, Sort.by(Sort.Direction.DESC,"timestamp")));

            List<LogContent>  logContents = new ArrayList<>();
            List<LogRequest> logRequests1 = logRequests.getContent();
            for (LogRequest logRequest:logRequests1){
                LogContent logContent = new LogContent();
                logContent.setFormattedMessage(logRequest.getFormattedMessage());
                logContent.setLevelString(logRequest.getLevelString());
                logContent.setTimestamp(logRequest.getTimestamp());
                logContent.setLoggerName(logRequest.getLoggerName());
                logContent.setThreadName(logRequest.getThreadName());
                logContents.add(logContent);
            }
            logSearchResponse.setResultList(logContents);
            logSearchResponse.setTotalPage(logRequests.getTotalPages());
            logSearchResponse.setTotalResult(logRequests.getTotalElements());
        }catch (ParseException e){
            logger.error(e);
        }
        return logSearchResponse;
    }




}
