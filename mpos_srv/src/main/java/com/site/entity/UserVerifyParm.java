package com.site.entity;

/**
 * Created by langrs on 2016-11-10.
 */
public class UserVerifyParm {
    protected String userNo;
    protected String passwd;
    protected String mac;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
