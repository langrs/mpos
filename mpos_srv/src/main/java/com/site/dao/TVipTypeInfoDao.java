package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipTypeInfo;
/**
 * 对象功能:TVipTypeInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipTypeInfoDao extends MyBatisDaoImpl<String, TVipTypeInfo> 
{
	@Override
	public String getNamespace() {
		return TVipTypeInfo.class.getName();
	}
}
