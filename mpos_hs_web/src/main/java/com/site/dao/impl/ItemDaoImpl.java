package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.ItemDao;
import com.site.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 对象功能:Item Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class ItemDaoImpl extends MyBatisDaoImpl<Long, Item> implements ItemDao
{
	@Override
	public String getNamespace() {
		return Item.class.getName();
	}

	public Map<String,String> queryPromName(String itemNo) {
		return sqlSessionTemplate.selectOne(getNamespace() + ".queryPromName",itemNo);
	}
}
