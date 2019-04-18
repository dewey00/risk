package com.iapi.drools.bean.rule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Package com.iapi.drools.bean.rule
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-11-16 10:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestModel {
    private List<Model> models;


}
