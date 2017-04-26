package com.site.dao;

import com.site.base.MyBatisDaoImpl;
import com.site.entity.QueryMap;
import com.site.entity.TeGen;
import com.site.entity.respon.GetPromResult;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 对象功能:TeGen Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 * 增加了查询当天所有的所有的促销单的
 */
@Repository 
public class TeGenDao extends MyBatisDaoImpl<String, TeGen> 
{
	@Override
	public String getNamespace() {
		return TeGen.class.getName();
	}

	//获取当天有效的分店所有的一般促销单
	public List<GetPromResult> getPromResult(String shop){
		QueryMap queryMap = new QueryMap();
		queryMap.put("lbdate",new SimpleDateFormat("yyyyMMdd").format(new Date()));
		queryMap.put("shop",shop);
		return sqlSessionTemplate.selectList(getNamespace() + ".getProm",queryMap);
	}
}
