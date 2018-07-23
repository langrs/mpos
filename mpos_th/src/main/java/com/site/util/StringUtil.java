package com.site.util;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Administrator on 2017-05-03.
 *
 */
public class StringUtil {
    //判断参数List中的对象中的attr属性的
    public static <T> Integer compareList(List<T> list, String attr, String val) {
        String methodName = "get" + attr.substring(0, 1).toUpperCase() + attr.substring(1);
        int i = 0;
        for (T t : list) {
            try {
                //获取类
                Class tClass = t.getClass();
                //获取属性attr的get方法
                Method method = tClass.getDeclaredMethod(methodName, null);
                //获取属性值
                String attrVal = (String) method.invoke(t, null);
                //判断属性值是否和参数的比较值一致
                if (attrVal != null && attrVal.equals(val)) {
                    return i;
                }
                i++;
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        return null;
    }

}
