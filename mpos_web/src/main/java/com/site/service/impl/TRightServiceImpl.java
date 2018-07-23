package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TRightDao;
import com.site.entity.TRight;
import com.site.service.TRightService;

/**
 * TRight Service Impl层
 * 
 * @author site
 * 
 */
@Service("TRightService")
public class TRightServiceImpl extends AbstractManagerImpl<Long, TRight> implements TRightService {

	@Resource
	TRightDao dao;

	@Override
	protected Dao<Long, TRight> getDao() {
		return dao;
	}
}