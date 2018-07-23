package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.NavDao;
import com.site.entity.Nav;

/**
 * Nav Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class NavDaoImpl extends MyBatisDaoImpl<Long, Nav> implements NavDao {

	@Override
	public String getNamespace() {
		return Nav.class.getName();
	}

}