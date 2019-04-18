package com.iapi.drools.bean;

import java.io.Serializable;

/**
 * 
 * @ClassName: EmphPersons
 * @Description: 重点关注人员信息
 * @author lipingle
 * @date 2018年9月18日 下午6:02:04
 */
public class EmphPersons implements Serializable {
	
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */ 
	private static final long serialVersionUID = 1L;
	
	public EmphPersons(String emphPersId) {
		super();
		this.emphPersId = emphPersId;
	}

	private String emphPersId;
	
	public String getEmphPersId() {
		return emphPersId;
	}

	public void setEmphPersId(String emphPersId) {
		this.emphPersId = emphPersId;
	}

}
