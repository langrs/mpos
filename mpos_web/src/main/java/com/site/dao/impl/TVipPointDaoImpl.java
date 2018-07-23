package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TVipPointDao;
import com.site.entity.TVipPoint;

/**
 * TVipPoint Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TVipPointDaoImpl extends MyBatisDaoImpl<Long, TVipPoint> implements TVipPointDao {

	@Override
	public String getNamespace() {
		return TVipPoint.class.getName();
	}

}