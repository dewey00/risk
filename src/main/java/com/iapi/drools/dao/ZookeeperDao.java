package com.iapi.drools.dao;

import java.util.List;

/**
 * @Package com.iapi.drools.dao
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-10-19 13:40
 */
public interface ZookeeperDao {
    /**
     * 将内容写入zookeeper
     *
     * @param path ""
     * @param content ""
     */
    void writeToZookeeper(String path, String content);

    /**
     * 读取path下所有子路径下的内容
     * 先从map中读取，如果不存在，再从zookeeper中查询
     *
     * @param path ""
     * @return ""
     */
    List<String> readAll(String path);

    /**
     * 删除节点下数据
     *
     * @param path ""
     */
    void delete(String path);

    /**
     * 获取路径下的所有子路径
     *
     * @param path ""
     * @return ""
     */
    List<String> getChildren(String path);

    /**
     * 修改路径下内容
     * @param content ""
     * @return ""
     */
    void setToZookeeper(String content);



}
