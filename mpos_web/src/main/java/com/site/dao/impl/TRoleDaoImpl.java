package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TRoleDao;
import com.site.entity.TRole;

/**
 * TRole Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TRoleDaoImpl extends MyBatisDaoImpl<Long, TRole> implements TRoleDao {

	@Override
	public String getNamespace() {
		return TRole.class.getName();
	}

}