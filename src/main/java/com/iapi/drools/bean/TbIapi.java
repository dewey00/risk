package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 旅客申报信息 tb_iapi
 *
 * <p>Date: Thu Sep 27 17:28:52 CST 2018.</p>
 *
 * @author (lzw)
 */

public class TbIapi  implements Serializable {


	private static final long serialVersionUID =  6959181564545059760L;


	/**
	 * UUID
	 */
	private String serial;

	/**
	 * 数字字串,23位，年4位，月2位，日2位，小时2位，分钟2位，秒2位，毫秒3位，PID号6位，PID不足六位左补0
	 */
	private String tid;

	/**
	 * 人员唯一编号
	 */
	private String passenger_recordnum;

	/**
	 * 航班唯一编号
	 */
	private String flight_recordnum;

	/**
	 * 系统校验请求为‘S’网站批量请求为‘B’
	 */
	private String reqttype;

	/**
	 * GAPP_RECEIVETIME
	 */
	private String gapp_receivetime;

	/**
	 * GAPP_SENDTIME
	 */
	private String gapp_sendtime;

	/**
	 * 报文中的旅客是第几次发送，不是所有航空公司都会发送
	 */
	private String sendsequence;

	/**
	 * 航空公司英文名称
	 */
	private String applicationsenderid;

	/**
	 * 航空公司联系人姓名，中间可能有空格
	 */
	private String airlinecontactor;

	/**
	 * 航空公司联系电话
	 */
	private String airlinephone;

	/**
	 * 航空公司传真
	 */
	private String airlinefax;

	/**
	 * 两种可能 1.两位航空公司代码+航班号（含航班后缀），不需要补0，后缀1位字母；2.七位字母数字组合
	 */
	private String fltno;

	/**
	 * 航班是入境 I 是出境航班 O
	 */
	private String flighttype;

	/**
	 * 跨境航段为Y，即此航段在PAXLST中为LOC+125和LOC+87航段
	 */
	private String legcrossborder;

	/**
	 * 起飞航站
	 */
	private String cityfrom;

	/**
	 * 到达航站
	 */
	private String cityto;

	/**
	 * 计划起飞时间HHMM小时、分钟
	 */
	private String scheduledeparturetime;

	/**
	 * 计划到达时间HHMM，小时、分钟
	 */
	private String schedulearrivetime;

	/**
	 * 以需求角度用以区分不同报文CHECK 或者CHANGE
	 */
	private String operation;

	/**
	 * 城市三字码，旅客在此航班上的起飞城市，对应LOC+178
	 */
	private String origin;

	/**
	 * 城市三字码，旅客在此航班上的目的城市，对应LOC+179
	 */
	private String destination;

	/**
	 * 城市三字码，旅客清关城市，对应LOC+22
	 */
	private String clrarcity;

	/**
	 * 旅客的姓
	 */
	private String familyname;

	/**
	 * 旅客的名
	 */
	private String firstname;

	/**
	 * 旅客的中间名
	 */
	private String middlename;

	/**
	 * 旅客的ICS记录编号
	 */
	private String recordlocater;

	/**
	 * 旅客的ABO唯一标识，航班上唯一
	 */
	private String abono;

	/**
	 * 电子客票号
	 */
	private String tktnumber;

	/**
	 * SIA Known Traveler Indicator (Future Use) 
	 */
	private String aev;

	/**
	 * SIA Known Traveler Data (Future Use)
	 */
	private String cnk;

	/**
	 * SIA Known Traveler Data(Future Use)
	 */
	private String yzy;

	/**
	 * 旅客类型
	 */
	private String passengertype;

	/**
	 * 发送‘S’ 或者‘C’,S
	 */
	private String vid;

	/**
	 * ‘M’ or ‘F’ or ‘U’男，女，其他
	 */
	private String gender;

	/**
	 * YYMMDD,年，月，日
	 */
	private String dateofbirth;

	/**
	 * 出生国代码
	 */
	private String birthcountry;

	/**
	 * 三位国家代码
	 */
	private String nationality;

	/**
	 * 居住国三位国家代码
	 */
	private String residence;

	/**
	 * 护照号码
	 */
	private String passportno;

	/**
	 * 护照有效期YYMMDD,年，月，日
	 */
	private String passportexpiredate;

	/**
	 * 护照颁发三位国家代码
	 */
	private String passportissuecountry;

	/**
	 * 护照签发日期
	 */
	private String passportissuedate;

	/**
	 * Others号码
	 */
	private String other_no;

	/**
	 * Others有效期YYMMDD,年，月，日
	 */
	private String other_expiredate;

	/**
	 * Others签发国家
	 */
	private String other_issuecountry;

	/**
	 * Others签发日期
	 */
	private String otherdocumentissuedate;

	/**
	 * VISA类型
	 */
	private String visatype;

	/**
	 * VISA号码
	 */
	private String visano;

	/**
	 * VISA有效期YYMMDD,年，月，日
	 */
	private String visaexpiredate;

	/**
	 * VISA三位国家代码
	 */
	private String visaissuecountry;

	/**
	 * VISA签发日期
	 */
	private String visaissuedate;

	/**
	 * 目的地地址，街道门牌等
	 */
	private String destaddress;

	/**
	 * 目的地城市名字
	 */
	private String destcity;

	/**
	 * 目的地所在的省
	 */
	private String deststate;

	/**
	 * 三位国家代码
	 */
	private String destcountry;

	/**
	 * 目的地的邮编
	 */
	private String destpostalcode;

	/**
	 * 错误码0表示请求处理成功 1表示处理请求出现异常 2表示生成回复出现异常
	 */
	private String responecode;

	/**
	 * 错误信息对错误简单描述 成功回复：success 请求报文格式错误回复：format 旅客数据不完整：data incomplete 不在校验范围内：not in checking scope 修改时，找不到旅客：no passenger record
	 */
	private String responemsg;

	/**
	 * 校验结果0Z,1Z,2Z,4Z
	 */
	private String checkresult;

	/**
	 * 最终加压那结果
	 */
	private String lastcheckresult;

	/**
	 * 校验结果说明有时给出的校验结果报文中会带有校验状态说明，发送此说明信息此说明用在向航空公司回复的CUSRES报文的FTX段
	 */
	private String checkremark;

	/**
	 * 边检接收报文时间,checkin time
	 */
	private Date iapi_receivetime;

	/**
	 * 边检回复时间 
	 */
	private Date iapi_responsetime;

	/**
	 * 航班状态（0：取消 1:关闭 2:正在值机）
	 */
	private String flightstatus;

	/**
	 * 人员状态（0:已值机，未登机 1：已登机，未值机 2：已登机，已值机） 
	 */
	private String passengerstatus;

	/**
	 * 登机时间
	 */
	private Date lastupdatetime;

	/**
	 * 口岸
	 */
	private String port;

	/**
	 * 备降口岸
	 */
	private String changeport;

	/**
	 * 记录创建时间，默认oracle的sysdate
	 */
	private Date createtime;

	/**
	 * 分发时间
	 */
	private Date dis_time;

	/**
	 * 分发状态0：未分发，1：已分发
	 */
	private String dis_status;

	/**
	 * 同步状态0：未同步1：已同步
	 */
	private String syn_flag;

	/**
	 * 座位号
	 */
	private String specifigseat;

	/**
	 * 计划起飞时间
	 */
	private Date departdate;

	/**
	 * 计划到达时间
	 */
	private Date arrivdate;

	/**
	 * 出生日期
	 */
	private Date birthday;

	/**
	 * 第一证类
	 */
	private String passporttype;

	/**
	 * 第二证类
	 */
	private String otherdocumenttype;

	/**
	 * 护照类型（整合回填字段，11	外交护照
	 12	公务护照
	 13	因公普通护照
	 14	普通护照)
	 */
	private String intg_cardtype;

	/**
	 * 中文姓名（整合回填字段）
	 */
	private String intg_chnname;

	/**
	 * 性别（整合回填字段）
	 */
	private String intg_gender;

	/**
	 * 签证种类（整合回填字段）
	 */
	private String intg_visatype;

	/**
	 * 签证号码（整合回填字段）
	 */
	private String intg_visano;

	/**
	 * 数据状态，1有效，0失效
	 */
	private String status;

	public  TbIapi(){super();}

	public  TbIapi(String serial,String tid,String passenger_recordnum,String flight_recordnum,String reqttype,String gapp_receivetime,String gapp_sendtime,String sendsequence,String applicationsenderid,String airlinecontactor,String airlinephone,String airlinefax,String fltno,String flighttype,String legcrossborder,String cityfrom,String cityto,String scheduledeparturetime,String schedulearrivetime,String operation,String origin,String destination,String clrarcity,String familyname,String firstname,String middlename,String recordlocater,String abono,String tktnumber,String aev,String cnk,String yzy,String passengertype,String vid,String gender,String dateofbirth,String birthcountry,String nationality,String residence,String passportno,String passportexpiredate,String passportissuecountry,String passportissuedate,String other_no,String other_expiredate,String other_issuecountry,String otherdocumentissuedate,String visatype,String visano,String visaexpiredate,String visaissuecountry,String visaissuedate,String destaddress,String destcity,String deststate,String destcountry,String destpostalcode,String responecode,String responemsg,String checkresult,String lastcheckresult,String checkremark,Date iapi_receivetime,Date iapi_responsetime,String flightstatus,String passengerstatus,Date lastupdatetime,String port,String changeport,Date createtime,Date dis_time,String dis_status,String syn_flag,String specifigseat,Date departdate,Date arrivdate,Date birthday,String passporttype,String otherdocumenttype,String intg_cardtype,String intg_chnname,String intg_gender,String intg_visatype,String intg_visano,String status){
		this.serial=serial;
		this.tid=tid;
		this.passenger_recordnum=passenger_recordnum;
		this.flight_recordnum=flight_recordnum;
		this.reqttype=reqttype;
		this.gapp_receivetime=gapp_receivetime;
		this.gapp_sendtime=gapp_sendtime;
		this.sendsequence=sendsequence;
		this.applicationsenderid=applicationsenderid;
		this.airlinecontactor=airlinecontactor;
		this.airlinephone=airlinephone;
		this.airlinefax=airlinefax;
		this.fltno=fltno;
		this.flighttype=flighttype;
		this.legcrossborder=legcrossborder;
		this.cityfrom=cityfrom;
		this.cityto=cityto;
		this.scheduledeparturetime=scheduledeparturetime;
		this.schedulearrivetime=schedulearrivetime;
		this.operation=operation;
		this.origin=origin;
		this.destination=destination;
		this.clrarcity=clrarcity;
		this.familyname=familyname;
		this.firstname=firstname;
		this.middlename=middlename;
		this.recordlocater=recordlocater;
		this.abono=abono;
		this.tktnumber=tktnumber;
		this.aev=aev;
		this.cnk=cnk;
		this.yzy=yzy;
		this.passengertype=passengertype;
		this.vid=vid;
		this.gender=gender;
		this.dateofbirth=dateofbirth;
		this.birthcountry=birthcountry;
		this.nationality=nationality;
		this.residence=residence;
		this.passportno=passportno;
		this.passportexpiredate=passportexpiredate;
		this.passportissuecountry=passportissuecountry;
		this.passportissuedate=passportissuedate;
		this.other_no=other_no;
		this.other_expiredate=other_expiredate;
		this.other_issuecountry=other_issuecountry;
		this.otherdocumentissuedate=otherdocumentissuedate;
		this.visatype=visatype;
		this.visano=visano;
		this.visaexpiredate=visaexpiredate;
		this.visaissuecountry=visaissuecountry;
		this.visaissuedate=visaissuedate;
		this.destaddress=destaddress;
		this.destcity=destcity;
		this.deststate=deststate;
		this.destcountry=destcountry;
		this.destpostalcode=destpostalcode;
		this.responecode=responecode;
		this.responemsg=responemsg;
		this.checkresult=checkresult;
		this.lastcheckresult=lastcheckresult;
		this.checkremark=checkremark;
		this.iapi_receivetime=iapi_receivetime;
		this.iapi_responsetime=iapi_responsetime;
		this.flightstatus=flightstatus;
		this.passengerstatus=passengerstatus;
		this.lastupdatetime=lastupdatetime;
		this.port=port;
		this.changeport=changeport;
		this.createtime=createtime;
		this.dis_time=dis_time;
		this.dis_status=dis_status;
		this.syn_flag=syn_flag;
		this.specifigseat=specifigseat;
		this.departdate=departdate;
		this.arrivdate=arrivdate;
		this.birthday=birthday;
		this.passporttype=passporttype;
		this.otherdocumenttype=otherdocumenttype;
		this.intg_cardtype=intg_cardtype;
		this.intg_chnname=intg_chnname;
		this.intg_gender=intg_gender;
		this.intg_visatype=intg_visatype;
		this.intg_visano=intg_visano;
		this.status=status;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getPassenger_recordnum() {
		return this.passenger_recordnum;
	}

	public void setPassenger_recordnum(String passenger_recordnum) {
		this.passenger_recordnum = passenger_recordnum;
	}

	public String getFlight_recordnum() {
		return this.flight_recordnum;
	}

	public void setFlight_recordnum(String flight_recordnum) {
		this.flight_recordnum = flight_recordnum;
	}

	public String getReqttype() {
		return this.reqttype;
	}

	public void setReqttype(String reqttype) {
		this.reqttype = reqttype;
	}

	public String getGapp_receivetime() {
		return this.gapp_receivetime;
	}

	public void setGapp_receivetime(String gapp_receivetime) {
		this.gapp_receivetime = gapp_receivetime;
	}

	public String getGapp_sendtime() {
		return this.gapp_sendtime;
	}

	public void setGapp_sendtime(String gapp_sendtime) {
		this.gapp_sendtime = gapp_sendtime;
	}

	public String getSendsequence() {
		return this.sendsequence;
	}

	public void setSendsequence(String sendsequence) {
		this.sendsequence = sendsequence;
	}

	public String getApplicationsenderid() {
		return this.applicationsenderid;
	}

	public void setApplicationsenderid(String applicationsenderid) {
		this.applicationsenderid = applicationsenderid;
	}

	public String getAirlinecontactor() {
		return this.airlinecontactor;
	}

	public void setAirlinecontactor(String airlinecontactor) {
		this.airlinecontactor = airlinecontactor;
	}

	public String getAirlinephone() {
		return this.airlinephone;
	}

	public void setAirlinephone(String airlinephone) {
		this.airlinephone = airlinephone;
	}

	public String getAirlinefax() {
		return this.airlinefax;
	}

	public void setAirlinefax(String airlinefax) {
		this.airlinefax = airlinefax;
	}

	public String getFltno() {
		return this.fltno;
	}

	public void setFltno(String fltno) {
		this.fltno = fltno;
	}

	public String getFlighttype() {
		return this.flighttype;
	}

	public void setFlighttype(String flighttype) {
		this.flighttype = flighttype;
	}

	public String getLegcrossborder() {
		return this.legcrossborder;
	}

	public void setLegcrossborder(String legcrossborder) {
		this.legcrossborder = legcrossborder;
	}

	public String getCityfrom() {
		return this.cityfrom;
	}

	public void setCityfrom(String cityfrom) {
		this.cityfrom = cityfrom;
	}

	public String getCityto() {
		return this.cityto;
	}

	public void setCityto(String cityto) {
		this.cityto = cityto;
	}

	public String getScheduledeparturetime() {
		return this.scheduledeparturetime;
	}

	public void setScheduledeparturetime(String scheduledeparturetime) {
		this.scheduledeparturetime = scheduledeparturetime;
	}

	public String getSchedulearrivetime() {
		return this.schedulearrivetime;
	}

	public void setSchedulearrivetime(String schedulearrivetime) {
		this.schedulearrivetime = schedulearrivetime;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getClrarcity() {
		return this.clrarcity;
	}

	public void setClrarcity(String clrarcity) {
		this.clrarcity = clrarcity;
	}

	public String getFamilyname() {
		return this.familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getRecordlocater() {
		return this.recordlocater;
	}

	public void setRecordlocater(String recordlocater) {
		this.recordlocater = recordlocater;
	}

	public String getAbono() {
		return this.abono;
	}

	public void setAbono(String abono) {
		this.abono = abono;
	}

	public String getTktnumber() {
		return this.tktnumber;
	}

	public void setTktnumber(String tktnumber) {
		this.tktnumber = tktnumber;
	}

	public String getAev() {
		return this.aev;
	}

	public void setAev(String aev) {
		this.aev = aev;
	}

	public String getCnk() {
		return this.cnk;
	}

	public void setCnk(String cnk) {
		this.cnk = cnk;
	}

	public String getYzy() {
		return this.yzy;
	}

	public void setYzy(String yzy) {
		this.yzy = yzy;
	}

	public String getPassengertype() {
		return this.passengertype;
	}

	public void setPassengertype(String passengertype) {
		this.passengertype = passengertype;
	}

	public String getVid() {
		return this.vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getBirthcountry() {
		return this.birthcountry;
	}

	public void setBirthcountry(String birthcountry) {
		this.birthcountry = birthcountry;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getResidence() {
		return this.residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getPassportno() {
		return this.passportno;
	}

	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}

	public String getPassportexpiredate() {
		return this.passportexpiredate;
	}

	public void setPassportexpiredate(String passportexpiredate) {
		this.passportexpiredate = passportexpiredate;
	}

	public String getPassportissuecountry() {
		return this.passportissuecountry;
	}

	public void setPassportissuecountry(String passportissuecountry) {
		this.passportissuecountry = passportissuecountry;
	}

	public String getPassportissuedate() {
		return this.passportissuedate;
	}

	public void setPassportissuedate(String passportissuedate) {
		this.passportissuedate = passportissuedate;
	}

	public String getOther_no() {
		return this.other_no;
	}

	public void setOther_no(String other_no) {
		this.other_no = other_no;
	}

	public String getOther_expiredate() {
		return this.other_expiredate;
	}

	public void setOther_expiredate(String other_expiredate) {
		this.other_expiredate = other_expiredate;
	}

	public String getOther_issuecountry() {
		return this.other_issuecountry;
	}

	public void setOther_issuecountry(String other_issuecountry) {
		this.other_issuecountry = other_issuecountry;
	}

	public String getOtherdocumentissuedate() {
		return this.otherdocumentissuedate;
	}

	public void setOtherdocumentissuedate(String otherdocumentissuedate) {
		this.otherdocumentissuedate = otherdocumentissuedate;
	}

	public String getVisatype() {
		return this.visatype;
	}

	public void setVisatype(String visatype) {
		this.visatype = visatype;
	}

	public String getVisano() {
		return this.visano;
	}

	public void setVisano(String visano) {
		this.visano = visano;
	}

	public String getVisaexpiredate() {
		return this.visaexpiredate;
	}

	public void setVisaexpiredate(String visaexpiredate) {
		this.visaexpiredate = visaexpiredate;
	}

	public String getVisaissuecountry() {
		return this.visaissuecountry;
	}

	public void setVisaissuecountry(String visaissuecountry) {
		this.visaissuecountry = visaissuecountry;
	}

	public String getVisaissuedate() {
		return this.visaissuedate;
	}

	public void setVisaissuedate(String visaissuedate) {
		this.visaissuedate = visaissuedate;
	}

	public String getDestaddress() {
		return this.destaddress;
	}

	public void setDestaddress(String destaddress) {
		this.destaddress = destaddress;
	}

	public String getDestcity() {
		return this.destcity;
	}

	public void setDestcity(String destcity) {
		this.destcity = destcity;
	}

	public String getDeststate() {
		return this.deststate;
	}

	public void setDeststate(String deststate) {
		this.deststate = deststate;
	}

	public String getDestcountry() {
		return this.destcountry;
	}

	public void setDestcountry(String destcountry) {
		this.destcountry = destcountry;
	}

	public String getDestpostalcode() {
		return this.destpostalcode;
	}

	public void setDestpostalcode(String destpostalcode) {
		this.destpostalcode = destpostalcode;
	}

	public String getResponecode() {
		return this.responecode;
	}

	public void setResponecode(String responecode) {
		this.responecode = responecode;
	}

	public String getResponemsg() {
		return this.responemsg;
	}

	public void setResponemsg(String responemsg) {
		this.responemsg = responemsg;
	}

	public String getCheckresult() {
		return this.checkresult;
	}

	public void setCheckresult(String checkresult) {
		this.checkresult = checkresult;
	}

	public String getLastcheckresult() {
		return this.lastcheckresult;
	}

	public void setLastcheckresult(String lastcheckresult) {
		this.lastcheckresult = lastcheckresult;
	}

	public String getCheckremark() {
		return this.checkremark;
	}

	public void setCheckremark(String checkremark) {
		this.checkremark = checkremark;
	}

	public Date getIapi_receivetime() {
		return this.iapi_receivetime;
	}

	public void setIapi_receivetime(Date iapi_receivetime) {
		this.iapi_receivetime = iapi_receivetime;
	}

	public Date getIapi_responsetime() {
		return this.iapi_responsetime;
	}

	public void setIapi_responsetime(Date iapi_responsetime) {
		this.iapi_responsetime = iapi_responsetime;
	}

	public String getFlightstatus() {
		return this.flightstatus;
	}

	public void setFlightstatus(String flightstatus) {
		this.flightstatus = flightstatus;
	}

	public String getPassengerstatus() {
		return this.passengerstatus;
	}

	public void setPassengerstatus(String passengerstatus) {
		this.passengerstatus = passengerstatus;
	}

	public Date getLastupdatetime() {
		return this.lastupdatetime;
	}

	public void setLastupdatetime(Date lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getChangeport() {
		return this.changeport;
	}

	public void setChangeport(String changeport) {
		this.changeport = changeport;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getDis_time() {
		return this.dis_time;
	}

	public void setDis_time(Date dis_time) {
		this.dis_time = dis_time;
	}

	public String getDis_status() {
		return this.dis_status;
	}

	public void setDis_status(String dis_status) {
		this.dis_status = dis_status;
	}

	public String getSyn_flag() {
		return this.syn_flag;
	}

	public void setSyn_flag(String syn_flag) {
		this.syn_flag = syn_flag;
	}

	public String getSpecifigseat() {
		return this.specifigseat;
	}

	public void setSpecifigseat(String specifigseat) {
		this.specifigseat = specifigseat;
	}

	public Date getDepartdate() {
		return this.departdate;
	}

	public void setDepartdate(Date departdate) {
		this.departdate = departdate;
	}

	public Date getArrivdate() {
		return this.arrivdate;
	}

	public void setArrivdate(Date arrivdate) {
		this.arrivdate = arrivdate;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassporttype() {
		return this.passporttype;
	}

	public void setPassporttype(String passporttype) {
		this.passporttype = passporttype;
	}

	public String getOtherdocumenttype() {
		return this.otherdocumenttype;
	}

	public void setOtherdocumenttype(String otherdocumenttype) {
		this.otherdocumenttype = otherdocumenttype;
	}

	public String getIntg_cardtype() {
		return this.intg_cardtype;
	}

	public void setIntg_cardtype(String intg_cardtype) {
		this.intg_cardtype = intg_cardtype;
	}

	public String getIntg_chnname() {
		return this.intg_chnname;
	}

	public void setIntg_chnname(String intg_chnname) {
		this.intg_chnname = intg_chnname;
	}

	public String getIntg_gender() {
		return this.intg_gender;
	}

	public void setIntg_gender(String intg_gender) {
		this.intg_gender = intg_gender;
	}

	public String getIntg_visatype() {
		return this.intg_visatype;
	}

	public void setIntg_visatype(String intg_visatype) {
		this.intg_visatype = intg_visatype;
	}

	public String getIntg_visano() {
		return this.intg_visano;
	}

	public void setIntg_visano(String intg_visano) {
		this.intg_visano = intg_visano;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
