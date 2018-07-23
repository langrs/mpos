package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.PosTPayflowDao;
import com.site.entity.PosTPayflow;
import com.site.service.PosTPayflowService;

/**
 * 对象功能:PosTPayflow Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("PosTPayflowService")
public class PosTPayflowServiceImpl extends AbstractManagerImpl<Long, PosTPayflow> implements PosTPayflowService
{
	@Resource
	PosTPayflowDao dao;

	@Override
	protected Dao<Long, PosTPayflow> getDao() {
		return dao;
	}
}
