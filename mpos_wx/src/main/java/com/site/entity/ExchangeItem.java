package com.site.entity;

/**
 * Created by Administrator on 2017-05-20.
 */
public class ExchangeItem {
    protected String itemno;
    protected int qty;
    protected double integral;

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getIntegral() {
        return integral;
    }

    public void setIntegral(double integral) {
        this.integral = integral;
    }
}
