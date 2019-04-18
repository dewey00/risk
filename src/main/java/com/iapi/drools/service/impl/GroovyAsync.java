package com.iapi.drools.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.script.Invocable;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

/**
 * @ClassName GroovyAsync
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2019-02-23 18:10
 * @Version 1.0
 */
@Service
public class GroovyAsync {
    private Logger logger = LogManager.getLogger(GroovyAsync.class);
    @Async
    public CompletableFuture<HashMap<String, Object>> asyncGroovyScript(Invocable inv, String defMethod, Object... params) {
        HashMap<String, Object> result = new HashMap<>(1);
        Object obj=null;
        try {
            obj = inv.invokeFunction(defMethod, params);
        } catch (Exception e) {
            logger.error("item :" +defMethod +" errorInfo:"+e.getMessage());
        }
        result.put(defMethod, obj);
        return CompletableFuture.completedFuture(result);

    }


}
