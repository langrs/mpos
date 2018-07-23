package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCouponDao;
import com.site.entity.TCoupon;

/**
 * TCoupon Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCouponDaoImpl extends MyBatisDaoImpl<Long, TCoupon> implements TCouponDao {

	@Override
	public String getNamespace() {
		return TCoupon.class.getName();
	}

}