package com.site.entity.require;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-04-07.
 * Usage:
 */
@ApiModel(value = "销售单单商品明细",description = "SaleRequireD")
public class SaleRequireD {
    @ApiModelProperty(value = "项次")
    protected Integer item;
    @ApiModelProperty(value = "销售条码")
    protected String pluno;
    @ApiModelProperty(value = "原价")
    protected Double oldprice;
    @ApiModelProperty(value = "售价")
    protected Double price;
    @ApiModelProperty(value = "销售数量")
    protected Double qty;
    @ApiModelProperty(value = "总折扣金额")
    protected Double disc;
    @ApiModelProperty(value = "小计金额(含税)=原价*数量-总折扣金额")
    protected Double amt;
    @ApiModelProperty(value = "小计金额(不含税)")
    protected Double uamt;
    @ApiModelProperty(value = "积分金额")
    protected Double pointqty;
    @ApiModelProperty(value = "税别编号")
    protected String taxcode;
    @ApiModelProperty(value = "销售单位")
    protected String sunit;

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public Double getDisc() {
        return disc;
    }

    public void setDisc(Double disc) {
        this.disc = disc;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Double getOldprice() {
        return oldprice;
    }

    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    public String getPluno() {
        return pluno;
    }

    public void setPluno(String pluno) {
        this.pluno = pluno;
    }

    public Double getPointqty() {
        return pointqty;
    }

    public void setPointqty(Double pointqty) {
        this.pointqty = pointqty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public String getSunit() {
        return sunit;
    }

    public void setSunit(String sunit) {
        this.sunit = sunit;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public Double getUamt() {
        return uamt;
    }

    public void setUamt(Double uamt) {
        this.uamt = uamt;
    }
}
