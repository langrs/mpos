package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TdSaleDetail;
/**
 * 对象功能:TdSaleDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TdSaleDetailDao extends MyBatisDaoImpl<String, TdSaleDetail> 
{
	@Override
	public String getNamespace() {
		return TdSaleDetail.class.getName();
	}
}
