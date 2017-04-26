package com.site.entity.respon;

import com.site.entity.require.CardPayCard;
import com.site.entity.require.CardPayCoupon;
import com.site.entity.require.CardPayPoint;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by langrs on 2017-04-15.
 * Usage:卡支付返回信息
 */
public class CardPayResult {
    @ApiModelProperty(value = "返回状态:1失败0成功")
    protected String status;
    @ApiModelProperty(value = "失败描述")
    protected String errmsg;
    //卡支付明细
    protected List<CardPayCard> cardPayCards;
    //积分明细
    protected List<CardPayPoint> cardPayPoints;
    //券消费明细
    protected List<CardPayCoupon> cardPayCoupons;

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

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
