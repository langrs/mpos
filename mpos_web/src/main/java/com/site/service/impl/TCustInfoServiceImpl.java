package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCustInfoDao;
import com.site.entity.TCustInfo;
import com.site.service.TCustInfoService;

/**
 * TCustInfo Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCustInfoService")
public class TCustInfoServiceImpl extends AbstractManagerImpl<Long, TCustInfo> implements TCustInfoService {

	@Resource
	TCustInfoDao dao;

	@Override
	protected Dao<Long, TCustInfo> getDao() {
		return dao;
	}
}