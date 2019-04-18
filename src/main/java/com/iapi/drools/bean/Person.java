package com.iapi.drools.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 人员指标属性表
 *
 * <p>
 * Date: Thu Oct 25 17:39:00 CST 2018.
 * </p>
 *
 * @author (lzw)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private static final long serialVersionUID = 4642182054832174116L;

    /**
     * 人员ID唯一主键
     */
    private String pers_id;

    /**
     * 重点关注库掌握人员
     */
    private String ZDGZ;

    /**
     * 是否重点上机地
     */
    private String ZDSJ;

    /**
     * 是否重点下机地
     */
    private String ZDXJ;

    /**
     * 是否出入涉恐国家
     */
    private String CRSK;

    /**
     * 外国人签证签发停留期
     */
    private String QZTL;

    /**
     * 中国证件签发地
     */
    private String ZJQFD;

    /**
     * 中国证件签发时间
     */
    private String ZJQFS;

    /**
     * 中国旅客户籍行政区划
     */
    private String HJD;

    /**
     * 中国旅客身份证号
     */
    private String CHNID;

    /**
     * 当前和既往签证种类仅为M和L
     */
    private String QZML;

    /**
     * 是否申请过团聚签证（M/H/Q1/Q2）
     */
    private String QZTJ;

    /**
     * 仅办理过一次签证
     */
    private String QZYC;

    /**
     * 当前和既往签证种类仅为X、L
     */
    private String QZXL;

    /**
     * 外国人签证签发时间
     */
    private String QZQFS;

    /**
     * 外国人签证签发单位
     */
    private String QZQFW;

    /**
     * 外国人签证号码
     */
    private String QZHM;

    /**
     * 外国人签证种类
     */
    private String QZZL;

    /**
     * 外国人签证是否国籍国签发
     */
    private String QZGJ;

    /**
     * 来自国
     */
    private String LZG;

    /**
     * 外国人在疆内有过常住或临住记录的人员
     */
    private String XJZS;

    /**
     * 历史在华停留时长
     */
    private String LSTL;

    /**
     * 职业
     */
    private String ZY;

    /**
     * 工作单位
     */
    private String DW;

    /**
     * 登记时间
     */
    private String DJSJ;

    /**
     * 住宿时间
     */
    private String ZSSJ;

    /**
     * 住宿地点
     */
    private String ZSDD;

    /**
     * 邀请单位
     */
    private String YQDW;

    /**
     * 中国旅客民族
     */
    private String ZGMZ;

    /**
     * 是否符合新疆姓名特点
     */
    private String XJXM;

    /**
     * 外国人常住第三国
     */
    private String WDSG;

    /**
     * 商贸目的地
     */
    private String SMDD;

    /**
     * 旅游目的地
     */
    private String LYDD;

    /**
     * 外国旅客入境活动区域
     */
    private String WRJQY;

    /**
     * 外国人历史活动区域
     */
    private String WLSQY;

    /**
     * 性别
     */
    private String XB;

    /**
     * 出生日期
     */
    private String CSRQ;

    /**
     * 名
     */
    private String M;

    /**
     * 中间名
     */
    private String ZJM;

    /**
     * 姓
     */
    private String X;

    /**
     * 英文姓名
     */
    private String YWXM;

    /**
     * 中文姓名
     */
    private String ZWXM;

    /**
     * 国籍
     */
    private String GJ;

    /**
     * 证件号码
     */
    private String ZJHM;

    /**
     * 证件类型
     */
    private String ZJLX;

    /**
     * 是否外籍维族人员
     */
    private String WJWZ;

    /**
     * 外籍华人姓氏
     */
    private String WHXS;

    /**
     * 初始上机地是否为发达国家
     */
    private String SJDFD;

    /**
     * 从非国籍国机场登机
     */
    private String FGJJC;

    /**
     * 最终下机地机场
     */
    private String ZZXJD;

    /**
     * 上机地
     */
    private String SJD;

    /**
     * 入境航班号
     */
    private String RJHBH;

    /**
     * 到达时间
     */
    private String DDSJ;

    /**
     * 出入境平衡信息
     */
    private String CRPH;

    /**
     * 出入境频次
     */
    private String CRPC;

    /**
     * 出入境标志
     */
    private String CRBZ;

    /**
     * 是否首次来华
     */
    private String SCLH;

    /**
     * 年龄
     */
    private String NL;

    /**
     * 中国人出境天数
     */
    private String ZCTS;

    /**
     * 初始上机地
     */
    private String CSJD;

    /**
     * 订票号
     */
    private String DPH;

    /**
     * 值机时间
     */
    private String ZJSJ;

    /**
     * 值机号（根据航信提供的时间排序算）
     */
    private String ZJH;

    /**
     * 是否经常飞人（在航空公司有注册账号）
     */
    private String JCFR;

    /**
     * 常旅客编号（是否经常飞人）
     */
    private String CLKH;

    /**
     * 付款方式
     */
    private String FKFS;

    /**
     * 付款人国籍代码
     */
    private String FKGJ;

    /**
     * 旅客数量
     */
    private String LKSL;

    /**
     * 5年内在华非法出入境记录次数
     */
    private String FFCR;

    /**
     * 5年内在华非法居留记录次数
     */
    private String FFJL;

    /**
     * 5年内在华非法居留记录次数
     */
    private String FFJY;

    /**
     * 2年内有在华违法住宿登记规定次数
     */
    private String WFZS;

    /**
     * 是否有涉外案违法记录
     */
    private String TDWF;

    /**
     * 签证历史信息
     */
    private String QZLS;

    /**
     * 外国人签证签发单位不等于旅客国籍国（当前）
     */
    private String QFGJ;

    /**
     * 是否曾在本国上机
     */
    private String BGDJ;

    /**
     * 付款方式等于现金
     */
    private String FKXJ;

    /**
     * 下机地是否为发达国家
     */
    private String FDGJ;

    /**
     * 是否中转返回本国
     */
    private String ZZHG;

    /**
     * 是否黑名单人员
     */
    private String HMD;
    /**
     * 下机地
     */
    private String XJD;


}