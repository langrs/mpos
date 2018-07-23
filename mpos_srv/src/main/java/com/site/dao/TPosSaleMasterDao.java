package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosSaleMaster;
/**
 * 对象功能:TPosSaleMaster Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosSaleMasterDao extends MyBatisDaoImpl<String, TPosSaleMaster> 
{
	@Override
	public String getNamespace() {
		return TPosSaleMaster.class.getName();
	}
}
