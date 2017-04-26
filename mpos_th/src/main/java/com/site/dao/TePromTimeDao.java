package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TePromTime;
/**
 * 对象功能:TePromTime Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TePromTimeDao extends MyBatisDaoImpl<String, TePromTime> 
{
	@Override
	public String getNamespace() {
		return TePromTime.class.getName();
	}
}
