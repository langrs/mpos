package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TPosSaleDetail;
/**
 * 对象功能:TPosSaleDetail Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TPosSaleDetailDao extends MyBatisDaoImpl<String, TPosSaleDetail> 
{
	@Override
	public String getNamespace() {
		return TPosSaleDetail.class.getName();
	}
}
