package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 人员基本信息 dcap_f_per_basic_info
 *
 * <p>Date: Thu Sep 27 11:38:25 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerBasicInfo  implements Serializable {


	private static final long serialVersionUID =  5715813625614956286L;


	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 


	 */
	private String pers_id;

	/**
	 * 证件号码 

	 */
	private String cert_no;

	/**
	 * 证件种类 

	 */
	private String cert_type;

	/**
	 * 签注种类 

	 */
	private String endr_type;

	/**
	 * 签注号码 

	 */
	private String endr_no;

	/**
	 * 国家地区代码
	 */
	private String country_code;

	/**
	 * 通行证号，台湾通行证号码前8位，港澳通行证前9位
	 */
	private String passport_no;

	/**
	 * 通行证版本号
	 */
	private String passport_version;

	/**
	 * 人员中文姓名 

	 */
	private String pers_name_cn;

	/**
	 * 人员英文姓名 

	 */
	private String pers_name_en;

	/**
	 * 人员中文姓名拼音 

	 */
	private String pers_name_py;

	/**
	 * 人员中文繁体姓名 

	 */
	private String pers_name_tc;

	/**
	 * 人员姓名疑难字说明 

	 */
	private String pers_name_ad;

	/**
	 * 人员核查姓名 

	 */
	private String pers_name_verf;

	/**
	 * 第二姓名及曾用名 

	 */
	private String pers_name_sec;

	/**
	 * 第二出生日期 

	 */
	private String pers_birth_sec;

	/**
	 * 国籍代码 

	 */
	private String pers_country;

	/**
	 * 性别代码 

	 */
	private String pers_gender;

	/**
	 * 出生日期 

	 */
	private String pers_birth_date;

	/**
	 * 出生地，国家地区代码或2位省级地区代码、台湾地区代码 

	 */
	private String pers_birth_place;

	/**
	 * 现住址 

	 */
	private String pers_curr_address;

	/**
	 * 户口所在地区划，行政区划代码 

	 */
	private String rsdt_region_code;

	/**
	 * 电话号码 

	 */
	private String pers_telno;

	/**
	 * 民族代码 

	 */
	private String pers_nation;

	/**
	 * 人员唯一身份证号 

	 */
	private String pers_card_id;

	/**
	 * 人员状态，人员境内境外 

	 */
	private String pers_state;

	/**
	 * 国家工作人员标识（0: 不是, 1: 是） 

	 */
	private String national_staff_flag;

	/**
	 * 在逃人员标记 

	 */
	private String pers_fugitive_flag;

	/**
	 * 重点人员标记
	 */
	private String pers_special_flag;

	/**
	 * 违法违规标记 

	 */
	private String pers_illegal_flag;

	/**
	 * 遣返遣送标记 

	 */
	private String pers_repat_flag;

	/**
	 * 数据来源（1：内地公安机关， 2： 外交部，10：出入境记录，11：外国人常住信息，12：外国人暂住信息，13：违法违规人员，14：遣返遣送人员，15：外国人涉案信息，16：失效证，17：在逃人员，18：临时入境许可信息，19：船员变更信息，20：处理意见，21：重点关注人员，50：内地居民证件签发，51：内地居民签注签发，52：港澳居民通行证签发，53：台湾居民通行证签发，54：外国人签证签发，55：临时入境许可，56：船舶证件发放，57：自助通关，58：国家工作人人员，59：司机资料表，99：其他，101：船舶航次总表，102：车辆资料备案，103：API航班资料，104：出入境交通工具，105：违法违规交通工具） 

	 */
	private String data_src_flag;

	/**
	 * 加载时间戳 

	 */
	private String load_dt;

	/**
	 * 表名+-persid

	 */
	private String objectid;

	/**
	 * 人员姓名
	 */
	private String pers_name;

	/**
	 * 人员姓名SEH
	 */
	private String pers_name_seh;

	/**
	 * 国籍代码code
	 */
	private String pers_country_code;

	/**
	 * 性别代码code
	 */
	private String pers_gender_code;

	/**
	 * 性别代码code_na
	 */
	private String pers_gender_code_na;

	/**
	 * 出生地，国家地区代码或2位省级地区代码、台湾地区代码NA
	 */
	private String pers_birth_place_na;

	/**
	 *
	 户口所在地区划
	 */
	private String rsdt_region;

	/**
	 * 民族代码
	 */
	private String pers_nation_code;

	/**
	 * 人员状态，人员境内境外
	 */
	private String pers_state_code;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFPerBasicInfo(){super();}

	public  DcapFPerBasicInfo(String pers_id,String cert_no,String cert_type,String endr_type,String endr_no,String country_code,String passport_no,String passport_version,String pers_name_cn,String pers_name_en,String pers_name_py,String pers_name_tc,String pers_name_ad,String pers_name_verf,String pers_name_sec,String pers_birth_sec,String pers_country,String pers_gender,String pers_birth_date,String pers_birth_place,String pers_curr_address,String rsdt_region_code,String pers_telno,String pers_nation,String pers_card_id,String pers_state,String national_staff_flag,String pers_fugitive_flag,String pers_special_flag,String pers_illegal_flag,String pers_repat_flag,String data_src_flag,String load_dt,String objectid,String pers_name,String pers_name_seh,String pers_country_code,String pers_gender_code,String pers_gender_code_na,String pers_birth_place_na,String rsdt_region,String pers_nation_code,String pers_state_code,String filterflag){
		this.pers_id=pers_id;
		this.cert_no=cert_no;
		this.cert_type=cert_type;
		this.endr_type=endr_type;
		this.endr_no=endr_no;
		this.country_code=country_code;
		this.passport_no=passport_no;
		this.passport_version=passport_version;
		this.pers_name_cn=pers_name_cn;
		this.pers_name_en=pers_name_en;
		this.pers_name_py=pers_name_py;
		this.pers_name_tc=pers_name_tc;
		this.pers_name_ad=pers_name_ad;
		this.pers_name_verf=pers_name_verf;
		this.pers_name_sec=pers_name_sec;
		this.pers_birth_sec=pers_birth_sec;
		this.pers_country=pers_country;
		this.pers_gender=pers_gender;
		this.pers_birth_date=pers_birth_date;
		this.pers_birth_place=pers_birth_place;
		this.pers_curr_address=pers_curr_address;
		this.rsdt_region_code=rsdt_region_code;
		this.pers_telno=pers_telno;
		this.pers_nation=pers_nation;
		this.pers_card_id=pers_card_id;
		this.pers_state=pers_state;
		this.national_staff_flag=national_staff_flag;
		this.pers_fugitive_flag=pers_fugitive_flag;
		this.pers_special_flag=pers_special_flag;
		this.pers_illegal_flag=pers_illegal_flag;
		this.pers_repat_flag=pers_repat_flag;
		this.data_src_flag=data_src_flag;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_name=pers_name;
		this.pers_name_seh=pers_name_seh;
		this.pers_country_code=pers_country_code;
		this.pers_gender_code=pers_gender_code;
		this.pers_gender_code_na=pers_gender_code_na;
		this.pers_birth_place_na=pers_birth_place_na;
		this.rsdt_region=rsdt_region;
		this.pers_nation_code=pers_nation_code;
		this.pers_state_code=pers_state_code;
		this.filterflag=filterflag;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getCert_no() {
		return this.cert_no;
	}

	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
	}

	public String getCert_type() {
		return this.cert_type;
	}

	public void setCert_type(String cert_type) {
		this.cert_type = cert_type;
	}

	public String getEndr_type() {
		return this.endr_type;
	}

	public void setEndr_type(String endr_type) {
		this.endr_type = endr_type;
	}

	public String getEndr_no() {
		return this.endr_no;
	}

	public void setEndr_no(String endr_no) {
		this.endr_no = endr_no;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getPassport_no() {
		return this.passport_no;
	}

	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}

	public String getPassport_version() {
		return this.passport_version;
	}

	public void setPassport_version(String passport_version) {
		this.passport_version = passport_version;
	}

	public String getPers_name_cn() {
		return this.pers_name_cn;
	}

	public void setPers_name_cn(String pers_name_cn) {
		this.pers_name_cn = pers_name_cn;
	}

	public String getPers_name_en() {
		return this.pers_name_en;
	}

	public void setPers_name_en(String pers_name_en) {
		this.pers_name_en = pers_name_en;
	}

	public String getPers_name_py() {
		return this.pers_name_py;
	}

	public void setPers_name_py(String pers_name_py) {
		this.pers_name_py = pers_name_py;
	}

	public String getPers_name_tc() {
		return this.pers_name_tc;
	}

	public void setPers_name_tc(String pers_name_tc) {
		this.pers_name_tc = pers_name_tc;
	}

	public String getPers_name_ad() {
		return this.pers_name_ad;
	}

	public void setPers_name_ad(String pers_name_ad) {
		this.pers_name_ad = pers_name_ad;
	}

	public String getPers_name_verf() {
		return this.pers_name_verf;
	}

	public void setPers_name_verf(String pers_name_verf) {
		this.pers_name_verf = pers_name_verf;
	}

	public String getPers_name_sec() {
		return this.pers_name_sec;
	}

	public void setPers_name_sec(String pers_name_sec) {
		this.pers_name_sec = pers_name_sec;
	}

	public String getPers_birth_sec() {
		return this.pers_birth_sec;
	}

	public void setPers_birth_sec(String pers_birth_sec) {
		this.pers_birth_sec = pers_birth_sec;
	}

	public String getPers_country() {
		return this.pers_country;
	}

	public void setPers_country(String pers_country) {
		this.pers_country = pers_country;
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

	public String getPers_birth_place() {
		return this.pers_birth_place;
	}

	public void setPers_birth_place(String pers_birth_place) {
		this.pers_birth_place = pers_birth_place;
	}

	public String getPers_curr_address() {
		return this.pers_curr_address;
	}

	public void setPers_curr_address(String pers_curr_address) {
		this.pers_curr_address = pers_curr_address;
	}

	public String getRsdt_region_code() {
		return this.rsdt_region_code;
	}

	public void setRsdt_region_code(String rsdt_region_code) {
		this.rsdt_region_code = rsdt_region_code;
	}

	public String getPers_telno() {
		return this.pers_telno;
	}

	public void setPers_telno(String pers_telno) {
		this.pers_telno = pers_telno;
	}

	public String getPers_nation() {
		return this.pers_nation;
	}

	public void setPers_nation(String pers_nation) {
		this.pers_nation = pers_nation;
	}

	public String getPers_card_id() {
		return this.pers_card_id;
	}

	public void setPers_card_id(String pers_card_id) {
		this.pers_card_id = pers_card_id;
	}

	public String getPers_state() {
		return this.pers_state;
	}

	public void setPers_state(String pers_state) {
		this.pers_state = pers_state;
	}

	public String getNational_staff_flag() {
		return this.national_staff_flag;
	}

	public void setNational_staff_flag(String national_staff_flag) {
		this.national_staff_flag = national_staff_flag;
	}

	public String getPers_fugitive_flag() {
		return this.pers_fugitive_flag;
	}

	public void setPers_fugitive_flag(String pers_fugitive_flag) {
		this.pers_fugitive_flag = pers_fugitive_flag;
	}

	public String getPers_special_flag() {
		return this.pers_special_flag;
	}

	public void setPers_special_flag(String pers_special_flag) {
		this.pers_special_flag = pers_special_flag;
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

	public String getData_src_flag() {
		return this.data_src_flag;
	}

	public void setData_src_flag(String data_src_flag) {
		this.data_src_flag = data_src_flag;
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

	public String getPers_country_code() {
		return this.pers_country_code;
	}

	public void setPers_country_code(String pers_country_code) {
		this.pers_country_code = pers_country_code;
	}

	public String getPers_gender_code() {
		return this.pers_gender_code;
	}

	public void setPers_gender_code(String pers_gender_code) {
		this.pers_gender_code = pers_gender_code;
	}

	public String getPers_gender_code_na() {
		return this.pers_gender_code_na;
	}

	public void setPers_gender_code_na(String pers_gender_code_na) {
		this.pers_gender_code_na = pers_gender_code_na;
	}

	public String getPers_birth_place_na() {
		return this.pers_birth_place_na;
	}

	public void setPers_birth_place_na(String pers_birth_place_na) {
		this.pers_birth_place_na = pers_birth_place_na;
	}

	public String getRsdt_region() {
		return this.rsdt_region;
	}

	public void setRsdt_region(String rsdt_region) {
		this.rsdt_region = rsdt_region;
	}

	public String getPers_nation_code() {
		return this.pers_nation_code;
	}

	public void setPers_nation_code(String pers_nation_code) {
		this.pers_nation_code = pers_nation_code;
	}

	public String getPers_state_code() {
		return this.pers_state_code;
	}

	public void setPers_state_code(String pers_state_code) {
		this.pers_state_code = pers_state_code;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
