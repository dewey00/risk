package com.iapi.drools.bean;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 外国人签证签发信息 dcap_f_per_cert_fgn_visa
 *
 * <p>Date: Thu Sep 27 11:38:36 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerCertFgnVisa  implements Serializable {


	private static final long serialVersionUID =  5047373958254418259L;


	/**
	 * 业务编号 

	 */
	private String busi_no;

	/**
	 * 上报省份，省级代码 

	 */
	private String rpt_prov;

	/**
	 * 人员编号 

	 */
	private String pers_no;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 

	 */
	private String pers_id;

	/**
	 *  英文姓

	 */
	private String surname;

	/**
	 * 英文名 

	 */
	private String firstname;

	/**
	 * 英文姓名 

	 */
	private String eng_name;

	/**
	 * 核查用姓名 

	 */
	private String verf_name;

	/**
	 * 中文姓名 

	 */
	private String chn_name;

	/**
	 * 性别
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
	 * 境外人员身份 

	 */
	private String fgn_sts;

	/**
	 * 申请事由 

	 */
	private String apply_rsn;

	/**
	 * 人员地域类别 

	 */
	private String pers_reg_catg;

	/**
	 * 证件种类 

	 */
	private String cert_type;

	/**
	 * 证件号码 

	 */
	private String cert_no;

	/**
	 * 核查用证号，只保留数字和字母 

	 */
	private String verf_cert_no;

	/**
	 * 证件有效期截止日期，VLD：Valid Till 

	 */
	private String cert_vld;

	/**
	 * 偕行人数 

	 */
	private String accompany_nbr;

	/**
	 * 境外人员类别 

	 */
	private String fgn_type;

	/**
	 * 境外人员身份证号码
	 */
	private String fgn_card_id;

	/**
	 * 原签证/居留许可种类 

	 */
	private String orig_visa_type;

	/**
	 * 原签证/居留许可号码 

	 */
	private String orig_visa_no;

	/**
	 * 签证种类
	 */
	private String visa_type;

	/**
	 * 签证号码 

	 */
	private String visa_no;

	/**
	 * 材料类别 

	 */
	private String docs_type;

	/**
	 * 签证签发单位 

	 */
	private String visa_assign_dept;

	/**
	 * 制证单位，行政区划代码 

	 */
	private String accred_unit;

	/**
	 * 签证有效次数 

	 */
	private String visa_eff_nbr;

	/**
	 * 团队标识 

	 */
	private String group_id;

	/**
	 * 团队号
	 */
	private String group_no;

	/**
	 * 团队人数 

	 */
	private String group_nbr;

	/**
	 * 签证签发日期 

	 */
	private String visa_date;

	/**
	 * 签证有效期
	 */
	private String visa_valid;

	/**
	 * 签证有效期至 

	 */
	private String visa_vld;

	/**
	 * 签证停留期 

	 */
	private String visa_period;

	/**
	 * 签证居留许可事由 

	 */
	private String visa_rstd_rsn;

	/**
	 * 邀请单位名称 

	 */
	private String invt_unit_name;

	/**
	 * 邀请单位代码 

	 */
	private String invt_unit_code;

	/**
	 * 受理单位 

	 */
	private String accept_organ;

	/**
	 * 受理时间，格式为YYYYMMDDHH24MISS 


	 */
	private String accept_dt;

	private String curr_region_code___________1;

	/**
	 * 居住地派出所代码，LPS：Local Police Station 

	 */
	private String curr_lps_code;

	/**
	 * 居住地派出所名称 

	 */
	private String curr_lps_name;

	/**
	 * 居住地详细地址 

	 */
	private String curr_address;

	/**
	 * 工作单位行政区划
	 */
	private String unit_region_code;

	/**
	 * 工作(学习)单位所在派出所 

	 */
	private String unit_lps_code;

	/**
	 * 工作(学习)单位所在派出所名称 

	 */
	private String unit_lps_name;

	/**
	 * 工作单位组织机构代码 

	 */
	private String unit_org_code;

	/**
	 * 工作单位组织机构名称 
	 */
	private String unit_org_name;

	/**
	 * 常住标识 

	 */
	private String resident_flag;

	/**
	 * 是否已上报常住信息标识 

	 */
	private String is_report_resident;

	/**
	 * 数据来源（1：内地公安机关， 2： 外交部，10：出入境记录，11：外国人常住信息，12：外国人暂住信息，13：违法违规人员，14：遣返遣送人员，15：外国人涉案信息，16：失效证，17：在逃人员，18：临时入境许可信息，19：船员变更信息，20：处理意见，21：重点关注人员，50：内地居民证件签发，51：内地居民签注签发，52：港澳居民通行证签发，53：台湾居民通行证签发，54：外国人签证签发，55：临时入境许可，56：船舶证件发放，57：自助通关，58：国家工作人人员，59：司机资料表，99：其他，101：船舶航次总表，102：车辆资料备案，103：API航班资料，104：出入境交通工具，105：违法违规交通工具） 

	 */
	private String data_src_flag;

	/**
	 * 失效标识，0: 有效, 1: 失效 

	 */
	private String invalid_flag;

	/**
	 * 制证原始照片 

	 */
	private InputStream orig_photo;

	/**
	 * 压缩照片 

	 */
	private InputStream compr_photo;

	/**
	 * 原签证停留期至 

	 */
	private String orig_visa_vld;

	/**
	 * 与邀请人关系 

	 */
	private String rlat_inviter;

	/**
	 * 邀请人英文姓 

	 */
	private String invt_surname;

	/**
	 * 邀请人英文名 

	 */
	private String invt_firstname;

	/**
	 * 邀请人中文姓名 

	 */
	private String invt_chn_name;

	/**
	 * 邀请人性别 

	 */
	private String invt_gender;

	/**
	 * 邀请人身份证号码 

	 */
	private String invt_card_id;

	/**
	 * 邀请人出生日期 

	 */
	private String invt_birth_date;

	/**
	 * 邀请人国家/地区 

	 */
	private String invt_country;

	/**
	 * 邀请人证件种类 

	 */
	private String invt_cert_type;

	/**
	 * 邀请人证件号码
	 */
	private String invt_cert_no;

	/**
	 * 邀请人居住地详细地址
	 */
	private String invt_address;

	/**
	 * 邀请人工作单位 

	 */
	private String invt_work_unit;

	/**
	 * 邀请人联系电话 

	 */
	private String invt_tel;

	/**
	 * 境内联系电话 

	 */
	private String domestic_tel;

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
	 * 上报省份名称
	 */
	private String rpt_prov_na;

	/**
	 * 人员姓名
	 */
	private String pers_name;

	/**
	 * 人员姓名拼音
	 */
	private String pers_name_seh;

	/**
	 * 性别名称
	 */
	private String gender_na;

	/**
	 * 国家地区名称
	 */
	private String country_na;

	/**
	 * 身份证号码
	 */
	private String identity_code;

	/**
	 * 身份证号码名称

	 */
	private String identity_code_na;

	/**
	 * 申请原因名称
	 */
	private String apply_rsn_na;

	/**
	 * 人员地域类别名称
	 */
	private String pers_reg_catg_na;

	/**
	 * 证件类型名称
	 */
	private String cert_type_na;

	/**
	 * 人员类型（职业？）
	 */
	private String foreign_type;

	/**
	 * 人员证件ID
	 */
	private String foreign_card_id;

	/**
	 * 原签证/居留许可种类名称
	 */
	private String orig_visa_type_na;

	/**
	 * 签证种类名称
	 */
	private String visa_type_na;

	/**
	 * 公文种类代码名称
	 */
	private String docs_type_na;

	/**
	 * 签证签发单位名称

	 */
	private String visa_assign_dept_na;

	/**
	 * 制证单位名称
	 */
	private String accred_unit_na;

	/**
	 * 签证有效期名称
	 */
	private String visa_valid_na;

	/**
	 * 签证居留许可事由名称

	 */
	private String visa_rstd_rsn_na;

	/**
	 * 受理单位名称

	 */
	private String accept_organ_na;

	/**
	 * 居住地行政区划代码
	 */
	private String curr_region_code;

	/**
	 * 居住地行政区名称

	 */
	private String curr_region_na;

	/**
	 * 工作单位行政区名称

	 */
	private String unit_region_na;

	/**
	 * 与邀请人关系说明
	 */
	private String rlat_inviter_na;

	/**
	 * 邀请人性别名称

	 */
	private String invt_gender_na;

	/**
	 * 邀请人国家/地区名称

	 */
	private String invt_country_na;

	/**
	 * 邀请人证件种类名称

	 */
	private String invt_cert_type_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	/**
	 * 撤销标记
	 */
	private String revoke_flag;

	/**
	 * 违法违规标记
	 */
	private String pers_illegal_flag;

	/**
	 * 遣返遣送标记
	 */
	private String pers_repat_flag;

	public  DcapFPerCertFgnVisa(){super();}

	public  DcapFPerCertFgnVisa(String busi_no,String rpt_prov,String pers_no,String pers_id,String surname,String firstname,String eng_name,String verf_name,String chn_name,String gender,String birth_date,String country_code,String fgn_sts,String apply_rsn,String pers_reg_catg,String cert_type,String cert_no,String verf_cert_no,String cert_vld,String accompany_nbr,String fgn_type,String fgn_card_id,String orig_visa_type,String orig_visa_no,String visa_type,String visa_no,String docs_type,String visa_assign_dept,String accred_unit,String visa_eff_nbr,String group_id,String group_no,String group_nbr,String visa_date,String visa_valid,String visa_vld,String visa_period,String visa_rstd_rsn,String invt_unit_name,String invt_unit_code,String accept_organ,String accept_dt,String curr_region_code___________1,String curr_lps_code,String curr_lps_name,String curr_address,String unit_region_code,String unit_lps_code,String unit_lps_name,String unit_org_code,String unit_org_name,String resident_flag,String is_report_resident,String data_src_flag,String invalid_flag,InputStream orig_photo,InputStream compr_photo,String orig_visa_vld,String rlat_inviter,String invt_surname,String invt_firstname,String invt_chn_name,String invt_gender,String invt_card_id,String invt_birth_date,String invt_country,String invt_cert_type,String invt_cert_no,String invt_address,String invt_work_unit,String invt_tel,String domestic_tel,String seq_id,String load_dt,String objectid,String rpt_prov_na,String pers_name,String pers_name_seh,String gender_na,String country_na,String identity_code,String identity_code_na,String apply_rsn_na,String pers_reg_catg_na,String cert_type_na,String foreign_type,String foreign_card_id,String orig_visa_type_na,String visa_type_na,String docs_type_na,String visa_assign_dept_na,String accred_unit_na,String visa_valid_na,String visa_rstd_rsn_na,String accept_organ_na,String curr_region_code,String curr_region_na,String unit_region_na,String rlat_inviter_na,String invt_gender_na,String invt_country_na,String invt_cert_type_na,String filterflag,String revoke_flag,String pers_illegal_flag,String pers_repat_flag){
		this.busi_no=busi_no;
		this.rpt_prov=rpt_prov;
		this.pers_no=pers_no;
		this.pers_id=pers_id;
		this.surname=surname;
		this.firstname=firstname;
		this.eng_name=eng_name;
		this.verf_name=verf_name;
		this.chn_name=chn_name;
		this.gender=gender;
		this.birth_date=birth_date;
		this.country_code=country_code;
		this.fgn_sts=fgn_sts;
		this.apply_rsn=apply_rsn;
		this.pers_reg_catg=pers_reg_catg;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.verf_cert_no=verf_cert_no;
		this.cert_vld=cert_vld;
		this.accompany_nbr=accompany_nbr;
		this.fgn_type=fgn_type;
		this.fgn_card_id=fgn_card_id;
		this.orig_visa_type=orig_visa_type;
		this.orig_visa_no=orig_visa_no;
		this.visa_type=visa_type;
		this.visa_no=visa_no;
		this.docs_type=docs_type;
		this.visa_assign_dept=visa_assign_dept;
		this.accred_unit=accred_unit;
		this.visa_eff_nbr=visa_eff_nbr;
		this.group_id=group_id;
		this.group_no=group_no;
		this.group_nbr=group_nbr;
		this.visa_date=visa_date;
		this.visa_valid=visa_valid;
		this.visa_vld=visa_vld;
		this.visa_period=visa_period;
		this.visa_rstd_rsn=visa_rstd_rsn;
		this.invt_unit_name=invt_unit_name;
		this.invt_unit_code=invt_unit_code;
		this.accept_organ=accept_organ;
		this.accept_dt=accept_dt;
		this.curr_region_code___________1=curr_region_code___________1;
		this.curr_lps_code=curr_lps_code;
		this.curr_lps_name=curr_lps_name;
		this.curr_address=curr_address;
		this.unit_region_code=unit_region_code;
		this.unit_lps_code=unit_lps_code;
		this.unit_lps_name=unit_lps_name;
		this.unit_org_code=unit_org_code;
		this.unit_org_name=unit_org_name;
		this.resident_flag=resident_flag;
		this.is_report_resident=is_report_resident;
		this.data_src_flag=data_src_flag;
		this.invalid_flag=invalid_flag;
		this.orig_photo=orig_photo;
		this.compr_photo=compr_photo;
		this.orig_visa_vld=orig_visa_vld;
		this.rlat_inviter=rlat_inviter;
		this.invt_surname=invt_surname;
		this.invt_firstname=invt_firstname;
		this.invt_chn_name=invt_chn_name;
		this.invt_gender=invt_gender;
		this.invt_card_id=invt_card_id;
		this.invt_birth_date=invt_birth_date;
		this.invt_country=invt_country;
		this.invt_cert_type=invt_cert_type;
		this.invt_cert_no=invt_cert_no;
		this.invt_address=invt_address;
		this.invt_work_unit=invt_work_unit;
		this.invt_tel=invt_tel;
		this.domestic_tel=domestic_tel;
		this.seq_id=seq_id;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.rpt_prov_na=rpt_prov_na;
		this.pers_name=pers_name;
		this.pers_name_seh=pers_name_seh;
		this.gender_na=gender_na;
		this.country_na=country_na;
		this.identity_code=identity_code;
		this.identity_code_na=identity_code_na;
		this.apply_rsn_na=apply_rsn_na;
		this.pers_reg_catg_na=pers_reg_catg_na;
		this.cert_type_na=cert_type_na;
		this.foreign_type=foreign_type;
		this.foreign_card_id=foreign_card_id;
		this.orig_visa_type_na=orig_visa_type_na;
		this.visa_type_na=visa_type_na;
		this.docs_type_na=docs_type_na;
		this.visa_assign_dept_na=visa_assign_dept_na;
		this.accred_unit_na=accred_unit_na;
		this.visa_valid_na=visa_valid_na;
		this.visa_rstd_rsn_na=visa_rstd_rsn_na;
		this.accept_organ_na=accept_organ_na;
		this.curr_region_code=curr_region_code;
		this.curr_region_na=curr_region_na;
		this.unit_region_na=unit_region_na;
		this.rlat_inviter_na=rlat_inviter_na;
		this.invt_gender_na=invt_gender_na;
		this.invt_country_na=invt_country_na;
		this.invt_cert_type_na=invt_cert_type_na;
		this.filterflag=filterflag;
		this.revoke_flag=revoke_flag;
		this.pers_illegal_flag=pers_illegal_flag;
		this.pers_repat_flag=pers_repat_flag;
	}

	public String getBusi_no() {
		return this.busi_no;
	}

	public void setBusi_no(String busi_no) {
		this.busi_no = busi_no;
	}

	public String getRpt_prov() {
		return this.rpt_prov;
	}

	public void setRpt_prov(String rpt_prov) {
		this.rpt_prov = rpt_prov;
	}

	public String getPers_no() {
		return this.pers_no;
	}

	public void setPers_no(String pers_no) {
		this.pers_no = pers_no;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEng_name() {
		return this.eng_name;
	}

	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}

	public String getVerf_name() {
		return this.verf_name;
	}

	public void setVerf_name(String verf_name) {
		this.verf_name = verf_name;
	}

	public String getChn_name() {
		return this.chn_name;
	}

	public void setChn_name(String chn_name) {
		this.chn_name = chn_name;
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

	public String getFgn_sts() {
		return this.fgn_sts;
	}

	public void setFgn_sts(String fgn_sts) {
		this.fgn_sts = fgn_sts;
	}

	public String getApply_rsn() {
		return this.apply_rsn;
	}

	public void setApply_rsn(String apply_rsn) {
		this.apply_rsn = apply_rsn;
	}

	public String getPers_reg_catg() {
		return this.pers_reg_catg;
	}

	public void setPers_reg_catg(String pers_reg_catg) {
		this.pers_reg_catg = pers_reg_catg;
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

	public String getVerf_cert_no() {
		return this.verf_cert_no;
	}

	public void setVerf_cert_no(String verf_cert_no) {
		this.verf_cert_no = verf_cert_no;
	}

	public String getCert_vld() {
		return this.cert_vld;
	}

	public void setCert_vld(String cert_vld) {
		this.cert_vld = cert_vld;
	}

	public String getAccompany_nbr() {
		return this.accompany_nbr;
	}

	public void setAccompany_nbr(String accompany_nbr) {
		this.accompany_nbr = accompany_nbr;
	}

	public String getFgn_type() {
		return this.fgn_type;
	}

	public void setFgn_type(String fgn_type) {
		this.fgn_type = fgn_type;
	}

	public String getFgn_card_id() {
		return this.fgn_card_id;
	}

	public void setFgn_card_id(String fgn_card_id) {
		this.fgn_card_id = fgn_card_id;
	}

	public String getOrig_visa_type() {
		return this.orig_visa_type;
	}

	public void setOrig_visa_type(String orig_visa_type) {
		this.orig_visa_type = orig_visa_type;
	}

	public String getOrig_visa_no() {
		return this.orig_visa_no;
	}

	public void setOrig_visa_no(String orig_visa_no) {
		this.orig_visa_no = orig_visa_no;
	}

	public String getVisa_type() {
		return this.visa_type;
	}

	public void setVisa_type(String visa_type) {
		this.visa_type = visa_type;
	}

	public String getVisa_no() {
		return this.visa_no;
	}

	public void setVisa_no(String visa_no) {
		this.visa_no = visa_no;
	}

	public String getDocs_type() {
		return this.docs_type;
	}

	public void setDocs_type(String docs_type) {
		this.docs_type = docs_type;
	}

	public String getVisa_assign_dept() {
		return this.visa_assign_dept;
	}

	public void setVisa_assign_dept(String visa_assign_dept) {
		this.visa_assign_dept = visa_assign_dept;
	}

	public String getAccred_unit() {
		return this.accred_unit;
	}

	public void setAccred_unit(String accred_unit) {
		this.accred_unit = accred_unit;
	}

	public String getVisa_eff_nbr() {
		return this.visa_eff_nbr;
	}

	public void setVisa_eff_nbr(String visa_eff_nbr) {
		this.visa_eff_nbr = visa_eff_nbr;
	}

	public String getGroup_id() {
		return this.group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getGroup_no() {
		return this.group_no;
	}

	public void setGroup_no(String group_no) {
		this.group_no = group_no;
	}

	public String getGroup_nbr() {
		return this.group_nbr;
	}

	public void setGroup_nbr(String group_nbr) {
		this.group_nbr = group_nbr;
	}

	public String getVisa_date() {
		return this.visa_date;
	}

	public void setVisa_date(String visa_date) {
		this.visa_date = visa_date;
	}

	public String getVisa_valid() {
		return this.visa_valid;
	}

	public void setVisa_valid(String visa_valid) {
		this.visa_valid = visa_valid;
	}

	public String getVisa_vld() {
		return this.visa_vld;
	}

	public void setVisa_vld(String visa_vld) {
		this.visa_vld = visa_vld;
	}

	public String getVisa_period() {
		return this.visa_period;
	}

	public void setVisa_period(String visa_period) {
		this.visa_period = visa_period;
	}

	public String getVisa_rstd_rsn() {
		return this.visa_rstd_rsn;
	}

	public void setVisa_rstd_rsn(String visa_rstd_rsn) {
		this.visa_rstd_rsn = visa_rstd_rsn;
	}

	public String getInvt_unit_name() {
		return this.invt_unit_name;
	}

	public void setInvt_unit_name(String invt_unit_name) {
		this.invt_unit_name = invt_unit_name;
	}

	public String getInvt_unit_code() {
		return this.invt_unit_code;
	}

	public void setInvt_unit_code(String invt_unit_code) {
		this.invt_unit_code = invt_unit_code;
	}

	public String getAccept_organ() {
		return this.accept_organ;
	}

	public void setAccept_organ(String accept_organ) {
		this.accept_organ = accept_organ;
	}

	public String getAccept_dt() {
		return this.accept_dt;
	}

	public void setAccept_dt(String accept_dt) {
		this.accept_dt = accept_dt;
	}

	public String getCurr_region_code___________1() {
		return this.curr_region_code___________1;
	}

	public void setCurr_region_code___________1(String curr_region_code___________1) {
		this.curr_region_code___________1 = curr_region_code___________1;
	}

	public String getCurr_lps_code() {
		return this.curr_lps_code;
	}

	public void setCurr_lps_code(String curr_lps_code) {
		this.curr_lps_code = curr_lps_code;
	}

	public String getCurr_lps_name() {
		return this.curr_lps_name;
	}

	public void setCurr_lps_name(String curr_lps_name) {
		this.curr_lps_name = curr_lps_name;
	}

	public String getCurr_address() {
		return this.curr_address;
	}

	public void setCurr_address(String curr_address) {
		this.curr_address = curr_address;
	}

	public String getUnit_region_code() {
		return this.unit_region_code;
	}

	public void setUnit_region_code(String unit_region_code) {
		this.unit_region_code = unit_region_code;
	}

	public String getUnit_lps_code() {
		return this.unit_lps_code;
	}

	public void setUnit_lps_code(String unit_lps_code) {
		this.unit_lps_code = unit_lps_code;
	}

	public String getUnit_lps_name() {
		return this.unit_lps_name;
	}

	public void setUnit_lps_name(String unit_lps_name) {
		this.unit_lps_name = unit_lps_name;
	}

	public String getUnit_org_code() {
		return this.unit_org_code;
	}

	public void setUnit_org_code(String unit_org_code) {
		this.unit_org_code = unit_org_code;
	}

	public String getUnit_org_name() {
		return this.unit_org_name;
	}

	public void setUnit_org_name(String unit_org_name) {
		this.unit_org_name = unit_org_name;
	}

	public String getResident_flag() {
		return this.resident_flag;
	}

	public void setResident_flag(String resident_flag) {
		this.resident_flag = resident_flag;
	}

	public String getIs_report_resident() {
		return this.is_report_resident;
	}

	public void setIs_report_resident(String is_report_resident) {
		this.is_report_resident = is_report_resident;
	}

	public String getData_src_flag() {
		return this.data_src_flag;
	}

	public void setData_src_flag(String data_src_flag) {
		this.data_src_flag = data_src_flag;
	}

	public String getInvalid_flag() {
		return this.invalid_flag;
	}

	public void setInvalid_flag(String invalid_flag) {
		this.invalid_flag = invalid_flag;
	}

	public InputStream getOrig_photo() {
		return this.orig_photo;
	}

	public void setOrig_photo(InputStream orig_photo) {
		this.orig_photo = orig_photo;
	}

	public InputStream getCompr_photo() {
		return this.compr_photo;
	}

	public void setCompr_photo(InputStream compr_photo) {
		this.compr_photo = compr_photo;
	}

	public String getOrig_visa_vld() {
		return this.orig_visa_vld;
	}

	public void setOrig_visa_vld(String orig_visa_vld) {
		this.orig_visa_vld = orig_visa_vld;
	}

	public String getRlat_inviter() {
		return this.rlat_inviter;
	}

	public void setRlat_inviter(String rlat_inviter) {
		this.rlat_inviter = rlat_inviter;
	}

	public String getInvt_surname() {
		return this.invt_surname;
	}

	public void setInvt_surname(String invt_surname) {
		this.invt_surname = invt_surname;
	}

	public String getInvt_firstname() {
		return this.invt_firstname;
	}

	public void setInvt_firstname(String invt_firstname) {
		this.invt_firstname = invt_firstname;
	}

	public String getInvt_chn_name() {
		return this.invt_chn_name;
	}

	public void setInvt_chn_name(String invt_chn_name) {
		this.invt_chn_name = invt_chn_name;
	}

	public String getInvt_gender() {
		return this.invt_gender;
	}

	public void setInvt_gender(String invt_gender) {
		this.invt_gender = invt_gender;
	}

	public String getInvt_card_id() {
		return this.invt_card_id;
	}

	public void setInvt_card_id(String invt_card_id) {
		this.invt_card_id = invt_card_id;
	}

	public String getInvt_birth_date() {
		return this.invt_birth_date;
	}

	public void setInvt_birth_date(String invt_birth_date) {
		this.invt_birth_date = invt_birth_date;
	}

	public String getInvt_country() {
		return this.invt_country;
	}

	public void setInvt_country(String invt_country) {
		this.invt_country = invt_country;
	}

	public String getInvt_cert_type() {
		return this.invt_cert_type;
	}

	public void setInvt_cert_type(String invt_cert_type) {
		this.invt_cert_type = invt_cert_type;
	}

	public String getInvt_cert_no() {
		return this.invt_cert_no;
	}

	public void setInvt_cert_no(String invt_cert_no) {
		this.invt_cert_no = invt_cert_no;
	}

	public String getInvt_address() {
		return this.invt_address;
	}

	public void setInvt_address(String invt_address) {
		this.invt_address = invt_address;
	}

	public String getInvt_work_unit() {
		return this.invt_work_unit;
	}

	public void setInvt_work_unit(String invt_work_unit) {
		this.invt_work_unit = invt_work_unit;
	}

	public String getInvt_tel() {
		return this.invt_tel;
	}

	public void setInvt_tel(String invt_tel) {
		this.invt_tel = invt_tel;
	}

	public String getDomestic_tel() {
		return this.domestic_tel;
	}

	public void setDomestic_tel(String domestic_tel) {
		this.domestic_tel = domestic_tel;
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

	public String getRpt_prov_na() {
		return this.rpt_prov_na;
	}

	public void setRpt_prov_na(String rpt_prov_na) {
		this.rpt_prov_na = rpt_prov_na;
	}

	public String getPers_name() {
		return this.pers_name;
	}

	public void setPers_name(String pers_name) {
		this.pers_name = pers_name;
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

	public String getIdentity_code() {
		return this.identity_code;
	}

	public void setIdentity_code(String identity_code) {
		this.identity_code = identity_code;
	}

	public String getIdentity_code_na() {
		return this.identity_code_na;
	}

	public void setIdentity_code_na(String identity_code_na) {
		this.identity_code_na = identity_code_na;
	}

	public String getApply_rsn_na() {
		return this.apply_rsn_na;
	}

	public void setApply_rsn_na(String apply_rsn_na) {
		this.apply_rsn_na = apply_rsn_na;
	}

	public String getPers_reg_catg_na() {
		return this.pers_reg_catg_na;
	}

	public void setPers_reg_catg_na(String pers_reg_catg_na) {
		this.pers_reg_catg_na = pers_reg_catg_na;
	}

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getForeign_type() {
		return this.foreign_type;
	}

	public void setForeign_type(String foreign_type) {
		this.foreign_type = foreign_type;
	}

	public String getForeign_card_id() {
		return this.foreign_card_id;
	}

	public void setForeign_card_id(String foreign_card_id) {
		this.foreign_card_id = foreign_card_id;
	}

	public String getOrig_visa_type_na() {
		return this.orig_visa_type_na;
	}

	public void setOrig_visa_type_na(String orig_visa_type_na) {
		this.orig_visa_type_na = orig_visa_type_na;
	}

	public String getVisa_type_na() {
		return this.visa_type_na;
	}

	public void setVisa_type_na(String visa_type_na) {
		this.visa_type_na = visa_type_na;
	}

	public String getDocs_type_na() {
		return this.docs_type_na;
	}

	public void setDocs_type_na(String docs_type_na) {
		this.docs_type_na = docs_type_na;
	}

	public String getVisa_assign_dept_na() {
		return this.visa_assign_dept_na;
	}

	public void setVisa_assign_dept_na(String visa_assign_dept_na) {
		this.visa_assign_dept_na = visa_assign_dept_na;
	}

	public String getAccred_unit_na() {
		return this.accred_unit_na;
	}

	public void setAccred_unit_na(String accred_unit_na) {
		this.accred_unit_na = accred_unit_na;
	}

	public String getVisa_valid_na() {
		return this.visa_valid_na;
	}

	public void setVisa_valid_na(String visa_valid_na) {
		this.visa_valid_na = visa_valid_na;
	}

	public String getVisa_rstd_rsn_na() {
		return this.visa_rstd_rsn_na;
	}

	public void setVisa_rstd_rsn_na(String visa_rstd_rsn_na) {
		this.visa_rstd_rsn_na = visa_rstd_rsn_na;
	}

	public String getAccept_organ_na() {
		return this.accept_organ_na;
	}

	public void setAccept_organ_na(String accept_organ_na) {
		this.accept_organ_na = accept_organ_na;
	}

	public String getCurr_region_code() {
		return this.curr_region_code;
	}

	public void setCurr_region_code(String curr_region_code) {
		this.curr_region_code = curr_region_code;
	}

	public String getCurr_region_na() {
		return this.curr_region_na;
	}

	public void setCurr_region_na(String curr_region_na) {
		this.curr_region_na = curr_region_na;
	}

	public String getUnit_region_na() {
		return this.unit_region_na;
	}

	public void setUnit_region_na(String unit_region_na) {
		this.unit_region_na = unit_region_na;
	}

	public String getRlat_inviter_na() {
		return this.rlat_inviter_na;
	}

	public void setRlat_inviter_na(String rlat_inviter_na) {
		this.rlat_inviter_na = rlat_inviter_na;
	}

	public String getInvt_gender_na() {
		return this.invt_gender_na;
	}

	public void setInvt_gender_na(String invt_gender_na) {
		this.invt_gender_na = invt_gender_na;
	}

	public String getInvt_country_na() {
		return this.invt_country_na;
	}

	public void setInvt_country_na(String invt_country_na) {
		this.invt_country_na = invt_country_na;
	}

	public String getInvt_cert_type_na() {
		return this.invt_cert_type_na;
	}

	public void setInvt_cert_type_na(String invt_cert_type_na) {
		this.invt_cert_type_na = invt_cert_type_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

	public String getRevoke_flag() {
		return this.revoke_flag;
	}

	public void setRevoke_flag(String revoke_flag) {
		this.revoke_flag = revoke_flag;
	}

	public String getPers_illegal_flag() {
		return this.pers_illegal_flag;
	}

	public void setPers_illegal_flag(String pers_illegal_flag) {
		this.pers_illegal_flag = pers_illegal_flag;
	}

	public String getPers_repat_flag() {
		return this.pers_repat_flag;
	}

	public void setPers_repat_flag(String pers_repat_flag) {
		this.pers_repat_flag = pers_repat_flag;
	}

}
