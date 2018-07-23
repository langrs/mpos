package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TRightDao;
import com.site.entity.TRight;

/**
 * TRight Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TRightDaoImpl extends MyBatisDaoImpl<Long, TRight> implements TRightDao {

	@Override
	public String getNamespace() {
		return TRight.class.getName();
	}

}