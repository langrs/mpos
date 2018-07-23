package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TUserDao;
import com.site.entity.TUser;
import com.site.service.TUserService;

/**
 * TUser Service Impl层
 * 
 * @author site
 * 
 */
@Service("TUserService")
public class TUserServiceImpl extends AbstractManagerImpl<Long, TUser> implements TUserService {

	@Resource
	TUserDao dao;

	@Override
	protected Dao<Long, TUser> getDao() {
		return dao;
	}
}