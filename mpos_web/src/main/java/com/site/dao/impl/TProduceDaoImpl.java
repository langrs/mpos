package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TProduceDao;
import com.site.entity.TProduce;

/**
 * TProduce Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TProduceDaoImpl extends MyBatisDaoImpl<Long, TProduce> implements TProduceDao {

	@Override
	public String getNamespace() {
		return TProduce.class.getName();
	}

}