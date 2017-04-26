package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfMember;
/**
 * 对象功能:TfMember Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfMemberDao extends MyBatisDaoImpl<String, TfMember> 
{
	@Override
	public String getNamespace() {
		return TfMember.class.getName();
	}
}
