package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by langrs on 2017-03-26.
 * Usage:
 */
@ApiModel(value = "会员卡基本资料",description = "Member")
public class VipQueryResult {
    @ApiModelProperty(value = "返回状态:1失败0成功")
    protected String status;
    @ApiModelProperty(value = "失败描述")
    protected String errmsg;
    @ApiModelProperty(value = "会员卡基本信息")
    protected List<Member> members;

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
