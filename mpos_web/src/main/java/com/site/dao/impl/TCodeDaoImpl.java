package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCodeDao;
import com.site.entity.TCode;

import java.util.List;

/**
 * TCode Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCodeDaoImpl extends MyBatisDaoImpl<Long, TCode> implements TCodeDao {

	@Override
	public String getNamespace() {
		return TCode.class.getName();
	}

	public List<TCode> queryByCodeType(List<String> codeType) {
		return sqlSessionTemplate.selectList(this.getNamespace() + ".queryByCodeType",codeType);
	}
}