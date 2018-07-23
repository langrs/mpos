package com.site.webService.impl;

import com.site.core.mybatis.QueryMap;
import com.site.entity.*;
import com.site.service.*;
import com.site.util.JsonUtil;
import com.site.webService.PosWebService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by langrs on 2016-07-06.
 *
 */
@WebService
public class PosWebServiceImpl implements PosWebService {
    @Resource
    THycardInfoService tHycardInfoService;
    @Resource
    THycardInfoDService tHycardInfoDService;
    @Resource
    TCzcardInfoService tCzcardInfoService;
    @Resource
    TGiftcouponGoodsService tGiftcouponGoodsService;
    @Resource
    ItemService itemService;
    @Resource
    TPromtypeService promtypeService;
    @Resource
    PosTSaleflowService posTSaleflowService;
    @Resource
    PosTPayflowService posTPayflowService;
    @Resource
    TCzcardInfoDService tCzcardInfoDService;

    @Resource
    CouponService couponService;

    //获取商品名称(包含了促销名称)
    public String queryPromName(@WebParam(name="itemNo") String itemNo) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
//        logger.info("queryPromName查询=>" + "itemNo:" + itemNo );

        Map<String,String> map =  itemService.queryPromName(itemNo);
        if(map != null){
//            logger.info("queryPromName返回=>" +  map.get("display_flag") + map.get("promname") );
            if(!map.get("promflag").trim().equals("0") ) {
                return map.get("display_flag") + map.get("promname");
            }else{
                return map.get("display_flag") ;
            }
        }else{
            return null;
        }
    }

    public String vipQuery(@WebParam(name="cdinfo")String cdinfo, @WebParam(name="billno")String billno, @WebParam(name="shopId")String shopId) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("vipQuery会员卡查询=>" + "cdinfo:" + cdinfo + "; billno:" + billno + "; shopId:" + shopId);
        String rtn = "";
        ResultMap<THycardInfo> resultMap = new ResultMap<THycardInfo>();
        if(cdinfo != null && cdinfo.length() > 0){
            QueryMap queryMap = new QueryMap();
            queryMap.put("mkcode",cdinfo);
            THycardInfo tHycardInfo = tHycardInfoService.getOne(queryMap);
            resultMap.setStatus("0");
            resultMap.setErrorMsg("");
            resultMap.setData(tHycardInfo);
            rtn = JsonUtil.objectToString(null, resultMap);
            logger.info("会员查询，返回值=>" + rtn);
            return rtn;
        }
        else if(billno != null && billno.length() > 0){
            List<THycardInfo> list = tHycardInfoService.queryByBillNo(billno);
            //只取第一个记录
            if(list.size() > 0){
                THycardInfo tHycardInfo = (THycardInfo) list.get(0);
                resultMap.setStatus("0");
                resultMap.setErrorMsg("");
                resultMap.setData(tHycardInfo);
                rtn = JsonUtil.objectToString(null, resultMap);
                logger.info("会员查询，返回值=>" + rtn);
                return rtn;
            }
        }
        resultMap.setStatus("1");
        resultMap.setErrorMsg("无法查询到记录");
        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("会员查询，返回值=>" + rtn);
        return  rtn;
    }

    public String czkQuery(@WebParam(name="cdinfo")String cdinfo, @WebParam(name="shopId")String shopId) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("czkQery储值卡查询=>" + "cdinfo:" + cdinfo +"; shopId:" + shopId);
        String rtn = "";
        ResultMap<TCzcardInfo> resultMap = new ResultMap<TCzcardInfo>();
        QueryMap queryMap = new QueryMap();
        queryMap.put("mkcode",cdinfo);
        TCzcardInfo tCzcardInfo = tCzcardInfoService.getOne(queryMap);
        if(tCzcardInfo != null){
            resultMap.setStatus("0");
            resultMap.setErrorMsg("");
            resultMap.setData(tCzcardInfo);

        }else{
            resultMap.setStatus("1");
            resultMap.setErrorMsg("无法查询到记录");
        }
        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("储值卡查询，返回值=>" + rtn);
        return rtn;
    }

    public String couponQuery(@WebParam(name = "couponNo") String couponNo) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("couponQuery券查询=>" + "couponNo:" + couponNo );
        String rtn = "";
        String errMsg ="";
        ResultMap<Coupon> resultMap = new ResultMap<Coupon>();
        QueryMap queryMap = new QueryMap();
        queryMap.put("salecode",couponNo);
        TGiftcouponGoods tGiftcouponGoods = tGiftcouponGoodsService.getOne(queryMap);
        if(tGiftcouponGoods != null){
            if(tGiftcouponGoods.getGiftflag() != null ){
                switch (tGiftcouponGoods.getGiftflag()){
                    case 1:
                        errMsg = "礼券已经过期";
                        break;
                    case 2:
                        errMsg ="礼券已经作废";
                        break;
                    case 3:
                        errMsg = "该礼券已消费";
                        break;
                    default:
                }
                if(errMsg.length() > 2){
                    resultMap.setStatus("1");
                    resultMap.setErrorMsg(errMsg);
                }else{
                    resultMap.setStatus("0");
                    resultMap.setErrorMsg("");
                    //由于原来的接口错误,所以这里转换成TGiftcoupon来返回,原来是不用转的
                    Coupon coupon = new Coupon();
                    coupon.setCouponNo(tGiftcouponGoods.getSalecode());
                    coupon.setCouponValue(tGiftcouponGoods.getGiftsum());
                    coupon.setEndDate(tGiftcouponGoods.getValidity());
                    coupon.setGifttype(tGiftcouponGoods.getGifttype());
                    resultMap.setData(coupon);
                }
            }
        }else{
            resultMap.setStatus("1");
            resultMap.setErrorMsg("无法找到记录");
        }
        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("couponQuery券查询,返回值=>" + rtn);
        return rtn;
    }
    //预结算
    public String preSale(@WebParam(name="saleInfo") String saleInfo) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("preSale预结算查询=>" + "saleInfo:" + saleInfo );
        String rtn = "";
        //积分合计
        double points = 0D;
        QueryMap queryMap = new QueryMap();
        ResultMap<List<PreSaleItemInfo>> resultMap = new ResultMap<List<PreSaleItemInfo>>();
        JSONObject json_obj = JSONObject.fromObject(saleInfo);
        // 转换销售单
        JSONObject headInfo_json = json_obj.getJSONObject("headInfo");
        PreSaleHeadInfo preSaleHeadInfo = (PreSaleHeadInfo) JSONObject.toBean(headInfo_json, PreSaleHeadInfo.class);
        // 转换销售单明细
        JSONArray saleD_json = json_obj.getJSONArray("itemInfo");
        List<PreSaleItemInfo> preSaleItemInfoList = (List<PreSaleItemInfo>) JSONArray.toCollection(saleD_json, PreSaleItemInfo.class);

        //处理空字段
        if(preSaleHeadInfo.getVipType() == null){
            preSaleHeadInfo.setVipType("88");
        }
        //获取商品的促销信息
        if(preSaleHeadInfo == null || preSaleItemInfoList == null){
            resultMap.setStatus("1");
            resultMap.setErrorMsg("传入数据有误!");
        }else{
            List<PreSaleItemInfo> list = new ArrayList<PreSaleItemInfo>();
            //获取促销信息
            for(PreSaleItemInfo preSaleItemInfo:preSaleItemInfoList){
                //条码
                String itemId = preSaleItemInfo.getItemId();

                //销售数量
                double saleNum = preSaleItemInfo.getSaleNum();
                //原售价
                double salePrice = preSaleItemInfo.getSalePrice();
                //原售价合计
                double oldSalePrice = salePrice * saleNum;
                //折后单价
                double salePriceReal = 0D;
                //会员卡打折率
                double disc = 0D;
                //会员卡积分比率,正常和促销积分比率
                double jfbl = 0D;
                //积分倍率:金卡1.5倍积分;铂金卡2倍积分
                double bl = 1D;

                //商品积分
                double point = 0D;
                //满减金额
                double minus = 0D;

                
                queryMap.put("itemNo",itemId);
                Item item = itemService.getOne(queryMap);
                String promType = item.getPromtype();
                //是否允许折上折:1为允许0禁止会员折上折
                String changepxFlag = item.getChangepxFlag();

                //获取促销类型表
                queryMap.clear();
                queryMap.put("promtype",promType);
                TPromtype tPromtype = promtypeService.getOne(queryMap);
                //促销类型的促销力度
                double promvalue = tPromtype.getPromvalue();
                //促销类型的促销基数
                double base = tPromtype.getBase();
                //打折,1元当N元花
                if(tPromtype.getPromflag().trim().equals("6")){
                    //计算优惠金额
                    //促销打折率
                    preSaleItemInfo.setPromDisc(promvalue);
                    //促销打折金额
                    preSaleItemInfo.setPromDiscAmt(roundVal(oldSalePrice*(1 - promvalue/100)));
                    //折后单价
                    preSaleItemInfo.setSalePriceReal(roundVal(oldSalePrice*promvalue/100));
                }else if(tPromtype.getPromflag().trim().equals("7")){

                    minus = Math.floor(oldSalePrice/base) * promvalue;
                    preSaleItemInfo.setReduceAmt(roundVal(minus));
                }

                //先设置会员的默认值
                double allDistAmt = 0D;
                preSaleItemInfo.setVipDisc(100d);
                preSaleItemInfo.setVipDiscAmt(0d);
                //刷会员卡,计算会员卡折扣,计算积分
                if(!preSaleHeadInfo.getVipType().equals("")  && !preSaleHeadInfo.getVipType().equals("88") ) {
                    //会员折扣计算============================================================
                    //如果非促销商品,可以享受会员卡打折率
                    if(preSaleItemInfo.getPromDisc() == 0 && changepxFlag.equals("1")){
                        if (preSaleHeadInfo.getVipType().trim().equals("01")) {
                            //普卡
                            disc = item.getPkzk();
                        } else if (preSaleHeadInfo.getVipType().trim().equals("02") || preSaleHeadInfo.getVipType().trim().equals("05")) {
                            disc = item.getJkzk();
                        }
                        preSaleItemInfo.setVipDisc(disc);
                        preSaleItemInfo.setVipDiscAmt((oldSalePrice * (100 - disc) * 0.01));
                    }
                    //会员积分计算=============================================================
                    //积分比率
                    if(tPromtype.getPromflag().trim().equals( "0") ){
                        jfbl = item.getZcjfbl();
                    }else{
                        jfbl = item.getCxjfbl();
                    }
                    //按照会员等级来设定积分倍数
                    if(preSaleHeadInfo.getVipType().equals("01")){
                        //普卡
                        bl = 1D;
                    }else if(preSaleHeadInfo.getVipType().equals("02")){
                        //金卡
                        bl = 1.5D;
                    }else if(preSaleHeadInfo.getVipType().equals("05")){
                        bl = 2D;
                    }
                    //商品积分
                    if(jfbl !=0 ){
                        //这里计算积分的时候,去除原有的折扣,按照实收金额来计算
                        Double tmp = preSaleItemInfo.getReduceAmt() + preSaleItemInfo.getVipDiscAmt() + preSaleItemInfo.getPromDiscAmt();
                        point = Math.round(oldSalePrice - tmp)/jfbl * bl;
                        preSaleItemInfo.setPoints(roundVal(point));
                        points = points + point;
                    }else{
                        preSaleItemInfo.setPoints(0D);
                    }
                }//刷会员卡,计算会员卡折扣,计算积分结束


                //统计总优惠金额和实收销售金额
                allDistAmt = preSaleItemInfo.getReduceAmt() + preSaleItemInfo.getVipDiscAmt() + preSaleItemInfo.getPromDiscAmt();
                preSaleItemInfo.setAllDistAmt(allDistAmt);
                preSaleItemInfo.setItemSaleAmt(oldSalePrice - allDistAmt);
            }
            //退货单需要判断是否积分够扣减
            if(preSaleHeadInfo.getDealType().trim().equals("02") && points != 0D){
                queryMap.clear();
                queryMap.put("ckcode",preSaleHeadInfo.getVipNo());
                THycardInfo tHycardInfo = tHycardInfoService.getOne(queryMap);
                double cardJf = tHycardInfo.getCardjf();
                if(cardJf < Math.abs(points)){
                    resultMap.setStatus("1");
                    resultMap.setErrorMsg("卡内积分不足,不允许退货");
                }
            }else{
                resultMap.setStatus("0");
                resultMap.setErrorMsg("");
                resultMap.setData(preSaleItemInfoList);
            }
        }

        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("preSale预结算,返回值=>" + rtn);
        return rtn;
    }
    //结算
    public String sale(String saleInfo) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("Sale结算查询=>" + "saleInfo:" + saleInfo );
        String rtn = "";
        QueryMap queryMap = new QueryMap();
        ResultMap<SaleResult> resultMap = new ResultMap<SaleResult>();
        JSONObject json_obj = JSONObject.fromObject(saleInfo);
        // 转换销售单
        JSONObject saleHead_json = json_obj.getJSONObject("saleHead");
        TSale tSale = (TSale) JSONObject.toBean(saleHead_json, TSale.class);
        // 转换销售单明细
        JSONArray saleD_json = json_obj.getJSONArray("saleDetail");
        List<TSaleD> tSaleDList = (List<TSaleD>) JSONArray.toCollection(saleD_json, TSaleD.class);
        //转换支付方式明细
        JSONArray salePay_json = json_obj.getJSONArray("salePay");
        List<TSalePay> tSalePayList = (List<TSalePay>) JSONArray.toCollection(salePay_json, TSalePay.class);
        //判断是否流水号已经存在
        queryMap.put("flowNo",tSale.getSaleNo());
        PosTSaleflow posTSaleflow = posTSaleflowService.getOne(queryMap);
        if(posTSaleflow != null){
            resultMap.setStatus("2");
            resultMap.setErrorMsg("流水号已经存在!");
        }else{
            //判断支付方式
            for(TSalePay tSalePay:tSalePayList){
                String paymodeId = tSalePay.getPaymodeId().trim();
                //这个时候还没有转为字母类型
                if(paymodeId.equals("5")){
                    //储值卡
                    queryMap.clear();
                    queryMap.put("ckcode",tSalePay.getBillNo());
                    TCzcardInfo tCzcardInfo = tCzcardInfoService.getOne(queryMap);
                    if(tCzcardInfo.getCardvalue() != null && tCzcardInfo.getCardvalue() < tSalePay.getPayAmt()){
                        resultMap.setStatus("1");
                        resultMap.setErrorMsg("储值卡卡号:" + tSalePay.getBillNo()+ "余额不足!");
                        break;
                    }
                    tCzcardInfo.setCardvalue(tCzcardInfo.getCardvalue() -  tSalePay.getPayAmt());
                    tCzcardInfo.setCardvalueXfLast(tSalePay.getPayAmt());
                    tCzcardInfo.setCardvalueXf(tCzcardInfo.getCardvalueXf() + tSalePay.getPayAmt());
                    tCzcardInfo.setCardvalueXfLastdate(new Date());
                    tCzcardInfoService.update(tCzcardInfo);
                    TCzcardInfoD tCzcardInfoD = new TCzcardInfoD();
                    tCzcardInfoD.setOpdate(new Date());
                    //设置日期格式
                    SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
                    tCzcardInfoD.setOpdatechar(df.format(new Date()));
                    tCzcardInfoD.setCkcode(tCzcardInfo.getCkcode());
                    tCzcardInfoD.setBillno(tSale.getSaleNo());
                    tCzcardInfoD.setCardvalue( - tSalePay.getPayAmt());
                    //操作类型01消费
                    tCzcardInfoD.setOptype("01");
                    tCzcardInfoDService.create(tCzcardInfoD);
                }else if(paymodeId.equals("7") || paymodeId.equals("8")){
                    //礼券,折扣券
                    queryMap.clear();
                    queryMap.put("salecode",tSalePay.getBillNo());
                    TGiftcouponGoods tGiftcouponGoods = tGiftcouponGoodsService.getOne(queryMap);
                    if(tGiftcouponGoods != null && tGiftcouponGoods.getGiftflag() != null ){
                        //销售单,则券状态必须是未消费,退货单券状态必须是已经消费
                        if(tSale.getDealType().equals("01")){ //销售
                            if(tGiftcouponGoods.getGiftflag() != 0){
                                resultMap.setStatus("1");
                                resultMap.setErrorMsg("券号:" + tSalePay.getBillNo()+ "状态无效!");
                                break;
                            }else{
                                tGiftcouponGoods.setGiftflag(3);
                                tGiftcouponGoods.setSaleno(tSale.getSaleNo());
                            }
                        }else{ // 退货
                            tGiftcouponGoods.setGiftflag(0);
                            tGiftcouponGoods.setSaleno("");
                        }
                        //更新券状态
                        tGiftcouponGoodsService.update(tGiftcouponGoods);
                    }else{
                        resultMap.setStatus("1");
                        resultMap.setErrorMsg("券号:" + tSalePay.getBillNo()+ "状态无效!");
                        break;
                    }

                }
            }
            //积分保存
            if(tSale.getSalePoints() != 0D){
                queryMap.clear();
                queryMap.put("ckcode",tSale.getVipNo());
                THycardInfo tHycardInfo = tHycardInfoService.getOne(queryMap);
                //同仁堂demo设置
                if(tHycardInfo != null) {
                    tHycardInfo.setCardjf(tHycardInfo.getCardjf() + tSale.getSalePoints());
                    tHycardInfo.setXfcs(tHycardInfo.getXfcs() + 1);
                    tHycardInfo.setCardjfTotal(tHycardInfo.getCardjfTotal() + tSale.getSalePoints());
                    tHycardInfo.setCardjfLast(tSale.getSalePoints());
                    tHycardInfo.setCardjfLastdate(new Date());
                    tHycardInfo.setSaleamount(tHycardInfo.getSaleamount() + tSale.getSaleAmt());
                    tHycardInfo.setCardstatus("06");
                    //更新会员卡信息
                    tHycardInfoService.update(tHycardInfo);
                    THycardInfoD tHycardInfoD = new THycardInfoD();
                    tHycardInfoD.setOpdate(new Date());
                    SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
                    tHycardInfoD.setOpdatechar(df.format(new Date()));
                    tHycardInfoD.setBillno(tSale.getSaleNo());
                    tHycardInfoD.setSaleamount(tSale.getSaleAmt());
                    tHycardInfoD.setCkcode(tSale.getVipNo());
                    tHycardInfoD.setCardtype("01");
                    tHycardInfoD.setOptype("01");
                    tHycardInfoD.setMkcode(tSale.getVipNo());
                    tHycardInfoD.setJf(tSale.getSalePoints());
                    //插入会员卡消费明细记录
                    tHycardInfoDService.create(tHycardInfoD);
                }
            }
            //交易类型:销售/退货
            String sellWay;
            //退货也是正数
            int fh =1 ;

            if(tSale.getDealType().trim().equals("01")){
                sellWay = "A";
                fh = 1;
            }else{
                sellWay = "B";
                fh = -1;
            }
            //保存消费记录明细
            for(TSaleD tSaleD:tSaleDList){

                posTSaleflow = new PosTSaleflow();
                posTSaleflow.setFlowId(Double.parseDouble(tSaleD.getRowNo()));
                posTSaleflow.setFlowNo(tSale.getSaleNo());
                posTSaleflow.setBranchNo("00");
                posTSaleflow.setItemNo(tSaleD.getItemId());
                //是否存在四舍五入的问题
                posTSaleflow.setSourcePrice(tSaleD.getSalePrice());
                //销售单价
                posTSaleflow.setSalePrice(tSaleD.getItemSaleAmt()/tSaleD.getSaleNum());
                posTSaleflow.setSaleQnty(tSaleD.getSaleNum()*fh);
                posTSaleflow.setSaleMoney(tSaleD.getItemSaleAmt()*fh);
                posTSaleflow.setSellWay(sellWay);
                posTSaleflow.setOperId(tSale.getUserId());
                posTSaleflow.setSaleMan("9999");
                posTSaleflow.setCounterNo("9999");
                posTSaleflow.setOperDate(new Date());
                posTSaleflow.setRemoteFlag("0");
//                posTSaleflow.setPromtype(tSaleD.getPromTypeId());
                //设置促销方式,当场从item从获取吧
                queryMap.clear();
                queryMap.put("itemNo",tSaleD.getItemNo());
                Item item = itemService.getOne(queryMap);
                if(item != null){
                    posTSaleflow.setPromtype(item.getPromtype());
                }
                posTSaleflow.setPresentflag("0");
                posTSaleflow.setCashflag("0");
                //打折率只体现会员卡打折率
                //重要:如果getPromDiscAmt有值,则为1换几的打折
                if(tSaleD.getPromDiscAmt() != null && tSaleD.getPromDiscAmt() != 0 ){
                    posTSaleflow.setDiscount(tSaleD.getPromDisc());
                    posTSaleflow.setDiscounttype("3");
                }else{
                    if(tSaleD.getVipDiscAmt() != null && tSaleD.getVipDiscAmt() != 0){
                        posTSaleflow.setDiscount(tSaleD.getVipDisc());
                        posTSaleflow.setDiscounttype("1");
                    }
                }

                posTSaleflowService.create(posTSaleflow);
            }
            for(TSalePay tSalePay:tSalePayList){
                PosTPayflow posTPayflow = new PosTPayflow();
                posTPayflow.setFlowId(Double.parseDouble(tSalePay.getRowNo()));
                posTPayflow.setFlowNo(tSale.getSaleNo());
                posTPayflow.setSaleAmount(tSale.getSaleAmt()*fh);
                posTPayflow.setBranchNo("00");
                //转换支付方式
                posTPayflow.setPayWay(changePaymodeId(tSalePay.getPaymodeId()));
                posTPayflow.setSellWay(sellWay);
                posTPayflow.setCardNo(tSalePay.getBillNo());
                posTPayflow.setVipNo(tSale.getVipNo());
                posTPayflow.setCoinNo("RMB");
                posTPayflow.setCoinRate(1D);
                posTPayflow.setPayAmount(tSalePay.getPayAmt()*fh);
                posTPayflow.setOperDate(new Date());
                posTPayflow.setOperId(tSale.getUserId());
                posTPayflow.setCounterNo("9999");
                posTPayflow.setSaleMan("9999");
                if(sellWay.equals("B")){
                    posTPayflow.setMemo("退货");
                }
                posTPayflow.setExchangeFlag("0");
                posTPayflowService.create(posTPayflow);
            }
            resultMap.setStatus("0");
            resultMap.setErrorMsg("");
            SaleResult saleResult = new SaleResult();
            SaleResultHeadInfo saleResultHeadInfo = new SaleResultHeadInfo();
            saleResultHeadInfo.setSaleNo(tSale.getSaleNo());
            saleResultHeadInfo.setSaleDate(new Date());
            saleResultHeadInfo.setSalePoints(tSale.getSalePoints());
            saleResultHeadInfo.setOriginalPoints(tSale.getOriginalPoints());
            saleResult.setSaleResultHeadInfo(saleResultHeadInfo);
            resultMap.setData(saleResult);
        }

        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("sale结算,返回值=>" + rtn);
        return rtn;
    }
    //销售单返券
    public String makeCoupon(String userNo, String saleNo) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("makeCoupon销售返券=>" + "userNo:" + userNo + "; saleNo:" + saleNo );
        String rtn = "";
        ResultMap<Coupon> resultMap = new ResultMap<Coupon>();
        Coupon coupon = couponService.makeCoupon(userNo,saleNo);
        if(coupon != null){
            resultMap.setStatus("0");
            resultMap.setData(coupon);
        }else{
            resultMap.setStatus("1");
            resultMap.setErrorMsg("无法返券");
        }
        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("makeCoupon销售返券,返回值=>" + rtn);
        return rtn;
    }
    //积分返利
    public String makeJffl(String ckcode, String cardtype, String userNo, double cardjf, double kjjf, double flje) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("makeJffl积分返利=>" + "ckcode:" + ckcode + "; cardtype:" + cardtype + "; userNo:" + userNo + ";cardjf" + cardjf + ";kjjf:" + kjjf + ";flje:" + flje);
        String rtn = "";
        ResultMap<Coupon> resultMap = new ResultMap<Coupon>();
        Coupon coupon = couponService.makeJffl(ckcode,cardtype,userNo,cardjf,kjjf,flje);
        if(coupon != null){
            resultMap.setStatus("0");
            resultMap.setData(coupon);
        }else{
            resultMap.setStatus("1");
            resultMap.setErrorMsg("无法返券");
        }
        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("makeJffl积分返利,返回值=>" + rtn);
        return rtn;
    }
    //积分返利预查询
    public String queryJffl(String cdinfo, String billno, String shopId) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("queryJffl积分返利预查询=>" + "cdinfo:" + cdinfo + "; billno:" + billno + "; shopId:" + shopId);
        String rtn = "";
        ResultMap<JfflResult> resultMap = new ResultMap<JfflResult>();
        JfflResult jfflResult = couponService.queryJffl(cdinfo,billno,shopId);
        if(jfflResult != null){
            resultMap.setStatus("0");
            resultMap.setData(jfflResult);
        }else{
            resultMap.setStatus("1");
            resultMap.setErrorMsg("查询失败");
        }
        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("queryJffl积分返利预查询,返回值=>" + rtn);
        return rtn;

    }

    public String getRtnRight(String userNo, String passwd) {
        Logger logger = Logger.getLogger(PosWebServiceImpl.class);
        logger.info("getRtnRight退货鉴权查询=>" + "userNo:" + userNo + "; passwd:" + passwd);
        String rtn = "";
        ResultMap<String> resultMap = new ResultMap<String>();

        String rights =  couponService.getRtnRight(userNo,passwd);
        if (rights != null){
            resultMap.setStatus("0");
            resultMap.setData(rights);
        }else{
            resultMap.setStatus("1");
            resultMap.setErrorMsg("鉴权失败");
        }
        rtn = JsonUtil.objectToString(null, resultMap);
        logger.info("getRtnRight退货鉴权查询,返回值=>" + rtn);
        return rtn;
    }
    //四舍五入,保留2位小数
    private Double roundVal(Double value){
        if(value != null){
            return new BigDecimal(value).setScale(2,RoundingMode.HALF_UP).doubleValue();
        }else{
            return null;
        }
    }

    //转换支付方式编码,合胜使用ABC等来记录支付方式
    private String changePaymodeId(String paymodeId){
        int paymodeId_switch = Integer.parseInt(paymodeId);
        String paymodeReturn = null;
        switch (paymodeId_switch){
            case 1:
                paymodeReturn = "A"; //现金
                break;
            case 2:
                paymodeReturn = "C";//信用卡
                break;
            case 3:
                paymodeReturn = "I";//支付宝
                break;
            case 4:
                paymodeReturn = "K";//微信支付
                break;
            case 5:
                paymodeReturn = "N";//储值卡
                break;
            case 6:
                paymodeReturn = "H";//购物券
                break;
            case 7:
                paymodeReturn = "D"; //折扣券
                break;
            case 8:
                paymodeReturn = "R"; //积分返利券
                break;
            default:
                paymodeReturn = paymodeId;
        }
        return paymodeReturn;
    }
}
