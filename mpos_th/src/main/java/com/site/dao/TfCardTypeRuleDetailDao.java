package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardTypeRuleDetail;
/**
 * 对象功能:TfCardTypeRuleDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardTypeRuleDetailDao extends MyBatisDaoImpl<String, TfCardTypeRuleDetail> 
{
	@Override
	public String getNamespace() {
		return TfCardTypeRuleDetail.class.getName();
	}
}
