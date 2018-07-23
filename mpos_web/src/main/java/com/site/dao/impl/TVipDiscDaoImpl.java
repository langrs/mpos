package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TVipDiscDao;
import com.site.entity.TVipDisc;

/**
 * TVipDisc Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TVipDiscDaoImpl extends MyBatisDaoImpl<Long, TVipDisc> implements TVipDiscDao {

	@Override
	public String getNamespace() {
		return TVipDisc.class.getName();
	}

}