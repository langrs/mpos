package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TSaleDDao;
import com.site.entity.TSaleD;

/**
 * TSaleD Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TSaleDDaoImpl extends MyBatisDaoImpl<Long, TSaleD> implements TSaleDDao {

	@Override
	public String getNamespace() {
		return TSaleD.class.getName();
	}

}