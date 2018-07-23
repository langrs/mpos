package com.site.entity;

import java.util.Date;

/**
 * Created by langrs on 2016-07-13.
 */
public class SaleResultCoupons {
    protected String couponNo;
    protected Double couponValue;
    protected String state;
    protected Date endDate;

    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    public Double getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(Double couponValue) {
        this.couponValue = couponValue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
