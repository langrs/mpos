package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCurrencyDao;
import com.site.entity.TCurrency;
import com.site.service.TCurrencyService;

/**
 * TCurrency Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCurrencyService")
public class TCurrencyServiceImpl extends AbstractManagerImpl<Long, TCurrency> implements TCurrencyService {

	@Resource
	TCurrencyDao dao;

	@Override
	protected Dao<Long, TCurrency> getDao() {
		return dao;
	}
}