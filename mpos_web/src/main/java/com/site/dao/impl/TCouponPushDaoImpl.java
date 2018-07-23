package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCouponPushDao;
import com.site.entity.TCouponPush;

/**
 * TCouponPush Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCouponPushDaoImpl extends MyBatisDaoImpl<Long, TCouponPush> implements TCouponPushDao {

	@Override
	public String getNamespace() {
		return TCouponPush.class.getName();
	}

}