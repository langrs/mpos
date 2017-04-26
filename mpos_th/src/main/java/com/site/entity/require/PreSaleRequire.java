package com.site.entity.require;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by langrs on 2017-03-28.
 * Usage:
 */
@ApiModel(value = "预结算请求",description = "PreSaleRequire")
public class PreSaleRequire {
    @ApiModelProperty(value = "门店")
    protected String shop;
    @ApiModelProperty(value = "会员卡号")
    protected String cardno;
    @ApiModelProperty(value = "销售类型(0、销售单 1、原价退货 2、议价退货)")
    protected String type;
    @ApiModelProperty(value = "商品明细列表")
    private List<PreSaleRequireGoods> preSaleRequireGoodses;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public List<PreSaleRequireGoods> getPreSaleRequireGoodses() {
        return preSaleRequireGoodses;
    }

    public void setPreSaleRequireGoodses(List<PreSaleRequireGoods> preSaleRequireGoodses) {
        this.preSaleRequireGoodses = preSaleRequireGoodses;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
