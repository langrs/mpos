package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TSerialDao;
import com.site.entity.TSerial;
import com.site.service.TSerialService;

/**
 * TSerial Service Impl层
 * 
 * @author site
 * 
 */
@Service("TSerialService")
public class TSerialServiceImpl extends AbstractManagerImpl<Long, TSerial> implements TSerialService {

	@Resource
	TSerialDao dao;

	@Override
	protected Dao<Long, TSerial> getDao() {
		return dao;
	}
}