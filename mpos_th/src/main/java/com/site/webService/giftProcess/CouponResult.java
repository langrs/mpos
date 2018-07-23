package com.site.webService.giftProcess;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017/4/26.
 */
@ApiModel(value = "赠券信息",description = "CouponResult")
public class CouponResult {
    @ApiModelProperty(value = "流转状态")
    protected String type;
    @ApiModelProperty(value = "券发行方式")
    protected String issue;
    @ApiModelProperty(value = "券种编号")
    protected String ctno;
    @ApiModelProperty(value ="面值")
    protected String amt;
    @ApiModelProperty(value = "券号")
    protected String couponno;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getCouponno() {
        return couponno;
    }

    public void setCouponno(String couponno) {
        this.couponno = couponno;
    }
}
