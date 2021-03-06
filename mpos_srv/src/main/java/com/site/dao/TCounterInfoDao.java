package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TCounterInfo;
/**
 * 对象功能:TCounterInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TCounterInfoDao extends MyBatisDaoImpl<String, TCounterInfo> 
{
	@Override
	public String getNamespace() {
		return TCounterInfo.class.getName();
	}
}
