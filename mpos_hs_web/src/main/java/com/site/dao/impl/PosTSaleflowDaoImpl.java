package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.PosTSaleflowDao;
import com.site.entity.PosTSaleflow;

/**
 * 对象功能:PosTSaleflow Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class PosTSaleflowDaoImpl extends MyBatisDaoImpl<Long, PosTSaleflow> implements PosTSaleflowDao
{
	@Override
	public String getNamespace() {
		return PosTSaleflow.class.getName();
	}
}
