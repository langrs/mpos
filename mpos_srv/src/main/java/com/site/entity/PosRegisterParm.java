package com.site.entity;

/**
 * Created by langrs on 2016-11-09.
 * 收银机注册参数
 */
public class PosRegisterParm {

    protected String storeNo;
    protected String mac;
    protected String posNo;
    protected String posType;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType;
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }
}
