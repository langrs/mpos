package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TRoleRightDao;
import com.site.entity.TRoleRight;

/**
 * TRoleRight Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TRoleRightDaoImpl extends MyBatisDaoImpl<Long, TRoleRight> implements TRoleRightDao {

	@Override
	public String getNamespace() {
		return TRoleRight.class.getName();
	}

}