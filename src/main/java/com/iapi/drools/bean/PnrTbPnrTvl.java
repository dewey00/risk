package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 航班信息 pnr_tb_pnr_tvl
 *
 * <p>Date: Thu Sep 27 17:28:43 CST 2018.</p>
 *
 * @author (lzw)
 */

public class PnrTbPnrTvl  implements Serializable {


	private static final long serialVersionUID =  7997595788051674301L;


	/**
	 * 全局流水号
	 */
	private String globalserial;

	/**
	 * 流水号
	 */
	private String tid;

	/**
	 * GR1SERIAL
	 */
	private String gr1serial;

	/**
	 * GR5SERIAL
	 */
	private String gr5serial;

	/**
	 * GR10SERIAL
	 */
	private String gr10serial;

	/**
	 * GR11SERIAL
	 */
	private String gr11serial;

	/**
	 * GR12ERIAL
	 */
	private String gr12erial;

	/**
	 * 航班号
	 */
	private String flight_number;

	/**
	 * 计划起飞日期  
	 */
	private String departure_date;

	/**
	 * 计划起飞时间  
	 */
	private String departure_time;

	/**
	 * 计划到达日期  
	 */
	private String arrival_date;

	/**
	 * 计划到达时间  
	 */
	private String arrival_time;

	/**
	 * 跨天变更  
	 */
	private String date_variation;

	/**
	 * THE_LAST_DEPARTURE_AIRPORT
	 */
	private String the_last_departure_airport;

	/**
	 * THE_FIRST_ARRIVAL_AIRPORT
	 */
	private String the_first_arrival_airport;

	/**
	 * 市场方航司代码  
	 */
	private String marketing_airline_code;

	/**
	 * 市场方航班号  
	 */
	private String marketing_flight_number;

	/**
	 * 市场舱位  
	 */
	private String marketing_booking_class;

	/**
	 * 市场航班后缀  
	 */
	private String marketing_suffix;

	/**
	 * 承运航空公司  
	 */
	private String operating_airline_code;

	/**
	 * 承运方航班号  
	 */
	private String operating_flight_number;

	/**
	 * 承运舱位  
	 */
	private String operating_booking_class;

	/**
	 * 承运航班后缀  
	 */
	private String operating_suffix;

	/**
	 * 共享承运航班号  
	 */
	private String coor_flight_number;

	/**
	 * 共享承运舱位  
	 */
	private String coor_booking_class;

	/**
	 * 共享承运航班后缀  
	 */
	private String coor_suffix;

	/**
	 * 旅客数量  
	 */
	private String num_of_passenger;

	/**
	 * 行动状态代码  
	 */
	private String action_status_code;

	/**
	 * 机型  
	 */
	private String type_of_aircraft;

	/**
	 * SENDTIME
	 */
	private String sendtime;

	/**
	 * 创建时间
	 */
	private Date createtime;

	/**
	 * tvlserial
	 */
	private String tvlserial;

	/**
	 * 计划起飞时间_北京
	 */
	private Date departdate_beijing;

	/**
	 * 计划到达时间_北京
	 */
	private Date arrivdate_beijing;

	public  PnrTbPnrTvl(){super();}

	public  PnrTbPnrTvl(String globalserial,String tid,String gr1serial,String gr5serial,String gr10serial,String gr11serial,String gr12erial,String flight_number,String departure_date,String departure_time,String arrival_date,String arrival_time,String date_variation,String the_last_departure_airport,String the_first_arrival_airport,String marketing_airline_code,String marketing_flight_number,String marketing_booking_class,String marketing_suffix,String operating_airline_code,String operating_flight_number,String operating_booking_class,String operating_suffix,String coor_flight_number,String coor_booking_class,String coor_suffix,String num_of_passenger,String action_status_code,String type_of_aircraft,String sendtime,Date createtime,String tvlserial,Date departdate_beijing,Date arrivdate_beijing){
		this.globalserial=globalserial;
		this.tid=tid;
		this.gr1serial=gr1serial;
		this.gr5serial=gr5serial;
		this.gr10serial=gr10serial;
		this.gr11serial=gr11serial;
		this.gr12erial=gr12erial;
		this.flight_number=flight_number;
		this.departure_date=departure_date;
		this.departure_time=departure_time;
		this.arrival_date=arrival_date;
		this.arrival_time=arrival_time;
		this.date_variation=date_variation;
		this.the_last_departure_airport=the_last_departure_airport;
		this.the_first_arrival_airport=the_first_arrival_airport;
		this.marketing_airline_code=marketing_airline_code;
		this.marketing_flight_number=marketing_flight_number;
		this.marketing_booking_class=marketing_booking_class;
		this.marketing_suffix=marketing_suffix;
		this.operating_airline_code=operating_airline_code;
		this.operating_flight_number=operating_flight_number;
		this.operating_booking_class=operating_booking_class;
		this.operating_suffix=operating_suffix;
		this.coor_flight_number=coor_flight_number;
		this.coor_booking_class=coor_booking_class;
		this.coor_suffix=coor_suffix;
		this.num_of_passenger=num_of_passenger;
		this.action_status_code=action_status_code;
		this.type_of_aircraft=type_of_aircraft;
		this.sendtime=sendtime;
		this.createtime=createtime;
		this.tvlserial=tvlserial;
		this.departdate_beijing=departdate_beijing;
		this.arrivdate_beijing=arrivdate_beijing;
	}

	public String getGlobalserial() {
		return this.globalserial;
	}

	public void setGlobalserial(String globalserial) {
		this.globalserial = globalserial;
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getGr1serial() {
		return this.gr1serial;
	}

	public void setGr1serial(String gr1serial) {
		this.gr1serial = gr1serial;
	}

	public String getGr5serial() {
		return this.gr5serial;
	}

	public void setGr5serial(String gr5serial) {
		this.gr5serial = gr5serial;
	}

	public String getGr10serial() {
		return this.gr10serial;
	}

	public void setGr10serial(String gr10serial) {
		this.gr10serial = gr10serial;
	}

	public String getGr11serial() {
		return this.gr11serial;
	}

	public void setGr11serial(String gr11serial) {
		this.gr11serial = gr11serial;
	}

	public String getGr12erial() {
		return this.gr12erial;
	}

	public void setGr12erial(String gr12erial) {
		this.gr12erial = gr12erial;
	}

	public String getFlight_number() {
		return this.flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}

	public String getDeparture_date() {
		return this.departure_date;
	}

	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}

	public String getDeparture_time() {
		return this.departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_date() {
		return this.arrival_date;
	}

	public void setArrival_date(String arrival_date) {
		this.arrival_date = arrival_date;
	}

	public String getArrival_time() {
		return this.arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDate_variation() {
		return this.date_variation;
	}

	public void setDate_variation(String date_variation) {
		this.date_variation = date_variation;
	}

	public String getThe_last_departure_airport() {
		return this.the_last_departure_airport;
	}

	public void setThe_last_departure_airport(String the_last_departure_airport) {
		this.the_last_departure_airport = the_last_departure_airport;
	}

	public String getThe_first_arrival_airport() {
		return this.the_first_arrival_airport;
	}

	public void setThe_first_arrival_airport(String the_first_arrival_airport) {
		this.the_first_arrival_airport = the_first_arrival_airport;
	}

	public String getMarketing_airline_code() {
		return this.marketing_airline_code;
	}

	public void setMarketing_airline_code(String marketing_airline_code) {
		this.marketing_airline_code = marketing_airline_code;
	}

	public String getMarketing_flight_number() {
		return this.marketing_flight_number;
	}

	public void setMarketing_flight_number(String marketing_flight_number) {
		this.marketing_flight_number = marketing_flight_number;
	}

	public String getMarketing_booking_class() {
		return this.marketing_booking_class;
	}

	public void setMarketing_booking_class(String marketing_booking_class) {
		this.marketing_booking_class = marketing_booking_class;
	}

	public String getMarketing_suffix() {
		return this.marketing_suffix;
	}

	public void setMarketing_suffix(String marketing_suffix) {
		this.marketing_suffix = marketing_suffix;
	}

	public String getOperating_airline_code() {
		return this.operating_airline_code;
	}

	public void setOperating_airline_code(String operating_airline_code) {
		this.operating_airline_code = operating_airline_code;
	}

	public String getOperating_flight_number() {
		return this.operating_flight_number;
	}

	public void setOperating_flight_number(String operating_flight_number) {
		this.operating_flight_number = operating_flight_number;
	}

	public String getOperating_booking_class() {
		return this.operating_booking_class;
	}

	public void setOperating_booking_class(String operating_booking_class) {
		this.operating_booking_class = operating_booking_class;
	}

	public String getOperating_suffix() {
		return this.operating_suffix;
	}

	public void setOperating_suffix(String operating_suffix) {
		this.operating_suffix = operating_suffix;
	}

	public String getCoor_flight_number() {
		return this.coor_flight_number;
	}

	public void setCoor_flight_number(String coor_flight_number) {
		this.coor_flight_number = coor_flight_number;
	}

	public String getCoor_booking_class() {
		return this.coor_booking_class;
	}

	public void setCoor_booking_class(String coor_booking_class) {
		this.coor_booking_class = coor_booking_class;
	}

	public String getCoor_suffix() {
		return this.coor_suffix;
	}

	public void setCoor_suffix(String coor_suffix) {
		this.coor_suffix = coor_suffix;
	}

	public String getNum_of_passenger() {
		return this.num_of_passenger;
	}

	public void setNum_of_passenger(String num_of_passenger) {
		this.num_of_passenger = num_of_passenger;
	}

	public String getAction_status_code() {
		return this.action_status_code;
	}

	public void setAction_status_code(String action_status_code) {
		this.action_status_code = action_status_code;
	}

	public String getType_of_aircraft() {
		return this.type_of_aircraft;
	}

	public void setType_of_aircraft(String type_of_aircraft) {
		this.type_of_aircraft = type_of_aircraft;
	}

	public String getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getTvlserial() {
		return this.tvlserial;
	}

	public void setTvlserial(String tvlserial) {
		this.tvlserial = tvlserial;
	}

	public Date getDepartdate_beijing() {
		return this.departdate_beijing;
	}

	public void setDepartdate_beijing(Date departdate_beijing) {
		this.departdate_beijing = departdate_beijing;
	}

	public Date getArrivdate_beijing() {
		return this.arrivdate_beijing;
	}

	public void setArrivdate_beijing(Date arrivdate_beijing) {
		this.arrivdate_beijing = arrivdate_beijing;
	}

}
