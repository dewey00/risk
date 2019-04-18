package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 境外人员临时住宿登记信息 dcap_f_per_fgn_temp_reg
 *
 * <p>Date: Thu Sep 27 11:38:53 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerFgnTempReg  implements Serializable {


	private static final long serialVersionUID =  7247198667450001831L;


	/**
	 * 外国人临住业务编号 

	 */
	private String ftr_busi_no;

	/**
	 * 上报省份 

	 */
	private String rpt_prov;

	/**
	 * 数据来源（1：内地公安机关， 2： 外交部，10：出入境记录，11：外国人常住信息，12：外国人暂住信息，13：违法违规人员，14：遣返遣送人员，15：外国人涉案信息，16：失效证，17：在逃人员，18：临时入境许可信息，19：船员变更信息，20：处理意见，21：重点关注人员，50：内地居民证件签发，51：内地居民签注签发，52：港澳居民通行证签发，53：台湾居民通行证签发，54：外国人签证签发，55：临时入境许可，56：船舶证件发放，57：自助通关，58：国家工作人人员，59：司机资料表，99：其他，101：船舶航次总表，102：车辆资料备案，103：API航班资料，104：出入境交通工具，105：违法违规交通工具） 

	 */
	private String data_src_flag;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 

	 */
	private String pers_id;

	/**
	 * 中文姓名 

	 */
	private String chn_name;

	/**
	 * 英文名 

	 */
	private String firstname;

	/**
	 * 英文姓 

	 */
	private String surname;

	/**
	 * 英文姓名 

	 */
	private String eng_name;

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
	 * 所持证件种类
	 */
	private String hold_cert_type;

	/**
	 * 所持证件号码 

	 */
	private String hold_cert_no;

	/**
	 * 签证（注）种类 

	 */
	private String visas_type;

	/**
	 * 签证（注）号码 

	 */
	private String visas_no;

	/**
	 * 签证（注）停留有效期 

	 */
	private String visas_vld;

	/**
	 * 签发单位 

	 */
	private String issuing_unit;

	/**
	 * 住宿日期 

	 */
	private String stay_date;

	/**
	 * 散居住址/留宿单位地址 

	 */
	private String stay_address;

	/**
	 * 离开日期 

	 */
	private String leave_date;

	/**
	 * 接待单位 

	 */
	private String rcpt_unit;

	/**
	 * 临时住宿登记单位行政区划 

	 */
	private String tsu_region_code;

	/**
	 * 临时住宿登记单位代码 

	 */
	private String tsu_code;

	/**
	 * 临时住宿登记单位名称 

	 */
	private String tsu_name;

	/**
	 * 备注 

	 */
	private String remakrs;

	/**
	 * 上报城市 

	 */
	private String rpt_city;

	/**
	 * 滞后时间长度标识 1:1-2天，2:3-7天，3:8-14天，4:15天以上 

	 */
	private String delay_flag;

	/**
	 * 操作时间 

	 */
	private String oper_dt;

	/**
	 * 入库时间 

	 */
	private String rec_dt;

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
	 * 人员姓名拼音

	 */
	private String pers_name_seh;

	/**
	 * 人员姓名

	 */
	private String pers_name;

	/**
	 * 姓
	 */
	private String lastname;

	/**
	 * 性别代码名称
	 */
	private String gender_na;

	/**
	 * 国家地区名称
	 */
	private String country_na;

	/**
	 * 所持证件种类名称

	 */
	private String hold_cert_type_na;

	/**
	 * 签证类型名称
	 */
	private String visas_type_na;

	/**
	 * 签发机关名称
	 */
	private String issuing_unit_na;

	/**
	 * 临时住宿登记单位行政区名称

	 */
	private String tsu_region_na;

	/**
	 * 数据上报城市

	 */
	private String sjsbcs;

	/**
	 * 数据上报城市名称
	 */
	private String sjsbcs_na;

	/**
	 * 滞后时间长度标识
	 */
	private String zhsjcdbs;

	/**
	 * 入库时间
	 */
	private String rksj;

	/**
	 * 日期排序
	 */
	private Date sort_date;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFPerFgnTempReg(){super();}

	public  DcapFPerFgnTempReg(String ftr_busi_no,String rpt_prov,String data_src_flag,String pers_id,String chn_name,String firstname,String surname,String eng_name,String gender,String birth_date,String country_code,String hold_cert_type,String hold_cert_no,String visas_type,String visas_no,String visas_vld,String issuing_unit,String stay_date,String stay_address,String leave_date,String rcpt_unit,String tsu_region_code,String tsu_code,String tsu_name,String remakrs,String rpt_city,String delay_flag,String oper_dt,String rec_dt,String load_dt,String objectid,String rpt_prov_na,String pers_name_seh,String pers_name,String lastname,String gender_na,String country_na,String hold_cert_type_na,String visas_type_na,String issuing_unit_na,String tsu_region_na,String sjsbcs,String sjsbcs_na,String zhsjcdbs,String rksj,Date sort_date,String filterflag){
		this.ftr_busi_no=ftr_busi_no;
		this.rpt_prov=rpt_prov;
		this.data_src_flag=data_src_flag;
		this.pers_id=pers_id;
		this.chn_name=chn_name;
		this.firstname=firstname;
		this.surname=surname;
		this.eng_name=eng_name;
		this.gender=gender;
		this.birth_date=birth_date;
		this.country_code=country_code;
		this.hold_cert_type=hold_cert_type;
		this.hold_cert_no=hold_cert_no;
		this.visas_type=visas_type;
		this.visas_no=visas_no;
		this.visas_vld=visas_vld;
		this.issuing_unit=issuing_unit;
		this.stay_date=stay_date;
		this.stay_address=stay_address;
		this.leave_date=leave_date;
		this.rcpt_unit=rcpt_unit;
		this.tsu_region_code=tsu_region_code;
		this.tsu_code=tsu_code;
		this.tsu_name=tsu_name;
		this.remakrs=remakrs;
		this.rpt_city=rpt_city;
		this.delay_flag=delay_flag;
		this.oper_dt=oper_dt;
		this.rec_dt=rec_dt;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.rpt_prov_na=rpt_prov_na;
		this.pers_name_seh=pers_name_seh;
		this.pers_name=pers_name;
		this.lastname=lastname;
		this.gender_na=gender_na;
		this.country_na=country_na;
		this.hold_cert_type_na=hold_cert_type_na;
		this.visas_type_na=visas_type_na;
		this.issuing_unit_na=issuing_unit_na;
		this.tsu_region_na=tsu_region_na;
		this.sjsbcs=sjsbcs;
		this.sjsbcs_na=sjsbcs_na;
		this.zhsjcdbs=zhsjcdbs;
		this.rksj=rksj;
		this.sort_date=sort_date;
		this.filterflag=filterflag;
	}

	public String getFtr_busi_no() {
		return this.ftr_busi_no;
	}

	public void setFtr_busi_no(String ftr_busi_no) {
		this.ftr_busi_no = ftr_busi_no;
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

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getChn_name() {
		return this.chn_name;
	}

	public void setChn_name(String chn_name) {
		this.chn_name = chn_name;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEng_name() {
		return this.eng_name;
	}

	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
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

	public String getHold_cert_type() {
		return this.hold_cert_type;
	}

	public void setHold_cert_type(String hold_cert_type) {
		this.hold_cert_type = hold_cert_type;
	}

	public String getHold_cert_no() {
		return this.hold_cert_no;
	}

	public void setHold_cert_no(String hold_cert_no) {
		this.hold_cert_no = hold_cert_no;
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

	public String getVisas_vld() {
		return this.visas_vld;
	}

	public void setVisas_vld(String visas_vld) {
		this.visas_vld = visas_vld;
	}

	public String getIssuing_unit() {
		return this.issuing_unit;
	}

	public void setIssuing_unit(String issuing_unit) {
		this.issuing_unit = issuing_unit;
	}

	public String getStay_date() {
		return this.stay_date;
	}

	public void setStay_date(String stay_date) {
		this.stay_date = stay_date;
	}

	public String getStay_address() {
		return this.stay_address;
	}

	public void setStay_address(String stay_address) {
		this.stay_address = stay_address;
	}

	public String getLeave_date() {
		return this.leave_date;
	}

	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}

	public String getRcpt_unit() {
		return this.rcpt_unit;
	}

	public void setRcpt_unit(String rcpt_unit) {
		this.rcpt_unit = rcpt_unit;
	}

	public String getTsu_region_code() {
		return this.tsu_region_code;
	}

	public void setTsu_region_code(String tsu_region_code) {
		this.tsu_region_code = tsu_region_code;
	}

	public String getTsu_code() {
		return this.tsu_code;
	}

	public void setTsu_code(String tsu_code) {
		this.tsu_code = tsu_code;
	}

	public String getTsu_name() {
		return this.tsu_name;
	}

	public void setTsu_name(String tsu_name) {
		this.tsu_name = tsu_name;
	}

	public String getRemakrs() {
		return this.remakrs;
	}

	public void setRemakrs(String remakrs) {
		this.remakrs = remakrs;
	}

	public String getRpt_city() {
		return this.rpt_city;
	}

	public void setRpt_city(String rpt_city) {
		this.rpt_city = rpt_city;
	}

	public String getDelay_flag() {
		return this.delay_flag;
	}

	public void setDelay_flag(String delay_flag) {
		this.delay_flag = delay_flag;
	}

	public String getOper_dt() {
		return this.oper_dt;
	}

	public void setOper_dt(String oper_dt) {
		this.oper_dt = oper_dt;
	}

	public String getRec_dt() {
		return this.rec_dt;
	}

	public void setRec_dt(String rec_dt) {
		this.rec_dt = rec_dt;
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

	public String getPers_name_seh() {
		return this.pers_name_seh;
	}

	public void setPers_name_seh(String pers_name_seh) {
		this.pers_name_seh = pers_name_seh;
	}

	public String getPers_name() {
		return this.pers_name;
	}

	public void setPers_name(String pers_name) {
		this.pers_name = pers_name;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public String getHold_cert_type_na() {
		return this.hold_cert_type_na;
	}

	public void setHold_cert_type_na(String hold_cert_type_na) {
		this.hold_cert_type_na = hold_cert_type_na;
	}

	public String getVisas_type_na() {
		return this.visas_type_na;
	}

	public void setVisas_type_na(String visas_type_na) {
		this.visas_type_na = visas_type_na;
	}

	public String getIssuing_unit_na() {
		return this.issuing_unit_na;
	}

	public void setIssuing_unit_na(String issuing_unit_na) {
		this.issuing_unit_na = issuing_unit_na;
	}

	public String getTsu_region_na() {
		return this.tsu_region_na;
	}

	public void setTsu_region_na(String tsu_region_na) {
		this.tsu_region_na = tsu_region_na;
	}

	public String getSjsbcs() {
		return this.sjsbcs;
	}

	public void setSjsbcs(String sjsbcs) {
		this.sjsbcs = sjsbcs;
	}

	public String getSjsbcs_na() {
		return this.sjsbcs_na;
	}

	public void setSjsbcs_na(String sjsbcs_na) {
		this.sjsbcs_na = sjsbcs_na;
	}

	public String getZhsjcdbs() {
		return this.zhsjcdbs;
	}

	public void setZhsjcdbs(String zhsjcdbs) {
		this.zhsjcdbs = zhsjcdbs;
	}

	public String getRksj() {
		return this.rksj;
	}

	public void setRksj(String rksj) {
		this.rksj = rksj;
	}

	public Date getSort_date() {
		return this.sort_date;
	}

	public void setSort_date(Date sort_date) {
		this.sort_date = sort_date;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
