package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TRegionDao;
import com.site.entity.TRegion;

/**
 * TRegion Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TRegionDaoImpl extends MyBatisDaoImpl<Long, TRegion> implements TRegionDao {

	@Override
	public String getNamespace() {
		return TRegion.class.getName();
	}

}