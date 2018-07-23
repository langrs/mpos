package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TUserRoleDao;
import com.site.entity.TUserRole;

/**
 * TUserRole Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TUserRoleDaoImpl extends MyBatisDaoImpl<Long, TUserRole> implements TUserRoleDao {

	@Override
	public String getNamespace() {
		return TUserRole.class.getName();
	}

}