package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TaPayment;
/**
 * 对象功能:TaPayment Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TaPaymentDao extends MyBatisDaoImpl<String, TaPayment> 
{
	@Override
	public String getNamespace() {
		return TaPayment.class.getName();
	}
}
