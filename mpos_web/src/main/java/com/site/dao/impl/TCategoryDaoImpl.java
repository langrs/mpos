package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCategoryDao;
import com.site.entity.TCategory;

/**
 * TCategory Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCategoryDaoImpl extends MyBatisDaoImpl<Long, TCategory> implements TCategoryDao {

	@Override
	public String getNamespace() {
		return TCategory.class.getName();
	}

}