package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TbCounter;
/**
 * 对象功能:TbCounter Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TbCounterDao extends MyBatisDaoImpl<String, TbCounter> 
{
	@Override
	public String getNamespace() {
		return TbCounter.class.getName();
	}
}
