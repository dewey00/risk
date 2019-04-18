package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 中国公民出国境证件签注信息 dcap_f_per_cert_chn_visa
 *
 * <p>Date: Thu Sep 27 11:38:32 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerCertChnVisa  implements Serializable {


	private static final long serialVersionUID =  3087335875881962073L;


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
	 * 签注签发日期 
	 VARCHAR2(8)

	 */
	private String endr_issuing_date;

	/**
	 * 有效次数 

	 */
	private String valid_nbr;

	/**
	 * 前往国家地区，国家/地区代码 

	 */
	private String to_country_code;

	/**
	 * 签注起始日期 

	 */
	private String endr_start_date;

	/**
	 * 签注终止日期 

	 */
	private String endr_expr_date;

	/**
	 * 签注有效期 

	 */
	private String endr_valid;

	/**
	 * 签注审批机关 

	 */
	private String endr_aprv_dept;

	/**
	 * 制证单位，行政区划代码 

	 */
	private String accred_unit;

	/**
	 * 受理时间，格式为YYYYMMDDHH24MISS 

	 */
	private String accept_dt;

	/**
	 * 受理机关，行政区划代码 

	 */
	private String accept_dept;

	/**
	 * 停留期限 

	 */
	private String period;

	/**
	 * 入境许可类别 

	 */
	private String entry_prmt_type;

	/**
	 * 许可证号码 

	 */
	private String permit_no;

	/**
	 * 备案单位代码 

	 */
	private String filing_unit_code;

	/**
	 * 备案单位说明 
	 VARCHAR2(60)

	 */
	private String filing_unit_name;

	/**
	 * 上报省份，省级代码 

	 */
	private String rpt_prov;

	/**
	 * 户籍地省份 

	 */
	private String rsdt_prov;

	/**
	 * 户籍地异地标识 

	 */
	private String rsdt_remote_flag;

	/**
	 * 发证地省份 

	 */
	private String issuing_prov;

	/**
	 * 发证地异地标识 

	 */
	private String issuing_remote_flag;

	/**
	 * 分区列 

	 */
	private String pratition_col;

	/**
	 * 加载时间戳 

	 */
	private String load_dt;

	/**
	 * 证件类型名称
	 */
	private String cert_type_na;

	/**
	 * 签注种类
	 */
	private String endr_type_na;

	/**
	 * 前往国家地区名称
	 */
	private String to_country_code_na;

	/**
	 * 签注有效期名称
	 */
	private String endr_valid_na;

	/**
	 * 签注审批机关名称
	 */
	private String endr_aprv_dept_na;

	/**
	 * 制证单位名称
	 */
	private String accred_unit_na;

	/**
	 * 受理机关名称
	 */
	private String accept_dept_na;

	/**
	 * 入境许可类别名称
	 */
	private String entry_prmt_type_na;

	/**
	 * 上报省份名称
	 */
	private String rpt_prov_na;

	/**
	 * 户籍地省份名称
	 */
	private String rsdt_prov_na;

	/**
	 * 发证地省份名称
	 */
	private String issuing_prov_na;

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

	/**
	 * 0
	 */
	private String objectid;

	public  DcapFPerCertChnVisa(){super();}

	public  DcapFPerCertChnVisa(String pers_id,String cert_no,String cert_type,String endr_type,String endr_no,String endr_issuing_date,String valid_nbr,String to_country_code,String endr_start_date,String endr_expr_date,String endr_valid,String endr_aprv_dept,String accred_unit,String accept_dt,String accept_dept,String period,String entry_prmt_type,String permit_no,String filing_unit_code,String filing_unit_name,String rpt_prov,String rsdt_prov,String rsdt_remote_flag,String issuing_prov,String issuing_remote_flag,String pratition_col,String load_dt,String cert_type_na,String endr_type_na,String to_country_code_na,String endr_valid_na,String endr_aprv_dept_na,String accred_unit_na,String accept_dept_na,String entry_prmt_type_na,String rpt_prov_na,String rsdt_prov_na,String issuing_prov_na,String filterflag,String revoke_flag,String pers_illegal_flag,String pers_repat_flag,String objectid){
		this.pers_id=pers_id;
		this.cert_no=cert_no;
		this.cert_type=cert_type;
		this.endr_type=endr_type;
		this.endr_no=endr_no;
		this.endr_issuing_date=endr_issuing_date;
		this.valid_nbr=valid_nbr;
		this.to_country_code=to_country_code;
		this.endr_start_date=endr_start_date;
		this.endr_expr_date=endr_expr_date;
		this.endr_valid=endr_valid;
		this.endr_aprv_dept=endr_aprv_dept;
		this.accred_unit=accred_unit;
		this.accept_dt=accept_dt;
		this.accept_dept=accept_dept;
		this.period=period;
		this.entry_prmt_type=entry_prmt_type;
		this.permit_no=permit_no;
		this.filing_unit_code=filing_unit_code;
		this.filing_unit_name=filing_unit_name;
		this.rpt_prov=rpt_prov;
		this.rsdt_prov=rsdt_prov;
		this.rsdt_remote_flag=rsdt_remote_flag;
		this.issuing_prov=issuing_prov;
		this.issuing_remote_flag=issuing_remote_flag;
		this.pratition_col=pratition_col;
		this.load_dt=load_dt;
		this.cert_type_na=cert_type_na;
		this.endr_type_na=endr_type_na;
		this.to_country_code_na=to_country_code_na;
		this.endr_valid_na=endr_valid_na;
		this.endr_aprv_dept_na=endr_aprv_dept_na;
		this.accred_unit_na=accred_unit_na;
		this.accept_dept_na=accept_dept_na;
		this.entry_prmt_type_na=entry_prmt_type_na;
		this.rpt_prov_na=rpt_prov_na;
		this.rsdt_prov_na=rsdt_prov_na;
		this.issuing_prov_na=issuing_prov_na;
		this.filterflag=filterflag;
		this.revoke_flag=revoke_flag;
		this.pers_illegal_flag=pers_illegal_flag;
		this.pers_repat_flag=pers_repat_flag;
		this.objectid=objectid;
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

	public String getEndr_issuing_date() {
		return this.endr_issuing_date;
	}

	public void setEndr_issuing_date(String endr_issuing_date) {
		this.endr_issuing_date = endr_issuing_date;
	}

	public String getValid_nbr() {
		return this.valid_nbr;
	}

	public void setValid_nbr(String valid_nbr) {
		this.valid_nbr = valid_nbr;
	}

	public String getTo_country_code() {
		return this.to_country_code;
	}

	public void setTo_country_code(String to_country_code) {
		this.to_country_code = to_country_code;
	}

	public String getEndr_start_date() {
		return this.endr_start_date;
	}

	public void setEndr_start_date(String endr_start_date) {
		this.endr_start_date = endr_start_date;
	}

	public String getEndr_expr_date() {
		return this.endr_expr_date;
	}

	public void setEndr_expr_date(String endr_expr_date) {
		this.endr_expr_date = endr_expr_date;
	}

	public String getEndr_valid() {
		return this.endr_valid;
	}

	public void setEndr_valid(String endr_valid) {
		this.endr_valid = endr_valid;
	}

	public String getEndr_aprv_dept() {
		return this.endr_aprv_dept;
	}

	public void setEndr_aprv_dept(String endr_aprv_dept) {
		this.endr_aprv_dept = endr_aprv_dept;
	}

	public String getAccred_unit() {
		return this.accred_unit;
	}

	public void setAccred_unit(String accred_unit) {
		this.accred_unit = accred_unit;
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

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getEntry_prmt_type() {
		return this.entry_prmt_type;
	}

	public void setEntry_prmt_type(String entry_prmt_type) {
		this.entry_prmt_type = entry_prmt_type;
	}

	public String getPermit_no() {
		return this.permit_no;
	}

	public void setPermit_no(String permit_no) {
		this.permit_no = permit_no;
	}

	public String getFiling_unit_code() {
		return this.filing_unit_code;
	}

	public void setFiling_unit_code(String filing_unit_code) {
		this.filing_unit_code = filing_unit_code;
	}

	public String getFiling_unit_name() {
		return this.filing_unit_name;
	}

	public void setFiling_unit_name(String filing_unit_name) {
		this.filing_unit_name = filing_unit_name;
	}

	public String getRpt_prov() {
		return this.rpt_prov;
	}

	public void setRpt_prov(String rpt_prov) {
		this.rpt_prov = rpt_prov;
	}

	public String getRsdt_prov() {
		return this.rsdt_prov;
	}

	public void setRsdt_prov(String rsdt_prov) {
		this.rsdt_prov = rsdt_prov;
	}

	public String getRsdt_remote_flag() {
		return this.rsdt_remote_flag;
	}

	public void setRsdt_remote_flag(String rsdt_remote_flag) {
		this.rsdt_remote_flag = rsdt_remote_flag;
	}

	public String getIssuing_prov() {
		return this.issuing_prov;
	}

	public void setIssuing_prov(String issuing_prov) {
		this.issuing_prov = issuing_prov;
	}

	public String getIssuing_remote_flag() {
		return this.issuing_remote_flag;
	}

	public void setIssuing_remote_flag(String issuing_remote_flag) {
		this.issuing_remote_flag = issuing_remote_flag;
	}

	public String getPratition_col() {
		return this.pratition_col;
	}

	public void setPratition_col(String pratition_col) {
		this.pratition_col = pratition_col;
	}

	public String getLoad_dt() {
		return this.load_dt;
	}

	public void setLoad_dt(String load_dt) {
		this.load_dt = load_dt;
	}

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getEndr_type_na() {
		return this.endr_type_na;
	}

	public void setEndr_type_na(String endr_type_na) {
		this.endr_type_na = endr_type_na;
	}

	public String getTo_country_code_na() {
		return this.to_country_code_na;
	}

	public void setTo_country_code_na(String to_country_code_na) {
		this.to_country_code_na = to_country_code_na;
	}

	public String getEndr_valid_na() {
		return this.endr_valid_na;
	}

	public void setEndr_valid_na(String endr_valid_na) {
		this.endr_valid_na = endr_valid_na;
	}

	public String getEndr_aprv_dept_na() {
		return this.endr_aprv_dept_na;
	}

	public void setEndr_aprv_dept_na(String endr_aprv_dept_na) {
		this.endr_aprv_dept_na = endr_aprv_dept_na;
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

	public String getEntry_prmt_type_na() {
		return this.entry_prmt_type_na;
	}

	public void setEntry_prmt_type_na(String entry_prmt_type_na) {
		this.entry_prmt_type_na = entry_prmt_type_na;
	}

	public String getRpt_prov_na() {
		return this.rpt_prov_na;
	}

	public void setRpt_prov_na(String rpt_prov_na) {
		this.rpt_prov_na = rpt_prov_na;
	}

	public String getRsdt_prov_na() {
		return this.rsdt_prov_na;
	}

	public void setRsdt_prov_na(String rsdt_prov_na) {
		this.rsdt_prov_na = rsdt_prov_na;
	}

	public String getIssuing_prov_na() {
		return this.issuing_prov_na;
	}

	public void setIssuing_prov_na(String issuing_prov_na) {
		this.issuing_prov_na = issuing_prov_na;
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

	public String getObjectid() {
		return this.objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

}
