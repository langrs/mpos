package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TShopDao;
import com.site.entity.TShop;
import com.site.service.TShopService;

/**
 * TShop Service Impl层
 * 
 * @author site
 * 
 */
@Service("TShopService")
public class TShopServiceImpl extends AbstractManagerImpl<Long, TShop> implements TShopService {

	@Resource
	TShopDao dao;

	@Override
	protected Dao<Long, TShop> getDao() {
		return dao;
	}
}