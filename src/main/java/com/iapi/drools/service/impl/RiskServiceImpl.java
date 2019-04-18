package com.iapi.drools.service.impl;

import com.iapi.drools.bean.RequestMessage;
import com.iapi.drools.bean.ResponseMessage;
import com.iapi.drools.bean.Risk;
import com.iapi.drools.service.RiskService;
import com.iapi.drools.utils.KieUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.drools.core.base.RuleNameEndsWithAgendaFilter;
import org.drools.core.base.RuleNameEqualsAgendaFilter;
import org.drools.core.base.RuleNameMatchesAgendaFilter;
import org.drools.core.base.RuleNameStartsWithAgendaFilter;
import org.drools.core.event.DefaultAgendaEventListener;
import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Match;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Package com.iapi.drools.service.impl
 * @Project iapi-drools
 * @Author Cheng Guojun
 * @Descript
 * @Date 2018-11-14 16:37
 */
@Service
public class RiskServiceImpl implements RiskService {
    private static Logger logger = LogManager.getLogger(RiskServiceImpl.class);
    /**
     * 全部匹配
     *
     * @param requestMessage  RequestMessage
     * @param responseMessage ResponseMessage
     */
    @Override
    public void riskEvaluation(RequestMessage requestMessage, ResponseMessage responseMessage) {
        long start = System.currentTimeMillis();
        // 获取指标值
        Map<String, Object> person = requestMessage.getPersonPojo();
        //  开始匹配需要的规则
        List<Map<String, Object>> event = new ArrayList<>();
        List<Map<String, Object>> modelItems = new ArrayList<>();
        List<Map<String, Object>> models = requestMessage.getChoice_model();
        //集合非空
        if (models != null) {
            // 遍历集合
            for (Map<String, Object> model : models) {
                // 需要的规则
                String modelList = String.valueOf(model.get("model_list"));
                // 规则类型
                String type = String.valueOf(model.get("type"));
                // 添加监听
                List<String> rules = new ArrayList<>();
                Map<String, Object> ruleMap = new HashMap<>(20);

                String[] modelArr = modelList.split(",");
                for (String modelName : modelArr) {
                    // 匹配规则
                    int num = fireResult(rules,person,modelName);
                    logger.info("模型："+ modelName +" 匹配了" + num + "条规则");
                    long matchTime = System.currentTimeMillis() - start;

                    Map<String, Object> modelItem = new HashMap<>(20);
                    modelItem.put("model_code", modelName);
                    modelItem.put("match_time", matchTime);
                    if (num > 0) {
                        modelItem.put("match", "1");
                    } else {
                        modelItem.put("match", "0");
                    }
                    modelItems.add(modelItem);
                }
                if(rules.size()>0){
                    ruleMap.put("rule_list", rules);
                    ruleMap.put("type", type);
                }
                if (!ruleMap.isEmpty()){
                    event.add(ruleMap);
                }
                // 全部时间
                long time = System.currentTimeMillis() - start;
                logger.info("所用时间： " + time);

            }
        }
        List<Map<String, Object>> targetResult = getTargetResults(person);
        responseMessage.setTarget_result(targetResult);
        responseMessage.setEvent(event);
        responseMessage.setModel_item(modelItems);
    }

    @Override
    public void riskEvaluation(Risk requestMessage, ResponseMessage responseMessage) {
        long start = System.currentTimeMillis();
        // 获取指标值
        Map<String, Object> person = requestMessage.getPersonPojo();
        //  开始匹配需要的规则
        List<Map<String, Object>> modelItems = new ArrayList<>();
        List<Map<String, Object>> models = requestMessage.getChoice_model();
        List<Map<String, Object>> event = new ArrayList<>();
        //集合非空
        // 遍历集合
        if (models != null) {
            for (Map<String, Object> model : models) {
                // 需要的规则
                String type = String.valueOf(model.get("type"));
                String modelList = String.valueOf(model.get("model_list"));
                // 规则类型
                // 添加监听
                String[] modelArr = modelList.split(",");
                Map<String, Object> ruleMap = new HashMap<>(20);
                List<String> rules = new ArrayList<>();

                for (String modelName : modelArr) {
                    // 匹配规则
                    int num = fireResult(rules,person,modelName);
                    logger.info("模型："+ modelName +" 匹配了" + num + "条规则");

                    Map<String, Object> modelItem = new HashMap<>(20);
                    long matchTime = System.currentTimeMillis() - start;
                    modelItem.put("match_time", matchTime);
                    modelItem.put("model_code", modelName);
                    if (num > 0) {
                        modelItem.put("match", "1");
                    } else {
                        modelItem.put("match", "0");
                    }
                    modelItems.add(modelItem);
                }
                if(rules.size()>0){
                    ruleMap.put("type", type);
                    ruleMap.put("rule_list", rules);
                }
                if (!ruleMap.isEmpty()){
                    event.add(ruleMap);
                }
                // 全部时间
                long time = System.currentTimeMillis() - start;
                logger.info("所用时间： " + time);

            }
        }
        List<Map<String, Object>> targetResult = getTargetResults(person);
        responseMessage.setTarget_result(targetResult);
        responseMessage.setEvent(event);
        responseMessage.setModel_item(modelItems);
    }

    private int fireResult(List<String> rules, Map<String, Object> person, String modelName) {
        // 获取session
        KieSession kieSession = KieUtils.getKieContainer().newKieSession();
        // 添加监听
        kieSession.addEventListener(new DefaultAgendaEventListener() {
            @Override
            public void afterMatchFired(AfterMatchFiredEvent event) {
                super.afterMatchFired(event);
                String rNameTail = "ENTER";
                String rNameTail2 = "FILTER";
                String rNameTail3 = "API";
                Match match = event.getMatch();
                Rule rule = match.getRule();
                String rName = rule.getName();
                logger.info("匹配规则的包名: " + rule.getPackageName()+ " ,匹配的规则: "+ rName);
                if(!(rName.endsWith(rNameTail) || rName.endsWith(rNameTail2)|| rName.endsWith(rNameTail3))){
                    rules.add(rName);
                }

            }

        });
        // 将指标fact添加到规则引擎
        kieSession.insert(person);
        int num;
        num = kieSession.fireAllRules(new RuleNameStartsWithAgendaFilter(modelName));
        kieSession.dispose();
        return num;
    }


    /**
     * 组成需要的格式
     *
     * @param person Map<String, Object>
     * @return List<Map<String, Object>>
     */
    private List<Map<String, Object>> getTargetResults(Map<String, Object> person) {
        List<Map<String, Object>> list = new ArrayList<>();
        for (String key : person.keySet()) {
            Map<String, Object> map = new HashMap<>(20);
            map.put("target_id", key);
            map.put("target_value", person.get(key));
            list.add(map);
        }
        return list;
    }


    /**
     * 规则名称前缀
     *
     * @param personMap      RequestMessage
     * @param resultMessage  ResponseMessage
     * @param ruleNameStarts String
     */
    @Override
    public void riskEvaluationRuleNameStartsWithAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameStarts) {
        List resultList = new ArrayList();
        List timeList = new ArrayList();
        long start = System.currentTimeMillis();
        KieSession kieSession = KieUtils.getKieContainer().newKieSession();
        kieSession.addEventListener(new DefaultAgendaEventListener());
        kieSession.insert(personMap);
        kieSession.setGlobal("time", start);
        kieSession.setGlobal("resultList", resultList);
        kieSession.setGlobal("timeList", timeList);
        kieSession.fireAllRules(new RuleNameStartsWithAgendaFilter(ruleNameStarts));
        // 全部时间
        long time = System.currentTimeMillis() - start;
        kieSession.dispose();

    }

    /**
     * 规则名称全名
     *
     * @param personMap      RequestMessage
     * @param resultMessage  ResponseMessage
     * @param ruleNameEquals String
     */
    @Override
    public void riskEvaluationRuleNameEqualsAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameEquals) {
        List resultList = new ArrayList();
        List timeList = new ArrayList();
        long start = System.currentTimeMillis();
        KieSession kieSession = KieUtils.getKieContainer().newKieSession();
        kieSession.insert(personMap);
        kieSession.setGlobal("time", start);
        kieSession.setGlobal("resultList", resultList);
        kieSession.setGlobal("timeList", timeList);
        kieSession.fireAllRules(new RuleNameEqualsAgendaFilter(ruleNameEquals));
        // 全部时间
        long time = System.currentTimeMillis() - start;

//        personMap.put("modelTotalTime", time);
        kieSession.dispose();

    }

    /**
     * 规则名称后缀
     *
     * @param personMap     RequestMessage
     * @param resultMessage ResponseMessage
     * @param ruleNameEnds  String
     */
    @Override
    public void riskEvaluationRuleNameEndsWithAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameEnds) {
        List resultList = new ArrayList();
        List timeList = new ArrayList();

        long start = System.currentTimeMillis();
        KieSession kieSession = KieUtils.getKieContainer().newKieSession();
        kieSession.insert(personMap);
        kieSession.setGlobal("time", start);
        kieSession.setGlobal("resultList", resultList);
        kieSession.setGlobal("timeList", timeList);
        kieSession.fireAllRules(new RuleNameEndsWithAgendaFilter(ruleNameEnds));
        // 全部时间
        long time = System.currentTimeMillis() - start;
//        personMap.put("modelTotalTime", time);
        kieSession.dispose();

    }

    /**
     * 规则名称正则
     *
     * @param personMap       RequestMessage
     * @param resultMessage   ResponseMessage
     * @param ruleNameMatches String
     */
    @Override
    public void riskEvaluationRuleNameMatchesAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameMatches) {
        List resultList = new ArrayList();
        List timeList = new ArrayList();

        long start = System.currentTimeMillis();
        KieSession kieSession = KieUtils.getKieContainer().newKieSession();
        kieSession.insert(personMap);
        kieSession.setGlobal("time", start);
        kieSession.setGlobal("resultList", resultList);
        kieSession.setGlobal("timeList", timeList);
        kieSession.fireAllRules(new RuleNameMatchesAgendaFilter(ruleNameMatches));
        // 全部时间
        long time = System.currentTimeMillis() - start;
//        personMap.put("modelTotalTime", time);

        kieSession.dispose();

    }

}
