package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TDataPayment;
/**
 * 对象功能:TDataPayment Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TDataPaymentDao extends MyBatisDaoImpl<String, TDataPayment> 
{
	@Override
	public String getNamespace() {
		return TDataPayment.class.getName();
	}
}
