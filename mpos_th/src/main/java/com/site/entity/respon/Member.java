package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-03-19.
 * 会员查询
 */
@ApiModel(value = "会员基本信息",description = "tf_member")
public class Member {
    //会员编号
    @ApiModelProperty(value = "会员编号")
    protected String memberno;
    //卡号
    @ApiModelProperty(value = "卡号")
    protected String cardno;
    //卡等级
    @ApiModelProperty(value = "卡等级")
    protected String membergrade;
    //卡种
    @ApiModelProperty(value = "卡种")
    protected String ctno;
    //卡状态
    @ApiModelProperty(value = "卡状态")
    protected String cardstatus;
    //卡有效期
    @ApiModelProperty(value = "卡有效期")
    protected String  validity;
    //出生日期
    @ApiModelProperty(value = "出生日期")
    protected String birthday;
    //姓名
    @ApiModelProperty(value = "姓名")
    protected String membername;
    //手机
    @ApiModelProperty(value = "手机")
    protected String mobile;
    //地址
    @ApiModelProperty(value = "地址")
    protected String address;
    //昨日积分
    @ApiModelProperty(value = "昨日积分")
    protected Double ypoint;
    //卡内余额
    @ApiModelProperty(value = "卡余额")
    protected double cardvalue;

    public double getCardvalue() {
        return cardvalue;
    }

    public void setCardvalue(double cardvalue) {
        this.cardvalue = cardvalue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCardstatus() {
        return cardstatus;
    }

    public void setCardstatus(String cardstatus) {
        this.cardstatus = cardstatus;
    }

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno;
    }

    public String getMembergrade() {
        return membergrade;
    }

    public void setMembergrade(String membergrade) {
        this.membergrade = membergrade;
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

    public Double getYpoint() {
        return ypoint;
    }

    public void setYpoint(Double ypoint) {
        this.ypoint = ypoint;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}