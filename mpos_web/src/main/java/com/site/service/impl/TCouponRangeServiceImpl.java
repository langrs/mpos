package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCouponRangeDao;
import com.site.entity.TCouponRange;
import com.site.service.TCouponRangeService;

/**
 * TCouponRange Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCouponRangeService")
public class TCouponRangeServiceImpl extends AbstractManagerImpl<Long, TCouponRange> implements TCouponRangeService {

	@Resource
	TCouponRangeDao dao;

	@Override
	protected Dao<Long, TCouponRange> getDao() {
		return dao;
	}
}