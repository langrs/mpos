package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TProduceDao;
import com.site.entity.TProduce;
import com.site.service.TProduceService;

/**
 * TProduce Service Impl层
 * 
 * @author site
 * 
 */
@Service("TProduceService")
public class TProduceServiceImpl extends AbstractManagerImpl<Long, TProduce> implements TProduceService {

	@Resource
	TProduceDao dao;

	@Override
	protected Dao<Long, TProduce> getDao() {
		return dao;
	}
}