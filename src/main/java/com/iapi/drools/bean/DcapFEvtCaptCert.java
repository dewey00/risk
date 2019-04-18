package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 收缴证件信息 dcap_f_evt_capt_cert
 *
 * <p>Date: Thu Sep 27 11:37:39 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFEvtCaptCert  implements Serializable {


	private static final long serialVersionUID =  3379768294170420071L;


	/**
	 * 事件编号，唯一标识（口岸代码 +通道号+出入日期+出入时间+3位流水号）
	 */
	private String evt_id;

	/**
	 * 证件序号
	 */
	private String cert_sn;

	/**
	 * 证件号码
	 */
	private String cert_no;

	/**
	 * 证件类别代码
	 */
	private String cert_type;

	/**
	 * 证件有效期截止日期，VLD：Valid Till
	 */
	private String cert_vld;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键
	 */
	private String pers_id;

	/**
	 * 证件姓名
	 */
	private String cert_name;

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
	 * 发证地行政区划代码
	 */
	private String cert_region_code;

	/**
	 * 居住地详细地址
	 */
	private String curr_address;

	/**
	 * 收缴日期
	 */
	private String capt_date;

	/**
	 * 证件去向
	 */
	private String cert_going;

	/**
	 * 收缴原因代码
	 */
	private String capt_rsn_code;

	/**
	 * 收缴原因说明
	 */
	private String capt_rsn_desc;

	/**
	 * 法律依据
	 */
	private String lgl_basis;

	/**
	 * 决定书有效期（天）
	 */
	private String deci_book_pd;

	/**
	 * 收缴人
	 */
	private String capt_oper;

	/**
	 * 部门代码（3位口岸代码＋3位部门编号）
	 */
	private String dept_code;

	/**
	 * 出具文书单位
	 */
	private String issuing_doc_unit;

	/**
	 * 收缴证件备注
	 */
	private String capt_cert_remarks;

	/**
	 * 口岸代码
	 */
	private String port_code;

	/**
	 * 字
	 */
	private String docs_words;

	/**
	 * 文号
	 */
	private String docs_ref_no;

	/**
	 * 批准人
	 */
	private String approver;

	/**
	 * 填发人
	 */
	private String issuer;

	/**
	 * 填发日期
	 */
	private String issuing_date;

	/**
	 * 承办人
	 */
	private String contractor;

	/**
	 * 条
	 */
	private String clause;

	/**
	 * 款
	 */
	private String sub_clause;

	/**
	 * 项
	 */
	private String item;

	/**
	 * 暂存标志
	 */
	private String temp_flag;

	/**
	 * 变更操作员（记录疑难字处理人）
	 */
	private String chg_oper;

	/**
	 * 变更时间
	 */
	private String chg_dt;

	/**
	 * 作废标志（0:不作废、1：作废）
	 */
	private String invalid_flag;

	/**
	 * 入库时间
	 */
	private String rec_dt;

	/**
	 * 文书类型0：扣留，1：收缴
	 */
	private String doc_type;

	/**
	 * 发文单位
	 */
	private String assign_unit;

	/**
	 * 证件类别号码
	 */
	private String cert_type_id;

	/**
	 * 扩充字段
	 */
	private String ext_cols;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 现持证件种类名称

	 */
	private String cert_type_na;

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
	 * 收缴原因说明名称
	 */
	private String capt_rsn_na;

	/**
	 * 收缴人名称

	 */
	private String capt_oper_na;

	/**
	 * 部门名称

	 */
	private String dept_na;

	/**
	 * 变更操作员名称

	 */
	private String chg_oper_na;

	/**
	 * 口岸名称
	 */
	private String port_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	/**
	 * 发证地行政区划名称

	 */
	private String cert_region_na;

	public  DcapFEvtCaptCert(){super();}

	public  DcapFEvtCaptCert(String evt_id,String cert_sn,String cert_no,String cert_type,String cert_vld,String pers_id,String cert_name,String gender,String birth_date,String country_code,String cert_region_code,String curr_address,String capt_date,String cert_going,String capt_rsn_code,String capt_rsn_desc,String lgl_basis,String deci_book_pd,String capt_oper,String dept_code,String issuing_doc_unit,String capt_cert_remarks,String port_code,String docs_words,String docs_ref_no,String approver,String issuer,String issuing_date,String contractor,String clause,String sub_clause,String item,String temp_flag,String chg_oper,String chg_dt,String invalid_flag,String rec_dt,String doc_type,String assign_unit,String cert_type_id,String ext_cols,String load_dt,String objectid,String cert_type_na,String pers_name_seh,String gender_na,String country_na,String capt_rsn_na,String capt_oper_na,String dept_na,String chg_oper_na,String port_na,String filterflag,String cert_region_na){
		this.evt_id=evt_id;
		this.cert_sn=cert_sn;
		this.cert_no=cert_no;
		this.cert_type=cert_type;
		this.cert_vld=cert_vld;
		this.pers_id=pers_id;
		this.cert_name=cert_name;
		this.gender=gender;
		this.birth_date=birth_date;
		this.country_code=country_code;
		this.cert_region_code=cert_region_code;
		this.curr_address=curr_address;
		this.capt_date=capt_date;
		this.cert_going=cert_going;
		this.capt_rsn_code=capt_rsn_code;
		this.capt_rsn_desc=capt_rsn_desc;
		this.lgl_basis=lgl_basis;
		this.deci_book_pd=deci_book_pd;
		this.capt_oper=capt_oper;
		this.dept_code=dept_code;
		this.issuing_doc_unit=issuing_doc_unit;
		this.capt_cert_remarks=capt_cert_remarks;
		this.port_code=port_code;
		this.docs_words=docs_words;
		this.docs_ref_no=docs_ref_no;
		this.approver=approver;
		this.issuer=issuer;
		this.issuing_date=issuing_date;
		this.contractor=contractor;
		this.clause=clause;
		this.sub_clause=sub_clause;
		this.item=item;
		this.temp_flag=temp_flag;
		this.chg_oper=chg_oper;
		this.chg_dt=chg_dt;
		this.invalid_flag=invalid_flag;
		this.rec_dt=rec_dt;
		this.doc_type=doc_type;
		this.assign_unit=assign_unit;
		this.cert_type_id=cert_type_id;
		this.ext_cols=ext_cols;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.cert_type_na=cert_type_na;
		this.pers_name_seh=pers_name_seh;
		this.gender_na=gender_na;
		this.country_na=country_na;
		this.capt_rsn_na=capt_rsn_na;
		this.capt_oper_na=capt_oper_na;
		this.dept_na=dept_na;
		this.chg_oper_na=chg_oper_na;
		this.port_na=port_na;
		this.filterflag=filterflag;
		this.cert_region_na=cert_region_na;
	}

	public String getEvt_id() {
		return this.evt_id;
	}

	public void setEvt_id(String evt_id) {
		this.evt_id = evt_id;
	}

	public String getCert_sn() {
		return this.cert_sn;
	}

	public void setCert_sn(String cert_sn) {
		this.cert_sn = cert_sn;
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

	public String getCert_vld() {
		return this.cert_vld;
	}

	public void setCert_vld(String cert_vld) {
		this.cert_vld = cert_vld;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getCert_name() {
		return this.cert_name;
	}

	public void setCert_name(String cert_name) {
		this.cert_name = cert_name;
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

	public String getCert_region_code() {
		return this.cert_region_code;
	}

	public void setCert_region_code(String cert_region_code) {
		this.cert_region_code = cert_region_code;
	}

	public String getCurr_address() {
		return this.curr_address;
	}

	public void setCurr_address(String curr_address) {
		this.curr_address = curr_address;
	}

	public String getCapt_date() {
		return this.capt_date;
	}

	public void setCapt_date(String capt_date) {
		this.capt_date = capt_date;
	}

	public String getCert_going() {
		return this.cert_going;
	}

	public void setCert_going(String cert_going) {
		this.cert_going = cert_going;
	}

	public String getCapt_rsn_code() {
		return this.capt_rsn_code;
	}

	public void setCapt_rsn_code(String capt_rsn_code) {
		this.capt_rsn_code = capt_rsn_code;
	}

	public String getCapt_rsn_desc() {
		return this.capt_rsn_desc;
	}

	public void setCapt_rsn_desc(String capt_rsn_desc) {
		this.capt_rsn_desc = capt_rsn_desc;
	}

	public String getLgl_basis() {
		return this.lgl_basis;
	}

	public void setLgl_basis(String lgl_basis) {
		this.lgl_basis = lgl_basis;
	}

	public String getDeci_book_pd() {
		return this.deci_book_pd;
	}

	public void setDeci_book_pd(String deci_book_pd) {
		this.deci_book_pd = deci_book_pd;
	}

	public String getCapt_oper() {
		return this.capt_oper;
	}

	public void setCapt_oper(String capt_oper) {
		this.capt_oper = capt_oper;
	}

	public String getDept_code() {
		return this.dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getIssuing_doc_unit() {
		return this.issuing_doc_unit;
	}

	public void setIssuing_doc_unit(String issuing_doc_unit) {
		this.issuing_doc_unit = issuing_doc_unit;
	}

	public String getCapt_cert_remarks() {
		return this.capt_cert_remarks;
	}

	public void setCapt_cert_remarks(String capt_cert_remarks) {
		this.capt_cert_remarks = capt_cert_remarks;
	}

	public String getPort_code() {
		return this.port_code;
	}

	public void setPort_code(String port_code) {
		this.port_code = port_code;
	}

	public String getDocs_words() {
		return this.docs_words;
	}

	public void setDocs_words(String docs_words) {
		this.docs_words = docs_words;
	}

	public String getDocs_ref_no() {
		return this.docs_ref_no;
	}

	public void setDocs_ref_no(String docs_ref_no) {
		this.docs_ref_no = docs_ref_no;
	}

	public String getApprover() {
		return this.approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getIssuer() {
		return this.issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuing_date() {
		return this.issuing_date;
	}

	public void setIssuing_date(String issuing_date) {
		this.issuing_date = issuing_date;
	}

	public String getContractor() {
		return this.contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getClause() {
		return this.clause;
	}

	public void setClause(String clause) {
		this.clause = clause;
	}

	public String getSub_clause() {
		return this.sub_clause;
	}

	public void setSub_clause(String sub_clause) {
		this.sub_clause = sub_clause;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTemp_flag() {
		return this.temp_flag;
	}

	public void setTemp_flag(String temp_flag) {
		this.temp_flag = temp_flag;
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

	public String getInvalid_flag() {
		return this.invalid_flag;
	}

	public void setInvalid_flag(String invalid_flag) {
		this.invalid_flag = invalid_flag;
	}

	public String getRec_dt() {
		return this.rec_dt;
	}

	public void setRec_dt(String rec_dt) {
		this.rec_dt = rec_dt;
	}

	public String getDoc_type() {
		return this.doc_type;
	}

	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}

	public String getAssign_unit() {
		return this.assign_unit;
	}

	public void setAssign_unit(String assign_unit) {
		this.assign_unit = assign_unit;
	}

	public String getCert_type_id() {
		return this.cert_type_id;
	}

	public void setCert_type_id(String cert_type_id) {
		this.cert_type_id = cert_type_id;
	}

	public String getExt_cols() {
		return this.ext_cols;
	}

	public void setExt_cols(String ext_cols) {
		this.ext_cols = ext_cols;
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

	public String getCapt_rsn_na() {
		return this.capt_rsn_na;
	}

	public void setCapt_rsn_na(String capt_rsn_na) {
		this.capt_rsn_na = capt_rsn_na;
	}

	public String getCapt_oper_na() {
		return this.capt_oper_na;
	}

	public void setCapt_oper_na(String capt_oper_na) {
		this.capt_oper_na = capt_oper_na;
	}

	public String getDept_na() {
		return this.dept_na;
	}

	public void setDept_na(String dept_na) {
		this.dept_na = dept_na;
	}

	public String getChg_oper_na() {
		return this.chg_oper_na;
	}

	public void setChg_oper_na(String chg_oper_na) {
		this.chg_oper_na = chg_oper_na;
	}

	public String getPort_na() {
		return this.port_na;
	}

	public void setPort_na(String port_na) {
		this.port_na = port_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

	public String getCert_region_na() {
		return this.cert_region_na;
	}

	public void setCert_region_na(String cert_region_na) {
		this.cert_region_na = cert_region_na;
	}

}
