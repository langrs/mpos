package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCompanyDao;
import com.site.entity.TCompany;

/**
 * TCompany Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCompanyDaoImpl extends MyBatisDaoImpl<Long, TCompany> implements TCompanyDao {

	@Override
	public String getNamespace() {
		return TCompany.class.getName();
	}

}