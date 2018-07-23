package com.site.dao.impl;

import org.springframework.stereotype.Repository;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TShopDao;
import com.site.entity.TShop;

/**
 * TShop Dao Impl层
 * 
 * @author site
 * 
 */
@Repository
public class TShopDaoImpl extends MyBatisDaoImpl<Long, TShop> implements TShopDao {

	@Override
	public String getNamespace() {
		return TShop.class.getName();
	}

}