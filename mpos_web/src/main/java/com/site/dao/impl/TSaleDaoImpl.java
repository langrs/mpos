package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.core.mybatis.QueryMap;
import com.site.dao.TSaleDao;
import com.site.entity.TSale;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TSale Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TSaleDaoImpl extends MyBatisDaoImpl<Long, TSale> implements TSaleDao {

	@Override
	public String getNamespace() {
		return TSale.class.getName();
	}

	public List<TSale> querySaleByTime(QueryMap map) {
		List<TSale> tSales = this.sqlSessionTemplate.selectList("com.site.entity.TSale.querySaleByTime",map);
		return tSales;
	}
}