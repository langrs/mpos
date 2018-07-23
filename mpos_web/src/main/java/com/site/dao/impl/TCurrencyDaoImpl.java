package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCurrencyDao;
import com.site.entity.TCurrency;

/**
 * TCurrency Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCurrencyDaoImpl extends MyBatisDaoImpl<Long, TCurrency> implements TCurrencyDao {

	@Override
	public String getNamespace() {
		return TCurrency.class.getName();
	}

}