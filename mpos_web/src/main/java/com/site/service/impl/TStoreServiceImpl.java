package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TStoreDao;
import com.site.entity.TStore;
import com.site.service.TStoreService;

/**
 * TStore Service Impl层
 * 
 * @author site
 * 
 */
@Service("TStoreService")
public class TStoreServiceImpl extends AbstractManagerImpl<Long, TStore> implements TStoreService {

	@Resource
	TStoreDao dao;

	@Override
	protected Dao<Long, TStore> getDao() {
		return dao;
	}
}