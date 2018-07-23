package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TItemInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TItemInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String itemNo;
	// 
	protected String itemSubno;
	// 
	protected String itemBarcode;
	// 
	protected String itemName;
	// 
	protected String itemClass;
	// 
	protected String itemProperty;
	// 
	protected String itemBrand;
	// 
	protected String itemSize;
	// 
	protected String itemUnitNo;
	// 
	protected Double itemInPrice;
	// 
	protected Double itemSalePrice;
	// 
	protected Double itemPfPrice;
	// 
	protected Double itemVipPrice;
	// 
	protected Double itemDistPrice;
	// 
	protected String itemArea;
	// 
	protected String itemGrade;
	// 
	protected String itemSupNo;
	// 
	protected String counterNo;
	// 
	protected String itemCombine;
	// 
	protected String itemSaleMode;
	// 
	protected String itemFlag;
	// 
	protected String haveStock;
	// 
	protected String ManageType;
	// 
	protected Double ManageLyRate;
	// 
	protected String pyCode;
	// 
	protected Double itemValidDay;
	// 
	protected Double itemValidTipday;
	// 
	protected Double posLowerPrice;
	// 
	protected Double posDiscount;
	// 
	protected String changePrice;
	// 
	protected String allowDiscount;
	// 
	protected Double inTaxRate;
	// 
	protected Double outTaxRate;
	// 
	protected Double itemSaleRate;
	// 
	protected Double itemPfRate;
	// 
	protected Double integralRate;
	// 
	protected String costType;
	// 
	protected String displayFlag;
	// 
	protected String internalFlag;
	// 
	protected String itemMemo;
	// 
	protected String itemBytxt1;
	// 
	protected String itemBytxt2;
	// 
	protected String itemBytxt3;
	// 
	protected Double itemBynum1;
	// 
	protected Double itemBynum2;
	// 
	protected Double itemBynum3;
	// 
	protected String IsSysFlag;
	// 
	protected String lockUser;
	// 
	protected Date createDate;
	// 
	protected String createUser;
	// 
	protected Date modifyDate;
	// 
	protected String modifyUser;
	// 
	protected Double updateFlow;
	// 
	protected String itemSaleRatetype;
	// 
	protected String itemPfRatetype;
	// 
	protected String itemDateUnit;
	// 
	protected String showboxNo;
	// 
	protected String itemInRatetype;
	// 
	protected Double itemInRate;
	// 
	protected String branchNo;
	// 
	protected String itemIsGood;
	// 
	protected String itemAbc;
	// 
	protected String itemPrintLabel;
	// 
	protected String itemQaCert;
	// 
	protected String itemQsCert;
	// 
	protected String itemInletCert;
	// 
	protected String itemQiRep;
	// 
	protected String haveSaleman;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected Double itemDistQty;
	// 
	protected String itemDistLimit;
	// 
	protected String itemDistDouble;
	// 
	protected String itemPzwh;
	// 
	protected String itemFactory;
	// 
	protected String itemSysMemo1;
	// 
	protected String haveSalememo;
	// 
	protected String buyDays;
	// 
	protected Double posLimitQty;
	// 
	protected String itemYpFlag;
	// 
	protected Double eshopIntegral;
	// 
	protected String transUpflag;
	// 
	protected String itemJj;
	// 
	protected String itemKs;
	// 
	protected String itemIswx;
	public void setItemNo(String itemNo)
	{
		this.itemNo = itemNo;
	}
	public String getItemNo()
	{
		return this.itemNo;
	}
	public void setItemSubno(String itemSubno)
	{
		this.itemSubno = itemSubno;
	}
	public String getItemSubno()
	{
		return this.itemSubno;
	}
	public void setItemBarcode(String itemBarcode)
	{
		this.itemBarcode = itemBarcode;
	}
	public String getItemBarcode()
	{
		return this.itemBarcode;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public String getItemName()
	{
		return this.itemName;
	}
	public void setItemClass(String itemClass)
	{
		this.itemClass = itemClass;
	}
	public String getItemClass()
	{
		return this.itemClass;
	}
	public void setItemProperty(String itemProperty)
	{
		this.itemProperty = itemProperty;
	}
	public String getItemProperty()
	{
		return this.itemProperty;
	}
	public void setItemBrand(String itemBrand)
	{
		this.itemBrand = itemBrand;
	}
	public String getItemBrand()
	{
		return this.itemBrand;
	}
	public void setItemSize(String itemSize)
	{
		this.itemSize = itemSize;
	}
	public String getItemSize()
	{
		return this.itemSize;
	}
	public void setItemUnitNo(String itemUnitNo)
	{
		this.itemUnitNo = itemUnitNo;
	}
	public String getItemUnitNo()
	{
		return this.itemUnitNo;
	}
	public void setItemInPrice(Double itemInPrice)
	{
		this.itemInPrice = itemInPrice;
	}
	public Double getItemInPrice()
	{
		return this.itemInPrice;
	}
	public void setItemSalePrice(Double itemSalePrice)
	{
		this.itemSalePrice = itemSalePrice;
	}
	public Double getItemSalePrice()
	{
		return this.itemSalePrice;
	}
	public void setItemPfPrice(Double itemPfPrice)
	{
		this.itemPfPrice = itemPfPrice;
	}
	public Double getItemPfPrice()
	{
		return this.itemPfPrice;
	}
	public void setItemVipPrice(Double itemVipPrice)
	{
		this.itemVipPrice = itemVipPrice;
	}
	public Double getItemVipPrice()
	{
		return this.itemVipPrice;
	}
	public void setItemDistPrice(Double itemDistPrice)
	{
		this.itemDistPrice = itemDistPrice;
	}
	public Double getItemDistPrice()
	{
		return this.itemDistPrice;
	}
	public void setItemArea(String itemArea)
	{
		this.itemArea = itemArea;
	}
	public String getItemArea()
	{
		return this.itemArea;
	}
	public void setItemGrade(String itemGrade)
	{
		this.itemGrade = itemGrade;
	}
	public String getItemGrade()
	{
		return this.itemGrade;
	}
	public void setItemSupNo(String itemSupNo)
	{
		this.itemSupNo = itemSupNo;
	}
	public String getItemSupNo()
	{
		return this.itemSupNo;
	}
	public void setCounterNo(String counterNo)
	{
		this.counterNo = counterNo;
	}
	public String getCounterNo()
	{
		return this.counterNo;
	}
	public void setItemCombine(String itemCombine)
	{
		this.itemCombine = itemCombine;
	}
	public String getItemCombine()
	{
		return this.itemCombine;
	}
	public void setItemSaleMode(String itemSaleMode)
	{
		this.itemSaleMode = itemSaleMode;
	}
	public String getItemSaleMode()
	{
		return this.itemSaleMode;
	}
	public void setItemFlag(String itemFlag)
	{
		this.itemFlag = itemFlag;
	}
	public String getItemFlag()
	{
		return this.itemFlag;
	}
	public void setHaveStock(String haveStock)
	{
		this.haveStock = haveStock;
	}
	public String getHaveStock()
	{
		return this.haveStock;
	}
	public void setManageType(String ManageType)
	{
		this.ManageType = ManageType;
	}
	public String getManageType()
	{
		return this.ManageType;
	}
	public void setManageLyRate(Double ManageLyRate)
	{
		this.ManageLyRate = ManageLyRate;
	}
	public Double getManageLyRate()
	{
		return this.ManageLyRate;
	}
	public void setPyCode(String pyCode)
	{
		this.pyCode = pyCode;
	}
	public String getPyCode()
	{
		return this.pyCode;
	}
	public void setItemValidDay(Double itemValidDay)
	{
		this.itemValidDay = itemValidDay;
	}
	public Double getItemValidDay()
	{
		return this.itemValidDay;
	}
	public void setItemValidTipday(Double itemValidTipday)
	{
		this.itemValidTipday = itemValidTipday;
	}
	public Double getItemValidTipday()
	{
		return this.itemValidTipday;
	}
	public void setPosLowerPrice(Double posLowerPrice)
	{
		this.posLowerPrice = posLowerPrice;
	}
	public Double getPosLowerPrice()
	{
		return this.posLowerPrice;
	}
	public void setPosDiscount(Double posDiscount)
	{
		this.posDiscount = posDiscount;
	}
	public Double getPosDiscount()
	{
		return this.posDiscount;
	}
	public void setChangePrice(String changePrice)
	{
		this.changePrice = changePrice;
	}
	public String getChangePrice()
	{
		return this.changePrice;
	}
	public void setAllowDiscount(String allowDiscount)
	{
		this.allowDiscount = allowDiscount;
	}
	public String getAllowDiscount()
	{
		return this.allowDiscount;
	}
	public void setInTaxRate(Double inTaxRate)
	{
		this.inTaxRate = inTaxRate;
	}
	public Double getInTaxRate()
	{
		return this.inTaxRate;
	}
	public void setOutTaxRate(Double outTaxRate)
	{
		this.outTaxRate = outTaxRate;
	}
	public Double getOutTaxRate()
	{
		return this.outTaxRate;
	}
	public void setItemSaleRate(Double itemSaleRate)
	{
		this.itemSaleRate = itemSaleRate;
	}
	public Double getItemSaleRate()
	{
		return this.itemSaleRate;
	}
	public void setItemPfRate(Double itemPfRate)
	{
		this.itemPfRate = itemPfRate;
	}
	public Double getItemPfRate()
	{
		return this.itemPfRate;
	}
	public void setIntegralRate(Double integralRate)
	{
		this.integralRate = integralRate;
	}
	public Double getIntegralRate()
	{
		return this.integralRate;
	}
	public void setCostType(String costType)
	{
		this.costType = costType;
	}
	public String getCostType()
	{
		return this.costType;
	}
	public void setDisplayFlag(String displayFlag)
	{
		this.displayFlag = displayFlag;
	}
	public String getDisplayFlag()
	{
		return this.displayFlag;
	}
	public void setInternalFlag(String internalFlag)
	{
		this.internalFlag = internalFlag;
	}
	public String getInternalFlag()
	{
		return this.internalFlag;
	}
	public void setItemMemo(String itemMemo)
	{
		this.itemMemo = itemMemo;
	}
	public String getItemMemo()
	{
		return this.itemMemo;
	}
	public void setItemBytxt1(String itemBytxt1)
	{
		this.itemBytxt1 = itemBytxt1;
	}
	public String getItemBytxt1()
	{
		return this.itemBytxt1;
	}
	public void setItemBytxt2(String itemBytxt2)
	{
		this.itemBytxt2 = itemBytxt2;
	}
	public String getItemBytxt2()
	{
		return this.itemBytxt2;
	}
	public void setItemBytxt3(String itemBytxt3)
	{
		this.itemBytxt3 = itemBytxt3;
	}
	public String getItemBytxt3()
	{
		return this.itemBytxt3;
	}
	public void setItemBynum1(Double itemBynum1)
	{
		this.itemBynum1 = itemBynum1;
	}
	public Double getItemBynum1()
	{
		return this.itemBynum1;
	}
	public void setItemBynum2(Double itemBynum2)
	{
		this.itemBynum2 = itemBynum2;
	}
	public Double getItemBynum2()
	{
		return this.itemBynum2;
	}
	public void setItemBynum3(Double itemBynum3)
	{
		this.itemBynum3 = itemBynum3;
	}
	public Double getItemBynum3()
	{
		return this.itemBynum3;
	}
	public void setIsSysFlag(String IsSysFlag)
	{
		this.IsSysFlag = IsSysFlag;
	}
	public String getIsSysFlag()
	{
		return this.IsSysFlag;
	}
	public void setLockUser(String lockUser)
	{
		this.lockUser = lockUser;
	}
	public String getLockUser()
	{
		return this.lockUser;
	}
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	public Date getCreateDate()
	{
		return this.createDate;
	}
	public void setCreateUser(String createUser)
	{
		this.createUser = createUser;
	}
	public String getCreateUser()
	{
		return this.createUser;
	}
	public void setModifyDate(Date modifyDate)
	{
		this.modifyDate = modifyDate;
	}
	public Date getModifyDate()
	{
		return this.modifyDate;
	}
	public void setModifyUser(String modifyUser)
	{
		this.modifyUser = modifyUser;
	}
	public String getModifyUser()
	{
		return this.modifyUser;
	}
	public void setUpdateFlow(Double updateFlow)
	{
		this.updateFlow = updateFlow;
	}
	public Double getUpdateFlow()
	{
		return this.updateFlow;
	}
	public void setItemSaleRatetype(String itemSaleRatetype)
	{
		this.itemSaleRatetype = itemSaleRatetype;
	}
	public String getItemSaleRatetype()
	{
		return this.itemSaleRatetype;
	}
	public void setItemPfRatetype(String itemPfRatetype)
	{
		this.itemPfRatetype = itemPfRatetype;
	}
	public String getItemPfRatetype()
	{
		return this.itemPfRatetype;
	}
	public void setItemDateUnit(String itemDateUnit)
	{
		this.itemDateUnit = itemDateUnit;
	}
	public String getItemDateUnit()
	{
		return this.itemDateUnit;
	}
	public void setShowboxNo(String showboxNo)
	{
		this.showboxNo = showboxNo;
	}
	public String getShowboxNo()
	{
		return this.showboxNo;
	}
	public void setItemInRatetype(String itemInRatetype)
	{
		this.itemInRatetype = itemInRatetype;
	}
	public String getItemInRatetype()
	{
		return this.itemInRatetype;
	}
	public void setItemInRate(Double itemInRate)
	{
		this.itemInRate = itemInRate;
	}
	public Double getItemInRate()
	{
		return this.itemInRate;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setItemIsGood(String itemIsGood)
	{
		this.itemIsGood = itemIsGood;
	}
	public String getItemIsGood()
	{
		return this.itemIsGood;
	}
	public void setItemAbc(String itemAbc)
	{
		this.itemAbc = itemAbc;
	}
	public String getItemAbc()
	{
		return this.itemAbc;
	}
	public void setItemPrintLabel(String itemPrintLabel)
	{
		this.itemPrintLabel = itemPrintLabel;
	}
	public String getItemPrintLabel()
	{
		return this.itemPrintLabel;
	}
	public void setItemQaCert(String itemQaCert)
	{
		this.itemQaCert = itemQaCert;
	}
	public String getItemQaCert()
	{
		return this.itemQaCert;
	}
	public void setItemQsCert(String itemQsCert)
	{
		this.itemQsCert = itemQsCert;
	}
	public String getItemQsCert()
	{
		return this.itemQsCert;
	}
	public void setItemInletCert(String itemInletCert)
	{
		this.itemInletCert = itemInletCert;
	}
	public String getItemInletCert()
	{
		return this.itemInletCert;
	}
	public void setItemQiRep(String itemQiRep)
	{
		this.itemQiRep = itemQiRep;
	}
	public String getItemQiRep()
	{
		return this.itemQiRep;
	}
	public void setHaveSaleman(String haveSaleman)
	{
		this.haveSaleman = haveSaleman;
	}
	public String getHaveSaleman()
	{
		return this.haveSaleman;
	}
	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
	}
	public Date getUpdateTime()
	{
		return this.updateTime;
	}
	public void setUpdateBranch(String updateBranch)
	{
		this.updateBranch = updateBranch;
	}
	public String getUpdateBranch()
	{
		return this.updateBranch;
	}
	public void setItemDistQty(Double itemDistQty)
	{
		this.itemDistQty = itemDistQty;
	}
	public Double getItemDistQty()
	{
		return this.itemDistQty;
	}
	public void setItemDistLimit(String itemDistLimit)
	{
		this.itemDistLimit = itemDistLimit;
	}
	public String getItemDistLimit()
	{
		return this.itemDistLimit;
	}
	public void setItemDistDouble(String itemDistDouble)
	{
		this.itemDistDouble = itemDistDouble;
	}
	public String getItemDistDouble()
	{
		return this.itemDistDouble;
	}
	public void setItemPzwh(String itemPzwh)
	{
		this.itemPzwh = itemPzwh;
	}
	public String getItemPzwh()
	{
		return this.itemPzwh;
	}
	public void setItemFactory(String itemFactory)
	{
		this.itemFactory = itemFactory;
	}
	public String getItemFactory()
	{
		return this.itemFactory;
	}
	public void setItemSysMemo1(String itemSysMemo1)
	{
		this.itemSysMemo1 = itemSysMemo1;
	}
	public String getItemSysMemo1()
	{
		return this.itemSysMemo1;
	}
	public void setHaveSalememo(String haveSalememo)
	{
		this.haveSalememo = haveSalememo;
	}
	public String getHaveSalememo()
	{
		return this.haveSalememo;
	}
	public void setBuyDays(String buyDays)
	{
		this.buyDays = buyDays;
	}
	public String getBuyDays()
	{
		return this.buyDays;
	}
	public void setPosLimitQty(Double posLimitQty)
	{
		this.posLimitQty = posLimitQty;
	}
	public Double getPosLimitQty()
	{
		return this.posLimitQty;
	}
	public void setItemYpFlag(String itemYpFlag)
	{
		this.itemYpFlag = itemYpFlag;
	}
	public String getItemYpFlag()
	{
		return this.itemYpFlag;
	}
	public void setEshopIntegral(Double eshopIntegral)
	{
		this.eshopIntegral = eshopIntegral;
	}
	public Double getEshopIntegral()
	{
		return this.eshopIntegral;
	}
	public void setTransUpflag(String transUpflag)
	{
		this.transUpflag = transUpflag;
	}
	public String getTransUpflag()
	{
		return this.transUpflag;
	}
	public void setItemJj(String itemJj)
	{
		this.itemJj = itemJj;
	}
	public String getItemJj()
	{
		return this.itemJj;
	}
	public void setItemKs(String itemKs)
	{
		this.itemKs = itemKs;
	}
	public String getItemKs()
	{
		return this.itemKs;
	}
	public void setItemIswx(String itemIswx)
	{
		this.itemIswx = itemIswx;
	}
	public String getItemIswx()
	{
		return this.itemIswx;
	}
}  