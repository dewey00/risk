package com.iapi.drools.bean.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Package com.iapi.drools.bean.log
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-29 16:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "logRequest")
public class LogRequest implements Serializable {
    @Id
    private String id;
    @Indexed
    @Field("timestamp")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
    private Date timestamp;
    @Field("level")
    private String levelString;
    @Field("thread")
    private String threadName;
    @Field("message")
    private String formattedMessage;
    @Field("loggerName.fullyQualifiedClassName")
    private String loggerName;
    @Field("fileName")
    private String fileName;
    @Field("method")
    private String method;
    @Field("lineNumber")
    private String lineNumber;
    @Field("host")
    private Host host;

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Host implements Serializable {
    private String process;
    private String name;
    private String ip;
}



