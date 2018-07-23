package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TUserDao;
import com.site.entity.TUser;

/**
 * TUser Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TUserDaoImpl extends MyBatisDaoImpl<Long, TUser> implements TUserDao {

	@Override
	public String getNamespace() {
		return TUser.class.getName();
	}

}