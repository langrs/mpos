package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TParmDao;
import com.site.entity.TParm;

/**
 * TParm Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TParmDaoImpl extends MyBatisDaoImpl<Long, TParm> implements TParmDao {

	@Override
	public String getNamespace() {
		return TParm.class.getName();
	}

}