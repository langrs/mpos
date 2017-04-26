package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardTypeRuleNdetail;
/**
 * 对象功能:TfCardTypeRuleNdetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardTypeRuleNdetailDao extends MyBatisDaoImpl<String, TfCardTypeRuleNdetail> 
{
	@Override
	public String getNamespace() {
		return TfCardTypeRuleNdetail.class.getName();
	}
}
