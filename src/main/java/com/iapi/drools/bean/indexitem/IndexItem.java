package com.iapi.drools.bean.indexitem;

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
 * @ClassName IndexItem
 * @Description 指标项类
 * @Author ChengGuojun
 * @Date 2019-01-18 16:13
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "indexItem")
public class IndexItem  implements Serializable {
    @Id
    private String id;

    @Field("timestamp")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private String updateTime;
    private String version;
    /**
     * 内容
     */
    private String content;
    /**
     * 指标项
     */
    @Indexed(unique = true)
    @Field(value = "item")
    private String item;



}
