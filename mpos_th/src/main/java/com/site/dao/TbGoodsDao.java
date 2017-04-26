package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TbGoods;
/**
 * 对象功能:TbGoods Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TbGoodsDao extends MyBatisDaoImpl<String, TbGoods> 
{
	@Override
	public String getNamespace() {
		return TbGoods.class.getName();
	}
}
