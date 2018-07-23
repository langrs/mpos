package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TItemInfo;
/**
 * 对象功能:TItemInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TItemInfoDao extends MyBatisDaoImpl<String, TItemInfo> 
{
	@Override
	public String getNamespace() {
		return TItemInfo.class.getName();
	}
}
