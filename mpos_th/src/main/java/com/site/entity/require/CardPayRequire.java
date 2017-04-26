package com.site.entity.require;

import java.util.List;

/**
 * Created by langrs on 2017-04-15.
 * Usage:
 */
public class CardPayRequire {
    //单据类型:1销售单2充值
    protected String type;
    //店号
    protected String shop;
    //单号
    protected String saleno;
    //销售金额(含税)
    protected Double amt;
    //消费卡明细
    List<CardPayCard> cardPayCards;
    //积分明细
    List<CardPayPoint> cardPayPoints;
    //券明细
    List<CardPayCoupon> cardPayCoupons;

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public List<CardPayCard> getCardPayCards() {
        return cardPayCards;
    }

    public void setCardPayCards(List<CardPayCard> cardPayCards) {
        this.cardPayCards = cardPayCards;
    }

    public List<CardPayCoupon> getCardPayCoupons() {
        return cardPayCoupons;
    }

    public void setCardPayCoupons(List<CardPayCoupon> cardPayCoupons) {
        this.cardPayCoupons = cardPayCoupons;
    }

    public List<CardPayPoint> getCardPayPoints() {
        return cardPayPoints;
    }

    public void setCardPayPoints(List<CardPayPoint> cardPayPoints) {
        this.cardPayPoints = cardPayPoints;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}