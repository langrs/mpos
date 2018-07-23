package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TRolePaymodeDao;
import com.site.entity.TRolePaymode;
import com.site.service.TRolePaymodeService;

/**
 * TRolePaymode Service Impl层
 * 
 * @author site
 * 
 */
@Service("TRolePaymodeService")
public class TRolePaymodeServiceImpl extends AbstractManagerImpl<Long, TRolePaymode> implements TRolePaymodeService {

	@Resource
	TRolePaymodeDao dao;

	@Override
	protected Dao<Long, TRolePaymode> getDao() {
		return dao;
	}
}