package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 支付信息 tb_pnr_fop  支付信息
 *
 * <p>Date: Thu Sep 27 17:28:57 CST 2018.</p>
 *
 * @author (lzw)
 */

public class TbPnrFop  implements Serializable {


	private static final long serialVersionUID =  8321684180580965729L;


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
	 * GR3SERIAL
	 */
	private String gr3serial;

	/**
	 * GR4SERIAL
	 */
	private String gr4serial;

	/**
	 * 付款方式
	 */
	private String payment_type;

	/**
	 * 标识新、旧、原始的付款方式
	 */
	private String data_indicator;

	/**
	 * 此付款方式的金额
	 */
	private String monetary_amount;

	/**
	 * 信用卡支付方式（CC）时的信用卡公司代码
	 */
	private String vendor_code;

	/**
	 *  CC/GR/SGR支付方式时的账号信息
	 */
	private String account_number;

	/**
	 * 信用卡支付方式（CC）时信用卡的有效期
	 */
	private String expiration_date;

	/**
	 * 自由文本
	 */
	private String freetxt;

	/**
	 * 创建时间
	 */
	private Date createtime;

	/**
	 * 报文发送时间 72,24,2,1,0

	 */
	private String sendtime;

	public  TbPnrFop(){super();}

	public  TbPnrFop(String globalserial,String tid,String gr1serial,String gr2serial,String gr3serial,String gr4serial,String payment_type,String data_indicator,String monetary_amount,String vendor_code,String account_number,String expiration_date,String freetxt,Date createtime,String sendtime){
		this.globalserial=globalserial;
		this.tid=tid;
		this.gr1serial=gr1serial;
		this.gr2serial=gr2serial;
		this.gr3serial=gr3serial;
		this.gr4serial=gr4serial;
		this.payment_type=payment_type;
		this.data_indicator=data_indicator;
		this.monetary_amount=monetary_amount;
		this.vendor_code=vendor_code;
		this.account_number=account_number;
		this.expiration_date=expiration_date;
		this.freetxt=freetxt;
		this.createtime=createtime;
		this.sendtime=sendtime;
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

	public String getGr3serial() {
		return this.gr3serial;
	}

	public void setGr3serial(String gr3serial) {
		this.gr3serial = gr3serial;
	}

	public String getGr4serial() {
		return this.gr4serial;
	}

	public void setGr4serial(String gr4serial) {
		this.gr4serial = gr4serial;
	}

	public String getPayment_type() {
		return this.payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getData_indicator() {
		return this.data_indicator;
	}

	public void setData_indicator(String data_indicator) {
		this.data_indicator = data_indicator;
	}

	public String getMonetary_amount() {
		return this.monetary_amount;
	}

	public void setMonetary_amount(String monetary_amount) {
		this.monetary_amount = monetary_amount;
	}

	public String getVendor_code() {
		return this.vendor_code;
	}

	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}

	public String getAccount_number() {
		return this.account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getExpiration_date() {
		return this.expiration_date;
	}

	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	public String getFreetxt() {
		return this.freetxt;
	}

	public void setFreetxt(String freetxt) {
		this.freetxt = freetxt;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}

}
