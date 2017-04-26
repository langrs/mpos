package com.site.webService.giftProcess;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017/4/26.
 */
@ApiModel(value = "赠送卡",description = "CardResult")
public class CardResult {
    @ApiModelProperty(value = "卡状态")
    protected String type;
    @ApiModelProperty(value = "卡号")
    protected String cardno;
    @ApiModelProperty(value = "卡发行方式")
    protected String issue;
    @ApiModelProperty(value = "密码")
    protected String passwd;
    @ApiModelProperty(value = "实际异动金额")
    protected Double amt;
    @ApiModelProperty(value = "折扣金额")
    protected Double discamt;
    @ApiModelProperty(value = "加值金额")
    protected Double addval;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public Double getDiscamt() {
        return discamt;
    }

    public void setDiscamt(Double discamt) {
        this.discamt = discamt;
    }

    public Double getAddval() {
        return addval;
    }

    public void setAddval(Double addval) {
        this.addval = addval;
    }
}
