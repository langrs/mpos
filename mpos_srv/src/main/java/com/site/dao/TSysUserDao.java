package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TSysUser;
/**
 * 对象功能:TSysUser Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TSysUserDao extends MyBatisDaoImpl<String, TSysUser> 
{
	@Override
	public String getNamespace() {
		return TSysUser.class.getName();
	}
}
