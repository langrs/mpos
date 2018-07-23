package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.SystemParametersDao;
import com.site.entity.SystemParameters;

/**
 * SystemParameters Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class SystemParametersDaoImpl extends MyBatisDaoImpl<Long, SystemParameters> implements SystemParametersDao {

	@Override
	public String getNamespace() {
		return SystemParameters.class.getName();
	}

}