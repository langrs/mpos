package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TVipDiscDao;
import com.site.entity.TVipDisc;
import com.site.service.TVipDiscService;

/**
 * TVipDisc Service Impl层
 * 
 * @author site
 * 
 */
@Service("TVipDiscService")
public class TVipDiscServiceImpl extends AbstractManagerImpl<Long, TVipDisc> implements TVipDiscService {

	@Resource
	TVipDiscDao dao;

	@Override
	protected Dao<Long, TVipDisc> getDao() {
		return dao;
	}
}