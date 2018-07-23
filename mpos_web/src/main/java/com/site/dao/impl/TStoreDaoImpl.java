package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TStoreDao;
import com.site.entity.TStore;

/**
 * TStore Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TStoreDaoImpl extends MyBatisDaoImpl<Long, TStore> implements TStoreDao {

	@Override
	public String getNamespace() {
		return TStore.class.getName();
	}

}