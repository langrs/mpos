package com.site.entity;  
  
import java.io.Serializable;
import java.util.Date;

/**
* 对象功能:TSaleD Entity对象
* 开发公司:SZUNIC
* 开发人员:LZM
*/

public class TSaleD implements Serializable//extends AbstractModel<String>
{
   private static final long serialVersionUID = 1L;
   // ID
   protected String id;
   // 主表ID
   protected String saleId;
   // 销售流水号
   protected String saleNo;
   // 销售日期
   protected Date saleDate;
   // 序号
   protected String rowNo;
   // 公司ID
   protected String companyId;
   // 分店
   protected String shopId;
   // 商铺
   protected String storeId;
   // 商品
   protected String itemId;
   // 商品编码
   protected String itemNo;
   // 销售数量
   protected Double saleNum;
   // 商品单价
   protected Double salePrice;
   // 商品折后单价
   protected Double salePriceReal;
   //查询类型
   protected String promTypeId;
   // 税率
   protected Double taxRate;
   // 税金
   protected Double taxAmt;
   // 单品打折率
   protected Double itemDisc;
   // 单品打折金额
   protected Double itemDiscAmt;
   // 整单打折率
   protected Double billDist;
   // 整单打折金额
   protected Double billDiscAmt;
   // 会员打折率
   protected Double vipDisc;
   // 会员打折金额
   protected Double vipDiscAmt;
   // 促销打折率
   protected Double promDisc;
   // 促销打折金额
   protected Double promDiscAmt;
   // 其他打折率
   protected Double otherDisc;
   // 其他打折金额
   protected Double otherDiscAmt;
   // 满减优惠金额
   protected Double reduceAmt;
   // 会员价优惠金额
   protected Double vipPriceAmt;
   // 优惠总金额
   protected Double allDistAmt;
   // 销售总价
   protected Double itemSaleAmt;
   // 销售积分
   protected Double points;
   // 退货标志
   protected String retFlag;
   // 已退金额
   protected Double retAmt;
   // 上传标志
   protected String upFlag;
   // 上传日期
   protected Date upDate;

   public String getPromTypeId() {
      return promTypeId;
   }

   public void setPromTypeId(String promTypeId) {
      this.promTypeId = promTypeId;
   }

   public void setId(String id)
   {
       this.id = id;
   }
   public String getId()
   {
       return this.id;
   }
   public void setSaleId(String saleId)
   {
       this.saleId = saleId;
   }
   public String getSaleId()
   {
       return this.saleId;
   }
   public void setSaleNo(String saleNo)
   {
       this.saleNo = saleNo;
   }
   public String getSaleNo()
   {
       return this.saleNo;
   }
   public void setSaleDate(Date saleDate)
   {
       this.saleDate = saleDate;
   }
   public Date getSaleDate()
   {
       return this.saleDate;
   }
   public void setRowNo(String rowNo)
   {
       this.rowNo = rowNo;
   }
   public String getRowNo()
   {
       return this.rowNo;
   }
   public void setCompanyId(String companyId)
   {
       this.companyId = companyId;
   }
   public String getCompanyId()
   {
       return this.companyId;
   }
   public void setShopId(String shopId)
   {
       this.shopId = shopId;
   }
   public String getShopId()
   {
       return this.shopId;
   }
   public void setStoreId(String storeId)
   {
       this.storeId = storeId;
   }
   public String getStoreId()
   {
       return this.storeId;
   }
   public void setItemId(String itemId)
   {
       this.itemId = itemId;
   }
   public String getItemId()
   {
       return this.itemId;
   }
   public void setItemNo(String itemNo)
   {
       this.itemNo = itemNo;
   }
   public String getItemNo()
   {
       return this.itemNo;
   }
   public void setSaleNum(Double saleNum)
   {
       this.saleNum = saleNum;
   }
   public Double getSaleNum()
   {
       return this.saleNum;
   }
   public void setSalePrice(Double salePrice)
   {
       this.salePrice = salePrice;
   }
   public Double getSalePrice()
   {
       return this.salePrice;
   }
   public void setSalePriceReal(Double salePriceReal)
   {
       this.salePriceReal = salePriceReal;
   }
   public Double getSalePriceReal()
   {
       return this.salePriceReal;
   }
   public void setTaxRate(Double taxRate)
   {
       this.taxRate = taxRate;
   }
   public Double getTaxRate()
   {
       return this.taxRate;
   }
   public void setTaxAmt(Double taxAmt)
   {
       this.taxAmt = taxAmt;
   }
   public Double getTaxAmt()
   {
       return this.taxAmt;
   }
   public void setItemDisc(Double itemDisc)
   {
       this.itemDisc = itemDisc;
   }
   public Double getItemDisc()
   {
       return this.itemDisc;
   }
   public void setItemDiscAmt(Double itemDiscAmt)
   {
       this.itemDiscAmt = itemDiscAmt;
   }
   public Double getItemDiscAmt()
   {
       return this.itemDiscAmt;
   }
   public void setBillDist(Double billDist)
   {
       this.billDist = billDist;
   }
   public Double getBillDist()
   {
       return this.billDist;
   }
   public void setBillDiscAmt(Double billDiscAmt)
   {
       this.billDiscAmt = billDiscAmt;
   }
   public Double getBillDiscAmt()
   {
       return this.billDiscAmt;
   }
   public void setVipDisc(Double vipDisc)
   {
       this.vipDisc = vipDisc;
   }
   public Double getVipDisc()
   {
       return this.vipDisc;
   }
   public void setVipDiscAmt(Double vipDiscAmt)
   {
       this.vipDiscAmt = vipDiscAmt;
   }
   public Double getVipDiscAmt()
   {
       return this.vipDiscAmt;
   }
   public void setPromDisc(Double promDisc)
   {
       this.promDisc = promDisc;
   }
   public Double getPromDisc()
   {
       return this.promDisc;
   }
   public void setPromDiscAmt(Double promDiscAmt)
   {
       this.promDiscAmt = promDiscAmt;
   }
   public Double getPromDiscAmt()
   {
       return this.promDiscAmt;
   }
   public void setOtherDisc(Double otherDisc)
   {
       this.otherDisc = otherDisc;
   }
   public Double getOtherDisc()
   {
       return this.otherDisc;
   }
   public void setOtherDiscAmt(Double otherDiscAmt)
   {
       this.otherDiscAmt = otherDiscAmt;
   }
   public Double getOtherDiscAmt()
   {
       return this.otherDiscAmt;
   }
   public void setReduceAmt(Double reduceAmt)
   {
       this.reduceAmt = reduceAmt;
   }
   public Double getReduceAmt()
   {
       return this.reduceAmt;
   }
   public void setVipPriceAmt(Double vipPriceAmt)
   {
       this.vipPriceAmt = vipPriceAmt;
   }
   public Double getVipPriceAmt()
   {
       return this.vipPriceAmt;
   }
   public void setAllDistAmt(Double allDistAmt)
   {
       this.allDistAmt = allDistAmt;
   }
   public Double getAllDistAmt()
   {
       return this.allDistAmt;
   }
   public void setItemSaleAmt(Double itemSaleAmt)
   {
       this.itemSaleAmt = itemSaleAmt;
   }
   public Double getItemSaleAmt()
   {
       return this.itemSaleAmt;
   }
   public void setPoints(Double points)
   {
       this.points = points;
   }
   public Double getPoints()
   {
       return this.points;
   }
   public void setRetFlag(String retFlag)
   {
       this.retFlag = retFlag;
   }
   public String getRetFlag()
   {
       return this.retFlag;
   }
   public void setRetAmt(Double retAmt)
   {
       this.retAmt = retAmt;
   }
   public Double getRetAmt()
   {
       return this.retAmt;
   }
   public void setUpFlag(String upFlag)
   {
       this.upFlag = upFlag;
   }
   public String getUpFlag()
   {
       return this.upFlag;
   }
   public void setUpDate(Date upDate)
   {
       this.upDate = upDate;
   }
   public Date getUpDate()
   {
       return this.upDate;
   }
}