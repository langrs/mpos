package com.site.service;

import com.site.dao.TaShopInfoDao;
import com.site.dao.TdSaleDao;
import com.site.dao.TdSaleDetailDao;
import com.site.dao.TdSalePayDao;
import com.site.entity.*;
import com.site.entity.require.CardPayRequire;
import com.site.entity.require.SaleRequire;
import com.site.entity.respon.CardPayResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by langrs on 2017-03-14.
 */
@Service("SaleSrvice")
public class SaleService {
    @Resource
    TdSaleDao tdSaleDao;
    @Resource
    TdSaleDetailDao tdSaleDetailDao;
    @Resource
    TdSalePayDao tdSalePayDao;
    @Resource
    TaShopInfoDao taShopInfoDao;
    //保存销售单
    public void saleSave(SaleRequire saleRequire){
        //设置默认值
        saleDefault(saleRequire);
        TdSale tdSale = saleRequire.getTdSale();
        List<TdSaleDetail> tdSaleDetails = saleRequire.getTdSaleDetails();
        List<TdSalePay> tdSalePays = saleRequire.getTdSalePays();
        //保存销售单头
        tdSaleDao.create(tdSale);
        //保存明细
        for(TdSaleDetail tdSaleDetail:tdSaleDetails){
            tdSaleDetailDao.create(tdSaleDetail);
        }
        //保存支付
        for(TdSalePay tdSalePay:tdSalePays){
            tdSalePayDao.create(tdSalePay);
        }
        //这里欠缺返回标志的制定
    }
    //设置销售单的各项默认值
    private void saleDefault(SaleRequire saleRequire){
        TdSale tdSale = saleRequire.getTdSale();
        List<TdSaleDetail> tdSaleDetails = saleRequire.getTdSaleDetails();
        List<TdSalePay> tdSalePays = saleRequire.getTdSalePays();

        //设置表头
        String sDate = new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date());
        String saleId = UUID.randomUUID().toString();
        QueryMap queryMap = new QueryMap();
        queryMap.put("shop",tdSale.getShop());
        TaShopInfo taShopInfo = taShopInfoDao.getOne(queryMap);
        //销售id号
        tdSale.setSaleid(saleId);
        tdSale.setOrganizationno(tdSale.getShop());
        tdSale.setCompanyno(taShopInfo.getCompanyno());
        tdSale.setCnfflg("Y");
        //班别
        tdSale.setSquadno(1);
        //备注
        tdSale.setMemo("");
        //营业日期
        tdSale.setBdate(tdSale.getSdate());
        //是否实时扣减积分????
        tdSale.setWspoint("Y");
        //以下按照数据例子来回填?????????????????????
        tdSale.setIsbuffer("N");
        tdSale.setIspractice("N");
        tdSale.setProcessstatus("N");
        tdSale.setIsoffdata("N");
        //设置明细
        for(TdSaleDetail tdSaleDetail:tdSaleDetails){
            String saleDId = UUID.randomUUID().toString();
            //销售ID
            tdSaleDetail.setSaleid(saleId);
            tdSaleDetail.setSaleno(tdSale.getSaleno());
            //设置old_id
            tdSaleDetail.setOldid("00000000-0000-0000-0000-000000000000");
            //销售明细ID
            tdSaleDetail.setSaledetailid(saleDId);
            //分店
            tdSaleDetail.setShop(tdSale.getShop());
            tdSaleDetail.setOrganizationno(tdSale.getShop());
            tdSaleDetail.setCompanyno(taShopInfo.getCompanyno());
            tdSaleDetail.setPlubarcode(tdSaleDetail.getPluno());
            tdSaleDetail.setScanno(tdSaleDetail.getPluno());
            //是否扫描
            tdSaleDetail.setIsscan("N");
            //是否有效
            tdSaleDetail.setCnfflg("Y");
            //销售时间
            tdSaleDetail.setSdate(sDate.substring(0,8));
            tdSaleDetail.setStime(sDate.substring(9,15));
            //件装数默认为1
            tdSaleDetail.setMqty(1.0);
            //单位默认为PCS
            tdSaleDetail.setUnit(tdSaleDetail.getSunit());
            //单位换算比率
            tdSaleDetail.setUnitratio(1.0);
            //换算未税合计uamt????????????????????
            tdSaleDetail.setUamt(0.00);
            //库区 等同条码
            tdSaleDetail.setRarea(tdSaleDetail.getPluno());
            //营业员默认为空
            tdSaleDetail.setClerkno("");
            //资料来源 1、普通商品 2生鲜商品3削价商品4捆绑商品
            tdSaleDetail.setDatasource("1");
            //以下是未知的项目,先按照数据例子来回填??????????????????
            tdSaleDetail.setPricefactor(1);
            tdSaleDetail.setOitem(0);
        }
        //设置支付
        for(TdSalePay tdSalePay:tdSalePays){
            String salePId = UUID.randomUUID().toString();
            tdSalePay.setSalepayid(salePId);
            tdSalePay.setSaleid(saleId);
            tdSalePay.setSaleno(tdSale.getSaleno());
            //分店信息
            tdSalePay.setShop(tdSale.getShop());
            tdSalePay.setOrganizationno(tdSale.getShop());
            tdSalePay.setCompanyno(taShopInfo.getOrganizationno());
            tdSalePay.setCnfflg("Y");
            //设置icbill_id
            tdSalePay.setIcbillid("00000000-0000-0000-0000-000000000000");
            //设置Recharge_ID
            tdSalePay.setRechargeid("00000000-0000-0000-0000-000000000000");
            //销售时间
            tdSalePay.setSdate(tdSale.getSdate());
            tdSalePay.setStime(tdSale.getStime());
            //兑换比率,写死为人民币汇率
            tdSalePay.setExrate(1.0);
        }

    }
    //积分处理:type=A,amt销售金额,负数为退货,points积分金额,负数为扣减积分,saleno销售单号
    //积分处理通过webservice,所以是分布式的事务处理,必须处理好和本地的事务的协同
    private void writePoint(String type,String shop,String saleno,String cardno,Double amt,Double points){

    }
    //卡支付处理(调用webservice处理支付)
    private CardPayResult cardPay(CardPayRequire cardPayRequire){
        CardPayResult cardPayResult = new CardPayResult();
        return cardPayResult;
    }
}
