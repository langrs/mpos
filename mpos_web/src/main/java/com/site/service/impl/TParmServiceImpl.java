package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TParmDao;
import com.site.entity.TParm;
import com.site.service.TParmService;

/**
 * TParm Service Impl层
 * 
 * @author site
 * 
 */
@Service("TParmService")
public class TParmServiceImpl extends AbstractManagerImpl<Long, TParm> implements TParmService {

	@Resource
	TParmDao dao;

	@Override
	protected Dao<Long, TParm> getDao() {
		return dao;
	}
}