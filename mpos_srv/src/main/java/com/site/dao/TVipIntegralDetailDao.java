package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipIntegralDetail;
/**
 * 对象功能:TVipIntegralDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipIntegralDetailDao extends MyBatisDaoImpl<String, TVipIntegralDetail> 
{
	@Override
	public String getNamespace() {
		return TVipIntegralDetail.class.getName();
	}
}
