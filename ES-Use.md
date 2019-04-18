## ES-Example
###### 作者： 程国军

####term 查询

term 查询被用于精确值 匹配，这些精确值可能是数字、时间、布尔或者那些 not_analyzed 的字符串：
{ "term": { "age":    26           }}
{ "term": { "date":   "2014-09-01" }}
{ "term": { "public": true         }}
{ "term": { "tag":    "full_text"  }}
term 查询对于输入的文本不 分析 ，所以它将给定的值进行精确查询。

#### match 查询
 
 无论你在任何字段上进行的是全文搜索还是精确查询，match 查询是你可用的标准查询。
 
 如果你在一个全文字段上使用 match 查询，在执行查询前，它将用正确的分析器去分析查询字符串：
 
 { "match": { "tweet": "About Search" }}
 如果在一个精确值的字段上使用它， 例如数字、日期、布尔或者一个 NOT_ANALYZED 字符串字段，那么它将会精确匹配给定的值：
 { "match": { "age":    26           }}
 { "match": { "date":   "2014-09-01" }}
 { "match": { "public": true         }}
 { "match": { "tag":    "full_text"  }}
 
  #### match_phrase 查询
##动态脚本
```drools
package com.iapi.drools.rules;
import java.util.Map;
import com.iapi.drools.dao.IElasticSearchDao
import java.util.concurrent.CompletableFuture
import org.elasticsearch.index
import org.elasticsearch.index
import org.elasticsearch.index
import java.util.List;

// 调用接口查询指标
global IElasticSearchDao elasticSearchDao;

dialect  "mvel"


// 查询api,补充指标
// 使用API 后缀名
//rule "DNYXN_1_API" 
//// 权重确保先执行这个规则文件
//    salience 999
//    // 这个方法只在进入时执行一次就行
//    no-loop true
//    when
//        //让这个条件触发执行下面的规则
//        $map: Map() 
//    then
        // 下面是java代码脚本，即执行指标项查询计算的部分
        // 1、使用面向对象查询 结果是map的
//        org.elasticsearch.index.query.QueryBuilder queryBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery().must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("",""));
//        Map completableFuture = elasticSearchDao.getFirstResultMap(queryBuilder,"查询的索引，es的数据库名称");
//       
//            try{
//             
//              String value = String.valueOf(result.get("查询的字段"));
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//            
//        
        // 2、使用面向对象查询 结果是List的
//        org.elasticsearch.index.query.QueryBuilder queryBuilder = org.elasticsearch.index.query.QueryBuilders.boolQuery().must(org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery("",""));
//                List<Map> completableFuture = elasticSearchDao.getListResultsByQueryBuilder(queryBuilder,"查询的索引，es的数据库名称");
//             
//                    try{
//                      List<Map> result =   completableFuture.get();
//                       // 处理result 获得指标项的值，并添加到 $map 中
//                        // $map.put("指标项字段","处理结果");
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//
//                
//      // 3、使用json查询,返回map对象的
//        Map completableFuture =elasticSearchDao.getFirstResultMapByJson("json查询es的字符串","es索引");
//        4、使用json查询,返回 List 对象的
//           List<Map> completableFuture = elasticSearchDao.getListResultsByJson("json查询es的字符串","es索引");
//        $map.put("指标项字段",value);
// 将更新后的对象加载到内存
//        update($map)
//end



```