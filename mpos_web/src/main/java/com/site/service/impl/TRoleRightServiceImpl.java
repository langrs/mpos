package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TRoleRightDao;
import com.site.entity.TRoleRight;
import com.site.service.TRoleRightService;

/**
 * TRoleRight Service Impl层
 * 
 * @author site
 * 
 */
@Service("TRoleRightService")
public class TRoleRightServiceImpl extends AbstractManagerImpl<Long, TRoleRight> implements TRoleRightService {

	@Resource
	TRoleRightDao dao;

	@Override
	protected Dao<Long, TRoleRight> getDao() {
		return dao;
	}
}