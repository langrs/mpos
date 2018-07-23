package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TPayviewDao;
import com.site.entity.TPayview;
import com.site.service.TPayviewService;

/**
 * TPayview Service Impl层
 * 
 * @author site
 * 
 */
@Service("TPayviewService")
public class TPayviewServiceImpl extends AbstractManagerImpl<Long, TPayview> implements TPayviewService {

	@Resource
	TPayviewDao dao;

	@Override
	protected Dao<Long, TPayview> getDao() {
		return dao;
	}
}