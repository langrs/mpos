package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TPromtypeDao;
import com.site.entity.TPromtype;

/**
 * 对象功能:TPromtype Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class TPromtypeDaoImpl extends MyBatisDaoImpl<Long, TPromtype> implements TPromtypeDao
{
	@Override
	public String getNamespace() {
		return TPromtype.class.getName();
	}
}
