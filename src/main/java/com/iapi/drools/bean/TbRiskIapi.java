/*
 * Welcome to use the TableToBean Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:3.6.0
 */

package com.iapi.drools.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 启动风评处理数据源(TB_RISK_IAPI)
 * 
 * @author bianj
 * @version 1.0.0 2018-12-07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbRiskIapi implements Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7817018806627289504L;

    /** UUID */
    private String serial;
    
    /** 数字字串,23位，年4位，月2位，日2位，小时2位，分钟2位，秒2位，毫秒3位，PID号6位，PID不足六位左补0 */
    private String tid;
    
    /** 人员唯一编号 */
    private String passengerRecordnum;
    
    /** 航班唯一编号 */
    private String flightRecordnum;
    
    /** 系统校验请求为‘S’网站批量请求为‘B’ */
    private String reqttype;
    
    /** GAPP_RECEIVETIME */
    private BigDecimal gappReceivetime;
    
    /** GAPP_SENDTIME */
    private BigDecimal gappSendtime;
    
    /** 报文中的旅客是第几次发送，不是所有航空公司都会发送 */
    private BigDecimal sendsequence;
    
    /** 航空公司英文名称 */
    private String applicationsenderid;
    
    /** 航空公司联系人姓名，中间可能有空格 */
    private String airlinecontactor;
    
    /** 航空公司联系电话 */
    private String airlinephone;
    
    /** 航空公司传真 */
    private String airlinefax;
    
    /** 两种可能 1.两位航空公司代码+航班号（含航班后缀），不需要补0，后缀1位字母；2.七位字母数字组合 */
    private String fltno;
    
    /** 航班是入境 I 是出境航班 O */
    private String flighttype;
    
    /** 跨境航段为Y，即此航段在PAXLST中为LOC+125和LOC+87航段 */
    private String legcrossborder;
    
    /** 起飞航站 */
    private String cityfrom;
    
    /** 到达航站 */
    private String cityto;
    
    /** 计划起飞时间HHMM小时、分钟 */
    private BigDecimal scheduledeparturetime;
    
    /** 计划到达时间HHMM，小时、分钟 */
    private BigDecimal schedulearrivetime;
    
    /** 以需求角度用以区分不同报文CHECK 或者CHANGE */
    private String operation;
    
    /** 城市三字码，旅客在此航班上的起飞城市，对应LOC+178 */
    private String origin;
    
    /** 城市三字码，旅客在此航班上的目的城市，对应LOC+179 */
    private String destination;
    
    /** 城市三字码，旅客清关城市，对应LOC+22 */
    private String clrarcity;
    
    /** 旅客的姓 */
    private String familyname;
    
    /** 旅客的名 */
    private String firstname;
    
    /** 旅客的中间名 */
    private String middlename;
    
    /** 旅客的ICS记录编号 */
    private String recordlocater;
    
    /** 旅客的ABO唯一标识，航班上唯一 */
    private String abono;
    
    /** 电子客票号 */
    private String tktnumber;
    
    /** SIA Known Traveler Indicator (Future Use)  */
    private String aev;
    
    /** SIA Known Traveler Data (Future Use) */
    private String cnk;
    
    /** SIA Known Traveler Data(Future Use) */
    private String yzy;
    
    /** 旅客类型 */
    private String passengertype;
    
    /** 发送‘S’ 或者‘C’,S */
    private String vid;
    
    /** ‘M’ or ‘F’ or ‘U’ */
    private String gender;
    
    /** YYMMDD,年，月，日 */
    private BigDecimal dateofbirth;
    
    /** 出生国代码 */
    private String birthcountry;
    
    /** 三位国家代码 */
    private String nationality;
    
    /** 居住国三位国家代码 */
    private String residence;
    
    /** 护照号码 */
    private String passportno;
    
    /** 护照有效期YYMMDD,年，月，日 */
    private BigDecimal passportexpiredate;
    
    /** 护照颁发三位国家代码 */
    private String passportissuecountry;
    
    /** 护照签发日期 */
    private BigDecimal passportissuedate;
    
    /** Others号码 */
    private String otherNo;
    
    /** Others有效期YYMMDD,年，月，日 */
    private BigDecimal otherExpiredate;
    
    /** Others签发国家 */
    private String otherIssuecountry;
    
    /** Others签发日期 */
    private BigDecimal otherdocumentissuedate;
    
    /** VISA类型 */
    private String visatype;
    
    /** VISA号码 */
    private String visano;
    
    /** VISA有效期YYMMDD,年，月，日 */
    private BigDecimal visaexpiredate;
    
    /** VISA三位国家代码 */
    private String visaissuecountry;
    
    /** VISA签发日期 */
    private BigDecimal visaissuedate;
    
    /** 目的地地址，街道门牌等 */
    private String destaddress;
    
    /** 目的地城市名字 */
    private String destcity;
    
    /** 目的地所在的省 */
    private String deststate;
    
    /** 三位国家代码 */
    private String destcountry;
    
    /** 目的地的邮编 */
    private String destpostalcode;
    
    /** 错误码0表示请求处理成功 1表示处理请求出现异常 2表示生成回复出现异常 */
    private BigDecimal responecode;
    
    /** 错误信息对错误简单描述 成功回复：success 请求报文格式错误回复：format 旅客数据不完整：data incomplete 不在校验范围内：not in checking scope 修改时，找不到旅客：no passenger record */
    private String responemsg;
    
    /** 校验结果0Z,1Z,2Z,4Z */
    private String checkresult;
    
    /** 最终加压那结果 */
    private String lastcheckresult;
    
    /** 校验结果说明有时给出的校验结果报文中会带有校验状态说明，发送此说明信息此说明用在向航空公司回复的CUSRES报文的FTX段 */
    private String checkremark;
    
    /** 边检接收报文时间,checkin time */
    private Date iapiReceivetime;
    
    /** 边检回复时间  */
    private Date iapiResponsetime;
    
    /** 航班状态（0：取消 1:关闭 2:正在值机） */
    private BigDecimal flightstatus;
    
    /** 人员状态（0:已值机，未登机 1：已登机，未值机 2：已登机，已值机）  */
    private BigDecimal passengerstatus;
    
    /** 登机时间 */
    private Date lastupdatetime;
    
    /** 口岸 */
    private String port;
    
    /** 备降口岸 */
    private String changeport;
    
    /** 记录创建时间，默认oracle的sysdate */
    private Date createtime;
    
    /** 分发时间 */
    private Date disTime;
    
    /** 分发状态0：未分发，1：已分发 */
    private BigDecimal disStatus;
    
    /** 同步状态0：未同步1：已同步 */
    private BigDecimal synFlag;
    
    /** 座位号 */
    private String specifigseat;
    
    /** 计划起飞时间 */
    private Date departdate;
    
    /** 计划到达时间 */
    private Date arrivdate;
    
    /** 出生日期 */
    private Date birthday;
    
    /** 第一证类 */
    private String passporttype;
    
    /** 第二证类 */
    private String otherdocumenttype;
    
    /** 护照类型（整合回填字段，11	外交护照
12	公务护照
13	因公普通护照
14	普通护照) */
    private String intgCardtype;
    
    /** 中文姓名（整合回填字段） */
    private String intgChnname;
    
    /** 性别（整合回填字段） */
    private String intgGender;
    
    /** 签证种类（整合回填字段） */
    private String intgVisatype;
    
    /** 签证号码（整合回填字段） */
    private String intgVisano;
    
    /** 数据状态，1有效，0失效 */
    private BigDecimal status;
    
    /** 风评开始时间 */
    private Date riskBeginTime;
    
    /** 风评结束时间 */
    private Date riskEndTime;
    
    /** 风评状态:0初始状态；1发送到mq；2风评结束并且成功；3风评结束但失败了（没有找到personid） */
    private String riskStatus;
    
    /** 是否产生报警事件:0未产生；1产生 */
    private String alarmStatus;
    
    /** ES数据库中的PERSONID */
    private String personid;
    /**
    * @Author cheng
    * @Description //英文名
    * @Date 16:38 2019/3/27
    * @Param
    * @return
    *
    */
    private String ename;
}