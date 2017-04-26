package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TePromPreDetail;
/**
 * 对象功能:TePromPreDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TePromPreDetailDao extends MyBatisDaoImpl<String, TePromPreDetail> 
{
	@Override
	public String getNamespace() {
		return TePromPreDetail.class.getName();
	}
}
