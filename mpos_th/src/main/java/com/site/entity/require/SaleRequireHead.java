package com.site.entity.require;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-04-07.
 * Usage:
 */
@ApiModel(value = "销售单头",description = "SaleRequireHead")
public class SaleRequireHead {
//    @ApiModelProperty(value = "组织")
//    protected String organizationno;;
    @ApiModelProperty(value = "门店")
    protected String shop;
    @ApiModelProperty(value = "会员卡号")
    protected String cardno;
    @ApiModelProperty(value = "来源单号")
    protected String ofno;
    @ApiModelProperty(value = "积分")
    protected Double pointqty;
    @ApiModelProperty(value = "总销售金额(含税)")
    protected Double totamt;
    @ApiModelProperty(value = "销售单号")
    protected String saleno;
    @ApiModelProperty(value = "销售日期:20170503")
    protected String sdate;
    @ApiModelProperty(value = "销售时间:220712")
    protected String stime;
    @ApiModelProperty(value = "机号")
    protected String machine;
    @ApiModelProperty(value = "用户")
    protected String opno;
    @ApiModelProperty(value = "销售单类型:0、销售单 1、原价退货 2、议价退货3、订单 4、退订单")
    protected Integer type;
    @ApiModelProperty(value = "原销售日期:退货使用")
    protected String returndate;

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getOfno() {
        return ofno;
    }

    public void setOfno(String ofno) {
        this.ofno = ofno;
    }

    public String getOpno() {
        return opno;
    }

    public void setOpno(String opno) {
        this.opno = opno;
    }

    public Double getPointqty() {
        return pointqty;
    }

    public void setPointqty(Double pointqty) {
        this.pointqty = pointqty;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public Double getTotamt() {
        return totamt;
    }

    public void setTotamt(Double totamt) {
        this.totamt = totamt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
