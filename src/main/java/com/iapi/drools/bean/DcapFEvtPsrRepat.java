package com.iapi.drools.bean;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 遣返遣送旅客信息 dcap_f_evt_psr_repat
 *
 * <p>Date: Thu Sep 27 11:38:15 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFEvtPsrRepat  implements Serializable {


	private static final long serialVersionUID =  6610516790957491675L;


	/**
	 * 遣返遣送人员编号 

	 */
	private String repat_pers_id;

	/**
	 * 违法违规事件编号 

	 */
	private String ill_evt_id;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 

	 */
	private String pers_id;

	/**
	 * 姓名 

	 */
	private String name;

	/**
	 * 性别代码 

	 */
	private String gender;

	/**
	 * 出生日期 

	 */
	private String birth_date;

	/**
	 * 国家地区代码 

	 */
	private String country_code;

	/**
	 * 证件类别代码 

	 */
	private String cert_type;

	/**
	 * 证件号码 

	 */
	private String cert_no;

	/**
	 * 居住地行政区划代码 

	 */
	private String curr_region_code;

	/**
	 * 人员出入境类别 

	 */
	private String pers_imm_type;

	/**
	 * 发证地行政区划代码 

	 */
	private String cert_region_code;

	/**
	 * 原出入境日期 

	 */
	private String orig_imm_date;

	/**
	 * 原出入境口岸 

	 */
	private String orig_imm_port;

	/**
	 * 出入境目的 

	 */
	private String imm_purpose;

	/**
	 * 遣返遣送原因代码 

	 */
	private String repat_rsn_code;

	/**
	 * 遣返遣送口岸 

	 */
	private String repat_port;

	/**
	 * 遣返遣送国家地区代码 

	 */
	private String repat_country_code;

	/**
	 * 处理部门代码 

	 */
	private String deal_dept_code;

	/**
	 * 查中标志（0：未查中，1：临重控，2：常控，3：失效证，4：在逃，8：失效签证签证） 

	 */
	private String catch_flag;

	/**
	 * 遣返遣送业务类型 遣返遣送业务类型，0：遣返（退回境内），1：遣送（退出境外） 

	 */
	private String repat_type;

	/**
	 * 遣返遣送备注 

	 */
	private String repat_remarks;

	/**
	 * 录入人 

	 */
	private String edit_oper;

	/**
	 * 录入时间 

	 */
	private String edit_dt;

	/**
	 * 交通工具标识 

	 */
	private String trs_id;

	/**
	 * 处理结果描述 

	 */
	private String deal_rslt_desc;

	/**
	 * 查获时间 

	 */
	private String seize_dt;

	/**
	 * 入库时间 

	 */
	private String rec_dt;

	/**
	 * 第二姓名 

	 */
	private String second_name;

	/**
	 * 第二出生日期 

	 */
	private String sec_birth_date;

	/**
	 * 第二证件号码 

	 */
	private String sec_cert_no;

	/**
	 * 第二证类 

	 */
	private String sec_cert_type;

	/**
	 * 遣返遣送人员照片 

	 */
	private InputStream repat_psr_photo;

	/**
	 * 遣返遣送人员证件照片 

	 */
	private InputStream repat_psr_cert_photo;

	/**
	 * 加载时间戳 

	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 人员姓名拼音

	 */
	private String pers_name_seh;

	/**
	 * 性别代码名称

	 */
	private String gender_na;

	/**
	 * 国家地区名称

	 */
	private String country_na;

	/**
	 * 证件类型名称
	 */
	private String cert_type_na;

	/**
	 * 居住地行政区名称

	 */
	private String curr_region_na;

	/**
	 * 人员出入境类别名称

	 */
	private String pers_imm_type_na;

	/**
	 * 发证地行政区划名称

	 */
	private String cert_region_na;

	/**
	 * 原出入境口岸名称

	 */
	private String orig_imm_port_na;

	/**
	 * 遣返遣送原因说明

	 */
	private String repat_rsn_na;

	/**
	 * 遣返遣送口岸名称

	 */
	private String repat_port_na;

	/**
	 * 遣返遣送国家地区名称

	 */
	private String repat_country_na;

	/**
	 * 处理部门名称

	 */
	private String deal_dept_na;

	/**
	 * 录入人名称

	 */
	private String edit_oper_na;

	/**
	 * 处理结果描述

	 */
	private String deal_result_desc;

	/**
	 * 第二证件类型名称

	 */
	private String sec_cert_type_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFEvtPsrRepat(){super();}

	public  DcapFEvtPsrRepat(String repat_pers_id,String ill_evt_id,String pers_id,String name,String gender,String birth_date,String country_code,String cert_type,String cert_no,String curr_region_code,String pers_imm_type,String cert_region_code,String orig_imm_date,String orig_imm_port,String imm_purpose,String repat_rsn_code,String repat_port,String repat_country_code,String deal_dept_code,String catch_flag,String repat_type,String repat_remarks,String edit_oper,String edit_dt,String trs_id,String deal_rslt_desc,String seize_dt,String rec_dt,String second_name,String sec_birth_date,String sec_cert_no,String sec_cert_type,InputStream repat_psr_photo,InputStream repat_psr_cert_photo,String load_dt,String objectid,String pers_name_seh,String gender_na,String country_na,String cert_type_na,String curr_region_na,String pers_imm_type_na,String cert_region_na,String orig_imm_port_na,String repat_rsn_na,String repat_port_na,String repat_country_na,String deal_dept_na,String edit_oper_na,String deal_result_desc,String sec_cert_type_na,String filterflag){
		this.repat_pers_id=repat_pers_id;
		this.ill_evt_id=ill_evt_id;
		this.pers_id=pers_id;
		this.name=name;
		this.gender=gender;
		this.birth_date=birth_date;
		this.country_code=country_code;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.curr_region_code=curr_region_code;
		this.pers_imm_type=pers_imm_type;
		this.cert_region_code=cert_region_code;
		this.orig_imm_date=orig_imm_date;
		this.orig_imm_port=orig_imm_port;
		this.imm_purpose=imm_purpose;
		this.repat_rsn_code=repat_rsn_code;
		this.repat_port=repat_port;
		this.repat_country_code=repat_country_code;
		this.deal_dept_code=deal_dept_code;
		this.catch_flag=catch_flag;
		this.repat_type=repat_type;
		this.repat_remarks=repat_remarks;
		this.edit_oper=edit_oper;
		this.edit_dt=edit_dt;
		this.trs_id=trs_id;
		this.deal_rslt_desc=deal_rslt_desc;
		this.seize_dt=seize_dt;
		this.rec_dt=rec_dt;
		this.second_name=second_name;
		this.sec_birth_date=sec_birth_date;
		this.sec_cert_no=sec_cert_no;
		this.sec_cert_type=sec_cert_type;
		this.repat_psr_photo=repat_psr_photo;
		this.repat_psr_cert_photo=repat_psr_cert_photo;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_name_seh=pers_name_seh;
		this.gender_na=gender_na;
		this.country_na=country_na;
		this.cert_type_na=cert_type_na;
		this.curr_region_na=curr_region_na;
		this.pers_imm_type_na=pers_imm_type_na;
		this.cert_region_na=cert_region_na;
		this.orig_imm_port_na=orig_imm_port_na;
		this.repat_rsn_na=repat_rsn_na;
		this.repat_port_na=repat_port_na;
		this.repat_country_na=repat_country_na;
		this.deal_dept_na=deal_dept_na;
		this.edit_oper_na=edit_oper_na;
		this.deal_result_desc=deal_result_desc;
		this.sec_cert_type_na=sec_cert_type_na;
		this.filterflag=filterflag;
	}

	public String getRepat_pers_id() {
		return this.repat_pers_id;
	}

	public void setRepat_pers_id(String repat_pers_id) {
		this.repat_pers_id = repat_pers_id;
	}

	public String getIll_evt_id() {
		return this.ill_evt_id;
	}

	public void setIll_evt_id(String ill_evt_id) {
		this.ill_evt_id = ill_evt_id;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth_date() {
		return this.birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCert_type() {
		return this.cert_type;
	}

	public void setCert_type(String cert_type) {
		this.cert_type = cert_type;
	}

	public String getCert_no() {
		return this.cert_no;
	}

	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
	}

	public String getCurr_region_code() {
		return this.curr_region_code;
	}

	public void setCurr_region_code(String curr_region_code) {
		this.curr_region_code = curr_region_code;
	}

	public String getPers_imm_type() {
		return this.pers_imm_type;
	}

	public void setPers_imm_type(String pers_imm_type) {
		this.pers_imm_type = pers_imm_type;
	}

	public String getCert_region_code() {
		return this.cert_region_code;
	}

	public void setCert_region_code(String cert_region_code) {
		this.cert_region_code = cert_region_code;
	}

	public String getOrig_imm_date() {
		return this.orig_imm_date;
	}

	public void setOrig_imm_date(String orig_imm_date) {
		this.orig_imm_date = orig_imm_date;
	}

	public String getOrig_imm_port() {
		return this.orig_imm_port;
	}

	public void setOrig_imm_port(String orig_imm_port) {
		this.orig_imm_port = orig_imm_port;
	}

	public String getImm_purpose() {
		return this.imm_purpose;
	}

	public void setImm_purpose(String imm_purpose) {
		this.imm_purpose = imm_purpose;
	}

	public String getRepat_rsn_code() {
		return this.repat_rsn_code;
	}

	public void setRepat_rsn_code(String repat_rsn_code) {
		this.repat_rsn_code = repat_rsn_code;
	}

	public String getRepat_port() {
		return this.repat_port;
	}

	public void setRepat_port(String repat_port) {
		this.repat_port = repat_port;
	}

	public String getRepat_country_code() {
		return this.repat_country_code;
	}

	public void setRepat_country_code(String repat_country_code) {
		this.repat_country_code = repat_country_code;
	}

	public String getDeal_dept_code() {
		return this.deal_dept_code;
	}

	public void setDeal_dept_code(String deal_dept_code) {
		this.deal_dept_code = deal_dept_code;
	}

	public String getCatch_flag() {
		return this.catch_flag;
	}

	public void setCatch_flag(String catch_flag) {
		this.catch_flag = catch_flag;
	}

	public String getRepat_type() {
		return this.repat_type;
	}

	public void setRepat_type(String repat_type) {
		this.repat_type = repat_type;
	}

	public String getRepat_remarks() {
		return this.repat_remarks;
	}

	public void setRepat_remarks(String repat_remarks) {
		this.repat_remarks = repat_remarks;
	}

	public String getEdit_oper() {
		return this.edit_oper;
	}

	public void setEdit_oper(String edit_oper) {
		this.edit_oper = edit_oper;
	}

	public String getEdit_dt() {
		return this.edit_dt;
	}

	public void setEdit_dt(String edit_dt) {
		this.edit_dt = edit_dt;
	}

	public String getTrs_id() {
		return this.trs_id;
	}

	public void setTrs_id(String trs_id) {
		this.trs_id = trs_id;
	}

	public String getDeal_rslt_desc() {
		return this.deal_rslt_desc;
	}

	public void setDeal_rslt_desc(String deal_rslt_desc) {
		this.deal_rslt_desc = deal_rslt_desc;
	}

	public String getSeize_dt() {
		return this.seize_dt;
	}

	public void setSeize_dt(String seize_dt) {
		this.seize_dt = seize_dt;
	}

	public String getRec_dt() {
		return this.rec_dt;
	}

	public void setRec_dt(String rec_dt) {
		this.rec_dt = rec_dt;
	}

	public String getSecond_name() {
		return this.second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getSec_birth_date() {
		return this.sec_birth_date;
	}

	public void setSec_birth_date(String sec_birth_date) {
		this.sec_birth_date = sec_birth_date;
	}

	public String getSec_cert_no() {
		return this.sec_cert_no;
	}

	public void setSec_cert_no(String sec_cert_no) {
		this.sec_cert_no = sec_cert_no;
	}

	public String getSec_cert_type() {
		return this.sec_cert_type;
	}

	public void setSec_cert_type(String sec_cert_type) {
		this.sec_cert_type = sec_cert_type;
	}

	public InputStream getRepat_psr_photo() {
		return this.repat_psr_photo;
	}

	public void setRepat_psr_photo(InputStream repat_psr_photo) {
		this.repat_psr_photo = repat_psr_photo;
	}

	public InputStream getRepat_psr_cert_photo() {
		return this.repat_psr_cert_photo;
	}

	public void setRepat_psr_cert_photo(InputStream repat_psr_cert_photo) {
		this.repat_psr_cert_photo = repat_psr_cert_photo;
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

	public String getPers_name_seh() {
		return this.pers_name_seh;
	}

	public void setPers_name_seh(String pers_name_seh) {
		this.pers_name_seh = pers_name_seh;
	}

	public String getGender_na() {
		return this.gender_na;
	}

	public void setGender_na(String gender_na) {
		this.gender_na = gender_na;
	}

	public String getCountry_na() {
		return this.country_na;
	}

	public void setCountry_na(String country_na) {
		this.country_na = country_na;
	}

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getCurr_region_na() {
		return this.curr_region_na;
	}

	public void setCurr_region_na(String curr_region_na) {
		this.curr_region_na = curr_region_na;
	}

	public String getPers_imm_type_na() {
		return this.pers_imm_type_na;
	}

	public void setPers_imm_type_na(String pers_imm_type_na) {
		this.pers_imm_type_na = pers_imm_type_na;
	}

	public String getCert_region_na() {
		return this.cert_region_na;
	}

	public void setCert_region_na(String cert_region_na) {
		this.cert_region_na = cert_region_na;
	}

	public String getOrig_imm_port_na() {
		return this.orig_imm_port_na;
	}

	public void setOrig_imm_port_na(String orig_imm_port_na) {
		this.orig_imm_port_na = orig_imm_port_na;
	}

	public String getRepat_rsn_na() {
		return this.repat_rsn_na;
	}

	public void setRepat_rsn_na(String repat_rsn_na) {
		this.repat_rsn_na = repat_rsn_na;
	}

	public String getRepat_port_na() {
		return this.repat_port_na;
	}

	public void setRepat_port_na(String repat_port_na) {
		this.repat_port_na = repat_port_na;
	}

	public String getRepat_country_na() {
		return this.repat_country_na;
	}

	public void setRepat_country_na(String repat_country_na) {
		this.repat_country_na = repat_country_na;
	}

	public String getDeal_dept_na() {
		return this.deal_dept_na;
	}

	public void setDeal_dept_na(String deal_dept_na) {
		this.deal_dept_na = deal_dept_na;
	}

	public String getEdit_oper_na() {
		return this.edit_oper_na;
	}

	public void setEdit_oper_na(String edit_oper_na) {
		this.edit_oper_na = edit_oper_na;
	}

	public String getDeal_result_desc() {
		return this.deal_result_desc;
	}

	public void setDeal_result_desc(String deal_result_desc) {
		this.deal_result_desc = deal_result_desc;
	}

	public String getSec_cert_type_na() {
		return this.sec_cert_type_na;
	}

	public void setSec_cert_type_na(String sec_cert_type_na) {
		this.sec_cert_type_na = sec_cert_type_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
