package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.PlatformStaffs;
/**
 * 对象功能:PlatformStaffs Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class PlatformStaffsDao extends MyBatisDaoImpl<String, PlatformStaffs> 
{
	@Override
	public String getNamespace() {
		return PlatformStaffs.class.getName();
	}
}
