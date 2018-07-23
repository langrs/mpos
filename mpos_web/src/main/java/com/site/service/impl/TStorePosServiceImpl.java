package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TStorePosDao;
import com.site.entity.TStorePos;
import com.site.service.TStorePosService;

/**
 * TStorePos Service Impl层
 * 
 * @author site
 * 
 */
@Service("TStorePosService")
public class TStorePosServiceImpl extends AbstractManagerImpl<Long, TStorePos> implements TStorePosService {

	@Resource
	TStorePosDao dao;

	@Override
	protected Dao<Long, TStorePos> getDao() {
		return dao;
	}
}