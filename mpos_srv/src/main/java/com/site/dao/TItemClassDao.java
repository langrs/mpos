package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TItemClass;
/**
 * 对象功能:TItemClass Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TItemClassDao extends MyBatisDaoImpl<String, TItemClass> 
{
	@Override
	public String getNamespace() {
		return TItemClass.class.getName();
	}
}
