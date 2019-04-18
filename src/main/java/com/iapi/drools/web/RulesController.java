package com.iapi.drools.web;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.iapi.drools.bean.RequestMessage;
import com.iapi.drools.bean.ResponseMessage;
import com.iapi.drools.bean.Risk;
import com.iapi.drools.bean.TbRiskIapi;
import com.iapi.drools.bean.rule.Model;
import com.iapi.drools.bean.rule.RequestModel;
import com.iapi.drools.common.exception.JsonResponse;
import com.iapi.drools.service.*;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Drools的基本用法，动态规则
 *
 * @author cgj
 */
@RestController
@RequestMapping(value = "/rules", method = RequestMethod.POST)
public class RulesController {

    @Autowired
    private RulesService rulesService;

    @Autowired
    private RiskService riskService;

    @Autowired
    private IElasticSearchService esService;


    @Autowired
    private IDynamicItemService iDynamicItemService;


    private static Gson gson = new Gson();
    private Logger logger = LogManager.getLogger(RulesController.class);

    @ApiOperation(value = "调用风评接口（风评运算平台）")
    @ApiImplicitParams({@ApiImplicitParam(name = "data", dataType = "String", required = false, value = "{\n" +
            "'AccountName':'iapi',\n" +
            "'serial':'人员主键',\n" +
            " 'nationality':'国籍',\n" +
            " 'passportno':'证件号码',\n" +
            "'birthday':" + "'出生日期(格式为: YYYYMMDD)',\n" +
            "'name':" + "'姓名',\n" +
            "'port':'口岸代码',\n" +
            "'risk_iapi':{IAPI值机信息},\n" +
            "'choice_model':[ #说明：按模型类型选择需要比对的模型\n" +
            " {'model_list':'模型编号1,模型编号2,模型编号3',\n 'type':'1'//说明：模型类型：1、中心模型；2、口岸模型\n },\n" +
            " {'model_list':'模型编号4,模型编号5,模型编号6',\n 'type':'2'\n }]\n}")
    })
    @RequestMapping(value = "/riskEvaluation", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JsonResponse riskEvaluation(@RequestParam String data){
        //请求计时
        long start = System.currentTimeMillis();
        //请求json写入Mongodb
        logger.info("api: riskEvaluation: " + data.replace("\t", "").replace("\n", "").replace(" ", ""));
        //返回json对象
        ResponseMessage responseMessage = new ResponseMessage();
        //风评标记
        responseMessage.setRisk_status("0");
        //请求json对象
        RequestMessage message = new RequestMessage();
        //json转换对象
        try {
            message = JSON.parseObject(data, RequestMessage.class);
        } catch (Exception e) {
            logger.error(e.getMessage() + "riskEvaluation  JSONObject error");
            e.printStackTrace();
        }

        //对象解析成功
        if (message != null) {
            /* 证件号码 */
            String passportno = message.getPassportno();
            /* 国籍 */
            String nationality = message.getNationality();
            /* 出生日期 */
            String birthday = message.getBirthday();
            /* 姓名 */
            String names = message.getName();
            /* IAPI值机信息 */
            TbRiskIapi tbRiskIapi = message.getRisk_iapi();
            // 存储到es
//            try{
//                esService.tbRiskIapi(tbRiskIapi);
//            }catch (Exception e){
//                logger.error(e);
//            }

            responseMessage.setBirthday(birthday);
            responseMessage.setName(names);
            responseMessage.setPassportno(passportno);
            responseMessage.setNationality(nationality);
            responseMessage.setPort(message.getPort());
            responseMessage.setSerial(message.getSerial());
            String personId = "";
            //查询pers_id
            try {
                List<HashMap> personInfo  = esService.queryPersonId(message);
                if (null != personInfo && personInfo.size() > 0) {
                    personId = String.valueOf(personInfo.get(0).get("pers_id"));
                } else {
                    logger.error("persId  is null ");
                }
            } catch (Exception e) {
                logger.error("personInfo search error" + e);
            }
            //指标项计算取值
            Map<String, Object> resultMaps = iDynamicItemService.dynamicItem(personId, passportno, nationality, names, birthday, tbRiskIapi);
            long end = System.currentTimeMillis();
            logger.info(resultMaps + "*****************resultMaps*****************************************: " + (end - start) + "ms");
            if (resultMaps != null) {
                message.setPersonPojo(resultMaps);
                // 规则匹配
                riskService.riskEvaluation(message, responseMessage);
            } else {
                logger.error("resultMaps is null !");
            }
            // 将对应的需要匹配的指标添加到message对象中
            //查询personId不为空
            responseMessage.setPerson_id(personId);
            // 风评结果状态，并存储到es
            if (responseMessage.getEvent().size() > 0) {
                //当风评不为空的时候
                responseMessage.setRisk_status("1");
            }
        }
        long end1 = System.currentTimeMillis();
        logger.info("api time : " + (end1 - start) + "ms");
        return new JsonResponse(responseMessage);
    }


    @ApiOperation(value = "调用风评接口（风评运算平台）")
    @ApiImplicitParams({@ApiImplicitParam(name = "data", dataType = "String", required = false, value = "{\n" +
            "'AccountName':'iapi',\n" +
            "'serial':'人员主键',\n" +
            " 'nationality':'国籍',\n" +
            " 'passportno':'证件号码',\n" +
            "'birthday':" + "'出生日期(格式为: YYYYMMDD)',\n" +
            "'name':" + "'姓名',\n" +
            "'port':'口岸代码',\n" +
            "'risk_iapi':{IAPI值机信息},\n" +
            "'choice_model':[ #说明：按模型类型选择需要比对的模型\n" +
            " { 'model_list':'模型编号1,模型编号2,模型编号3',\n 'type':'1'//说明：模型类型：1、中心模型；2、口岸模型\n },\n" +
            " { 'model_list':'模型编号4,模型编号5,模型编号6',\n 'type':'2'\n }]\n}")
    })
    @RequestMapping(value = "/risk", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JsonResponse risk(@RequestBody String data){
        //返回json对象
        ResponseMessage responseMessage = new ResponseMessage();
        //风评标记
        responseMessage.setRisk_status("0");
        //请求json写入Mongodb
        logger.info("api: riskEvaluation: " + data.replace("\t", "").replace("\n", "").replace(" ", ""));
        //请求计时
        long start = System.currentTimeMillis();
        //请求json对象
        Risk risk = new Risk();
        //json转换对象
        try {
            risk = JSON.parseObject(data, Risk.class);
        } catch (Exception e) {
            logger.error(e.getMessage() + "risk  JSONObject error");
            e.printStackTrace();
        }
        //对象解析成功
        if (risk != null) {
            HashMap tbRiskIapi = risk.getRiskIapi();
            String personId = "";
            String passPortNo = risk.getPassportno();
            String nationality = risk.getNationality();
            String birthday = risk.getBirthday();
            String name = risk.getName();
            String port = risk.getPort();
            String serial = risk.getSerial();
            String gender = String.valueOf(tbRiskIapi.get("gender"));
            responseMessage.setBirthday(birthday);
            responseMessage.setName(name);
            responseMessage.setPassportno(passPortNo);
            responseMessage.setNationality(nationality);
            responseMessage.setPort(port);
            responseMessage.setSerial(serial);

            //查询pers_id
            try {
                List<HashMap> personInfo  = esService.queryPersonId(nationality,passPortNo,birthday,name,gender);
                if (null != personInfo && personInfo.size() > 0) {
                    personId = String.valueOf(personInfo.get(0).get("pers_id"));
                } else {
                    logger.error("persId  is null ");
                }
            } catch (Exception e) {
                logger.error("personInfo search error" + e);
            }
            //指标项计算取值
            Map<String, Object> resultMaps = iDynamicItemService.dynamicItem(personId, passPortNo, nationality, name, birthday, tbRiskIapi);
            if (resultMaps != null) {
                risk.setPersonPojo(resultMaps);
                // 规则匹配
                riskService.riskEvaluation(risk, responseMessage);
            } else {
                logger.error("resultMaps is null !");
            }
            long end = System.currentTimeMillis();
            logger.info(resultMaps + "time resultMaps : " + (end - start) + "ms");
            // 风评结果状态，并存储到es
            if (responseMessage.getEvent().size() > 0) {
                // 当风评不为空的时候
                responseMessage.setRisk_status("1");
            }
            responseMessage.setPerson_id(personId);
        }
        long end1 = System.currentTimeMillis();
        logger.info("api time : " + (end1 - start) + "ms");
        return new JsonResponse(responseMessage);
    }

    @ApiOperation(value = "新增模型")
    @ApiImplicitParam(name = "models", required = true, value = "外部导入模型的接口，更新全部文件，传入list:  \n\t" +
            "{'models':[{" +
            "modelName:ruleName\n" +
            "ruleId:ruleId\n" +
            "version:ruleVsersion\n" +
            "content:ruleContent\n" +
            "type:ruleType\n" +
            "createTime:0000-00-00 00:00:00 \n" +
            "updateTime:0000-00-00 00:00:00 } ]\n" +
            "" +
            "}")
    @RequestMapping(value = "/addModels", method = RequestMethod.POST)
    public JsonResponse addModels(@RequestBody String models) {
        logger.info("api: addModels --- ");
        RequestModel requestModel = gson.fromJson(models, RequestModel.class);
        String msg = rulesService.addRules(requestModel.getModels(), System.currentTimeMillis() + "");
        return new JsonResponse(msg);

    }

    @ApiOperation(value = "删除模型")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", dataType = "String", required = true, value = "模型名称{'name':''}")})
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public JsonResponse delete(@RequestBody Map<String, Object> modelName) {
        String msg = rulesService.deleteRulesByName(String.valueOf(modelName.get("name")));
        return new JsonResponse(msg);
    }

    @ApiOperation(value = "验证规则")
    @ApiImplicitParam(name = "content", required = true, value = "规则内容:{'content':''}")
    @RequestMapping(value = "/verify", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JsonResponse ruleAdd(@RequestBody String content) {
        String result = rulesService.ruleVerify(content);
        return new JsonResponse(result);
    }

    @ApiOperation(value = "清空模型")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    public JsonResponse clear() {
        String msg = rulesService.deleteAll();
        return new JsonResponse(msg);
    }

    @ApiOperation(value = "修改规则")
    @ApiImplicitParam(name = "ruleMap", required = true, value = "规则:{\" " +
            "            \"name:ruleName\" +\n" +
            "            \"ruleId:ruleId\" +\n" +
            "            \"version:ruleVersion\" +\n" +
            "            \"content:ruleContent\" +\n" +
            "            \"type:ruleType\" +\n" +
            "            \"createTime:0000-00-00 00:00:00 \" +\n" +
            "            \"updateTime:0000-00-00 00:00:00 }")
    @RequestMapping(value = "/ruleUpdate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JsonResponse ruleUpdate(@RequestBody String rule) {
        Model model = gson.fromJson(rule, Model.class);
        String msg = rulesService.ruleUpdate(model);

        return new JsonResponse(msg);
    }

    @RequestMapping(value = "/getAllRules", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JsonResponse getAllRules() {
        List<Model> models = rulesService.getAllRules();
        return new JsonResponse(models);
    }


}

