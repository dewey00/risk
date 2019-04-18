package com.iapi.drools.service;

import com.iapi.drools.bean.indexitem.IndexItem;
import com.iapi.drools.bean.indexitem.RequestIndexItem;

/**
 * @author cheng
 */
public interface ItemSynchroService {
    /**
    * 添加更新
     *
     * @Author cheng
    * @Description
    * @Date 10:41 2019/3/11
    * @Param []
    * @return java.lang.String
    *
    */
    String add(RequestIndexItem indexItems);

    /**
     * 添加更新
     *
     * @Author cheng
     * @Description
     * @Date 10:41 2019/3/11
     * @Param []
     * @return java.lang.String
     *
     */
    String update(IndexItem indexItems);

    /**
     * 删除清空
     *
     * @Author cheng
     * @Description
     * @Date 10:41 2019/3/11
     * @Param []
     * @return java.lang.String
     *
     */
    String delete(String script);



    /**
     * 删除清空
     *
     * @Author cheng
     * @Description
     * @Date 10:41 2019/3/11
     * @Param []
     * @return java.lang.String
     *
     */
    String clear();

}
