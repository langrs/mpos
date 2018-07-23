package com.site.dao;  

import org.springframework.stereotype.Repository;  
import com.site.base.MyBatisDaoImpl;
import com.site.entity.TDataCoin;
/**
 * 对象功能:TDataCoin Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TDataCoinDao extends MyBatisDaoImpl<String, TDataCoin> 
{
	@Override
	public String getNamespace() {
		return TDataCoin.class.getName();
	}
}
