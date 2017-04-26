package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardTypeRule;
/**
 * 对象功能:TfCardTypeRule Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardTypeRuleDao extends MyBatisDaoImpl<String, TfCardTypeRule> 
{
	@Override
	public String getNamespace() {
		return TfCardTypeRule.class.getName();
	}
}
