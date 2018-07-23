package com.site.entity;

import com.site.core.base.AbstractModel;

/**
 * Created by Administrator on 2017-07-03.
 */
public class TStoreDouble extends AbstractModel<String> {
    private static final long serialVersionUID = 1L;
    // ID
    protected String id;
    //主专柜
    protected String storeIdMain;
    //副专柜
    protected String storeIdSecond;
    //类型
    protected  String storeType;

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreIdMain() {
        return storeIdMain;
    }

    public void setStoreIdMain(String storeIdMain) {
        this.storeIdMain = storeIdMain;
    }

    public String getStoreIdSecond() {
        return storeIdSecond;
    }

    public void setStoreIdSecond(String storeIdSecond) {

        this.storeIdSecond = storeIdSecond;
    }

}
