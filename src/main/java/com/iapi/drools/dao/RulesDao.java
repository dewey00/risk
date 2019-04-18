package com.iapi.drools.dao;


import com.iapi.drools.bean.rule.Model;

import java.util.List;
import java.util.Map;

public interface RulesDao {

    /**
     * 通过名字获取规则
     * @param ruleName
     * @return
     */
    String getRulesByName(String ruleName);

    /**
     * 获取全部规则
     * @return
     */
    List<String> getRuleList();
    List<Model> getAllRules();
    /**
     * 通过名字修改规则
     * @param ruleName
     * @return
     */
    boolean updateRulesByName(Model ruleName);

    /**
     * 删除规则
     * @param ruleName
     * @return
     */
    boolean deleteRulesByName(String ruleName);

    /**
     * 验证规则
     * @param ruleName
     * @return
     */
    String ruleVerify(String ruleName);


    boolean addRules(List<Model> list);

}
