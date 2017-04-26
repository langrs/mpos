package com.site.service;

import com.site.entity.TaCouponRuleAmt;
import com.site.entity.TfCardRuleAmt;

import java.util.List;

/**
 * Created by langrs on 2017-03-28.
 * Usage:把促销的条码列表List<PromPlu>和满额促销条件列表List<PromFull>放在一起进行计算处理
 */
public class PromInfo {
    //销售单类型:0、销售单 1、原价退货 2、议价退货
    protected String type;
    //门店
    protected String shop;
    //会员卡号
    protected String cardno;
    //会员卡等级
    protected String membergrade;
    //卡种
    protected String ctno;
    //商品明细列表
    private List<PromPlu> promPlus;
    //限制收卡规则
    List<TfCardRuleAmt> tfCardRuleAmts;
    //限制收取券规则
    List<TaCouponRuleAmt> taCouponRuleAmts;

    //满额促销列表(一般促销不需要通过列表另外处理了,因为一般促销都是针对单个条码设置的促销条件)
    private List<PromFull> promFulls;

    public List<PromFull> getPromFulls() {
        return promFulls;
    }

    public void setPromFulls(List<PromFull> promFulls) {
        this.promFulls = promFulls;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno;
    }

    public String getMembergrade() {
        return membergrade;
    }

    public void setMembergrade(String membergrade) {
        this.membergrade = membergrade;
    }

    public List<PromPlu> getPromPlus() {
        return promPlus;
    }

    public void setPromPlus(List<PromPlu> promPlus) {
        this.promPlus = promPlus;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<TaCouponRuleAmt> getTaCouponRuleAmts() {
        return taCouponRuleAmts;
    }

    public void setTaCouponRuleAmts(List<TaCouponRuleAmt> taCouponRuleAmts) {
        this.taCouponRuleAmts = taCouponRuleAmts;
    }

    public List<TfCardRuleAmt> getTfCardRuleAmts() {
        return tfCardRuleAmts;
    }

    public void setTfCardRuleAmts(List<TfCardRuleAmt> tfCardRuleAmts) {
        this.tfCardRuleAmts = tfCardRuleAmts;
    }
}
