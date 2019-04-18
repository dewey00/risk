package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 航空公司信息 iapi_dm_aircompany
 *
 * <p>Date: Fri Oct 12 16:07:03 CST 2018.</p>
 *
 * @author (lzw)
 */

public class IapiDmAircompany  implements Serializable {


	private static final long serialVersionUID =  3528314409900717263L;


	/**
	 * 代码
	 */
	private String airline_code;

	/**
	 * 中文名
	 */
	private String airline_chn_name;

	/**
	 * 英文名
	 */
	private String airline_eng_name;

	/**
	 * 国家
	 */
	private String country;

	/**
	 * 时区
	 */
	private String timezone;

	/**
	 * 城市
	 */
	private String city;

	/**
	 * 夏令时标志Y，N
	 */
	private String summerflag;

	/**
	 * 开始时间
	 */
	private Date summterstarttime;

	/**
	 * 经度
	 */
	private String jindu;

	/**
	 * 纬度
	 */
	private String weidu;

	public  IapiDmAircompany(){super();}

	public  IapiDmAircompany(String airline_code,String airline_chn_name,String airline_eng_name,String country,String timezone,String city,String summerflag,Date summterstarttime,String jindu,String weidu){
		this.airline_code=airline_code;
		this.airline_chn_name=airline_chn_name;
		this.airline_eng_name=airline_eng_name;
		this.country=country;
		this.timezone=timezone;
		this.city=city;
		this.summerflag=summerflag;
		this.summterstarttime=summterstarttime;
		this.jindu=jindu;
		this.weidu=weidu;
	}

	public String getAirline_code() {
		return this.airline_code;
	}

	public void setAirline_code(String airline_code) {
		this.airline_code = airline_code;
	}

	public String getAirline_chn_name() {
		return this.airline_chn_name;
	}

	public void setAirline_chn_name(String airline_chn_name) {
		this.airline_chn_name = airline_chn_name;
	}

	public String getAirline_eng_name() {
		return this.airline_eng_name;
	}

	public void setAirline_eng_name(String airline_eng_name) {
		this.airline_eng_name = airline_eng_name;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSummerflag() {
		return this.summerflag;
	}

	public void setSummerflag(String summerflag) {
		this.summerflag = summerflag;
	}

	public Date getSummterstarttime() {
		return this.summterstarttime;
	}

	public void setSummterstarttime(Date summterstarttime) {
		this.summterstarttime = summterstarttime;
	}

	public String getJindu() {
		return this.jindu;
	}

	public void setJindu(String jindu) {
		this.jindu = jindu;
	}

	public String getWeidu() {
		return this.weidu;
	}

	public void setWeidu(String weidu) {
		this.weidu = weidu;
	}

}
