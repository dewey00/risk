package com.iapi.drools.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @Package com.iapi.drools.config
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-18 13:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "curator")
public class WrapperZk {
    private int retryCount;
    private int elapsedTimeMs;
    private String connectString;
    private int sessionTimeoutMs;
    private int connectionTimeoutMs;
    private Boolean zkEnabled;
    private Boolean zkTestEnabled;
    private String lockPath;
    private String lockTestPath;
    private String version;
    private String zkPrefixNodePath;
    private String zkPrefixNodeTestPath;
    private int zkNodeTestValue;
    private String prefixDir;



}
