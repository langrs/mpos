package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TRolePaymodeDao;
import com.site.entity.TRolePaymode;

/**
 * TRolePaymode Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TRolePaymodeDaoImpl extends MyBatisDaoImpl<Long, TRolePaymode> implements TRolePaymodeDao {

	@Override
	public String getNamespace() {
		return TRolePaymode.class.getName();
	}

}