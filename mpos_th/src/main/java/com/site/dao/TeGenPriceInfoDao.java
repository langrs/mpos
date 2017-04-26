package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TeGenPriceInfo;
/**
 * 对象功能:TeGenPriceInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TeGenPriceInfoDao extends MyBatisDaoImpl<String, TeGenPriceInfo> 
{
	@Override
	public String getNamespace() {
		return TeGenPriceInfo.class.getName();
	}
}
