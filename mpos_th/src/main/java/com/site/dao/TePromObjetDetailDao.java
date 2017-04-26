package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TePromObjetDetail;
/**
 * 对象功能:TePromObjetDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TePromObjetDetailDao extends MyBatisDaoImpl<String, TePromObjetDetail> 
{
	@Override
	public String getNamespace() {
		return TePromObjetDetail.class.getName();
	}
}
