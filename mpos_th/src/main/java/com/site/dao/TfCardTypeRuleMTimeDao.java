package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardTypeRuleMTime;
/**
 * 对象功能:TfCardTypeRuleMTime Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardTypeRuleMTimeDao extends MyBatisDaoImpl<String, TfCardTypeRuleMTime> 
{
	@Override
	public String getNamespace() {
		return TfCardTypeRuleMTime.class.getName();
	}
}
