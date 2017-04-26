package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TaShopInfo;
/**
 * 对象功能:TaShopInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TaShopInfoDao extends MyBatisDaoImpl<String, TaShopInfo> 
{
	@Override
	public String getNamespace() {
		return TaShopInfo.class.getName();
	}
}
