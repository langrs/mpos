package com.site.util;


import com.google.gson.Gson;
import com.site.entity.ResultMap;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

import java.util.Date;

/*
 * params设置不需要显示的参数
 */
public class JsonUtil {
	public static String objectToString(String[] params,ResultMap map) {
		JsonConfig config = new JsonConfig();
		config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		config.setIgnoreDefaultExcludes(false);
		//注册date的转化格式
		config.registerJsonValueProcessor(Date.class,new JsonDateValueProcessor());
		if(params!=null){
			config.setExcludes(params);
		}
		JSONObject json = JSONObject.fromObject(map, config);
		return json.toString();
	}

	public static String mapToString(Object object) {
		JsonConfig config = new JsonConfig();
		config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		config.setIgnoreDefaultExcludes(false);
		JSONObject json = JSONObject.fromObject(object, config);
		return json.toString();
	}
	public static String gsonMapToString(Object object){
		Gson gson = new Gson();
		return gson.toJson(object);
	}
}
