package com.iapi.drools.service.impl;


import com.iapi.drools.bean.rule.Model;
import com.iapi.drools.config.WrapperZk;
import com.iapi.drools.dao.MongodbRes;
import com.iapi.drools.dao.RulesDao;
import com.iapi.drools.dao.ZookeeperDao;
import com.iapi.drools.service.DistributedLockByZookeeper;
import com.iapi.drools.service.RulesService;
import com.iapi.drools.utils.KieUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * @author Cheng Guojun
 */
@Service
public class RulesServiceImpl implements RulesService {
    @Autowired
    RulesDao rulesDao;

    @Autowired
    ZookeeperDao zookeeperDao;

    @Autowired
    private DistributedLockByZookeeper distributedLockByZookeeper;

    @Autowired
    WrapperZk wrapperZk;

    @Autowired
    MongodbRes mongodbRes;

    private static Logger logger = LogManager.getLogger(RulesServiceImpl.class);


    /**
     * 导入规则
     *
     * @param rules String
     * @return String
     */
    public String reload(String rules) {
        try {
            KieServices kieServices = KieServices.Factory.get();
            KieFileSystem kfs = kieServices.newKieFileSystem();
            kfs.write("src/main/resources/rules/temp.drl", rules);
            KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
            Results results = kieBuilder.getResults();
            if (results.hasMessages(Message.Level.ERROR)) {
                logger.error(results.getMessages());
                throw new IllegalStateException("### errors ###");
            }
            KieUtils.setKieContainer(kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId()));
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }
    @Override
    public String reloadByHelper(String rules) {
        try {
            KieHelper kieHelper = new KieHelper();
            kieHelper.addContent(rules, ResourceType.DRL);
            Results results = kieHelper.verify();
            if (results.hasMessages(Message.Level.ERROR)) {
                logger.error(results.getMessages());
                throw new IllegalStateException("### errors ###");
            }
            KieContainer kieContainer = kieHelper.getKieContainer();
            KieUtils.setKieContainer(kieContainer);
            return "success";
        } catch (Exception e) {
            logger.error(e);
            return "error";
        }
    }

    @Override
    public void reloadAllRules() {
        List<Model> models = rulesDao.getAllRules();
        refreshContainer(models);
    }

    private Resource[] getRuleFiles(String path) throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        return resourcePatternResolver.getResources("classpath*:" + path + "**/*.*");
    }
    private void refreshContainer(List<Model> models) {
        logger.info("-----refreshContainer 重新加载规则文件----");
        logger.info("refreshing container {}");
        KieHelper kieHelper = new KieHelper();
        String utilsPath = "com/iapi/drools/utils/";
        try {
            for (Resource file : getRuleFiles(utilsPath)) {
                kieHelper.addResource(ResourceFactory.newClassPathResource(utilsPath + file.getFilename(), "UTF-8"), ResourceType.DRL);
            }
        } catch (IOException e) {
            logger.error(e);
        }
        for (Model m : models) {
            kieHelper.addContent(m.getContent(), ResourceType.DRL);
        }
        Results results = kieHelper.verify();
        if (results.hasMessages(Message.Level.ERROR)) {
            logger.error(results.getMessages());
            throw new IllegalStateException("### errors ###");
        }
        KieContainer kieContainer = kieHelper.getKieContainer();
        KieBase kieBase = kieHelper.build();
        kieBase.newKieSession();
        KieUtils.setKieContainer(kieContainer);
    }

    /**
     * 根据包名和规则名称 删除规则
     *
     * @param ruleName String
     * @return String
     */
    @Override
    public String deleteRulesByName(String ruleName) {
        String path = wrapperZk.getLockPath();
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath();
        }
        // 分布式锁
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            // 删除 mongodb 数据库 数据
            boolean flag = rulesDao.deleteRulesByName(ruleName);
            // 改变zookeeper 节点状态
            if (flag) {
                // zookeeper 改状态
                zookeeperDao.setToZookeeper(ruleName);
                return "success";
            } else {
                System.out.println("deleteRulesByName  mongodb 删除失败 ");
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
    public String ruleVerify(String rule) {
        return rulesDao.ruleVerify(rule);
    }


    @Override
    public String addRules(List<Model> list, String zkStat) {
        String path = wrapperZk.getLockPath();
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath();
        }
        // 分布式锁
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            // 添加到 mongodb 数据库
            boolean flag = rulesDao.addRules(list);
            // 改变zookeeper 节点状态
            if (flag) {
                zookeeperDao.setToZookeeper(zkStat);
                return "success";
            } else {
                System.out.println(" mongodb 添加失败 ");
                return "error";
            }
        } catch (Exception e) {
            logger.error(e);
            for(Model li:list){
                String name = li.getName();
                rulesDao.deleteRulesByName(name);
            }


        } finally {
            // 释放分布式锁
            distributedLockByZookeeper.releaseDistributedLock(path);
        }
        return "error";
    }

    @Override
    public List<String> getVersion() {
        return null;
    }

    @Override
    public void reloadRulesByVersion(String version) {
    }

    @Override
    public String deleteAll() {

        String path = wrapperZk.getLockPath();
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath();
        }
        // 分布式锁
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            // 添加到 mongodb 数据库
            mongodbRes.deleteAll();
            zookeeperDao.setToZookeeper("ALL_DELETE");
            return "success";
        } catch (Exception e) {
            logger.error(e);
        } finally {
            // 释放分布式锁
            distributedLockByZookeeper.releaseDistributedLock(path);
        }
        return "error";


    }

    @Override
    public String ruleUpdate(Model rule) {
        String path = wrapperZk.getLockPath();
        if (wrapperZk.getZkTestEnabled()) {
            path = wrapperZk.getLockTestPath();
        }
        // 分布式锁
        distributedLockByZookeeper.acquireDistributedLock(path);
        try {
            // 添加到 mongodb 数据库
            boolean flag = rulesDao.updateRulesByName(rule);
            if (flag) {
                // zookeeper 改状态
                zookeeperDao.setToZookeeper("ruleUpdate"+System.currentTimeMillis());
                return "success";
            } else {
                System.out.println("ruleUpdate  mongodb 更新失败 ");
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
    public List<Model> getAllRules() {
        return rulesDao.getAllRules();
    }


}
