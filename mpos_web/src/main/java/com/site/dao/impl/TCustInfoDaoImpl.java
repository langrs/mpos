package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCustInfoDao;
import com.site.entity.TCustInfo;

/**
 * TCustInfo Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCustInfoDaoImpl extends MyBatisDaoImpl<Long, TCustInfo> implements TCustInfoDao {

	@Override
	public String getNamespace() {
		return TCustInfo.class.getName();
	}

}