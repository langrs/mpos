package com.site.service;

import com.site.entity.Coupon;
import com.site.entity.JfflResult;

/**
 * Created by langrs on 2016-09-12.
 *
 */
public interface CouponService {
    JfflResult queryJffl(String cdinfo,String billno,String shopId);
    Coupon makeJffl(String ckcode, String cardtype, String userNo, double cardjf, double kjjf, double flje );
    Coupon makeCoupon(String userNo, String saleNo);
    String getRtnRight(String userNo,String passwd);
}
