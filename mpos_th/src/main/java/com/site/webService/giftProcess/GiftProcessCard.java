package com.site.webService.giftProcess;

import com.site.webService.SingleCouponGet.SingleCouponGetField;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public class GiftProcessCard {
    protected List<SingleCouponGetField> Field;

    public List<SingleCouponGetField> getField() {
        return Field;
    }

    public void setField(List<SingleCouponGetField> field) {
        Field = field;
    }
}
