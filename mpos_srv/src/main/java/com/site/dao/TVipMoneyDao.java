package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipMoney;
/**
 * 对象功能:TVipMoney Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipMoneyDao extends MyBatisDaoImpl<String, TVipMoney> 
{
	@Override
	public String getNamespace() {
		return TVipMoney.class.getName();
	}
}
