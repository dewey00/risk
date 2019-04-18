package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 锲界睄浠ｇ爜 iapi_dm_nationality
 *
 * <p>Date: Fri Oct 12 16:07:56 CST 2018.</p>
 *
 * @author (lzw)
 */

public class IapiDmNationality  implements Serializable {


	private static final long serialVersionUID =  3565287250184425477L;


	/**
	 * 锟斤拷锟斤拷
	 */
	private String code;

	/**
	 * 锟斤拷锟秸达拷锟斤拷
	 */
	private String fcode;

	/**
	 * 英锟斤拷锟斤拷锟斤拷
	 */
	private String ename;

	/**
	 * 锟斤拷锟斤拷锟斤拷锟斤拷
	 */
	private String cname;

	/**
	 * 锟睫达拷锟斤拷
	 */
	private String continents_code;

	/**
	 * 锟斤拷锟斤拷锟斤拷
	 */
	private String continents_name;

	public  IapiDmNationality(){super();}

	public  IapiDmNationality(String code,String fcode,String ename,String cname,String continents_code,String continents_name){
		this.code=code;
		this.fcode=fcode;
		this.ename=ename;
		this.cname=cname;
		this.continents_code=continents_code;
		this.continents_name=continents_name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFcode() {
		return this.fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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

}
