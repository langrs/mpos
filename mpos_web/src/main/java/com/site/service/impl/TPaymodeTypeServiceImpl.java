package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TPaymodeTypeDao;
import com.site.entity.TPaymodeType;
import com.site.service.TPaymodeTypeService;

/**
 * TPaymodeType Service Impl层
 * 
 * @author site
 * 
 */
@Service("TPaymodeTypeService")
public class TPaymodeTypeServiceImpl extends AbstractManagerImpl<Long, TPaymodeType> implements TPaymodeTypeService {

	@Resource
	TPaymodeTypeDao dao;

	@Override
	protected Dao<Long, TPaymodeType> getDao() {
		return dao;
	}
}