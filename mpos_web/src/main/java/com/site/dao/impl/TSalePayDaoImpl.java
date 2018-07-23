package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TSalePayDao;
import com.site.entity.TSalePay;

/**
 * TSalePay Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TSalePayDaoImpl extends MyBatisDaoImpl<Long, TSalePay> implements TSalePayDao {

	@Override
	public String getNamespace() {
		return TSalePay.class.getName();
	}

}