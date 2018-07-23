package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.THycardInfoDDao;
import com.site.entity.THycardInfoD;
import com.site.service.THycardInfoDService;

/**
 * 对象功能:THycardInfoD Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("THycardInfoDService")
public class THycardInfoDServiceImpl extends AbstractManagerImpl<Long, THycardInfoD> implements THycardInfoDService
{
	@Resource
	THycardInfoDDao dao;

	@Override
	protected Dao<Long, THycardInfoD> getDao() {
		return dao;
	}
}
