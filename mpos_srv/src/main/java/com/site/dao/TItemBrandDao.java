package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TItemBrand;
/**
 * 对象功能:TItemBrand Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TItemBrandDao extends MyBatisDaoImpl<String, TItemBrand> 
{
	@Override
	public String getNamespace() {
		return TItemBrand.class.getName();
	}
}
