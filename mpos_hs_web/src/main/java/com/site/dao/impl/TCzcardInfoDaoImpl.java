package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCzcardInfoDao;
import com.site.entity.TCzcardInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 对象功能:TCzcardInfo Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class TCzcardInfoDaoImpl extends MyBatisDaoImpl<Long, TCzcardInfo> implements TCzcardInfoDao
{
	@Resource
	protected SqlSessionTemplate sqlSessionTemplate;

	@Override
	public String getNamespace() {
		return TCzcardInfo.class.getName();
	}
	//扩展更新
	public void updateValue(TCzcardInfo tCzcardInfo) {
		sqlSessionTemplate.update(getNamespace() + ".updateValue",tCzcardInfo);
	}
}
