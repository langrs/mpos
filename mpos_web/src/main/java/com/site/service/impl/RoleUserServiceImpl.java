package com.site.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.RoleUserDao;
import com.site.entity.RoleUser;
import com.site.service.RoleUserService;

/**
 * RoleUser Service Impl层
 * 
 * @author site
 * 
 */
@Service("RoleUserService")
public class RoleUserServiceImpl extends AbstractManagerImpl<Long, RoleUser> implements RoleUserService {

	@Resource
	RoleUserDao dao;

	@Override
	protected Dao<Long, RoleUser> getDao() {
		return dao;
	}

	@Override
	public List<RoleUser> getByUserId(Long userId) {
		QueryMap map = new QueryMap();
		map.put("userid", userId);
		return dao.getList(map);
	}
}