package com.iapi.drools.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.json.JSONObject;

/**
 * @author lipingle
 * @ClassName: MapSortUtils
 * @Description: Map排序
 * @date 2018年10月29日 下午5:35:53
 */
public class MapSortUtils {

    /**
     * @param list   需要转换的 list集合
     * @param keys   返回 map的 key，也是 list集合数据中存在的字段名
     * @param sort   1：表示升序 2：表示降序
     * @return Map<String   ,   String> 返回类型
     * @throws
     * @Title: jsonArraySort
     * @Description: list集合转 map集合
     * @author lipingle 作者
     * @date 2018年10月31日 上午9:20:55
     */
    public static List<HashMap> jsonArraySort(List<HashMap> list, String keys, Integer sort) {
            try {
                if (1 == sort) {
                    list.sort((a, b) -> {

                        //顺序 就用后面的参数 - 前面的参数
                        return (int) (toLong(a.get(keys)) - toLong(b.get(keys)));
                    });
                } else {
                    list.sort((a, b) -> {
                        //逆序 就用后面的参数 - 前面的参数
                        return (int) (toLong(b.get(keys)) - toLong(a.get(keys)));
                    });
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        return list;
    }

    private static Long toLong(Object obj) {
        String regEx = "[^0-9]";
        Long rs = getaLong(obj, regEx);
        if (rs != null) {
            return rs;
        }
        return 0L;
    }

    private static Long getaLong(Object obj, String regEx) {
        if (null != obj&&!"".equals(obj)) {
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(obj.toString());
            String rs = m.replaceAll("").trim();
            if (!"".equals(rs)){
                return Long.parseLong(rs);
            }
        }
        return null;
    }

    public static Map<String, Object> objectToMap(Object obj) {
        Map<String, Object> maps = new HashMap<>(0);
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : propertyDescriptors) {
                String key = descriptor.getName();
                Method method = descriptor.getReadMethod();
                Object val = method.invoke(obj);
                maps.put(key, val);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maps;
    }
}
