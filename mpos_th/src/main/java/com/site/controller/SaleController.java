package com.site.controller;

import com.site.dao.*;
import com.site.entity.*;
import com.site.entity.require.PreSaleRequire;
import com.site.entity.require.PreSaleRequireGoods;
import com.site.entity.require.SaleQueryRequire;
import com.site.entity.require.SaleRequire;
import com.site.entity.respon.PreSaleResult;
import com.site.entity.respon.SaleQueryResult;
import com.site.entity.respon.SaleResult;
import com.site.service.PromInfo;
import com.site.service.PromPlu;
import com.site.service.PromService;
import com.site.service.SaleService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by langrs on 2017-03-13.
 *
 */
@Controller
@RequestMapping(value = "sale/")
@Api(value = "sale", description = "移动销售相关接口")
public class SaleController {

    @Resource
    TdSaleDao tdSaleDao;
    @Resource
    TdSaleDetailDao tdSaleDetailDao;
    @Resource
    TdSalePayDao tdSalePayDao;
    @Resource
    SaleService saleService;
    @Resource
    TaShopInfoDao taShopInfoDao;
    @Resource
    TbGoodsDao tbGoodsDao;
    @Resource
    //卡资料
    TfCardTypeStatusDao tfCardTypeStatusDao;
    @Resource
    //卡信息
    TfMemberDao tfMemberDao;
    //最重要的服务促销服务
    @Resource
    PromService promService;

    @ApiOperation(value = "销售单预结算", notes = "销售单预结算", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = PreSaleResult.class)
    @RequestMapping(value = "preSale")
    @ResponseBody
    public PreSaleResult preSale(@RequestBody PreSaleRequire preSaleRequire){

        QueryMap queryMap = new QueryMap();
        PreSaleResult preSaleResult = new PreSaleResult();
        List<PromPlu> promPlus = new ArrayList<PromPlu>();
        PromInfo promInfo = new PromInfo();
        //根据销售明细来准备计算的策略
        for (PreSaleRequireGoods preSaleRequireGoods:preSaleRequire.getPreSaleRequireGoodses() ) {
            PromPlu promPlu = new PromPlu();
            //查询商品信息
            queryMap.clear();
            queryMap.put("pluno",preSaleRequireGoods.getPluno());
            queryMap.put("organizationno",preSaleRequire.getShop());
            TbGoods tbGoods = tbGoodsDao.getOne(queryMap);
            //条码*
            promPlu.setPluno(preSaleRequireGoods.getPluno());
            //品类
            promPlu.setSno(tbGoods.getSno());
            //品牌
            promPlu.setBrand(tbGoods.getBrand());
            //属性1
            promPlu.setFgroup1(tbGoods.getFgroup1());
            //属性2
            promPlu.setFgroup1(tbGoods.getFgroup2());
            //属性3
            promPlu.setFgroup1(tbGoods.getFgroup3());
            //属性4
            promPlu.setFgroup1(tbGoods.getFgroup4());
            //属性5
            promPlu.setFgroup1(tbGoods.getFgroup5());
            //属性6
            promPlu.setFgroup1(tbGoods.getFgroup6());
            //属性7
            promPlu.setFgroup1(tbGoods.getFgroup7());
            //属性8
            promPlu.setFgroup1(tbGoods.getFgroup8());
            //属性9
            promPlu.setFgroup1(tbGoods.getFgroup9());
            //项次*
            promPlu.setItem(preSaleRequireGoods.getItem());
            //原价*
            promPlu.setOldprice(preSaleRequireGoods.getOldprice());
            //数量*
            promPlu.setQty(preSaleRequireGoods.getQty());
            //专柜编码*
            promPlu.setCounterno(preSaleRequireGoods.getCounterno());
            //税号*
            promPlu.setTaxcode(tbGoods.getTaxcode());
            promPlus.add(promPlu);
        }
        promInfo.setPromPlus(promPlus);
        //分店号
        promInfo.setShop(preSaleRequire.getShop());
        promInfo.setCardno(preSaleRequire.getCardno());
        //如果有会员卡,则获取卡等级和卡种
        if(preSaleRequire.getCardno() != null && preSaleRequire.getCardno().length() > 2){
            queryMap.clear();
            queryMap.put("cardno",preSaleRequire.getCardno());
            TfCardTypeStatus tfCardTypeStatus = tfCardTypeStatusDao.getOne(queryMap);
            //卡种**
            promInfo.setCtno(tfCardTypeStatus.getCtno());
            //卡等级**
            queryMap.clear();
            queryMap.put("memberno",tfCardTypeStatus.getMemberno());
            TfMember tfMember = tfMemberDao.getOne(queryMap);
            promInfo.setMembergrade(tfMember.getMembergrade());
        }
        //准备计算的规则
        promService.readyRule(promInfo);
        //计算预结算金额
        //1.1先计算一般促销
        for (PromPlu promplu:promInfo.getPromPlus()) {

        }
        //预设数值
        preSaleResult.setStatus("0");
        preSaleResult.setErrmsg("");
        List<TdSaleDetail> tdSaleDetails = new ArrayList<TdSaleDetail>();
        for (PreSaleRequireGoods preSaleRequireGoods:preSaleRequire.getPreSaleRequireGoodses() ) {
            TdSaleDetail tdSaleDetail = new TdSaleDetail();
            tdSaleDetail.setItem(preSaleRequireGoods.getItem());
            tdSaleDetail.setPluno(preSaleRequireGoods.getPluno());
            tdSaleDetail.setOldprice(preSaleRequireGoods.getOldprice());
            tdSaleDetail.setPrice(preSaleRequireGoods.getOldprice());
            tdSaleDetail.setQty(preSaleRequireGoods.getQty());
            tdSaleDetail.setDisc(0d);
            tdSaleDetail.setAmt(preSaleRequireGoods.getQty() * preSaleRequireGoods.getOldprice());
            tdSaleDetail.setUamt(preSaleRequireGoods.getQty() * preSaleRequireGoods.getOldprice());
            tdSaleDetail.setPointqty(0d);
            tdSaleDetail.setSunit("PCS");
            tdSaleDetail.setTaxcode("101");
            tdSaleDetails.add(tdSaleDetail);
        }
        preSaleResult.setTdSaleDetails(tdSaleDetails);
        return preSaleResult;
    }

    @ApiOperation(value = "销售单保存", notes = "销售单保存", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = SaleResult.class)
    @RequestMapping(value = "sale")
    @ResponseBody
    public SaleResult sale(@RequestBody SaleRequire saleRequire){
        SaleResult saleResult = new SaleResult();
        QueryMap queryMap = new QueryMap();
        //判断是否重复提交流水
        queryMap.put("saleno",saleRequire.getTdSale().getSaleno());
        TdSale tdSale = tdSaleDao.getOne(queryMap);
        if(tdSale != null && tdSale.getSaleno().length() >2){
            saleResult.setStatus("1");
            saleResult.setErrmsg("流水号已经存在,不允许重复提交销售数据!");
            return saleResult;
        }
        saleService.saleSave(saleRequire);
        saleResult.setStatus("0");
        return saleResult;
    }

    @ApiOperation(value = "销售单查询", notes = "销售单查询", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = SaleQueryResult.class)
    @RequestMapping(value = "saleQuery")
    @ResponseBody
    public List<SaleQueryResult> saleQuery(@RequestBody SaleQueryRequire saleQuryRequire){
        QueryMap queryMap = new QueryMap();
        List<SaleQueryResult> saleQueryResults = new ArrayList<SaleQueryResult>();

        //按照销售流水号查询
        if(saleQuryRequire.getSaleno() != null && saleQuryRequire.getSaleno().length() > 5){
            queryMap.put("shop",saleQuryRequire.getShop());
            queryMap.put("saleno",saleQuryRequire.getSaleno());
            TdSale tdSale = tdSaleDao.getOne(queryMap);
            //这里如何判断返回的是无法查询到数据?
            if(tdSale == null){
                return null;
            }
            queryMap.put("saleno",tdSale.getSaleno());
            List<TdSaleDetail> tdSaleDetails = tdSaleDetailDao.getList(queryMap);
            queryMap.clear();
            queryMap.put("saleno",tdSale.getSaleno());
            List<TdSalePay> tdSalePays = tdSalePayDao.getList(queryMap);
            SaleQueryResult saleQueryResult = new SaleQueryResult();
            saleQueryResult.setTdSale(tdSale);
            saleQueryResult.setTdSaleDetails(tdSaleDetails);
            saleQueryResult.setTdSalePays(tdSalePays);
            saleQueryResults.add(saleQueryResult);
        }else{
            queryMap.put("shop",saleQuryRequire.getShop());
            queryMap.put("machine",saleQuryRequire.getMachine());
            queryMap.put("startdate",saleQuryRequire.getStartdate());
            queryMap.put("enddate",saleQuryRequire.getEnddate());
            List<TdSale> tdSales = tdSaleDao.saleQuery(queryMap);
            if(tdSales == null){
                return null;
            }
            for (TdSale tdSale:tdSales) {
                queryMap.clear();
                queryMap.put("saleno",tdSale.getSaleno());
                List<TdSaleDetail> tdSaleDetails = tdSaleDetailDao.getList(queryMap);
                queryMap.clear();
                queryMap.put("saleno",tdSale.getSaleno());
                List<TdSalePay> tdSalePays = tdSalePayDao.getList(queryMap);
                SaleQueryResult saleQueryResult = new SaleQueryResult();
                saleQueryResult.setTdSale(tdSale);
                saleQueryResult.setTdSaleDetails(tdSaleDetails);
                saleQueryResult.setTdSalePays(tdSalePays);
                saleQueryResults.add(saleQueryResult);
            }
        }

        return saleQueryResults;
    }

    //测试传输数据
//    @ApiOperation(value = "测试json传输以及地址访问", notes = "测试接口", httpMethod = "POST",
//            produces = "application/json; charset=utf-8", response = String.class)
//    @RequestMapping(value = "testSale")
//    @ResponseBody
//    public String testJson(@RequestBody String body){
        //分解json串到销售单对象中
//        SaleAll saleAll = saleExtra(body);
//
//        Gson gson = new Gson();
//        QueryMap queryMap = new QueryMap();
//        queryMap.put("saleno", "0311612171211450004");
//        TdSale tdSale = tdSaleDao.getOne(queryMap);
//        queryMap.clear();
//        queryMap.put("saleno", "0311612171211450004");
//        List<TdSaleDetail> tdSaleDetails = tdSaleDetailDao.getList(queryMap);
//        queryMap.clear();
//        queryMap.put("saleno", "0311612171211450004");
//        List<TdSalePay> tdSalePays = tdSalePayDao.getList(queryMap);
//        Map map = new HashMap();
//        map.put("TdSale", tdSale);
//        map.put("TdSaleDetail", tdSaleDetails);
//        map.put("TdSalePay", tdSalePays);
//        String rtn = gson.toJson(map);
//        return rtn;
//        return null;
//    }
    //***********************************内部函数*********************************
    //设置提交销售单保存的初始值
//    private void saleDefault(TdSale tdSale,List<TdSaleDetail> tdSaleDetails,List<TdSalePay> tdSalePays){

   //分解销售单的json到各个销售单对象中,返回合集
//    private SaleAll saleExtra(String body){
//        SaleAll saleAll = new SaleAll();
//        //分解销售单,所有的对象分部使用try来包围,防止出现没有数值的异常,例如我只是需要解析TdSale,其他不传入body
//        JSONObject json_obj = JSONObject.fromObject(body);
//        // 转换销售单
//        try {
//            JSONObject saleHead_json = json_obj.getJSONObject("TdSale");
//            //销售单主表
//            TdSale tdSale = (TdSale) JSONObject.toBean(saleHead_json, TdSale.class);
//            saleAll.setTdSale(tdSale);
//        }catch (Exception e){
//
//        }
//        //销售明细
//        try {
//            JSONArray saleDetail_json = json_obj.getJSONArray("TdSaleDetail");
//            List<TdSaleDetail> tdSaleDetails = (List<TdSaleDetail>) JSONArray.toCollection(saleDetail_json, TdSaleDetail.class);
//            saleAll.setTdSaleDetails(tdSaleDetails);
//        }catch (Exception e){
//
//        }
//
//        //销售支付
//        try {
//            JSONArray salePay_json = json_obj.getJSONArray("TdSalePay");
//            List<TdSalePay> tdSalePays = (List<TdSalePay>) JSONArray.toCollection(salePay_json, TdSalePay.class);
//            saleAll.setTdSalePays(tdSalePays);
//        }catch (Exception e){
//
//        }
//
//        return saleAll;
//    }


}
