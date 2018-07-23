package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosSaleMasterFore;
/**
 * 对象功能:TPosSaleMasterFore Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosSaleMasterForeDao extends MyBatisDaoImpl<String, TPosSaleMasterFore> 
{
	@Override
	public String getNamespace() {
		return TPosSaleMasterFore.class.getName();
	}
}
