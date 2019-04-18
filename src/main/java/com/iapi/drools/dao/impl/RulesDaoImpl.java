package com.iapi.drools.dao.impl;

import com.iapi.drools.bean.rule.Model;
import com.iapi.drools.dao.RulesDao;
import com.mongodb.client.result.DeleteResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.io.ResourceType;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Package com.iapi.drools.dao.impl
 * @Project iapi-drools
 * @Author Cheng GuoJun
 * @Descript
 * @Date 2018-10-08 11:42
 */
@Repository
public class RulesDaoImpl implements RulesDao {
    private Logger logger = LogManager.getLogger(RulesDaoImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public String getRulesByName(String ruleName) {
        return null;
    }

    @Override
    public List<String> getRuleList() {
        List<String> list = new ArrayList<>();
        String rule = "package com.iapi.drools.rules;\n" +
                "import java.util.Map\n" +
                "\n" +
                "\n" +
                "dialect  \"mvel\"\n" +
                "\n" +
                "\n" +
                "// 查询api,补充指标\n" +
                "\n" +
                "rule \"ADNYXN_1_ENTER\"\n" +
                "    salience 11\n" +
                "    when\n" +
                "        $map: Map()\n" +
                "    then\n" +
                "        System.out.println(\" 指标项查询 调用接口 api 传入参数\");\n" +
                "        System.out.println(\" 指标项查询 调用接口 api 查询结果\"+$map.get(\"api\"));\n" +
                "\n" +
                "end";
        list.add(rule);
        return list;
    }

    @Override
    public List<Model> getAllRules() {
        return mongoTemplate.findAll(Model.class);
    }

    @Override
    public boolean updateRulesByName(Model model) {
        boolean flag = false;
        try{
            Criteria criteria = Criteria.where("name").is(model.getName());
            Query query = Query.query(criteria);
            mongoTemplate.remove(query,Model.class);
            mongoTemplate.save(model);
            flag = true;
        }catch (Exception e){
           logger.error(e);
        }
        return flag;
    }

    @Override
    public boolean deleteRulesByName(String ruleName) {
        boolean flag = false;
        try {
            Criteria criteria = Criteria.where("name").is(ruleName);
            Query query = Query.query(criteria);
            DeleteResult deleteResult = mongoTemplate.remove(query, Model.class);
            flag = true;
        } catch (Exception e) {
            logger.error(e);
        }
        return flag;
    }
    private Resource[] getRuleFiles(String path) throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        return resourcePatternResolver.getResources("classpath*:" + path + "**/*.*");
    }
    @Override
    public String ruleVerify(String rule) {
        String utilsPath = "com/iapi/drools/utils/";
        KieHelper kieHelper = new KieHelper();
        try {
            for (Resource file : getRuleFiles(utilsPath)) {
                kieHelper.addResource(ResourceFactory.newClassPathResource(utilsPath + file.getFilename(), "UTF-8"), ResourceType.DRL);
            }
        } catch (IOException e) {
           logger.error(e);
        }
        kieHelper.addContent(rule, ResourceType.DRL);
        Results results = kieHelper.verify();
        if (results.hasMessages(Message.Level.ERROR)) {
            logger.error("ruleVerify = " + results.getMessages());
            return "ruleVerify = " + results.getMessages();
        }
        return "success";
    }

    @Override
    public boolean addRules(List<Model> list) {
        boolean flag = false;
        try {
            mongoTemplate.insert(list, Model.class);
            flag = true;
        } catch (Exception e) {
            logger.error(e);
        }
        return flag;
    }


}
