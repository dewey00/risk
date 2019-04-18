package com.iapi.drools.utils;

import org.drools.compiler.kie.builder.impl.InternalKieModule;
import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.List;

/**
 * @ClassName KieUtils
 * @Description kie工具类
 * @Author ChengGuojun
 * @Date 2018-09-16 19:44
 * @Version 1.0
 */
public class KieUtils {
    private static KieContainer kieContainer;
    private static KieSession kieSession;

    public static KieContainer getKieContainer() {
        return kieContainer;
    }

    public static void setKieContainer(KieContainer kieContainer) {
        KieUtils.kieContainer = kieContainer;
        kieSession = kieContainer.newKieSession();
    }
    public static KieSession getKieSession() {
        return kieSession;
    }
    public static void setKieSession(KieSession kieSession) {
        KieUtils.kieSession = kieSession;
    }

    public static byte[] createKJar(ReleaseId releaseId, List<String> drls) {

        KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kfs = kieServices.newKieFileSystem();
        drls.forEach(drl -> kfs.write("src/main/resources/com/iapi/drools/rules/" + drl.hashCode() + ".drl", drl));
        KieBuilder kb = kieServices.newKieBuilder(kfs).buildAll();
        if (kb.getResults().hasMessages(Message.Level.ERROR)) {
            for (Message result : kb.getResults().getMessages()) {
                System.out.println(result.getText());
            }
            return null;
        }
        InternalKieModule kieModule = (InternalKieModule) kieServices.getRepository().getKieModule(releaseId);
        return kieModule.getBytes();
    }
}
