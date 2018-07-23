package com.site.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.SystemParametersDao;
import com.site.entity.SystemParameters;
import com.site.service.SystemParametersService;

/**
 * SystemParameters Service Impl层
 * 
 * @author site
 * 
 */
@Service("SystemParametersService")
public class SystemParametersServiceImpl extends AbstractManagerImpl<Long, SystemParameters> implements SystemParametersService {

	@Resource
	SystemParametersDao dao;

	@Override
	protected Dao<Long, SystemParameters> getDao() {
		return dao;
	}

	@Override
	public List<SystemParameters> getParametersByType(String type) {
		QueryMap queryMap = new QueryMap();
		queryMap.put("parametersType", type);
		return getList(queryMap);
	}
}