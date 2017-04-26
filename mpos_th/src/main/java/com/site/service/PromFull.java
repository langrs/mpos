package com.site.service;

import java.util.List;

/**
 * Created by langrs on 2017-03-30.
 * Usage:
 */
public class PromFull {
    //类型:1打折,2满减,3满赠
    protected String promtype;
    //满额促销单号
    protected String promno;
    //条件组别
    protected Integer CondGroupNO;
    ///////////////////////////////////满额赠送相关/////////////////////////////
    //满额条件
    protected Double condfull;
    //折让基数
    protected Double rebaterate;
    //换赠方式 1.超量  2.倍量
    protected Integer exchangeway;
    //满额赠送条款金额
    protected Double quota;
    //满额赠送类型(送什么东西,例如送卡M,送券等,原字段为type)
    protected String exchangetype;
    //满额赠送东西代码(例如送卡的话,这里存放了卡种,原字段为code)
    protected String exchangecode;
    /////////////////////////////////满额减金额///////////////////////////////////
    //促销值(折扣值)
    protected Double promwayamt;
    //如果有分组条款的话,分组的条款另外放在数组中
    List<PromFull> promFulls;

    public List<PromFull> getPromFulls() {
        return promFulls;
    }

    public void setPromFulls(List<PromFull> promFulls) {
        this.promFulls = promFulls;
    }

    public Double getCondfull() {
        return condfull;
    }

    public void setCondfull(Double condfull) {
        this.condfull = condfull;
    }

    public Integer getCondGroupNO() {
        return CondGroupNO;
    }

    public void setCondGroupNO(Integer condGroupNO) {
        CondGroupNO = condGroupNO;
    }

    public String getExchangecode() {
        return exchangecode;
    }

    public void setExchangecode(String exchangecode) {
        this.exchangecode = exchangecode;
    }

    public String getExchangetype() {
        return exchangetype;
    }

    public void setExchangetype(String exchangetype) {
        this.exchangetype = exchangetype;
    }

    public Integer getExchangeway() {
        return exchangeway;
    }

    public void setExchangeway(Integer exchangeway) {
        this.exchangeway = exchangeway;
    }



    public String getPromno() {
        return promno;
    }

    public void setPromno(String promno) {
        this.promno = promno;
    }

    public String getPromtype() {
        return promtype;
    }

    public void setPromtype(String promtype) {
        this.promtype = promtype;
    }

    public Double getPromwayamt() {
        return promwayamt;
    }

    public void setPromwayamt(Double promwayamt) {
        this.promwayamt = promwayamt;
    }

    public Double getQuota() {
        return quota;
    }

    public void setQuota(Double quota) {
        this.quota = quota;
    }

    public Double getRebaterate() {
        return rebaterate;
    }

    public void setRebaterate(Double rebaterate) {
        this.rebaterate = rebaterate;
    }
}
