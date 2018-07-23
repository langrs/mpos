package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipUpgradeInfo;
/**
 * 对象功能:TVipUpgradeInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipUpgradeInfoDao extends MyBatisDaoImpl<String, TVipUpgradeInfo> 
{
	@Override
	public String getNamespace() {
		return TVipUpgradeInfo.class.getName();
	}
}
