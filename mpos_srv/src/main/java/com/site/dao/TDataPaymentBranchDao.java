package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TDataPaymentBranch;
/**
 * 对象功能:TDataPaymentBranch Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TDataPaymentBranchDao extends MyBatisDaoImpl<String, TDataPaymentBranch> 
{
	@Override
	public String getNamespace() {
		return TDataPaymentBranch.class.getName();
	}
}
