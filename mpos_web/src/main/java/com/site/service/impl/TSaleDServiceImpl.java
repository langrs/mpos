package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TSaleDDao;
import com.site.entity.TSaleD;
import com.site.service.TSaleDService;

/**
 * TSaleD Service Impl层
 * 
 * @author site
 * 
 */
@Service("TSaleDService")
public class TSaleDServiceImpl extends AbstractManagerImpl<Long, TSaleD> implements TSaleDService {

	@Resource
	TSaleDDao dao;

	@Override
	protected Dao<Long, TSaleD> getDao() {
		return dao;
	}
}