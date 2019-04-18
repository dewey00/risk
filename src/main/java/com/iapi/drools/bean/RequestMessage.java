package com.iapi.drools.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.List;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestMessage implements Serializable{
    
    private static final long serialVersionUID = 1L;

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

    private TbRiskIapi risk_iapi;

}
















































































































