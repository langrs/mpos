package com.site.entity;  
  
import java.io.Serializable;
import java.util.Date;  

//import com.site.core.base.AbstractModel;

/**
* 对象功能:TSalePay Entity对象
* 开发公司:SZUNIC
* 开发人员:LZM
*/

public class TSalePay implements Serializable//extends AbstractModel<String>
{
   private static final long serialVersionUID = 1L;
   // ID
   protected String id;
   // 主表ID
   protected String saleId;
   // 销售流水号
   protected String saleNo;
   // 序号
   protected String rowNo;
   // 销售日期
   protected Date saleDate;
   // 分店
   protected String shopId;
   // 支付方式
   protected String paymodeId;
   // 溢收金额
   protected Double excessAmt;
   // 支付金额
   protected Double payAmt;
   // 找零金额
   protected Double changeAmt;
   // 票据号码
   protected String billNo;
   // 收单行
   protected String collectBank;
   // 发卡行
   protected String issueBank;
   // 刷卡方式
   protected String skType;
   // 币种
   protected String currencyId;
   // 币种汇率
   protected Double exchangeRate;
   // 现金含量
   protected Double cashRate;
   // 储值发卡机构
   protected String cardIssue;
   // 上传标志
   protected String upFlag;
   // 上传日期
   protected Date upDate;

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
   public void setRowNo(String rowNo)
   {
       this.rowNo = rowNo;
   }
   public String getRowNo()
   {
       return this.rowNo;
   }
   public void setSaleDate(Date saleDate)
   {
       this.saleDate = saleDate;
   }
   public Date getSaleDate()
   {
       return this.saleDate;
   }
   public void setShopId(String shopId)
   {
       this.shopId = shopId;
   }
   public String getShopId()
   {
       return this.shopId;
   }
   public void setPaymodeId(String paymodeId)
   {
       this.paymodeId = paymodeId;
   }
   public String getPaymodeId()
   {
       return this.paymodeId;
   }
   public void setExcessAmt(Double excessAmt)
   {
       this.excessAmt = excessAmt;
   }
   public Double getExcessAmt()
   {
       return this.excessAmt;
   }
   public void setPayAmt(Double payAmt)
   {
       this.payAmt = payAmt;
   }
   public Double getPayAmt()
   {
       return this.payAmt;
   }
   public void setChangeAmt(Double changeAmt)
   {
       this.changeAmt = changeAmt;
   }
   public Double getChangeAmt()
   {
       return this.changeAmt;
   }
   public void setBillNo(String billNo)
   {
       this.billNo = billNo;
   }
   public String getBillNo()
   {
       return this.billNo;
   }
   public void setCollectBank(String collectBank)
   {
       this.collectBank = collectBank;
   }
   public String getCollectBank()
   {
       return this.collectBank;
   }
   public void setIssueBank(String issueBank)
   {
       this.issueBank = issueBank;
   }
   public String getIssueBank()
   {
       return this.issueBank;
   }
   public void setSkType(String skType)
   {
       this.skType = skType;
   }
   public String getSkType()
   {
       return this.skType;
   }
   public void setCurrencyId(String currencyId)
   {
       this.currencyId = currencyId;
   }
   public String getCurrencyId()
   {
       return this.currencyId;
   }
   public void setExchangeRate(Double exchangeRate)
   {
       this.exchangeRate = exchangeRate;
   }
   public Double getExchangeRate()
   {
       return this.exchangeRate;
   }
   public void setCashRate(Double cashRate)
   {
       this.cashRate = cashRate;
   }
   public Double getCashRate()
   {
       return this.cashRate;
   }
   public void setCardIssue(String cardIssue)
   {
       this.cardIssue = cardIssue;
   }
   public String getCardIssue()
   {
       return this.cardIssue;
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