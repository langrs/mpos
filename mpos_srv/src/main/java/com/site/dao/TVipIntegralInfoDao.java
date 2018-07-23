package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipIntegralInfo;
/**
 * 对象功能:TVipIntegralInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipIntegralInfoDao extends MyBatisDaoImpl<String, TVipIntegralInfo> 
{
	@Override
	public String getNamespace() {
		return TVipIntegralInfo.class.getName();
	}
}
