package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 港澳台居民往来大陆通行证证件签发信息 dcap_f_per_cert_hmt_issue
 *
 * <p>Date: Thu Sep 27 11:38:40 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerCertHmtIssue  implements Serializable {


	private static final long serialVersionUID =  2678339354230670079L;


	/**
	 * 国家地区代码
	 */
	private String country_code;

	/**
	 * 通行证类型，24：回乡证，16：台胞证，06：一次性台胞证
	 */
	private String passport_type;

	/**
	 * 通行证号，台湾通行证号码前8位，港澳通行证前9位
	 */
	private String passport_no;

	/**
	 * 通行证版本号
	 */
	private String passport_version;

	/**
	 * 通行证核数号码
	 */
	private String passport_heno;

	/**
	 * 通行证申请地区
	 */
	private String passport_apply_area;

	/**
	 * 通行证申请原因
	 */
	private String passport_apply_rsn;

	/**
	 * 港澳台验证通行证号码
	 */
	private String passport_hmt_no;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键
	 */
	private String pers_id;

	/**
	 * 人员英文姓名
	 */
	private String pers_name_en;

	/**
	 * 人员中文姓名
	 */
	private String pers_name_cn;

	/**
	 * 人员中文繁体姓名
	 */
	private String pers_name_tc;

	/**
	 * 姓名BIG5内码
	 */
	private String big5_code;

	/**
	 * 人员中文姓名拼音
	 */
	private String pers_name_py;

	/**
	 * 核查用英文姓名
	 */
	private String verf_name_en;

	/**
	 * 出生日期
	 */
	private String pers_birth_date;

	/**
	 * 性别代码
	 */
	private String pers_gender;

	/**
	 * 出生地代码
	 */
	private String homeplace;

	/**
	 * 港澳台证件类别
	 */
	private String hmt_cert_type;

	/**
	 * 港澳台证件号码
	 */
	private String hmt_cert_no;

	/**
	 * 台湾身份证号
	 */
	private String twn_card_id;

	/**
	 * 台湾居住地
	 */
	private String twn_address_code;

	/**
	 * 境外人员身份
	 */
	private String fgn_sts;

	/**
	 * 签发机关，审批签发机关代码
	 */
	private String issuing_organ;

	/**
	 * 签发日期，格式为YYYYMMDD
	 */
	private String issuing_date;

	/**
	 * 证件有效期截止日期，VLD：Valid Till
	 */
	private String cert_vld;

	/**
	 * 首次发证日期
	 */
	private String first_issuing_date;

	/**
	 * 换发次数
	 */
	private String renewal_nbr;

	/**
	 * 办证类别，办证类别代码
	 */
	private String apply_type;

	/**
	 * 电话号码
	 */
	private String pers_telno;

	/**
	 * 受理单位
	 */
	private String accept_organ;

	/**
	 * 受理时间，格式为YYYYMMDDHH24MISS
	 */
	private String accept_dt;

	/**
	 * 照片标志
	 */
	private String photo_flag;

	/**
	 * 证件照片，引用路径
	 */
	private String cert_photo_address;

	/**
	 * 数据来源（1：内地公安机关， 2： 外交部，10：出入境记录，11，外国人常住信息，12：外国人暂住信息，13：违法违规人员，14：遣返遣送人员，15：外国人涉案信息，16：失效证，17：在逃人员，18：临时入境许可信息，19：船员变更信息，20：处理意见，21：重点关注人员，50：内地居民证件签发，51：内地居民签注签发，52：港澳居民通行证签发，53：台湾居民通行证签发，54：外国人签证签发，55：临时入境许可，56：船舶证件发放，57：自助通关，58：国家工作人员，59：司机资料表，99：其他） 
	 */
	private String data_source;

	/**
	 * 备注
	 */
	private String remakrs;

	/**
	 * 失效标识，0: 有效, 1: 失效
	 */
	private String invalid_flag;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 前往国家地区名称
	 */
	private String country_code_na;

	/**
	 * 通行证申请地区名称
	 */
	private String passport_apply_area_na;

	/**
	 * 通行证申请原因名称
	 */
	private String passport_apply_rsn_na;

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
	private String pers_gender_na;

	/**
	 * 出生地代码名称
	 */
	private String homeplace_na;

	/**
	 * 香港证件号码类型
	 */
	private String hm_cert_type;

	/**
	 * 香港证件号码类型名称
	 */
	private String hm_cert_type_na;

	/**
	 * 香港证件号码
	 */
	private String hm_cert_no;

	/**
	 * 台湾证件ID
	 */
	private String tw_card_id;

	/**
	 * 台湾地址代码
	 */
	private String tw_address_code;

	/**
	 * 身份证号码
	 */
	private String identity_code;

	/**
	 * 签发机关名称
	 */
	private String issuing_organ_na;

	/**
	 * 办证类别名称

	 */
	private String apply_type_na;

	/**
	 * 受理单位名称
	 */
	private String accept_organ_na;

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
	 *
	 遣返遣送标记
	 */
	private String pers_repat_flag;

	/**
	 * 台湾地震名称
	 */
	private String tw_address_na;

	/**
	 * 身份证件名称
	 */
	private String identity_code_na;

	public  DcapFPerCertHmtIssue(){super();}

	public  DcapFPerCertHmtIssue(String country_code,String passport_type,String passport_no,String passport_version,String passport_heno,String passport_apply_area,String passport_apply_rsn,String passport_hmt_no,String pers_id,String pers_name_en,String pers_name_cn,String pers_name_tc,String big5_code,String pers_name_py,String verf_name_en,String pers_birth_date,String pers_gender,String homeplace,String hmt_cert_type,String hmt_cert_no,String twn_card_id,String twn_address_code,String fgn_sts,String issuing_organ,String issuing_date,String cert_vld,String first_issuing_date,String renewal_nbr,String apply_type,String pers_telno,String accept_organ,String accept_dt,String photo_flag,String cert_photo_address,String data_source,String remakrs,String invalid_flag,String load_dt,String objectid,String country_code_na,String passport_apply_area_na,String passport_apply_rsn_na,String pers_name,String pers_name_seh,String pers_gender_na,String homeplace_na,String hm_cert_type,String hm_cert_type_na,String hm_cert_no,String tw_card_id,String tw_address_code,String identity_code,String issuing_organ_na,String apply_type_na,String accept_organ_na,String filterflag,String revoke_flag,String pers_illegal_flag,String pers_repat_flag,String tw_address_na,String identity_code_na){
		this.country_code=country_code;
		this.passport_type=passport_type;
		this.passport_no=passport_no;
		this.passport_version=passport_version;
		this.passport_heno=passport_heno;
		this.passport_apply_area=passport_apply_area;
		this.passport_apply_rsn=passport_apply_rsn;
		this.passport_hmt_no=passport_hmt_no;
		this.pers_id=pers_id;
		this.pers_name_en=pers_name_en;
		this.pers_name_cn=pers_name_cn;
		this.pers_name_tc=pers_name_tc;
		this.big5_code=big5_code;
		this.pers_name_py=pers_name_py;
		this.verf_name_en=verf_name_en;
		this.pers_birth_date=pers_birth_date;
		this.pers_gender=pers_gender;
		this.homeplace=homeplace;
		this.hmt_cert_type=hmt_cert_type;
		this.hmt_cert_no=hmt_cert_no;
		this.twn_card_id=twn_card_id;
		this.twn_address_code=twn_address_code;
		this.fgn_sts=fgn_sts;
		this.issuing_organ=issuing_organ;
		this.issuing_date=issuing_date;
		this.cert_vld=cert_vld;
		this.first_issuing_date=first_issuing_date;
		this.renewal_nbr=renewal_nbr;
		this.apply_type=apply_type;
		this.pers_telno=pers_telno;
		this.accept_organ=accept_organ;
		this.accept_dt=accept_dt;
		this.photo_flag=photo_flag;
		this.cert_photo_address=cert_photo_address;
		this.data_source=data_source;
		this.remakrs=remakrs;
		this.invalid_flag=invalid_flag;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.country_code_na=country_code_na;
		this.passport_apply_area_na=passport_apply_area_na;
		this.passport_apply_rsn_na=passport_apply_rsn_na;
		this.pers_name=pers_name;
		this.pers_name_seh=pers_name_seh;
		this.pers_gender_na=pers_gender_na;
		this.homeplace_na=homeplace_na;
		this.hm_cert_type=hm_cert_type;
		this.hm_cert_type_na=hm_cert_type_na;
		this.hm_cert_no=hm_cert_no;
		this.tw_card_id=tw_card_id;
		this.tw_address_code=tw_address_code;
		this.identity_code=identity_code;
		this.issuing_organ_na=issuing_organ_na;
		this.apply_type_na=apply_type_na;
		this.accept_organ_na=accept_organ_na;
		this.filterflag=filterflag;
		this.revoke_flag=revoke_flag;
		this.pers_illegal_flag=pers_illegal_flag;
		this.pers_repat_flag=pers_repat_flag;
		this.tw_address_na=tw_address_na;
		this.identity_code_na=identity_code_na;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getPassport_type() {
		return this.passport_type;
	}

	public void setPassport_type(String passport_type) {
		this.passport_type = passport_type;
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

	public String getPassport_heno() {
		return this.passport_heno;
	}

	public void setPassport_heno(String passport_heno) {
		this.passport_heno = passport_heno;
	}

	public String getPassport_apply_area() {
		return this.passport_apply_area;
	}

	public void setPassport_apply_area(String passport_apply_area) {
		this.passport_apply_area = passport_apply_area;
	}

	public String getPassport_apply_rsn() {
		return this.passport_apply_rsn;
	}

	public void setPassport_apply_rsn(String passport_apply_rsn) {
		this.passport_apply_rsn = passport_apply_rsn;
	}

	public String getPassport_hmt_no() {
		return this.passport_hmt_no;
	}

	public void setPassport_hmt_no(String passport_hmt_no) {
		this.passport_hmt_no = passport_hmt_no;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getPers_name_en() {
		return this.pers_name_en;
	}

	public void setPers_name_en(String pers_name_en) {
		this.pers_name_en = pers_name_en;
	}

	public String getPers_name_cn() {
		return this.pers_name_cn;
	}

	public void setPers_name_cn(String pers_name_cn) {
		this.pers_name_cn = pers_name_cn;
	}

	public String getPers_name_tc() {
		return this.pers_name_tc;
	}

	public void setPers_name_tc(String pers_name_tc) {
		this.pers_name_tc = pers_name_tc;
	}

	public String getBig5_code() {
		return this.big5_code;
	}

	public void setBig5_code(String big5_code) {
		this.big5_code = big5_code;
	}

	public String getPers_name_py() {
		return this.pers_name_py;
	}

	public void setPers_name_py(String pers_name_py) {
		this.pers_name_py = pers_name_py;
	}

	public String getVerf_name_en() {
		return this.verf_name_en;
	}

	public void setVerf_name_en(String verf_name_en) {
		this.verf_name_en = verf_name_en;
	}

	public String getPers_birth_date() {
		return this.pers_birth_date;
	}

	public void setPers_birth_date(String pers_birth_date) {
		this.pers_birth_date = pers_birth_date;
	}

	public String getPers_gender() {
		return this.pers_gender;
	}

	public void setPers_gender(String pers_gender) {
		this.pers_gender = pers_gender;
	}

	public String getHomeplace() {
		return this.homeplace;
	}

	public void setHomeplace(String homeplace) {
		this.homeplace = homeplace;
	}

	public String getHmt_cert_type() {
		return this.hmt_cert_type;
	}

	public void setHmt_cert_type(String hmt_cert_type) {
		this.hmt_cert_type = hmt_cert_type;
	}

	public String getHmt_cert_no() {
		return this.hmt_cert_no;
	}

	public void setHmt_cert_no(String hmt_cert_no) {
		this.hmt_cert_no = hmt_cert_no;
	}

	public String getTwn_card_id() {
		return this.twn_card_id;
	}

	public void setTwn_card_id(String twn_card_id) {
		this.twn_card_id = twn_card_id;
	}

	public String getTwn_address_code() {
		return this.twn_address_code;
	}

	public void setTwn_address_code(String twn_address_code) {
		this.twn_address_code = twn_address_code;
	}

	public String getFgn_sts() {
		return this.fgn_sts;
	}

	public void setFgn_sts(String fgn_sts) {
		this.fgn_sts = fgn_sts;
	}

	public String getIssuing_organ() {
		return this.issuing_organ;
	}

	public void setIssuing_organ(String issuing_organ) {
		this.issuing_organ = issuing_organ;
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

	public String getFirst_issuing_date() {
		return this.first_issuing_date;
	}

	public void setFirst_issuing_date(String first_issuing_date) {
		this.first_issuing_date = first_issuing_date;
	}

	public String getRenewal_nbr() {
		return this.renewal_nbr;
	}

	public void setRenewal_nbr(String renewal_nbr) {
		this.renewal_nbr = renewal_nbr;
	}

	public String getApply_type() {
		return this.apply_type;
	}

	public void setApply_type(String apply_type) {
		this.apply_type = apply_type;
	}

	public String getPers_telno() {
		return this.pers_telno;
	}

	public void setPers_telno(String pers_telno) {
		this.pers_telno = pers_telno;
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

	public String getPhoto_flag() {
		return this.photo_flag;
	}

	public void setPhoto_flag(String photo_flag) {
		this.photo_flag = photo_flag;
	}

	public String getCert_photo_address() {
		return this.cert_photo_address;
	}

	public void setCert_photo_address(String cert_photo_address) {
		this.cert_photo_address = cert_photo_address;
	}

	public String getData_source() {
		return this.data_source;
	}

	public void setData_source(String data_source) {
		this.data_source = data_source;
	}

	public String getRemakrs() {
		return this.remakrs;
	}

	public void setRemakrs(String remakrs) {
		this.remakrs = remakrs;
	}

	public String getInvalid_flag() {
		return this.invalid_flag;
	}

	public void setInvalid_flag(String invalid_flag) {
		this.invalid_flag = invalid_flag;
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

	public String getCountry_code_na() {
		return this.country_code_na;
	}

	public void setCountry_code_na(String country_code_na) {
		this.country_code_na = country_code_na;
	}

	public String getPassport_apply_area_na() {
		return this.passport_apply_area_na;
	}

	public void setPassport_apply_area_na(String passport_apply_area_na) {
		this.passport_apply_area_na = passport_apply_area_na;
	}

	public String getPassport_apply_rsn_na() {
		return this.passport_apply_rsn_na;
	}

	public void setPassport_apply_rsn_na(String passport_apply_rsn_na) {
		this.passport_apply_rsn_na = passport_apply_rsn_na;
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

	public String getPers_gender_na() {
		return this.pers_gender_na;
	}

	public void setPers_gender_na(String pers_gender_na) {
		this.pers_gender_na = pers_gender_na;
	}

	public String getHomeplace_na() {
		return this.homeplace_na;
	}

	public void setHomeplace_na(String homeplace_na) {
		this.homeplace_na = homeplace_na;
	}

	public String getHm_cert_type() {
		return this.hm_cert_type;
	}

	public void setHm_cert_type(String hm_cert_type) {
		this.hm_cert_type = hm_cert_type;
	}

	public String getHm_cert_type_na() {
		return this.hm_cert_type_na;
	}

	public void setHm_cert_type_na(String hm_cert_type_na) {
		this.hm_cert_type_na = hm_cert_type_na;
	}

	public String getHm_cert_no() {
		return this.hm_cert_no;
	}

	public void setHm_cert_no(String hm_cert_no) {
		this.hm_cert_no = hm_cert_no;
	}

	public String getTw_card_id() {
		return this.tw_card_id;
	}

	public void setTw_card_id(String tw_card_id) {
		this.tw_card_id = tw_card_id;
	}

	public String getTw_address_code() {
		return this.tw_address_code;
	}

	public void setTw_address_code(String tw_address_code) {
		this.tw_address_code = tw_address_code;
	}

	public String getIdentity_code() {
		return this.identity_code;
	}

	public void setIdentity_code(String identity_code) {
		this.identity_code = identity_code;
	}

	public String getIssuing_organ_na() {
		return this.issuing_organ_na;
	}

	public void setIssuing_organ_na(String issuing_organ_na) {
		this.issuing_organ_na = issuing_organ_na;
	}

	public String getApply_type_na() {
		return this.apply_type_na;
	}

	public void setApply_type_na(String apply_type_na) {
		this.apply_type_na = apply_type_na;
	}

	public String getAccept_organ_na() {
		return this.accept_organ_na;
	}

	public void setAccept_organ_na(String accept_organ_na) {
		this.accept_organ_na = accept_organ_na;
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

	public String getTw_address_na() {
		return this.tw_address_na;
	}

	public void setTw_address_na(String tw_address_na) {
		this.tw_address_na = tw_address_na;
	}

	public String getIdentity_code_na() {
		return this.identity_code_na;
	}

	public void setIdentity_code_na(String identity_code_na) {
		this.identity_code_na = identity_code_na;
	}

}
