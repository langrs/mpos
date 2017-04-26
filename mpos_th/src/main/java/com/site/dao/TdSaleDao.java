package com.site.dao;

import com.site.base.MyBatisDaoImpl;
import com.site.entity.QueryMap;
import com.site.entity.TdSale;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 对象功能:TdSale Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository 
public class TdSaleDao extends MyBatisDaoImpl<String, TdSale> 
{
	@Override
	public String getNamespace() {
		return TdSale.class.getName();
	}
	//查询时间段内的销售单
	public List<TdSale> saleQuery(QueryMap queryMap){
		return sqlSessionTemplate.selectList(getNamespace() + ".saleQuery"  , queryMap);
	}
}
