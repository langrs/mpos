package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosStampInfo;
/**
 * 对象功能:TPosStampInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosStampInfoDao extends MyBatisDaoImpl<String, TPosStampInfo> 
{
	@Override
	public String getNamespace() {
		return TPosStampInfo.class.getName();
	}
}
