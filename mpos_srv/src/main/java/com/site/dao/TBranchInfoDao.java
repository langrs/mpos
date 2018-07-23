package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TBranchInfo;
/**
 * 对象功能:TBranchInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TBranchInfoDao extends MyBatisDaoImpl<String, TBranchInfo> 
{
	@Override
	public String getNamespace() {
		return TBranchInfo.class.getName();
	}
}
