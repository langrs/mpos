package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.RoleUserDao;
import com.site.entity.RoleUser;

/**
 * RoleUser Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class RoleUserDaoImpl extends MyBatisDaoImpl<Long, RoleUser> implements RoleUserDao {

	@Override
	public String getNamespace() {
		return RoleUser.class.getName();
	}

}