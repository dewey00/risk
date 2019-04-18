package com.iapi.drools.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Risk
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2019-03-27 16:25
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Risk implements Serializable {
    private String serial;
    private String accountName;

    private String nationality;

    private String passportno;

    private String birthday;

    private String name;

    private String port;

    private List<Map<String,Object>> choice_model;

    private Map<String, Object> personPojo;

    private String personId;

    private HashMap<String,Object> riskIapi;


}
