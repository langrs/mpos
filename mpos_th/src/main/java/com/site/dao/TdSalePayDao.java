package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TdSalePay;
/**
 * 对象功能:TdSalePay Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TdSalePayDao extends MyBatisDaoImpl<String, TdSalePay> 
{
	@Override
	public String getNamespace() {
		return TdSalePay.class.getName();
	}
}
