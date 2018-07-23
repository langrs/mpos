package com.site.entity.saleResult;

import java.util.List;

/**
 * Created by langrs on 2016-07-13.
 */
public class SaleResult {
    protected SaleResultHeadInfo saleResultHeadInfo;
    protected List<SaleResultCoupons> saleResultCouponsesList;

    public SaleResultHeadInfo getSaleResultHeadInfo() {
        return saleResultHeadInfo;
    }

    public void setSaleResultHeadInfo(SaleResultHeadInfo saleResultHeadInfo) {
        this.saleResultHeadInfo = saleResultHeadInfo;
    }

    public List<SaleResultCoupons> getSaleResultCouponsesList() {
        return saleResultCouponsesList;
    }

    public void setSaleResultCouponsesList(List<SaleResultCoupons> saleResultCouponsesList) {
        this.saleResultCouponsesList = saleResultCouponsesList;
    }


}
