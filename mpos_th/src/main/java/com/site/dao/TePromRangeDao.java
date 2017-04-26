package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TePromRange;
/**
 * 对象功能:TePromRange Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TePromRangeDao extends MyBatisDaoImpl<String, TePromRange> 
{
	@Override
	public String getNamespace() {
		return TePromRange.class.getName();
	}
}
