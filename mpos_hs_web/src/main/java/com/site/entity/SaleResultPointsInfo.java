package com.site.entity;

/**
 * Created by langrs on 2016-07-13.
 */
public class SaleResultPointsInfo {
    protected String itemId;
    protected int rowNo;
    protected Double points;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }
}
