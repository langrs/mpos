package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosSalePayment;
/**
 * 对象功能:TPosSalePayment Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosSalePaymentDao extends MyBatisDaoImpl<String, TPosSalePayment> 
{
	@Override
	public String getNamespace() {
		return TPosSalePayment.class.getName();
	}
}
