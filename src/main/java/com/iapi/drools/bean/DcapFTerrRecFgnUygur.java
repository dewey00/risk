package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 外籍维族人信息 dcap_f_terr_rec_fgn_uygur
 *
 * <p>Date: Fri Oct 12 15:49:46 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFTerrRecFgnUygur  implements Serializable {


	private static final long serialVersionUID =  6349669851471329291L;


	/**
	 * 备案表主键
	 */
	private String rec_id;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键
	 */
	private String pers_id;

	/**
	 * 中文姓名
	 */
	private String chn_name;

	/**
	 * 签证种类
	 */
	private String visa_type;

	/**
	 * 英文姓名
	 */
	private String eng_name;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	/**
	 * 国家地区代码
	 */
	private String country_code;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 录入时间
	 */
	private String edit_dt;

	/**
	 * 原身份证号码
	 */
	private String orig_pers_card_id;

	/**
	 * 性别代码
	 */
	private String gender;

	/**
	 * 现护照号
	 */
	private String curr_cert_no;

	/**
	 * 职业
	 */
	private String prof;

	/**
	 * 出生地，国家地区代码或2位省级地区代码、台湾地区代码
	 */
	private String pers_birth_place;

	/**
	 * 拟到访地
	 */
	private String to_visit;

	/**
	 * 报回日期
	 */
	private String back_date;

	/**
	 * 现护照出生日期
	 */
	private String curr_cert_birth_date;

	/**
	 * 原身份证出生日期
	 */
	private String orig_card_birth_date;

	/**
	 * 删除标志
	 */
	private String del_flag;

	/**
	 * 在华联系人姓名
	 */
	private String chn_contact_name;

	/**
	 * 在华联系人电话
	 */
	private String chn_contact_tel;

	/**
	 * 原证件号
	 */
	private String orig_cert_no;

	private String orig_cert_no1;

	private String orig_cert_no2;

	public  DcapFTerrRecFgnUygur(){super();}

	public  DcapFTerrRecFgnUygur(String rec_id,String pers_id,String chn_name,String visa_type,String eng_name,String load_dt,String country_code,String remark,String edit_dt,String orig_pers_card_id,String gender,String curr_cert_no,String prof,String pers_birth_place,String to_visit,String back_date,String curr_cert_birth_date,String orig_card_birth_date,String del_flag,String chn_contact_name,String chn_contact_tel,String orig_cert_no,String orig_cert_no1,String orig_cert_no2){
		this.rec_id=rec_id;
		this.pers_id=pers_id;
		this.chn_name=chn_name;
		this.visa_type=visa_type;
		this.eng_name=eng_name;
		this.load_dt=load_dt;
		this.country_code=country_code;
		this.remark=remark;
		this.edit_dt=edit_dt;
		this.orig_pers_card_id=orig_pers_card_id;
		this.gender=gender;
		this.curr_cert_no=curr_cert_no;
		this.prof=prof;
		this.pers_birth_place=pers_birth_place;
		this.to_visit=to_visit;
		this.back_date=back_date;
		this.curr_cert_birth_date=curr_cert_birth_date;
		this.orig_card_birth_date=orig_card_birth_date;
		this.del_flag=del_flag;
		this.chn_contact_name=chn_contact_name;
		this.chn_contact_tel=chn_contact_tel;
		this.orig_cert_no=orig_cert_no;
		this.orig_cert_no1=orig_cert_no1;
		this.orig_cert_no2=orig_cert_no2;
	}

	public String getRec_id() {
		return this.rec_id;
	}

	public void setRec_id(String rec_id) {
		this.rec_id = rec_id;
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

	public String getVisa_type() {
		return this.visa_type;
	}

	public void setVisa_type(String visa_type) {
		this.visa_type = visa_type;
	}

	public String getEng_name() {
		return this.eng_name;
	}

	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}

	public String getLoad_dt() {
		return this.load_dt;
	}

	public void setLoad_dt(String load_dt) {
		this.load_dt = load_dt;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEdit_dt() {
		return this.edit_dt;
	}

	public void setEdit_dt(String edit_dt) {
		this.edit_dt = edit_dt;
	}

	public String getOrig_pers_card_id() {
		return this.orig_pers_card_id;
	}

	public void setOrig_pers_card_id(String orig_pers_card_id) {
		this.orig_pers_card_id = orig_pers_card_id;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurr_cert_no() {
		return this.curr_cert_no;
	}

	public void setCurr_cert_no(String curr_cert_no) {
		this.curr_cert_no = curr_cert_no;
	}

	public String getProf() {
		return this.prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getPers_birth_place() {
		return this.pers_birth_place;
	}

	public void setPers_birth_place(String pers_birth_place) {
		this.pers_birth_place = pers_birth_place;
	}

	public String getTo_visit() {
		return this.to_visit;
	}

	public void setTo_visit(String to_visit) {
		this.to_visit = to_visit;
	}

	public String getBack_date() {
		return this.back_date;
	}

	public void setBack_date(String back_date) {
		this.back_date = back_date;
	}

	public String getCurr_cert_birth_date() {
		return this.curr_cert_birth_date;
	}

	public void setCurr_cert_birth_date(String curr_cert_birth_date) {
		this.curr_cert_birth_date = curr_cert_birth_date;
	}

	public String getOrig_card_birth_date() {
		return this.orig_card_birth_date;
	}

	public void setOrig_card_birth_date(String orig_card_birth_date) {
		this.orig_card_birth_date = orig_card_birth_date;
	}

	public String getDel_flag() {
		return this.del_flag;
	}

	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	public String getChn_contact_name() {
		return this.chn_contact_name;
	}

	public void setChn_contact_name(String chn_contact_name) {
		this.chn_contact_name = chn_contact_name;
	}

	public String getChn_contact_tel() {
		return this.chn_contact_tel;
	}

	public void setChn_contact_tel(String chn_contact_tel) {
		this.chn_contact_tel = chn_contact_tel;
	}

	public String getOrig_cert_no() {
		return this.orig_cert_no;
	}

	public void setOrig_cert_no(String orig_cert_no) {
		this.orig_cert_no = orig_cert_no;
	}

	public String getOrig_cert_no1() {
		return this.orig_cert_no1;
	}

	public void setOrig_cert_no1(String orig_cert_no1) {
		this.orig_cert_no1 = orig_cert_no1;
	}

	public String getOrig_cert_no2() {
		return this.orig_cert_no2;
	}

	public void setOrig_cert_no2(String orig_cert_no2) {
		this.orig_cert_no2 = orig_cert_no2;
	}

}
