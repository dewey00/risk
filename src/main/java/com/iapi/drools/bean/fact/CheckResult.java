package com.iapi.drools.bean.fact;


import java.io.Serializable;
import java.util.ArrayList;


public class CheckResult implements Serializable {

    /**
     * true:通过校验；false：未通过校验
     */
    private boolean postCodeResult = false;
    private long useTime;
    private ArrayList results = new ArrayList<>();



    public boolean isPostCodeResult() {
        return postCodeResult;
    }

    public void setPostCodeResult(boolean postCodeResult) {
        this.postCodeResult = postCodeResult;
    }

    public long getUseTime() {
        return useTime;
    }

    public void setUseTime(long useTime) {
        this.useTime = useTime;
    }


    public ArrayList getResults() {
        return results;
    }

    public void setResults(ArrayList results) {
        this.results = results;
    }
}
