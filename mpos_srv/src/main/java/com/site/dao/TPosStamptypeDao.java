package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosStamptype;
/**
 * 对象功能:TPosStamptype Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosStamptypeDao extends MyBatisDaoImpl<String, TPosStamptype> 
{
	@Override
	public String getNamespace() {
		return TPosStamptype.class.getName();
	}
}
