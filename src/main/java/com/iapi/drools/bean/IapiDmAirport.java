package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 机场信息 iapi_dm_airport
 *
 * <p>Date: Fri Sep 28 09:15:26 CST 2018.</p>
 *
 * @author (lzw)
 */

public class IapiDmAirport  implements Serializable {


	private static final long serialVersionUID =  4449267579853243076L;


	/**
	 * 机场代码  
	 */
	private String airport_code;

	/**
	 * 机场名称  
	 */
	private String airport_name;

	/**
	 * 机场描述  
	 */
	private String airport_desc;

	/**
	 * 城市代码  
	 */
	private String city_code;

	/**
	 * 城市名称  
	 */
	private String city_name;

	/**
	 * 国家地区代码  
	 */
	private String country_code;

	/**
	 * 国家地区名称（主要为中文）  
	 */
	private String country_name;

	/**
	 * 			国家地区英文名称	
	 */
	private String country_eng_name;

	/**
	 * 			2位国家代码	
	 */
	private String short_code;

	/**
	 * 			洲代码	
	 */
	private String continents_code;

	/**
	 * 			洲名称	
	 */
	private String continents_name;

	/**
	 * 			省级行政区划代码	
	 */
	private String prov_region_code;

	/**
	 * 			省级行政区划名称	
	 */
	private String prov_region_name;

	/**
	 * 			经度	
	 */
	private String jingdu;

	/**
	 * 			纬度	
	 */
	private String weidu;

	/**
	 * 			加载时间戳	
	 */
	private String load_dt;

	/**
	 * 				出入境口岸代码
	 */
	private String imm_port_code;

	private String pyzt;

	public  IapiDmAirport(){super();}

	public  IapiDmAirport(String airport_code,String airport_name,String airport_desc,String city_code,String city_name,String country_code,String country_name,String country_eng_name,String short_code,String continents_code,String continents_name,String prov_region_code,String prov_region_name,String jingdu,String weidu,String load_dt,String imm_port_code,String pyzt){
		this.airport_code=airport_code;
		this.airport_name=airport_name;
		this.airport_desc=airport_desc;
		this.city_code=city_code;
		this.city_name=city_name;
		this.country_code=country_code;
		this.country_name=country_name;
		this.country_eng_name=country_eng_name;
		this.short_code=short_code;
		this.continents_code=continents_code;
		this.continents_name=continents_name;
		this.prov_region_code=prov_region_code;
		this.prov_region_name=prov_region_name;
		this.jingdu=jingdu;
		this.weidu=weidu;
		this.load_dt=load_dt;
		this.imm_port_code=imm_port_code;
		this.pyzt=pyzt;
	}

	public String getAirport_code() {
		return this.airport_code;
	}

	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}

	public String getAirport_name() {
		return this.airport_name;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

	public String getAirport_desc() {
		return this.airport_desc;
	}

	public void setAirport_desc(String airport_desc) {
		this.airport_desc = airport_desc;
	}

	public String getCity_code() {
		return this.city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getCity_name() {
		return this.city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return this.country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getCountry_eng_name() {
		return this.country_eng_name;
	}

	public void setCountry_eng_name(String country_eng_name) {
		this.country_eng_name = country_eng_name;
	}

	public String getShort_code() {
		return this.short_code;
	}

	public void setShort_code(String short_code) {
		this.short_code = short_code;
	}

	public String getContinents_code() {
		return this.continents_code;
	}

	public void setContinents_code(String continents_code) {
		this.continents_code = continents_code;
	}

	public String getContinents_name() {
		return this.continents_name;
	}

	public void setContinents_name(String continents_name) {
		this.continents_name = continents_name;
	}

	public String getProv_region_code() {
		return this.prov_region_code;
	}

	public void setProv_region_code(String prov_region_code) {
		this.prov_region_code = prov_region_code;
	}

	public String getProv_region_name() {
		return this.prov_region_name;
	}

	public void setProv_region_name(String prov_region_name) {
		this.prov_region_name = prov_region_name;
	}

	public String getJingdu() {
		return this.jingdu;
	}

	public void setJingdu(String jingdu) {
		this.jingdu = jingdu;
	}

	public String getWeidu() {
		return this.weidu;
	}

	public void setWeidu(String weidu) {
		this.weidu = weidu;
	}

	public String getLoad_dt() {
		return this.load_dt;
	}

	public void setLoad_dt(String load_dt) {
		this.load_dt = load_dt;
	}

	public String getImm_port_code() {
		return this.imm_port_code;
	}

	public void setImm_port_code(String imm_port_code) {
		this.imm_port_code = imm_port_code;
	}

	public String getPyzt() {
		return this.pyzt;
	}

	public void setPyzt(String pyzt) {
		this.pyzt = pyzt;
	}

}
