package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipFlow;
/**
 * 对象功能:TVipFlow Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipFlowDao extends MyBatisDaoImpl<String, TVipFlow> 
{
	@Override
	public String getNamespace() {
		return TVipFlow.class.getName();
	}
}
