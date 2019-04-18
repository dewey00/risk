package com.iapi.drools.service.impl;

import com.iapi.drools.bean.indexitem.IndexItem;
import com.iapi.drools.bean.indexitem.RequestIndexItem;
import com.iapi.drools.config.WrapperZk;
import com.iapi.drools.dao.ZookeeperDao;
import com.iapi.drools.service.DistributedLockByZookeeper;
import com.iapi.drools.service.IndexItemService;
import com.iapi.drools.service.ItemSynchroService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ItemSynchroServiceImpl
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2019-03-11 10:40
 * @Version 1.0
 */
@Service
public class ItemSynchroServiceImpl implements ItemSynchroService {
    private static final String ADD = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ITEMS+"/add";
    private static final String DEL = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ITEMS+"/del";
    private static final String CLEAR = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ITEMS+"/clear";

    private static Logger logger = LogManager.getLogger(ItemSynchroServiceImpl.class);

    @Autowired
    private DistributedLockByZookeeper distributedLockByZookeeper;

    @Autowired
    private WrapperZk wrapperZk;

    @Autowired
    ZookeeperDao zookeeperDao;

    @Autowired
    private IndexItemService indexItemService;

    @Override
    public String add(RequestIndexItem indexItems) {
        String success ="success";
        String path = wrapperZk.getLockPath()+"add";
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath()+"add";
        }
        // 分布式锁
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            String flag = indexItemService.addIndexItem(indexItems);
            if (success.equals(flag)) {
                String zkStat = System.currentTimeMillis()+"";
                zookeeperDao.writeToZookeeper(ADD,zkStat);
                return "success";
            } else {
                System.out.println(" mongodb 添加失败 ");
                return "error";
            }
        } catch (Exception e) {
            logger.error(e);
            List<IndexItem> items = indexItems.getIndexItems();
            for(IndexItem li:items){
                String name = li.getItem();
                indexItemService.deleteIndexItem(name);
            }
        } finally {
            // 释放分布式锁
            distributedLockByZookeeper.releaseDistributedLock(path);
        }
        return "error";

    }

    @Override
    public String update(IndexItem indexItems) {
        String success ="success";
        String path = wrapperZk.getLockPath()+"update";
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath()+"update";
        }
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            String flag = indexItemService.updateIndexItem(indexItems);
            if (success.equals(flag)) {
                String zkStat = System.currentTimeMillis()+"";
                zookeeperDao.writeToZookeeper(ADD,zkStat);
                return "success";
            } else {
                System.out.println(" mongodb 更新失败 ");
                return "error";
            }
        } catch (Exception e) {
                String name = indexItems.getItem();
                indexItemService.deleteIndexItem(name);
        } finally {
            // 释放分布式锁
            distributedLockByZookeeper.releaseDistributedLock(path);
        }
        return "error";
    }

    @Override
    public String delete(String script) {
        String success ="success";
        String path = wrapperZk.getLockPath()+"del";
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath()+"del";
        }
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            String flag = indexItemService.deleteIndexItem(script);
            if (success.equals(flag)) {
                String zkStat = System.currentTimeMillis()+"";
                zookeeperDao.writeToZookeeper(DEL,zkStat);
                return "success";
            } else {
                System.out.println(" mongodb 更新删除");
                return "error";
            }
        } catch (Exception e) {
            logger.error(e);
        } finally {
            // 释放分布式锁
            distributedLockByZookeeper.releaseDistributedLock(path);
        }
        return "error";
    }

    @Override
    public String clear() {
        String success ="success";
        String path = wrapperZk.getLockPath()+"clear";
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath()+"clear";
        }
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            String flag = indexItemService.clearScript();
            if (success.equals(flag)) {
                String zkStat = System.currentTimeMillis()+"";
                zookeeperDao.writeToZookeeper(CLEAR,zkStat);
                return "success";
            } else {
                System.out.println(" mongodb clear");
                return "error";
            }
        } catch (Exception e) {
            logger.error(e);
        } finally {
            // 释放分布式锁
            distributedLockByZookeeper.releaseDistributedLock(path);
        }
        return "error";
    }
}
