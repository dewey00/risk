# Groovy script

#### 作者： 程国军

groovy 语言动态脚本开发设计

### 1、增删改查脚本文件接口

### (1)、增加api --- 传入方法体List ，调用服务，整理成方法

​			def    指标项（小写）{

​		方法体

​	}

（2）、存入数据库

### 2、使用 

接口调用查询数据库，查找脚本文件，执行脚本文件程序 

​	

package com.iapi.drools.dao.impl

import com.iapi.drools.dao.impl.ElasticSearchDaoImpl


class A{
    ElasticSearchDaoImpl elasticSearchDao;

    def xxx(List<String> tbRiskDictDetails, List<Map<String, Object>> iapiDmAirports) {
        // 示例 elasticSearchDao.query();查询 ，返回值，计算
        // 查询语句 ，可以内嵌 painless script
        //def json="{'query':{'match_all':''}";
        String json = "{'query':{'match_all':''}";
        List<Map<String,Object>> resultList= elasticSearchDao.getListResultsByJson(json,"表名称");
        /**
         * 计算部分
         * 循环遍历
         * 各种运算
         */

        return "返回值（类型任意）";
    }



}


def getA (){  return new A();};




