package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by langrs on 2017-03-23.
 * 登录验证通过以后,返回的基本资料
 */
@ApiModel(value = "用户登录初始化返回数据",description = "VerifyResult")
public class VerifyResult {
    @ApiModelProperty(value = "返回状态:1失败0成功")
    protected String status;
    @ApiModelProperty(value = "失败描述")
    protected String errmsg;
    @ApiModelProperty(value = "基本资料")
    protected VerifyResultPos verifyResultPos;
    @ApiModelProperty(value = "支付方式列表")
    protected List<VerifyResultPayment> verifyResultPayments;

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

    public List<VerifyResultPayment> getVerifyResultPayments() {
        return verifyResultPayments;
    }

    public void setVerifyResultPayments(List<VerifyResultPayment> verifyResultPayments) {
        this.verifyResultPayments = verifyResultPayments;
    }

    public VerifyResultPos getVerifyResultPos() {
        return verifyResultPos;
    }

    public void setVerifyResultPos(VerifyResultPos verifyResultPos) {
        this.verifyResultPos = verifyResultPos;
    }
}
