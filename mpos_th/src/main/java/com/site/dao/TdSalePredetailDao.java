package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TdSalePredetail;
/**
 * 对象功能:TdSalePredetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TdSalePredetailDao extends MyBatisDaoImpl<String, TdSalePredetail> 
{
	@Override
	public String getNamespace() {
		return TdSalePredetail.class.getName();
	}
}
