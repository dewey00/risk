package com.iapi.drools.bean;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 涉外案事件人员信息 dcap_f_evt_fgn_cas_person
 *
 * <p>Date: Fri Oct 12 15:54:19 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFEvtFgnCasPerson  implements Serializable {


	private static final long serialVersionUID =  3927443866440666865L;


	/**
	 * 案事件内部编号，案事件业务编号自编号
	 */
	private String cas_intr_id;

	/**
	 * 上报省份，省级代码
	 */
	private String rpt_prov;

	/**
	 * 涉案人员内部编号
	 */
	private String cas_pers_intr_id;

	/**
	 * 涉案（事）件角色，涉案角色代码，1-主体；2-被害人；9-其它
	 */
	private String cas_roles_code;

	/**
	 * 侵害人（原涉案人员类别）
	 */
	private String infringer;

	/**
	 * 被侵害对象类别
	 */
	private String infringed_type;

	/**
	 * 侵害对象
	 */
	private String infringee;

	/**
	 * 人身伤害程度，人身伤害程度代码（GA240.13-2000）
	 */
	private String pers_inj_deg;

	/**
	 * 涉案情况
	 */
	private String cas_desc;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键
	 */
	private String pers_id;

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
	 * 中文名
	 */
	private String chn_firstname;

	/**
	 * 中文姓，中国人（含港澳台）为必填项
	 */
	private String chn_surname;

	/**
	 * 中文姓名
	 */
	private String chn_name;

	/**
	 * 性别代码
	 */
	private String gender;

	/**
	 * 出生日期
	 */
	private String birth_date;

	/**
	 * 宗教信仰，宗教信仰代码
	 */
	private String religion_code;

	/**
	 * 当前工作身份，境外人员身份代码
	 */
	private String curr_work_id;

	/**
	 * 国家地区代码
	 */
	private String country_code;

	/**
	 * 户口所在地区划，行政区划代码
	 */
	private String rsdt_region_code;

	/**
	 * 身份证号码
	 */
	private String pers_card_id;

	/**
	 * 现住地，详细通信地址
	 */
	private String curr_address;

	/**
	 * 居住地派出所代码，LPS：Local Police Station
	 */
	private String curr_lps_code;

	/**
	 * 联系电话
	 */
	private String contact_tel;

	/**
	 * 服务处所组织机构代码（原工作单位组织机构代码，组织机构代码）
	 */
	private String srv_unit_org;

	/**
	 * 服务处所
	 */
	private String srv_unit_name;

	/**
	 * 单位联系电话
	 */
	private String srv_unit_tel;

	/**
	 * 邀请单位代码
	 */
	private String invt_unit_code;

	/**
	 * 备注
	 */
	private String remakrs;

	/**
	 * 照片
	 */
	private InputStream photo;

	/**
	 * 案事件编号
	 */
	private String cas_id;

	/**
	 * 涉外案件人员编号
	 */
	private String cas_pers_no;

	/**
	 * 通知使领馆全称
	 */
	private String note_embassy_name;

	/**
	 * 通知使领馆时间
	 */
	private String note_embassy_date;

	/**
	 * 登记日期
	 */
	private String reg_date;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	public  DcapFEvtFgnCasPerson(){super();}

	public  DcapFEvtFgnCasPerson(String cas_intr_id,String rpt_prov,String cas_pers_intr_id,String cas_roles_code,String infringer,String infringed_type,String infringee,String pers_inj_deg,String cas_desc,String pers_id,String firstname,String surname,String eng_name,String chn_firstname,String chn_surname,String chn_name,String gender,String birth_date,String religion_code,String curr_work_id,String country_code,String rsdt_region_code,String pers_card_id,String curr_address,String curr_lps_code,String contact_tel,String srv_unit_org,String srv_unit_name,String srv_unit_tel,String invt_unit_code,String remakrs,InputStream photo,String cas_id,String cas_pers_no,String note_embassy_name,String note_embassy_date,String reg_date,String load_dt){
		this.cas_intr_id=cas_intr_id;
		this.rpt_prov=rpt_prov;
		this.cas_pers_intr_id=cas_pers_intr_id;
		this.cas_roles_code=cas_roles_code;
		this.infringer=infringer;
		this.infringed_type=infringed_type;
		this.infringee=infringee;
		this.pers_inj_deg=pers_inj_deg;
		this.cas_desc=cas_desc;
		this.pers_id=pers_id;
		this.firstname=firstname;
		this.surname=surname;
		this.eng_name=eng_name;
		this.chn_firstname=chn_firstname;
		this.chn_surname=chn_surname;
		this.chn_name=chn_name;
		this.gender=gender;
		this.birth_date=birth_date;
		this.religion_code=religion_code;
		this.curr_work_id=curr_work_id;
		this.country_code=country_code;
		this.rsdt_region_code=rsdt_region_code;
		this.pers_card_id=pers_card_id;
		this.curr_address=curr_address;
		this.curr_lps_code=curr_lps_code;
		this.contact_tel=contact_tel;
		this.srv_unit_org=srv_unit_org;
		this.srv_unit_name=srv_unit_name;
		this.srv_unit_tel=srv_unit_tel;
		this.invt_unit_code=invt_unit_code;
		this.remakrs=remakrs;
		this.photo=photo;
		this.cas_id=cas_id;
		this.cas_pers_no=cas_pers_no;
		this.note_embassy_name=note_embassy_name;
		this.note_embassy_date=note_embassy_date;
		this.reg_date=reg_date;
		this.load_dt=load_dt;
	}

	public String getCas_intr_id() {
		return this.cas_intr_id;
	}

	public void setCas_intr_id(String cas_intr_id) {
		this.cas_intr_id = cas_intr_id;
	}

	public String getRpt_prov() {
		return this.rpt_prov;
	}

	public void setRpt_prov(String rpt_prov) {
		this.rpt_prov = rpt_prov;
	}

	public String getCas_pers_intr_id() {
		return this.cas_pers_intr_id;
	}

	public void setCas_pers_intr_id(String cas_pers_intr_id) {
		this.cas_pers_intr_id = cas_pers_intr_id;
	}

	public String getCas_roles_code() {
		return this.cas_roles_code;
	}

	public void setCas_roles_code(String cas_roles_code) {
		this.cas_roles_code = cas_roles_code;
	}

	public String getInfringer() {
		return this.infringer;
	}

	public void setInfringer(String infringer) {
		this.infringer = infringer;
	}

	public String getInfringed_type() {
		return this.infringed_type;
	}

	public void setInfringed_type(String infringed_type) {
		this.infringed_type = infringed_type;
	}

	public String getInfringee() {
		return this.infringee;
	}

	public void setInfringee(String infringee) {
		this.infringee = infringee;
	}

	public String getPers_inj_deg() {
		return this.pers_inj_deg;
	}

	public void setPers_inj_deg(String pers_inj_deg) {
		this.pers_inj_deg = pers_inj_deg;
	}

	public String getCas_desc() {
		return this.cas_desc;
	}

	public void setCas_desc(String cas_desc) {
		this.cas_desc = cas_desc;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
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

	public String getChn_firstname() {
		return this.chn_firstname;
	}

	public void setChn_firstname(String chn_firstname) {
		this.chn_firstname = chn_firstname;
	}

	public String getChn_surname() {
		return this.chn_surname;
	}

	public void setChn_surname(String chn_surname) {
		this.chn_surname = chn_surname;
	}

	public String getChn_name() {
		return this.chn_name;
	}

	public void setChn_name(String chn_name) {
		this.chn_name = chn_name;
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

	public String getReligion_code() {
		return this.religion_code;
	}

	public void setReligion_code(String religion_code) {
		this.religion_code = religion_code;
	}

	public String getCurr_work_id() {
		return this.curr_work_id;
	}

	public void setCurr_work_id(String curr_work_id) {
		this.curr_work_id = curr_work_id;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getRsdt_region_code() {
		return this.rsdt_region_code;
	}

	public void setRsdt_region_code(String rsdt_region_code) {
		this.rsdt_region_code = rsdt_region_code;
	}

	public String getPers_card_id() {
		return this.pers_card_id;
	}

	public void setPers_card_id(String pers_card_id) {
		this.pers_card_id = pers_card_id;
	}

	public String getCurr_address() {
		return this.curr_address;
	}

	public void setCurr_address(String curr_address) {
		this.curr_address = curr_address;
	}

	public String getCurr_lps_code() {
		return this.curr_lps_code;
	}

	public void setCurr_lps_code(String curr_lps_code) {
		this.curr_lps_code = curr_lps_code;
	}

	public String getContact_tel() {
		return this.contact_tel;
	}

	public void setContact_tel(String contact_tel) {
		this.contact_tel = contact_tel;
	}

	public String getSrv_unit_org() {
		return this.srv_unit_org;
	}

	public void setSrv_unit_org(String srv_unit_org) {
		this.srv_unit_org = srv_unit_org;
	}

	public String getSrv_unit_name() {
		return this.srv_unit_name;
	}

	public void setSrv_unit_name(String srv_unit_name) {
		this.srv_unit_name = srv_unit_name;
	}

	public String getSrv_unit_tel() {
		return this.srv_unit_tel;
	}

	public void setSrv_unit_tel(String srv_unit_tel) {
		this.srv_unit_tel = srv_unit_tel;
	}

	public String getInvt_unit_code() {
		return this.invt_unit_code;
	}

	public void setInvt_unit_code(String invt_unit_code) {
		this.invt_unit_code = invt_unit_code;
	}

	public String getRemakrs() {
		return this.remakrs;
	}

	public void setRemakrs(String remakrs) {
		this.remakrs = remakrs;
	}

	public InputStream getPhoto() {
		return this.photo;
	}

	public void setPhoto(InputStream photo) {
		this.photo = photo;
	}

	public String getCas_id() {
		return this.cas_id;
	}

	public void setCas_id(String cas_id) {
		this.cas_id = cas_id;
	}

	public String getCas_pers_no() {
		return this.cas_pers_no;
	}

	public void setCas_pers_no(String cas_pers_no) {
		this.cas_pers_no = cas_pers_no;
	}

	public String getNote_embassy_name() {
		return this.note_embassy_name;
	}

	public void setNote_embassy_name(String note_embassy_name) {
		this.note_embassy_name = note_embassy_name;
	}

	public String getNote_embassy_date() {
		return this.note_embassy_date;
	}

	public void setNote_embassy_date(String note_embassy_date) {
		this.note_embassy_date = note_embassy_date;
	}

	public String getReg_date() {
		return this.reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getLoad_dt() {
		return this.load_dt;
	}

	public void setLoad_dt(String load_dt) {
		this.load_dt = load_dt;
	}

}
