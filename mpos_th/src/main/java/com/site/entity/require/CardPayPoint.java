package com.site.entity.require;

/**
 * Created by langrs on 2017-04-15.
 * Usage:积分
 */
public class CardPayPoint {
    //异动类型,A销售单，B.积点抵现
    protected String type;
    //卡号
    protected String cardno;
    //异动金额,正负表示，正数表累计计算，负数表示扣减计算
    protected Double amt;
    //异动积分,正负表示，正数表累计计算，负数表示扣减计算
    protected Double point;
    //剩余积分
    protected Double point1;
    //uuid
    protected String guid;

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPoint1() {
        return point1;
    }

    public void setPoint1(Double point1) {
        this.point1 = point1;
    }
}
