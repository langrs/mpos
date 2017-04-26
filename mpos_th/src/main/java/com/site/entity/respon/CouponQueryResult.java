package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-04-15.
 * Usage:通过webservice接口返回的券信息
 */
@ApiModel(value = "券查询返回",description = "CouponQueryResult")
public class CouponQueryResult {
    @ApiModelProperty(value = "返回状态:1失败0成功")
    protected String status;
    @ApiModelProperty(value = "失败描述")
    protected String errmsg;
    @ApiModelProperty(value = "券种编号")
    protected String giftctf;
    @ApiModelProperty(value = "券编号")
    protected String couponno;
    @ApiModelProperty(value = "券名称")
    protected String couponname;
    @ApiModelProperty(value = "券金额")
    protected Double amt;
    @ApiModelProperty(value = "券生效日期")
    protected String startdate;
    @ApiModelProperty(value = "券失效日期")
    protected String enddate;

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    public String getCouponno() {
        return couponno;
    }

    public void setCouponno(String couponno) {
        this.couponno = couponno;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getGiftctf() {
        return giftctf;
    }

    public void setGiftctf(String giftctf) {
        this.giftctf = giftctf;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }
}
