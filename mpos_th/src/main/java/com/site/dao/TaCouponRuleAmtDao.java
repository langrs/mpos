package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TaCouponRuleAmt;
/**
 * 对象功能:TaCouponRuleAmt Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TaCouponRuleAmtDao extends MyBatisDaoImpl<String, TaCouponRuleAmt> 
{
	@Override
	public String getNamespace() {
		return TaCouponRuleAmt.class.getName();
	}
}
