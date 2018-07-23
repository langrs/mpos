package com.site.service.impl;  
  
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TCzcardInfoDDao;
import com.site.dao.TCzcardInfoDao;
import com.site.entity.TCzcardInfo;
import com.site.entity.TCzcardInfoD;
import com.site.service.TCzcardInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:TCzcardInfo Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("TCzcardInfoService")
public class TCzcardInfoServiceImpl extends AbstractManagerImpl<Long, TCzcardInfo> implements TCzcardInfoService
{
	@Resource
	TCzcardInfoDao dao;
	@Resource
	TCzcardInfoDDao daoD;
	@Override
	protected Dao<Long, TCzcardInfo> getDao() {
		return dao;
	}

	public void updateValue(TCzcardInfo tCzcardInfo, TCzcardInfoD tCzcardInfoD) {
		dao.updateValue(tCzcardInfo);
		daoD.create(tCzcardInfoD);
	}
}
