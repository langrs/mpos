package com.site.entity;

/**
 * Created by langrs on 2016-07-07.
 */
public class PreSaleHeadInfo {
    protected String companyId;
    protected String shopId;
    protected String posId;
    protected String userId;
    //交易类型
    protected String dealType;
    //卡类型
    protected String vipType;
    //会员卡号
    protected  String vipNo;
    //预结算单号
    protected String preSaleNo;
    //是否允许会员折扣
    protected String vipFlag;

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipNo() {
        return vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo;
    }

    public String getPreSaleNo() {
        return preSaleNo;
    }

    public void setPreSaleNo(String preSaleNo) {
        this.preSaleNo = preSaleNo;
    }

    public String getVipFlag() {
        return vipFlag;
    }

    public void setVipFlag(String vipFlag) {
        this.vipFlag = vipFlag;
    }
}
