package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.THycardInfoDao;
import com.site.entity.THycardInfo;
import com.site.service.THycardInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对象功能:THycardInfo Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("THycardInfoService")
public class THycardInfoServiceImpl extends AbstractManagerImpl<Long, THycardInfo> implements THycardInfoService
{
	@Resource
	THycardInfoDao dao;

	@Override
	protected Dao<Long, THycardInfo> getDao() {
		return dao;
	}

	public List<THycardInfo> queryByBillNo(String billNo) {
		return dao.queryByBillNo(billNo);
	}
}
