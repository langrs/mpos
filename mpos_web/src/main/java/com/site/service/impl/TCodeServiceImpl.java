package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCodeDao;
import com.site.entity.TCode;
import com.site.service.TCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * TCode Service Impl层
 * 
 * @author site
 * 
 */
@Service("TCodeService")
public class TCodeServiceImpl extends AbstractManagerImpl<Long, TCode> implements TCodeService {

	@Resource
	TCodeDao dao;

	@Override
	protected Dao<Long, TCode> getDao() {
		return dao;
	}

	public List<TCode> queryByCodeType(List<String> codeType) {
		return dao.queryByCodeType(codeType);
	}
}