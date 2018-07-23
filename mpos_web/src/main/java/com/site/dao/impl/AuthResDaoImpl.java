package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.AuthResDao;
import com.site.entity.AuthRes;

/**
 * AuthRes Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class AuthResDaoImpl extends MyBatisDaoImpl<Long, AuthRes> implements AuthResDao {

	@Override
	public String getNamespace() {
		return AuthRes.class.getName();
	}

}