package com.iapi.drools.config;

import com.iapi.drools.service.IndexItemService;
import com.iapi.drools.service.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 *
 * 如果有多个这样的类时，可以通过Order指定执行顺序，数值越小执行优先级越高
 * @ClassName InitSystemConfig
 * @Description
 * @Author ChengGuojun
 * @Date 2019-02-18 15:35
 * @Version 1.0
 */
@Component
@Order(value = 0)
public class InitSystemConfig implements CommandLineRunner, EnvironmentAware {
    /**
     * 在服务启动后执行，会在@Bean实例化之后执行，故如果@Bean需要依赖这里的话会出问题
     */
    @Autowired
    RulesService rulesService;
    @Autowired
    private IndexItemService indexItemService;
    @Override
    public void run(String... args) throws Exception {
        try{
            System.out.println("------------------------reloadAllRules-----------------------------");
            rulesService.reloadAllRules();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println("------------------------reloadScript-----------------------------");
            indexItemService.reloadScript();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /**
     * 在SystemConfigDao实例化之后、@Bean实例化之前执行
     * 常用于读取数据库配置以供其它bean使用
     * environment对象可以获取配置文件的配置，也可以把配置设置到该对象中
     */
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("*****************************************************************************");
    }
}
