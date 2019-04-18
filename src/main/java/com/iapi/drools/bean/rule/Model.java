package com.iapi.drools.bean.rule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * @Package com.iapi.drools.bean.rule
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-11-14 17:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "model")
public class Model  implements Serializable {
    @Id
    private String id;

    @Field("timestamp")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
    private String updateTime;
    @Indexed(unique = true)
    @Field("name")
    private String name;
    @Indexed(unique = true)
    @Field("ruleId")
    private String ruleId;
    @Field("version")
    private String version;
    @Field("content")
    private String content;
    @Field("type")
    private String type;
    @Field("createTime")
    private String createTime;


}
