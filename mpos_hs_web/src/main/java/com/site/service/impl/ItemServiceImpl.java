package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.ItemDao;
import com.site.entity.Item;
import com.site.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 对象功能:Item Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("ItemService")
public class ItemServiceImpl extends AbstractManagerImpl<Long, Item> implements ItemService
{
	@Resource
	ItemDao dao;

	@Override
	protected Dao<Long, Item> getDao() {
		return dao;
	}

	public Map<String,String> queryPromName(String itemNo) {
		return dao.queryPromName(itemNo);
	}
}
