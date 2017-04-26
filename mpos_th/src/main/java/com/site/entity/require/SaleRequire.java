package com.site.entity.require;

import com.site.entity.*;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by langrs on 2017-04-07.
 * Usage:
 */
@ApiModel(value = "销售提交数据",description = "SleRequire")
public class SaleRequire {
    @ApiModelProperty(value = "销售单头")
    TdSale tdSale;
    @ApiModelProperty(value = "销售单商品明细")
    List<TdSaleDetail> tdSaleDetails;
    @ApiModelProperty(value = "销售支付明细")
    List<TdSalePay> tdSalePays;
    @ApiModelProperty(value = "满额赠送明细")
    List<TdSalePredetail> tdSalePredetails;
    @ApiModelProperty(value = "折价明细")
    List<TdSaleDetailAgio> tdSaleDetailAgios;

    public TdSale getTdSale() {
        return tdSale;
    }

    public void setTdSale(TdSale tdSale) {
        this.tdSale = tdSale;
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

    public List<TdSalePay> getTdSalePays() {
        return tdSalePays;
    }

    public void setTdSalePays(List<TdSalePay> tdSalePays) {
        this.tdSalePays = tdSalePays;
    }

    public List<TdSalePredetail> getTdSalePredetails() {
        return tdSalePredetails;
    }

    public void setTdSalePredetails(List<TdSalePredetail> tdSalePredetails) {
        this.tdSalePredetails = tdSalePredetails;
    }
}
