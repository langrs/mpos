package com.site.service;

import com.site.core.base.Manager;
import com.site.core.mybatis.QueryMap;
import com.site.entity.TSale;
import com.site.entity.TSaleD;
import com.site.entity.TSalePay;

import java.util.List;
import java.util.Map;

/**
 * TSale Service 层
 * @author site
 */

public interface TSaleService extends Manager<Long, TSale>
{
	Map<String, Object> saveSaleAndDetail(TSale tsale, List<TSaleD> tSaleD, List<TSalePay> tSalePay);
	//查询销售单
	 List<TSale> querySaleByTime(QueryMap map);

}