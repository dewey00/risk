package com.iapi.drools.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * API镞呭棰勬姤淇℃伅 dcap_f_per_pred_api_psr_info
 *
 * <p>Date: Thu Sep 27 11:38:58 CST 2018.</p>
 *
 * @author (lzw)
 */

public class DcapFPerPredApiPsrInfo  implements Serializable {


	private static final long serialVersionUID =  7052641879492403463L;


	/**
	 * 棰勬姤淇℃伅浜哄憳缂栧佛

	 */
	private String manifest_in_syscode;

	/**
	 * 浜哄憳ID锛屼汉锻桦熀链俊鎭〃镄勪富阌紝鍏朵粬浜哄憳鐩稿叧琛ㄥ阌?

	 */
	private String pers_id;

	/**
	 * 娑堟伅鍙戦€佽€呬唬镰?APSIS


	 */
	private String sndr;

	/**
	 * 娑堟伅鍙戦€佺殑镞堕棿

	 */
	private String dttm;

	/**
	 * 镓€鍙戦€佺殑娑堟伅绫诲瀷 API 鎴栬€汇SV


	 */
	private String msg_type;

	/**
	 * 鍑哄叆澧冩爣蹇楋紝A锛氩叆澧?D锛氩嚭澧?


	 */
	private String aord;

	/**
	 * 鑸┖鍏徃浠ｇ爜
	 */
	private String fltairlcode;

	/**
	 * 鑸
	 */
	private String fltnumber;

	/**
	 * 鑸彮鍚庣紑

	 */
	private String fltsuffix;

	/**
	 * 鑸彮镞ユ湡
	 */
	private String fltdate;

	/**
	 * 鍑哄彂鍦帮紝璧烽链哄満浠ｇ爜

	 */
	private String fltdept;

	/**
	 * 鍑哄彂镞堕棿

	 */
	private String fltdepttm;

	/**
	 * 鐩殑鍦?鐩殑鍦帮紝鍒拌揪链哄満浠ｇ爜

	 */
	private String fltdest;

	/**
	 * 鍒拌揪镞堕棿

	 */
	private String fltdesttm;

	/**
	 * 涓枃濮揿悕


	 */
	private String psrchnname;

	/**
	 * 鑻辨枃濮揿悕

	 */
	private String psrname;

	/**
	 * 濮?
	 */
	private String pdt_lastname;

	/**
	 * 涓棿鍚?

	 */
	private String pdt_midname;

	/**
	 * 鍚?

	 */
	private String pdt_firstname;

	/**
	 * 镐у埆

	 */
	private String psrgender;

	/**
	 * 锲界睄浠ｇ爜

	 */
	private String pdtcountry;

	/**
	 * 璇佷欢绫诲埆浠ｇ爜

	 */
	private String cert_type;

	/**
	 * 璇佷欢鍙风爜
	 */
	private String cert_no;

	/**
	 * 鍑虹敓镞ユ湡

	 */
	private String pdtbirthday;

	/**
	 * 绗簩鑸┖鍏徃浠ｇ爜

	 */
	private String fltairlcode2;

	/**
	 * 绗簩鑸彮鍙风爜

	 */
	private String fltnumber2;

	/**
	 * 绗簩鑸彮鍚庣紑

	 */
	private String fltsuffix2;

	/**
	 * 绗簩鑸彮镞ユ湡

	 */
	private String fltdate2;

	/**
	 * 璧烽鑸珯

	 */
	private String segdeptcode;

	/**
	 * 鍒拌揪鑸珯
	 */
	private String segdestcode;

	/**
	 * 鑸珯璧烽镞堕棿

	 */
	private String stadepttm;

	/**
	 * 鑸珯鍒拌揪镞堕棿

	 */
	private String staarvetm;

	/**
	 * 鏄惁宸茬‘璁?

	 */
	private String is_checked;

	/**
	 * 镆ョ湅娆℃暟锛埚彲鐤戞梾瀹㈡彁绀猴级

	 */
	private String intlookcount;

	/**
	 * 鏄惁鏀惧纯镙囧织

	 */
	private String is_discard;

	/**
	 * 鏄惁琚鍏ヤ腑闂磋〃(0:链鍏ワ紝 1:姝ｅ湪瀵煎叆锛?2锛氩凡瀵煎叆)

	 */
	private String is_imported;

	/**
	 * 鏄惁宸茶钬滈璀︽瘮瀵光€?0:链瘮瀵?1:姝ｅ湪姣斿 2锛氩凡姣斿)

	 */
	private String is_yujing;

	/**
	 * 鍑哄叆澧冩椂闂达细鍑哄镄勮捣椋炴椂闂达紝鍏ュ镄勫埌杈炬椂闂?

	 */
	private String  aorotime ;

	/**
	 * 姊呮矙镙￠獙鏄惁鎴愬姛 锛?锛氢笉鎴愬姛锛?锛氭垚锷?

	 */
	private String is_cfic_suc;

	/**
	 * 瀵瑰簲镄勮埅鐝〃绯荤粺搴忓垪鍙?

	 */
	private String manifest_flt_syscode;

	/**
	 * 镞呭绫诲瀷锛孎L锛氭梾瀹紝FM锛氭満缁勶紝DDT锛氢腑杞満缁勶紝DDU锛氢腑杞梾瀹?

	 */
	private String psrtype;

	/**
	 * 锷犺浇镞堕棿鎴?

	 */
	private String load_dt;

	/**
	 * 0
	 */
	private String objectid;

	/**
	 * 浜哄憳濮揿悕鎷奸煶

	 */
	private String pers_name_seh;

	/**
	 * 浜哄憳濮揿悕

	 */
	private String pers_name;

	/**
	 * 浜ら€氩伐鍏锋爣璇?

	 */
	private String trs_id;

	/**
	 * 鑸┖鍏徃鍚岖О

	 */
	private String fltairl_na;

	/**
	 * 鍑哄彂鍦帮紝璧烽链哄満鍚岖О

	 */
	private String fltdept_na;

	/**
	 * 璧烽鍩庡竞浠ｇ爜
	 */
	private String fltcity;

	/**
	 * 璧烽鍩庡竞鍚岖О
	 */
	private String fltcity_na;

	/**
	 * 璧烽锲藉浠ｇ爜
	 */
	private String fltcountry;

	/**
	 * 璧烽锲藉鍚岖О
	 */
	private String fltcountry_na;

	/**
	 * 鐩殑鍦?
	 */
	private String fltdest_na;

	/**
	 * 镐у埆 锛团锛氩コ M锛氱敺 C锛氩効绔ワ级鍚岖О

	 */
	private String psrgender_na;

	/**
	 * 锲界睄鍚岖О
	 */
	private String pdtcountry_na;

	/**
	 * 璇佷欢绫诲瀷鍚岖О

	 */
	private String cert_type_na;

	/**
	 * 绗簩鑸┖鍏徃鍚岖О

	 */
	private String fltairlcode2_na;

	/**
	 * 璧烽鑸珯鍚岖О
	 */
	private String segdeptcode_na;

	/**
	 * 鍒拌揪鑸珯鍚岖О

	 */
	private String segdestcode_na;

	/**
	 * 鍑哄叆澧冩椂闂?

	 */
	private Date aord_time;

	/**
	 * 杩囨护镙囱
	 */
	private String filterflag;

	public  DcapFPerPredApiPsrInfo(){super();}

	public  DcapFPerPredApiPsrInfo(String manifest_in_syscode,String pers_id,String sndr,String dttm,String msg_type,String aord,String fltairlcode,String fltnumber,String fltsuffix,String fltdate,String fltdept,String fltdepttm,String fltdest,String fltdesttm,String psrchnname,String psrname,String pdt_lastname,String pdt_midname,String pdt_firstname,String psrgender,String pdtcountry,String cert_type,String cert_no,String pdtbirthday,String fltairlcode2,String fltnumber2,String fltsuffix2,String fltdate2,String segdeptcode,String segdestcode,String stadepttm,String staarvetm,String is_checked,String intlookcount,String is_discard,String is_imported,String is_yujing,String aorotime,String is_cfic_suc,String manifest_flt_syscode,String psrtype,String load_dt,String objectid,String pers_name_seh,String pers_name,String trs_id,String fltairl_na,String fltdept_na,String fltcity,String fltcity_na,String fltcountry,String fltcountry_na,String fltdest_na,String psrgender_na,String pdtcountry_na,String cert_type_na,String fltairlcode2_na,String segdeptcode_na,String segdestcode_na,Date aord_time,String filterflag){
		this.manifest_in_syscode=manifest_in_syscode;
		this.pers_id=pers_id;
		this.sndr=sndr;
		this.dttm=dttm;
		this.msg_type=msg_type;
		this.aord=aord;
		this.fltairlcode=fltairlcode;
		this.fltnumber=fltnumber;
		this.fltsuffix=fltsuffix;
		this.fltdate=fltdate;
		this.fltdept=fltdept;
		this.fltdepttm=fltdepttm;
		this.fltdest=fltdest;
		this.fltdesttm=fltdesttm;
		this.psrchnname=psrchnname;
		this.psrname=psrname;
		this.pdt_lastname=pdt_lastname;
		this.pdt_midname=pdt_midname;
		this.pdt_firstname=pdt_firstname;
		this.psrgender=psrgender;
		this.pdtcountry=pdtcountry;
		this.cert_type=cert_type;
		this.cert_no=cert_no;
		this.pdtbirthday=pdtbirthday;
		this.fltairlcode2=fltairlcode2;
		this.fltnumber2=fltnumber2;
		this.fltsuffix2=fltsuffix2;
		this.fltdate2=fltdate2;
		this.segdeptcode=segdeptcode;
		this.segdestcode=segdestcode;
		this.stadepttm=stadepttm;
		this.staarvetm=staarvetm;
		this.is_checked=is_checked;
		this.intlookcount=intlookcount;
		this.is_discard=is_discard;
		this.is_imported=is_imported;
		this.is_yujing=is_yujing;
		this.aorotime=aorotime;
		this.is_cfic_suc=is_cfic_suc;
		this.manifest_flt_syscode=manifest_flt_syscode;
		this.psrtype=psrtype;
		this.load_dt=load_dt;
		this.objectid=objectid;
		this.pers_name_seh=pers_name_seh;
		this.pers_name=pers_name;
		this.trs_id=trs_id;
		this.fltairl_na=fltairl_na;
		this.fltdept_na=fltdept_na;
		this.fltcity=fltcity;
		this.fltcity_na=fltcity_na;
		this.fltcountry=fltcountry;
		this.fltcountry_na=fltcountry_na;
		this.fltdest_na=fltdest_na;
		this.psrgender_na=psrgender_na;
		this.pdtcountry_na=pdtcountry_na;
		this.cert_type_na=cert_type_na;
		this.fltairlcode2_na=fltairlcode2_na;
		this.segdeptcode_na=segdeptcode_na;
		this.segdestcode_na=segdestcode_na;
		this.aord_time=aord_time;
		this.filterflag=filterflag;
	}

	public String getManifest_in_syscode() {
		return this.manifest_in_syscode;
	}

	public void setManifest_in_syscode(String manifest_in_syscode) {
		this.manifest_in_syscode = manifest_in_syscode;
	}

	public String getPers_id() {
		return this.pers_id;
	}

	public void setPers_id(String pers_id) {
		this.pers_id = pers_id;
	}

	public String getSndr() {
		return this.sndr;
	}

	public void setSndr(String sndr) {
		this.sndr = sndr;
	}

	public String getDttm() {
		return this.dttm;
	}

	public void setDttm(String dttm) {
		this.dttm = dttm;
	}

	public String getMsg_type() {
		return this.msg_type;
	}

	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}

	public String getAord() {
		return this.aord;
	}

	public void setAord(String aord) {
		this.aord = aord;
	}

	public String getFltairlcode() {
		return this.fltairlcode;
	}

	public void setFltairlcode(String fltairlcode) {
		this.fltairlcode = fltairlcode;
	}

	public String getFltnumber() {
		return this.fltnumber;
	}

	public void setFltnumber(String fltnumber) {
		this.fltnumber = fltnumber;
	}

	public String getFltsuffix() {
		return this.fltsuffix;
	}

	public void setFltsuffix(String fltsuffix) {
		this.fltsuffix = fltsuffix;
	}

	public String getFltdate() {
		return this.fltdate;
	}

	public void setFltdate(String fltdate) {
		this.fltdate = fltdate;
	}

	public String getFltdept() {
		return this.fltdept;
	}

	public void setFltdept(String fltdept) {
		this.fltdept = fltdept;
	}

	public String getFltdepttm() {
		return this.fltdepttm;
	}

	public void setFltdepttm(String fltdepttm) {
		this.fltdepttm = fltdepttm;
	}

	public String getFltdest() {
		return this.fltdest;
	}

	public void setFltdest(String fltdest) {
		this.fltdest = fltdest;
	}

	public String getFltdesttm() {
		return this.fltdesttm;
	}

	public void setFltdesttm(String fltdesttm) {
		this.fltdesttm = fltdesttm;
	}

	public String getPsrchnname() {
		return this.psrchnname;
	}

	public void setPsrchnname(String psrchnname) {
		this.psrchnname = psrchnname;
	}

	public String getPsrname() {
		return this.psrname;
	}

	public void setPsrname(String psrname) {
		this.psrname = psrname;
	}

	public String getPdt_lastname() {
		return this.pdt_lastname;
	}

	public void setPdt_lastname(String pdt_lastname) {
		this.pdt_lastname = pdt_lastname;
	}

	public String getPdt_midname() {
		return this.pdt_midname;
	}

	public void setPdt_midname(String pdt_midname) {
		this.pdt_midname = pdt_midname;
	}

	public String getPdt_firstname() {
		return this.pdt_firstname;
	}

	public void setPdt_firstname(String pdt_firstname) {
		this.pdt_firstname = pdt_firstname;
	}

	public String getPsrgender() {
		return this.psrgender;
	}

	public void setPsrgender(String psrgender) {
		this.psrgender = psrgender;
	}

	public String getPdtcountry() {
		return this.pdtcountry;
	}

	public void setPdtcountry(String pdtcountry) {
		this.pdtcountry = pdtcountry;
	}

	public String getCert_type() {
		return this.cert_type;
	}

	public void setCert_type(String cert_type) {
		this.cert_type = cert_type;
	}

	public String getCert_no() {
		return this.cert_no;
	}

	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
	}

	public String getPdtbirthday() {
		return this.pdtbirthday;
	}

	public void setPdtbirthday(String pdtbirthday) {
		this.pdtbirthday = pdtbirthday;
	}

	public String getFltairlcode2() {
		return this.fltairlcode2;
	}

	public void setFltairlcode2(String fltairlcode2) {
		this.fltairlcode2 = fltairlcode2;
	}

	public String getFltnumber2() {
		return this.fltnumber2;
	}

	public void setFltnumber2(String fltnumber2) {
		this.fltnumber2 = fltnumber2;
	}

	public String getFltsuffix2() {
		return this.fltsuffix2;
	}

	public void setFltsuffix2(String fltsuffix2) {
		this.fltsuffix2 = fltsuffix2;
	}

	public String getFltdate2() {
		return this.fltdate2;
	}

	public void setFltdate2(String fltdate2) {
		this.fltdate2 = fltdate2;
	}

	public String getSegdeptcode() {
		return this.segdeptcode;
	}

	public void setSegdeptcode(String segdeptcode) {
		this.segdeptcode = segdeptcode;
	}

	public String getSegdestcode() {
		return this.segdestcode;
	}

	public void setSegdestcode(String segdestcode) {
		this.segdestcode = segdestcode;
	}

	public String getStadepttm() {
		return this.stadepttm;
	}

	public void setStadepttm(String stadepttm) {
		this.stadepttm = stadepttm;
	}

	public String getStaarvetm() {
		return this.staarvetm;
	}

	public void setStaarvetm(String staarvetm) {
		this.staarvetm = staarvetm;
	}

	public String getIs_checked() {
		return this.is_checked;
	}

	public void setIs_checked(String is_checked) {
		this.is_checked = is_checked;
	}

	public String getIntlookcount() {
		return this.intlookcount;
	}

	public void setIntlookcount(String intlookcount) {
		this.intlookcount = intlookcount;
	}

	public String getIs_discard() {
		return this.is_discard;
	}

	public void setIs_discard(String is_discard) {
		this.is_discard = is_discard;
	}

	public String getIs_imported() {
		return this.is_imported;
	}

	public void setIs_imported(String is_imported) {
		this.is_imported = is_imported;
	}

	public String getIs_yujing() {
		return this.is_yujing;
	}

	public void setIs_yujing(String is_yujing) {
		this.is_yujing = is_yujing;
	}

	public String aorotime() {
		return this.aorotime;
	}

	public void setAorotime(String aorotime) {
		this.aorotime = aorotime;
	}

	public String getIs_cfic_suc() {
		return this.is_cfic_suc;
	}

	public void setIs_cfic_suc(String is_cfic_suc) {
		this.is_cfic_suc = is_cfic_suc;
	}

	public String getManifest_flt_syscode() {
		return this.manifest_flt_syscode;
	}

	public void setManifest_flt_syscode(String manifest_flt_syscode) {
		this.manifest_flt_syscode = manifest_flt_syscode;
	}

	public String getPsrtype() {
		return this.psrtype;
	}

	public void setPsrtype(String psrtype) {
		this.psrtype = psrtype;
	}

	public String getLoad_dt() {
		return this.load_dt;
	}

	public void setLoad_dt(String load_dt) {
		this.load_dt = load_dt;
	}

	public String getObjectid() {
		return this.objectid;
	}

	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}

	public String getPers_name_seh() {
		return this.pers_name_seh;
	}

	public void setPers_name_seh(String pers_name_seh) {
		this.pers_name_seh = pers_name_seh;
	}

	public String getPers_name() {
		return this.pers_name;
	}

	public void setPers_name(String pers_name) {
		this.pers_name = pers_name;
	}

	public String getTrs_id() {
		return this.trs_id;
	}

	public void setTrs_id(String trs_id) {
		this.trs_id = trs_id;
	}

	public String getFltairl_na() {
		return this.fltairl_na;
	}

	public void setFltairl_na(String fltairl_na) {
		this.fltairl_na = fltairl_na;
	}

	public String getFltdept_na() {
		return this.fltdept_na;
	}

	public void setFltdept_na(String fltdept_na) {
		this.fltdept_na = fltdept_na;
	}

	public String getFltcity() {
		return this.fltcity;
	}

	public void setFltcity(String fltcity) {
		this.fltcity = fltcity;
	}

	public String getFltcity_na() {
		return this.fltcity_na;
	}

	public void setFltcity_na(String fltcity_na) {
		this.fltcity_na = fltcity_na;
	}

	public String getFltcountry() {
		return this.fltcountry;
	}

	public void setFltcountry(String fltcountry) {
		this.fltcountry = fltcountry;
	}

	public String getFltcountry_na() {
		return this.fltcountry_na;
	}

	public void setFltcountry_na(String fltcountry_na) {
		this.fltcountry_na = fltcountry_na;
	}

	public String getFltdest_na() {
		return this.fltdest_na;
	}

	public void setFltdest_na(String fltdest_na) {
		this.fltdest_na = fltdest_na;
	}

	public String getPsrgender_na() {
		return this.psrgender_na;
	}

	public void setPsrgender_na(String psrgender_na) {
		this.psrgender_na = psrgender_na;
	}

	public String getPdtcountry_na() {
		return this.pdtcountry_na;
	}

	public void setPdtcountry_na(String pdtcountry_na) {
		this.pdtcountry_na = pdtcountry_na;
	}

	public String getCert_type_na() {
		return this.cert_type_na;
	}

	public void setCert_type_na(String cert_type_na) {
		this.cert_type_na = cert_type_na;
	}

	public String getFltairlcode2_na() {
		return this.fltairlcode2_na;
	}

	public void setFltairlcode2_na(String fltairlcode2_na) {
		this.fltairlcode2_na = fltairlcode2_na;
	}

	public String getSegdeptcode_na() {
		return this.segdeptcode_na;
	}

	public void setSegdeptcode_na(String segdeptcode_na) {
		this.segdeptcode_na = segdeptcode_na;
	}

	public String getSegdestcode_na() {
		return this.segdestcode_na;
	}

	public void setSegdestcode_na(String segdestcode_na) {
		this.segdestcode_na = segdestcode_na;
	}

	public Date getAord_time() {
		return this.aord_time;
	}

	public void setAord_time(Date aord_time) {
		this.aord_time = aord_time;
	}

	public String getFilterflag() {
		return this.filterflag;
	}

	public void setFilterflag(String filterflag) {
		this.filterflag = filterflag;
	}

}
