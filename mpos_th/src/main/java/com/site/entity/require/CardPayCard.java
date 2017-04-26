package com.site.entity.require;

/**
 * Created by langrs on 2017-04-15.
 * Usage:支付的卡信息
 */
public class CardPayCard {
    //卡号
    protected String cardno;
    //密码
    protected String cardpasswd;
    //校验码,异动金额>0则验证不允许空白，否则报错
    protected String jym;
    //异动金额,可正数与负数表示付款还是退款
    protected Double amt;
    //期末储值金额/余额
    protected Double amt1;
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

    public String getCardpasswd() {
        return cardpasswd;
    }

    public void setCardpasswd(String cardpasswd) {
        this.cardpasswd = cardpasswd;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym;
    }

    public Double getAmt1() {
        return amt1;
    }

    public void setAmt1(Double amt1) {
        this.amt1 = amt1;
    }
}
