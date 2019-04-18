package com.iapi.drools.config;



import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.IOException;

/**
 * @Package com.iapi.drools.config
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript  单例指标引擎
 * @Date 2018-10-18 11:03
 */
@Configuration
public class ScriptEngineConfiguration {


    @Bean
    @ConditionalOnMissingBean(ScriptEngine.class)
    public ScriptEngine engine() throws IOException {
        ScriptEngineManager factory = new ScriptEngineManager();
        return factory.getEngineByName("Groovy");
    }




}
