package com.iapi.drools.bean.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package com.iapi.drools.bean.log
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-29 16:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogSearchRequest {
    private String startTime;
    private String endTime;
    private Integer showCount;
    private Integer currentPage;
}
