package com.site.entity;

import com.site.core.base.AbstractModel;

import java.util.Date;

/**
 * Created by langrs on 2016-09-05.
 * 
 */
public class TPromtype  extends AbstractModel<String> {
    private static final long serialVersionUID = 1L;
    private String id;
    private String promtype;
    private String promname;
    private double base;
    private double promvalue;
    private String promflag;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
    private String isFlag;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String getCreateBy() {
        return createBy;
    }

    @Override
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(String isFlag) {
        this.isFlag = isFlag;
    }

    public String getPromflag() {
        return promflag;
    }

    public void setPromflag(String promflag) {
        this.promflag = promflag;
    }

    public String getPromname() {
        return promname;
    }

    public void setPromname(String promname) {
        this.promname = promname;
    }

    public String getPromtype() {
        return promtype;
    }

    public void setPromtype(String promtype) {
        this.promtype = promtype;
    }

    public double getPromvalue() {
        return promvalue;
    }

    public void setPromvalue(double promvalue) {
        this.promvalue = promvalue;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String getUpdateBy() {
        return updateBy;
    }

    @Override
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
