package com.iapi.drools.utils;

import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.Match;

import java.util.Set;

/**
 * @Package com.iapi.drools.utils
 * @Project iapi-drools
 * @Author Cheng GuoJun
 * @Descript
 * @Date 2018-10-11 16:48
 */
public class CustomAgendaFilter implements AgendaFilter {
    //传入的rule name
    private final Set<String> ruleNamesThatAreAllowedToFire;

    public CustomAgendaFilter(Set<String> ruleNamesThatAreAllowedToFire) {
        this.ruleNamesThatAreAllowedToFire = ruleNamesThatAreAllowedToFire;
    }
    @Override
    public boolean accept(Match match) {
        return ruleNamesThatAreAllowedToFire.contains(match.getRule().getName());
    }




}
