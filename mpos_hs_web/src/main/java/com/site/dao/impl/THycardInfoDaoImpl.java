package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.THycardInfoDao;
import com.site.entity.THycardInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 对象功能:THycardInfo Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class THycardInfoDaoImpl extends MyBatisDaoImpl<Long, THycardInfo> implements THycardInfoDao
{
	@Override
	public String getNamespace() {
		return THycardInfo.class.getName();
	}

	public List<THycardInfo> queryByBillNo(String billNo) {
		return sqlSessionTemplate.selectList(getNamespace() + ".queryByBillNo", billNo);
	}
}
