package com.iapi.drools.service;

import com.iapi.drools.bean.rule.Model;


import java.util.List;


public interface RulesService {

      /**
     *
     * @param rules ''
     * @return ''
     */
    String reloadByHelper(String rules);

    void reloadAllRules();

    /**
     * 根据包名和规则名称 删除规则
     *
     * @param ruleName    String
     * @return String
     */
    String deleteRulesByName(String ruleName);

    /**
     * 验证规则
     * @param ruleName ''
     * @return ''
     */
    String ruleVerify(String ruleName);

    String addRules(List<Model> list,String zkStat);

    /**
     * 获取所有版本号
     * @return list
     */
    List<String> getVersion();

    /**
     * 根据版本切换规则
     * @param version str
     */
    void reloadRulesByVersion(String version);

    String deleteAll();

    String ruleUpdate(Model rule);

    List<Model> getAllRules();
}
