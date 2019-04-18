package com.iapi.drools.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestPerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nationality;

    private String passportno;

    private String birthday;

    private String name;

    private String type;




}
