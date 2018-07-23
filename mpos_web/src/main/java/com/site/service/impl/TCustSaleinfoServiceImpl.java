package com.site.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCustSaleinfoDao;
import com.site.entity.TCustSaleinfo;
import com.site.service.TCustSaleinfoService;

/**
 * TCustSaleinfo Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCustSaleinfoService")
public class TCustSaleinfoServiceImpl extends AbstractManagerImpl<Long, TCustSaleinfo> implements TCustSaleinfoService {

	@Resource
	TCustSaleinfoDao dao;

	@Override
	protected Dao<Long, TCustSaleinfo> getDao() {
		return dao;
	}
}