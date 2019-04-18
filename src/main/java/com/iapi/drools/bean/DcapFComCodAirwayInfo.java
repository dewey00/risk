package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 航线代码表 dcap_f_com_cod_airway_info
 *
 * <p>Date: Thu Sep 27 11:36:26 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFComCodAirwayInfo  implements Serializable {


	private static final long serialVersionUID =  7085593163586673263L;


	/**
	 * 航线代码
	 */
	private String airway_code;

	/**
	 * 出入标志，1入境，2出境，3出入境
	 */
	private String in_out_flag;

	/**
	 * 出发地，起飞机场代码
	 */
	private String fltdept;

	/**
	 * 经停地1，经停机场代码
	 */
	private String stopover1;

	/**
	 * 经停地2，经停机场代码
	 */
	private String stopover2;

	/**
	 * 经停地3，经停机场代码
	 */
	private String stopover3;

	/**
	 * 经停地4，经停机场代码
	 */
	private String stopover4;

	/**
	 * 经停地5，经停机场代码
	 */
	private String stopover5;

	/**
	 * 目的地，到达机场代码
	 */
	private String fltdest;

	/**
	 * 航线描述，出发城市到目的城市，包括中转城市
	 */
	private String airline_desc;

	/**
	 * 备注
	 */
	private String remakrs;

	/**
	 * 加载时间戳
	 */
	private String load_dt;

	public  DcapFComCodAirwayInfo(){super();}

	public  DcapFComCodAirwayInfo(String airway_code,String in_out_flag,String fltdept,String stopover1,String stopover2,String stopover3,String stopover4,String stopover5,String fltdest,String airline_desc,String remakrs,String load_dt){
		this.airway_code=airway_code;
		this.in_out_flag=in_out_flag;
		this.fltdept=fltdept;
		this.stopover1=stopover1;
		this.stopover2=stopover2;
		this.stopover3=stopover3;
		this.stopover4=stopover4;
		this.stopover5=stopover5;
		this.fltdest=fltdest;
		this.airline_desc=airline_desc;
		this.remakrs=remakrs;
		this.load_dt=load_dt;
	}

	public String getAirway_code() {
		return this.airway_code;
	}

	public void setAirway_code(String airway_code) {
		this.airway_code = airway_code;
	}

	public String getIn_out_flag() {
		return this.in_out_flag;
	}

	public void setIn_out_flag(String in_out_flag) {
		this.in_out_flag = in_out_flag;
	}

	public String getFltdept() {
		return this.fltdept;
	}

	public void setFltdept(String fltdept) {
		this.fltdept = fltdept;
	}

	public String getStopover1() {
		return this.stopover1;
	}

	public void setStopover1(String stopover1) {
		this.stopover1 = stopover1;
	}

	public String getStopover2() {
		return this.stopover2;
	}

	public void setStopover2(String stopover2) {
		this.stopover2 = stopover2;
	}

	public String getStopover3() {
		return this.stopover3;
	}

	public void setStopover3(String stopover3) {
		this.stopover3 = stopover3;
	}

	public String getStopover4() {
		return this.stopover4;
	}

	public void setStopover4(String stopover4) {
		this.stopover4 = stopover4;
	}

	public String getStopover5() {
		return this.stopover5;
	}

	public void setStopover5(String stopover5) {
		this.stopover5 = stopover5;
	}

	public String getFltdest() {
		return this.fltdest;
	}

	public void setFltdest(String fltdest) {
		this.fltdest = fltdest;
	}

	public String getAirline_desc() {
		return this.airline_desc;
	}

	public void setAirline_desc(String airline_desc) {
		this.airline_desc = airline_desc;
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
