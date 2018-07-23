package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCzcardInfoDDao;
import com.site.entity.TCzcardInfoD;
import com.site.service.TCzcardInfoDService;

/**
 * 对象功能:TCzcardInfoD Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("TCzcardInfoDService")
public class TCzcardInfoDServiceImpl extends AbstractManagerImpl<Long, TCzcardInfoD> implements TCzcardInfoDService
{
	@Resource
	TCzcardInfoDDao dao;

	@Override
	protected Dao<Long, TCzcardInfoD> getDao() {
		return dao;
	}
}
