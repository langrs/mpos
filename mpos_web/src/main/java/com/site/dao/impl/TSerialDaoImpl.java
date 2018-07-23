package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TSerialDao;
import com.site.entity.TSerial;

/**
 * TSerial Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TSerialDaoImpl extends MyBatisDaoImpl<Long, TSerial> implements TSerialDao {

	@Override
	public String getNamespace() {
		return TSerial.class.getName();
	}

}