package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCustCouponDao;
import com.site.entity.TCustCoupon;

/**
 * TCustCoupon Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCustCouponDaoImpl extends MyBatisDaoImpl<Long, TCustCoupon> implements TCustCouponDao {

	@Override
	public String getNamespace() {
		return TCustCoupon.class.getName();
	}

}