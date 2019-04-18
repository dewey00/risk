package com.iapi.drools.service;

import com.iapi.drools.config.WrapperZk;
import com.iapi.drools.service.impl.ZookeeperPath;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Package com.iapi.drools.service
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-11-15 11:37
 */
@Service
public class RuleZookeeperListener implements InitializingBean {
    private static Logger logger = LogManager.getLogger(RuleZookeeperListener.class);

    private static final String ADD_AND_UPDATE_PATH = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ADD_AND_UPDATE_PATH;
    private static final String ADD = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ITEMS+"/add";
    private static final String DEL = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ITEMS+"/del";
    private static final String CLEAR = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ITEMS+"/clear";

    @Autowired
    private CuratorFramework client;

    @Autowired
    private RulesService rulesService;
    @Autowired
    private IndexItemService indexItemService;

    @Autowired
    WrapperZk wrapperZk;

    @Override
    public void afterPropertiesSet() {

        String path = wrapperZk.getZkPrefixNodePath();
        if(wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getZkPrefixNodeTestPath();
        }
        initNodeListener("/"+path+ADD_AND_UPDATE_PATH);
        initAddListener("/"+path+ADD);
        initDelItemListener("/"+path+DEL);
        initClearItemListener("/"+path+CLEAR);
    }
    /**
    *
     *
     * @Author cheng
    * @Description
    * @Date 11:39 2019/3/11
    * @Param [path]
    */
    private void initNodeListener(String path) {
        logger.info("start initRuleListener ..."+path);
        final NodeCache nodeCache = new NodeCache(client, path);
        NodeCacheListener nodeCacheListener = () -> {
            ChildData data = nodeCache.getCurrentData();
            if (null != data) {
                logger.info("initRuleListener 节点数据：" + new String(nodeCache.getCurrentData().getData()));
                rulesService.reloadAllRules();
            } else {
               logger.info("节点被删除");
            }
        };
        try {
            nodeCache.getListenable().addListener(nodeCacheListener);
            nodeCache.start(true);
        } catch (Exception e) {
            logger.error(e);
        }
    }

    /**
     * @Author cheng
     * @Description //监听添加
     * @Date 11:37 2019/3/11
     * @Param [path]
     *
     */
    private void initAddListener(String path) {
        logger.info("start initAddListener ..."+path);
        final NodeCache nodeCache = new NodeCache(client, path);
        NodeCacheListener nodeCacheListener = () -> {
            ChildData data = nodeCache.getCurrentData();
            if (null != data) {
                logger.info("initNodeListener 节点数据：" + new String(nodeCache.getCurrentData().getData()));
                indexItemService.reloadScript();
            } else {
                logger.info("节点被删除");
            }
        };
        try {
            nodeCache.getListenable().addListener(nodeCacheListener);
            nodeCache.start(true);
        } catch (Exception e) {
            logger.error(e);
        }
    }
    /**
     * @Author cheng
     * @Description //监听删除
     * @Date 11:37 2019/3/11
     * @Param [path]
     *
     */
    private void initDelItemListener(String path) {
        logger.info("start initDelItemListener ..."+path);
        final NodeCache nodeCache = new NodeCache(client, path);
        NodeCacheListener nodeCacheListener = () -> {
            ChildData data = nodeCache.getCurrentData();
            if (null != data) {
                logger.info("initDelItemListener 节点数据：" + new String(nodeCache.getCurrentData().getData()));
                indexItemService.reCreateEngine();
                indexItemService.reloadScript();
            } else {
                logger.info("节点被删除");
            }
        };
        try {
            nodeCache.getListenable().addListener(nodeCacheListener);
            nodeCache.start(true);
        } catch (Exception e) {
            logger.error(e);
        }
    }
    /**
    * @Author cheng
    * @Description //监听清空
    * @Date 11:37 2019/3/11
    * @Param [path]
    *
    */
    private void initClearItemListener(String path) {
        logger.info("start initClearItemListener ..."+path);
        final NodeCache nodeCache = new NodeCache(client, path);
        NodeCacheListener nodeCacheListener = () -> {
            ChildData data = nodeCache.getCurrentData();
            if (null != data) {
                logger.info("initNodeListener clear item：" + new String(nodeCache.getCurrentData().getData()));
                indexItemService.reCreateEngine();
            } else {
                logger.info("节点被删除");
            }
        };
        try {
            nodeCache.getListenable().addListener(nodeCacheListener);
            nodeCache.start(true);
        } catch (Exception e) {
            logger.error(e);
        }
    }



}
