package com.iapi.drools.bean.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

/**
 * @Package com.iapi.drools.bean.log
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-30 17:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogContent{
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date date) {
        this.timestamp = DateFormatUtils.format(date,"yyyy-MM-dd HH:mm:ss");
    }

    private String timestamp;
    private String levelString;
    private String loggerName;
    private String threadName;
    private String formattedMessage;
}
