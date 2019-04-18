package com.iapi.drools.dao.impl

// 新的
static def CHNSCCJ(Map<String, Object> pm, List<HashMap> imm, List<Map<String, Object>> riskGj, List<Map<String, Object>> airport, List<HashMap> foreign, com.iapi.drools.dao.IElasticSearchDao search) {
    if ("CHN" == pm.nationality) {
        for (m in imm) {
            if ("2" == m.get("in_out_flag")) {
                return 0;
            }
        }
    }
    return "1";
}

static def HZYX(Map<String, Object> pm, List<HashMap> imm, List<Map<String, Object>> riskGj, List<Map<String, Object>> airport, List<HashMap> foreign, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.passportexpiredate ?: "";
}
// 有2017年后发达国家出入境记录
static def FDCRJ17(Map<String, Object> pm, List<HashMap> imm, List<Map<String, Object>> riskGj, List<Map<String, Object>> airport, List<HashMap> foreign, com.iapi.drools.dao.IElasticSearchDao search) {
    // 找出发达国家   7E250BB178D440BEE0537A1210AC57A2  [{dictionaries_code:7E250BB178D440BEE0537A1210AC57A2,"":"CHN"},{}]
    StringBuilder stringBuilder = new StringBuilder();
    if (!riskGj.isEmpty()) {
        for (map in riskGj) {
            if ("7E250BB178D440BEE0537A1210AC57A2" == map.dictionaries_code) {
                stringBuilder.append(map.particulars_name ?: "" + ",");
            }
        }
    };
    List<String> strs = new ArrayList<>();
    for (map in imm) {
        def immDate = ((map.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long;
        if (immDate > 20170000) {
            String code = map.to_country_code ?: "";
            String deCountry = stringBuilder.toString();
            if (deCountry.contains(code)) {
                strs.add(code);
            }
        }
    };
    String r = strs.join(",");
    return r;
}
//是否有3天内的出入境记录
static def CRJJL3FDCRJ17(Map<String, Object> pm, List<HashMap> imm, List<Map<String, Object>> riskGj, List<Map<String, Object>> airport, List<HashMap> foreign, com.iapi.drools.dao.IElasticSearchDao search) {
    // 是否有三天内的出入境记录
    long timeStamp = System.currentTimeMillis();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
    String now = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp - 259200000))));
    if (imm.isEmpty()) {
        return 0;
    } else {
        for (m in imm) {
            def immDate = m.get("imm_date");
            if (immDate > now) {
                return 1;
            }
        }
    }
    return 0;
}

// 是否出境预订多个航班
static def YDHB(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def passportno = pm.passPortNo ?: "";
    def nationality = pm.nationality ?: "";
    org.elasticsearch.index.query.QueryBuilder iapi = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("passportno", passportno))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("nationality", nationality));
    List<HashMap> result = search.queryScroll(iapi, "tb-riskiapi-*");
    long timeStamp = System.currentTimeMillis();
    Date now = new Date(Long.parseLong(String.valueOf(timeStamp - 7200000)));
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMM d, yyyy K:m:s a", Locale.ENGLISH);
    if (result.isEmpty()) {
        return "0"
    } else {
        List list = new ArrayList();
        for (i in result) {
            def immDate = i.createtime ?: "";
            try {
                Date d2 = sdf.parse(immDate);
                if (d2.getTime() > now.getTime()) {
                    list.add(1);
                }
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        }
        if (list.size() > 1) {
            return "1"
        } else {
            return "0"
        }
    }


}


static def XJDCA(Map<String, Object> pm, List<HashMap> imm, List<Map<String, Object>> riskGj, List<Map<String, Object>> airport, List<HashMap> foreign, com.iapi.drools.dao.IElasticSearchDao search) {

    def destination = pm.destination ?: "";
    def cityTo = pm.cityto ?: "";
    if (destination == "PEK" || cityTo == "PEK") {
        if (imm.isEmpty()) {
            return 1;
        }
        for (HashMap map : imm) {
            if (map.imm_port_code == 'PEK') {
                return 0;
            }
        };
    };
    return 0;
}

static def ZZXJC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    // 最终下机地机场代码 国家
    def destination = pm.destination ?: "";
    if (!airport.isEmpty()) {
        for (HashMap map : airport) {
            if (destination == map.airport_code) {
                return map.country_code
            }
        }
    }
    return "";
}
// 1
static def SJDC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    // 上机地机场代码 国家
    def cityfrom = pm.cityfrom ?: "";
    if (!airport.isEmpty()) {
        for (map in airport) {
            if (cityfrom == map.airport_code) {
                return map.country_code;
            }
        }
    }
    return "";
}
// 1
static def XJDC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    // 下机地机场代码 国家
    def cityTo = pm.cityto;
    if (!airport.isEmpty()) {
        for (map in airport) {
            if (cityTo == map.airport_code) {
                return map.country_code
            }
        }
    }
    return "";
}
// 1
static def CSJDC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    // 初始上机地机场代码 国家
    def origin = pm.origin;
    if (!airport.isEmpty()) {
        for (map in airport) {
            if (origin == map.airport_code) {
                return map.country_code;
            }
        }
    }
    return "";
}

//  动态可用指标
//  性别 1
static def XB(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.gender ?: "";

}
// 出生日期 1
static def CSRQ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.birthday ?: "";
}
// 年龄 1
static def NL(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def birthDay = pm.birthday ?: "";
    if (birthDay != "") {
        Calendar calendar = Calendar.getInstance();
        if (calendar.before(birthDay)) {
            return 0;
        }
        int yearNow = calendar.get(Calendar.YEAR);
        int monthNow = calendar.get(Calendar.MONTH);
        int dayOfMonthNow = calendar.get(Calendar.DAY_OF_MONTH);
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMdd");
        Date newdate = formatter.parse(birthDay);
        calendar.setTime(newdate);

        int yearBirth = calendar.get(Calendar.YEAR);
        int monthBirth = calendar.get(Calendar.MONTH);
        int dayOfMonthBirth = calendar.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                };
            } else {
                age--;
            };
        }
        if (age >= 0) {
            return age;
        } else {
            return "";
        }
    }
    return "";

}
// 中国旅客民族 1
static def ZGMZ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    if (pm.nationality == "CHN") {
        if (!ps.isEmpty()) {
            def perInfo = ps.max { a -> ((a.issuing_date =~ /[^0-9]/).replaceAll("") ?: -1) as long };
            if (perInfo) {
                def pers_nation = perInfo.pers_nation ?: "";
                def pers_card_id = perInfo.pers_card_id;
                if (pers_nation != "" && pers_nation != "-") {
                    return pers_nation
                } else {
                    // 没有返回就调用接口
                    if (pers_card_id) {
                        def query = "type=1&passportno=${pers_card_id}";
                        def con = "http://172.16.18.101:8080/manage-platform/riskRecordExtInterfaceController/getCensusInfo".toURL().openConnection();
                        con.setDoOutput(true);
                        con.setDoInput(true);
                        con.setRequestProperty("Content-Type", "application/json");
                        con.outputStream.withWriter { writer -> writer << query }
                        String response = con.inputStream.withReader { reader -> reader.text };
                        def jsonSlurper = new groovy.json.JsonSlurper();
                        def object = jsonSlurper.parseText(response);
                        def dt = object.data;
                        if (dt) {
                            return dt[0].MZ ?: "";
                        }
                    }
                }
            }
        }
    }
    return "";
}

// 国籍 1
static def GJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.nationality ?: "";
}
// 证件类型 1
static def ZJLX(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.intgCardtype ?: (pm.passporttype ?: "");
}

// 身份证号 1
static def CHNID(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    println("CHNID = " + pm.nationality ?: "")
    if (pm.nationality == "CHN") {
        if (!ps.isEmpty()) {
            for (p in ps) {
                def persCardId = p.pers_card_id;
                if (persCardId) {
                    return persCardId;
                }
            }
        }
    }
    return "";
}

// 中国旅客户籍行政区划/户籍省份/籍贯 1
static def HJD(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    if (pm.nationality == "CHN") {
        if (!ps.isEmpty()) {
            def perInfo = ps.max { a -> ((a.issuing_date =~ /[^0-9]/).replaceAll("") ?: -1) as long };

            if (perInfo) {
                def rsdtRegionCode = perInfo.rsdt_region_code ?: "";
                if (rsdtRegionCode.length() > 2) {
                    return rsdtRegionCode.substring(0, 2);
                }
            }
        }
    }
    return "";
}

// 外国人签证签发单位 1
static def QZQFW(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality = pm.nationality;
    def qCHN = "CHN";
    def qTWN = "TWN";
    def qHKG = "HKG";
    def qMAC = "MAC";
    if (qCHN != nationality && qTWN != nationality && qHKG != nationality && qMAC != nationality) {
        if (!ps.isEmpty()) {
            def perInfo = ps.max { a -> ((a.visa_date =~ /[^0-9]/).replaceAll("") ?: -1) as long };
            if (perInfo) {
                return perInfo.visa_assign_dept ?: "";
            }
        }
    }
    return "";
}


// 外国人签证种类 1
static def QZZL(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality = pm.nationality;
    def qCHN = "CHN";
    def qTWN = "TWN";
    def qHKG = "HKG";
    def qMAC = "MAC";
    if (qCHN != nationality && qTWN != nationality && qHKG != nationality && qMAC != nationality) {
        if (!ps.isEmpty()) {
            def perInfo = ps.max { a -> ((a.visa_date =~ /[^0-9]/).replaceAll("") ?: -1) as long };
            return perInfo.visa_type ?: "";
        }
    }
    return "";
}


// 出入境标识 1
static def CRBZ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def flighttype = pm.flighttype ?: "";
    def wordToNum = ["I": "1", "O": "2"];
    if (flighttype != "") {
        return wordToNum[flighttype.toUpperCase()] ?: "";
    }
    return "";
}


// 航班时间 1
static def HBSJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def flighttype = pm.flighttype ?: "";
    def ss = flighttype.toUpperCase()
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyyMMdd");
    def date = "";
    if (ss == "I") {
        date = pm.get("arrivdate") ?: "";
    } else if (ss == "O") {
        date = pm.get("departdate") ?: "";
    }
    if (date != "" && date instanceof Date) {
        return format.format(date)
    } else {
        return date;
    }

}


// 航班时间 1
static def WLG(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def flighttype = pm.flighttype ?: "";
    def ss = flighttype.toUpperCase()
    if (ss == "I") {
        def cityfrom = pm.cityfrom;
        if (!airport.isEmpty()) {
            for (map in airport) {
                if (cityfrom == map.airport_code) {
                    return map.country_code
                }
            }
        }
    } else if (ss == "O") {
        def cityTo = pm.cityto;
        for (map in airport) {
            if (cityTo == map.airport_code) {
                return map.country_code
            }
        }
    }
    return "";


}

//初始上机地(机场)1
static def CSJD(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    // 初始上机地机场代码
    return pm.origin ?: "";
}
//最终下机地(机场) 1
static def ZZXJD(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.destination ?: "";
}


//上机地(机场) 1
static def SJD(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.cityfrom ?: "";
}


// 下机地(机场) 1
static def XJD(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return pm.cityto ?: "";
}


// 是否重点上机地(机场) 1
static def ZDSJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def city = pm.cityfrom ?: "";
    if (!riskGj.isEmpty()) {
        for (map in riskGj) {
            if ("F63ADC307A9146C2B289CA9D43E889CD" == map.dictionaries_code) {
                if (city == map.particulars_name) {
                    return "1";
                }
            }
        }
        return "0";
    }
    return "";
}

// 是否重点下机地(机场) 1
static def ZDXJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def city = pm.cityTo ?: "";
    if (!riskGj.isEmpty()) {
        for (map in riskGj) {
            if ("F63ADC307A9146C2B289CA9D43E889CD" == map.dictionaries_code) {
                if (city == map.particulars_name) {
                    return "1";
                }
            }
        }
        return "0";
    }
    return "";
}

// 是否重点关注库掌握人员 1
static def ZDGZ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    String personId = pm.pers_id ?: "";
    if (pm.get("nationality") == "CHN") {
        List<HashMap> result = search.queryByMatchPhrase("dcap_f_per_rec_emph_persons", "pers_id", personId);
        if (result.isEmpty()) {
            return "0";
        } else {
            return "1";
        }
    }
    return "";
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


// 是否符合新疆姓名特点 1
static def XJXM(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    String firstname = pm.firstname ?: "";
    String familyname = pm.familyname ?: "";
    String middlename = pm.middlename ?: "";
    String name = familyname + " " + middlename + " " + firstname
    def names = name.split(" ");
    if (!riskGj.isEmpty()) {
        for (x in names) {
            for (map in riskGj) {
                if ("35A07C29B7BD44788300CF056D869E2A" == map.dictionaries_code) {
                    if (x == map.particulars_name) {
                        return "1";
                    }
                }
            }
        }
        return "0";
    }
    return "";
}

// 是否外籍华人姓氏 1
static def WHXS(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    if (pm.nationality != "CHN") {
        String firstname = pm.firstname ?: "";
        String familyname = pm.familyname ?: "";
        String middlename = pm.middlename ?: "";
        String name = familyname + " " + middlename + " " + firstname
        def names = name.split(" ");
        if (!riskGj.isEmpty()) {
            for (x in names) {
                println("WHXS = " + x)
                for (m in riskGj) {
                    if ("9EB6AD8BA21543C6A0BA915E14B882B8".equalsIgnoreCase(m.dictionaries_code)) {
                        if (x.equalsIgnoreCase(m.particulars_name)) {
                            return "1";
                        }
                    }
                }
            }
            return "0";
        }
    }
    return "";
}

// 初始上机地是否为发达国家 1
static def SJDFD(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def origin = pm.origin;
    def countryCode = "";
    if (!airport.isEmpty()) {
        for (map in airport) {
            if (origin == map.airport_code) {
                countryCode = map.country_code;
                break;
            }
        }
    }
    if (!riskGj.isEmpty()) {
        for (map in riskGj) {
            if ("7E250BB178D440BEE0537A1210AC57A2" == map.dictionaries_code) {
                if (countryCode == map.particulars_name) {
                    return "1";
                }
            }
        }
        return "0";
    }
    return "";
}

//  动态其余指标

// 是否首次来本市 1
static def SCLC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def destination = pm.destination ?: "";
    if (imm.isEmpty()) {
        return "1";
    } else {
        def koan = [:];
        for (air in airport) {
            if (destination == air.airport_code) {
                koan = air
            }
            break;
        }
        for (i in imm) {
            if (i.imm_port_code == koan.imm_port_code) {
                return "0"
            }
        }
    }
    return "";
}


// 是否重点下机地（国家） 1
static def ZDXJC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def city = pm.cityTo ?: "";
    if (!riskGj.isEmpty()) {
        for (map in riskGj) {
            if ("F63ADC307A9146C2B289CA9D43E889CD" == map.dictionaries_code) {
                if (city == map.particulars_name) {
                    if (!airport.isEmpty()) {
                        for (c in airport) {
                            if (city == c.airport_code) {
                                return c.country_code
                            }
                        }
                    }
                }
            }
        }
    }
    return "";
}


// 是否重点上机地（国家） 1
static def ZDSJC(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def city = pm.cityfrom ?: "";
    if (!riskGj.isEmpty()) {
        for (map in riskGj) {
            if ("F63ADC307A9146C2B289CA9D43E889CD" == map.dictionaries_code) {
                if (city == map.particulars_name) {
                    if (!airport.isEmpty()) {
                        for (c in airport) {
                            if (city == c.airport_code) {
                                return c.country_code
                            }
                        }
                    }
                }
            }
        }
    }
    return "";
}


// 护照号码是否符合中国护照号码规则 1
static def PSPORT(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    if (pm.nationality == "CHN") {
        def p = (pm.passportno ?: "").toUpperCase() =~ /([E,G]\d{8})|(EA\d{7})/
        if (p.find()) {
            return "1"
        } else {
            return "0"
        }
    }
    return "";
}

// 是否在我国常住 1
static def OFTENLIVE(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    String personId = pm.pers_id ?: "";
    if ("CHN" != pm.nationality) {
        List<HashMap> result = search.queryByMatchPhrase("dcap_f_per_fgn_resident_reg", "pers_id", personId);
        if (result.isEmpty()) {
            return "0";
        } else {
            return "1";
        }
    }
    return "";
}


// 是否白名单人员 1
static def BMD(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def firstname = (pm.firstname ?: "").trim();
    def familyname = (pm.familyname ?: "").trim();
    def middlename = (pm.middlename ?: "").trim();
    def name = (firstname + " " + familyname + " " + middlename).trim()
    //  查询白名单
    println("==============================name============" + name)
    org.elasticsearch.index.query.QueryBuilder queryHmd = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("type_code", "82362CCD15562B55E0537A1210AC4C46"))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("familyname", name));
    // 查询白名单
    List<HashMap> md = search.getListResultsByQueryBuilder(queryHmd, "tb_risk_namelist");
    if (md.isEmpty()) {
        return "0"
    } else {
        return "1"
    }
}


// 是否有历史违法违规记录 1
static def ILLEGAL(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    String personId = pm.pers_id ?: "";
    List<HashMap> result = search.queryByMatchPhrase("dcap_f_evt_psr_illegal", "pers_id", personId);
    if (result.isEmpty()) {
        return "0";
    } else {
        return "1";
    }

}


// 是否L/M入境后换发签证 1
static def LMQZ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    if (!imm.isEmpty()) {
        List<HashMap> imms = imm.sort { a, b -> (((a.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long) <=> (((b.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long) }
        def inFlags = imms.findAll { a -> a.in_out_flag == "2" && ((a.type ?: "").toUpperCase() == "L" || (a.type ?: "").toUpperCase() == "M") }
        for (inFlag in inFlags) {
            def i_date = inFlag.imm_date ?: -1;
            def index = imms.indexOf(inFlag);
            if (imms.size() > index + 1) {
                def obj = imms.get(index + 1);
                def o_date = obj.imm_date ?: -1;
                if (obj.in_out_flag == "1") {
                    if (!ps.isEmpty()) {
                        for (p in ps) {
                            def visa_date = p.visa_date ?: -1;
                            if (((i_date =~ /[^0-9]/).replaceAll("") as long) < ((visa_date =~ /[^0-9]/).replaceAll("") as long) && ((o_date =~ /[^0-9]/).replaceAll("") as long) > ((visa_date =~ /[^0-9]/).replaceAll("") as long) && p.visa_assign_dept == "CHN") {
                                return "1";
                            }
                        }
                    }
                }
            }
        }
        return "0";
    }
    return "";
}

// 是否有历史iAPI/API信息 1
static def IAPIIF(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    String personId = pm.pers_id ?: "";
    List<HashMap> result = search.queryByMatchPhrase("dcap_f_per_pred_api_psr_info", "pers_id", personId);
    if (!result.isEmpty()) {
        return "1";
    } else {
        String passPortNo = pm.passPortNo ?: "";
        String nationality = pm.nationality ?: "";
        org.elasticsearch.index.query.QueryBuilder query = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("type_code", passPortNo))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("familyname", nationality));
        List<HashMap> r = search.getListResultsByQueryBuilder(query, "tb_iapi");
        if (r.isEmpty()) {
            return "1";
        } else {
            return "0";
        }
    }
}


// 是否首次来京 1
static def SCLJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    // 5、是否首次来京
    def destination = pm.destination ?: "";
    def cityTo = pm.cityto ?: "";
    if (destination == "PEK" || cityTo == "PEK") {
        if (imm.isEmpty()) {
            return "1";
        }
        for (map in imm) {
            if (map.imm_port_code == 'PEK') {
                return "0";
            }
        };
        return "1"
    };
    return "";
}


//是否使用现金付款 1
static def FKXJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    org.elasticsearch.index.query.QueryBuilder pnrtravelertktBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("nationality", pm.nationality ?: ""))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("cardnum", pm.passPortNo ?: ""));
    def tbPnrTravelerTkt = search.queryScroll(pnrtravelertktBuilder, "tb_pnr_traveler_tkt");
    if (!tbPnrTravelerTkt.isEmpty()) {
        def nList = tbPnrTravelerTkt.sort { b, a -> (((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) <=> (((b.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) };
        def map = nList.get(0);
        org.elasticsearch.index.query.QueryBuilder tbPnrTkt = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("tid", map.tid ?: ""))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("ticket_document_number", map.tktnumber ?: ""));

        List<HashMap> tbPnrTkts = search.getListResultsByQueryBuilder(tbPnrTkt, "tb_pnr_tkt");
        if (!tbPnrTkts.isEmpty()) {
            List<HashMap> nr = tbPnrTkts.sort { b, a -> (((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) <=> (((b.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) };
            def ma = nr.get(0);
            org.elasticsearch.index.query.QueryBuilder queryBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                    .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("tid", ma.tid ?: ""))
                    .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr1serial", ma.get("gr1serial")))
                    .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr2serial", ma.get("gr2serial")))
                    .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr3serial", ma.get("gr3serial")));
            List<HashMap> tbs = search.getListResultsByQueryBuilder(queryBuilder, "tb_pnr_fop");
            if (!tbs.isEmpty()) {
                //排序
                List<HashMap> nRe = tbs.sort { b, a -> (((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) <=> (((b.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) };
                HashMap n = nRe.get(0);
                String fkfs = n.payment_type ?: "";
                if (fkfs.toLowerCase() == "cc") {
                    return "1";
                } else {
                    return "0";
                }
            }
        }
    }
    return "";
}


//付款方式 1
static def FKFS(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    org.elasticsearch.index.query.QueryBuilder pnrtravelertktBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("nationality", pm.nationality ?: ""))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("cardnum", pm.passPortNo ?: ""));
    def tbPnrTravelerTkt = search.queryScroll(pnrtravelertktBuilder, "tb_pnr_traveler_tkt");
    if (!tbPnrTravelerTkt.isEmpty()) {
        def map = tbPnrTravelerTkt.max { a -> (((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) };
        org.elasticsearch.index.query.QueryBuilder tbPnrTkt = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("tid", map.tid ?: ""))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("ticket_document_number", map.tktnumber ?: ""));
        List<HashMap> tbPnrTkts = search.getListResultsByQueryBuilder(tbPnrTkt, "tb_pnr_tkt");
        if (!tbPnrTkts.isEmpty()) {
            def ma = tbPnrTkts.max { a -> (((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) };
            if (ma) {
                org.elasticsearch.index.query.QueryBuilder queryBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                        .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("tid", ma.tid ?: ""))
                        .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr1serial", ma.gr1serial ?: ""))
                        .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr2serial", ma.gr2serial ?: ""))
                        .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr3serial", ma.gr3serial ?: ""));
                List<HashMap> tbs = search.getListResultsByQueryBuilder(queryBuilder, "tb_pnr_fop");
                if (!tbs.isEmpty()) {
                    def n = tbs.max { a -> (((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long) };
                    if (n) {
                        return n.payment_type ?: "";
                    }
                }
            }
        }
    }
    return "";
}


//付款人国籍代码 1
static def FKGJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    return "";
}


// 常旅客编号 1
static def CLKH(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    org.elasticsearch.index.query.QueryBuilder pnrtravelertktBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("nationality", pm.nationality ?: ""))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("cardnum", pm.passPortNo ?: ""));
    def tbPnrTravelerTkt = search.queryScroll(pnrtravelertktBuilder, "tb_pnr_traveler_tkt");
    if (!tbPnrTravelerTkt.isEmpty()) {
        def map = tbPnrTravelerTkt.max { a -> ((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long };
        org.elasticsearch.index.query.QueryBuilder tbPnrFti = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("tid", map.tid ?: ""))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr2serial", map.gr2serial ?: ""))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr1serial", map.gr1serial ?: ""));
        List<HashMap> tbPnrFtis = search.getListResultsByQueryBuilder(tbPnrFti, "tb_pnr_fti");
        def ss = tbPnrFtis.max { a -> ((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long }
        println("==================================================ss =========" + ss)
        if (ss) {
            return ss.frequent_t_idenification ?: "";
        }
    }
    return "";
}


// 外国人签证签发单位是否不等于旅客国籍国（当前）1
static def QFGJ(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {

    def nationality = pm.nationality;
    def qCHN = "CHN";
    def qTWN = "TWN";
    def qHKG = "HKG";
    def qMAC = "MAC";
    if (qCHN != nationality && qTWN != nationality && qHKG != nationality && qMAC != nationality) {
        if (!ps.isEmpty()) {
            def perInfo = ps.max { a -> ((a.visa_date =~ /[^0-9]/).replaceAll("") ?: -1) as long };
            if (nationality != perInfo.visa_assign_dept) {
                return "1"
            }
            return "0";
        }
    }
    return "";
}


// 是否有偷渡类违法违规记录 1
static def TDWF(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def nationality = pm.nationality;
    def qCHN = "CHN";
    def qTWN = "TWN";
    def qHKG = "HKG";
    def qMAC = "MAC";
    if (qCHN != nationality && qTWN != nationality && qHKG != nationality && qMAC != nationality) {
        def ss = fent.find { a -> a.pers_id == pm.pers_id }
        if (ss) {
            return "1";
        } else {
            return "0";
        }
    }
    return "";
}


// 是否经常飞人 1
static def JCFR(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    org.elasticsearch.index.query.QueryBuilder pnrtravelertktBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("nationality", pm.nationality ?: ""))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("cardnum", pm.passPortNo ?: ""));
    def tbPnrTravelerTkt = search.queryScroll(pnrtravelertktBuilder, "tb_pnr_traveler_tkt");
    if (!tbPnrTravelerTkt.isEmpty()) {
        def map = tbPnrTravelerTkt.max { a -> ((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long };
        org.elasticsearch.index.query.QueryBuilder tbPnrFti = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("tid", map.tid ?: ""))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr2serial", map.gr2serial ?: ""))
                .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr1serial", map.gr1serial ?: ""));
        List<HashMap> tbPnrFtis = search.getListResultsByQueryBuilder(tbPnrFti, "tb_pnr_fti");
        if (!tbPnrFtis.isEmpty()) {
            return "1";
        } else {
            return "0";
        }
    }
    return "";

}


// 旅客数量 1
static def LKSL(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    org.elasticsearch.index.query.QueryBuilder pnrtravelertktBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery()
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("nationality", pm.nationality ?: ""))
            .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("cardnum", pm.passPortNo ?: ""));
    def tbPnrTravelerTkt = search.queryScroll(pnrtravelertktBuilder, "tb_pnr_traveler_tkt");
    if (tbPnrTravelerTkt) {
        def map = tbPnrTravelerTkt.max { a -> ((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long };
        if (map) {
            org.elasticsearch.index.query.QueryBuilder tbPnrTvl = org.elasticsearch.index.query.QueryBuilders.boolQuery()
                    .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("tid", map.tid ?: ""))
                    .must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("gr1serial", 0));
            def tbPnrTvls = search.getListResultsByQueryBuilder(tbPnrTvl, "tb_pnr_tvl");
            if (tbPnrTvls) {
                def map1 = tbPnrTvls.max { a -> ((a.createtime =~ /[^0-9]/).replaceAll("") ?: -1) as long };
                if (map1) {
                    return map1.num_of_passenger ?: "0";
                } else {
                    return "0";
                }
            }
        }
    }
    return "";

}


// 是否出入境平衡 1
static def CRPH(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def result = "";
    def imms = imm.sort { b, a -> (((a.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long) <=> (((b.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long) };
    if (imms) {
        for (i in imms) {
            def in_out_flag = i.in_out_flag ?: "";
            result += in_out_flag;
        }
        if (result.contains("11") || result.contains("22")) {
            return "0";
        } else {
            return "1";
        }
    }
    return "";

}


// 是否出境后3天内入境(历史) 1
static def IMM3BB(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    if (!imm.isEmpty()) {
        List<HashMap> imms = imm.sort { a, b -> (((a.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long) <=> (((b.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long) }
        def inFlags = imms.findAll { a -> a.in_out_flag == "2" }
        for (inFlag in inFlags) {
            def index = imms.indexOf(inFlag);
            if (imms.size() > index + 1) {
                def obj = imms.get(index + 1);
                if (obj.in_out_flag == "1") {
                    def i_date = ((inFlag.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long;
                    def o_date = ((obj.imm_date =~ /[^0-9]/).replaceAll("") ?: -1) as long;
                    if ((o_date - i_date) < 3) {
                        return "1";
                    } else {
                        return "0";
                    }
                }
            }
        }
        return "0";
    }
    return "";

}

// 出境去加拿大
static def TOCAN(Map<String, Object> pm, List<HashMap> imm, List<HashMap> riskGj, List<HashMap> airport, List<HashMap> fent, List<HashMap> ps, com.iapi.drools.dao.IElasticSearchDao search) {
    def cityTo = pm.cityto ?: "";
    def nationality = pm.nationality;
    def SGP = "SGP";
    def qHKG = "HKG";
    def qTWN = "TWN";
    def qMAC = "MAC";
    def MYS = "MYS";
    def CAN = "CAN";
    if (!imm.isEmpty()) {
        if (nationality == SGP || nationality == qHKG || nationality == qTWN || nationality == qMAC || nationality == MYS) {
            for (i in imm) {
                if (CAN == i.cert_country_code) {
                    return "1";
                }
            }
            for (map in airport) {
                if (cityTo == map.airport_code) {
                    if (map.country_code == CAN) {
                        return "1";
                    }
                }
            }
            return "0";
        }
    }
    return "";

}









