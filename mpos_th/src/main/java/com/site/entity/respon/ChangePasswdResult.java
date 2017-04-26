package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by langrs on 2017-03-26.
 * Usage:
 */
@ApiModel(value = "修改密码结果",description ="ChangePasswdResult" )
public class ChangePasswdResult {
    @ApiModelProperty(value = "返回状态:1失败0成功")
    protected String status;
    @ApiModelProperty(value = "失败描述")
    protected String errmsg;

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
}
