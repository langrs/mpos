package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.base.IdGenerator;
import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.dao.TSaleDao;
import com.site.entity.TSale;
import com.site.entity.TSaleD;
import com.site.entity.TSalePay;
import com.site.service.TSaleDService;
import com.site.service.TSalePayService;
import com.site.service.TSaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * TSale Service Impl层
 * 
 * @author site
 * 
 */
@Service("TSaleService")
public class TSaleServiceImpl extends AbstractManagerImpl<Long, TSale> implements TSaleService {

	@Resource
	TSaleDao dao;

	@Resource
	public IdGenerator idGenerator;
	
	@Resource
	public TSaleDService tSaleDService;
	
	@Resource
	public TSalePayService tSalePayService;
	
	@Override
	protected Dao<Long, TSale> getDao() {
		return dao;
	}

	public Map<String, Object> saveSaleAndDetail(TSale tSale, List<TSaleD> tSaleDList,List<TSalePay> tSalePayList) {
		String id= null;
		String id_d = null;
		String id_p = null;
		Date saleDate;
		String saleNo;
		id = idGenerator.getSuid();

		tSale.setId(id);
//		判断非空内容
		//sale
		if(tSale.getIsTrain() == null){
			tSale.setIsTrain("0");
		}
		if (tSale.getOriginalAmt() == null){
			tSale.setOriginalAmt(0D);			
		}
		if(tSale.getSaleAmt() == null){
			tSale.setSaleAmt(0D);
		}
		if(tSale.getPayAmt() == null){
			tSale.setPayAmt(0D);
		}
		if(tSale.getDiscAmt() == null){
			tSale.setDiscAmt(0D);
		}
		if(tSale.getChangeAmt() == null){
			tSale.setChangeAmt(0D);
		}
		if(tSale.getExcessAmt() == null){
			tSale.setExcessAmt(0D);
		}
//		上传标志
		tSale.setUpFlag("0");
		//saleD
		saleDate = tSale.getSaleDate();
		saleNo = tSale.getSaleNo();
		for (TSaleD saleD : tSaleDList){
			id_d = idGenerator.getSuid();
			saleD.setId(id_d);
			saleD.setSaleId(id);
			saleD.setSaleDate(saleDate);
			saleD.setSaleNo(saleNo);
			saleD.setShopId(tSale.getShopId());
			saleD.setCompanyId(tSale.getCompanyId());
			saleD.setUpFlag("0");
			if(saleD.getRetAmt() == null){
				saleD.setRetAmt(0D);
			}
			//更新saled
			tSaleDService.create(saleD);
		}
		//saleP
		for(TSalePay tSalePay:tSalePayList){
			id_p = idGenerator.getSuid();
			tSalePay.setId(id_p);
			tSalePay.setSaleId(id);
			tSalePay.setSaleNo(saleNo);
			tSalePay.setSaleDate(saleDate);
			tSalePay.setShopId(tSale.getShopId());
			tSalePay.setUpFlag("0");
			tSalePayService.create(tSalePay);
		}
		//更新sale
		this.create(tSale);
		
		return null;
	}
	//按照条件查询销售单
	public List<TSale> querySaleByTime(QueryMap map) {
		return dao.querySaleByTime(map);
	}
}