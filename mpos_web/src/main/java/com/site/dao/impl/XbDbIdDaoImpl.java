package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.XbDbIdDao;
import com.site.entity.XbDbId;

/**
 * XbDbId Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class XbDbIdDaoImpl extends MyBatisDaoImpl<Long, XbDbId> implements XbDbIdDao {

	@Override
	public String getNamespace() {
		return XbDbId.class.getName();
	}

}