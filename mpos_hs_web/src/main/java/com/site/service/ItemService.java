package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.Item;

import java.util.Map;

/**
 * 对象功能:Item Service 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public interface ItemService extends Manager<Long, Item>
{
	Map<String,String> queryPromName(String itemNo);
}
