package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TdSaleDetailAgio;
/**
 * 对象功能:TdSaleDetailAgio Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TdSaleDetailAgioDao extends MyBatisDaoImpl<String, TdSaleDetailAgio> 
{
	@Override
	public String getNamespace() {
		return TdSaleDetailAgio.class.getName();
	}
}
