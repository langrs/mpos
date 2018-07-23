package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.UserDao;
import com.site.entity.User;
import com.site.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User Service Impl层
 * 
 * @author site
 * 
 */
@Service("UserService")
public class UserServiceImpl extends AbstractManagerImpl<Long, User> implements UserService {

	@Resource
	UserDao dao;

	@Override
	protected Dao<Long, User> getDao() {
		return dao;
	}

	public User getByUserNo() {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		QueryMap map = new QueryMap();
		map.put("userNo", userDetails.getUsername());
		return dao.getOne(map);
	}
}