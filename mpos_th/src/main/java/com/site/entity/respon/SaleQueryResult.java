package com.site.entity.respon;

import com.site.entity.TdSale;
import com.site.entity.TdSaleDetail;
import com.site.entity.TdSalePay;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by langrs on 2017-03-15.
 * 所有的销售信息合集
 */
@ApiModel(value = "销售单查询",description = "SaleQueryResult")
public class SaleQueryResult {
    @ApiModelProperty(value = "单头")
    protected TdSale tdSale;
    @ApiModelProperty(value = "销售单明细")
    protected List<TdSaleDetail> tdSaleDetails;
    @ApiModelProperty(value = "销售单支付明细")
    protected List<TdSalePay> tdSalePays;


    public TdSale getTdSale() {
        return tdSale;
    }

    public void setTdSale(TdSale tdSale) {
        this.tdSale = tdSale;
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
}
