package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TaCouponRange;
/**
 * 对象功能:TaCouponRange Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TaCouponRangeDao extends MyBatisDaoImpl<String, TaCouponRange> 
{
	@Override
	public String getNamespace() {
		return TaCouponRange.class.getName();
	}
}
