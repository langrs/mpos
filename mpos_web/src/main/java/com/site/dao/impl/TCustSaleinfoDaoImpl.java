package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCustSaleinfoDao;
import com.site.entity.TCustSaleinfo;

/**
 * TCustSaleinfo Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TCustSaleinfoDaoImpl extends MyBatisDaoImpl<Long, TCustSaleinfo> implements TCustSaleinfoDao {

	@Override
	public String getNamespace() {
		return TCustSaleinfo.class.getName();
	}

}