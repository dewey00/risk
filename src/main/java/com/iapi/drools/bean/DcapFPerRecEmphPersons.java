package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 重点人员关注信息 dcap_f_per_rec_emph_persons
 *
 * <p>Date: Thu Sep 27 11:39:03 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerRecEmphPersons  implements Serializable {


	private static final long serialVersionUID =  6367098257462464940L;


	/**
	 * 重点关注人员编号，口岸代码+年份+1位服务器序号+4位流水号 

	 */
	private String emph_pers_id;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 

	 */
	private String pers_id;

	/**
	 * 姓名
	 */
	private String pers_name;

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
	 * 证件种类 

	 */
	private String cert_type;

	/**
	 * 证件号码 

	 */
	private String cert_no;

	/**
	 * 查控姓名 

	 */
	private String ck_name;

	/**
	 * 通用查控证号 

	 */
	private String genl_ck_id;

	/**
	 * 特殊查控证号，16、24才有 

	 */
	private String spec_ck_id;

	/**
	 * 身份证号码 

	 */
	private String pers_card_id;

	/**
	 * 报警范围，1：入境报，2：出境报，3：出入报 


	 */
	private String bjfw;

	/**
	 * 民族代码
	 */
	private String nation_code;

	/**
	 * 重点关注人员类别代码 

	 */
	private String zdgzrylbdm;

	/**
	 * 重点关注人员处理方式，1：重点检查，2：移交后台 

	 */
	private String zdgzryclfs;

	/**
	 * 关注内容 

	 */
	private String gznr;

	/**
	 * 起始关注日期 

	 */
	private String start_date;

	/**
	 * 结束关注日期 

	 */
	private String end_date;

	/**
	 * 操作员代码 

	 */
	private String oper_code;

	/**
	 * 操作时间 

	 */
	private String oper_dt;

	/**
	 * 操作口岸代码 

	 */
	private String oper_port_code;

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
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFPerRecEmphPersons(){super();}

	public  DcapFPerRecEmphPersons(String emph_pers_id,String pers_id,String pers_name,String gender,String birth_date,String country_code,String cert_type,String cert_no,String ck_name,String genl_ck_id,String spec_ck_id,String pers_card_id,String bjfw,String nation_code,String zdgzrylbdm,String zdgzryclfs,String gznr,String start_date,String end_date,String oper_code,String oper_dt,String oper_port_code,String load_dt,String objectid,String pers_name_seh,String gender_na,String country_na,String cert_type_na,String filterflag){
		this.emph_pers_id=emph_pers_id;
		this.pers_id=pers_id;
		this.pers_name=pers_name;
		this.gender=gender;
		this.birth_date=birth_date;
		this.country_code=country_code;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.ck_name=ck_name;
		this.genl_ck_id=genl_ck_id;
		this.spec_ck_id=spec_ck_id;
		this.pers_card_id=pers_card_id;
		this.bjfw=bjfw;
		this.nation_code=nation_code;
		this.zdgzrylbdm=zdgzrylbdm;
		this.zdgzryclfs=zdgzryclfs;
		this.gznr=gznr;
		this.start_date=start_date;
		this.end_date=end_date;
		this.oper_code=oper_code;
		this.oper_dt=oper_dt;
		this.oper_port_code=oper_port_code;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_name_seh=pers_name_seh;
		this.gender_na=gender_na;
		this.country_na=country_na;
		this.cert_type_na=cert_type_na;
		this.filterflag=filterflag;
	}

	public String getEmph_pers_id() {
		return this.emph_pers_id;
	}

	public void setEmph_pers_id(String emph_pers_id) {
		this.emph_pers_id = emph_pers_id;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getPers_name() {
		return this.pers_name;
	}

	public void setPers_name(String pers_name) {
		this.pers_name = pers_name;
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

	public String getCk_name() {
		return this.ck_name;
	}

	public void setCk_name(String ck_name) {
		this.ck_name = ck_name;
	}

	public String getGenl_ck_id() {
		return this.genl_ck_id;
	}

	public void setGenl_ck_id(String genl_ck_id) {
		this.genl_ck_id = genl_ck_id;
	}

	public String getSpec_ck_id() {
		return this.spec_ck_id;
	}

	public void setSpec_ck_id(String spec_ck_id) {
		this.spec_ck_id = spec_ck_id;
	}

	public String getPers_card_id() {
		return this.pers_card_id;
	}

	public void setPers_card_id(String pers_card_id) {
		this.pers_card_id = pers_card_id;
	}

	public String getBjfw() {
		return this.bjfw;
	}

	public void setBjfw(String bjfw) {
		this.bjfw = bjfw;
	}

	public String getNation_code() {
		return this.nation_code;
	}

	public void setNation_code(String nation_code) {
		this.nation_code = nation_code;
	}

	public String getZdgzrylbdm() {
		return this.zdgzrylbdm;
	}

	public void setZdgzrylbdm(String zdgzrylbdm) {
		this.zdgzrylbdm = zdgzrylbdm;
	}

	public String getZdgzryclfs() {
		return this.zdgzryclfs;
	}

	public void setZdgzryclfs(String zdgzryclfs) {
		this.zdgzryclfs = zdgzryclfs;
	}

	public String getGznr() {
		return this.gznr;
	}

	public void setGznr(String gznr) {
		this.gznr = gznr;
	}

	public String getStart_date() {
		return this.start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return this.end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getOper_code() {
		return this.oper_code;
	}

	public void setOper_code(String oper_code) {
		this.oper_code = oper_code;
	}

	public String getOper_dt() {
		return this.oper_dt;
	}

	public void setOper_dt(String oper_dt) {
		this.oper_dt = oper_dt;
	}

	public String getOper_port_code() {
		return this.oper_port_code;
	}

	public void setOper_port_code(String oper_port_code) {
		this.oper_port_code = oper_port_code;
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

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
