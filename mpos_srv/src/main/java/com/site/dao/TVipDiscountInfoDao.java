package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipDiscountInfo;
/**
 * 对象功能:TVipDiscountInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipDiscountInfoDao extends MyBatisDaoImpl<String, TVipDiscountInfo> 
{
	@Override
	public String getNamespace() {
		return TVipDiscountInfo.class.getName();
	}
}
