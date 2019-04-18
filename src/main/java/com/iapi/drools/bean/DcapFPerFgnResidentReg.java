package com.iapi.drools.bean;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 境外人员常住信息  dcap_f_per_fgn_resident_reg
 *
 * <p>Date: Thu Sep 27 11:38:49 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerFgnResidentReg  implements Serializable {


	private static final long serialVersionUID =  4729605944237253743L;


	/**
	 * 常住境外人员业务编号，地方上报，全国唯一号 


	 */
	private String rf_busi_no;

	/**
	 * 上报省份，省级代码 

	 */
	private String rpt_prov;

	/**
	 * 居住地业务编号，地方上报，全国唯一号 

	 */
	private String rsdt_busi_no;

	/**
	 * 工作地业务编号，地方上报，全国唯一号 

	 */
	private String work_busi_no;

	/**
	 * 常住境外人员编号人员编号，个人摘要信息（核查用姓名、出生日期、核查用证号） 

	 */
	private String rf_pers_no;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 

	 */
	private String pers_id;

	/**
	 * 英文姓 

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
	 * 中文姓，中国人（含港澳台）为必填项 


	 */
	private String chn_surname;

	/**
	 * 中文名 

	 */
	private String chn_firstname;

	/**
	 * 中文姓名 

	 */
	private String chn_name;

	/**
	 * GBK姓名，范围外的字以全角？代替 

	 */
	private String gbk_name;

	/**
	 * 核查用姓名 

	 */
	private String verf_name;

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
	 * 境外人员身份 

	 */
	private String fgn_sts;

	/**
	 * 人员类别，R：内地居民，H：香港居民，M：澳门居民，T：台湾居民，F：外国人 

	 */
	private String pers_type;

	/**
	 * 境外人员身份证号码 

	 */
	private String fgn_card_id;

	/**
	 * 签证（注）种类 

	 */
	private String visas_type;

	/**
	 * 证件内人数，持证人+偕行人数 


	 */
	private String in_cert_nbr;

	/**
	 * 入境事由，入境是由代码 

	 */
	private String entry_rsn_code;

	/**
	 * 居留事由，居留许可的居留事由，外国人居留事由代码 

	 */
	private String rsdt_rsn_code;

	/**
	 * 居留证许可（签证、签注）号码 

	 */
	private String prmt_no;

	/**
	 * 居留许可（签证、签注）发证日期，格式为YYYYMMDD 

	 */
	private String prmt_issuing_date;

	/**
	 * 居留许可（签证、签注）有效期至，格式为YYYYMMDD，有效期截止日期 

	 */
	private String prmt_vld;

	/**
	 * 停留期限 

	 */
	private String period;

	/**
	 * 签发机关，审批签发机关代码 

	 */
	private String issuing_organ;

	/**
	 * 常住人员联系电话 

	 */
	private String rsdt_fgn_tel;

	/**
	 * 居住地行政区划代码 

	 */
	private String curr_region_code;

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
	 * 居住状态类型 1-迁入；2-所内变动；3-迁出；4-死亡注销；5-人户分离；9-经查无此人 

	 */
	private String rsdt_sts_type;

	/**
	 * 当前居住初始状态产生时间 

	 */
	private String rsdt_start_date;

	/**
	 * 当前工作单位所在区县 

	 */
	private String curr_wu_region_code;

	/**
	 * 当前工作单位所在地派出所，GA380-2003 

	 */
	private String curr_wu_lps_code;

	/**
	 * 当前工作单位所在地派出所名称 

	 */
	private String curr_wu_lps_name;

	/**
	 * 当前工作单位组织机构代码 

	 */
	private String curr_ws_org_code;

	/**
	 * 当前工作单位名称 

	 */
	private String curr_wu_name;

	/**
	 * 当前工作身份，境外人员身份代码 

	 */
	private String curr_work_id;

	/**
	 * 当前工作任职起始时间 

	 */
	private String work_start_date;

	/**
	 * 当前工作任职终止时间 

	 */
	private String work_end_date;

	/**
	 * 工作状态类型 1-在职；2-离职；3-人职分离；9-单位内无此人 

	 */
	private String work_sts_type;

	/**
	 * 当前工作初始状态产生时间 

	 */
	private String curr_work_init_date;

	/**
	 * 备注 
	 备注

	 */
	private String remakrs;

	/**
	 * 常住人员照片 

	 */
	private InputStream rf_photo;

	/**
	 * 居住地城市，居住地区前4位 


	 */
	private String rsdt_city;

	/**
	 * 工作地城市，工作地区前4位 

	 */
	private String work_city;

	/**
	 * 操作时间 

	 */
	private String oper_dt;

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
	 * 性别代码名称
	 */
	private String gender_na;

	/**
	 * 国籍代码名称
	 */
	private String pers_country;

	/**
	 * 证件类型名称
	 */
	private String cert_type_na;

	/**
	 * 境外人员身份名称
	 */
	private String fgn_sts_na;

	/**
	 * 人员类别名称
	 */
	private String pers_type_na;

	/**
	 * 签证类型名称
	 */
	private String visas_type_na;

	/**
	 * 出入境交通工具名称
	 */
	private String imm_reason;

	/**
	 * 常住事由
	 */
	private String resident_reason;

	/**
	 * 签发机关名称
	 */
	private String issuing_organ_na;

	/**
	 * 居住地行政区名称
	 */
	private String curr_region_na;

	/**
	 * 当前工作单位所在区县名称
	 */
	private String curr_wu_region_na;

	/**
	 * 当前工作身份名称
	 */
	private String curr_work_id_na;

	/**
	 * 居住地城市名称
	 */
	private String rsdt_city_na;

	/**
	 * 工作地城市名称
	 */
	private String work_city_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFPerFgnResidentReg(){super();}

	public  DcapFPerFgnResidentReg(String rf_busi_no,String rpt_prov,String rsdt_busi_no,String work_busi_no,String rf_pers_no,String pers_id,String surname,String firstname,String eng_name,String chn_surname,String chn_firstname,String chn_name,String gbk_name,String verf_name,String gender,String birth_date,String country_code,String cert_type,String cert_no,String verf_cert_no,String cert_vld,String fgn_sts,String pers_type,String fgn_card_id,String visas_type,String in_cert_nbr,String entry_rsn_code,String rsdt_rsn_code,String prmt_no,String prmt_issuing_date,String prmt_vld,String period,String issuing_organ,String rsdt_fgn_tel,String curr_region_code,String curr_lps_code,String curr_lps_name,String curr_address,String rsdt_sts_type,String rsdt_start_date,String curr_wu_region_code,String curr_wu_lps_code,String curr_wu_lps_name,String curr_ws_org_code,String curr_wu_name,String curr_work_id,String work_start_date,String work_end_date,String work_sts_type,String curr_work_init_date,String remakrs,InputStream rf_photo,String rsdt_city,String work_city,String oper_dt,String seq_id,String load_dt,String objectid,String rpt_prov_na,String pers_name,String pers_name_seh,String gender_na,String pers_country,String cert_type_na,String fgn_sts_na,String pers_type_na,String visas_type_na,String imm_reason,String resident_reason,String issuing_organ_na,String curr_region_na,String curr_wu_region_na,String curr_work_id_na,String rsdt_city_na,String work_city_na,String filterflag){
		this.rf_busi_no=rf_busi_no;
		this.rpt_prov=rpt_prov;
		this.rsdt_busi_no=rsdt_busi_no;
		this.work_busi_no=work_busi_no;
		this.rf_pers_no=rf_pers_no;
		this.pers_id=pers_id;
		this.surname=surname;
		this.firstname=firstname;
		this.eng_name=eng_name;
		this.chn_surname=chn_surname;
		this.chn_firstname=chn_firstname;
		this.chn_name=chn_name;
		this.gbk_name=gbk_name;
		this.verf_name=verf_name;
		this.gender=gender;
		this.birth_date=birth_date;
		this.country_code=country_code;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.verf_cert_no=verf_cert_no;
		this.cert_vld=cert_vld;
		this.fgn_sts=fgn_sts;
		this.pers_type=pers_type;
		this.fgn_card_id=fgn_card_id;
		this.visas_type=visas_type;
		this.in_cert_nbr=in_cert_nbr;
		this.entry_rsn_code=entry_rsn_code;
		this.rsdt_rsn_code=rsdt_rsn_code;
		this.prmt_no=prmt_no;
		this.prmt_issuing_date=prmt_issuing_date;
		this.prmt_vld=prmt_vld;
		this.period=period;
		this.issuing_organ=issuing_organ;
		this.rsdt_fgn_tel=rsdt_fgn_tel;
		this.curr_region_code=curr_region_code;
		this.curr_lps_code=curr_lps_code;
		this.curr_lps_name=curr_lps_name;
		this.curr_address=curr_address;
		this.rsdt_sts_type=rsdt_sts_type;
		this.rsdt_start_date=rsdt_start_date;
		this.curr_wu_region_code=curr_wu_region_code;
		this.curr_wu_lps_code=curr_wu_lps_code;
		this.curr_wu_lps_name=curr_wu_lps_name;
		this.curr_ws_org_code=curr_ws_org_code;
		this.curr_wu_name=curr_wu_name;
		this.curr_work_id=curr_work_id;
		this.work_start_date=work_start_date;
		this.work_end_date=work_end_date;
		this.work_sts_type=work_sts_type;
		this.curr_work_init_date=curr_work_init_date;
		this.remakrs=remakrs;
		this.rf_photo=rf_photo;
		this.rsdt_city=rsdt_city;
		this.work_city=work_city;
		this.oper_dt=oper_dt;
		this.seq_id=seq_id;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.rpt_prov_na=rpt_prov_na;
		this.pers_name=pers_name;
		this.pers_name_seh=pers_name_seh;
		this.gender_na=gender_na;
		this.pers_country=pers_country;
		this.cert_type_na=cert_type_na;
		this.fgn_sts_na=fgn_sts_na;
		this.pers_type_na=pers_type_na;
		this.visas_type_na=visas_type_na;
		this.imm_reason=imm_reason;
		this.resident_reason=resident_reason;
		this.issuing_organ_na=issuing_organ_na;
		this.curr_region_na=curr_region_na;
		this.curr_wu_region_na=curr_wu_region_na;
		this.curr_work_id_na=curr_work_id_na;
		this.rsdt_city_na=rsdt_city_na;
		this.work_city_na=work_city_na;
		this.filterflag=filterflag;
	}

	public String getRf_busi_no() {
		return this.rf_busi_no;
	}

	public void setRf_busi_no(String rf_busi_no) {
		this.rf_busi_no = rf_busi_no;
	}

	public String getRpt_prov() {
		return this.rpt_prov;
	}

	public void setRpt_prov(String rpt_prov) {
		this.rpt_prov = rpt_prov;
	}

	public String getRsdt_busi_no() {
		return this.rsdt_busi_no;
	}

	public void setRsdt_busi_no(String rsdt_busi_no) {
		this.rsdt_busi_no = rsdt_busi_no;
	}

	public String getWork_busi_no() {
		return this.work_busi_no;
	}

	public void setWork_busi_no(String work_busi_no) {
		this.work_busi_no = work_busi_no;
	}

	public String getRf_pers_no() {
		return this.rf_pers_no;
	}

	public void setRf_pers_no(String rf_pers_no) {
		this.rf_pers_no = rf_pers_no;
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

	public String getChn_surname() {
		return this.chn_surname;
	}

	public void setChn_surname(String chn_surname) {
		this.chn_surname = chn_surname;
	}

	public String getChn_firstname() {
		return this.chn_firstname;
	}

	public void setChn_firstname(String chn_firstname) {
		this.chn_firstname = chn_firstname;
	}

	public String getChn_name() {
		return this.chn_name;
	}

	public void setChn_name(String chn_name) {
		this.chn_name = chn_name;
	}

	public String getGbk_name() {
		return this.gbk_name;
	}

	public void setGbk_name(String gbk_name) {
		this.gbk_name = gbk_name;
	}

	public String getVerf_name() {
		return this.verf_name;
	}

	public void setVerf_name(String verf_name) {
		this.verf_name = verf_name;
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

	public String getFgn_sts() {
		return this.fgn_sts;
	}

	public void setFgn_sts(String fgn_sts) {
		this.fgn_sts = fgn_sts;
	}

	public String getPers_type() {
		return this.pers_type;
	}

	public void setPers_type(String pers_type) {
		this.pers_type = pers_type;
	}

	public String getFgn_card_id() {
		return this.fgn_card_id;
	}

	public void setFgn_card_id(String fgn_card_id) {
		this.fgn_card_id = fgn_card_id;
	}

	public String getVisas_type() {
		return this.visas_type;
	}

	public void setVisas_type(String visas_type) {
		this.visas_type = visas_type;
	}

	public String getIn_cert_nbr() {
		return this.in_cert_nbr;
	}

	public void setIn_cert_nbr(String in_cert_nbr) {
		this.in_cert_nbr = in_cert_nbr;
	}

	public String getEntry_rsn_code() {
		return this.entry_rsn_code;
	}

	public void setEntry_rsn_code(String entry_rsn_code) {
		this.entry_rsn_code = entry_rsn_code;
	}

	public String getRsdt_rsn_code() {
		return this.rsdt_rsn_code;
	}

	public void setRsdt_rsn_code(String rsdt_rsn_code) {
		this.rsdt_rsn_code = rsdt_rsn_code;
	}

	public String getPrmt_no() {
		return this.prmt_no;
	}

	public void setPrmt_no(String prmt_no) {
		this.prmt_no = prmt_no;
	}

	public String getPrmt_issuing_date() {
		return this.prmt_issuing_date;
	}

	public void setPrmt_issuing_date(String prmt_issuing_date) {
		this.prmt_issuing_date = prmt_issuing_date;
	}

	public String getPrmt_vld() {
		return this.prmt_vld;
	}

	public void setPrmt_vld(String prmt_vld) {
		this.prmt_vld = prmt_vld;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getIssuing_organ() {
		return this.issuing_organ;
	}

	public void setIssuing_organ(String issuing_organ) {
		this.issuing_organ = issuing_organ;
	}

	public String getRsdt_fgn_tel() {
		return this.rsdt_fgn_tel;
	}

	public void setRsdt_fgn_tel(String rsdt_fgn_tel) {
		this.rsdt_fgn_tel = rsdt_fgn_tel;
	}

	public String getCurr_region_code() {
		return this.curr_region_code;
	}

	public void setCurr_region_code(String curr_region_code) {
		this.curr_region_code = curr_region_code;
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

	public String getRsdt_sts_type() {
		return this.rsdt_sts_type;
	}

	public void setRsdt_sts_type(String rsdt_sts_type) {
		this.rsdt_sts_type = rsdt_sts_type;
	}

	public String getRsdt_start_date() {
		return this.rsdt_start_date;
	}

	public void setRsdt_start_date(String rsdt_start_date) {
		this.rsdt_start_date = rsdt_start_date;
	}

	public String getCurr_wu_region_code() {
		return this.curr_wu_region_code;
	}

	public void setCurr_wu_region_code(String curr_wu_region_code) {
		this.curr_wu_region_code = curr_wu_region_code;
	}

	public String getCurr_wu_lps_code() {
		return this.curr_wu_lps_code;
	}

	public void setCurr_wu_lps_code(String curr_wu_lps_code) {
		this.curr_wu_lps_code = curr_wu_lps_code;
	}

	public String getCurr_wu_lps_name() {
		return this.curr_wu_lps_name;
	}

	public void setCurr_wu_lps_name(String curr_wu_lps_name) {
		this.curr_wu_lps_name = curr_wu_lps_name;
	}

	public String getCurr_ws_org_code() {
		return this.curr_ws_org_code;
	}

	public void setCurr_ws_org_code(String curr_ws_org_code) {
		this.curr_ws_org_code = curr_ws_org_code;
	}

	public String getCurr_wu_name() {
		return this.curr_wu_name;
	}

	public void setCurr_wu_name(String curr_wu_name) {
		this.curr_wu_name = curr_wu_name;
	}

	public String getCurr_work_id() {
		return this.curr_work_id;
	}

	public void setCurr_work_id(String curr_work_id) {
		this.curr_work_id = curr_work_id;
	}

	public String getWork_start_date() {
		return this.work_start_date;
	}

	public void setWork_start_date(String work_start_date) {
		this.work_start_date = work_start_date;
	}

	public String getWork_end_date() {
		return this.work_end_date;
	}

	public void setWork_end_date(String work_end_date) {
		this.work_end_date = work_end_date;
	}

	public String getWork_sts_type() {
		return this.work_sts_type;
	}

	public void setWork_sts_type(String work_sts_type) {
		this.work_sts_type = work_sts_type;
	}

	public String getCurr_work_init_date() {
		return this.curr_work_init_date;
	}

	public void setCurr_work_init_date(String curr_work_init_date) {
		this.curr_work_init_date = curr_work_init_date;
	}

	public String getRemakrs() {
		return this.remakrs;
	}

	public void setRemakrs(String remakrs) {
		this.remakrs = remakrs;
	}

	public InputStream getRf_photo() {
		return this.rf_photo;
	}

	public void setRf_photo(InputStream rf_photo) {
		this.rf_photo = rf_photo;
	}

	public String getRsdt_city() {
		return this.rsdt_city;
	}

	public void setRsdt_city(String rsdt_city) {
		this.rsdt_city = rsdt_city;
	}

	public String getWork_city() {
		return this.work_city;
	}

	public void setWork_city(String work_city) {
		this.work_city = work_city;
	}

	public String getOper_dt() {
		return this.oper_dt;
	}

	public void setOper_dt(String oper_dt) {
		this.oper_dt = oper_dt;
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

	public String getPers_country() {
		return this.pers_country;
	}

	public void setPers_country(String pers_country) {
		this.pers_country = pers_country;
	}

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getFgn_sts_na() {
		return this.fgn_sts_na;
	}

	public void setFgn_sts_na(String fgn_sts_na) {
		this.fgn_sts_na = fgn_sts_na;
	}

	public String getPers_type_na() {
		return this.pers_type_na;
	}

	public void setPers_type_na(String pers_type_na) {
		this.pers_type_na = pers_type_na;
	}

	public String getVisas_type_na() {
		return this.visas_type_na;
	}

	public void setVisas_type_na(String visas_type_na) {
		this.visas_type_na = visas_type_na;
	}

	public String getImm_reason() {
		return this.imm_reason;
	}

	public void setImm_reason(String imm_reason) {
		this.imm_reason = imm_reason;
	}

	public String getResident_reason() {
		return this.resident_reason;
	}

	public void setResident_reason(String resident_reason) {
		this.resident_reason = resident_reason;
	}

	public String getIssuing_organ_na() {
		return this.issuing_organ_na;
	}

	public void setIssuing_organ_na(String issuing_organ_na) {
		this.issuing_organ_na = issuing_organ_na;
	}

	public String getCurr_region_na() {
		return this.curr_region_na;
	}

	public void setCurr_region_na(String curr_region_na) {
		this.curr_region_na = curr_region_na;
	}

	public String getCurr_wu_region_na() {
		return this.curr_wu_region_na;
	}

	public void setCurr_wu_region_na(String curr_wu_region_na) {
		this.curr_wu_region_na = curr_wu_region_na;
	}

	public String getCurr_work_id_na() {
		return this.curr_work_id_na;
	}

	public void setCurr_work_id_na(String curr_work_id_na) {
		this.curr_work_id_na = curr_work_id_na;
	}

	public String getRsdt_city_na() {
		return this.rsdt_city_na;
	}

	public void setRsdt_city_na(String rsdt_city_na) {
		this.rsdt_city_na = rsdt_city_na;
	}

	public String getWork_city_na() {
		return this.work_city_na;
	}

	public void setWork_city_na(String work_city_na) {
		this.work_city_na = work_city_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
