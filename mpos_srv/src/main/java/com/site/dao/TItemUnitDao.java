package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TItemUnit;
/**
 * 对象功能:TItemUnit Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TItemUnitDao extends MyBatisDaoImpl<String, TItemUnit> 
{
	@Override
	public String getNamespace() {
		return TItemUnit.class.getName();
	}
}
