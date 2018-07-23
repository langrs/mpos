package com.site.service;

import com.site.dao.TPosSaleDetailDao;
import com.site.dao.TPosSaleMasterDao;
import com.site.dao.TPosSalePaymentDao;
import com.site.entity.TPosSaleDetail;
import com.site.entity.TPosSaleMaster;
import com.site.entity.TPosSalePayment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by langrs on 2016-11-14.

 */
@Service("SaleService")
public class SaleService {

    @Resource
    TPosSaleMasterDao tPosSaleMasterDao;
    @Resource
    TPosSaleDetailDao tPosSaleDetailDao;
    @Resource
    TPosSalePaymentDao tPosSalePaymentDao;

    //保存销售单
    public void saveSaleAndDetail(TPosSaleMaster tPosSaleMaster, List<TPosSaleDetail> tPosSaleDetails, List<TPosSalePayment> tPosSalePayments){
        //保存销售单头
        tPosSaleMasterDao.create(tPosSaleMaster);
        //保存销售单明细
        for(TPosSaleDetail tPosSaleDetail:tPosSaleDetails){
            tPosSaleDetailDao.create(tPosSaleDetail);
        }
        for(TPosSalePayment tPosSalePayment:tPosSalePayments){
            //保存销售单支付
            tPosSalePaymentDao.create(tPosSalePayment);
        }
    }
}
