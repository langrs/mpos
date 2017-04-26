package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-04-15.
 * Usage:
 */
@ApiModel(value = "卡查询返回",description = "CardQueryResult")
public class CardQueryResult {
    @ApiModelProperty(value = "返回状态:1失败0成功")
    protected String status;
    @ApiModelProperty(value = "失败描述")
    protected String errmsg;
    @ApiModelProperty(value = "卡号")
    protected String cardno;
    @ApiModelProperty(value = "卡种")
    protected String ctno;
    @ApiModelProperty(value = "有效期")
    protected String validity;
    @ApiModelProperty(value = "会员编号")
    protected String memberno;
    @ApiModelProperty(value = "会员姓名")
    protected String membername;
    @ApiModelProperty(value = "会员手机")
    protected String mobile;
    @ApiModelProperty(value = "剩余积分")
    protected Double points;
    @ApiModelProperty(value = "当前卡余额")
    protected Double amt;
    @ApiModelProperty(value = "是否可抵现:Y或N")
    protected String isdx;
    @ApiModelProperty(value = "最低抵现现金")
    protected Double maxdxamt;
    @ApiModelProperty(value = "可退余额:类型=4时才计算与返回")
    protected Double thamt;
    @ApiModelProperty(value = "可抵积分:类型=6时才计算与返回")
    protected Double dxpoint;
    @ApiModelProperty(value = "可抵金额:类型=6时才计算与返回")
    protected Double dxamt;

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

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno;
    }

    public Double getDxamt() {
        return dxamt;
    }

    public void setDxamt(Double dxamt) {
        this.dxamt = dxamt;
    }

    public Double getDxpoint() {
        return dxpoint;
    }

    public void setDxpoint(Double dxpoint) {
        this.dxpoint = dxpoint;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getIsdx() {
        return isdx;
    }

    public void setIsdx(String isdx) {
        this.isdx = isdx;
    }

    public Double getMaxdxamt() {
        return maxdxamt;
    }

    public void setMaxdxamt(Double maxdxamt) {
        this.maxdxamt = maxdxamt;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getMemberno() {
        return memberno;
    }

    public void setMemberno(String memberno) {
        this.memberno = memberno;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getThamt() {
        return thamt;
    }

    public void setThamt(Double thamt) {
        this.thamt = thamt;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
