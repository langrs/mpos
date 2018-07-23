package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TStorePosDao;
import com.site.entity.TStorePos;

/**
 * TStorePos Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TStorePosDaoImpl extends MyBatisDaoImpl<Long, TStorePos> implements TStorePosDao {

	@Override
	public String getNamespace() {
		return TStorePos.class.getName();
	}

}