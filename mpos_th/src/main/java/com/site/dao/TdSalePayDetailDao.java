package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TdSalePayDetail;
/**
 * 对象功能:TdSalePayDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TdSalePayDetailDao extends MyBatisDaoImpl<String, TdSalePayDetail> 
{
	@Override
	public String getNamespace() {
		return TdSalePayDetail.class.getName();
	}
}
