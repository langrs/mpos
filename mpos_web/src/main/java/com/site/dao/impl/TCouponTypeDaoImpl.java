package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCouponTypeDao;
import com.site.entity.TCouponType;

/**
 * TCouponType Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCouponTypeDaoImpl extends MyBatisDaoImpl<Long, TCouponType> implements TCouponTypeDao {

	@Override
	public String getNamespace() {
		return TCouponType.class.getName();
	}

}