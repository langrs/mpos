package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCouponRangeDao;
import com.site.entity.TCouponRange;

/**
 * TCouponRange Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCouponRangeDaoImpl extends MyBatisDaoImpl<Long, TCouponRange> implements TCouponRangeDao {

	@Override
	public String getNamespace() {
		return TCouponRange.class.getName();
	}

}