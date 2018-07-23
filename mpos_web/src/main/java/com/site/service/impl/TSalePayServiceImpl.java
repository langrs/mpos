package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TSalePayDao;
import com.site.entity.TSalePay;
import com.site.service.TSalePayService;

/**
 * TSalePay Service Impl层
 * 
 * @author site
 * 
 */
@Service("TSalePayService")
public class TSalePayServiceImpl extends AbstractManagerImpl<Long, TSalePay> implements TSalePayService {

	@Resource
	TSalePayDao dao;

	@Override
	protected Dao<Long, TSalePay> getDao() {
		return dao;
	}
}