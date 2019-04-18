package com.iapi.drools.bean;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 自助通关备案信息 dcap_f_per_rec_self_clearance
 *
 * <p>Date: Thu Sep 27 11:39:08 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerRecSelfClearance  implements Serializable {


	private static final long serialVersionUID =  7345887681346842099L;


	/**
	 * 档案号
	 */
	private String files_no;

	/**
	 * 证件类别代码
	 */
	private String cert_type;

	/**
	 * 证件号码
	 */
	private String cert_no;

	/**
	 * 国家地区代码
	 */
	private String country_code;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键
	 */
	private String pers_id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 疑难字说明
	 */
	private String complex_desc;

	/**
	 * 性别代码
	 */
	private String gender;

	/**
	 * 出生日期
	 */
	private String birth_date;

	/**
	 * 民族代码
	 */
	private String nation_code;

	/**
	 * 证件有效期截止日期，VLD：Valid Till
	 */
	private String cert_vld;

	/**
	 * 签证（注）停留有效期
	 */
	private String visas_vld;

	/**
	 * 签证（注）号码
	 */
	private String visas_no;

	/**
	 * 签证（注）种类
	 */
	private String visas_type;

	/**
	 * 停留期限
	 */
	private String period;

	/**
	 * 自定义代码
	 */
	private String user_define_code;

	/**
	 * 操作员
	 */
	private String oper_code;

	/**
	 * 操作日期
	 */
	private String oper_date;

	/**
	 * 操作时间
	 */
	private String oper_time;

	/**
	 * 采集地点
	 */
	private String gather_place;

	/**
	 * 发证机关代码
	 */
	private String issuing_orfan;

	/**
	 * 前往来自国
	 */
	private String tf_country_code;

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
	 * 第二证件类型代码
	 */
	private String sec_cert_type;

	/**
	 * 自助人员类别
	 */
	private String ss_pers_type;

	/**
	 * 核查标记
	 */
	private String verf_flag;

	/**
	 * 核查日期
	 */
	private String verf_date;

	/**
	 * 核查时间
	 */
	private String verf_dt;

	/**
	 * 核查操作员
	 */
	private String verf_operator;

	/**
	 * 第二签证（注）有效期
	 */
	private String sec_visas_vld;

	/**
	 * 第二签证（注）号码
	 */
	private String sec_visas_no;

	/**
	 * 第二签证（注）种类
	 */
	private String sec_visas_type;

	/**
	 * 自助照片
	 */
	private InputStream ss_pers_photo;

	/**
	 * 序列ID
	 */
	private String seq_id;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 证件类型名称

	 */
	private String cert_type_na;

	/**
	 * 前往国家地区名称

	 */
	private String country_code_na;

	/**
	 * 人员姓名拼音

	 */
	private String pers_name_seh;

	/**
	 * 性别代码名称

	 */
	private String gender_na;

	/**
	 * 民族名称

	 */
	private String nation_na;

	/**
	 * 签证类型名称

	 */
	private String visas_type_na;

	/**
	 * 自定义代码名称

	 */
	private String user_define_code_na;

	/**
	 * 操作员名称

	 */
	private String oper_code_na;

	/**
	 * 采集地点名称

	 */
	private String gather_place_na;

	/**
	 * 发证机关代码名称

	 */
	private String issuing_orfan_na;

	/**
	 * 前往来自国名称

	 */
	private String tf_country_na;

	/**
	 * 第二证件类型名称

	 */
	private String sec_cert_type_na;

	/**
	 * 自助人员类别名称

	 */
	private String ss_pers_type_na;

	/**
	 * 核查操作员名称

	 */
	private String verf_operator_na;

	/**
	 * 第二签证（注）种类名称

	 */
	private String sec_visas_type_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFPerRecSelfClearance(){super();}

	public  DcapFPerRecSelfClearance(String files_no,String cert_type,String cert_no,String country_code,String pers_id,String name,String complex_desc,String gender,String birth_date,String nation_code,String cert_vld,String visas_vld,String visas_no,String visas_type,String period,String user_define_code,String oper_code,String oper_date,String oper_time,String gather_place,String issuing_orfan,String tf_country_code,String second_name,String sec_birth_date,String sec_cert_no,String sec_cert_type,String ss_pers_type,String verf_flag,String verf_date,String verf_dt,String verf_operator,String sec_visas_vld,String sec_visas_no,String sec_visas_type,InputStream ss_pers_photo,String seq_id,String load_dt,String objectid,String cert_type_na,String country_code_na,String pers_name_seh,String gender_na,String nation_na,String visas_type_na,String user_define_code_na,String oper_code_na,String gather_place_na,String issuing_orfan_na,String tf_country_na,String sec_cert_type_na,String ss_pers_type_na,String verf_operator_na,String sec_visas_type_na,String filterflag){
		this.files_no=files_no;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.country_code=country_code;
		this.pers_id=pers_id;
		this.name=name;
		this.complex_desc=complex_desc;
		this.gender=gender;
		this.birth_date=birth_date;
		this.nation_code=nation_code;
		this.cert_vld=cert_vld;
		this.visas_vld=visas_vld;
		this.visas_no=visas_no;
		this.visas_type=visas_type;
		this.period=period;
		this.user_define_code=user_define_code;
		this.oper_code=oper_code;
		this.oper_date=oper_date;
		this.oper_time=oper_time;
		this.gather_place=gather_place;
		this.issuing_orfan=issuing_orfan;
		this.tf_country_code=tf_country_code;
		this.second_name=second_name;
		this.sec_birth_date=sec_birth_date;
		this.sec_cert_no=sec_cert_no;
		this.sec_cert_type=sec_cert_type;
		this.ss_pers_type=ss_pers_type;
		this.verf_flag=verf_flag;
		this.verf_date=verf_date;
		this.verf_dt=verf_dt;
		this.verf_operator=verf_operator;
		this.sec_visas_vld=sec_visas_vld;
		this.sec_visas_no=sec_visas_no;
		this.sec_visas_type=sec_visas_type;
		this.ss_pers_photo=ss_pers_photo;
		this.seq_id=seq_id;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.cert_type_na=cert_type_na;
		this.country_code_na=country_code_na;
		this.pers_name_seh=pers_name_seh;
		this.gender_na=gender_na;
		this.nation_na=nation_na;
		this.visas_type_na=visas_type_na;
		this.user_define_code_na=user_define_code_na;
		this.oper_code_na=oper_code_na;
		this.gather_place_na=gather_place_na;
		this.issuing_orfan_na=issuing_orfan_na;
		this.tf_country_na=tf_country_na;
		this.sec_cert_type_na=sec_cert_type_na;
		this.ss_pers_type_na=ss_pers_type_na;
		this.verf_operator_na=verf_operator_na;
		this.sec_visas_type_na=sec_visas_type_na;
		this.filterflag=filterflag;
	}

	public String getFiles_no() {
		return this.files_no;
	}

	public void setFiles_no(String files_no) {
		this.files_no = files_no;
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

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
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

	public String getComplex_desc() {
		return this.complex_desc;
	}

	public void setComplex_desc(String complex_desc) {
		this.complex_desc = complex_desc;
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

	public String getNation_code() {
		return this.nation_code;
	}

	public void setNation_code(String nation_code) {
		this.nation_code = nation_code;
	}

	public String getCert_vld() {
		return this.cert_vld;
	}

	public void setCert_vld(String cert_vld) {
		this.cert_vld = cert_vld;
	}

	public String getVisas_vld() {
		return this.visas_vld;
	}

	public void setVisas_vld(String visas_vld) {
		this.visas_vld = visas_vld;
	}

	public String getVisas_no() {
		return this.visas_no;
	}

	public void setVisas_no(String visas_no) {
		this.visas_no = visas_no;
	}

	public String getVisas_type() {
		return this.visas_type;
	}

	public void setVisas_type(String visas_type) {
		this.visas_type = visas_type;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getUser_define_code() {
		return this.user_define_code;
	}

	public void setUser_define_code(String user_define_code) {
		this.user_define_code = user_define_code;
	}

	public String getOper_code() {
		return this.oper_code;
	}

	public void setOper_code(String oper_code) {
		this.oper_code = oper_code;
	}

	public String getOper_date() {
		return this.oper_date;
	}

	public void setOper_date(String oper_date) {
		this.oper_date = oper_date;
	}

	public String getOper_time() {
		return this.oper_time;
	}

	public void setOper_time(String oper_time) {
		this.oper_time = oper_time;
	}

	public String getGather_place() {
		return this.gather_place;
	}

	public void setGather_place(String gather_place) {
		this.gather_place = gather_place;
	}

	public String getIssuing_orfan() {
		return this.issuing_orfan;
	}

	public void setIssuing_orfan(String issuing_orfan) {
		this.issuing_orfan = issuing_orfan;
	}

	public String getTf_country_code() {
		return this.tf_country_code;
	}

	public void setTf_country_code(String tf_country_code) {
		this.tf_country_code = tf_country_code;
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

	public String getSs_pers_type() {
		return this.ss_pers_type;
	}

	public void setSs_pers_type(String ss_pers_type) {
		this.ss_pers_type = ss_pers_type;
	}

	public String getVerf_flag() {
		return this.verf_flag;
	}

	public void setVerf_flag(String verf_flag) {
		this.verf_flag = verf_flag;
	}

	public String getVerf_date() {
		return this.verf_date;
	}

	public void setVerf_date(String verf_date) {
		this.verf_date = verf_date;
	}

	public String getVerf_dt() {
		return this.verf_dt;
	}

	public void setVerf_dt(String verf_dt) {
		this.verf_dt = verf_dt;
	}

	public String getVerf_operator() {
		return this.verf_operator;
	}

	public void setVerf_operator(String verf_operator) {
		this.verf_operator = verf_operator;
	}

	public String getSec_visas_vld() {
		return this.sec_visas_vld;
	}

	public void setSec_visas_vld(String sec_visas_vld) {
		this.sec_visas_vld = sec_visas_vld;
	}

	public String getSec_visas_no() {
		return this.sec_visas_no;
	}

	public void setSec_visas_no(String sec_visas_no) {
		this.sec_visas_no = sec_visas_no;
	}

	public String getSec_visas_type() {
		return this.sec_visas_type;
	}

	public void setSec_visas_type(String sec_visas_type) {
		this.sec_visas_type = sec_visas_type;
	}

	public InputStream getSs_pers_photo() {
		return this.ss_pers_photo;
	}

	public void setSs_pers_photo(InputStream ss_pers_photo) {
		this.ss_pers_photo = ss_pers_photo;
	}

	public String getSeq_id() {
		return this.seq_id;
	}

	public void setSeq_id(String seq_id) {
		this.seq_id = seq_id;
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

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getCountry_code_na() {
		return this.country_code_na;
	}

	public void setCountry_code_na(String country_code_na) {
		this.country_code_na = country_code_na;
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

	public String getNation_na() {
		return this.nation_na;
	}

	public void setNation_na(String nation_na) {
		this.nation_na = nation_na;
	}

	public String getVisas_type_na() {
		return this.visas_type_na;
	}

	public void setVisas_type_na(String visas_type_na) {
		this.visas_type_na = visas_type_na;
	}

	public String getUser_define_code_na() {
		return this.user_define_code_na;
	}

	public void setUser_define_code_na(String user_define_code_na) {
		this.user_define_code_na = user_define_code_na;
	}

	public String getOper_code_na() {
		return this.oper_code_na;
	}

	public void setOper_code_na(String oper_code_na) {
		this.oper_code_na = oper_code_na;
	}

	public String getGather_place_na() {
		return this.gather_place_na;
	}

	public void setGather_place_na(String gather_place_na) {
		this.gather_place_na = gather_place_na;
	}

	public String getIssuing_orfan_na() {
		return this.issuing_orfan_na;
	}

	public void setIssuing_orfan_na(String issuing_orfan_na) {
		this.issuing_orfan_na = issuing_orfan_na;
	}

	public String getTf_country_na() {
		return this.tf_country_na;
	}

	public void setTf_country_na(String tf_country_na) {
		this.tf_country_na = tf_country_na;
	}

	public String getSec_cert_type_na() {
		return this.sec_cert_type_na;
	}

	public void setSec_cert_type_na(String sec_cert_type_na) {
		this.sec_cert_type_na = sec_cert_type_na;
	}

	public String getSs_pers_type_na() {
		return this.ss_pers_type_na;
	}

	public void setSs_pers_type_na(String ss_pers_type_na) {
		this.ss_pers_type_na = ss_pers_type_na;
	}

	public String getVerf_operator_na() {
		return this.verf_operator_na;
	}

	public void setVerf_operator_na(String verf_operator_na) {
		this.verf_operator_na = verf_operator_na;
	}

	public String getSec_visas_type_na() {
		return this.sec_visas_type_na;
	}

	public void setSec_visas_type_na(String sec_visas_type_na) {
		this.sec_visas_type_na = sec_visas_type_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
