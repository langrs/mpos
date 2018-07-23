package com.site.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.RoleResDao;
import com.site.entity.RoleRes;
import com.site.service.RoleResService;

/**
 * RoleRes Service Impl层
 * 
 * @author site
 * 
 */
@Service("RoleResService")
public class RoleResServiceImpl extends AbstractManagerImpl<Long, RoleRes> implements RoleResService {

	@Resource
	RoleResDao dao;

	@Override
	protected Dao<Long, RoleRes> getDao() {
		return dao;
	}

	@Override
	public List<RoleRes> getByRoleId(Long pk) {
		QueryMap map = new QueryMap();
		map.put("roleId", pk);
		return getList(map);
	}

	@Override
	public void deleteByRoleId(Long pk) {
		List<RoleRes> byRoleId = getByRoleId(pk);
		for (RoleRes roleRes : byRoleId) {
			dao.remove(roleRes.getId());
		}
	}
}