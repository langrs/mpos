package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TbUnit;
/**
 * 对象功能:TbUnit Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TbUnitDao extends MyBatisDaoImpl<String, TbUnit> 
{
	@Override
	public String getNamespace() {
		return TbUnit.class.getName();
	}
}
