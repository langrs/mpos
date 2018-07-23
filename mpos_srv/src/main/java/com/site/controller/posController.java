package com.site.controller;

import com.google.gson.Gson;
import com.site.dao.*;
import com.site.entity.*;
import com.site.entity.entityParm.*;
import com.site.service.SaleService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping(value = "salepos/")
@Api(value = "salepos", description = "移动销售相关接口")
public class posController {
    @Resource
    TSysWorkstationDao tSysWorkstationDao;
    @Resource
    TCounterInfoDao tCounterInfoDao;
    @Resource
    TSysUserDao tSysUserDao;
    @Resource
    TBranchInfoDao tBranchInfoDao;
    @Resource
    TDataPaymentDao tDataPaymentDao;
    @Resource
    TItemInfoDao tItemInfoDao;
    @Resource
    TVipInfoDao tVipInfoDao;
    @Resource
    SaleService saleService;

    @ApiOperation(value = "移动收银机注册", notes = "移动收银机注册", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = String.class)
    @RequestMapping(value = "posRegister.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap<String> posRegister(@RequestBody String requestBody) {
//        解析json参数
        Gson gson = new Gson();
        PosRegisterParm posRegisterParm = gson.fromJson(requestBody, PosRegisterParm.class);

        ResultMap<String> resultMap = new ResultMap<String>();
        String posNo = posRegisterParm.getPosNo();
        String shopNo = StringUtils.substring(posNo, 0, 2);
        String counterNo = posRegisterParm.getStoreNo();
        String type = posRegisterParm.getPosType();
        posNo = StringUtils.substring(posNo, 2, posNo.length());
        String mac = posRegisterParm.getMac();

//        判断门店是否已经存在机号
        QueryMap queryMap = new QueryMap();
        queryMap.put("jh", posNo);
        queryMap.put("branchNo", shopNo);
        TSysWorkstation tSysWorkstationQuery = tSysWorkstationDao.getOne(queryMap);
        if (tSysWorkstationQuery != null) {
            return setRtn(resultMap, "1", "机号已经存在!", null);
        }
        if (mac == null) {
            return setRtn(resultMap, "1", "mac地址不能为空!", null);
        }
        queryMap.clear();
        queryMap.put("computerMac", mac);
        TSysWorkstation tSysWorkstationQuery1 = tSysWorkstationDao.getOne(queryMap);
        if (tSysWorkstationQuery1 != null) {
            return setRtn(resultMap, "1", "本机已经注册过!", null);
        }
        queryMap.clear();
        queryMap.put("counterNo", counterNo);
        TCounterInfo tCounterInfoQuery = tCounterInfoDao.getOne(queryMap);
        //存在专柜资料
        if (tCounterInfoQuery == null) {
            return setRtn(resultMap, "1", "专柜编号不存在!", null);
        }
        TSysWorkstation tSysWorkstation = new TSysWorkstation();
        tSysWorkstation.setBranchNo(shopNo);
        tSysWorkstation.setJh(posNo);
        tSysWorkstation.setIsBlls("0");
        tSysWorkstation.setLoginPos("1");
        tSysWorkstation.setLoginHt("0");
        tSysWorkstation.setIsRaid("0");
        tSysWorkstation.setIsInit("0");
        tSysWorkstation.setIsLogout("0");
        tSysWorkstation.setComputer("mobile");
        tSysWorkstation.setCounterNo(counterNo);
        tSysWorkstation.setType(type);
        tSysWorkstation.setComputerMac(mac);
        //这里如何判断是否成功呢,是不是靠着异常来判断???
        tSysWorkstationDao.create(tSysWorkstation);
        return setRtn(resultMap, "0", "", null);

    }

    @ApiOperation(value = "用户登录验证", notes = "用户登录验证", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = String.class)
    @RequestMapping(value = "userVerify.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap<Map<String, Object>> userVerify(@RequestBody String requestBody) {
//        参数格式:userNo,passwd,mac
        Gson gson = new Gson();
        UserVerifyParm userVerifyParm = gson.fromJson(requestBody, UserVerifyParm.class);

        ResultMap<Map<String, Object>> resultMap = new ResultMap<Map<String, Object>>();
        String userNo = userVerifyParm.getUserNo();
        String passwd = userVerifyParm.getPasswd();
        String mac = userVerifyParm.getMac();
        //获取mac对应的供应商
        QueryMap queryMap = new QueryMap();
        queryMap.put("computerMac", mac);
        String shopNo = null;
        //返回内容

        Map<String, Object> map = new HashMap<String, Object>();

        TSysWorkstation tSysWorkstationQuery = tSysWorkstationDao.getOne(queryMap);
        if (tSysWorkstationQuery == null) {
            return setRtn(resultMap, "1", "机号没有注册!", null);
        }
        queryMap.clear();
        queryMap.put("userId", userNo);
        TSysUser tSysUser = tSysUserDao.getOne(queryMap);
        if (tSysUser == null) {
            return setRtn(resultMap, "1", "用户不存在!", null);
        }
        if (!tSysUser.getUserPw().trim().equals(passwd.trim())) {
            return setRtn(resultMap, "1", "密码错误!", null);
        }
//      注册的收银机所属专柜和用户所属专柜必须要一致才允许登录
        String counterNo_user = null;
        counterNo_user = tSysUser.getCounterNo();
        if (counterNo_user == null || !tSysWorkstationQuery.getCounterNo().equals(counterNo_user)) {
            return setRtn(resultMap, "1", "用户不允许登录该机器!", null);
        }
        RpPosInfo rpPosInfo = new RpPosInfo();


        String counterNo = tSysWorkstationQuery.getCounterNo();
        //获取用户信息
        rpPosInfo.setUserNo(tSysUser.getUserId());
        rpPosInfo.setUserName(tSysUser.getUserName());
        rpPosInfo.setUserId(tSysUser.getUserId());
        //获取门店信息
        shopNo = tSysWorkstationQuery.getBranchNo();
        queryMap.clear();
        queryMap.put("branchNo", shopNo);
        TBranchInfo tBranchInfo = tBranchInfoDao.getOne(queryMap);
        if (tBranchInfo != null) {
            rpPosInfo.setShopId(tBranchInfo.getBranchNo());
            rpPosInfo.setShopName(tBranchInfo.getBranchName());
            rpPosInfo.setShopId(tBranchInfo.getBranchNo());
        }
        //获取专柜信息
        queryMap.clear();
        queryMap.put("counterNo", counterNo);
        TCounterInfo tCounterInfo = tCounterInfoDao.getOne(queryMap);
        if (tBranchInfo != null) {
            rpPosInfo.setStoreId(tCounterInfo.getCounterNo());
            rpPosInfo.setStoreNo(tCounterInfo.getCounterNo());
            rpPosInfo.setStoreName(tCounterInfo.getCounterName());
        }
        //获取pos机信息
        rpPosInfo.setPosId(tSysWorkstationQuery.getJh());
        rpPosInfo.setPosNo(tSysWorkstationQuery.getJh());
        //
        map.put("posInfo", rpPosInfo);
        //
        //获取支付方式列表
        List<TDataPayment> payments = tDataPaymentDao.getAll();
        List<RpPaymode> rpPaymodes = new ArrayList<RpPaymode>();
        if (payments != null) {
            Iterator itorator = payments.iterator();
            while (itorator.hasNext()) {
                TDataPayment tDataPayment = (TDataPayment) itorator.next();
                RpPaymode rpPaymode = new RpPaymode();
                rpPaymode.setPaymodeId(tDataPayment.getPaymentNo());
                rpPaymode.setPaymodeNo(tDataPayment.getPaymentNo());
                rpPaymode.setPaymodeName(tDataPayment.getPaymentName());
                //汇率
                rpPaymode.setExchangeRate("1");
                //是否找零
                rpPaymode.setIsChange(tDataPayment.getPaymentIsZero());
                //币种
                rpPaymode.setCurrencyId(tDataPayment.getCoinNo());
                rpPaymodes.add(rpPaymode);
            }
            map.put("paymode", rpPaymodes);
        }

        return setRtn(resultMap, "0", "", map);
    }

    @ApiOperation(value = "获取商品", notes = "获取商品", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = String.class)
    @RequestMapping(value = "queryItem.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap<List<RpProduct>> queryItem(@RequestBody String requestBody) {
        //        参数格式:shopId,storeId,itemNo,posNo
        ResultMap<List<RpProduct>> resultMap = new ResultMap<List<RpProduct>>();
        Gson gson = new Gson();
        RqQueryItem rqQueryItem = gson.fromJson(requestBody, RqQueryItem.class);
        QueryMap queryMap = new QueryMap();

        List<RpProduct> rpProducts = new ArrayList<RpProduct>();

        if (rqQueryItem == null) {
            return setRtn(resultMap, "1", "传入参数为空", null);
        }
        String shopId = rqQueryItem.getShopId();
        String storeId = rqQueryItem.getStoreId();
        String itemNo = rqQueryItem.getItemNo();
        if (itemNo != null) {  //按条码查询
            queryMap.put("itemBarcode", itemNo);
            TItemInfo tItemInfo = tItemInfoDao.getOne(queryMap);
            if (tItemInfo == null) {
                return setRtn(resultMap, "1", "无此条码", null);
            }
            RpProduct rpProduct = new RpProduct();
            rpProduct.setItemId(tItemInfo.getItemNo());
            rpProduct.setItemNo(tItemInfo.getItemBarcode());
            rpProduct.setItemName(tItemInfo.getItemName());
            rpProduct.setStoreId(tItemInfo.getCounterNo());
            // TODO: 2016-11-12
            //分店在这里不确定,是否从全局获取
            rpProduct.setShopId(tItemInfo.getBranchNo());
            rpProduct.setCompanyId("01");
            //销售模式:1	普通,2	电子秤称重,3	电子秤计份,4	不定价格,5	不定数量,6	不定价量,7	不定额
            rpProduct.setIsPrice(tItemInfo.getItemSaleMode());
            //商品品态:0	停用,1	进销,2	新品,3	只销,4	停销
            rpProduct.setIsFlag(tItemInfo.getDisplayFlag());
            //价格,百货商品默认为0
            rpProduct.setSalePrice("0");
            //品牌
            rpProduct.setBrandId(tItemInfo.getItemBrand());
            //品类
            rpProduct.setCategoryId(tItemInfo.getItemClass());
            rpProducts.add(rpProduct);
        } else {
            queryMap.clear();
            queryMap.put("counterNo", storeId);
            List<TItemInfo> itemInfos = tItemInfoDao.getList(queryMap);
            if (itemInfos == null || itemInfos.size() == 0) {
                return setRtn(resultMap, "1", "专柜无法找到对应的销售码", null);
            }
            Iterator itorator = itemInfos.iterator();
            while (itorator.hasNext()) {
                RpProduct rpProduct = new RpProduct();
                TItemInfo tItemInfo = (TItemInfo) itorator.next();
                //唯一商品码,预结算和结算都是传这个值,界面显示为item_no
                rpProduct.setItemId(tItemInfo.getItemNo());
                //商品条形码(这里没有返回货号)
                rpProduct.setItemNo(tItemInfo.getItemBarcode());
                rpProduct.setItemName(tItemInfo.getItemName());
                rpProduct.setStoreId(tItemInfo.getCounterNo());
                //// TODO: 2016-11-12
                //分店在这里不确定,是否从全局获取
                rpProduct.setShopId(tItemInfo.getBranchNo());
                rpProduct.setCompanyId("01");
                //销售模式:1	普通,2	电子秤称重,3	电子秤计份,4	不定价格,5	不定数量,6	不定价量,7	不定额
                rpProduct.setIsPrice(tItemInfo.getItemSaleMode());
                //商品品态:0	停用,1	进销,2	新品,3	只销,4	停销
                rpProduct.setIsFlag(tItemInfo.getDisplayFlag());
                //价格,百货商品默认为0
                rpProduct.setSalePrice("0");
                //品牌
                rpProduct.setBrandId(tItemInfo.getItemBrand());
                //品类
                rpProduct.setCategoryId(tItemInfo.getItemClass());
                //
                rpProducts.add(rpProduct);
            }
        }
        return setRtn(resultMap, "0", "", rpProducts);
    }

    @ApiOperation(value = "会员卡查询", notes = "会员卡查询", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = String.class)
    @RequestMapping(value = "tvipQuery.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap<RpVipQuery> tvipQuery(@RequestBody String requestBody) {
//        解析json参数
        Gson gson = new Gson();
        RqVipQuery rqVipQuery = gson.fromJson(requestBody, RqVipQuery.class);

        ResultMap<RpVipQuery> resultMap = new ResultMap<RpVipQuery>();
        String cdInfo = rqVipQuery.getCdInfo();
        String billno = rqVipQuery.getBillno();
        String shopId = rqVipQuery.getShopId();
        QueryMap queryMap = new QueryMap();
        RpVipQuery rpVipQuery = new RpVipQuery();
        if (cdInfo != null && cdInfo.length() > 0) { //根据磁道查询
            //根据磁道信息查询
            queryMap.clear();
            queryMap.put("cardNo", cdInfo);
            TVipInfo tVipInfoQuery = tVipInfoDao.getOne(queryMap);
            if (tVipInfoQuery == null) {
                return setRtn(resultMap, "1", "无法查询到该卡信息", null);
            }
            //// TODO: 2016-11-13
            //很多属性没有定义的
            rpVipQuery.setCkcode(tVipInfoQuery.getVipDispno());
            //这个是系统生成的卡号,写入数据库需要写入这个编号
            rpVipQuery.setLmcode(tVipInfoQuery.getVipNo());
            rpVipQuery.setCardtype(tVipInfoQuery.getCardType());
        } else { //根据手机号,卡面号码等查询
            if (billno == null) {
                return setRtn(resultMap, "1", "查询参数不能为空", null);
            }
            List<TVipInfo> tVipInfos = tVipInfoDao.getByBillno(billno);
            //如果返回多条记录,则获取第一条记录
            if (tVipInfos == null || tVipInfos.size() == 0) {
                return setRtn(resultMap, "1", "无法查询到该卡信息", null);
            }
            //很多属性没有定义的
            rpVipQuery.setCkcode(tVipInfos.get(0).getVipDispno());
            //这个是系统生成的卡号,写入数据库需要写入这个编号
            rpVipQuery.setLmcode(tVipInfos.get(0).getVipNo());
            rpVipQuery.setCardtype(tVipInfos.get(0).getCardType());
        }
        return setRtn(resultMap, "0", "", rpVipQuery);
    }

    @ApiOperation(value = "预结算", notes = "预结算", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = String.class)
    @RequestMapping(value = "tpreSale.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap<List<PreSaleItemInfo>> tpreSale(@RequestBody String requestBody) {

        ResultMap<List<PreSaleItemInfo>> resultMap = new ResultMap<List<PreSaleItemInfo>>();
        JSONObject json_obj = JSONObject.fromObject(requestBody);
        // 转换销售单
        JSONObject headInfo_json = json_obj.getJSONObject("headInfo");
        PreSaleHeadInfo preSaleHeadInfo = (PreSaleHeadInfo) JSONObject.toBean(headInfo_json, PreSaleHeadInfo.class);
        // 转换销售单明细
        JSONArray saleD_json = json_obj.getJSONArray("itemInfo");
        List<PreSaleItemInfo> preSaleItemInfoList = (List<PreSaleItemInfo>) JSONArray.toCollection(saleD_json, PreSaleItemInfo.class);
        if (preSaleHeadInfo == null || preSaleItemInfoList == null || preSaleItemInfoList.size() == 0) {
            return setRtn(resultMap, "1", "传入参数不正确", null);
        }
        String shopId = preSaleHeadInfo.getShopId();
        String vipType = preSaleHeadInfo.getVipType();
        //这个vipNo是A5的系统生成
        String vipNo = preSaleHeadInfo.getVipNo();
        //单据类型
        String dealType = preSaleHeadInfo.getDealType();
        for (PreSaleItemInfo preSaleItemInfo : preSaleItemInfoList) {
            //专柜
            String storeId = preSaleItemInfo.getStoreId();
            //条码
            String itemNo = preSaleItemInfo.getItemId();
            //计算
            // TODO: 2016-11-14 这里没有计算过程
            //结果
            //所有优惠金额
            preSaleItemInfo.setAllDistAmt(0D);
            //会员折扣,1为100%不打折扣
            preSaleItemInfo.setVipDiscAmt(0D);
            preSaleItemInfo.setVipDisc(1);
            //查询折扣
            preSaleItemInfo.setPromDisc(1);
            preSaleItemInfo.setPromDiscAmt(0D);
            //
            preSaleItemInfo.setCouponDisc(0D);
            //销售金额
            preSaleItemInfo.setItemSaleAmt(preSaleItemInfo.getSaleNum() * preSaleItemInfo.getSalePrice());
        }
        return setRtn(resultMap, "0", "", preSaleItemInfoList);
    }

    @ApiOperation(value = "结算", notes = "结算", httpMethod = "POST",
            produces = "application/json; charset=utf-8", response = String.class)
    @RequestMapping(value = "sale.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultMap<List<PreSaleItemInfo>> sale(@RequestBody String requestBody) {

        JSONObject json_obj = JSONObject.fromObject(requestBody);
        // 转换销售单
        JSONObject saleHead_json = json_obj.getJSONObject("saleHead");
        TSale tSale = (TSale) JSONObject.toBean(saleHead_json, TSale.class);
        // 转换销售单明细
        JSONArray saleD_json = json_obj.getJSONArray("saleDetail");
        List<TSaleD> tSaleDList = (List<TSaleD>) JSONArray.toCollection(saleD_json, TSaleD.class);
        //转换支付方式明细
        JSONArray salePay_json = json_obj.getJSONArray("salePay");
        List<TSalePay> tSalePayList = (List<TSalePay>) JSONArray.toCollection(salePay_json, TSalePay.class);

        QueryMap queryMap = new QueryMap();
        String state = null;
        String errMsg = null;
        //写入销售表单中
        //****************单头***********************
        TPosSaleMaster tPosSaleMaster = new TPosSaleMaster();
        //单号
        tPosSaleMaster.setSheetNo(tSale.getSaleNo());
        // TODO: 2016-11-14 是否需要从数据库中获取当前日期,时分秒处理
        //销售日期:获取当前日期,不带时分秒
        tPosSaleMaster.setOperDate(new Date());
        //销售时间:带时分秒
        tPosSaleMaster.setSaleTime(new Date());
        //单据类型
        tPosSaleMaster.setPosType("1");
        //单据状态
        tPosSaleMaster.setPosStatus("9");
        //当班单号码
        tPosSaleMaster.setDealNo("");
        //当班单班次
        tPosSaleMaster.setDealClass("A");
        //交班班号
        tPosSaleMaster.setDealNo("");
        //交班班次
        tPosSaleMaster.setDealClass("A");
        //用户
        tPosSaleMaster.setUserId(tSale.getUserId());
        //分店
        tPosSaleMaster.setBranchNo(tSale.getShopId());
        //专柜
        tPosSaleMaster.setCounterNo(tSale.getStoreId());
        //机号
        tPosSaleMaster.setJh(tSale.getPosId());
        //会员卡
        tPosSaleMaster.setVipNo(tSale.getVipNo());
        //单据原价金额,是否原价单价
        tPosSaleMaster.setPosOrgAmt(tSale.getOriginalAmt());
        //单据金额
        tPosSaleMaster.setPosTotalAmt(tSale.getSaleAmt());
        //单据积分金额
        tPosSaleMaster.setPosIntegral(tSale.getSalePoints());
        //倍数
        tPosSaleMaster.setFuTimes("1");
        //
        tPosSaleMaster.setPosOrderIsSend("0");
        //****************明细***********************
        List<TPosSaleDetail> tPosSaleDetails = new ArrayList<TPosSaleDetail>();
        for (TSaleD tSaleD : tSaleDList) {
            //获取商品基本资料
            queryMap.clear();
            //这里查询商品信息通过了唯一码来查询
            queryMap.put("itemNo", tSaleD.getItemId());
            TItemInfo tItemInfo = tItemInfoDao.getOne(queryMap);

            TPosSaleDetail tPosSaleDetail = new TPosSaleDetail();
            //单据号
            tPosSaleDetail.setSheetNo(tSale.getSaleNo());
            //序号
            tPosSaleDetail.setSheetSort(tSaleD.getRowNo());
            //条码系统编号
            tPosSaleDetail.setItemNo(tSaleD.getItemId());
            //条码编号
            tPosSaleDetail.setSaleBarcode(tSaleD.getItemNo());
            //单位
            tPosSaleDetail.setItemUnit(tItemInfo.getItemUnitNo());
            //单位类型:默认为0
            tPosSaleDetail.setUnitType("0");
            //单位包装
            tPosSaleDetail.setUnitPack(1D);
            //原价金额
            tPosSaleDetail.setOrgPrice(tSaleD.getSalePrice());
            //实收价格
            tPosSaleDetail.setRealPrice(tSaleD.getSalePriceReal());
            //销售数量
            tPosSaleDetail.setSaleQty(tSaleD.getSaleNum());
            //数量标识
            tPosSaleDetail.setSaleSign("1");
            //销售金额
            tPosSaleDetail.setSaleAmt(tSaleD.getItemSaleAmt());
            //营业员,留空
            tPosSaleDetail.setSaleMan("");
            // TODO: 2016-11-14 专柜应该可以从明细中获取,暂时从单头获取

            //专柜
            tPosSaleDetail.setCounterNo(tSale.getStoreId());
            //管理方式
            tPosSaleDetail.setManageType("1");
            //特价类型
            tPosSaleDetail.setSpecialType("");
            //特价单号
            tPosSaleDetail.setSpecialNo("");
            //打包商品标识
            tPosSaleDetail.setItemIspack("0");
            //代销或联营已对帐数据
            tPosSaleDetail.setJsQty(0D);
            //??
            tPosSaleDetail.setAllzkForeRealPrice(0D);
            tPosSaleDetail.setAllzkForeSpecialType("0");
            //联营扣率
            // TODO: 2016-11-14  扣率从哪里获取
            tPosSaleDetail.setManageLyRate(null);
            //联营供货商编码
            tPosSaleDetail.setLySupNo("");
            //加税金额
            tPosSaleDetail.setInsideTaxAmt(0D);
            //
            tPosSaleDetail.setIsPackage("0");
            tPosSaleDetail.setLimitBranch("0");
            tPosSaleDetail.setLimitTimes("1");
            tPosSaleDetail.setLimitDate("0");
            //加入列表
            tPosSaleDetails.add(tPosSaleDetail);
        }
        //**************销售支付信息********************
        List<TPosSalePayment> tPosSalePayments = new ArrayList<TPosSalePayment>();
        for (TSalePay tSalePay : tSalePayList) {
            TPosSalePayment tPosSalePayment = new TPosSalePayment();
            //单号
            tPosSalePayment.setSheetNo(tSale.getSaleNo());
            //行号
            tPosSalePayment.setSheetSort(tSalePay.getRowNo());
            //支付方式
            tPosSalePayment.setPaymentNo(tSalePay.getPaymodeId());
            //销售金额
            tPosSalePayment.setPaymentAmt(tSalePay.getPayAmt());
            //订金
            tPosSalePayment.setIsOrder("0");
            // TODO: 2016-11-14 需要和支付方式以及币种表同步
            //币种,默认001本币
            tPosSalePayment.setCoinNo(tSalePay.getCurrencyId());
            //汇率,默认为1
            tPosSalePayment.setCoinRate(tSalePay.getExchangeRate());
            String paymentNo = tSalePay.getPaymodeId();
            if (paymentNo.equals("10")) { //会卡支付
                // TODO: 2016-11-14 这里需要补登记会员卡号cardno
                //会卡支付,需要记录会员卡号
                tPosSalePayment.setVipNo(tSalePay.getBillNo());
                tPosSalePayment.setCardNo(tSalePay.getBillNo());
            } else if (paymentNo.equals("23")) { //银联卡支付
                //银行卡类型
                tPosSalePayment.setBankType(null);
                //银行卡号
                tPosSalePayment.setBankNo(tSalePay.getBillNo());
            } else {                             //其他单据号
                tPosSalePayment.setOtherNo(tSalePay.getBillNo());
            }
            tPosSalePayment.setParAmt(0D);
            //加入支付列表
            tPosSalePayments.add(tPosSalePayment);
        }
        //销售单保存
        saleService.saveSaleAndDetail(tPosSaleMaster, tPosSaleDetails, tPosSalePayments);
        return null;
    }

    //赋值返回值
    private <T> ResultMap<T> setRtn(ResultMap<T> resultMap, String status, String errMsg, T t) {
        resultMap.setStatus(status);
        resultMap.setErrorMsg(errMsg);
        if (t != null) {
            resultMap.setData(t);
        }
        return resultMap;
    }
}
