package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TfMemberGrade;
/**
 * 对象功能:TfMemberGrade Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TfMemberGradeDao extends MyBatisDaoImpl<String, TfMemberGrade> 
{
	@Override
	public String getNamespace() {
		return TfMemberGrade.class.getName();
	}
}
