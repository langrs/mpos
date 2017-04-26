package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TePromObjet;
/**
 * 对象功能:TePromObjet Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TePromObjetDao extends MyBatisDaoImpl<String, TePromObjet> 
{
	@Override
	public String getNamespace() {
		return TePromObjet.class.getName();
	}
}
