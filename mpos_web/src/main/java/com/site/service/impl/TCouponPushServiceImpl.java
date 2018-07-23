package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCouponPushDao;
import com.site.entity.TCouponPush;
import com.site.service.TCouponPushService;

/**
 * TCouponPush Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCouponPushService")
public class TCouponPushServiceImpl extends AbstractManagerImpl<Long, TCouponPush> implements TCouponPushService {

	@Resource
	TCouponPushDao dao;

	@Override
	protected Dao<Long, TCouponPush> getDao() {
		return dao;
	}
}