package com.site.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by langrs on 2016-09-10.
 *
 */
public class TGiftcouponGoods  implements Serializable {
    private String giftcouponno;
    private String shopno;
    private String salecode;
    private String saleno;
    private double giftsum;
    private Integer billstate;
    //券状态:0有效1过期2作废3已经消费
    private Integer giftflag;
    private Date validity;
    //1为积分返利券2为买送买换券
    private String gifttype;

    public String getGifttype() {
        return gifttype;
    }

    public void setGifttype(String gifttype) {
        this.gifttype = gifttype;
    }

    public Integer getBillstate() {
        return billstate;
    }

    public void setBillstate(Integer billstate) {
        this.billstate = billstate;
    }

    public String getGiftcouponno() {
        return giftcouponno;
    }

    public void setGiftcouponno(String giftcouponno) {
        this.giftcouponno = giftcouponno;
    }

    public Integer getGiftflag() {
        return giftflag;
    }

    public void setGiftflag(Integer giftflag) {
        this.giftflag = giftflag;
    }

    public double getGiftsum() {
        return giftsum;
    }

    public void setGiftsum(double giftsum) {
        this.giftsum = giftsum;
    }

    public String getSalecode() {
        return salecode;
    }

    public void setSalecode(String salecode) {
        this.salecode = salecode;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public String getShopno() {
        return shopno;
    }

    public void setShopno(String shopno) {
        this.shopno = shopno;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }
}
