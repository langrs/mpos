package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.RoleResDao;
import com.site.entity.RoleRes;

/**
 * RoleRes Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class RoleResDaoImpl extends MyBatisDaoImpl<Long, RoleRes> implements RoleResDao {

	@Override
	public String getNamespace() {
		return RoleRes.class.getName();
	}

}