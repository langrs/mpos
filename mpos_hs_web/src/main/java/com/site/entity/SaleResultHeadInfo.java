package com.site.entity;

import java.util.Date;

/**
 * Created by langrs on 2016-07-13.
 */
public class SaleResultHeadInfo {
    protected String saleNo;
    protected Date saleDate;
    protected Double originalPoints;
    protected Double salePoints;

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Double getOriginalPoints() {
        return originalPoints;
    }

    public void setOriginalPoints(Double originalPoints) {
        this.originalPoints = originalPoints;
    }

    public Double getSalePoints() {
        return salePoints;
    }

    public void setSalePoints(Double salePoints) {
        this.salePoints = salePoints;
    }
}
