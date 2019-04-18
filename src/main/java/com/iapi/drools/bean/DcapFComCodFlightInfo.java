package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 航班代码表 dcap_f_com_cod_flight_info
 *
 * <p>Date: Thu Sep 27 11:37:28 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFComCodFlightInfo  implements Serializable {


	private static final long serialVersionUID =  3207981891576328272L;


	/**
	 * 航班号
	 */
	private String flt_code;

	/**
	 * 出入标志，1入境，2出境，3出入境
	 */
	private String in_out_flag;

	/**
	 * 航空公司代码
	 */
	private String airline_code;

	/**
	 * 航线代码
	 */
	private String airway_code;

	/**
	 * 飞机型号
	 */
	private String flt_modle;

	/**
	 * 航班班次
	 */
	private String flt_shift;

	/**
	 * 参考班期
	 */
	private String schedule_code;

	/**
	 * 共享航班
	 */
	private String shared_flt_code;

	/**
	 * 备注
	 */
	private String remakrs;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	public  DcapFComCodFlightInfo(){super();}

	public  DcapFComCodFlightInfo(String flt_code,String in_out_flag,String airline_code,String airway_code,String flt_modle,String flt_shift,String schedule_code,String shared_flt_code,String remakrs,String load_dt){
		this.flt_code=flt_code;
		this.in_out_flag=in_out_flag;
		this.airline_code=airline_code;
		this.airway_code=airway_code;
		this.flt_modle=flt_modle;
		this.flt_shift=flt_shift;
		this.schedule_code=schedule_code;
		this.shared_flt_code=shared_flt_code;
		this.remakrs=remakrs;
		this.load_dt=load_dt;
	}

	public String getFlt_code() {
		return this.flt_code;
	}

	public void setFlt_code(String flt_code) {
		this.flt_code = flt_code;
	}

	public String getIn_out_flag() {
		return this.in_out_flag;
	}

	public void setIn_out_flag(String in_out_flag) {
		this.in_out_flag = in_out_flag;
	}

	public String getAirline_code() {
		return this.airline_code;
	}

	public void setAirline_code(String airline_code) {
		this.airline_code = airline_code;
	}

	public String getAirway_code() {
		return this.airway_code;
	}

	public void setAirway_code(String airway_code) {
		this.airway_code = airway_code;
	}

	public String getFlt_modle() {
		return this.flt_modle;
	}

	public void setFlt_modle(String flt_modle) {
		this.flt_modle = flt_modle;
	}

	public String getFlt_shift() {
		return this.flt_shift;
	}

	public void setFlt_shift(String flt_shift) {
		this.flt_shift = flt_shift;
	}

	public String getSchedule_code() {
		return this.schedule_code;
	}

	public void setSchedule_code(String schedule_code) {
		this.schedule_code = schedule_code;
	}

	public String getShared_flt_code() {
		return this.shared_flt_code;
	}

	public void setShared_flt_code(String shared_flt_code) {
		this.shared_flt_code = shared_flt_code;
	}

	public String getRemakrs() {
		return this.remakrs;
	}

	public void setRemakrs(String remakrs) {
		this.remakrs = remakrs;
	}

	public String getLoad_dt() {
		return this.load_dt;
	}

	public void setLoad_dt(String load_dt) {
		this.load_dt = load_dt;
	}

}
