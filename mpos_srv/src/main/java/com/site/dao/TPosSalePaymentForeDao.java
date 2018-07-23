package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosSalePaymentFore;
/**
 * 对象功能:TPosSalePaymentFore Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosSalePaymentForeDao extends MyBatisDaoImpl<String, TPosSalePaymentFore> 
{
	@Override
	public String getNamespace() {
		return TPosSalePaymentFore.class.getName();
	}
}
