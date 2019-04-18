package com.iapi.drools.dao.impl

//---新增 start---
// 护照是否国籍国签发  国籍相同则为1
static def HZGJGQF(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def passportissuecountry=pm.get("passportissuecountry");
    def nationality=pm.get("nationality");

    if(passportissuecountry!=null && !passportissuecountry.isEmpty() && nationality!=null && !nationality.isEmpty()){
        if(passportissuecountry==nationality){
            return 1;
        }else{
            return 0;
        }
    }else{
        return "";
    }
}

// 是否重点使领馆
static def ZDSLG(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality = pm.nationality;
    if (nationality == 'CHN' || nationality == 'TWN' || nationality == 'HKG' || nationality == 'MAC') {
        return '';
    }
    if (!ps.isEmpty()) {
        def one = ps.max { a -> ((a.visa_date =~ /[^0-9]/).replaceAll("") ?: -1) as long };
        if (one) {
            def visaAssignDept = one.visa_assign_dept?:"";
            if (!riskGj.isEmpty()) {
                def risks = riskGj.findAll{ a -> '51D8158EF05F429BB02469A1936BA207' == a.dictionaries_code }
                if (!risks.isEmpty()) {
                    for (gj in risks) {
                        if (gj.particulars_name  == visaAssignDept) {
                            return 1;
                        }
                    }
                }
                return 0;
            }
        }
    }
    return '';
}

// 是否曾在本国申请签证
static def BGSQQZ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality=pm.nationality;
    if( nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }
    for( gj in ps){
        if(gj.xxx==nationality){
            return 1;
        }
    }
    return 0;
}

// 是否有来往此次上机地记录
static def LWCCSJD(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def personId=pm.pers_id;
    def cityfrom=pm.cityfrom?:"";
    if(cityfrom==""){
        return "";
    }
    def newFltDate;
    def departdate=pm.departdate?:"";
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
    if(departdate!="" && departdate!="-"){
        newFltDate=sdf.format(departdate);
    }else{
        return '';
    }
    if(personId){
        org.elasticsearch.index.query.QueryBuilder apiQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
        List<HashMap> apiList = search.queryScroll(apiQueryBuilder, 'dcap_f_per_pred_api_psr_info_view*');
        if(!apiList.isEmpty()){
            for(obj in apiList){
                if(newFltDate!=obj.fltdate){
                    def fltdept=obj.fltdept;
                    if(cityfrom==fltdept){
                        return 1;
                    }
                }
            }
        }
    }
    return 0;
}

// 是否中国人首次出境
//static def CHNSCCJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
//
//	def nationality=pm.nationality;
//	if(nationality==null || nationality.isEmpty() || nationality!='CHN'){
//		return '';
//	}
//
//	if(imm==null || imm.isEmpty()){
//		return 1;
//	}
//
//
//	if(imm.size()==1){
//		def iotype=imm.get(0).in_out_flag;
//		if(iotype!=null && !iotype.isEmpty() && iotype=='2'){
//			return 1;
//		}
//	}
//
//	return 0;
//}

// 是否黑名单人员
static def HMD(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def blacklist='6CD6D731CD444A4A827CF3C505E69B4E';
    def familyName=pm.familyname;
    if(familyName==null || familyName.isEmpty()){
        familyName='';
    }
    def firstName=pm.firstname;
    if(firstName==null || firstName.isEmpty()){
        firstName='';
    }

    def middleName=pm.middlename;
    if(middleName==null || middleName.isEmpty()){
        middleName='';
    }

    org.elasticsearch.index.query.QueryBuilder queryHmd = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("type_code", blacklist))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("familyname", familyName + " " + middleName + " " + firstName));


    List<HashMap> hmd = search.getListResultsByQueryBuilder(queryHmd, '*tb_risk_namelist*');
    if(hmd==null || hmd.isEmpty()){
        return 0;
    }else{
        return 1;
    }
}

// 下机地是否为发达国家
static def FDGJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def developed='7E250BB178D440BEE0537A1210AC57A2';

    def cityTo = pm.cityto;
    if(cityTo==null || cityTo.isEmpty()){
        return '';
    }

    def countryCode='';
    if (airport!=null && !airport.isEmpty()) {
        for(HashMap map: airport){
            if(cityTo.equals(map.get("airport_code"))){
                countryCode= map.get("country_code");
                break;
            }
        }
    }

    if(countryCode.isEmpty() || riskGj==null || riskGj.isEmpty()){
        return '';
    }else{
        for(HashMap gj :riskGj){
            def dictionaries_code=gj.dictionaries_code;
            def particulars_name=gj.particulars_name;
            if(dictionaries_code!=null && !dictionaries_code.isEmpty() && particulars_name!=null && !particulars_name.isEmpty()
                    && dictionaries_code==developed && particulars_name==countryCode){
                return 1;
            }
        }
        return 0;
    }
}

// 是否中转返回本国
static def ZZHG(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality=pm.nationality;
    def destination=pm.destination;
    def flightType=pm.flighttype;

    def countryCode='';
    if (airport!=null && !airport.isEmpty() && destination!=null && !destination.isEmpty()) {
        for(HashMap map: airport){
            if(destination.equals(map.get("airport_code"))){
                countryCode= map.get("country_code");
                break;
            }
        }
    }

    if(flightType!=null && !flightType.isEmpty() && flightType.equals("I") && !countryCode.isEmpty() && nationality!=null && !nationality.isEmpty()){
        if(countryCode.equals(nationality) && !"CHN".equals(countryCode)){
            return 1;
        }else{
            return 0;
        }
    }else{
        return '';
    }
}

// 是否曾在本国上机
static def BGDJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality=pm.nationality;

    StringBuilder ss = new StringBuilder();
    List<HashMap> ff =  airport.findAll{a->a.country_code==nationality};
    ff.forEach({a->ss.append(a.airport_code).append(",")})

    def personId=pm.pers_id?:"";
    org.elasticsearch.index.query.QueryBuilder apiBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> jl = search.queryScroll(apiBuilder, 'dcap_f_per_pred_api_psr_info*');
    for(j in jl){
        if(ss.contains(j.FLTDEPT)){
            return 1;
        }
    }

    return 0;
}

// 是否在疆内有过常住或临住记录的人员
static def XJZS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def personId=pm.pers_id;


    org.elasticsearch.index.query.QueryBuilder wgrlzQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrlz = search.queryScroll(wgrlzQueryBuilder, 'dcap_f_per_fgn_temp_reg_view*');

    if(wgrlz!=null && !wgrlz.isEmpty()){
        for (HashMap values : wgrlz) {
            def xzdm=values.get("tsu_region_code");
            if(xzdm!=null && !xzdm.isEmpty() && xzdm.startsWith("65")){
                return 1;
            }
        }
    }


    org.elasticsearch.index.query.QueryBuilder wgrczQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrcz = search.queryScroll(wgrczQueryBuilder, 'dcap_f_per_fgn_resident_reg');

    if(wgrcz!=null && !wgrcz.isEmpty()){
        for (HashMap values : wgrcz) {
            def xzdm=values.get("curr_region_code");
            if(xzdm!=null && !xzdm.isEmpty() && xzdm.startsWith("65")){
                return 1;
            }
        }
    }

    return 0;
}

// 外国人签证是否国籍国签发
static def QZGJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    def one =ps.max { a-> ((a.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long };
    if(one){
        if(one.xxx==nationality){
            return 1;
        }else{
            return 0;
        }

    }
    return '';
}

// 是否当前和既往签证种类仅为X、L
static def QZXL(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }


    def xl='0';
    def notxl='0';
    if(ps!=null && !ps.isEmpty()){
        for(HashMap obj : ps){
            def visa_type =obj.visa_type;
            if(visa_type!=null && !visa_type.isEmpty()){
                visa_type=visa_type.toUpperCase();
                if("X"==visa_type || "L"==visa_type){
                    xl='1';
                }else{
                    notxl='1';
                }
            }
        }
    }

    if(notxl.equals("1")){
        return 0;
    }
    if(xl.equals("1")){
        return 1;
    }

    return '';
}

// 是否申请过团聚签证
static def QZTJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    //先判断该人是否是外国人
    def nationality=pm.nationality?:"";
    println("QZTJ..."+nationality);
    if(nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }
    if(!ps.isEmpty()){
        for(obj in ps){
            def visaType =obj.visa_type;
            println("QZTJ...visaType：" + visaType);
            if("K".equalsIgnoreCase(visaType) || "H".equalsIgnoreCase(visaType) || "Q1".equalsIgnoreCase(visaType) || "Q2".equalsIgnoreCase(visaType)){
                return "1";
            }
        }
        return "0";
    }else{
        println("QZTJ...ps null");
    }
    return "";


}

// 是否当前和既往签证种类仅为M和L
static def QZML(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }


    def ml='0';
    def notml='0';
    if(ps!=null && ps.size()>0){
        for(HashMap obj : ps){
            def visa_type =obj.visa_type;
            if(visa_type!=null && !visa_type.isEmpty()){
                visa_type=visa_type.toUpperCase();
                if("M"==visa_type || "L"==visa_type){
                    ml='1';
                }else{
                    notml='1';
                }
            }
        }
    }

    if(notml.equals("1")){
        return 0;
    }
    if(ml.equals("1")){
        return 1;
    }

    return '';
}

// 是否首次来华
static def SCLH(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    if(imm!=null && !imm.isEmpty()){
        return 0;
    }else{
        return 1;
    }
}

// 是否从非国籍国机场登机
static def FGJJC(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality=pm.nationality;
    def cityfrom=pm.cityfrom;

    def countryCode='';
    if (airport!=null && !airport.isEmpty() && cityfrom!=null && !cityfrom.isEmpty()) {
        for(HashMap map: airport){
            if(cityfrom.equals(map.get("airport_code"))){
                countryCode= map.get("country_code");
                break;
            }
        }
    }

    if(!countryCode.isEmpty() && nationality!=null &&  !nationality.isEmpty()){
        if(countryCode.equals(nationality)){
            return 0;
        }else{
            return 1;
        }
    }else{
        return '';
    }
}

// 姓
static def X(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.familyname==null?'':pm.familyname;
}

// 名
static def M(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.firstname==null?'':pm.firstname;
}

// 中间名
static def ZJM(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.middlename==null?'':pm.middlename;
}

// 中文姓名
static def ZWXM(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.intgChnname==null?'':pm.intgChnname;
}

// 英文姓名
static def YWXM(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
//    StringBuffer sbf=new StringBuffer("");
//    if(pm.familyname){
//        sbf.append(pm.familyname).append(" ");
//    }
//    if(pm.firstname){
//        sbf.append(pm.firstname).append(" ");
//    }
//    if(pm.middlename){
//        sbf.append(pm.middlename).append(" ");
//    }
//    if(sbf.length()>0){
//        sbf.deleteCharAt(sbf.length()-1);
//    }
//repaired by chengguojun

//    return sbf.toString();

    return pm.ename?:"";

}

// 职业
static def ZY(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    def personId=pm.pers_id;

    org.elasticsearch.index.query.QueryBuilder wgrczQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrcz = search.queryScroll(wgrczQueryBuilder, 'dcap_f_per_fgn_resident_reg');

    if(wgrcz!=null && !wgrcz.isEmpty()){

        List<HashMap> ss = wgrcz.sort(false) { b,a-> (((a.rsdt_start_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.rsdt_start_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).curr_work_id;
        return propert==null?'':propert;
    }

    return '';
}

// 工作单位
static def DW(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    def personId=pm.pers_id;

    org.elasticsearch.index.query.QueryBuilder wgrczQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrcz = search.queryScroll(wgrczQueryBuilder, 'dcap_f_per_fgn_resident_reg');

    if(wgrcz!=null && !wgrcz.isEmpty()){

        List<HashMap> ss = wgrcz.sort(false) { b,a-> (((a.rsdt_start_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.rsdt_start_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert=  ss.get(0).curr_wu_name;
        return propert==null?'':propert;
    }

    return '';
}

// 登记时间
static def DJSJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    def personId=pm.pers_id;

    org.elasticsearch.index.query.QueryBuilder wgrczQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrcz = search.queryScroll(wgrczQueryBuilder, 'dcap_f_per_fgn_resident_reg');

    if(wgrcz!=null && !wgrcz.isEmpty()){

        List<HashMap> ss = wgrcz.sort(false) { b,a-> (((a.rsdt_start_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.rsdt_start_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).rsdt_start_date;
        return propert==null?'':propert;
    }

    return '';
}

// 住宿时间
static def ZSSJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    def personId=pm.pers_id;

    org.elasticsearch.index.query.QueryBuilder wgrlzQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrlz = search.queryScroll(wgrlzQueryBuilder, 'dcap_f_per_fgn_temp_reg_view*');

    if(wgrlz!=null && !wgrlz.isEmpty()){

        List<HashMap> ss = wgrlz.sort(false) { b,a-> (((a.oper_dt=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.oper_dt=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert=  ss.get(0).stay_date;
        return propert==null?'':propert;
    }

    return '';
}

// 住宿地点
static def ZSDD(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    def personId=pm.pers_id;

    org.elasticsearch.index.query.QueryBuilder wgrlzQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrlz = search.queryScroll(wgrlzQueryBuilder, 'dcap_f_per_fgn_temp_reg_view*');

    if(wgrlz!=null && !wgrlz.isEmpty()){
        List<HashMap> ss = wgrlz.sort(false) { b,a-> (((a.oper_dt=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.oper_dt=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).stay_address;
        return propert==null?'':propert;
    }

    return '';
}

// 邀请单位
static def YQDW(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    if(ps!=null && !ps.isEmpty()){
        List<HashMap> ss = ps.sort(false) { b,a-> (((a.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).invt_unit_name;
        return propert==null?'':propert;
    }

    return '';
}

// 证件号码（护照号码）
static def ZJHM(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.passportno==null?'':pm.passportno;
}

// 证件有效期/护照有效期
static def HZYX(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.passportexpiredate==null?'':20+''+pm.passportexpiredate;
}

// 航班号
static def HBH(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.fltno==null?'':pm.fltno;
}

// 到达时间
static def DDSJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def arrivdate=pm.arrivdate;

    if(arrivdate==null){
        return '';
    }else{
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
        def propert= sdf.format(arrivdate);
        return propert==null?'':propert;
    }
}

// 中囯人证件签发地
static def ZJQFD(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality!='CHN'){
        return '';
    }

    if(ps!=null && !ps.isEmpty()){

        List<HashMap> ss = ps.sort(false) { b,a-> (((a.issuing_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.issuing_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).accred_unit;
        return propert==null?'':propert;
    }

    return '';
}

// 中囯人证件签发时间/中国人护照签发时间
static def ZJQFS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality!='CHN'){
        return '';
    }

    if(ps!=null && !ps.isEmpty()){

        List<HashMap> ss = ps.sort(false) { b,a-> (((a.issuing_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.issuing_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).issuing_date;
        return propert==null?'':propert;
    }

    return '';
}

// 身份证号前两位
static def CHNIDQLW(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality!='CHN'){
        return '';
    }

    if(ps!=null && !ps.isEmpty()){

        List<HashMap> ss = ps.sort(false) { b,a-> (((a.issuing_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.issuing_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def card_id= ss.get(0).pers_card_id;
        if(card_id!=null && !card_id.isEmpty() && card_id.length()>1){
            return card_id.getAt(0..1);
        }
    }

    return '';
}

// 签证签发停留期
static def QZTL(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    def flightType=pm.flighttype;
    if(flightType==null || flightType.isEmpty() || flightType!="O"){
        return '';
    }

    if(ps!=null && !ps.isEmpty() && imm!=null && !imm.isEmpty()){

        List<HashMap> ss = ps.sort(false) { b,a-> (((a.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def visa_period= ss.get(0).visa_period;

        if(visa_period==null || visa_period.isEmpty() || visa_period=='null' || visa_period=='-'){
            return '';
        }

        def imm_date='';

        List<HashMap> tempImm = imm.sort(false) { b,a-> (((a.imm_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.imm_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        for(HashMap temp : tempImm){
            def in_out_flag=temp.in_out_flag;
            if(in_out_flag!=null && !in_out_flag.isEmpty() && in_out_flag=='1'){
                imm_date=temp.imm_date;
                break;
            }
        }

        if(imm_date==null || imm_date.isEmpty() || imm_date=='null' || imm_date=='-'){
            return '';
        }


        java.util.regex.Pattern p = java.util.regex.Pattern.compile("[^0-9]");
        java.util.regex.Matcher matcher = p.matcher(visa_period);
        def rs = matcher.replaceAll("").trim();
        if(rs!=null && !rs.isEmpty()){
            def visaNum = Integer.parseInt(rs);
            if (visa_period.startsWith("N")) {
                visaNum = visaNum * 365;
            } else if (visa_period.startsWith("Y")) {
                visaNum = visaNum * 30;
            }

            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
            Calendar ca = Calendar.getInstance();
            ca.setTime(sdf.parse(imm_date));
            ca.add(Calendar.DAY_OF_MONTH, visaNum);

            return sdf.format(ca.getTime());
        }
    }

    return '';
}

// 外国人签证签发时间
static def QZQFS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    if(ps!=null && !ps.isEmpty()){

        List<HashMap> ss = ps.sort(false) { b,a-> (((a.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).visa_date;
        return propert==null?'':propert;
    }

    return '';
}

// 外国人签证号码
static def QZHM(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    if(ps!=null && !ps.isEmpty()){

        List<HashMap> ss = ps.sort(false) { b,a-> (((a.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.visa_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).visa_no;
        return propert==null?'':propert;
    }

    return '';
}

// 值机时间
static def ZJSJ(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.gappReceivetime==null?'':pm.gappReceivetime;
}

// 订票号
static def DPH(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.recordlocater==null?'':pm.recordlocater;
}

// 接待单位
static def JDDW(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    def personId=pm.pers_id;

    org.elasticsearch.index.query.QueryBuilder wgrlzQueryBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> wgrlz = search.queryScroll(wgrlzQueryBuilder, 'dcap_f_per_fgn_temp_reg_view*');

    if(wgrlz!=null && !wgrlz.isEmpty()){

        List<HashMap> ss = wgrlz.sort(false) { b,a-> (((a.oper_dt=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.oper_dt=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def propert= ss.get(0).rcpt_unit;
        return propert==null?'':propert;
    }

    return '';
}

// 出入境频次  ??
static def CRPC(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    int count=0;
    if(imm!=null && !imm.isEmpty()){
        count= imm.size()/2;
    }

    return count;
}

// 中国人出境天数
static def ZCTS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    def flightType=pm.flighttype;
    if(nationality==null || nationality.isEmpty() || nationality!='CHN' || flightType==null || flightType.isEmpty()){
        return '';
    }

    if(imm!=null && !imm.isEmpty() && flightType=="I"){

        List<HashMap> tempImm = imm.sort(false) { b,a-> (((a.imm_date=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.imm_date=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        def objImm=tempImm.get(0);
        def in_out_flag=objImm.in_out_flag;

        if(in_out_flag!=null && !in_out_flag.isEmpty() && in_out_flag=="2"){
            def imm_date=objImm.imm_date;
            if(imm_date!=null && !imm_date.isEmpty()){
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
                Calendar beginCalendar = Calendar.getInstance();
                beginCalendar.setTime(sdf.parse(imm_date));

                Calendar endCalendar = Calendar.getInstance();
                endCalendar.setTime(new Date());

                long beginTime = beginCalendar.getTime().getTime();
                long endTime = endCalendar.getTime().getTime();


                def tempMs=1000 * 60 * 60 * 24;
                int shangY = (endTime - beginTime) /tempMs;
                int yuY = (endTime - beginTime) % tempMs;

                if(yuY==0){
                    return shangY;
                }else{
                    return shangY+1;
                }
            }
        }
    }

    return '';
}

// 来华次数
static def LHCS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    def count=0;
    if(imm!=null && !imm.isEmpty()){
        for(HashMap obj : imm){
            def in_out_flag =obj.in_out_flag;
            if(in_out_flag!=null && !in_out_flag.isEmpty() && in_out_flag=="1"){
                count+=1;
            }
        }
    }

    return count;
}

// 中国签证办理次数
static def QZCS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    if(ps==null || ps.isEmpty()){
        return 0;
    }else{
        return ps.size();
    }
}

// 历史签证签发信息
static def QZLS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN' || nationality=='TWN' || nationality=='HKG' || nationality=='MAC'){
        return '';
    }

    StringBuffer sbf=new StringBuffer("");
    if(ps!=null && !ps.isEmpty()){
        for(HashMap obj : ps){
            def visaType=obj.visa_type;
            if(visaType!=null && !visaType.isEmpty()){
                sbf.append(visaType).append(",");
            }
        }
        if(sbf.length()>0){
            sbf.deleteCharAt(sbf.length()-1);
        }
    }

    return sbf.toString();
}

// 历史在华停留时长
static def LSTL(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }

    def dayLong=1000 * 60 * 60 * 24;
    def sunCount=0;
    def outTime='';
    def inDate='';
    def inOutFlag = '';

    Calendar newDataCal = Calendar.getInstance();
    newDataCal.setTime(new Date());
    newDataCal.add(Calendar.YEAR, -1);
    def newDataLong=newDataCal.getTime().getTime();

    if(imm!=null && !imm.isEmpty()){

        List<HashMap> tempImm = imm.sort{ b,a-> (((a.imm_dt=~ /[^0-9]/).replaceAll("")?:-1) as long ) <=> (((b.imm_dt=~ /[^0-9]/).replaceAll("")?:-1) as long )};
        for(HashMap obj : tempImm){
            inOutFlag=obj.in_out_flag;
            if(inOutFlag!=null && !inOutFlag.isEmpty() && "2"==inOutFlag){
                outTime = obj.imm_dt;
            }else{
                if(outTime!=null && !outTime.isEmpty()){
                    inDate=obj.imm_dt;
                    if(inDate!=null && !inDate.isEmpty() && inDate.length()==14){

                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
                        def inDateLong=sdf.parse(inDate).getTime();
                        def outTimeLong=sdf.parse(outTime).getTime();

                        if(newDataLong<=inDateLong){
                            def timedistance=outTimeLong-inDateLong;
                            int shangA=timedistance/dayLong;
                            int yuA=timedistance%dayLong;

                            if(yuA==0){
                                sunCount+=shangA;
                            }else{
                                sunCount=sunCount+shangA+1;
                            }
                        }else{
                            break;
                        }

                        outTime='';
                    }else{
                        outTime='';
                    }
                }
            }
        }

    }

    return sunCount;
}

// 5年内在华非法出入境记录次数
static def FFCR(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }
    def sumCount=0;
    def personId=pm.pers_id;


    org.elasticsearch.index.query.QueryBuilder asSwasjBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> list = search.queryScroll(asSwasjBuilder, 'dcap_f_evt_fgn_cas_person');

    if(list!=null && !list.isEmpty()){
        List<Object> queryField = new ArrayList<Object>();
        for(HashMap obj : list){
            queryField.add(obj.get("cas_intr_id"));
        }

        Date date = new Date();
        Calendar cal= Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -5);
        Date startDate=cal.getTime();

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        def dateStr=sdf.format(date);
        def startDateStr=sdf.format(startDate);

        org.elasticsearch.index.query.QueryBuilder tempBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.termsQuery("cas_intr_id", queryField))
                .must(org.elasticsearch.index.query.QueryBuilders.rangeQuery("cas_dt").from(startDateStr).to(dateStr));

        List<HashMap> tempList = search.queryScroll(tempBuilder, 'dcap_f_evt_fgn_case');
        if(tempList!=null && !tempList.isEmpty()){
            for(HashMap obj : tempList){
                def casType = obj.get("cas_type");
                if(casType!=null && !casType.isEmpty() && "4031401"==casType){
                    ++sumCount;
                }
            }
        }
    }

    return sumCount;
}

// 5年内在华非法居留记录次数
static def FFJL(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }
    def sumCount=0;
    def personId=pm.pers_id;


    org.elasticsearch.index.query.QueryBuilder asSwasjBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> list = search.queryScroll(asSwasjBuilder, 'dcap_f_evt_fgn_cas_person');

    if(list!=null && !list.isEmpty()){
        List<Object> queryField = new ArrayList<Object>();
        for(HashMap obj : list){
            queryField.add(obj.get("cas_intr_id"));
        }

        Date date = new Date();
        Calendar cal= Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -5);
        Date startDate=cal.getTime();

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        def dateStr=sdf.format(date);
        def startDateStr=sdf.format(startDate);

        org.elasticsearch.index.query.QueryBuilder tempBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.termsQuery("cas_intr_id", queryField))
                .must(org.elasticsearch.index.query.QueryBuilders.rangeQuery("cas_dt").from(startDateStr).to(dateStr));

        List<HashMap> tempList = search.queryScroll(tempBuilder, 'dcap_f_evt_fgn_case');
        if(tempList!=null && !tempList.isEmpty()){
            for(HashMap obj : tempList){
                def casType = obj.get("cas_type");
                if(casType!=null && !casType.isEmpty() && "4072902"==casType){
                    ++sumCount;
                }
            }
        }
    }

    return sumCount;
}

// 5年内在华非法就业记录次数
static def FFJY(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }
    def sumCount=0;
    def personId=pm.pers_id;

    def FIVENOJOBCHNS = "4158001 600109 4158002";


    org.elasticsearch.index.query.QueryBuilder asSwasjBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> list = search.queryScroll(asSwasjBuilder, 'dcap_f_evt_fgn_cas_person');

    if(list!=null && !list.isEmpty()){
        List<Object> queryField = new ArrayList<Object>();
        for(HashMap obj : list){
            queryField.add(obj.get("cas_intr_id"));
        }

        Date date = new Date();
        Calendar cal= Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -5);
        Date startDate=cal.getTime();

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        def dateStr=sdf.format(date);
        def startDateStr=sdf.format(startDate);

        org.elasticsearch.index.query.QueryBuilder tempBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.termsQuery("cas_intr_id", queryField))
                .must(org.elasticsearch.index.query.QueryBuilders.rangeQuery("cas_dt").from(startDateStr).to(dateStr));

        List<HashMap> tempList = search.queryScroll(tempBuilder, 'dcap_f_evt_fgn_case');
        if(tempList!=null && !tempList.isEmpty()){
            for(HashMap obj : tempList){
                def casType = obj.get("cas_type");
                if(casType!=null && !casType.isEmpty() && FIVENOJOBCHNS.contains(casType)){
                    ++sumCount;
                }
            }
        }
    }

    return sumCount;
}

// 2年内有在华违法住宿登记规定次数
static def WFZS(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality=pm.nationality;
    if(nationality==null || nationality.isEmpty() || nationality=='CHN'){
        return '';
    }
    def sumCount=0;
    def personId=pm.pers_id;

    def TOWNORSDTCHNS = "4084501 980418 980417 980419 600119 4157607 1015601 1015603 2014204 2046705 4157608 1015602 4084502";


    org.elasticsearch.index.query.QueryBuilder asSwasjBuilder = org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery('pers_id', personId);
    List<HashMap> list = search.queryScroll(asSwasjBuilder, 'dcap_f_evt_fgn_cas_person');

    if(list!=null && !list.isEmpty()){
        List<Object> queryField = new ArrayList<Object>();
        for(HashMap obj : list){
            queryField.add(obj.get("cas_intr_id"));
        }

        Date date = new Date();
        Calendar cal= Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -5);
        Date startDate=cal.getTime();

        Calendar cal2= Calendar.getInstance();
        cal2.setTime(date);
        cal2.add(Calendar.YEAR, -2);

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        def dateStr=sdf.format(date);
        def startDateStr=sdf.format(startDate);
        def startDateStr2=sdf.format(cal2.getTime());

        org.elasticsearch.index.query.QueryBuilder tempBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.termsQuery("cas_intr_id", queryField))
                .must(org.elasticsearch.index.query.QueryBuilders.rangeQuery("cas_dt").from(startDateStr).to(dateStr));

        List<HashMap> tempList = search.queryScroll(tempBuilder, 'dcap_f_evt_fgn_case');
        if(tempList!=null && !tempList.isEmpty()){
            for(HashMap obj : tempList){
                def casType = obj.get("cas_type");
                def casDt = obj.get("cas_dt");
                if (casDt!=null && !casDt.isEmpty() && startDateStr2!=null && !startDateStr2.isEmpty() && casType!=null && !casType.isEmpty()) {
                    long n1 = Long.parseLong(casDt);
                    long n2 = Long.parseLong(startDateStr2);
                    if (n1 > n2) {
                        if (TOWNORSDTCHNS.contains(casType)) {

                            ++sumCount;
                        }
                    }
                }
            }
        }
    }

    return sumCount;
}

// 是否前往涉恐国家
static def CRSK(Map<String, Object> pm,List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport,List<HashMap> fent,List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def terrorist="5F1450C59B8E45DF9E701EFC8CDCD83D";

    if(imm!=null && !imm.isEmpty() && riskGj!=null && !riskGj.isEmpty()){
        for(HashMap objImm : imm){
            def countryCode = objImm.to_country_code;
            if(countryCode!=null && !countryCode.isEmpty()){
                for(HashMap gj :riskGj){
                    def dictionaries_code=gj.dictionaries_code;
                    def particulars_name=gj.particulars_name;
                    if(dictionaries_code!=null && !dictionaries_code.isEmpty() && particulars_name!=null && !particulars_name.isEmpty()
                            && dictionaries_code==terrorist && particulars_name==countryCode){
                        return 1;
                    }
                }
            }
        }
    }


    def flightType=pm.flighttype;
    def cityfrom = pm.cityfrom;
    def cityTo = pm.cityto;
    def nation='';

    if(flightType!=null && !flightType.isEmpty()){
        if("I"==flightType){
            if (airport!=null && !airport.isEmpty() && cityfrom!=null && !cityfrom.isEmpty()) {
                for(HashMap map: airport){
                    if(cityfrom==map.airport_code){
                        nation= map.country_code;
                        break;
                    }
                }
            }
        }else{
            if (airport!=null && !airport.isEmpty() && cityTo!=null && !cityTo.isEmpty()) {
                for(HashMap map: airport){
                    if(cityTo==map.airport_code){
                        nation= map.country_code;
                        break;
                    }
                }
            }
        }
    }

    if(nation!=null && !nation.isEmpty()){
        for(HashMap gj :riskGj){
            def dictionaries_code=gj.dictionaries_code;
            def particulars_name=gj.particulars_name;
            if(dictionaries_code!=null && !dictionaries_code.isEmpty() && particulars_name!=null && !particulars_name.isEmpty()
                    && dictionaries_code==terrorist && particulars_name==nation){
                return 1;
            }
        }
    }

    return 0;
}
