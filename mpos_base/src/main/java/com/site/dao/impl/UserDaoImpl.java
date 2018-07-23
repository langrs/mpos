package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.UserDao;
import com.site.entity.User;
import org.springframework.stereotype.Repository;

/**
 * User Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class UserDaoImpl extends MyBatisDaoImpl<Long, User> implements UserDao {

	@Override
	public String getNamespace() {
		return User.class.getName();
	}

}