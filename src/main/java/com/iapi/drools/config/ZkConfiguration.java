package com.iapi.drools.config;


import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package com.iapi.drools.config
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript 注册监听器，自动监听规则变化，实现动态加载
 * @Date 2018-10-18 11:03
 */
@Configuration
public class ZkConfiguration {
    private static Logger logger = LogManager.getLogger(ZkConfiguration.class);

    @Autowired
    WrapperZk wrapperZk;

    @Bean(initMethod = "start")
    public CuratorFramework curatorFramework() {
        logger.info("zookeeper uris :" + wrapperZk.getConnectString());
        logger.info("zookeeper SessionTimeout :" + wrapperZk.getSessionTimeoutMs());
        logger.info("zookeeper ConnectionTimeoutMs :" + wrapperZk.getConnectionTimeoutMs());
        logger.info("zookeeper RetryCount :" + wrapperZk.getRetryCount());
        logger.info("zookeeper ElapsedTimeMs :" + wrapperZk.getElapsedTimeMs());
        return CuratorFrameworkFactory.newClient(
                wrapperZk.getConnectString(),
                wrapperZk.getSessionTimeoutMs(),
                wrapperZk.getConnectionTimeoutMs(),
                new RetryNTimes(wrapperZk.getRetryCount(),
                        wrapperZk.getElapsedTimeMs()));

    }












}
