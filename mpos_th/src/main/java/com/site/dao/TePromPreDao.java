package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TePromPre;
/**
 * 对象功能:TePromPre Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TePromPreDao extends MyBatisDaoImpl<String, TePromPre> 
{
	@Override
	public String getNamespace() {
		return TePromPre.class.getName();
	}
}
