package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 中国公民出入境证件签发信息 dcap_f_per_cert_chn_issue
 *
 * <p>Date: Thu Sep 27 11:38:28 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerCertChnIssue  implements Serializable {


	private static final long serialVersionUID =  4922034581866591378L;


	/**
	 * 证件种类 

	 */
	private String cert_type;

	/**
	 * 证件号码 

	 */
	private String cert_no;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 
	 */
	private String pers_id;

	/**
	 * 人员中文姓名 

	 */
	private String pers_name_cn;

	/**
	 * 同音姓名 

	 */
	private String pers_name_uni;

	/**
	 * 人员中文姓名拼音 

	 */
	private String pers_name_py;

	/**
	 * 第二姓名及曾用名 

	 */
	private String pers_name_sec;

	/**
	 * 性别代码 

	 */
	private String pers_gender;

	/**
	 * 出生日期 

	 */
	private String pers_birth_date;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 


	 */
	private String f_p_pers_id;

	/**
	 * 人员出生地代码，国外出生为3位国家/地区代码；国内出生为行政区划编码前2位 

	 */
	private String pers_birth_address;

	/**
	 * 国籍代码 

	 */
	private String pers_country;

	/**
	 * 身份证号码 

	 */
	private String pers_card_id;

	/**
	 * 政治面貌，政治面貌代码 

	 */
	private String political_sts_code;

	/**
	 * 文化程度，文化程度代码 
	 文化程度，文化程度代码

	 */
	private String education_code;

	/**
	 * 职级职称，职级职称代码 

	 */
	private String position_grade_code;

	/**
	 * 工作单位 

	 */
	private String work_unit;

	/**
	 * 民族代码 

	 */
	private String pers_nation;

	/**
	 * 现住地，详细通信地址 

	 */
	private String curr_address;

	/**
	 * 户口所在地区划，行政区划代码 

	 */
	private String rsdt_region_code;

	/**
	 * 所属派出所名称 

	 */
	private String police_dept_name;

	/**
	 * 所属派出所代码，GA380-2002 

	 */
	private String police_dept_code;

	/**
	 * 职业，出国人员身份代码 

	 */
	private String profession_code;

	/**
	 * 联系电话 

	 */
	private String contact_tel;

	/**
	 * 手机号码 

	 */
	private String mobile_no;

	/**
	 * 现持证件种类，申请时持有的证件种类代码 

	 */
	private String holding_cert_type;

	/**
	 * 现持证件号码，申请时持有的证件号码 

	 */
	private String holding_cert_no;

	/**
	 * 办证类别，办证类别代码 

	 */
	private String apply_type;

	/**
	 * 国家工作人员标识（0: 不是, 1: 是） 

	 */
	private String national_staff_flag;

	/**
	 * 前往国家地区，国家/地区代码 

	 */
	private String to_country_code;

	/**
	 * 出境事由，出境事由代码 

	 */
	private String exit_reason_code;

	/**
	 * 签发单位，签发机关编码 

	 */
	private String issuing_unit;

	/**
	 * 制证单位，行政区划代码 

	 */
	private String accred_unit;

	/**
	 * 签发日期，格式为YYYYMMDD 

	 */
	private String issuing_date;

	/**
	 * 证件有效期截止日期，VLD：Valid Till 

	 */
	private String cert_vld;

	/**
	 * 受理时间，格式为YYYYMMDDHH24MISS 

	 */
	private String accept_dt;

	/**
	 * 受理机关，行政区划代码 

	 */
	private String accept_dept;

	/**
	 * 备注 

	 */
	private String remakrs;

	/**
	 * 上报省份，省级代码 

	 */
	private String rpt_prov;

	/**
	 * 数据来源（1：内地公安机关， 2： 外交部，10：出入境记录，11：外国人常住信息，12：外国人暂住信息，13：违法违规人员，14：遣返遣送人员，15：外国人涉案信息，16：失效证，17：在逃人员，18：临时入境许可信息，19：船员变更信息，20：处理意见，21：重点关注人员，50：内地居民证件签发，51：内地居民签注签发，52：港澳居民通行证签发，53：台湾居民通行证签发，54：外国人签证签发，55：临时入境许可，56：船舶证件发放，57：自助通关，58：国家工作人人员，59：司机资料表，99：其他，101：船舶航次总表，102：车辆资料备案，103：API航班资料，104：出入境交通工具，105：违法违规交通工具） 

	 */
	private String data_src_flag;

	/**
	 * 异地标识，是否已发至各省0：非异地，1：异地 

	 */
	private String remote_flag;

	/**
	 * 失效标识，0: 有效, 1: 失效 

	 */
	private String invalid_flag;

	/**
	 * 分区列 

	 */
	private String pratition_col;

	/**
	 * 证件照片，引用路径 

	 */
	private String cert_photo_address;

	/**
	 * 加载时间戳 

	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 人员姓名
	 */
	private String pers_name;

	/**
	 * 人员姓名拼音
	 */
	private String pers_name_seh;

	/**
	 * 证件类型名称
	 */
	private String cert_type_na;

	/**
	 * 人员性别名称
	 */
	private String pers_gender_na;

	/**
	 * 出生地名称
	 */
	private String pers_birth_address_na;

	/**
	 * 国籍代码名称
	 */
	private String pers_country_na;

	/**
	 * 政治面貌名称
	 */
	private String political_sts_code_na;

	/**
	 * 文化程度名称
	 */
	private String education_code_na;

	/**
	 * 职级职称名称
	 */
	private String position_grade_code_na;

	/**
	 * 民族名称
	 */
	private String pers_nation_na;

	/**
	 * 户口所在地区名称
	 */
	private String rsdt_region_code_na;

	/**
	 * 所属派出所名称
	 */
	private String police_dept_code_na;

	/**
	 * 职业，出国人员身份说明
	 */
	private String profession_code_na;

	/**
	 * 现持证件种类名称
	 */
	private String holding_cert_type_na;

	/**
	 * 办证类别名称
	 */
	private String apply_type_na;

	/**
	 * 前往国家地区名称
	 */
	private String to_country_code_na;

	/**
	 * 出入境交通工具名称
	 */
	private String imm_reason_na;

	/**
	 * 签发机关名称
	 */
	private String issuing_unit_na;

	/**
	 * 制证单位名称
	 */
	private String accred_unit_na;

	/**
	 * 受理机关名称

	 */
	private String accept_dept_na;

	/**
	 * 上报省份名称
	 */
	private String rpt_prov_na;

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

	public  DcapFPerCertChnIssue(){super();}

	public  DcapFPerCertChnIssue(String cert_type,String cert_no,String pers_id,String pers_name_cn,String pers_name_uni,String pers_name_py,String pers_name_sec,String pers_gender,String pers_birth_date,String f_p_pers_id,String pers_birth_address,String pers_country,String pers_card_id,String political_sts_code,String education_code,String position_grade_code,String work_unit,String pers_nation,String curr_address,String rsdt_region_code,String police_dept_name,String police_dept_code,String profession_code,String contact_tel,String mobile_no,String holding_cert_type,String holding_cert_no,String apply_type,String national_staff_flag,String to_country_code,String exit_reason_code,String issuing_unit,String accred_unit,String issuing_date,String cert_vld,String accept_dt,String accept_dept,String remakrs,String rpt_prov,String data_src_flag,String remote_flag,String invalid_flag,String pratition_col,String cert_photo_address,String load_dt,String objectid,String pers_name,String pers_name_seh,String cert_type_na,String pers_gender_na,String pers_birth_address_na,String pers_country_na,String political_sts_code_na,String education_code_na,String position_grade_code_na,String pers_nation_na,String rsdt_region_code_na,String police_dept_code_na,String profession_code_na,String holding_cert_type_na,String apply_type_na,String to_country_code_na,String imm_reason_na,String issuing_unit_na,String accred_unit_na,String accept_dept_na,String rpt_prov_na,String filterflag,String revoke_flag,String pers_illegal_flag,String pers_repat_flag){
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.pers_id=pers_id;
		this.pers_name_cn=pers_name_cn;
		this.pers_name_uni=pers_name_uni;
		this.pers_name_py=pers_name_py;
		this.pers_name_sec=pers_name_sec;
		this.pers_gender=pers_gender;
		this.pers_birth_date=pers_birth_date;
		this.f_p_pers_id=f_p_pers_id;
		this.pers_birth_address=pers_birth_address;
		this.pers_country=pers_country;
		this.pers_card_id=pers_card_id;
		this.political_sts_code=political_sts_code;
		this.education_code=education_code;
		this.position_grade_code=position_grade_code;
		this.work_unit=work_unit;
		this.pers_nation=pers_nation;
		this.curr_address=curr_address;
		this.rsdt_region_code=rsdt_region_code;
		this.police_dept_name=police_dept_name;
		this.police_dept_code=police_dept_code;
		this.profession_code=profession_code;
		this.contact_tel=contact_tel;
		this.mobile_no=mobile_no;
		this.holding_cert_type=holding_cert_type;
		this.holding_cert_no=holding_cert_no;
		this.apply_type=apply_type;
		this.national_staff_flag=national_staff_flag;
		this.to_country_code=to_country_code;
		this.exit_reason_code=exit_reason_code;
		this.issuing_unit=issuing_unit;
		this.accred_unit=accred_unit;
		this.issuing_date=issuing_date;
		this.cert_vld=cert_vld;
		this.accept_dt=accept_dt;
		this.accept_dept=accept_dept;
		this.remakrs=remakrs;
		this.rpt_prov=rpt_prov;
		this.data_src_flag=data_src_flag;
		this.remote_flag=remote_flag;
		this.invalid_flag=invalid_flag;
		this.pratition_col=pratition_col;
		this.cert_photo_address=cert_photo_address;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_name=pers_name;
		this.pers_name_seh=pers_name_seh;
		this.cert_type_na=cert_type_na;
		this.pers_gender_na=pers_gender_na;
		this.pers_birth_address_na=pers_birth_address_na;
		this.pers_country_na=pers_country_na;
		this.political_sts_code_na=political_sts_code_na;
		this.education_code_na=education_code_na;
		this.position_grade_code_na=position_grade_code_na;
		this.pers_nation_na=pers_nation_na;
		this.rsdt_region_code_na=rsdt_region_code_na;
		this.police_dept_code_na=police_dept_code_na;
		this.profession_code_na=profession_code_na;
		this.holding_cert_type_na=holding_cert_type_na;
		this.apply_type_na=apply_type_na;
		this.to_country_code_na=to_country_code_na;
		this.imm_reason_na=imm_reason_na;
		this.issuing_unit_na=issuing_unit_na;
		this.accred_unit_na=accred_unit_na;
		this.accept_dept_na=accept_dept_na;
		this.rpt_prov_na=rpt_prov_na;
		this.filterflag=filterflag;
		this.revoke_flag=revoke_flag;
		this.pers_illegal_flag=pers_illegal_flag;
		this.pers_repat_flag=pers_repat_flag;
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

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getPers_name_cn() {
		return this.pers_name_cn;
	}

	public void setPers_name_cn(String pers_name_cn) {
		this.pers_name_cn = pers_name_cn;
	}

	public String getPers_name_uni() {
		return this.pers_name_uni;
	}

	public void setPers_name_uni(String pers_name_uni) {
		this.pers_name_uni = pers_name_uni;
	}

	public String getPers_name_py() {
		return this.pers_name_py;
	}

	public void setPers_name_py(String pers_name_py) {
		this.pers_name_py = pers_name_py;
	}

	public String getPers_name_sec() {
		return this.pers_name_sec;
	}

	public void setPers_name_sec(String pers_name_sec) {
		this.pers_name_sec = pers_name_sec;
	}

	public String getPers_gender() {
		return this.pers_gender;
	}

	public void setPers_gender(String pers_gender) {
		this.pers_gender = pers_gender;
	}

	public String getPers_birth_date() {
		return this.pers_birth_date;
	}

	public void setPers_birth_date(String pers_birth_date) {
		this.pers_birth_date = pers_birth_date;
	}

	public String getF_p_pers_id() {
		return this.f_p_pers_id;
	}

	public void setF_p_pers_id(String f_p_pers_id) {
		this.f_p_pers_id = f_p_pers_id;
	}

	public String getPers_birth_address() {
		return this.pers_birth_address;
	}

	public void setPers_birth_address(String pers_birth_address) {
		this.pers_birth_address = pers_birth_address;
	}

	public String getPers_country() {
		return this.pers_country;
	}

	public void setPers_country(String pers_country) {
		this.pers_country = pers_country;
	}

	public String getPers_card_id() {
		return this.pers_card_id;
	}

	public void setPers_card_id(String pers_card_id) {
		this.pers_card_id = pers_card_id;
	}

	public String getPolitical_sts_code() {
		return this.political_sts_code;
	}

	public void setPolitical_sts_code(String political_sts_code) {
		this.political_sts_code = political_sts_code;
	}

	public String getEducation_code() {
		return this.education_code;
	}

	public void setEducation_code(String education_code) {
		this.education_code = education_code;
	}

	public String getPosition_grade_code() {
		return this.position_grade_code;
	}

	public void setPosition_grade_code(String position_grade_code) {
		this.position_grade_code = position_grade_code;
	}

	public String getWork_unit() {
		return this.work_unit;
	}

	public void setWork_unit(String work_unit) {
		this.work_unit = work_unit;
	}

	public String getPers_nation() {
		return this.pers_nation;
	}

	public void setPers_nation(String pers_nation) {
		this.pers_nation = pers_nation;
	}

	public String getCurr_address() {
		return this.curr_address;
	}

	public void setCurr_address(String curr_address) {
		this.curr_address = curr_address;
	}

	public String getRsdt_region_code() {
		return this.rsdt_region_code;
	}

	public void setRsdt_region_code(String rsdt_region_code) {
		this.rsdt_region_code = rsdt_region_code;
	}

	public String getPolice_dept_name() {
		return this.police_dept_name;
	}

	public void setPolice_dept_name(String police_dept_name) {
		this.police_dept_name = police_dept_name;
	}

	public String getPolice_dept_code() {
		return this.police_dept_code;
	}

	public void setPolice_dept_code(String police_dept_code) {
		this.police_dept_code = police_dept_code;
	}

	public String getProfession_code() {
		return this.profession_code;
	}

	public void setProfession_code(String profession_code) {
		this.profession_code = profession_code;
	}

	public String getContact_tel() {
		return this.contact_tel;
	}

	public void setContact_tel(String contact_tel) {
		this.contact_tel = contact_tel;
	}

	public String getMobile_no() {
		return this.mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getHolding_cert_type() {
		return this.holding_cert_type;
	}

	public void setHolding_cert_type(String holding_cert_type) {
		this.holding_cert_type = holding_cert_type;
	}

	public String getHolding_cert_no() {
		return this.holding_cert_no;
	}

	public void setHolding_cert_no(String holding_cert_no) {
		this.holding_cert_no = holding_cert_no;
	}

	public String getApply_type() {
		return this.apply_type;
	}

	public void setApply_type(String apply_type) {
		this.apply_type = apply_type;
	}

	public String getNational_staff_flag() {
		return this.national_staff_flag;
	}

	public void setNational_staff_flag(String national_staff_flag) {
		this.national_staff_flag = national_staff_flag;
	}

	public String getTo_country_code() {
		return this.to_country_code;
	}

	public void setTo_country_code(String to_country_code) {
		this.to_country_code = to_country_code;
	}

	public String getExit_reason_code() {
		return this.exit_reason_code;
	}

	public void setExit_reason_code(String exit_reason_code) {
		this.exit_reason_code = exit_reason_code;
	}

	public String getIssuing_unit() {
		return this.issuing_unit;
	}

	public void setIssuing_unit(String issuing_unit) {
		this.issuing_unit = issuing_unit;
	}

	public String getAccred_unit() {
		return this.accred_unit;
	}

	public void setAccred_unit(String accred_unit) {
		this.accred_unit = accred_unit;
	}

	public String getIssuing_date() {
		return this.issuing_date;
	}

	public void setIssuing_date(String issuing_date) {
		this.issuing_date = issuing_date;
	}

	public String getCert_vld() {
		return this.cert_vld;
	}

	public void setCert_vld(String cert_vld) {
		this.cert_vld = cert_vld;
	}

	public String getAccept_dt() {
		return this.accept_dt;
	}

	public void setAccept_dt(String accept_dt) {
		this.accept_dt = accept_dt;
	}

	public String getAccept_dept() {
		return this.accept_dept;
	}

	public void setAccept_dept(String accept_dept) {
		this.accept_dept = accept_dept;
	}

	public String getRemakrs() {
		return this.remakrs;
	}

	public void setRemakrs(String remakrs) {
		this.remakrs = remakrs;
	}

	public String getRpt_prov() {
		return this.rpt_prov;
	}

	public void setRpt_prov(String rpt_prov) {
		this.rpt_prov = rpt_prov;
	}

	public String getData_src_flag() {
		return this.data_src_flag;
	}

	public void setData_src_flag(String data_src_flag) {
		this.data_src_flag = data_src_flag;
	}

	public String getRemote_flag() {
		return this.remote_flag;
	}

	public void setRemote_flag(String remote_flag) {
		this.remote_flag = remote_flag;
	}

	public String getInvalid_flag() {
		return this.invalid_flag;
	}

	public void setInvalid_flag(String invalid_flag) {
		this.invalid_flag = invalid_flag;
	}

	public String getPratition_col() {
		return this.pratition_col;
	}

	public void setPratition_col(String pratition_col) {
		this.pratition_col = pratition_col;
	}

	public String getCert_photo_address() {
		return this.cert_photo_address;
	}

	public void setCert_photo_address(String cert_photo_address) {
		this.cert_photo_address = cert_photo_address;
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

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getPers_gender_na() {
		return this.pers_gender_na;
	}

	public void setPers_gender_na(String pers_gender_na) {
		this.pers_gender_na = pers_gender_na;
	}

	public String getPers_birth_address_na() {
		return this.pers_birth_address_na;
	}

	public void setPers_birth_address_na(String pers_birth_address_na) {
		this.pers_birth_address_na = pers_birth_address_na;
	}

	public String getPers_country_na() {
		return this.pers_country_na;
	}

	public void setPers_country_na(String pers_country_na) {
		this.pers_country_na = pers_country_na;
	}

	public String getPolitical_sts_code_na() {
		return this.political_sts_code_na;
	}

	public void setPolitical_sts_code_na(String political_sts_code_na) {
		this.political_sts_code_na = political_sts_code_na;
	}

	public String getEducation_code_na() {
		return this.education_code_na;
	}

	public void setEducation_code_na(String education_code_na) {
		this.education_code_na = education_code_na;
	}

	public String getPosition_grade_code_na() {
		return this.position_grade_code_na;
	}

	public void setPosition_grade_code_na(String position_grade_code_na) {
		this.position_grade_code_na = position_grade_code_na;
	}

	public String getPers_nation_na() {
		return this.pers_nation_na;
	}

	public void setPers_nation_na(String pers_nation_na) {
		this.pers_nation_na = pers_nation_na;
	}

	public String getRsdt_region_code_na() {
		return this.rsdt_region_code_na;
	}

	public void setRsdt_region_code_na(String rsdt_region_code_na) {
		this.rsdt_region_code_na = rsdt_region_code_na;
	}

	public String getPolice_dept_code_na() {
		return this.police_dept_code_na;
	}

	public void setPolice_dept_code_na(String police_dept_code_na) {
		this.police_dept_code_na = police_dept_code_na;
	}

	public String getProfession_code_na() {
		return this.profession_code_na;
	}

	public void setProfession_code_na(String profession_code_na) {
		this.profession_code_na = profession_code_na;
	}

	public String getHolding_cert_type_na() {
		return this.holding_cert_type_na;
	}

	public void setHolding_cert_type_na(String holding_cert_type_na) {
		this.holding_cert_type_na = holding_cert_type_na;
	}

	public String getApply_type_na() {
		return this.apply_type_na;
	}

	public void setApply_type_na(String apply_type_na) {
		this.apply_type_na = apply_type_na;
	}

	public String getTo_country_code_na() {
		return this.to_country_code_na;
	}

	public void setTo_country_code_na(String to_country_code_na) {
		this.to_country_code_na = to_country_code_na;
	}

	public String getImm_reason_na() {
		return this.imm_reason_na;
	}

	public void setImm_reason_na(String imm_reason_na) {
		this.imm_reason_na = imm_reason_na;
	}

	public String getIssuing_unit_na() {
		return this.issuing_unit_na;
	}

	public void setIssuing_unit_na(String issuing_unit_na) {
		this.issuing_unit_na = issuing_unit_na;
	}

	public String getAccred_unit_na() {
		return this.accred_unit_na;
	}

	public void setAccred_unit_na(String accred_unit_na) {
		this.accred_unit_na = accred_unit_na;
	}

	public String getAccept_dept_na() {
		return this.accept_dept_na;
	}

	public void setAccept_dept_na(String accept_dept_na) {
		this.accept_dept_na = accept_dept_na;
	}

	public String getRpt_prov_na() {
		return this.rpt_prov_na;
	}

	public void setRpt_prov_na(String rpt_prov_na) {
		this.rpt_prov_na = rpt_prov_na;
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
