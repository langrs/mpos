package com.site.webService;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface SaleWebService {
	//终端注册
	String posRegister(
			@WebParam(name = "shopNo") String shopNo,
			@WebParam(name = "storeNo") String storeNo,
			@WebParam(name = "cashierNo") String cashierNo,
			@WebParam(name = "mac") String mac,
			@WebParam(name = "posNo") String posNo
	);
	//用户验证
	String userVerify(
			@WebParam(name = "userNo") String userNo,
			@WebParam(name = "passwd") String passwd,
			@WebParam(name = "mac") String mac,
			@WebParam(name = "posNo") String posNo
	);
	
	//商品查询
	String queryItem(
			@WebParam(name = "shopId") String shopId,
			@WebParam(name = "storeId") String storeId,
			@WebParam(name = "itemNo") String itemNo,
			@WebParam(name = "posNo") String posNo
	);
	//会员卡查询
	String vipQuery(
			@WebParam(name="cdInfo")String cdInfo,
			@WebParam(name="billno")String billno,
			@WebParam(name="shopId")String shopId
	);
	//储值卡查询
	String czkQuery(
			@WebParam(name = "cdInfo")String cdInfo,
			@WebParam(name="shopId")String shopId
	);
	//礼券查询
	String couponQuery(
			@WebParam(name = "giftCouponNo")String giftCouponNo,
			@WebParam(name = "shopId")String shopId
	);

	//预结算
	String preSale(
			@WebParam(name = "preSaleInfo")String preSaleInfo
	);

	//结算
	String sale(@WebParam(name = "saleInfo") String saleInfo);

	//查询
	String saleQuery(
	@WebParam(name="saleNo") String saleNo,
	@WebParam(name="posId")String posId,
	@WebParam(name="shopId")String shopId,
	@WebParam(name="startDate")String startDate,
	@WebParam(name="endDate")String endDate
	);
	//修改密码
	String changePasswd(
			@WebParam(name="shopId")String shopId,
			@WebParam(name="userId")String userId,
			@WebParam(name="oldPasswd")String oldPasswd,
			@WebParam(name="newPasswd")String newPasswd
	);
	//获取通知
	String queryNotice();
	//校验退货权限
	String getRtnRight(
			@WebParam(name="userNo")String userNo,
			@WebParam(name="passwd")String passwd
	);
	//销售单返券
	String makeCoupon(
			@WebParam(name="userNo")String userNo,
			@WebParam(name="saleNo")String saleNo
	);
	//积分返利预查询
	String queryJffl(
			@WebParam(name="cdinfo")String cdinfo,
			@WebParam(name="billno")String billno,
			@WebParam(name="shopId")String shopId
	);
	//积分返利
	String makeJffl(
			@WebParam(name="ckcode")String ckcode,
			@WebParam(name="cardtype")String cardtype,
			@WebParam(name="userNo")String userNo,
			@WebParam(name="cardjf")double cardjf,
			@WebParam(name="kjjf")double kjjf,
			@WebParam(name="flje")double flje
	);
}
