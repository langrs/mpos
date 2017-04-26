package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfMemberDay;
/**
 * 对象功能:TfMemberDay Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfMemberDayDao extends MyBatisDaoImpl<String, TfMemberDay> 
{
	@Override
	public String getNamespace() {
		return TfMemberDay.class.getName();
	}
}
