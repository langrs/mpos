package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardTypeRuleMdetail;
/**
 * 对象功能:TfCardTypeRuleMdetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardTypeRuleMdetailDao extends MyBatisDaoImpl<String, TfCardTypeRuleMdetail> 
{
	@Override
	public String getNamespace() {
		return TfCardTypeRuleMdetail.class.getName();
	}
}
