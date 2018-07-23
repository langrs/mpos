package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TPayviewDao;
import com.site.entity.TPayview;

/**
 * TPayview Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TPayviewDaoImpl extends MyBatisDaoImpl<Long, TPayview> implements TPayviewDao {

	@Override
	public String getNamespace() {
		return TPayview.class.getName();
	}

}