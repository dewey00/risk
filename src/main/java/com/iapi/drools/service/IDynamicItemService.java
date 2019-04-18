package com.iapi.drools.service;

import com.iapi.drools.bean.TbRiskIapi;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName IDynamicItemService
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2019-02-26 16:38
 * @Version 1.0
 */
public interface IDynamicItemService {
    /**
     * person 各指标项计算，返回计算后各指标项的值
     *
     * @param personId    人员ID
     * @param passPortNo  证件号码
     * @param nationality 国籍
     * @param names       英文姓名
     * @param birthday    出生日期
     * @param tbRiskIapi  接口对象
     * @date 2018年10月24日 上午9:23:58
     * @return java.util.Map<java.lang.String   ,   java.lang.String>
     */
    Map<String, Object> dynamicItem(String personId, String passPortNo, String nationality, String names, String birthday, TbRiskIapi tbRiskIapi);
    Map<String, Object> dynamicItem(String personId, String passPortNo, String nationality, String names, String birthday, HashMap tbRiskIapi);

}
