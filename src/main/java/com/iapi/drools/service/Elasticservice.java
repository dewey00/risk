package com.iapi.drools.service;


import com.iapi.drools.bean.RequestMessage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 */
public interface Elasticservice {

    /**
     * 查询电子档案
     * @param message 请求解析对象
     * @param type 请求类型
     * @param personInfo 请求证件信息
     * @return 电子档案信息
     * @throws IOException 异常
     */
    Map queryElectronic(RequestMessage message, String type, List<Map<String, Object>> personInfo) throws IOException;


}
