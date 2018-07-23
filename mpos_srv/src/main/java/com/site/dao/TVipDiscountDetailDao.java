package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TVipDiscountDetail;
/**
 * 对象功能:TVipDiscountDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TVipDiscountDetailDao extends MyBatisDaoImpl<String, TVipDiscountDetail> 
{
	@Override
	public String getNamespace() {
		return TVipDiscountDetail.class.getName();
	}
}
