package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 出入境人员信息 dcap_f_per_act_psr_imm
 *
 * <p>Date: Thu Sep 27 11:38:20 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerActPsrImm  implements Serializable {


	private static final long serialVersionUID =  6634353963928664188L;


	/**
	 * 唯一标识（口岸代码 +通道号+出入日期+出入时间+3位流水号） 

	 */
	private String imm_id;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 

	 */
	private String pers_id;

	/**
	 * 人员出入境类别 

	 */
	private String pers_imm_type;

	/**
	 * 中文姓名或英文姓名 

	 */
	private String pers_name;

	/**
	 * 性别代码 

	 */
	private String pers_gender;

	/**
	 * 出生日期 

	 */
	private String birth_date;

	/**
	 * 证件签发国家地区代码 

	 */
	private String cert_country_code;

	/**
	 * 证件种类 

	 */
	private String cert_type;

	/**
	 * 证件号码 

	 */
	private String cert_no;

	/**
	 * 签证（注）种类 

	 */
	private String visas_type;

	/**
	 * 签证（注）号码 

	 */
	private String visas_no;

	/**
	 * 停留期 

	 */
	private String entry_period;

	/**
	 * 民族代码 

	 */
	private String nation_code;

	/**
	 * 出入标志，1入境，2出境，3出入境 

	 */
	private String in_out_flag;

	/**
	 * 出入境日期 

	 */
	private String imm_date;

	/**
	 * 出入境时间 

	 */
	private String imm_time;

	/**
	 * 出入境日期时间 

	 */
	private String imm_dt;

	/**
	 * 出入境口岸代码 

	 */
	private String imm_port_code;

	/**
	 * 交通方式代码 

	 */
	private String trs_mode;

	/**
	 * 交通工具标识 

	 */
	private String trs_id;

	/**
	 * 国家地区代码(前往) 

	 */
	private String to_country_code;

	/**
	 * 发证地行政区划代码 

	 */
	private String cert_region_code;

	/**
	 * 出入境事由代码 

	 */
	private String imm_rsn_code;

	/**
	 * 检查员号码（查获人） 

	 */
	private String inspector;

	/**
	 * 通道号 

	 */
	private String channel_no;

	/**
	 * 部门代码 

	 */
	private String dept_code;

	/**
	 * 自定义代码 

	 */
	private String user_define_code;

	/**
	 * 自助通道标记（1：自助通道验放，0：非自助通道验放） 


	 */
	private String self_channel_flag;

	/**
	 * 后台补录标记 后台补录标记（0：非后台补录，1：后台补录） 


	 */
	private String back_flag;

	/**
	 * 内部团号（1位团体类型+5位组团单位+10位日期时间+4位通道号+1位标识位） 

	 */
	private String nin_grp_no;

	/**
	 * 旅行团号 

	 */
	private String tour_grp_no;

	/**
	 * 变更操作员（记录疑难字处理人） 

	 */
	private String chg_oper;

	/**
	 * 变更时间 

	 */
	private String chg_dt;

	/**
	 * 超长姓名备注 

	 */
	private String long_name_desc;

	/**
	 * 疑难字说明 

	 */
	private String complex_desc;

	/**
	 * 第二证件号码 

	 */
	private String sec_cert_no;

	/**
	 * 第二证件类型代码 

	 */
	private String sec_cert_type;

	/**
	 * 第二出生日期 

	 */
	private String sec_birth_date;

	/**
	 * 第二姓名 

	 */
	private String second_pers_name;

	/**
	 * 存放中文的拼音或英文名 

	 */
	private String pers_eng_name;

	/**
	 * 姓名简体 

	 */
	private String name_in_simple;

	/**
	 * 日 

	 */
	private String imm_day;

	/**
	 * 出入境人员证件照片 

	 */
	private String cert_photo;

	/**
	 * 出入境人员采集照片 

	 */
	private String scene_photo;

	/**
	 * 出入境人员证件资料页 

	 */
	private String cert_page_scan;

	/**
	 * 出入境人员年龄 

	 */
	private String pers_imm_age;

	/**
	 * 航线代码 

	 */
	private String airway_code;

	/**
	 * 发证民族代码 

	 */
	private String cert_nation_code;

	/**
	 * 户口所在地区划，行政区划代码 

	 */
	private String rsdt_region_code;

	/**
	 * 证件签发单位 
	 ISSUING_UNIT

	 */
	private String issuing_unit;

	/**
	 * 加载时间戳 

	 */
	private String load_dt;

	/**
	 * 表名+persid
	 */
	private String objectid;

	/**
	 * 人员出入境类别名称
	 */
	private String pers_imm_type_na;

	/**
	 * 人员姓名拼音
	 */
	private String pers_name_seh;

	/**
	 * 人员性别名称
	 */
	private String pers_gender_na;

	/**
	 * 证件签发国家
	 */
	private String cert_country;

	/**
	 * 证件类型名称
	 */
	private String cert_type_na;

	/**
	 * 签证类型名称
	 */
	private String visas_type_na;

	/**
	 * 民族名称
	 */
	private String nation_code_na;

	/**
	 * 出入境口岸
	 */
	private String imm_port;

	/**
	 * 交通方式名称
	 */
	private String trs_mode_na;

	/**
	 * 前往国家地区
	 */
	private String to_country;

	/**
	 * 发证城市
	 */
	private String cert_region;

	/**
	 * 出入境理由
	 */
	private String imm_rsn_code_na;

	/**
	 * 检查员姓名
	 */
	private String inspector_name;

	/**
	 * 部门名称
	 */
	private String dept_name;

	/**
	 * 自定义代码
	 */
	private String user_define_code_na;

	/**
	 * 变更操作员姓名
	 */
	private String chg_operator_name;

	/**
	 * 第二证件类型名称
	 */
	private String sec_cert_type_na;

	/**
	 * 员工标记
	 */
	private String employee_flag;

	/**
	 * 通行证版本号
	 */
	private String passport_version;

	/**
	 * 违法违规标记
	 */
	private String pers_illegal_flag;

	/**
	 * 航线代码名称
	 */
	private String airway_code_na;

	/**
	 * 发证民族代码名称
	 */
	private String cert_nation_code_na;

	/**
	 * 户口所在地区划名称
	 */
	private String rsdt_region_code_na;

	/**
	 * 签发机关名称
	 */
	private String issuing_unit_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFPerActPsrImm(){super();}

	public  DcapFPerActPsrImm(String imm_id,String pers_id,String pers_imm_type,String pers_name,String pers_gender,String birth_date,String cert_country_code,String cert_type,String cert_no,String visas_type,String visas_no,String entry_period,String nation_code,String in_out_flag,String imm_date,String imm_time,String imm_dt,String imm_port_code,String trs_mode,String trs_id,String to_country_code,String cert_region_code,String imm_rsn_code,String inspector,String channel_no,String dept_code,String user_define_code,String self_channel_flag,String back_flag,String nin_grp_no,String tour_grp_no,String chg_oper,String chg_dt,String long_name_desc,String complex_desc,String sec_cert_no,String sec_cert_type,String sec_birth_date,String second_pers_name,String pers_eng_name,String name_in_simple,String imm_day,String cert_photo,String scene_photo,String cert_page_scan,String pers_imm_age,String airway_code,String cert_nation_code,String rsdt_region_code,String issuing_unit,String load_dt,String objectid,String pers_imm_type_na,String pers_name_seh,String pers_gender_na,String cert_country,String cert_type_na,String visas_type_na,String nation_code_na,String imm_port,String trs_mode_na,String to_country,String cert_region,String imm_rsn_code_na,String inspector_name,String dept_name,String user_define_code_na,String chg_operator_name,String sec_cert_type_na,String employee_flag,String passport_version,String pers_illegal_flag,String airway_code_na,String cert_nation_code_na,String rsdt_region_code_na,String issuing_unit_na,String filterflag){
		this.imm_id=imm_id;
		this.pers_id=pers_id;
		this.pers_imm_type=pers_imm_type;
		this.pers_name=pers_name;
		this.pers_gender=pers_gender;
		this.birth_date=birth_date;
		this.cert_country_code=cert_country_code;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.visas_type=visas_type;
		this.visas_no=visas_no;
		this.entry_period=entry_period;
		this.nation_code=nation_code;
		this.in_out_flag=in_out_flag;
		this.imm_date=imm_date;
		this.imm_time=imm_time;
		this.imm_dt=imm_dt;
		this.imm_port_code=imm_port_code;
		this.trs_mode=trs_mode;
		this.trs_id=trs_id;
		this.to_country_code=to_country_code;
		this.cert_region_code=cert_region_code;
		this.imm_rsn_code=imm_rsn_code;
		this.inspector=inspector;
		this.channel_no=channel_no;
		this.dept_code=dept_code;
		this.user_define_code=user_define_code;
		this.self_channel_flag=self_channel_flag;
		this.back_flag=back_flag;
		this.nin_grp_no=nin_grp_no;
		this.tour_grp_no=tour_grp_no;
		this.chg_oper=chg_oper;
		this.chg_dt=chg_dt;
		this.long_name_desc=long_name_desc;
		this.complex_desc=complex_desc;
		this.sec_cert_no=sec_cert_no;
		this.sec_cert_type=sec_cert_type;
		this.sec_birth_date=sec_birth_date;
		this.second_pers_name=second_pers_name;
		this.pers_eng_name=pers_eng_name;
		this.name_in_simple=name_in_simple;
		this.imm_day=imm_day;
		this.cert_photo=cert_photo;
		this.scene_photo=scene_photo;
		this.cert_page_scan=cert_page_scan;
		this.pers_imm_age=pers_imm_age;
		this.airway_code=airway_code;
		this.cert_nation_code=cert_nation_code;
		this.rsdt_region_code=rsdt_region_code;
		this.issuing_unit=issuing_unit;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_imm_type_na=pers_imm_type_na;
		this.pers_name_seh=pers_name_seh;
		this.pers_gender_na=pers_gender_na;
		this.cert_country=cert_country;
		this.cert_type_na=cert_type_na;
		this.visas_type_na=visas_type_na;
		this.nation_code_na=nation_code_na;
		this.imm_port=imm_port;
		this.trs_mode_na=trs_mode_na;
		this.to_country=to_country;
		this.cert_region=cert_region;
		this.imm_rsn_code_na=imm_rsn_code_na;
		this.inspector_name=inspector_name;
		this.dept_name=dept_name;
		this.user_define_code_na=user_define_code_na;
		this.chg_operator_name=chg_operator_name;
		this.sec_cert_type_na=sec_cert_type_na;
		this.employee_flag=employee_flag;
		this.passport_version=passport_version;
		this.pers_illegal_flag=pers_illegal_flag;
		this.airway_code_na=airway_code_na;
		this.cert_nation_code_na=cert_nation_code_na;
		this.rsdt_region_code_na=rsdt_region_code_na;
		this.issuing_unit_na=issuing_unit_na;
		this.filterflag=filterflag;
	}

	public String getImm_id() {
		return this.imm_id;
	}

	public void setImm_id(String imm_id) {
		this.imm_id = imm_id;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getPers_imm_type() {
		return this.pers_imm_type;
	}

	public void setPers_imm_type(String pers_imm_type) {
		this.pers_imm_type = pers_imm_type;
	}

	public String getPers_name() {
		return this.pers_name;
	}

	public void setPers_name(String pers_name) {
		this.pers_name = pers_name;
	}

	public String getPers_gender() {
		return this.pers_gender;
	}

	public void setPers_gender(String pers_gender) {
		this.pers_gender = pers_gender;
	}

	public String getBirth_date() {
		return this.birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getCert_country_code() {
		return this.cert_country_code;
	}

	public void setCert_country_code(String cert_country_code) {
		this.cert_country_code = cert_country_code;
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

	public String getVisas_type() {
		return this.visas_type;
	}

	public void setVisas_type(String visas_type) {
		this.visas_type = visas_type;
	}

	public String getVisas_no() {
		return this.visas_no;
	}

	public void setVisas_no(String visas_no) {
		this.visas_no = visas_no;
	}

	public String getEntry_period() {
		return this.entry_period;
	}

	public void setEntry_period(String entry_period) {
		this.entry_period = entry_period;
	}

	public String getNation_code() {
		return this.nation_code;
	}

	public void setNation_code(String nation_code) {
		this.nation_code = nation_code;
	}

	public String getIn_out_flag() {
		return this.in_out_flag;
	}

	public void setIn_out_flag(String in_out_flag) {
		this.in_out_flag = in_out_flag;
	}

	public String getImm_date() {
		return this.imm_date;
	}

	public void setImm_date(String imm_date) {
		this.imm_date = imm_date;
	}

	public String getImm_time() {
		return this.imm_time;
	}

	public void setImm_time(String imm_time) {
		this.imm_time = imm_time;
	}

	public String getImm_dt() {
		return this.imm_dt;
	}

	public void setImm_dt(String imm_dt) {
		this.imm_dt = imm_dt;
	}

	public String getImm_port_code() {
		return this.imm_port_code;
	}

	public void setImm_port_code(String imm_port_code) {
		this.imm_port_code = imm_port_code;
	}

	public String getTrs_mode() {
		return this.trs_mode;
	}

	public void setTrs_mode(String trs_mode) {
		this.trs_mode = trs_mode;
	}

	public String getTrs_id() {
		return this.trs_id;
	}

	public void setTrs_id(String trs_id) {
		this.trs_id = trs_id;
	}

	public String getTo_country_code() {
		return this.to_country_code;
	}

	public void setTo_country_code(String to_country_code) {
		this.to_country_code = to_country_code;
	}

	public String getCert_region_code() {
		return this.cert_region_code;
	}

	public void setCert_region_code(String cert_region_code) {
		this.cert_region_code = cert_region_code;
	}

	public String getImm_rsn_code() {
		return this.imm_rsn_code;
	}

	public void setImm_rsn_code(String imm_rsn_code) {
		this.imm_rsn_code = imm_rsn_code;
	}

	public String getInspector() {
		return this.inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public String getChannel_no() {
		return this.channel_no;
	}

	public void setChannel_no(String channel_no) {
		this.channel_no = channel_no;
	}

	public String getDept_code() {
		return this.dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getUser_define_code() {
		return this.user_define_code;
	}

	public void setUser_define_code(String user_define_code) {
		this.user_define_code = user_define_code;
	}

	public String getSelf_channel_flag() {
		return this.self_channel_flag;
	}

	public void setSelf_channel_flag(String self_channel_flag) {
		this.self_channel_flag = self_channel_flag;
	}

	public String getBack_flag() {
		return this.back_flag;
	}

	public void setBack_flag(String back_flag) {
		this.back_flag = back_flag;
	}

	public String getNin_grp_no() {
		return this.nin_grp_no;
	}

	public void setNin_grp_no(String nin_grp_no) {
		this.nin_grp_no = nin_grp_no;
	}

	public String getTour_grp_no() {
		return this.tour_grp_no;
	}

	public void setTour_grp_no(String tour_grp_no) {
		this.tour_grp_no = tour_grp_no;
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

	public String getLong_name_desc() {
		return this.long_name_desc;
	}

	public void setLong_name_desc(String long_name_desc) {
		this.long_name_desc = long_name_desc;
	}

	public String getComplex_desc() {
		return this.complex_desc;
	}

	public void setComplex_desc(String complex_desc) {
		this.complex_desc = complex_desc;
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

	public String getSec_birth_date() {
		return this.sec_birth_date;
	}

	public void setSec_birth_date(String sec_birth_date) {
		this.sec_birth_date = sec_birth_date;
	}

	public String getSecond_pers_name() {
		return this.second_pers_name;
	}

	public void setSecond_pers_name(String second_pers_name) {
		this.second_pers_name = second_pers_name;
	}

	public String getPers_eng_name() {
		return this.pers_eng_name;
	}

	public void setPers_eng_name(String pers_eng_name) {
		this.pers_eng_name = pers_eng_name;
	}

	public String getName_in_simple() {
		return this.name_in_simple;
	}

	public void setName_in_simple(String name_in_simple) {
		this.name_in_simple = name_in_simple;
	}

	public String getImm_day() {
		return this.imm_day;
	}

	public void setImm_day(String imm_day) {
		this.imm_day = imm_day;
	}

	public String getCert_photo() {
		return this.cert_photo;
	}

	public void setCert_photo(String cert_photo) {
		this.cert_photo = cert_photo;
	}

	public String getScene_photo() {
		return this.scene_photo;
	}

	public void setScene_photo(String scene_photo) {
		this.scene_photo = scene_photo;
	}

	public String getCert_page_scan() {
		return this.cert_page_scan;
	}

	public void setCert_page_scan(String cert_page_scan) {
		this.cert_page_scan = cert_page_scan;
	}

	public String getPers_imm_age() {
		return this.pers_imm_age;
	}

	public void setPers_imm_age(String pers_imm_age) {
		this.pers_imm_age = pers_imm_age;
	}

	public String getAirway_code() {
		return this.airway_code;
	}

	public void setAirway_code(String airway_code) {
		this.airway_code = airway_code;
	}

	public String getCert_nation_code() {
		return this.cert_nation_code;
	}

	public void setCert_nation_code(String cert_nation_code) {
		this.cert_nation_code = cert_nation_code;
	}

	public String getRsdt_region_code() {
		return this.rsdt_region_code;
	}

	public void setRsdt_region_code(String rsdt_region_code) {
		this.rsdt_region_code = rsdt_region_code;
	}

	public String getIssuing_unit() {
		return this.issuing_unit;
	}

	public void setIssuing_unit(String issuing_unit) {
		this.issuing_unit = issuing_unit;
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

	public String getPers_imm_type_na() {
		return this.pers_imm_type_na;
	}

	public void setPers_imm_type_na(String pers_imm_type_na) {
		this.pers_imm_type_na = pers_imm_type_na;
	}

	public String getPers_name_seh() {
		return this.pers_name_seh;
	}

	public void setPers_name_seh(String pers_name_seh) {
		this.pers_name_seh = pers_name_seh;
	}

	public String getPers_gender_na() {
		return this.pers_gender_na;
	}

	public void setPers_gender_na(String pers_gender_na) {
		this.pers_gender_na = pers_gender_na;
	}

	public String getCert_country() {
		return this.cert_country;
	}

	public void setCert_country(String cert_country) {
		this.cert_country = cert_country;
	}

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getVisas_type_na() {
		return this.visas_type_na;
	}

	public void setVisas_type_na(String visas_type_na) {
		this.visas_type_na = visas_type_na;
	}

	public String getNation_code_na() {
		return this.nation_code_na;
	}

	public void setNation_code_na(String nation_code_na) {
		this.nation_code_na = nation_code_na;
	}

	public String getImm_port() {
		return this.imm_port;
	}

	public void setImm_port(String imm_port) {
		this.imm_port = imm_port;
	}

	public String getTrs_mode_na() {
		return this.trs_mode_na;
	}

	public void setTrs_mode_na(String trs_mode_na) {
		this.trs_mode_na = trs_mode_na;
	}

	public String getTo_country() {
		return this.to_country;
	}

	public void setTo_country(String to_country) {
		this.to_country = to_country;
	}

	public String getCert_region() {
		return this.cert_region;
	}

	public void setCert_region(String cert_region) {
		this.cert_region = cert_region;
	}

	public String getImm_rsn_code_na() {
		return this.imm_rsn_code_na;
	}

	public void setImm_rsn_code_na(String imm_rsn_code_na) {
		this.imm_rsn_code_na = imm_rsn_code_na;
	}

	public String getInspector_name() {
		return this.inspector_name;
	}

	public void setInspector_name(String inspector_name) {
		this.inspector_name = inspector_name;
	}

	public String getDept_name() {
		return this.dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getUser_define_code_na() {
		return this.user_define_code_na;
	}

	public void setUser_define_code_na(String user_define_code_na) {
		this.user_define_code_na = user_define_code_na;
	}

	public String getChg_operator_name() {
		return this.chg_operator_name;
	}

	public void setChg_operator_name(String chg_operator_name) {
		this.chg_operator_name = chg_operator_name;
	}

	public String getSec_cert_type_na() {
		return this.sec_cert_type_na;
	}

	public void setSec_cert_type_na(String sec_cert_type_na) {
		this.sec_cert_type_na = sec_cert_type_na;
	}

	public String getEmployee_flag() {
		return this.employee_flag;
	}

	public void setEmployee_flag(String employee_flag) {
		this.employee_flag = employee_flag;
	}

	public String getPassport_version() {
		return this.passport_version;
	}

	public void setPassport_version(String passport_version) {
		this.passport_version = passport_version;
	}

	public String getPers_illegal_flag() {
		return this.pers_illegal_flag;
	}

	public void setPers_illegal_flag(String pers_illegal_flag) {
		this.pers_illegal_flag = pers_illegal_flag;
	}

	public String getAirway_code_na() {
		return this.airway_code_na;
	}

	public void setAirway_code_na(String airway_code_na) {
		this.airway_code_na = airway_code_na;
	}

	public String getCert_nation_code_na() {
		return this.cert_nation_code_na;
	}

	public void setCert_nation_code_na(String cert_nation_code_na) {
		this.cert_nation_code_na = cert_nation_code_na;
	}

	public String getRsdt_region_code_na() {
		return this.rsdt_region_code_na;
	}

	public void setRsdt_region_code_na(String rsdt_region_code_na) {
		this.rsdt_region_code_na = rsdt_region_code_na;
	}

	public String getIssuing_unit_na() {
		return this.issuing_unit_na;
	}

	public void setIssuing_unit_na(String issuing_unit_na) {
		this.issuing_unit_na = issuing_unit_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
