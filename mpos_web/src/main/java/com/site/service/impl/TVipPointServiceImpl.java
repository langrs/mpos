package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TVipPointDao;
import com.site.entity.TVipPoint;
import com.site.service.TVipPointService;

/**
 * TVipPoint Service Impl层
 * 
 * @author site
 * 
 */
@Service("TVipPointService")
public class TVipPointServiceImpl extends AbstractManagerImpl<Long, TVipPoint> implements TVipPointService {

	@Resource
	TVipPointDao dao;

	@Override
	protected Dao<Long, TVipPoint> getDao() {
		return dao;
	}
}