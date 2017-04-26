package com.site.entity.require;

/**
 * Created by langrs on 2017-04-15.
 * Usage:
 */
public class CardPayCoupon {
    //券状态更改,4.发售，5.发售退回，6.已使用
    protected String type;
    //开始券号
    protected String couponnos;
    //截止券号
    protected String couponnoe;
    //uuid
    protected String guid;

    public String getCouponnoe() {
        return couponnoe;
    }

    public void setCouponnoe(String couponnoe) {
        this.couponnoe = couponnoe;
    }

    public String getCouponnos() {
        return couponnos;
    }

    public void setCouponnos(String couponnos) {
        this.couponnos = couponnos;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
