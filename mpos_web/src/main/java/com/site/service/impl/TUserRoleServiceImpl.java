package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TUserRoleDao;
import com.site.entity.TUserRole;
import com.site.service.TUserRoleService;

/**
 * TUserRole Service Impl层
 * 
 * @author site
 * 
 */
@Service("TUserRoleService")
public class TUserRoleServiceImpl extends AbstractManagerImpl<Long, TUserRole> implements TUserRoleService {

	@Resource
	TUserRoleDao dao;

	@Override
	protected Dao<Long, TUserRole> getDao() {
		return dao;
	}
}