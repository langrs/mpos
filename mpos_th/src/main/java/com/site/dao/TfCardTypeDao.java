package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardType;
/**
 * 对象功能:TfCardType Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardTypeDao extends MyBatisDaoImpl<String, TfCardType> 
{
	@Override
	public String getNamespace() {
		return TfCardType.class.getName();
	}
}
