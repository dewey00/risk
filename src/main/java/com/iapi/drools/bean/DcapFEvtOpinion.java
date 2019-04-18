package com.iapi.drools.bean;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 违法违规事件处理意见 dcap_f_evt_opinion
 *
 * <p>Date: Thu Sep 27 11:38:07 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFEvtOpinion  implements Serializable {


	private static final long serialVersionUID =  3180925728595166409L;


	/**
	 * 事件编号，唯一标识（口岸代码 +通道号+出入日期+出入时间+3位流水号）
	 */
	private String evt_id;

	/**
	 * 流转顺序
	 */
	private String cir_seq;

	/**
	 * 处理意见
	 */
	private InputStream deal_opinion;

	/**
	 * 处理人
	 */
	private String deal_oper;

	/**
	 * 处理部门代码
	 */
	private String deal_dept_code;

	/**
	 * 处理部门口岸代码
	 */
	private String deal_dept_port;

	/**
	 * 自述姓名
	 */
	private String confess_name;

	/**
	 * 自述出生日期
	 */
	private String confess_birth_date;

	/**
	 * 自述国家地区代码
	 */
	private String confess_country_code;

	/**
	 * 自述居住地行政区划
	 */
	private String confess_region_code;

	/**
	 * 自述证件类型代码
	 */
	private String confess_cert_type;

	/**
	 * 自述证件号码
	 */
	private String confess_cert_no;

	/**
	 * 自述身份证号
	 */
	private String confess_card_id;

	/**
	 * 自述住址
	 */
	private String confess_address5;

	/**
	 * 处理结果代码(逗号分开)
	 */
	private String ill_deal_rsn;

	/**
	 * 处理备注
	 */
	private String deal_remarks;

	/**
	 * 事件性质代码
	 */
	private String evt_char_code;

	/**
	 * 处理时间
	 */
	private String deal_dt;

	/**
	 * 公文种类代码
	 */
	private String docs_type;

	/**
	 * 事件主题
	 */
	private String evt_theme;

	/**
	 * 事件描述
	 */
	private String evt_desc;

	/**
	 * 罚款金额
	 */
	private String punish_amt;

	/**
	 * 没收金额
	 */
	private String forfeit_amt;

	/**
	 * 拘留天数
	 */
	private String hold_day_num;

	/**
	 * 事件类别（以逗号间隔：**，**）
	 */
	private String evt_types;

	/**
	 * 个人处理标志
	 */
	private String pers_deal_flag;

	/**
	 * 目标部门
	 */
	private String tgt_dept;

	/**
	 * 目标人员
	 */
	private String tgt_oper;

	/**
	 * 审批人
	 */
	private String approver;

	/**
	 * 流转标志（0失败；1：流转；2：回收；3：追加；4归档）
	 */
	private String cir_flag;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 处理人名称

	 */
	private String deal_oper_na;

	/**
	 * 处理部门名称

	 */
	private String deal_dept_na;

	/**
	 * 处理部门口岸名称

	 */
	private String deal_dept_port_na;

	/**
	 * 人员姓名拼音

	 */
	private String pers_name_seh;

	/**
	 * 自述国家地区名称

	 */
	private String confess_country_na;

	/**
	 * 自述居住地行政区名称

	 */
	private String confess_region_na;

	/**
	 * 自述证件类型名称

	 */
	private String confess_cert_type_na;

	/**
	 * 处理结果说明

	 */
	private String ill_deal_rsn_na;

	/**
	 * 事件性质名称

	 */
	private String evt_char_na;

	/**
	 * 公文种类代码名称

	 */
	private String docs_type_na;

	/**
	 * 事件类别名称

	 */
	private String evt_types_na;

	/**
	 * 目标部门名称

	 */
	private String tgt_dept_na;

	/**
	 * 审批人名称

	 */
	private String approver_na;

	/**
	 * 目标人员名称

	 */
	private String tgt_oper_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	/**
	 * 个人处理标志名称

	 */
	private String pers_deal_flag_na;

	public  DcapFEvtOpinion(){super();}

	public  DcapFEvtOpinion(String evt_id,String cir_seq,InputStream deal_opinion,String deal_oper,String deal_dept_code,String deal_dept_port,String confess_name,String confess_birth_date,String confess_country_code,String confess_region_code,String confess_cert_type,String confess_cert_no,String confess_card_id,String confess_address5,String ill_deal_rsn,String deal_remarks,String evt_char_code,String deal_dt,String docs_type,String evt_theme,String evt_desc,String punish_amt,String forfeit_amt,String hold_day_num,String evt_types,String pers_deal_flag,String tgt_dept,String tgt_oper,String approver,String cir_flag,String load_dt,String objectid,String deal_oper_na,String deal_dept_na,String deal_dept_port_na,String pers_name_seh,String confess_country_na,String confess_region_na,String confess_cert_type_na,String ill_deal_rsn_na,String evt_char_na,String docs_type_na,String evt_types_na,String tgt_dept_na,String approver_na,String tgt_oper_na,String filterflag,String pers_deal_flag_na){
		this.evt_id=evt_id;
		this.cir_seq=cir_seq;
		this.deal_opinion=deal_opinion;
		this.deal_oper=deal_oper;
		this.deal_dept_code=deal_dept_code;
		this.deal_dept_port=deal_dept_port;
		this.confess_name=confess_name;
		this.confess_birth_date=confess_birth_date;
		this.confess_country_code=confess_country_code;
		this.confess_region_code=confess_region_code;
		this.confess_cert_type=confess_cert_type;
		this.confess_cert_no=confess_cert_no;
		this.confess_card_id=confess_card_id;
		this.confess_address5=confess_address5;
		this.ill_deal_rsn=ill_deal_rsn;
		this.deal_remarks=deal_remarks;
		this.evt_char_code=evt_char_code;
		this.deal_dt=deal_dt;
		this.docs_type=docs_type;
		this.evt_theme=evt_theme;
		this.evt_desc=evt_desc;
		this.punish_amt=punish_amt;
		this.forfeit_amt=forfeit_amt;
		this.hold_day_num=hold_day_num;
		this.evt_types=evt_types;
		this.pers_deal_flag=pers_deal_flag;
		this.tgt_dept=tgt_dept;
		this.tgt_oper=tgt_oper;
		this.approver=approver;
		this.cir_flag=cir_flag;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.deal_oper_na=deal_oper_na;
		this.deal_dept_na=deal_dept_na;
		this.deal_dept_port_na=deal_dept_port_na;
		this.pers_name_seh=pers_name_seh;
		this.confess_country_na=confess_country_na;
		this.confess_region_na=confess_region_na;
		this.confess_cert_type_na=confess_cert_type_na;
		this.ill_deal_rsn_na=ill_deal_rsn_na;
		this.evt_char_na=evt_char_na;
		this.docs_type_na=docs_type_na;
		this.evt_types_na=evt_types_na;
		this.tgt_dept_na=tgt_dept_na;
		this.approver_na=approver_na;
		this.tgt_oper_na=tgt_oper_na;
		this.filterflag=filterflag;
		this.pers_deal_flag_na=pers_deal_flag_na;
	}

	public String getEvt_id() {
		return this.evt_id;
	}

	public void setEvt_id(String evt_id) {
		this.evt_id = evt_id;
	}

	public String getCir_seq() {
		return this.cir_seq;
	}

	public void setCir_seq(String cir_seq) {
		this.cir_seq = cir_seq;
	}

	public InputStream getDeal_opinion() {
		return this.deal_opinion;
	}

	public void setDeal_opinion(InputStream deal_opinion) {
		this.deal_opinion = deal_opinion;
	}

	public String getDeal_oper() {
		return this.deal_oper;
	}

	public void setDeal_oper(String deal_oper) {
		this.deal_oper = deal_oper;
	}

	public String getDeal_dept_code() {
		return this.deal_dept_code;
	}

	public void setDeal_dept_code(String deal_dept_code) {
		this.deal_dept_code = deal_dept_code;
	}

	public String getDeal_dept_port() {
		return this.deal_dept_port;
	}

	public void setDeal_dept_port(String deal_dept_port) {
		this.deal_dept_port = deal_dept_port;
	}

	public String getConfess_name() {
		return this.confess_name;
	}

	public void setConfess_name(String confess_name) {
		this.confess_name = confess_name;
	}

	public String getConfess_birth_date() {
		return this.confess_birth_date;
	}

	public void setConfess_birth_date(String confess_birth_date) {
		this.confess_birth_date = confess_birth_date;
	}

	public String getConfess_country_code() {
		return this.confess_country_code;
	}

	public void setConfess_country_code(String confess_country_code) {
		this.confess_country_code = confess_country_code;
	}

	public String getConfess_region_code() {
		return this.confess_region_code;
	}

	public void setConfess_region_code(String confess_region_code) {
		this.confess_region_code = confess_region_code;
	}

	public String getConfess_cert_type() {
		return this.confess_cert_type;
	}

	public void setConfess_cert_type(String confess_cert_type) {
		this.confess_cert_type = confess_cert_type;
	}

	public String getConfess_cert_no() {
		return this.confess_cert_no;
	}

	public void setConfess_cert_no(String confess_cert_no) {
		this.confess_cert_no = confess_cert_no;
	}

	public String getConfess_card_id() {
		return this.confess_card_id;
	}

	public void setConfess_card_id(String confess_card_id) {
		this.confess_card_id = confess_card_id;
	}

	public String getConfess_address5() {
		return this.confess_address5;
	}

	public void setConfess_address5(String confess_address5) {
		this.confess_address5 = confess_address5;
	}

	public String getIll_deal_rsn() {
		return this.ill_deal_rsn;
	}

	public void setIll_deal_rsn(String ill_deal_rsn) {
		this.ill_deal_rsn = ill_deal_rsn;
	}

	public String getDeal_remarks() {
		return this.deal_remarks;
	}

	public void setDeal_remarks(String deal_remarks) {
		this.deal_remarks = deal_remarks;
	}

	public String getEvt_char_code() {
		return this.evt_char_code;
	}

	public void setEvt_char_code(String evt_char_code) {
		this.evt_char_code = evt_char_code;
	}

	public String getDeal_dt() {
		return this.deal_dt;
	}

	public void setDeal_dt(String deal_dt) {
		this.deal_dt = deal_dt;
	}

	public String getDocs_type() {
		return this.docs_type;
	}

	public void setDocs_type(String docs_type) {
		this.docs_type = docs_type;
	}

	public String getEvt_theme() {
		return this.evt_theme;
	}

	public void setEvt_theme(String evt_theme) {
		this.evt_theme = evt_theme;
	}

	public String getEvt_desc() {
		return this.evt_desc;
	}

	public void setEvt_desc(String evt_desc) {
		this.evt_desc = evt_desc;
	}

	public String getPunish_amt() {
		return this.punish_amt;
	}

	public void setPunish_amt(String punish_amt) {
		this.punish_amt = punish_amt;
	}

	public String getForfeit_amt() {
		return this.forfeit_amt;
	}

	public void setForfeit_amt(String forfeit_amt) {
		this.forfeit_amt = forfeit_amt;
	}

	public String getHold_day_num() {
		return this.hold_day_num;
	}

	public void setHold_day_num(String hold_day_num) {
		this.hold_day_num = hold_day_num;
	}

	public String getEvt_types() {
		return this.evt_types;
	}

	public void setEvt_types(String evt_types) {
		this.evt_types = evt_types;
	}

	public String getPers_deal_flag() {
		return this.pers_deal_flag;
	}

	public void setPers_deal_flag(String pers_deal_flag) {
		this.pers_deal_flag = pers_deal_flag;
	}

	public String getTgt_dept() {
		return this.tgt_dept;
	}

	public void setTgt_dept(String tgt_dept) {
		this.tgt_dept = tgt_dept;
	}

	public String getTgt_oper() {
		return this.tgt_oper;
	}

	public void setTgt_oper(String tgt_oper) {
		this.tgt_oper = tgt_oper;
	}

	public String getApprover() {
		return this.approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getCir_flag() {
		return this.cir_flag;
	}

	public void setCir_flag(String cir_flag) {
		this.cir_flag = cir_flag;
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

	public String getDeal_oper_na() {
		return this.deal_oper_na;
	}

	public void setDeal_oper_na(String deal_oper_na) {
		this.deal_oper_na = deal_oper_na;
	}

	public String getDeal_dept_na() {
		return this.deal_dept_na;
	}

	public void setDeal_dept_na(String deal_dept_na) {
		this.deal_dept_na = deal_dept_na;
	}

	public String getDeal_dept_port_na() {
		return this.deal_dept_port_na;
	}

	public void setDeal_dept_port_na(String deal_dept_port_na) {
		this.deal_dept_port_na = deal_dept_port_na;
	}

	public String getPers_name_seh() {
		return this.pers_name_seh;
	}

	public void setPers_name_seh(String pers_name_seh) {
		this.pers_name_seh = pers_name_seh;
	}

	public String getConfess_country_na() {
		return this.confess_country_na;
	}

	public void setConfess_country_na(String confess_country_na) {
		this.confess_country_na = confess_country_na;
	}

	public String getConfess_region_na() {
		return this.confess_region_na;
	}

	public void setConfess_region_na(String confess_region_na) {
		this.confess_region_na = confess_region_na;
	}

	public String getConfess_cert_type_na() {
		return this.confess_cert_type_na;
	}

	public void setConfess_cert_type_na(String confess_cert_type_na) {
		this.confess_cert_type_na = confess_cert_type_na;
	}

	public String getIll_deal_rsn_na() {
		return this.ill_deal_rsn_na;
	}

	public void setIll_deal_rsn_na(String ill_deal_rsn_na) {
		this.ill_deal_rsn_na = ill_deal_rsn_na;
	}

	public String getEvt_char_na() {
		return this.evt_char_na;
	}

	public void setEvt_char_na(String evt_char_na) {
		this.evt_char_na = evt_char_na;
	}

	public String getDocs_type_na() {
		return this.docs_type_na;
	}

	public void setDocs_type_na(String docs_type_na) {
		this.docs_type_na = docs_type_na;
	}

	public String getEvt_types_na() {
		return this.evt_types_na;
	}

	public void setEvt_types_na(String evt_types_na) {
		this.evt_types_na = evt_types_na;
	}

	public String getTgt_dept_na() {
		return this.tgt_dept_na;
	}

	public void setTgt_dept_na(String tgt_dept_na) {
		this.tgt_dept_na = tgt_dept_na;
	}

	public String getApprover_na() {
		return this.approver_na;
	}

	public void setApprover_na(String approver_na) {
		this.approver_na = approver_na;
	}

	public String getTgt_oper_na() {
		return this.tgt_oper_na;
	}

	public void setTgt_oper_na(String tgt_oper_na) {
		this.tgt_oper_na = tgt_oper_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

	public String getPers_deal_flag_na() {
		return this.pers_deal_flag_na;
	}

	public void setPers_deal_flag_na(String pers_deal_flag_na) {
		this.pers_deal_flag_na = pers_deal_flag_na;
	}

}
