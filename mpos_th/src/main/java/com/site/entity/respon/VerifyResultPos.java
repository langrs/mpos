package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-03-23.
 * 用户登录后返回的信息
 */
@ApiModel(value = "基本资料",description = "VerifyResultPos")
public class VerifyResultPos {
    //门店信息
    @ApiModelProperty(value = "门店编码")
    protected String shop;
    @ApiModelProperty(value = "组织编码")
    protected String organizationno;
    @ApiModelProperty(value = "门店名称")
    protected String shopname;
    @ApiModelProperty(value = "地址")
    protected String address;
    @ApiModelProperty(value = "电话")
    protected String telephone;
    @ApiModelProperty(value = "员工信息")
    protected String opno;
    @ApiModelProperty(value = "员工名称")
    protected String opname;
    @ApiModelProperty(value = "员工所属组")
    protected String opgroup;
    @ApiModelProperty(value = "专柜编码")
    protected String counterno;
    @ApiModelProperty(value = "专柜名称")
    protected String countername;
    @ApiModelProperty(value = "专柜实行会员最低折扣率")
    //会员最低折扣率(实行会员折扣时,商品不能低于这个折扣)
    protected Integer ldisc;
    @ApiModelProperty(value = "收银机编码")
    protected String machine;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountername() {
        return countername;
    }

    public void setCountername(String countername) {
        this.countername = countername;
    }

    public String getCounterno() {
        return counterno;
    }

    public void setCounterno(String counterno) {
        this.counterno = counterno;
    }

    public Integer getLdisc() {
        return ldisc;
    }

    public void setLdisc(Integer ldisc) {
        this.ldisc = ldisc;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getOpgroup() {
        return opgroup;
    }

    public void setOpgroup(String opgroup) {
        this.opgroup = opgroup;
    }

    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname;
    }

    public String getOpno() {
        return opno;
    }

    public void setOpno(String opno) {
        this.opno = opno;
    }

    public String getOrganizationno() {
        return organizationno;
    }

    public void setOrganizationno(String organizationno) {
        this.organizationno = organizationno;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
