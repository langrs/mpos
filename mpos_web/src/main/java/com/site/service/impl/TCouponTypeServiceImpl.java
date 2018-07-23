package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCouponTypeDao;
import com.site.entity.TCouponType;
import com.site.service.TCouponTypeService;

/**
 * TCouponType Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCouponTypeService")
public class TCouponTypeServiceImpl extends AbstractManagerImpl<Long, TCouponType> implements TCouponTypeService {

	@Resource
	TCouponTypeDao dao;

	@Override
	protected Dao<Long, TCouponType> getDao() {
		return dao;
	}
}