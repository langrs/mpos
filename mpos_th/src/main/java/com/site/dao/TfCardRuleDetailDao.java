package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardRuleDetail;
/**
 * 对象功能:TfCardRuleDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardRuleDetailDao extends MyBatisDaoImpl<String, TfCardRuleDetail> 
{
	@Override
	public String getNamespace() {
		return TfCardRuleDetail.class.getName();
	}
}
