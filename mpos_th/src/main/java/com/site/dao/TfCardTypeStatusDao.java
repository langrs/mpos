package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfCardTypeStatus;
/**
 * 对象功能:TfCardTypeStatus Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfCardTypeStatusDao extends MyBatisDaoImpl<String, TfCardTypeStatus> 
{
	@Override
	public String getNamespace() {
		return TfCardTypeStatus.class.getName();
	}
}
