package com.site.entity.saleResult;

import com.site.entity.TSale;
import com.site.entity.TSaleD;
import com.site.entity.TSalePay;

import java.io.Serializable;
import java.util.List;

/**
 * Created by langrs on 2016-08-25.
 */
public class SaleQueryResult implements Serializable {
    private TSale saleHead;
    private List<TSaleD> saleDetail;
    private List<TSalePay> salePay;

    public List<TSaleD> getSaleDetail() {
        return saleDetail;
    }

    public void setSaleDetail(List<TSaleD> saleDetail) {
        this.saleDetail = saleDetail;
    }

    public TSale getSaleHead() {
        return saleHead;
    }

    public void setSaleHead(TSale saleHead) {
        this.saleHead = saleHead;
    }

    public List<TSalePay> getSalePay() {
        return salePay;
    }

    public void setSalePay(List<TSalePay> salePay) {
        this.salePay = salePay;
    }
}
