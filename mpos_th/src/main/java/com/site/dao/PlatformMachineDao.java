package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.PlatformMachine;
/**
 * 对象功能:PlatformMachine Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class PlatformMachineDao extends MyBatisDaoImpl<String, PlatformMachine> 
{
	@Override
	public String getNamespace() {
		return PlatformMachine.class.getName();
	}
}
