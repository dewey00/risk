package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 旅客证件和票号信息 tb_pnr_traveler_tkt
 *
 * <p>Date: Thu Sep 27 17:29:06 CST 2018.</p>
 *
 * @author (lzw)
 */

public class TbPnrTravelerTkt  implements Serializable {


	private static final long serialVersionUID =  867009400419360626L;


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
	 * 旅客序号
	 */
	private String tifserial;

	/**
	 * 证件类型P
	 */
	private String cardtype;

	/**
	 * 证件签发国CN
	 */
	private String issuecountry;

	/**
	 * 证件号码E97765142
	 */
	private String cardnum;

	/**
	 * 证件有效期12DEC26
	 */
	private Date cardexpiredate;

	/**
	 * 国籍
	 */
	private String nationality;

	/**
	 * 出生日期06SEP84
	 */
	private Date birthdate;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 旅客的姓
	 */
	private String traveller_surname;

	/**
	 * 旅客序号
	 */
	private String traveller_given_name;

	/**
	 * 报文发送时间

	 */
	private String sendtime;

	/**
	 * 客票号
	 */
	private String tktnumber;

	/**
	 * 票务信息
	 */
	private String avfinfo;

	/**
	 * 创建时间
	 */
	private Date createtime;

	/**
	 * 旅客序号
	 */
	private String traveller_reference_number;

	/**
	 * 起飞城市
	 */
	private String boardcity;

	/**
	 * 到达城市
	 */
	private String offcity;

	/**
	 * 电子客票号去除/1
	 */
	private String tktnumber_1;

	/**
	 * 证件信息字符串
	 */
	private String docinfo;

	public  TbPnrTravelerTkt(){super();}

	public  TbPnrTravelerTkt(String globalserial,String tid,String gr1serial,String gr2serial,String tifserial,String cardtype,String issuecountry,String cardnum,Date cardexpiredate,String nationality,Date birthdate,String gender,String traveller_surname,String traveller_given_name,String sendtime,String tktnumber,String avfinfo,Date createtime,String traveller_reference_number,String boardcity,String offcity,String tktnumber_1,String docinfo){
		this.globalserial=globalserial;
		this.tid=tid;
		this.gr1serial=gr1serial;
		this.gr2serial=gr2serial;
		this.tifserial=tifserial;
		this.cardtype=cardtype;
		this.issuecountry=issuecountry;
		this.cardnum=cardnum;
		this.cardexpiredate=cardexpiredate;
		this.nationality=nationality;
		this.birthdate=birthdate;
		this.gender=gender;
		this.traveller_surname=traveller_surname;
		this.traveller_given_name=traveller_given_name;
		this.sendtime=sendtime;
		this.tktnumber=tktnumber;
		this.avfinfo=avfinfo;
		this.createtime=createtime;
		this.traveller_reference_number=traveller_reference_number;
		this.boardcity=boardcity;
		this.offcity=offcity;
		this.tktnumber_1=tktnumber_1;
		this.docinfo=docinfo;
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

	public String getTifserial() {
		return this.tifserial;
	}

	public void setTifserial(String tifserial) {
		this.tifserial = tifserial;
	}

	public String getCardtype() {
		return this.cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getIssuecountry() {
		return this.issuecountry;
	}

	public void setIssuecountry(String issuecountry) {
		this.issuecountry = issuecountry;
	}

	public String getCardnum() {
		return this.cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public Date getCardexpiredate() {
		return this.cardexpiredate;
	}

	public void setCardexpiredate(Date cardexpiredate) {
		this.cardexpiredate = cardexpiredate;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTraveller_surname() {
		return this.traveller_surname;
	}

	public void setTraveller_surname(String traveller_surname) {
		this.traveller_surname = traveller_surname;
	}

	public String getTraveller_given_name() {
		return this.traveller_given_name;
	}

	public void setTraveller_given_name(String traveller_given_name) {
		this.traveller_given_name = traveller_given_name;
	}

	public String getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}

	public String getTktnumber() {
		return this.tktnumber;
	}

	public void setTktnumber(String tktnumber) {
		this.tktnumber = tktnumber;
	}

	public String getAvfinfo() {
		return this.avfinfo;
	}

	public void setAvfinfo(String avfinfo) {
		this.avfinfo = avfinfo;
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

	public String getBoardcity() {
		return this.boardcity;
	}

	public void setBoardcity(String boardcity) {
		this.boardcity = boardcity;
	}

	public String getOffcity() {
		return this.offcity;
	}

	public void setOffcity(String offcity) {
		this.offcity = offcity;
	}

	public String getTktnumber_1() {
		return this.tktnumber_1;
	}

	public void setTktnumber_1(String tktnumber_1) {
		this.tktnumber_1 = tktnumber_1;
	}

	public String getDocinfo() {
		return this.docinfo;
	}

	public void setDocinfo(String docinfo) {
		this.docinfo = docinfo;
	}

}
