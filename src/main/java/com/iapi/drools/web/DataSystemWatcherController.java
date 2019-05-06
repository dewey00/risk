package com.iapi.drools.web;

import com.google.gson.Gson;
import com.iapi.drools.bean.log.LogSearchRequest;
import com.iapi.drools.bean.log.LogSearchResponse;
import com.iapi.drools.common.exception.JsonResponse;
import com.iapi.drools.service.ElasticSearchMonitor;
import com.iapi.drools.service.MongoDbService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.iapi.drools.web
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-29 15:56
 */

@RequestMapping(value = "/watchers")
@RestController
public class DataSystemWatcherController {



    @Autowired
    private MongoDbService mongoDbService;

    @ApiOperation(value = "获取日志")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "data", dataType = "String", required = true, value = "{\n" +
                    "\"startTime\":\"20180809121212\",\n" +
                    "\"endTime\":\"20180810121212\",\n" +
                    "\"showCount\":10,\n" +
                    "\"currentPage\":1\n" +
                    "}\n"),
            @ApiImplicitParam(name = "level", dataType = "String", required = true, value = "INFO/ERROR/WRAN "),
    })
    @RequestMapping(value = "/logInfo", method = RequestMethod.POST)
    public JsonResponse getLogInfo(@RequestParam String data, @RequestParam String level) {
        Gson gson = new Gson();
        LogSearchRequest logSearchRequest = gson.fromJson(data, LogSearchRequest.class);
        LogSearchResponse logSearchResponse = mongoDbService.findByTimestampBetweenAndLevelString(logSearchRequest.getStartTime(), logSearchRequest.getEndTime(), level, logSearchRequest.getShowCount(), logSearchRequest.getCurrentPage());
        return new JsonResponse(logSearchResponse);
    }



}