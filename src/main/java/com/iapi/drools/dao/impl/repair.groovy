package com.iapi.drools.dao.impl
// 是否首次来本市 1
static def SCLC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def destination = pm.destination;
    def cityTo = pm.cityto;
    if (imm.isEmpty()) {
        return "1";
    } else {
        // 根据口岸代码查询所有去过的城市
        StringBuilder str = new StringBuilder();
        for(i in imm){
             def jc = airport.find{a->a.imm_port_code==i.imm_port_code}
             if(jc){
                 str.append(jc[0].city_code).append(',')
             }
        }
        def cs;
        // 找到城市代码
        def csds = airport.find{a->a.airport_code==destination}
        if(csds){
            cs=csds[0].city_code?:"";
            if(str.toString().contains(cs)){
                return "1";
            }
        }

        def cscs = airport.find{a->a.airport_code==cityTo}
        if(cscs){
            cs=csds[0].city_code?:"";
            if(str.toString().contains(cs)){
                return "1";
            }
        }
    }
    return "";
}
// 是否出境预订多个航班
static def YDHB(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
     def passportno = pm.passPortNo?:"";
     def nationality = pm.nationality?:"";
    org.elasticsearch.index.query.QueryBuilder iapi = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("passportno", passportno))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("nationality", nationality));
    List<HashMap> result = search.queryScroll(iapi,"tb-riskiapi-*");
    long timeStamp = System.currentTimeMillis();
    Date now = new Date(Long.parseLong(String.valueOf(timeStamp - 7200000)));
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMM d, yyyy K:m:s a",Locale.ENGLISH);
    if(result.isEmpty()){
        return "0"
    }else {
        List list = new ArrayList();
        for(i in result){
            def createTime = i.createtime?:"";
            try {
                Date d2 =sdf.parse(createTime);
                if (d2.getTime() > now.getTime()) {
                    list.add(1);
                }
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        }
        if(list.size()>1){
            return "1"
        }else {
            return "0"
        }
    }


}
//是否有3天内的出入境记录
static def CRJJL3FDCRJ17(Map<String, Object> pm, List<HashMap> imm, List<Map<String, Object>> riskGj, List<Map<String, Object>> airport, List<HashMap> foreign, com.iapi.drools.dao.IElasticSearchDao search) {
    // 是否有三天内的出入境记录
    long timeStamp = System.currentTimeMillis();
    Date now = new Date(Long.parseLong(String.valueOf(timeStamp - 259200000)));
    if (imm.isEmpty()) {
        return 0;
    } else {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
        for (m in imm) {
            def immDate = m.imm_date?:"";
            try {
                Date d2 =sdf.parse(immDate);
                if (d2.getTime() > now.getTime()) {
                    return 1;
                }
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        }
    }
    return 0;
}
// 是否外籍维族人员 1
static def WJWZ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def country_code = pm.nationality?:"";
    def curr_cert_no = pm.passPortNo?:"";

    if (pm.nationality != "CHN") {
        org.elasticsearch.index.query.QueryBuilder queryHmd = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("country_code", country_code))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("curr_cert_no", curr_cert_no));
        List<HashMap> result = search.getListResultsByQueryBuilder(queryHmd, "dcap_f_terr_rec_fgn_uygur");

       if (result.isEmpty()) {
            return "0";
        } else {
            return "1";
        }
    }
    return "";
}
static def BGDJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

}

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