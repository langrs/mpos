package com.site.dao;

import com.site.core.mybatis.Dao;
import com.site.entity.Item;

import java.util.Map;

/**
 * 对象功能:Item Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public interface ItemDao extends Dao<Long, Item> 
{
	Map<String,String> queryPromName(String itemNo);
}
