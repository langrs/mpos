package com.site.service.impl;  
  
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TNoticeDao;
import com.site.entity.TNotice;
import com.site.service.TNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:TNotice Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("TNoticeService")
public class TNoticeServiceImpl extends AbstractManagerImpl<Long, TNotice> implements TNoticeService
{
	@Resource
	TNoticeDao dao;

	@Override
	protected Dao<Long, TNotice> getDao() {
		return dao;
	}
}
