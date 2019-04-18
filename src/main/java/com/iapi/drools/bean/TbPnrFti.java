package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 常客信息 tb_pnr_fti
 *
 * <p>Date: Thu Sep 27 17:29:01 CST 2018.</p>
 *
 * @author (lzw)
 */

public class TbPnrFti  implements Serializable {


	private static final long serialVersionUID =  8513442680864633327L;


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
	 * GR2SERIAL
	 */
	private String gr2serial;

	/**
	 * LV3SERIAL
	 */
	private String lv3serial;

	/**
	 * 旅客唯一编码
	 */
	private String reference_number;

	/**
	 * 航司代码
	 */
	private String airline_designator;

	/**
	 * 常客ID
	 */
	private String frequent_t_idenification;

	/**
	 * 常客级别
	 */
	private String membership_level;

	/**
	 * Tier描述
	 */
	private String item_description;

	/**
	 * 联盟代码
	 */
	private String company_identification;

	/**
	 * 报文发送时间
	 */
	private String sendtime;

	/**
	 * 创建时间
	 */
	private Date createtime;

	/**
	 * 旅客序号
	 */
	private String traveller_reference_number;

	public  TbPnrFti(){super();}

	public  TbPnrFti(String globalserial,String tid,String gr1serial,String gr2serial,String lv3serial,String reference_number,String airline_designator,String frequent_t_idenification,String membership_level,String item_description,String company_identification,String sendtime,Date createtime,String traveller_reference_number){
		this.globalserial=globalserial;
		this.tid=tid;
		this.gr1serial=gr1serial;
		this.gr2serial=gr2serial;
		this.lv3serial=lv3serial;
		this.reference_number=reference_number;
		this.airline_designator=airline_designator;
		this.frequent_t_idenification=frequent_t_idenification;
		this.membership_level=membership_level;
		this.item_description=item_description;
		this.company_identification=company_identification;
		this.sendtime=sendtime;
		this.createtime=createtime;
		this.traveller_reference_number=traveller_reference_number;
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

	public String getGr2serial() {
		return this.gr2serial;
	}

	public void setGr2serial(String gr2serial) {
		this.gr2serial = gr2serial;
	}

	public String getLv3serial() {
		return this.lv3serial;
	}

	public void setLv3serial(String lv3serial) {
		this.lv3serial = lv3serial;
	}

	public String getReference_number() {
		return this.reference_number;
	}

	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	public String getAirline_designator() {
		return this.airline_designator;
	}

	public void setAirline_designator(String airline_designator) {
		this.airline_designator = airline_designator;
	}

	public String getFrequent_t_idenification() {
		return this.frequent_t_idenification;
	}

	public void setFrequent_t_idenification(String frequent_t_idenification) {
		this.frequent_t_idenification = frequent_t_idenification;
	}

	public String getMembership_level() {
		return this.membership_level;
	}

	public void setMembership_level(String membership_level) {
		this.membership_level = membership_level;
	}

	public String getItem_description() {
		return this.item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public String getCompany_identification() {
		return this.company_identification;
	}

	public void setCompany_identification(String company_identification) {
		this.company_identification = company_identification;
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

	public String getTraveller_reference_number() {
		return this.traveller_reference_number;
	}

	public void setTraveller_reference_number(String traveller_reference_number) {
		this.traveller_reference_number = traveller_reference_number;
	}

}
