package com.iapi.drools.bean;

import java.io.Serializable;

public class TbRiskNamelist implements Serializable {
  private static final long serialVersionUID = 4642182054832174116L;
  private String serial;
  private String typeCode;
  private String familyname;
  private String firstname;
  private String middlename;
  private String gender;
  private java.sql.Date dateofbirth;
  private String nationality;
  private String cardtype;
  private String cardno;
  private java.sql.Date expiredate;
  private String status;
  private String eventcount;
  private String source;
  private String createuser;
  private java.sql.Date createtime;


  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  public String getFamilyname() {
    return familyname;
  }

  public void setFamilyname(String familyname) {
    this.familyname = familyname;
  }


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public String getMiddlename() {
    return middlename;
  }

  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public java.sql.Date getDateofbirth() {
    return dateofbirth;
  }

  public void setDateofbirth(java.sql.Date dateofbirth) {
    this.dateofbirth = dateofbirth;
  }


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public String getCardtype() {
    return cardtype;
  }

  public void setCardtype(String cardtype) {
    this.cardtype = cardtype;
  }


  public String getCardno() {
    return cardno;
  }

  public void setCardno(String cardno) {
    this.cardno = cardno;
  }


  public java.sql.Date getExpiredate() {
    return expiredate;
  }

  public void setExpiredate(java.sql.Date expiredate) {
    this.expiredate = expiredate;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getEventcount() {
    return eventcount;
  }

  public void setEventcount(String eventcount) {
    this.eventcount = eventcount;
  }


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public String getCreateuser() {
    return createuser;
  }

  public void setCreateuser(String createuser) {
    this.createuser = createuser;
  }


  public java.sql.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Date createtime) {
    this.createtime = createtime;
  }

}
