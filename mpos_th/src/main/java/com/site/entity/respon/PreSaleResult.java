package com.site.entity.respon;

import com.site.entity.*;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by langrs on 2017-04-07.
 * Usage:
 */
@ApiModel(value = "预结算返回",description = "PreSaleResult")
public class PreSaleResult {
    @ApiModelProperty(value = "返回状态:1失败0成功")
    protected String status;
    @ApiModelProperty(value = "失败描述")
    protected String errmsg;
    @ApiModelProperty(value = "销售条码明细")
    List<TdSaleDetail> tdSaleDetails;
    @ApiModelProperty(value = "赠送明细")
    List<TdSalePredetail> tdSalePredetails;
    @ApiModelProperty(value = "折价明细")
    List<TdSaleDetailAgio> tdSaleDetailAgios;
    @ApiModelProperty(value = "收卡限制规则明细,如果卡种不在该规则中,则不做限制收取")
    List<TfCardRuleAmt> tfCardRuleAmts;
    @ApiModelProperty(value = "收券限制规则明细,如果券种不在该规则中,在不做限制收取")
    List<TaCouponRuleAmt> taCouponRuleAmts;

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

    public List<TdSaleDetailAgio> getTdSaleDetailAgios() {
        return tdSaleDetailAgios;
    }

    public void setTdSaleDetailAgios(List<TdSaleDetailAgio> tdSaleDetailAgios) {
        this.tdSaleDetailAgios = tdSaleDetailAgios;
    }

    public List<TdSaleDetail> getTdSaleDetails() {
        return tdSaleDetails;
    }

    public void setTdSaleDetails(List<TdSaleDetail> tdSaleDetails) {
        this.tdSaleDetails = tdSaleDetails;
    }

    public List<TdSalePredetail> getTdSalePredetails() {
        return tdSalePredetails;
    }

    public void setTdSalePredetails(List<TdSalePredetail> tdSalePredetails) {
        this.tdSalePredetails = tdSalePredetails;
    }
}
