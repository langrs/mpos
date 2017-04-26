package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-03-23.
 * 支付方式
 */
@ApiModel(value = "支付方式",description = "VerifyResultPayment")
public class VerifyResultPayment {
    @ApiModelProperty(value = "ERP款别编号")
    protected String erppayNo;
    @ApiModelProperty(value = "支付方式")
    protected String paycode;
    @ApiModelProperty(value = "支付名称")
    protected String payname;
    @ApiModelProperty(value = "是否可找零")
    protected String paych;
    @ApiModelProperty(value = "是否可溢收")
    protected String spill;
    @ApiModelProperty(value = "支付类型")
    protected String paycodeerp;

    public String getErppayNo() {
        return erppayNo;
    }

    public void setErppayNo(String erppayNo) {
        this.erppayNo = erppayNo;
    }

    public String getPaych() {
        return paych;
    }

    public void setPaych(String paych) {
        this.paych = paych;
    }

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public String getPaycodeerp() {
        return paycodeerp;
    }

    public void setPaycodeerp(String paycodeerp) {
        this.paycodeerp = paycodeerp;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname;
    }

    public String getSpill() {
        return spill;
    }

    public void setSpill(String spill) {
        this.spill = spill;
    }
}
