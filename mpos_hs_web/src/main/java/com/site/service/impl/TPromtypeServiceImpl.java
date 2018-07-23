package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TPromtypeDao;
import com.site.entity.TPromtype;
import com.site.service.TPromtypeService;

/**
 * 对象功能:TPromtype Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("TPromtypeService")
public class TPromtypeServiceImpl extends AbstractManagerImpl<Long, TPromtype> implements TPromtypeService
{
	@Resource
	TPromtypeDao dao;

	@Override
	protected Dao<Long, TPromtype> getDao() {
		return dao;
	}
}
