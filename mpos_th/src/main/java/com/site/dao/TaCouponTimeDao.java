package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TaCouponTime;
/**
 * 对象功能:TaCouponTime Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TaCouponTimeDao extends MyBatisDaoImpl<String, TaCouponTime> 
{
	@Override
	public String getNamespace() {
		return TaCouponTime.class.getName();
	}
}
