package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCategoryDao;
import com.site.entity.TCategory;
import com.site.service.TCategoryService;

/**
 * TCategory Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCategoryService")
public class TCategoryServiceImpl extends AbstractManagerImpl<Long, TCategory> implements TCategoryService {

	@Resource
	TCategoryDao dao;

	@Override
	protected Dao<Long, TCategory> getDao() {
		return dao;
	}
}