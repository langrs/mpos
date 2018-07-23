package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCouponDao;
import com.site.entity.TCoupon;
import com.site.service.TCouponService;

/**
 * TCoupon Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCouponService")
public class TCouponServiceImpl extends AbstractManagerImpl<Long, TCoupon> implements TCouponService {

	@Resource
	TCouponDao dao;

	@Override
	protected Dao<Long, TCoupon> getDao() {
		return dao;
	}
}