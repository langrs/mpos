package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosSaleDetailFore;
/**
 * 对象功能:TPosSaleDetailFore Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosSaleDetailForeDao extends MyBatisDaoImpl<String, TPosSaleDetailFore> 
{
	@Override
	public String getNamespace() {
		return TPosSaleDetailFore.class.getName();
	}
}
