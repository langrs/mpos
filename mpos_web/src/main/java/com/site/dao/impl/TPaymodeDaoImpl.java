package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TPaymodeDao;
import com.site.entity.TPaymode;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TPaymode Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TPaymodeDaoImpl extends MyBatisDaoImpl<Long, TPaymode> implements TPaymodeDao {

	@Override
	public String getNamespace() {
		return TPaymode.class.getName();
	}

	public List<TPaymode> queryRight(String userNo) {
		return sqlSessionTemplate.selectList(getNamespace() +".queryRight",userNo);
	}
}