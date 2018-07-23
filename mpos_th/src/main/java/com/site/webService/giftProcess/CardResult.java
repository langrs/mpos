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
    protected String amt;
    @ApiModelProperty(value = "折扣金额")
    protected String discamt;
    @ApiModelProperty(value = "加值金额")
    protected String addval;

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

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getDiscamt() {
        return discamt;
    }

    public void setDiscamt(String discamt) {
        this.discamt = discamt;
    }

    public String getAddval() {
        return addval;
    }

    public void setAddval(String addval) {
        this.addval = addval;
    }
}
