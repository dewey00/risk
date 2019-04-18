package com.iapi.drools.service.impl;

import com.iapi.drools.dao.impl.ElasticSearchDaoImpl;
import com.iapi.drools.service.ElasticSearchMonitor;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.cluster.Health;
import io.searchbox.cluster.NodesInfo;
import io.searchbox.cluster.NodesStats;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName ElasticSearchMonitorImpl
 * @Description TODO
 * @Author ChengGuojun
 * @Date 2018-12-14 15:42
 * @Version 1.0
 */
@Service
public class ElasticSearchMonitorImpl implements ElasticSearchMonitor {
    @Autowired
    private JestClient client;
    private Logger logger = LogManager.getLogger(ElasticSearchDaoImpl.class);


    @Override
    public Map<String, Object> getElasticSearchStatus() {
        Map<String, Object> map = new HashMap<>(3);
        NodesInfo nodesInfo = new NodesInfo.Builder().build();
        Health health = new Health.Builder().build();
        NodesStats nodesStats = new NodesStats.Builder().build();
        try {
            JestResult nodesInfoResult = client.execute(nodesInfo);
            if (nodesInfoResult.isSucceeded()) {
                Map s = nodesInfoResult.getSourceAsObject(HashMap.class);
                map.put("nodesInfoResult", s);
            }
        } catch (Exception e) {
            logger.error(e);
        }

        try {
            JestResult nodesStatsResult = client.execute(health);
            if (nodesStatsResult.isSucceeded()) {
                Map s = nodesStatsResult.getSourceAsObject(HashMap.class);
                map.put("nodesStatsResult", s);
            }
        } catch (Exception e) {
            logger.error(e);
        }

        try {
            JestResult healthResult = client.execute(nodesStats);
            if (healthResult.isSucceeded()) {
                Map s = healthResult.getSourceAsObject(HashMap.class);
                map.put("healthResult", s);
            }
        } catch (Exception e) {
            logger.error(e);
        }
        return map;
    }
}
