package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardRuleAmt;
/**
 * 对象功能:TfCardRuleAmt Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardRuleAmtDao extends MyBatisDaoImpl<String, TfCardRuleAmt> 
{
	@Override
	public String getNamespace() {
		return TfCardRuleAmt.class.getName();
	}
}
