package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.RoleDao;
import com.site.entity.Role;

/**
 * Role Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class RoleDaoImpl extends MyBatisDaoImpl<Long, Role> implements RoleDao {

	@Override
	public String getNamespace() {
		return Role.class.getName();
	}

}