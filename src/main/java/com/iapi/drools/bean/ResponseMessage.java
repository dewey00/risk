package com.iapi.drools.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Package com.iapi.drools.bean
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-22 16:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage {
    private String nationality;
    private String passportno;
    private String birthday;
    private String name;
    private String port;
    private String person_id;
    private String serial;
    private String risk_status;

    private List<Map<String,Object>> event= new ArrayList<>();
    private List<Map<String,Object>> target_result= new ArrayList<>();
    private List<Map<String,Object>> model_item= new ArrayList<>();




}
