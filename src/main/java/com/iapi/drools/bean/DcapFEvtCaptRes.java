package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 收缴物品信息 dcap_f_evt_capt_res
 *
 * <p>Date: Thu Sep 27 11:37:46 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFEvtCaptRes  implements Serializable {


	private static final long serialVersionUID =  2356599338046389099L;


	/**
	 * 事件编号，唯一标识（口岸代码 +通道号+出入日期+出入时间+3位流水号）
	 */
	private String evt_id;

	/**
	 * 物品序号
	 */
	private String res_no;

	/**
	 * 部门代码（3位口岸代码＋3位部门编号）
	 */
	private String dept_code;

	/**
	 * 查获人代码
	 */
	private String seize_oper;

	/**
	 * 查获日期
	 */
	private String seize_date;

	/**
	 * 查获物品代码
	 */
	private String seize_res_code;

	/**
	 * 物品名称
	 */
	private String res_name;

	/**
	 * 物品单位
	 */
	private String res_unit;

	/**
	 * 数量
	 */
	private String res_nbr;

	/**
	 * 金额
	 */
	private String res_amt;

	/**
	 * 收缴物品备注
	 */
	private String capt_res_remarks;

	/**
	 * 物品去向
	 */
	private String res_going;

	/**
	 * 口岸代码
	 */
	private String port_code;

	/**
	 * 暂存标志
	 */
	private String temp_flag;

	/**
	 * 规格
	 */
	private String res_specs;

	/**
	 * 特征
	 */
	private String res_features;

	/**
	 * 入库时间
	 */
	private String rec_dt;

	/**
	 * 作废标志（0:不作废、1：作废）
	 */
	private String invalid_flag;

	/**
	 * 物品性质代码
	 */
	private String res_prpt_code;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 人员ID，人员基本信息表的主键，其他人员相关表外键
	 */
	private String pers_id;

	/**
	 * 交通工具标识

	 */
	private String trs_id;

	/**
	 * 部门名称

	 */
	private String dept_na;

	/**
	 * 查获物品名称

	 */
	private String seize_res_na;

	/**
	 * 口岸名称

	 */
	private String port_na;

	/**
	 * 物品性质名称

	 */
	private String res_prpt_na;

	/**
	 * 过滤标记
	 */
	private String filterflag;

	/**
	 * 查获人名称
	 */
	private String seize_oper_na;

	public  DcapFEvtCaptRes(){super();}

	public  DcapFEvtCaptRes(String evt_id,String res_no,String dept_code,String seize_oper,String seize_date,String seize_res_code,String res_name,String res_unit,String res_nbr,String res_amt,String capt_res_remarks,String res_going,String port_code,String temp_flag,String res_specs,String res_features,String rec_dt,String invalid_flag,String res_prpt_code,String load_dt,String objectid,String pers_id,String trs_id,String dept_na,String seize_res_na,String port_na,String res_prpt_na,String filterflag,String seize_oper_na){
		this.evt_id=evt_id;
		this.res_no=res_no;
		this.dept_code=dept_code;
		this.seize_oper=seize_oper;
		this.seize_date=seize_date;
		this.seize_res_code=seize_res_code;
		this.res_name=res_name;
		this.res_unit=res_unit;
		this.res_nbr=res_nbr;
		this.res_amt=res_amt;
		this.capt_res_remarks=capt_res_remarks;
		this.res_going=res_going;
		this.port_code=port_code;
		this.temp_flag=temp_flag;
		this.res_specs=res_specs;
		this.res_features=res_features;
		this.rec_dt=rec_dt;
		this.invalid_flag=invalid_flag;
		this.res_prpt_code=res_prpt_code;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_id=pers_id;
		this.trs_id=trs_id;
		this.dept_na=dept_na;
		this.seize_res_na=seize_res_na;
		this.port_na=port_na;
		this.res_prpt_na=res_prpt_na;
		this.filterflag=filterflag;
		this.seize_oper_na=seize_oper_na;
	}

	public String getEvt_id() {
		return this.evt_id;
	}

	public void setEvt_id(String evt_id) {
		this.evt_id = evt_id;
	}

	public String getRes_no() {
		return this.res_no;
	}

	public void setRes_no(String res_no) {
		this.res_no = res_no;
	}

	public String getDept_code() {
		return this.dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getSeize_oper() {
		return this.seize_oper;
	}

	public void setSeize_oper(String seize_oper) {
		this.seize_oper = seize_oper;
	}

	public String getSeize_date() {
		return this.seize_date;
	}

	public void setSeize_date(String seize_date) {
		this.seize_date = seize_date;
	}

	public String getSeize_res_code() {
		return this.seize_res_code;
	}

	public void setSeize_res_code(String seize_res_code) {
		this.seize_res_code = seize_res_code;
	}

	public String getRes_name() {
		return this.res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}

	public String getRes_unit() {
		return this.res_unit;
	}

	public void setRes_unit(String res_unit) {
		this.res_unit = res_unit;
	}

	public String getRes_nbr() {
		return this.res_nbr;
	}

	public void setRes_nbr(String res_nbr) {
		this.res_nbr = res_nbr;
	}

	public String getRes_amt() {
		return this.res_amt;
	}

	public void setRes_amt(String res_amt) {
		this.res_amt = res_amt;
	}

	public String getCapt_res_remarks() {
		return this.capt_res_remarks;
	}

	public void setCapt_res_remarks(String capt_res_remarks) {
		this.capt_res_remarks = capt_res_remarks;
	}

	public String getRes_going() {
		return this.res_going;
	}

	public void setRes_going(String res_going) {
		this.res_going = res_going;
	}

	public String getPort_code() {
		return this.port_code;
	}

	public void setPort_code(String port_code) {
		this.port_code = port_code;
	}

	public String getTemp_flag() {
		return this.temp_flag;
	}

	public void setTemp_flag(String temp_flag) {
		this.temp_flag = temp_flag;
	}

	public String getRes_specs() {
		return this.res_specs;
	}

	public void setRes_specs(String res_specs) {
		this.res_specs = res_specs;
	}

	public String getRes_features() {
		return this.res_features;
	}

	public void setRes_features(String res_features) {
		this.res_features = res_features;
	}

	public String getRec_dt() {
		return this.rec_dt;
	}

	public void setRec_dt(String rec_dt) {
		this.rec_dt = rec_dt;
	}

	public String getInvalid_flag() {
		return this.invalid_flag;
	}

	public void setInvalid_flag(String invalid_flag) {
		this.invalid_flag = invalid_flag;
	}

	public String getRes_prpt_code() {
		return this.res_prpt_code;
	}

	public void setRes_prpt_code(String res_prpt_code) {
		this.res_prpt_code = res_prpt_code;
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

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getTrs_id() {
		return this.trs_id;
	}

	public void setTrs_id(String trs_id) {
		this.trs_id = trs_id;
	}

	public String getDept_na() {
		return this.dept_na;
	}

	public void setDept_na(String dept_na) {
		this.dept_na = dept_na;
	}

	public String getSeize_res_na() {
		return this.seize_res_na;
	}

	public void setSeize_res_na(String seize_res_na) {
		this.seize_res_na = seize_res_na;
	}

	public String getPort_na() {
		return this.port_na;
	}

	public void setPort_na(String port_na) {
		this.port_na = port_na;
	}

	public String getRes_prpt_na() {
		return this.res_prpt_na;
	}

	public void setRes_prpt_na(String res_prpt_na) {
		this.res_prpt_na = res_prpt_na;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

	public String getSeize_oper_na() {
		return this.seize_oper_na;
	}

	public void setSeize_oper_na(String seize_oper_na) {
		this.seize_oper_na = seize_oper_na;
	}

}
