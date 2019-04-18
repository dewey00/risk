package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 新疆人名拼写代码表 dcap_f_com_cod_spell
 *
 * <p>Date: Thu Sep 27 11:37:33 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFComCodSpell  implements Serializable {


	private static final long serialVersionUID =  6537729557527464201L;


	/**
	 * 人名
	 */
	private String word;

	/**
	 * 人名描述
	 */
	private String word_desc;

	/**
	 * 备用人名1
	 */
	private String word_bk1;

	/**
	 * 备用人名2
	 */
	private String word_bk2;

	/**
	 * 备用人名3
	 */
	private String word_bk3;

	/**
	 * 备用人名4
	 */
	private String word_bk4;

	private String islock;

	public  DcapFComCodSpell(){super();}

	public  DcapFComCodSpell(String word,String word_desc,String word_bk1,String word_bk2,String word_bk3,String word_bk4,String islock){
		this.word=word;
		this.word_desc=word_desc;
		this.word_bk1=word_bk1;
		this.word_bk2=word_bk2;
		this.word_bk3=word_bk3;
		this.word_bk4=word_bk4;
		this.islock=islock;
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord_desc() {
		return this.word_desc;
	}

	public void setWord_desc(String word_desc) {
		this.word_desc = word_desc;
	}

	public String getWord_bk1() {
		return this.word_bk1;
	}

	public void setWord_bk1(String word_bk1) {
		this.word_bk1 = word_bk1;
	}

	public String getWord_bk2() {
		return this.word_bk2;
	}

	public void setWord_bk2(String word_bk2) {
		this.word_bk2 = word_bk2;
	}

	public String getWord_bk3() {
		return this.word_bk3;
	}

	public void setWord_bk3(String word_bk3) {
		this.word_bk3 = word_bk3;
	}

	public String getWord_bk4() {
		return this.word_bk4;
	}

	public void setWord_bk4(String word_bk4) {
		this.word_bk4 = word_bk4;
	}

	public String getIslock() {
		return this.islock;
	}

	public void setIslock(String islock) {
		this.islock = islock;
	}

}
