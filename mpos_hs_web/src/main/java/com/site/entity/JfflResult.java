package com.site.entity;

/**
 * Created by langrs on 2016-09-12.
 */
public class JfflResult {
    private String ckcode;
    private String lmcode;
    private String cust_mobile;
    private String cust_name;
    private String cardtype;
    private String cardstatus;
    //积分
    private double cardjf;
    //扣减积分
    private double kjjf;
    //返利金额
    private double flje;

    public double getCardjf() {
        return cardjf;
    }

    public void setCardjf(double cardjf) {
        this.cardjf = cardjf;
    }

    public String getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(String cardstatus) {
        this.cardstatus = cardstatus;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCkcode() {
        return ckcode;
    }

    public void setCkcode(String ckcode) {
        this.ckcode = ckcode;
    }

    public String getCust_mobile() {
        return cust_mobile;
    }

    public void setCust_mobile(String cust_mobile) {
        this.cust_mobile = cust_mobile;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public double getFlje() {
        return flje;
    }

    public void setFlje(double flje) {
        this.flje = flje;
    }

    public double getKjjf() {
        return kjjf;
    }

    public void setKjjf(double kjjf) {
        this.kjjf = kjjf;
    }

    public String getLmcode() {
        return lmcode;
    }

    public void setLmcode(String lmcode) {
        this.lmcode = lmcode;
    }
}
