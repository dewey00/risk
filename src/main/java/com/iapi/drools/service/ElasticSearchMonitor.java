package com.iapi.drools.service;

import java.io.IOException;
import java.util.Map;

/**
 * @author cheng
 */
public interface ElasticSearchMonitor{

    /**
     * 获取es状态
     *
     * @return java.util.Map
     * @Author cheng
     * @Date 15:39 2018/12/14
     * @Param []
     * @throws IOException
     */
    Map<String,Object> getElasticSearchStatus() throws IOException;





}
