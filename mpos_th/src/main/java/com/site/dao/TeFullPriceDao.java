package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TeFullPrice;
/**
 * 对象功能:TeFullPrice Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TeFullPriceDao extends MyBatisDaoImpl<String, TeFullPrice> 
{
	@Override
	public String getNamespace() {
		return TeFullPrice.class.getName();
	}
}
