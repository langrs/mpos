package com.site.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.NavDao;
import com.site.entity.Nav;
import com.site.service.NavService;

/**
 * Nav Service Impl层
 * 
 * @author site
 * 
 */
@Service("NavService")
public class NavServiceImpl extends AbstractManagerImpl<Long, Nav> implements NavService {

	@Resource
	NavDao dao;

	@Override
	protected Dao<Long, Nav> getDao() {
		return dao;
	}

	@Override
	public List<Nav> getByParent(Long parent) {
		QueryMap map = new QueryMap();
		map.put("parent", parent);
		return dao.getList(map);
	}

	@Override
	public Nav getByPath(String path) {
		QueryMap map = new QueryMap();
		map.put("url", path);
		return dao.getOne(map);
	}
}