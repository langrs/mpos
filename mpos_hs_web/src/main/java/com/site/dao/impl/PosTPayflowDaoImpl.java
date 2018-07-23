package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.PosTPayflowDao;
import com.site.entity.PosTPayflow;

/**
 * 对象功能:PosTPayflow Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class PosTPayflowDaoImpl extends MyBatisDaoImpl<Long, PosTPayflow> implements PosTPayflowDao
{
	@Override
	public String getNamespace() {
		return PosTPayflow.class.getName();
	}
}
