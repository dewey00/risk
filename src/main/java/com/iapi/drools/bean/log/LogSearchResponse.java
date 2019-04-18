package com.iapi.drools.bean.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Package com.iapi.drools.bean.log
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-30 14:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer totalPage;
    private Long totalResult;
    private List<LogContent> resultList;

}






