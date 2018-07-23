package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCustCouponDao;
import com.site.entity.TCustCoupon;
import com.site.service.TCustCouponService;

/**
 * TCustCoupon Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCustCouponService")
public class TCustCouponServiceImpl extends AbstractManagerImpl<Long, TCustCoupon> implements TCustCouponService {

	@Resource
	TCustCouponDao dao;

	@Override
	protected Dao<Long, TCustCoupon> getDao() {
		return dao;
	}
}