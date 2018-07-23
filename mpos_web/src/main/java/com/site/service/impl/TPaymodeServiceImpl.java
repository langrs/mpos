package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TPaymodeDao;
import com.site.entity.TPaymode;
import com.site.service.TPaymodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * TPaymode Service Impl层
 * 
 * @author site
 * 
 */
@Service("TPaymodeService")
public class TPaymodeServiceImpl extends AbstractManagerImpl<Long, TPaymode> implements TPaymodeService {

	@Resource
	TPaymodeDao dao;

	@Override
	protected Dao<Long, TPaymode> getDao() {
		return dao;
	}

	public List<TPaymode> queryRight(String userNo) {
		return dao.queryRight(userNo);
	}
}