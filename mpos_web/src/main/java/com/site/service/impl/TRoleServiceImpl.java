package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TRoleDao;
import com.site.entity.TRole;
import com.site.service.TRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TRole Service Impl层
 * 
 * @author site
 * 
 */
@Service("TRoleService")
public class TRoleServiceImpl extends AbstractManagerImpl<Long, TRole> implements TRoleService {

	@Resource
	TRoleDao dao;

	@Override
	protected Dao<Long, TRole> getDao() {
		return dao;
	}

}