package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 机场口岸对照表 iapi_dm_airport_match
 *
 * <p>Date: Fri Sep 28 09:16:49 CST 2018.</p>
 *
 * @author (lzw)
 */

public class IapiDmAirportMatch  implements Serializable {


	private static final long serialVersionUID =  3336781727572713816L;


	/**
	 * 口岸代码3位
	 */
	private String kadm;

	/**
	 * 口岸名称
	 */
	private String kamc;

	/**
	 * 口岸全称
	 */
	private String kaqc;

	/**
	 * 所在位置（行政区划代码）
	 */
	private String szwz;

	/**
	 * 所属口岸代码(总站或总队的口岸代码)
	 */
	private String sskadm;

	/**
	 * 新系统开放标志 1：开放、0：未开放
	 */
	private String kfbz;

	/**
	 * 交通方式代码
	 */
	private String jtfsdm;

	/**
	 * 使用标记 0：禁用，1：可用
	 */
	private String sybj;

	/**
	 * 机场代码
	 */
	private String jcdm;

	public  IapiDmAirportMatch(){super();}

	public  IapiDmAirportMatch(String kadm,String kamc,String kaqc,String szwz,String sskadm,String kfbz,String jtfsdm,String sybj,String jcdm){
		this.kadm=kadm;
		this.kamc=kamc;
		this.kaqc=kaqc;
		this.szwz=szwz;
		this.sskadm=sskadm;
		this.kfbz=kfbz;
		this.jtfsdm=jtfsdm;
		this.sybj=sybj;
		this.jcdm=jcdm;
	}

	public String getKadm() {
		return this.kadm;
	}

	public void setKadm(String kadm) {
		this.kadm = kadm;
	}

	public String getKamc() {
		return this.kamc;
	}

	public void setKamc(String kamc) {
		this.kamc = kamc;
	}

	public String getKaqc() {
		return this.kaqc;
	}

	public void setKaqc(String kaqc) {
		this.kaqc = kaqc;
	}

	public String getSzwz() {
		return this.szwz;
	}

	public void setSzwz(String szwz) {
		this.szwz = szwz;
	}

	public String getSskadm() {
		return this.sskadm;
	}

	public void setSskadm(String sskadm) {
		this.sskadm = sskadm;
	}

	public String getKfbz() {
		return this.kfbz;
	}

	public void setKfbz(String kfbz) {
		this.kfbz = kfbz;
	}

	public String getJtfsdm() {
		return this.jtfsdm;
	}

	public void setJtfsdm(String jtfsdm) {
		this.jtfsdm = jtfsdm;
	}

	public String getSybj() {
		return this.sybj;
	}

	public void setSybj(String sybj) {
		this.sybj = sybj;
	}

	public String getJcdm() {
		return this.jcdm;
	}

	public void setJcdm(String jcdm) {
		this.jcdm = jcdm;
	}

}
