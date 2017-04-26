package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TbTaxCategory;
/**
 * 对象功能:TbTaxCategory Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TbTaxCategoryDao extends MyBatisDaoImpl<String, TbTaxCategory> 
{
	@Override
	public String getNamespace() {
		return TbTaxCategory.class.getName();
	}
}
