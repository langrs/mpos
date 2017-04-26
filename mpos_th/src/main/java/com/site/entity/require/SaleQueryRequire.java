package com.site.entity.require;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-04-14.
 * Usage:
 */
@ApiModel(value = "销售查询条件",description = "SaleQueryRequire")
public class SaleQueryRequire {
    @ApiModelProperty(value = "分店(必填)")
    protected String shop;
    @ApiModelProperty(value = "销售单号(如果销售单号不为空,则只按销售单号检索,否则按其他条件组合检索)")
    protected String saleno;
    @ApiModelProperty(value = "POS机号")
    protected String machine;
    @ApiModelProperty(value = "开始日期")
    protected String startdate;
    @ApiModelProperty(value = "结束日期(检索记录包括结束日期当天的销售记录)")
    protected String enddate;

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }
}
