package com.site.webService;

/**
 * Created by langrs on 2016-07-04.
 *
 */

public interface PosWebService {
    //会员卡查询
    String vipQuery(String cdinfo,String billno,String shopId);
    String czkQuery(String cdinfo,String shopId);
    String couponQuery(String couponNo);
    String preSale(String saleInfo);
    String sale(String saleInfo);
    String queryPromName(String itemNo);
    //销售单返券
    String makeCoupon(String userNo,String saleNo);
    //积分返利预查询
    String queryJffl(String cdinfo,String billno,String shopId);
    //积分返利
    String makeJffl(String ckcode,String cardtype,String userNo,double cardjf,double kjjf,double flje );
    //校验退货权限
    String getRtnRight(String userNo, String passwd);
}
