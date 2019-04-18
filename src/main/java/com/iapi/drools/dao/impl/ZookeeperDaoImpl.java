package com.iapi.drools.dao.impl;

import com.iapi.drools.config.WrapperZk;
import com.iapi.drools.dao.ZookeeperDao;
import com.iapi.drools.service.impl.ZookeeperPath;
import org.apache.curator.framework.CuratorFramework;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.*;

/**
 * @Package com.iapi.drools.dao.impl
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-11-14 17:36
 */
@Repository
public class ZookeeperDaoImpl implements ZookeeperDao {
    private static Logger logger = LogManager.getLogger(ZookeeperDaoImpl.class);

    private static final String add_and_update_path = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.ADD_AND_UPDATE_PATH;
    private static final String delete_path = "/"+ZookeeperPath.LISTENER_ROOT_PATH+"/"+ZookeeperPath.DELETE_PATH;


    @Autowired
    CuratorFramework client;
    @Autowired
    WrapperZk wrapperZk;

    @Override
    public void writeToZookeeper(String path, String content) {
        changeNode(getPath()+path,content);
    }

    @Override
    public List<String> readAll(String path) {
        return null;
    }

    @Override
    public void delete(String content) {
        changeNode(getPath()+delete_path,content);
    }

    private void changeNode(String path,String content){
        try {
            Stat result = client.checkExists().forPath(path);
            if(result ==null){
                initNodeData(path);
            }else{
                client.setData().forPath(path, content.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getChildren(String path) {
        return null;
    }
    private String getPath(){
        String path = wrapperZk.getZkPrefixNodePath();
        if(wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getZkPrefixNodeTestPath();
        }
        return  "/"+path;

    }
    @Override
    public void setToZookeeper(String content) {
        changeNode(getPath()+add_and_update_path,content);
    }

    private void initNodeData(String path){
        Executor executor = Executors.newCachedThreadPool();
        try {
            logger.info("创建节点 = "+ path);
            // 如果没有节点先创建节点
            client.create()
                    .creatingParentsIfNeeded()
                    .withMode(CreateMode.PERSISTENT)
                    .inBackground((curatorFramework, curatorEvent) -> {
                        System.out.println(String.format("RuleZookeeperListener initNodeData eventType:%s,resultCode:%s",curatorEvent.getType(),curatorEvent.getResultCode()));
                    },executor)
                    .forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
