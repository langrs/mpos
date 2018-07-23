package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCompanyDao;
import com.site.entity.TCompany;
import com.site.service.TCompanyService;

/**
 * TCompany Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCompanyService")
public class TCompanyServiceImpl extends AbstractManagerImpl<Long, TCompany> implements TCompanyService {

	@Resource
	TCompanyDao dao;

	@Override
	protected Dao<Long, TCompany> getDao() {
		return dao;
	}
}