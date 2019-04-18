package com.iapi.drools.service;

import com.iapi.drools.bean.RequestMessage;
import com.iapi.drools.bean.ResponseMessage;
import com.iapi.drools.bean.Risk;

public interface RiskService {
    /**
     * 全部匹配
     *
     * @param requestMessage  RequestMessage
     * @param responseMessage ResponseMessage
     */
    void riskEvaluation(RequestMessage requestMessage, ResponseMessage responseMessage);
    void riskEvaluation(Risk requestMessage, ResponseMessage responseMessage);

    /**
     * 规则名称前缀
     *
     * @param personMap      RequestMessage
     * @param resultMessage  ResponseMessage
     * @param ruleNameStarts String
     */
    void riskEvaluationRuleNameStartsWithAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameStarts);
    /**
     * 规则名称全名
     *
     * @param personMap      RequestMessage
     * @param resultMessage  ResponseMessage
     * @param ruleNameEquals String
     */
    void riskEvaluationRuleNameEqualsAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameEquals);
    /**
     * 规则名称后缀
     *
     * @param personMap     RequestMessage
     * @param resultMessage ResponseMessage
     * @param ruleNameEnds  String
     */
    void riskEvaluationRuleNameEndsWithAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameEnds);

    /**
     * 规则名称正则
     *
     * @param personMap       RequestMessage
     * @param resultMessage   ResponseMessage
     * @param ruleNameMatches String
     */
    void riskEvaluationRuleNameMatchesAgendaFilter(RequestMessage personMap, ResponseMessage resultMessage, String ruleNameMatches);






}
