package com.site.entity.entityParm;

/**
 * Created by langrs on 2016-11-12.
 * queryItem的请求参数body
 */
public class RqQueryItem {
    protected String shopId;
    protected String storeId;
    protected String itemNo;
    protected String posNo;

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
}
