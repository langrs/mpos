package com.site.webService.impl;

import com.google.gson.Gson;
import com.site.core.mybatis.QueryMap;
import com.site.entity.*;
import com.site.entity.entityParm.*;
import com.site.entity.saleResult.SaleQueryResult;
import com.site.entity.saleResult.SaleResult;
import com.site.service.*;
import com.site.util.JsonUtil;
import com.site.webService.SaleWebService;
import com.site.webService.call.PosWebServiceImpl;
import com.site.webService.call.PosWebServiceImplService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import java.net.URL;
import java.util.*;
@WebService
public class SaleWebServiceImpl implements SaleWebService {
	private static final QName SERVICE_NAME = new QName("http://impl.webService.site.com/", "PosWebServiceImplService");
	@Resource
	TPosService tPosService;

	@Resource
	TStoreService tStoreService;

	@Resource
	TShopService tShopService;

	@Resource
	TStorePosService tStorePosService ;

	@Resource
	TUserService tUserService;

	@Resource
	TPayviewService tPayviewService;

	@Resource
	TPaymodeService tPaymodeService;

	@Resource
	TCodeService tCodeService;

	@Resource
	TParmService tParmService;

	@Resource
	TProduceService tProduceService;

	@Resource
	TSaleService tSaleService ;
	@Resource
	TSaleDService tSaleDService;
	@Resource
	TSalePayService tSalePayService;
	@Resource
	TNoticeService tNoticeService;
	@Resource
	TStoreDoubleService tStoreDoubleService;

	private <T> ResultMap<T> setResultMap(String status,String errorMsg,T t){
		ResultMap<T> resultMap = new ResultMap<T>();
		resultMap.setStatus(status);
		resultMap.setErrorMsg(errorMsg);
		resultMap.setData(t);
		return resultMap;
	};

	public String posRegister(String shopNo, String storeNo, String cashierNo,
							  String mac, String posNo) {
		//日志记录
		Logger logger = Logger.getLogger(SaleWebServiceImpl.class);
		logger.info("posRegister请求参数--" + "shopNo:" + shopNo + "storeNo:" + storeNo + "cashierNo:" + cashierNo + "mac:" + mac + "posNo:" + posNo);
		QueryMap queryMap = new QueryMap();

		ResultMap<RpPosRegister> resultMap = new ResultMap<RpPosRegister>();

		//判断商户号是否正确
		queryMap.put("storeNo", storeNo);
		TStore tStore =  tStoreService.getOne(queryMap);
		if(tStore == null){
			resultMap = setResultMap("1","商户号查不到，请查证商户号是否有误!!", null);
			logger.info("posRegister返回--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}

		//分解posNo号码，拆分出来分店号和posNo，拆分原则是4位分店号+4位的终端号
		if (posNo.trim().length() != 6){
			resultMap = setResultMap("1","终端号位数不对,请重新输入!!",null);
			logger.info("posRegister返回--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}else{
			shopNo = posNo.substring(0, 2);
			posNo = posNo.substring(2, 6);
		}
		//判断mac地址
		if(mac == null){
			resultMap = setResultMap("1","MAC地址错误,请联系管理员!!",null);
			logger.info("posRegister返回--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}

		queryMap.clear();
		queryMap.put("shopNo", shopNo);

		TShop tShop = tShopService.getOne(queryMap);
		if(tShop == null){
			resultMap = setResultMap("1","分店信息查询不到，请查证!!",null);
			logger.info("posRegister返回--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}
		queryMap.clear();
		queryMap.put("shopNo", shopNo);
		queryMap.put("posNo", posNo);

		TPos tPos = tPosService.getOne(queryMap);
		if(tPos != null){
			queryMap.clear();
			queryMap.put("posId",tPos.getId());
			TStorePos tStorePos = tStorePosService.getOne(queryMap);
			if(tStorePos != null){
				resultMap = setResultMap("1","该终端号已经绑定了其他的商铺号，请先解绑后再操作!!",null);
				logger.info("posRegister返回--" + JsonUtil.objectToString(null, resultMap));
				return JsonUtil.objectToString(null, resultMap);
			}

			//给用户赋值默认
			if(cashierNo  == null || cashierNo.equals("")){
				cashierNo = "1";
			}
			//更新mac地址
			tPos.setMac(mac);
			tPos.setUpdateBy(cashierNo);
			tPosService.registPos(tPos, tStore);
			RpPosRegister rpPosRegister = new RpPosRegister();
			rpPosRegister.setPosId(tPos.getId());
			rpPosRegister.setPosNo(tPos.getPosNo());
			rpPosRegister.setPosName(tPos.getName());
			rpPosRegister.setShopId(tPos.getShopId());
			rpPosRegister.setShopNo(tShop.getShopNo());
			rpPosRegister.setShopName(tShop.getName());
			rpPosRegister.setStoreId(tStore.getId());
			rpPosRegister.setStoreNo(tStore.getStoreNo());
			rpPosRegister.setStoreName(tStore.getName());
			rpPosRegister.setServerAddr(tPos.getServerAddr());
			resultMap = setResultMap("0", "", rpPosRegister);
			logger.info("posRegister返回--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}else{
			resultMap = setResultMap("1","无法找到该终端 号信息,请联系管理员!!",null);
			logger.info("posRegister返回--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}


	}

	public String userVerify(String userNo, String passwd, String mac,
							 String posNo) {
		Logger logger = Logger.getLogger(SaleWebServiceImpl.class);
		logger.info("userVerify请求参数--" + "userNo:" + userNo + "passwd:" + passwd + "posNo:" + posNo + "mac:" + mac );
		//posNo不需要
		QueryMap queryMap = new QueryMap();
		RpPosInfo rpPosInfo = new RpPosInfo();

//		RpUserVerify rpUserVerify = new RpUserVerify();



		ResultMap<Map<String,Object>> resultMap = new ResultMap<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String, Object>();
		queryMap.put("mac", mac);

		TPos tPos = tPosService.getOne(queryMap);
		if(tPos == null){
			resultMap = setResultMap("1","该终端 未登记,请联系管理员!!",null);
			logger.info("userVerify返回值--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}

		queryMap.clear();
		queryMap.put("userNo", userNo);
		TUser tUser = tUserService.getOne(queryMap);
		if(tUser == null){
			resultMap = setResultMap("1","用户输入有误!!",null);
			logger.info("userVerify返回值--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}
		if (!tUser.getPasswd().equals(passwd)){
			resultMap = setResultMap("1","用户密码错误!!",null);
			logger.info("userVerify返回值--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}


		queryMap.clear();
		queryMap.put("id",tPos.getShopId());
		TShop tShop = tShopService.getOne(queryMap);
		if(tShop==null){
			resultMap = setResultMap("1","该终端 参数设置有误，无法查询到分店信息,请联系管理员!!",null);
			return JsonUtil.objectToString(null, resultMap);
		}
		queryMap.clear();
		queryMap.put("posId", tPos.getId());
		TStorePos tStorePos = tStorePosService.getOne(queryMap);
		if(tStorePos == null){
			resultMap = setResultMap("1","该终端还没有绑定商户,请联系管理员!!",null);
			return JsonUtil.objectToString(null, resultMap);
		}
		queryMap.clear();
		queryMap.put("id", tStorePos.getStoreId());
		TStore tStore = tStoreService.getOne(queryMap);
		if(tStore == null){
			resultMap = setResultMap("1","商户信息有误,请联系管理员!!",null);
			logger.info("userVerify返回值--" + JsonUtil.objectToString(null, resultMap));
			return JsonUtil.objectToString(null, resultMap);
		}

		//判断登录用户编码是否和绑定的终端的商铺号一致,因为用户编码和商铺号一致
		if(!userNo.equals(tStore.getStoreNo())){
			resultMap = setResultMap("1","该用户不能登录本机!!",null);
			logger.info("userVerify返回值--" + JsonUtil.objectToString(null,resultMap));
			return JsonUtil.objectToString(null,resultMap);
		}
		//准备返回数据
		//1.rpPosInfo
		rpPosInfo.setCompanyId(tShop.getCompanyId());

		rpPosInfo.setShopId(tShop.getId());
		rpPosInfo.setShopNo(tShop.getShopNo());
		rpPosInfo.setShopName(tShop.getName());
		rpPosInfo.setUserId(tUser.getId());
		rpPosInfo.setUserNo(tUser.getUserNo());
		rpPosInfo.setUserName(tUser.getName());
		rpPosInfo.setPosId(tPos.getId());
		rpPosInfo.setPosNo(tPos.getPosNo());
		rpPosInfo.setPosName(tPos.getName());
		rpPosInfo.setPosType(tPos.getPosType());
		rpPosInfo.setServerAddr(tPos.getServerAddr());
		rpPosInfo.setStoreId(tStore.getId());
		rpPosInfo.setStoreNo(tStore.getStoreNo());
		rpPosInfo.setStoreName(tStore.getName());
		rpPosInfo.setHead1("");
		rpPosInfo.setFoot1("");
		map.put("posInfo", rpPosInfo);
		//2.payView
		List<TPayview> tPayview = tPayviewService.getAll();
		List<RpPayView> list_RpPayView = new ArrayList<RpPayView>();
		Iterator itorator = tPayview.iterator();
		while(itorator.hasNext()){
			TPayview tPayview1 = (TPayview)itorator.next();
			RpPayView rpPayView = new RpPayView();
			rpPayView.setPayviewId(tPayview1.getId());
			rpPayView.setPayviewNo(tPayview1.getPayviewNo());
			rpPayView.setPayviewName(tPayview1.getName());
			rpPayView.setPaymodeId(tPayview1.getPaymodeId());
			rpPayView.setParentId(tPayview1.getParentId());
			list_RpPayView.add(rpPayView);
		}
		map.put("payView", list_RpPayView);
		//3.paymode
		List<RpPaymode> list_RpPaymode = new ArrayList<RpPaymode>();
		List<TPaymode> tPaymode = tPaymodeService.queryRight(userNo);
		itorator = tPaymode.iterator();
		while(itorator.hasNext()){
			TPaymode tPaymode1 = (TPaymode)itorator.next();
			RpPaymode rpPaymode = new RpPaymode();
			rpPaymode.setPaymodeId(tPaymode1.getId());
			rpPaymode.setPaymodeNo(tPaymode1.getPaymodeNo());
			rpPaymode.setPaymodeName(tPaymode1.getName());
			rpPaymode.setIsChange(tPaymode1.getIsChange());
			rpPaymode.setIsCoupon(tPaymode1.getIsCoupon());
			rpPaymode.setIsInvoice(tPaymode1.getIsInvoice());
			rpPaymode.setIsPoint(tPaymode1.getIsPoint());
			rpPaymode.setIsFlag(tPaymode1.getIsFlag());
			rpPaymode.setPaymodeQy(tPaymode1.getPaymodeQy());
			list_RpPaymode.add(rpPaymode);
		}
		map.put("paymode", list_RpPaymode);
		//4.posParm
		List<RpParm> list_RpParm = new ArrayList<RpParm>();
		List<TParm> tParm = tParmService.getAll();
		itorator = tParm.iterator();
		while(itorator.hasNext()){
			TParm tParm1 = (TParm)itorator.next();
			RpParm rpParm = new RpParm();
			rpParm.setParmId(tParm1.getId());
			rpParm.setParmNo(tParm1.getParmNo());
			rpParm.setParmName(tParm1.getName());
			rpParm.setParmVal(tParm1.getParmVal());
			list_RpParm.add(rpParm);
		}
		map.put("posParm", list_RpParm);
		//5.code
		List<RpCode> list_RpCode = new ArrayList<RpCode>();
		List<TCode> tCode = tCodeService.getAll();
		itorator = tCode.iterator();
		while(itorator.hasNext()){
			TCode tCode1 = (TCode)itorator.next();
			RpCode rpCode = new RpCode();
			rpCode.setCodeType(tCode1.getCodeType());
			rpCode.setCodeNo(tCode1.getCodeNo());
			rpCode.setCodeName(tCode1.getName());
			list_RpCode.add(rpCode);
		}
		map.put("code", list_RpCode);

		resultMap = setResultMap("0","",map);
		String[] params = new String[]{"createOrgId","createBy",  "isFlag", "updateBy", "updateTime","dialog" ,"createDate","createTime","paymodeIdObj"};
		logger.info("userVerify返回值--" + JsonUtil.objectToString(params, resultMap));
		return JsonUtil.objectToString(params, resultMap);
	}

	public String queryItem(String shopId, String storeId, String itemNo,
							String posNo) {
		Logger logger = Logger.getLogger(SaleWebServiceImpl.class);
		logger.info("queryItem请求参数--" + "shopId:" + shopId + "storeId:" + storeId + "itemNo:" + itemNo + "posNo:" + posNo );

		//促销信息的远程端口
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		//商品条码查询
		ResultMap<List<RpProduct>> resultMap = new ResultMap<List<RpProduct>>();
		QueryMap queryMap = new QueryMap();
		List<RpProduct> list_RpProduct = new ArrayList<RpProduct>();
		//按照单个条码查询
		if(itemNo != null && itemNo.length() > 0){
			queryMap.put("itemNo", itemNo);
			TProduce tProduce = tProduceService.getOne(queryMap);
			if(tProduce == null ){
				resultMap = setResultMap("1","该条码查不到信息!!",null);
				logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
				return JsonUtil.objectToString(null, resultMap);
			}
			RpProduct rpProduct = new RpProduct();
			rpProduct.setItemId(tProduce.getId());
			rpProduct.setItemNo(tProduce.getItemNo());
			rpProduct.setItemName(tProduce.getName());
			rpProduct.setItemSubno(tProduce.getItemSubno());
			rpProduct.setBrandId(tProduce.getBrandId());
			rpProduct.setCategoryId(tProduce.getCategoryId());
			rpProduct.setCompanyId(tProduce.getCompanyId());
			rpProduct.setIsPrice(tProduce.getIsPrice());
			rpProduct.setIsFlag(tProduce.getIsFlag());
			rpProduct.setItemAttr(tProduce.getItemAttr());
			rpProduct.setShopId(tProduce.getShopId());
			rpProduct.setStoreId(tProduce.getStoreId());
			rpProduct.setSalePrice(tProduce.getSalePrice());

			list_RpProduct.add(rpProduct);
			resultMap = setResultMap("0","",list_RpProduct);
			logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
			return JsonUtil.objectToString(null, resultMap);
		}else{
			//按照商户号查询
			//判断是否有多个商铺公用一台机器
			List<TProduce> list_TProduce = null;

			queryMap.clear();
			queryMap.put("storeIdMain",storeId);
			List<TStoreDouble> list_TStoreDoubl = tStoreDoubleService.getList(queryMap);
			if(list_TStoreDoubl != null && list_TStoreDoubl.size() > 0){
				list_TProduce = new ArrayList<TProduce>();
				for(TStoreDouble tStoreDouble:list_TStoreDoubl){
					String storeType = tStoreDouble.getStoreType();
					if( storeType == null || "".equals(storeType)){
						continue;
					}
					//判断是供应商还是条码
					if(storeType.equals("0")){ //按商铺号查询
						storeId = tStoreDouble.getStoreIdSecond();
						queryMap.clear();
						queryMap.put("storeId", storeId);
						queryMap.put("shopId",shopId);
						queryMap.put("state","1");
						List<TProduce> list_produce_double = tProduceService.getList(queryMap);
						if(list_produce_double == null || list_produce_double.size() == 0){
							resultMap = setResultMap("1",storeId + "该商户号无法查询到销售码信息!!",null);
							logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
							return JsonUtil.objectToString(null, resultMap);
						}
						//汇总到一个列表中去
						for(TProduce tProduce:list_produce_double){
							list_TProduce.add(tProduce);
						}
					}else{  //按条码查询
						itemNo = tStoreDouble.getStoreIdSecond();
						queryMap.clear();
						queryMap.put("itemNo", itemNo);
						TProduce tProduce = tProduceService.getOne(queryMap);
						if(tProduce != null){
							list_TProduce.add(tProduce);
						}
					}

				}
			}else{
				queryMap.clear();
				queryMap.put("storeId", storeId);
				queryMap.put("shopId",shopId);
				queryMap.put("state","1");
				list_TProduce = tProduceService.getList(queryMap);
				if(list_TProduce == null || list_TProduce.size() == 0){
					resultMap = setResultMap("1","该商户号无法查询到销售码信息!!",null);
					logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
					return JsonUtil.objectToString(null, resultMap);
				}
			}

			//循环赋值
			Iterator itorator = list_TProduce.iterator();
			while(itorator.hasNext()){
				RpProduct rpProduct = new RpProduct();
				TProduce tProduce = (TProduce)itorator.next();
				rpProduct.setItemId(tProduce.getId());
				rpProduct.setItemNo(tProduce.getItemNo());
				//获取促销信息,返回值是第一位为有效标志位,其他的是促销类型
				String promName =  port.queryPromName(tProduce.getItemNo());
				if(promName != null){
					String display_falg = promName.substring(0,1);
					if (display_falg.equals("0")){
						continue;
					}
					rpProduct.setItemName(tProduce.getName() + "(" + promName.substring(1) + ")");
				}else
				{
					rpProduct.setItemName(tProduce.getName());
				}
				rpProduct.setItemSubno(tProduce.getItemSubno());
				rpProduct.setBrandId(tProduce.getBrandId());
				rpProduct.setCategoryId(tProduce.getCategoryId());
				rpProduct.setCompanyId(tProduce.getCompanyId());
				rpProduct.setIsPrice(tProduce.getIsPrice());
				rpProduct.setIsFlag(tProduce.getIsFlag());
				rpProduct.setItemAttr(tProduce.getItemAttr());
				rpProduct.setShopId(tProduce.getShopId());
				rpProduct.setStoreId(tProduce.getStoreId());
				rpProduct.setSalePrice(tProduce.getSalePrice());
				list_RpProduct.add(rpProduct);
			}
			resultMap = setResultMap("0","",list_RpProduct);
			logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
			return JsonUtil.objectToString(null, resultMap);
		}
	}

	public String vipQuery(String cdInfo, String billno, String shopId) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.vipQuery(cdInfo,billno,shopId);
	}

	public String czkQuery(String cdInfo, String shopId) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.czkQuery(cdInfo,shopId);
	}

	public String couponQuery(String giftCouponNo, String shopId) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.couponQuery(giftCouponNo);
	}

	public String preSale(String preSaleInfo) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.preSale(preSaleInfo);
	}

	public String sale(String saleInfo) {
		Logger logger = Logger.getLogger(SaleWebServiceImpl.class);
		logger.info("sale请求参数--" + "saleInfo:" + saleInfo);
		ResultMap<SaleResult> resultMap = new ResultMap<SaleResult>();

		//调用远程的WebService销售接口
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		String rtn = port.sale(saleInfo);
		//截取返回到json串中的状态
		Gson gson = new Gson();
		SaleRespon saleRespon = gson.fromJson(rtn,SaleRespon.class);
		if(saleRespon == null){
			resultMap.setStatus("03");
			resultMap.setErrorMsg("情况不明!");
			return JsonUtil.objectToString(null, resultMap);
		}
		if(saleRespon != null && !saleRespon.getStatus().equals("0")){
			resultMap.setStatus(saleRespon.getStatus());
			resultMap.setErrorMsg(saleRespon.getErrmsg());
			return JsonUtil.objectToString(null, resultMap);
		}

		JSONObject json_obj = JSONObject.fromObject(saleInfo);
		// 转换销售单
		JSONObject saleHead_json = json_obj.getJSONObject("saleHead");
		TSale sale = (TSale) JSONObject.toBean(saleHead_json, TSale.class);
		// 转换销售单明细
		JSONArray saleD_json = json_obj.getJSONArray("saleDetail");
		List<TSaleD> saleDList = (List<TSaleD>) JSONArray.toCollection(saleD_json, TSaleD.class);
		//转换销售支付明细
		JSONArray salePay_json = json_obj.getJSONArray("salePay");
		List<TSalePay> salePayList = (List<TSalePay>) JSONArray.toCollection(salePay_json, TSalePay.class);

		//判断销售单号是否已经存在
		String saleNo = sale.getSaleNo();
		if(saleNo == null || saleNo.equals("")){
			resultMap = setResultMap("1","销售流水号不能为空!!",null);
			return JsonUtil.objectToString(null, resultMap);
		}
		//保存销售单
		tSaleService.saveSaleAndDetail(sale, saleDList, salePayList);
//		resultMap = setResultMap("0","",null);
//		return JsonUtil.objectToString(null, resultMap);
		//如果前面没有什么问题,直接返回erp接口的sale成功返回值
		return rtn;
	}

	public String saleQuery(String saleNo, String posId, String shopId, String startDate, String endDate) {
		Logger logger = Logger.getLogger(SaleWebServiceImpl.class);
		logger.info("userVerify请求参数--" + "saleNo:" + saleNo + "posId:" + posId + "shopId:" + shopId + "startDate:" + startDate + "endDate" + endDate );
		//posNo不需要
		QueryMap queryMap = new QueryMap();
		ResultMap<List<SaleQueryResult>> resultMap = new ResultMap<List<SaleQueryResult>>();
		//按照销售单查询
		if (saleNo != null && !saleNo.equals("") && saleNo.length() > 0 ){
			queryMap.put("saleNo",saleNo);
			TSale tSale = tSaleService.getOne(queryMap);
			if(tSale != null){
				queryMap.put("saleNo",saleNo);
				List<TSaleD> tSaleDList = tSaleDService.getList(queryMap);
				queryMap.put("saleNo",saleNo);
				List<TSalePay> tSalePayList = tSalePayService.getList(queryMap);
				List<SaleQueryResult> saleQueryResultList = new ArrayList<SaleQueryResult>();

				SaleQueryResult saleQueryResult = new SaleQueryResult();
				saleQueryResult.setSaleHead(tSale);
				saleQueryResult.setSaleDetail(tSaleDList);
				saleQueryResult.setSalePay(tSalePayList);
				saleQueryResultList.add(saleQueryResult);
				resultMap.setStatus("0");
				resultMap.setErrorMsg("");
				resultMap.setData(saleQueryResultList);
			}else{
				resultMap.setStatus("1");
				resultMap.setErrorMsg("查询不到记录!");
			}

		}else{
//			日期区间查询
			queryMap.put("shopId",shopId);
			queryMap.put("posId",posId);
			queryMap.put("startDate",startDate);
			queryMap.put("endDate",endDate);

			List<TSale> tSales = tSaleService.querySaleByTime(queryMap);
			if(tSales != null){
				List<SaleQueryResult> saleQueryResultList = new ArrayList<SaleQueryResult>();
				for(TSale tSale:tSales){
					SaleQueryResult saleQueryResult = new SaleQueryResult();
					saleQueryResult.setSaleHead(tSale);
					//获取明细
					queryMap.put("saleNo",tSale.getSaleNo());
					List<TSaleD> tSaleDList = tSaleDService.getList(queryMap);
					saleQueryResult.setSaleDetail(tSaleDList);
					//获取支付
					queryMap.put("saleNo",tSale.getSaleNo());
					List<TSalePay> tSalePayList = tSalePayService.getList(queryMap);
					saleQueryResult.setSalePay(tSalePayList);
					saleQueryResultList.add(saleQueryResult);
				}
				resultMap.setStatus("0");
				resultMap.setErrorMsg("");
				resultMap.setData(saleQueryResultList);
			}else{
				resultMap.setStatus("1");
				resultMap.setErrorMsg("查询不到记录!");
			}
		}
		logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
		return JsonUtil.objectToString(null, resultMap);
	}

	public String changePasswd(String shopId, String userId, String oldPasswd, String newPasswd) {
		Logger logger = Logger.getLogger(SaleWebServiceImpl.class);
		logger.info("userVerify请求参数--" + "shopId:" + shopId + "userId:" + userId + "oldPasswd:" + "******" + "newPasswd:" + "******" );
		QueryMap queryMap = new QueryMap();
		ResultMap<String> resultMap = new ResultMap<String>();
		queryMap.put("shopId",shopId);
		queryMap.put("id",userId);
		queryMap.put("passwd",oldPasswd.trim());
		TUser tUser = tUserService.getOne(queryMap);
		if(tUser == null){
			resultMap.setStatus("1");
			resultMap.setErrorMsg("旧密码不正确");
		}else{
			tUser.setPasswd(newPasswd.trim());
			tUserService.update(tUser);
			resultMap.setStatus("0");
			resultMap.setErrorMsg("");
		}

		logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
		return JsonUtil.objectToString(null, resultMap);
	}
	//获取通知
	public String queryNotice() {
		Logger logger = Logger.getLogger(SaleWebServiceImpl.class);
		logger.info("queryNotice请求参数");
		ResultMap<List<TNotice>> resultMap = new ResultMap<List<TNotice>>();
		List<TNotice> list = tNoticeService.getAll();
		if(list != null){
			resultMap.setStatus("0");
			resultMap.setData(list);
		}else{
			resultMap.setStatus("1");
			resultMap.setErrorMsg("无法找到记录");
		}
		logger.info("queryItem返回值--" + JsonUtil.objectToString(null, resultMap) );
		return JsonUtil.objectToString(null, resultMap);
	}
	//退货鉴权
	public String getRtnRight(String userNo, String passwd) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.getRtnRight(userNo,passwd);
	}


	public String makeCoupon(String userNo, String saleNo) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.makeCoupon(userNo,saleNo);
	}

	public String makeJffl(String ckcode, String cardtype, String userNo, double cardjf, double kjjf, double flje) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.makeJffl(ckcode,cardtype,userNo,cardjf,kjjf,flje);
	}


	public String queryJffl(String cdinfo, String billno, String shopId) {
		URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
		PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
		PosWebServiceImpl port = ss.getPosWebServiceImplPort();
		return port.queryJffl(cdinfo,billno,shopId);
	}

	//销售请求的返回值内部使用类
	public class SaleRespon{
		protected String status;
		protected String errmsg;

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrmsg() {
			return errmsg;
		}

		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
	}

}
