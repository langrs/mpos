package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TPaymodeTypeDao;
import com.site.entity.TPaymodeType;

/**
 * TPaymodeType Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TPaymodeTypeDaoImpl extends MyBatisDaoImpl<Long, TPaymodeType> implements TPaymodeTypeDao {

	@Override
	public String getNamespace() {
		return TPaymodeType.class.getName();
	}

}