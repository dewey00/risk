package com.iapi.drools.bean;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 违法违规旅客信息 dcap_f_evt_psr_illegal
 *
 * <p>Date: Thu Sep 27 11:38:11 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFEvtPsrIllegal  implements Serializable {


	private static final long serialVersionUID =  8753082541852965683L;


	/**
	 * 事件编号，唯一标识（口岸代码 +通道号+出入日期+出入时间+3位流水号） 

	 */
	private String evt_id;

	/**
	 * 关联事件编号，唯一标识（口岸代码 +通道号+出入日期+出入时间+3位流水号） 

	 */
	private String rlat_evt_id;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键 

	 */
	private String pers_id;

	/**
	 * 中文姓名或英文姓名 

	 */
	private String pers_name;

	/**
	 * 超长姓名备注 

	 */
	private String long_name_desc;

	/**
	 * 疑难字说明 

	 */
	private String complex_desc;

	/**
	 * 人员类别代码 

	 */
	private String pers_imm_type;

	/**
	 * 国家地区代码 

	 */
	private String country_code;

	/**
	 * 性别代码 

	 */
	private String gender;

	/**
	 * 出生日期 

	 */
	private String birth_date;

	/**
	 * 证件种类 

	 */
	private String cert_type;

	/**
	 * 证件号码 

	 */
	private String cert_no;

	/**
	 * 签证（注）号码 

	 */
	private String visas_no;

	/**
	 * 签证（注）种类 

	 */
	private String visas_type;

	/**
	 * 停留期限 

	 */
	private String period;

	/**
	 * 第二姓名 

	 */
	private String second_pers_name;

	/**
	 * 第二出生日期 

	 */
	private String sec_birth_date;

	/**
	 * 第二证件号码 

	 */
	private String sec_cert_no;

	/**
	 * 第二证件类型代码 

	 */
	private String sec_cert_type;

	/**
	 * 发证地行政区划代码 

	 */
	private String cert_region_code;

	/**
	 * 遣返遣送国家地区代码 

	 */
	private String repat_country_code;

	/**
	 * 遣返遣送原因代码 

	 */
	private String repat_rsn_code;

	/**
	 * 出境口岸代码
	 */
	private String exit_port_code;

	/**
	 * 出境时间 

	 */
	private String exit_dt;

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
	 * 前往来自国 

	 */
	private String tf_country_code;

	/**
	 * 始发地目的地 

	 */
	private String dept_dest;

	/**
	 * 出入境事由代码 

	 */
	private String imm_rsn_code;

	/**
	 * 通道号 

	 */
	private String channel_no;

	/**
	 * 内部团号（1位团体类型+5位组团单位+10位日期时间+4位通道号+1位标识位） 

	 */
	private String nin_grp_no;

	/**
	 * 旅行团号 

	 */
	private String tour_grp_no;

	/**
	 * 场地代码
	 */
	private String site_code;

	/**
	 * 曾处理部门
	 */
	private String ori_deal_dept;

	/**
	 * 查控标志（1:已查控） 

	 */
	private String ck_flag;

	/**
	 * 人员异常提交理由 

	 */
	private String pers_excp_rsn;

	/**
	 * 事件类别（以逗号间隔：**，**） 

	 */
	private String evt_types;

	/**
	 * 事件性质代码 

	 */
	private String evt_char_code;

	/**
	 * 检查员描述 

	 */
	private String inspector_desc;

	/**
	 * 事件描述
	 */
	private String evt_desc;

	/**
	 * 事件主题 

	 */
	private String evt_theme;

	/**
	 * 公文种类代码 

	 */
	private String docs_type;

	/**
	 * 录入标志（1：后台录入） 

	 */
	private String edit_flag;

	/**
	 * 审批人 

	 */
	private String approver;

	/**
	 * 审批级别 

	 */
	private String aprv_level;

	/**
	 * 临重控常控事件编号 

	 */
	private String lzk_evt_id;

	/**
	 * 解屏人，US：Unlock Screen 

	 */
	private String us_oper;

	/**
	 * 解屏时间 

	 */
	private String us_dt;

	/**
	 * 发现人，查获人 

	 */
	private String catch_oper;

	/**
	 * 发现部门代码 

	 */
	private String catch_dept_code;

	/**
	 * 发现时间
	 */
	private String catch_dt;

	/**
	 * 录入人 

	 */
	private String edit_oper;

	/**
	 * 录入时间 

	 */
	private String edit_dt;

	/**
	 * 限制字段
	 */
	private String limit_field;

	/**
	 * 检查标志（0预检，1正检） 

	 */
	private String check_flag;

	/**
	 * 出入境标志（0出入港；1出入境） 

	 */
	private String imm_flag;

	/**
	 * 资料来源（团体、船舶预检） 

	 */
	private String ori_resource;

	/**
	 * 事件处理标志 

	 */
	private String evt_deal_flag;

	/**
	 * 看管人信息：看管人帐号+姓名、看管时间（多个） 

	 */
	private String watch_oper_info;

	/**
	 * 民族代码 

	 */
	private String nation_code;

	/**
	 * 自定义代码 

	 */
	private String user_define_code;

	/**
	 * 后台补录标记（0：非后台补录，1：后台补录） 

	 */
	private String back_flag;

	/**
	 * 出入标志，1入境，2出境，3出入境 
	 VARCHAR2(1)

	 */
	private String in_out_flag;

	/**
	 * 自助通道标记（1：自助通道验放，0：非自助通道验放） 

	 */
	private String self_channel_flag;

	/**
	 * 确定事件性质代码 

	 */
	private String conf_evt_char_code;

	/**
	 * 处理结果代码(逗号分开) 

	 */
	private String ill_deal_rsn;

	/**
	 * 没收金额 

	 */
	private String forfeit_amt;

	/**
	 * 罚款金额 

	 */
	private String punish_amt;

	/**
	 * 归档后备注 

	 */
	private String aft_remarks;

	/**
	 * 拘留天数 

	 */
	private String hold_day_num;

	/**
	 * 确认时间 

	 */
	private String confirm_dt;

	/**
	 * 作废标志（0:不作废、1：作废） 

	 */
	private String invalid_flag;

	/**
	 * 作废原因 

	 */
	private String invalid_rsn;

	/**
	 * 是否进出入境库（1：进、0 ：不进） 
	 VARCHAR2(1)

	 */
	private String rec_imm_flag;

	/**
	 * 确认事件类别代码 

	 */
	private String conf_evt_type;

	/**
	 * 入库时间戳 

	 */
	private String rec_dt;

	/**
	 * 持证人工作单位名称 
	 持证人工作单位

	 */
	private String psr_unit_name;

	/**
	 * 自述人ID 

	 */
	private String confess_id;

	/**
	 * 自述姓名 

	 */
	private String confess_name;

	/**
	 * 自述出生日期 

	 */
	private String confess_birth_date;

	/**
	 * 自述国家地区代码 

	 */
	private String confess_country_code;

	/**
	 * 自述居住地行政区划 

	 */
	private String confess_region_code;

	/**
	 * 自述证件类型代码 

	 */
	private String confess_cert_type;

	/**
	 * 自述证件号码 

	 */
	private String confess_cert_no;

	/**
	 * 自述身份证号 

	 */
	private String confess_card_id;

	/**
	 * 自述住址 

	 */
	private String confess_address5;

	/**
	 * 违法违规人员照片 

	 */
	private InputStream ill_psr_photo;

	/**
	 * 违法违规人员证件照片 

	 */
	private InputStream ill_psr_cert_photo;

	/**
	 * 遣返遣送标志，1：遣返遣送转来数据，0：非遣返遣送数据 

	 */
	private String from_repat_flag;

	/**
	 * 航线代码 

	 */
	private String airway_code;

	/**
	 * 加载时间戳 

	 */
	private String load_dt;

	/**
	 * 表名加+pers_id
	 */
	private String objectid;

	/**
	 * 人员姓名拼音
	 */
	private String pers_name_seh;

	/**
	 * 人员出入境类别名称
	 */
	private String pers_imm_type_na;

	/**
	 * 国家地区名称
	 */
	private String country_na;

	/**
	 * 性别名称
	 */
	private String gender_na;

	/**
	 * 证件类型名称
	 */
	private String cert_type_na;

	/**
	 * 签证类型名称

	 */
	private String visas_type_na;

	/**
	 * 第二证件类型名称

	 */
	private String sec_cert_type_na;

	/**
	 * 发证地行政区划名称

	 */
	private String cert_region_na;

	/**
	 * 遣返遣送国家地区名称

	 */
	private String repat_country_na;

	/**
	 * 遣返遣送原因说明

	 */
	private String repat_rsn_na;

	/**
	 * 出境口岸名称

	 */
	private String exit_port_na;

	/**
	 * 出入境口岸名称

	 */
	private String imm_port_na;

	/**
	 * 交通方式名称

	 */
	private String trs_mode_na;

	/**
	 * 前往来自国名称

	 */
	private String tf_country_na;

	/**
	 * 始发地目的地名称

	 */
	private String dept_dest_na;

	/**
	 * 出入境事由说明

	 */
	private String imm_rsn_na;

	/**
	 * 曾处理部门名称

	 */
	private String ori_deal_dept_na;

	/**
	 * 人员异常提交理由名称

	 */
	private String pers_excp_rsn_na;

	/**
	 * 事件类别名称

	 */
	private String evt_types_na;

	/**
	 * 事件性质名称

	 */
	private String evt_char_na;

	/**
	 * 公文种类代码名称

	 */
	private String docs_type_na;

	/**
	 * 审批人名称

	 */
	private String approver_na;

	/**
	 * 审批级别名称

	 */
	private String aprv_level_na;

	/**
	 * 解屏人名称

	 */
	private String us_oper_na;

	/**
	 * 发现人，查获人名称

	 */
	private String catch_oper_na;

	/**
	 * 发现部门名称

	 */
	private String catch_dept_na;

	/**
	 * 录入人名称

	 */
	private String edit_oper_na;

	/**
	 * 资料来源（团体、船舶预检）名称

	 */
	private String ori_resource_na;

	/**
	 * 民族说明

	 */
	private String nation_na;

	/**
	 * 自定义代码名称

	 */
	private String user_define_code_na;

	/**
	 * 确定事件性质名称

	 */
	private String conf_evt_char_na;

	/**
	 * 处理结果说明

	 */
	private String ill_deal_rsn_na;

	/**
	 * 确认事件类别说明

	 */
	private String conf_evt_type_na;

	/**
	 * 自述国家地区名称

	 */
	private String confess_country_na;

	/**
	 * 自述居住地行政区名称

	 */
	private String confess_region_na;

	/**
	 * 自述证件类型名称

	 */
	private String confess_cert_type_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	public  DcapFEvtPsrIllegal(){super();}

	public  DcapFEvtPsrIllegal(String evt_id,String rlat_evt_id,String pers_id,String pers_name,String long_name_desc,String complex_desc,String pers_imm_type,String country_code,String gender,String birth_date,String cert_type,String cert_no,String visas_no,String visas_type,String period,String second_pers_name,String sec_birth_date,String sec_cert_no,String sec_cert_type,String cert_region_code,String repat_country_code,String repat_rsn_code,String exit_port_code,String exit_dt,String imm_port_code,String trs_mode,String trs_id,String tf_country_code,String dept_dest,String imm_rsn_code,String channel_no,String nin_grp_no,String tour_grp_no,String site_code,String ori_deal_dept,String ck_flag,String pers_excp_rsn,String evt_types,String evt_char_code,String inspector_desc,String evt_desc,String evt_theme,String docs_type,String edit_flag,String approver,String aprv_level,String lzk_evt_id,String us_oper,String us_dt,String catch_oper,String catch_dept_code,String catch_dt,String edit_oper,String edit_dt,String limit_field,String check_flag,String imm_flag,String ori_resource,String evt_deal_flag,String watch_oper_info,String nation_code,String user_define_code,String back_flag,String in_out_flag,String self_channel_flag,String conf_evt_char_code,String ill_deal_rsn,String forfeit_amt,String punish_amt,String aft_remarks,String hold_day_num,String confirm_dt,String invalid_flag,String invalid_rsn,String rec_imm_flag,String conf_evt_type,String rec_dt,String psr_unit_name,String confess_id,String confess_name,String confess_birth_date,String confess_country_code,String confess_region_code,String confess_cert_type,String confess_cert_no,String confess_card_id,String confess_address5,InputStream ill_psr_photo,InputStream ill_psr_cert_photo,String from_repat_flag,String airway_code,String load_dt,String objectid,String pers_name_seh,String pers_imm_type_na,String country_na,String gender_na,String cert_type_na,String visas_type_na,String sec_cert_type_na,String cert_region_na,String repat_country_na,String repat_rsn_na,String exit_port_na,String imm_port_na,String trs_mode_na,String tf_country_na,String dept_dest_na,String imm_rsn_na,String ori_deal_dept_na,String pers_excp_rsn_na,String evt_types_na,String evt_char_na,String docs_type_na,String approver_na,String aprv_level_na,String us_oper_na,String catch_oper_na,String catch_dept_na,String edit_oper_na,String ori_resource_na,String nation_na,String user_define_code_na,String conf_evt_char_na,String ill_deal_rsn_na,String conf_evt_type_na,String confess_country_na,String confess_region_na,String confess_cert_type_na,String filterflag){
		this.evt_id=evt_id;
		this.rlat_evt_id=rlat_evt_id;
		this.pers_id=pers_id;
		this.pers_name=pers_name;
		this.long_name_desc=long_name_desc;
		this.complex_desc=complex_desc;
		this.pers_imm_type=pers_imm_type;
		this.country_code=country_code;
		this.gender=gender;
		this.birth_date=birth_date;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.visas_no=visas_no;
		this.visas_type=visas_type;
		this.period=period;
		this.second_pers_name=second_pers_name;
		this.sec_birth_date=sec_birth_date;
		this.sec_cert_no=sec_cert_no;
		this.sec_cert_type=sec_cert_type;
		this.cert_region_code=cert_region_code;
		this.repat_country_code=repat_country_code;
		this.repat_rsn_code=repat_rsn_code;
		this.exit_port_code=exit_port_code;
		this.exit_dt=exit_dt;
		this.imm_port_code=imm_port_code;
		this.trs_mode=trs_mode;
		this.trs_id=trs_id;
		this.tf_country_code=tf_country_code;
		this.dept_dest=dept_dest;
		this.imm_rsn_code=imm_rsn_code;
		this.channel_no=channel_no;
		this.nin_grp_no=nin_grp_no;
		this.tour_grp_no=tour_grp_no;
		this.site_code=site_code;
		this.ori_deal_dept=ori_deal_dept;
		this.ck_flag=ck_flag;
		this.pers_excp_rsn=pers_excp_rsn;
		this.evt_types=evt_types;
		this.evt_char_code=evt_char_code;
		this.inspector_desc=inspector_desc;
		this.evt_desc=evt_desc;
		this.evt_theme=evt_theme;
		this.docs_type=docs_type;
		this.edit_flag=edit_flag;
		this.approver=approver;
		this.aprv_level=aprv_level;
		this.lzk_evt_id=lzk_evt_id;
		this.us_oper=us_oper;
		this.us_dt=us_dt;
		this.catch_oper=catch_oper;
		this.catch_dept_code=catch_dept_code;
		this.catch_dt=catch_dt;
		this.edit_oper=edit_oper;
		this.edit_dt=edit_dt;
		this.limit_field=limit_field;
		this.check_flag=check_flag;
		this.imm_flag=imm_flag;
		this.ori_resource=ori_resource;
		this.evt_deal_flag=evt_deal_flag;
		this.watch_oper_info=watch_oper_info;
		this.nation_code=nation_code;
		this.user_define_code=user_define_code;
		this.back_flag=back_flag;
		this.in_out_flag=in_out_flag;
		this.self_channel_flag=self_channel_flag;
		this.conf_evt_char_code=conf_evt_char_code;
		this.ill_deal_rsn=ill_deal_rsn;
		this.forfeit_amt=forfeit_amt;
		this.punish_amt=punish_amt;
		this.aft_remarks=aft_remarks;
		this.hold_day_num=hold_day_num;
		this.confirm_dt=confirm_dt;
		this.invalid_flag=invalid_flag;
		this.invalid_rsn=invalid_rsn;
		this.rec_imm_flag=rec_imm_flag;
		this.conf_evt_type=conf_evt_type;
		this.rec_dt=rec_dt;
		this.psr_unit_name=psr_unit_name;
		this.confess_id=confess_id;
		this.confess_name=confess_name;
		this.confess_birth_date=confess_birth_date;
		this.confess_country_code=confess_country_code;
		this.confess_region_code=confess_region_code;
		this.confess_cert_type=confess_cert_type;
		this.confess_cert_no=confess_cert_no;
		this.confess_card_id=confess_card_id;
		this.confess_address5=confess_address5;
		this.ill_psr_photo=ill_psr_photo;
		this.ill_psr_cert_photo=ill_psr_cert_photo;
		this.from_repat_flag=from_repat_flag;
		this.airway_code=airway_code;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_name_seh=pers_name_seh;
		this.pers_imm_type_na=pers_imm_type_na;
		this.country_na=country_na;
		this.gender_na=gender_na;
		this.cert_type_na=cert_type_na;
		this.visas_type_na=visas_type_na;
		this.sec_cert_type_na=sec_cert_type_na;
		this.cert_region_na=cert_region_na;
		this.repat_country_na=repat_country_na;
		this.repat_rsn_na=repat_rsn_na;
		this.exit_port_na=exit_port_na;
		this.imm_port_na=imm_port_na;
		this.trs_mode_na=trs_mode_na;
		this.tf_country_na=tf_country_na;
		this.dept_dest_na=dept_dest_na;
		this.imm_rsn_na=imm_rsn_na;
		this.ori_deal_dept_na=ori_deal_dept_na;
		this.pers_excp_rsn_na=pers_excp_rsn_na;
		this.evt_types_na=evt_types_na;
		this.evt_char_na=evt_char_na;
		this.docs_type_na=docs_type_na;
		this.approver_na=approver_na;
		this.aprv_level_na=aprv_level_na;
		this.us_oper_na=us_oper_na;
		this.catch_oper_na=catch_oper_na;
		this.catch_dept_na=catch_dept_na;
		this.edit_oper_na=edit_oper_na;
		this.ori_resource_na=ori_resource_na;
		this.nation_na=nation_na;
		this.user_define_code_na=user_define_code_na;
		this.conf_evt_char_na=conf_evt_char_na;
		this.ill_deal_rsn_na=ill_deal_rsn_na;
		this.conf_evt_type_na=conf_evt_type_na;
		this.confess_country_na=confess_country_na;
		this.confess_region_na=confess_region_na;
		this.confess_cert_type_na=confess_cert_type_na;
		this.filterflag=filterflag;
	}

	public String getEvt_id() {
		return this.evt_id;
	}

	public void setEvt_id(String evt_id) {
		this.evt_id = evt_id;
	}

	public String getRlat_evt_id() {
		return this.rlat_evt_id;
	}

	public void setRlat_evt_id(String rlat_evt_id) {
		this.rlat_evt_id = rlat_evt_id;
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

	public String getPers_imm_type() {
		return this.pers_imm_type;
	}

	public void setPers_imm_type(String pers_imm_type) {
		this.pers_imm_type = pers_imm_type;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
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

	public String getVisas_no() {
		return this.visas_no;
	}

	public void setVisas_no(String visas_no) {
		this.visas_no = visas_no;
	}

	public String getVisas_type() {
		return this.visas_type;
	}

	public void setVisas_type(String visas_type) {
		this.visas_type = visas_type;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getSecond_pers_name() {
		return this.second_pers_name;
	}

	public void setSecond_pers_name(String second_pers_name) {
		this.second_pers_name = second_pers_name;
	}

	public String getSec_birth_date() {
		return this.sec_birth_date;
	}

	public void setSec_birth_date(String sec_birth_date) {
		this.sec_birth_date = sec_birth_date;
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

	public String getCert_region_code() {
		return this.cert_region_code;
	}

	public void setCert_region_code(String cert_region_code) {
		this.cert_region_code = cert_region_code;
	}

	public String getRepat_country_code() {
		return this.repat_country_code;
	}

	public void setRepat_country_code(String repat_country_code) {
		this.repat_country_code = repat_country_code;
	}

	public String getRepat_rsn_code() {
		return this.repat_rsn_code;
	}

	public void setRepat_rsn_code(String repat_rsn_code) {
		this.repat_rsn_code = repat_rsn_code;
	}

	public String getExit_port_code() {
		return this.exit_port_code;
	}

	public void setExit_port_code(String exit_port_code) {
		this.exit_port_code = exit_port_code;
	}

	public String getExit_dt() {
		return this.exit_dt;
	}

	public void setExit_dt(String exit_dt) {
		this.exit_dt = exit_dt;
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

	public String getTf_country_code() {
		return this.tf_country_code;
	}

	public void setTf_country_code(String tf_country_code) {
		this.tf_country_code = tf_country_code;
	}

	public String getDept_dest() {
		return this.dept_dest;
	}

	public void setDept_dest(String dept_dest) {
		this.dept_dest = dept_dest;
	}

	public String getImm_rsn_code() {
		return this.imm_rsn_code;
	}

	public void setImm_rsn_code(String imm_rsn_code) {
		this.imm_rsn_code = imm_rsn_code;
	}

	public String getChannel_no() {
		return this.channel_no;
	}

	public void setChannel_no(String channel_no) {
		this.channel_no = channel_no;
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

	public String getSite_code() {
		return this.site_code;
	}

	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}

	public String getOri_deal_dept() {
		return this.ori_deal_dept;
	}

	public void setOri_deal_dept(String ori_deal_dept) {
		this.ori_deal_dept = ori_deal_dept;
	}

	public String getCk_flag() {
		return this.ck_flag;
	}

	public void setCk_flag(String ck_flag) {
		this.ck_flag = ck_flag;
	}

	public String getPers_excp_rsn() {
		return this.pers_excp_rsn;
	}

	public void setPers_excp_rsn(String pers_excp_rsn) {
		this.pers_excp_rsn = pers_excp_rsn;
	}

	public String getEvt_types() {
		return this.evt_types;
	}

	public void setEvt_types(String evt_types) {
		this.evt_types = evt_types;
	}

	public String getEvt_char_code() {
		return this.evt_char_code;
	}

	public void setEvt_char_code(String evt_char_code) {
		this.evt_char_code = evt_char_code;
	}

	public String getInspector_desc() {
		return this.inspector_desc;
	}

	public void setInspector_desc(String inspector_desc) {
		this.inspector_desc = inspector_desc;
	}

	public String getEvt_desc() {
		return this.evt_desc;
	}

	public void setEvt_desc(String evt_desc) {
		this.evt_desc = evt_desc;
	}

	public String getEvt_theme() {
		return this.evt_theme;
	}

	public void setEvt_theme(String evt_theme) {
		this.evt_theme = evt_theme;
	}

	public String getDocs_type() {
		return this.docs_type;
	}

	public void setDocs_type(String docs_type) {
		this.docs_type = docs_type;
	}

	public String getEdit_flag() {
		return this.edit_flag;
	}

	public void setEdit_flag(String edit_flag) {
		this.edit_flag = edit_flag;
	}

	public String getApprover() {
		return this.approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getAprv_level() {
		return this.aprv_level;
	}

	public void setAprv_level(String aprv_level) {
		this.aprv_level = aprv_level;
	}

	public String getLzk_evt_id() {
		return this.lzk_evt_id;
	}

	public void setLzk_evt_id(String lzk_evt_id) {
		this.lzk_evt_id = lzk_evt_id;
	}

	public String getUs_oper() {
		return this.us_oper;
	}

	public void setUs_oper(String us_oper) {
		this.us_oper = us_oper;
	}

	public String getUs_dt() {
		return this.us_dt;
	}

	public void setUs_dt(String us_dt) {
		this.us_dt = us_dt;
	}

	public String getCatch_oper() {
		return this.catch_oper;
	}

	public void setCatch_oper(String catch_oper) {
		this.catch_oper = catch_oper;
	}

	public String getCatch_dept_code() {
		return this.catch_dept_code;
	}

	public void setCatch_dept_code(String catch_dept_code) {
		this.catch_dept_code = catch_dept_code;
	}

	public String getCatch_dt() {
		return this.catch_dt;
	}

	public void setCatch_dt(String catch_dt) {
		this.catch_dt = catch_dt;
	}

	public String getEdit_oper() {
		return this.edit_oper;
	}

	public void setEdit_oper(String edit_oper) {
		this.edit_oper = edit_oper;
	}

	public String getEdit_dt() {
		return this.edit_dt;
	}

	public void setEdit_dt(String edit_dt) {
		this.edit_dt = edit_dt;
	}

	public String getLimit_field() {
		return this.limit_field;
	}

	public void setLimit_field(String limit_field) {
		this.limit_field = limit_field;
	}

	public String getCheck_flag() {
		return this.check_flag;
	}

	public void setCheck_flag(String check_flag) {
		this.check_flag = check_flag;
	}

	public String getImm_flag() {
		return this.imm_flag;
	}

	public void setImm_flag(String imm_flag) {
		this.imm_flag = imm_flag;
	}

	public String getOri_resource() {
		return this.ori_resource;
	}

	public void setOri_resource(String ori_resource) {
		this.ori_resource = ori_resource;
	}

	public String getEvt_deal_flag() {
		return this.evt_deal_flag;
	}

	public void setEvt_deal_flag(String evt_deal_flag) {
		this.evt_deal_flag = evt_deal_flag;
	}

	public String getWatch_oper_info() {
		return this.watch_oper_info;
	}

	public void setWatch_oper_info(String watch_oper_info) {
		this.watch_oper_info = watch_oper_info;
	}

	public String getNation_code() {
		return this.nation_code;
	}

	public void setNation_code(String nation_code) {
		this.nation_code = nation_code;
	}

	public String getUser_define_code() {
		return this.user_define_code;
	}

	public void setUser_define_code(String user_define_code) {
		this.user_define_code = user_define_code;
	}

	public String getBack_flag() {
		return this.back_flag;
	}

	public void setBack_flag(String back_flag) {
		this.back_flag = back_flag;
	}

	public String getIn_out_flag() {
		return this.in_out_flag;
	}

	public void setIn_out_flag(String in_out_flag) {
		this.in_out_flag = in_out_flag;
	}

	public String getSelf_channel_flag() {
		return this.self_channel_flag;
	}

	public void setSelf_channel_flag(String self_channel_flag) {
		this.self_channel_flag = self_channel_flag;
	}

	public String getConf_evt_char_code() {
		return this.conf_evt_char_code;
	}

	public void setConf_evt_char_code(String conf_evt_char_code) {
		this.conf_evt_char_code = conf_evt_char_code;
	}

	public String getIll_deal_rsn() {
		return this.ill_deal_rsn;
	}

	public void setIll_deal_rsn(String ill_deal_rsn) {
		this.ill_deal_rsn = ill_deal_rsn;
	}

	public String getForfeit_amt() {
		return this.forfeit_amt;
	}

	public void setForfeit_amt(String forfeit_amt) {
		this.forfeit_amt = forfeit_amt;
	}

	public String getPunish_amt() {
		return this.punish_amt;
	}

	public void setPunish_amt(String punish_amt) {
		this.punish_amt = punish_amt;
	}

	public String getAft_remarks() {
		return this.aft_remarks;
	}

	public void setAft_remarks(String aft_remarks) {
		this.aft_remarks = aft_remarks;
	}

	public String getHold_day_num() {
		return this.hold_day_num;
	}

	public void setHold_day_num(String hold_day_num) {
		this.hold_day_num = hold_day_num;
	}

	public String getConfirm_dt() {
		return this.confirm_dt;
	}

	public void setConfirm_dt(String confirm_dt) {
		this.confirm_dt = confirm_dt;
	}

	public String getInvalid_flag() {
		return this.invalid_flag;
	}

	public void setInvalid_flag(String invalid_flag) {
		this.invalid_flag = invalid_flag;
	}

	public String getInvalid_rsn() {
		return this.invalid_rsn;
	}

	public void setInvalid_rsn(String invalid_rsn) {
		this.invalid_rsn = invalid_rsn;
	}

	public String getRec_imm_flag() {
		return this.rec_imm_flag;
	}

	public void setRec_imm_flag(String rec_imm_flag) {
		this.rec_imm_flag = rec_imm_flag;
	}

	public String getConf_evt_type() {
		return this.conf_evt_type;
	}

	public void setConf_evt_type(String conf_evt_type) {
		this.conf_evt_type = conf_evt_type;
	}

	public String getRec_dt() {
		return this.rec_dt;
	}

	public void setRec_dt(String rec_dt) {
		this.rec_dt = rec_dt;
	}

	public String getPsr_unit_name() {
		return this.psr_unit_name;
	}

	public void setPsr_unit_name(String psr_unit_name) {
		this.psr_unit_name = psr_unit_name;
	}

	public String getConfess_id() {
		return this.confess_id;
	}

	public void setConfess_id(String confess_id) {
		this.confess_id = confess_id;
	}

	public String getConfess_name() {
		return this.confess_name;
	}

	public void setConfess_name(String confess_name) {
		this.confess_name = confess_name;
	}

	public String getConfess_birth_date() {
		return this.confess_birth_date;
	}

	public void setConfess_birth_date(String confess_birth_date) {
		this.confess_birth_date = confess_birth_date;
	}

	public String getConfess_country_code() {
		return this.confess_country_code;
	}

	public void setConfess_country_code(String confess_country_code) {
		this.confess_country_code = confess_country_code;
	}

	public String getConfess_region_code() {
		return this.confess_region_code;
	}

	public void setConfess_region_code(String confess_region_code) {
		this.confess_region_code = confess_region_code;
	}

	public String getConfess_cert_type() {
		return this.confess_cert_type;
	}

	public void setConfess_cert_type(String confess_cert_type) {
		this.confess_cert_type = confess_cert_type;
	}

	public String getConfess_cert_no() {
		return this.confess_cert_no;
	}

	public void setConfess_cert_no(String confess_cert_no) {
		this.confess_cert_no = confess_cert_no;
	}

	public String getConfess_card_id() {
		return this.confess_card_id;
	}

	public void setConfess_card_id(String confess_card_id) {
		this.confess_card_id = confess_card_id;
	}

	public String getConfess_address5() {
		return this.confess_address5;
	}

	public void setConfess_address5(String confess_address5) {
		this.confess_address5 = confess_address5;
	}

	public InputStream getIll_psr_photo() {
		return this.ill_psr_photo;
	}

	public void setIll_psr_photo(InputStream ill_psr_photo) {
		this.ill_psr_photo = ill_psr_photo;
	}

	public InputStream getIll_psr_cert_photo() {
		return this.ill_psr_cert_photo;
	}

	public void setIll_psr_cert_photo(InputStream ill_psr_cert_photo) {
		this.ill_psr_cert_photo = ill_psr_cert_photo;
	}

	public String getFrom_repat_flag() {
		return this.from_repat_flag;
	}

	public void setFrom_repat_flag(String from_repat_flag) {
		this.from_repat_flag = from_repat_flag;
	}

	public String getAirway_code() {
		return this.airway_code;
	}

	public void setAirway_code(String airway_code) {
		this.airway_code = airway_code;
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

	public String getPers_imm_type_na() {
		return this.pers_imm_type_na;
	}

	public void setPers_imm_type_na(String pers_imm_type_na) {
		this.pers_imm_type_na = pers_imm_type_na;
	}

	public String getCountry_na() {
		return this.country_na;
	}

	public void setCountry_na(String country_na) {
		this.country_na = country_na;
	}

	public String getGender_na() {
		return this.gender_na;
	}

	public void setGender_na(String gender_na) {
		this.gender_na = gender_na;
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

	public String getSec_cert_type_na() {
		return this.sec_cert_type_na;
	}

	public void setSec_cert_type_na(String sec_cert_type_na) {
		this.sec_cert_type_na = sec_cert_type_na;
	}

	public String getCert_region_na() {
		return this.cert_region_na;
	}

	public void setCert_region_na(String cert_region_na) {
		this.cert_region_na = cert_region_na;
	}

	public String getRepat_country_na() {
		return this.repat_country_na;
	}

	public void setRepat_country_na(String repat_country_na) {
		this.repat_country_na = repat_country_na;
	}

	public String getRepat_rsn_na() {
		return this.repat_rsn_na;
	}

	public void setRepat_rsn_na(String repat_rsn_na) {
		this.repat_rsn_na = repat_rsn_na;
	}

	public String getExit_port_na() {
		return this.exit_port_na;
	}

	public void setExit_port_na(String exit_port_na) {
		this.exit_port_na = exit_port_na;
	}

	public String getImm_port_na() {
		return this.imm_port_na;
	}

	public void setImm_port_na(String imm_port_na) {
		this.imm_port_na = imm_port_na;
	}

	public String getTrs_mode_na() {
		return this.trs_mode_na;
	}

	public void setTrs_mode_na(String trs_mode_na) {
		this.trs_mode_na = trs_mode_na;
	}

	public String getTf_country_na() {
		return this.tf_country_na;
	}

	public void setTf_country_na(String tf_country_na) {
		this.tf_country_na = tf_country_na;
	}

	public String getDept_dest_na() {
		return this.dept_dest_na;
	}

	public void setDept_dest_na(String dept_dest_na) {
		this.dept_dest_na = dept_dest_na;
	}

	public String getImm_rsn_na() {
		return this.imm_rsn_na;
	}

	public void setImm_rsn_na(String imm_rsn_na) {
		this.imm_rsn_na = imm_rsn_na;
	}

	public String getOri_deal_dept_na() {
		return this.ori_deal_dept_na;
	}

	public void setOri_deal_dept_na(String ori_deal_dept_na) {
		this.ori_deal_dept_na = ori_deal_dept_na;
	}

	public String getPers_excp_rsn_na() {
		return this.pers_excp_rsn_na;
	}

	public void setPers_excp_rsn_na(String pers_excp_rsn_na) {
		this.pers_excp_rsn_na = pers_excp_rsn_na;
	}

	public String getEvt_types_na() {
		return this.evt_types_na;
	}

	public void setEvt_types_na(String evt_types_na) {
		this.evt_types_na = evt_types_na;
	}

	public String getEvt_char_na() {
		return this.evt_char_na;
	}

	public void setEvt_char_na(String evt_char_na) {
		this.evt_char_na = evt_char_na;
	}

	public String getDocs_type_na() {
		return this.docs_type_na;
	}

	public void setDocs_type_na(String docs_type_na) {
		this.docs_type_na = docs_type_na;
	}

	public String getApprover_na() {
		return this.approver_na;
	}

	public void setApprover_na(String approver_na) {
		this.approver_na = approver_na;
	}

	public String getAprv_level_na() {
		return this.aprv_level_na;
	}

	public void setAprv_level_na(String aprv_level_na) {
		this.aprv_level_na = aprv_level_na;
	}

	public String getUs_oper_na() {
		return this.us_oper_na;
	}

	public void setUs_oper_na(String us_oper_na) {
		this.us_oper_na = us_oper_na;
	}

	public String getCatch_oper_na() {
		return this.catch_oper_na;
	}

	public void setCatch_oper_na(String catch_oper_na) {
		this.catch_oper_na = catch_oper_na;
	}

	public String getCatch_dept_na() {
		return this.catch_dept_na;
	}

	public void setCatch_dept_na(String catch_dept_na) {
		this.catch_dept_na = catch_dept_na;
	}

	public String getEdit_oper_na() {
		return this.edit_oper_na;
	}

	public void setEdit_oper_na(String edit_oper_na) {
		this.edit_oper_na = edit_oper_na;
	}

	public String getOri_resource_na() {
		return this.ori_resource_na;
	}

	public void setOri_resource_na(String ori_resource_na) {
		this.ori_resource_na = ori_resource_na;
	}

	public String getNation_na() {
		return this.nation_na;
	}

	public void setNation_na(String nation_na) {
		this.nation_na = nation_na;
	}

	public String getUser_define_code_na() {
		return this.user_define_code_na;
	}

	public void setUser_define_code_na(String user_define_code_na) {
		this.user_define_code_na = user_define_code_na;
	}

	public String getConf_evt_char_na() {
		return this.conf_evt_char_na;
	}

	public void setConf_evt_char_na(String conf_evt_char_na) {
		this.conf_evt_char_na = conf_evt_char_na;
	}

	public String getIll_deal_rsn_na() {
		return this.ill_deal_rsn_na;
	}

	public void setIll_deal_rsn_na(String ill_deal_rsn_na) {
		this.ill_deal_rsn_na = ill_deal_rsn_na;
	}

	public String getConf_evt_type_na() {
		return this.conf_evt_type_na;
	}

	public void setConf_evt_type_na(String conf_evt_type_na) {
		this.conf_evt_type_na = conf_evt_type_na;
	}

	public String getConfess_country_na() {
		return this.confess_country_na;
	}

	public void setConfess_country_na(String confess_country_na) {
		this.confess_country_na = confess_country_na;
	}

	public String getConfess_region_na() {
		return this.confess_region_na;
	}

	public void setConfess_region_na(String confess_region_na) {
		this.confess_region_na = confess_region_na;
	}

	public String getConfess_cert_type_na() {
		return this.confess_cert_type_na;
	}

	public void setConfess_cert_type_na(String confess_cert_type_na) {
		this.confess_cert_type_na = confess_cert_type_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
