package com.site.util;

import com.site.core.mybatis.QueryMap;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanToMap {
	// Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
	public static QueryMap beanToMap(Object obj) {

		if (obj == null) {
			return null;
		}
		 QueryMap map = new QueryMap();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo
					.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();

				// 过滤class属性
				if (!key.equals("class")) {
					// 得到property对应的getter方法
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);
					if (value!=null&&!"".equals(value)) {
						map.put(key, value);
					}
				}

			}
		} catch (Exception e) {
			System.out.println("transBean2Map Error " + e);
		}

		return map;

	}
}
