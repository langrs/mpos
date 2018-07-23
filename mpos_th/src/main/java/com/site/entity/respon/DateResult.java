package com.site.entity.respon;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017-05-02.
 */
@ApiModel(value = "当前日期时间",description = "DateResult")
public class DateResult {
    @ApiModelProperty(value = "时间")
    protected String dateResult;

    public String getDateResult() {
        return dateResult;
    }

    public void setDateResult(String dateResult) {
        this.dateResult = dateResult;
    }
}
