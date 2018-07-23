package com.site.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.AuthResDao;
import com.site.entity.AuthRes;
import com.site.service.AuthResService;

/**
 * AuthRes Service Impl层
 * 
 * @author site
 * 
 */
@Service("AuthResService")
public class AuthResServiceImpl extends AbstractManagerImpl<Long, AuthRes> implements AuthResService {

	@Resource
	AuthResDao dao;

	@Override
	protected Dao<Long, AuthRes> getDao() {
		return dao;
	}

	@Override
	public List<AuthRes> getByNavId(Long id) {
		QueryMap queryMap = new QueryMap();
		queryMap.put("navId", id);
		return getList(queryMap);
	}
}