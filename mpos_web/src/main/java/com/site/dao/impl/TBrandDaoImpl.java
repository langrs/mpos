package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TBrandDao;
import com.site.entity.TBrand;

/**
 * 对象功能:TBrand Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class TBrandDaoImpl extends MyBatisDaoImpl<Long, TBrand> implements TBrandDao
{
	@Override
	public String getNamespace() {
		return TBrand.class.getName();
	}
}
