package com.site.entity.require;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-03-28.
 * Usage:
 */
@ApiModel(value = "预结算请求商品明细",description = "PreSaleRequireGoods")
public class PreSaleRequireGoods {
    @ApiModelProperty(value = "商品项次(序号)")
    protected Integer item;
    @ApiModelProperty(value = "商品条码")
    protected String pluno;
    @ApiModelProperty(value = "原价")
    protected Double oldprice;
    @ApiModelProperty("数量")
    protected Double qty;
    @ApiModelProperty("专柜编码")
    protected String counterno;

    public String getCounterno() {
        return counterno;
    }

    public void setCounterno(String counterno) {
        this.counterno = counterno;
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

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }
}
