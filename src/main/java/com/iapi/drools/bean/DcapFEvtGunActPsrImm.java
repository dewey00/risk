package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 出入境人员携带枪支弹药登记信息表 dcap_f_evt_gun_act_psr_imm
 *
 * <p>Date: Thu Sep 27 11:38:02 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFEvtGunActPsrImm  implements Serializable {


	private static final long serialVersionUID =  7015512464839552578L;


	/**
	 * 事件编号，唯一标识（口岸代码 +通道号+出入日期+出入时间+3位流水号）
	 */
	private String evt_id;

	/**
	 * 证件号码
	 */
	private String cert_no;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键
	 */
	private String pers_id;

	/**
	 * 携枪人姓名
	 */
	private String gun_carrier;

	/**
	 * 国家地区代码
	 */
	private String country_code;

	/**
	 * 入境口岸
	 */
	private String entry_port;

	/**
	 * 过境口岸
	 */
	private String trans_port;

	/**
	 * 出境口岸
	 */
	private String exit_port;

	/**
	 * 接待单位
	 */
	private String rcpt_unit;

	/**
	 * 联系人姓名
	 */
	private String contact_name;

	/**
	 * 联系电话
	 */
	private String contact_tel;

	/**
	 * 批准单位
	 */
	private String approval_unit;

	/**
	 * 批准文号
	 */
	private String approval_no;

	/**
	 * 交通工具标识
	 */
	private String trs_id;

	/**
	 * 用途
	 */
	private String purpose;

	/**
	 * 目的地
	 */
	private String destination;

	/**
	 * 检查员号码（查获人）
	 */
	private String inspector;

	/**
	 * 值班领导
	 */
	private String on_duty_leader;

	/**
	 * 登记时间
	 */
	private String reg_dt;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 更改操作员
	 */
	private String chg_oper;

	/**
	 * 更改时间
	 */
	private String chg_dt;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 前往国家地区名称

	 */
	private String country_code_na;

	/**
	 * 入境口岸名称

	 */
	private String entry_port_na;

	/**
	 * 过境口岸名称

	 */
	private String trans_port_na;

	/**
	 * 出境口岸名称

	 */
	private String exit_port_na;

	/**
	 * 检查员号码名称

	 */
	private String inspector_na;

	/**
	 * 值班领导名称

	 */
	private String on_duty_leader_na;

	/**
	 * 变更操作员名称

	 */
	private String chg_oper_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFEvtGunActPsrImm(){super();}

	public  DcapFEvtGunActPsrImm(String evt_id,String cert_no,String pers_id,String gun_carrier,String country_code,String entry_port,String trans_port,String exit_port,String rcpt_unit,String contact_name,String contact_tel,String approval_unit,String approval_no,String trs_id,String purpose,String destination,String inspector,String on_duty_leader,String reg_dt,String remark,String chg_oper,String chg_dt,String load_dt,String objectid,String country_code_na,String entry_port_na,String trans_port_na,String exit_port_na,String inspector_na,String on_duty_leader_na,String chg_oper_na,String filterflag){
	this.evt_id=evt_id;
	this.cert_no=cert_no;
	this.pers_id=pers_id;
	this.gun_carrier=gun_carrier;
	this.country_code=country_code;
	this.entry_port=entry_port;
	this.trans_port=trans_port;
	this.exit_port=exit_port;
	this.rcpt_unit=rcpt_unit;
	this.contact_name=contact_name;
	this.contact_tel=contact_tel;
	this.approval_unit=approval_unit;
	this.approval_no=approval_no;
	this.trs_id=trs_id;
	this.purpose=purpose;
	this.destination=destination;
	this.inspector=inspector;
	this.on_duty_leader=on_duty_leader;
	this.reg_dt=reg_dt;
	this.remark=remark;
	this.chg_oper=chg_oper;
	this.chg_dt=chg_dt;
	this.load_dt=load_dt;
	this.objectid=objectid;
	this.country_code_na=country_code_na;
	this.entry_port_na=entry_port_na;
	this.trans_port_na=trans_port_na;
	this.exit_port_na=exit_port_na;
	this.inspector_na=inspector_na;
	this.on_duty_leader_na=on_duty_leader_na;
	this.chg_oper_na=chg_oper_na;
	this.filterflag=filterflag;
}

	public String getEvt_id() {
		return this.evt_id;
	}

	public void setEvt_id(String evt_id) {
		this.evt_id = evt_id;
	}

	public String getCert_no() {
		return this.cert_no;
	}

	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getGun_carrier() {
		return this.gun_carrier;
	}

	public void setGun_carrier(String gun_carrier) {
		this.gun_carrier = gun_carrier;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getEntry_port() {
		return this.entry_port;
	}

	public void setEntry_port(String entry_port) {
		this.entry_port = entry_port;
	}

	public String getTrans_port() {
		return this.trans_port;
	}

	public void setTrans_port(String trans_port) {
		this.trans_port = trans_port;
	}

	public String getExit_port() {
		return this.exit_port;
	}

	public void setExit_port(String exit_port) {
		this.exit_port = exit_port;
	}

	public String getRcpt_unit() {
		return this.rcpt_unit;
	}

	public void setRcpt_unit(String rcpt_unit) {
		this.rcpt_unit = rcpt_unit;
	}

	public String getContact_name() {
		return this.contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getContact_tel() {
		return this.contact_tel;
	}

	public void setContact_tel(String contact_tel) {
		this.contact_tel = contact_tel;
	}

	public String getApproval_unit() {
		return this.approval_unit;
	}

	public void setApproval_unit(String approval_unit) {
		this.approval_unit = approval_unit;
	}

	public String getApproval_no() {
		return this.approval_no;
	}

	public void setApproval_no(String approval_no) {
		this.approval_no = approval_no;
	}

	public String getTrs_id() {
		return this.trs_id;
	}

	public void setTrs_id(String trs_id) {
		this.trs_id = trs_id;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getInspector() {
		return this.inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public String getOn_duty_leader() {
		return this.on_duty_leader;
	}

	public void setOn_duty_leader(String on_duty_leader) {
		this.on_duty_leader = on_duty_leader;
	}

	public String getReg_dt() {
		return this.reg_dt;
	}

	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getChg_oper() {
		return this.chg_oper;
	}

	public void setChg_oper(String chg_oper) {
		this.chg_oper = chg_oper;
	}

	public String getChg_dt() {
		return this.chg_dt;
	}

	public void setChg_dt(String chg_dt) {
		this.chg_dt = chg_dt;
	}

	public String getLoad_dt() {
		return this.load_dt;
	}

	public void setLoad_dt(String load_dt) {
		this.load_dt = load_dt;
	}

	public String getObjectid() {
		return this.objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public String getCountry_code_na() {
		return this.country_code_na;
	}

	public void setCountry_code_na(String country_code_na) {
		this.country_code_na = country_code_na;
	}

	public String getEntry_port_na() {
		return this.entry_port_na;
	}

	public void setEntry_port_na(String entry_port_na) {
		this.entry_port_na = entry_port_na;
	}

	public String getTrans_port_na() {
		return this.trans_port_na;
	}

	public void setTrans_port_na(String trans_port_na) {
		this.trans_port_na = trans_port_na;
	}

	public String getExit_port_na() {
		return this.exit_port_na;
	}

	public void setExit_port_na(String exit_port_na) {
		this.exit_port_na = exit_port_na;
	}

	public String getInspector_na() {
		return this.inspector_na;
	}

	public void setInspector_na(String inspector_na) {
		this.inspector_na = inspector_na;
	}

	public String getOn_duty_leader_na() {
		return this.on_duty_leader_na;
	}

	public void setOn_duty_leader_na(String on_duty_leader_na) {
		this.on_duty_leader_na = on_duty_leader_na;
	}

	public String getChg_oper_na() {
		return this.chg_oper_na;
	}

	public void setChg_oper_na(String chg_oper_na) {
		this.chg_oper_na = chg_oper_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
