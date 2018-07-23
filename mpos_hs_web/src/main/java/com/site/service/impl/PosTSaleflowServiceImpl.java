package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.PosTSaleflowDao;
import com.site.entity.PosTSaleflow;
import com.site.service.PosTSaleflowService;

/**
 * 对象功能:PosTSaleflow Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("PosTSaleflowService")
public class PosTSaleflowServiceImpl extends AbstractManagerImpl<Long, PosTSaleflow> implements PosTSaleflowService
{
	@Resource
	PosTSaleflowDao dao;

	@Override
	protected Dao<Long, PosTSaleflow> getDao() {
		return dao;
	}
}
