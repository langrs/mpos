package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.XbDbIdDao;
import com.site.entity.XbDbId;
import com.site.service.XbDbIdService;

/**
 * XbDbId Service Impl层
 * 
 * @author site
 * 
 */
@Service("XbDbIdService")
public class XbDbIdServiceImpl extends AbstractManagerImpl<Long, XbDbId> implements XbDbIdService {

	@Resource
	XbDbIdDao dao;

	@Override
	protected Dao<Long, XbDbId> getDao() {
		return dao;
	}
}