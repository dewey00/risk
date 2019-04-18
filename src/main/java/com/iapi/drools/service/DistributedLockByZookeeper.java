package com.iapi.drools.service;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;


/**
 * @Package com.iapi.drools.service
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript 分布式锁
 * @Date 2018-10-18 15:08
 */
@Service
public class DistributedLockByZookeeper implements InitializingBean {
    private final static String ROOT_PATH_LOCK = "rootLock";
    private CountDownLatch countDownLatch = new CountDownLatch(1);
    @Autowired
    private CuratorFramework curatorFramework;
    private Logger logger = LogManager.getLogger(DistributedLockByZookeeper.class);

    /**
     * 获取分布式锁
     *
     * @param path string
     */
    public void acquireDistributedLock(String path) {
        String keyPath = "/" + ROOT_PATH_LOCK + "/" + path;
        while (true) {
            try {
                if (curatorFramework.checkExists().forPath(keyPath) == null) {
                    curatorFramework.create()
                            .creatingParentsIfNeeded()
                            .withMode(CreateMode.EPHEMERAL)
                            .withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE)
                            .forPath(keyPath);
                    logger.info("success to acquire lock for path: "+ keyPath);
                    return;
                }else{
                    logger.info("success to acquire lock for path: "+ keyPath);
                    return;
                }
            } catch (Exception e) {
                logger.info("failed to acquire lock for path:  "+path);
                logger.error(e);
                try {
                    if (countDownLatch.getCount() <= 0) {
                        countDownLatch = new CountDownLatch(1);
                    }
                    countDownLatch.await();
                } catch (InterruptedException e1) {
                    logger.error(e1);

                }
            }


        }
    }

    /**
     * 释放锁
     *
     * @param path String
     * @return boolean
     */
    public void releaseDistributedLock(String path) {
        String keyPath = "/" + ROOT_PATH_LOCK + "/" + path;
        System.out.println(keyPath);
        try {
            if (curatorFramework.checkExists().forPath(keyPath) != null) {
                curatorFramework.delete().forPath(keyPath);
            }
        } catch (Exception e) {
            logger.error("failed to release lock "+e);

        }

    }

    private void addWatcher(String paths) throws Exception {
        String keyPath;
        if (paths.equals(ROOT_PATH_LOCK)) {
            keyPath = "/" + paths;
        } else {
            keyPath = "/" + ROOT_PATH_LOCK + "/" + paths;
        }
        final PathChildrenCache cache = new PathChildrenCache(curatorFramework, keyPath, false);
        cache.start(PathChildrenCache.StartMode.POST_INITIALIZED_EVENT);
        cache.getListenable().addListener((client, event) -> {
            if (event.getType().equals(PathChildrenCacheEvent.Type.CHILD_REMOVED)) {
                String oldPath = event.getData().getPath();
                logger.info("addWatcher " + oldPath + " 。。。");
                if (oldPath.contains(paths)) {
                    //释放计数器，让当前的请求获取锁
                    countDownLatch.countDown();
                }
            }
        });

    }

    /**
     * 创建父节点，并创建永久节点
     */
    @Override
    public void afterPropertiesSet() {
        curatorFramework = curatorFramework.usingNamespace("lock-namespace");
        String path = "/" + ROOT_PATH_LOCK;
        try {
            if (curatorFramework.checkExists().forPath(path) == null) {
                curatorFramework.create()
                        .creatingParentsIfNeeded()
                        .withMode(CreateMode.PERSISTENT)
                        .withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE)
                        .forPath(path);
            }
            addWatcher(ROOT_PATH_LOCK);
            logger.info("root path 的 watcher 事件创建成功");
        } catch (Exception e) {
            logger.error("connect zookeeper fail，please check the log >>  "+ e);
        }
    }







}
