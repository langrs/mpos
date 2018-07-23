package com.site.entity.entityParm;

/**
 * Created by langrs on 2016-11-13.
 */
public class RqVipQuery {
    protected String cdInfo;
    protected String billno;
    protected String shopId;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getCdInfo() {
        return cdInfo;
    }

    public void setCdInfo(String cdInfo) {
        this.cdInfo = cdInfo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
