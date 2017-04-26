package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardRuleTime;
/**
 * 对象功能:TfCardRuleTime Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardRuleTimeDao extends MyBatisDaoImpl<String, TfCardRuleTime> 
{
	@Override
	public String getNamespace() {
		return TfCardRuleTime.class.getName();
	}
}
