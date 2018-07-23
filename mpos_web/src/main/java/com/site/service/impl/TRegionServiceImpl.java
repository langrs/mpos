package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TRegionDao;
import com.site.entity.TRegion;
import com.site.service.TRegionService;

/**
 * TRegion Service Impl层
 * 
 * @author site
 * 
 */
@Service("TRegionService")
public class TRegionServiceImpl extends AbstractManagerImpl<Long, TRegion> implements TRegionService {

	@Resource
	TRegionDao dao;

	@Override
	protected Dao<Long, TRegion> getDao() {
		return dao;
	}
}