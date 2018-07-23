package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TPosDao;
import com.site.entity.TPos;

/**
 * TPos Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TPosDaoImpl extends MyBatisDaoImpl<Long, TPos> implements TPosDao {

	@Override
	public String getNamespace() {
		return TPos.class.getName();
	}

}