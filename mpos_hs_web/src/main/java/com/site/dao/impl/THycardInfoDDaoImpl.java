package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.THycardInfoDDao;
import com.site.entity.THycardInfoD;

/**
 * 对象功能:THycardInfoD Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class THycardInfoDDaoImpl extends MyBatisDaoImpl<Long, THycardInfoD> implements THycardInfoDDao
{
	@Override
	public String getNamespace() {
		return THycardInfoD.class.getName();
	}
}
