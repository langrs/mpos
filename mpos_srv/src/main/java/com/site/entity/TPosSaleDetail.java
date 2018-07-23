package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TPosSaleDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TPosSaleDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String sheetNo;
	// 
	protected String sheetSort;
	// 
	protected String itemNo;
	// 
	protected String saleBarcode;
	// 
	protected String itemUnit;
	// 
	protected String unitType;
	// 
	protected Double unitPack;
	// 
	protected Double orgPrice;
	// 
	protected Double realPrice;
	// 
	protected Double saleQty;
	// 
	protected String saleSign;
	// 
	protected Double saleAmt;
	// 
	protected String saleMan;
	// 
	protected String counterNo;
	// 
	protected String manageType;
	// 
	protected String specialType;
	// 
	protected String specialNo;
	// 
	protected String itemIspack;
	// 
	protected Double jsQty;
	// 
	protected String saleMemo;
	// 
	protected String saleBytxt1;
	// 
	protected String saleBytxt2;
	// 
	protected String saleBytxt3;
	// 
	protected Double saleBynum1;
	// 
	protected Double saleBynum2;
	// 
	protected Double saleBynum3;
	// 
	protected Double allzkForeRealPrice;
	// 
	protected String allzkForeSpecialType;
	// 
	protected Double ManageLyRate;
	// 
	protected String lySupNo;
	// 
	protected Double insideTaxAmt;
	// 
	protected String isPackage;
	// 
	protected String limitBranch;
	// 
	protected String limitTimes;
	// 
	protected String limitDate;
	// 
	protected Date validBegin;
	// 
	protected Date validEnd;
	public void setSheetNo(String sheetNo)
	{
		this.sheetNo = sheetNo;
	}
	public String getSheetNo()
	{
		return this.sheetNo;
	}
	public void setSheetSort(String sheetSort)
	{
		this.sheetSort = sheetSort;
	}
	public String getSheetSort()
	{
		return this.sheetSort;
	}
	public void setItemNo(String itemNo)
	{
		this.itemNo = itemNo;
	}
	public String getItemNo()
	{
		return this.itemNo;
	}
	public void setSaleBarcode(String saleBarcode)
	{
		this.saleBarcode = saleBarcode;
	}
	public String getSaleBarcode()
	{
		return this.saleBarcode;
	}
	public void setItemUnit(String itemUnit)
	{
		this.itemUnit = itemUnit;
	}
	public String getItemUnit()
	{
		return this.itemUnit;
	}
	public void setUnitType(String unitType)
	{
		this.unitType = unitType;
	}
	public String getUnitType()
	{
		return this.unitType;
	}
	public void setUnitPack(Double unitPack)
	{
		this.unitPack = unitPack;
	}
	public Double getUnitPack()
	{
		return this.unitPack;
	}
	public void setOrgPrice(Double orgPrice)
	{
		this.orgPrice = orgPrice;
	}
	public Double getOrgPrice()
	{
		return this.orgPrice;
	}
	public void setRealPrice(Double realPrice)
	{
		this.realPrice = realPrice;
	}
	public Double getRealPrice()
	{
		return this.realPrice;
	}
	public void setSaleQty(Double saleQty)
	{
		this.saleQty = saleQty;
	}
	public Double getSaleQty()
	{
		return this.saleQty;
	}
	public void setSaleSign(String saleSign)
	{
		this.saleSign = saleSign;
	}
	public String getSaleSign()
	{
		return this.saleSign;
	}
	public void setSaleAmt(Double saleAmt)
	{
		this.saleAmt = saleAmt;
	}
	public Double getSaleAmt()
	{
		return this.saleAmt;
	}
	public void setSaleMan(String saleMan)
	{
		this.saleMan = saleMan;
	}
	public String getSaleMan()
	{
		return this.saleMan;
	}
	public void setCounterNo(String counterNo)
	{
		this.counterNo = counterNo;
	}
	public String getCounterNo()
	{
		return this.counterNo;
	}
	public void setManageType(String manageType)
	{
		this.manageType = manageType;
	}
	public String getManageType()
	{
		return this.manageType;
	}
	public void setSpecialType(String specialType)
	{
		this.specialType = specialType;
	}
	public String getSpecialType()
	{
		return this.specialType;
	}
	public void setSpecialNo(String specialNo)
	{
		this.specialNo = specialNo;
	}
	public String getSpecialNo()
	{
		return this.specialNo;
	}
	public void setItemIspack(String itemIspack)
	{
		this.itemIspack = itemIspack;
	}
	public String getItemIspack()
	{
		return this.itemIspack;
	}
	public void setJsQty(Double jsQty)
	{
		this.jsQty = jsQty;
	}
	public Double getJsQty()
	{
		return this.jsQty;
	}
	public void setSaleMemo(String saleMemo)
	{
		this.saleMemo = saleMemo;
	}
	public String getSaleMemo()
	{
		return this.saleMemo;
	}
	public void setSaleBytxt1(String saleBytxt1)
	{
		this.saleBytxt1 = saleBytxt1;
	}
	public String getSaleBytxt1()
	{
		return this.saleBytxt1;
	}
	public void setSaleBytxt2(String saleBytxt2)
	{
		this.saleBytxt2 = saleBytxt2;
	}
	public String getSaleBytxt2()
	{
		return this.saleBytxt2;
	}
	public void setSaleBytxt3(String saleBytxt3)
	{
		this.saleBytxt3 = saleBytxt3;
	}
	public String getSaleBytxt3()
	{
		return this.saleBytxt3;
	}
	public void setSaleBynum1(Double saleBynum1)
	{
		this.saleBynum1 = saleBynum1;
	}
	public Double getSaleBynum1()
	{
		return this.saleBynum1;
	}
	public void setSaleBynum2(Double saleBynum2)
	{
		this.saleBynum2 = saleBynum2;
	}
	public Double getSaleBynum2()
	{
		return this.saleBynum2;
	}
	public void setSaleBynum3(Double saleBynum3)
	{
		this.saleBynum3 = saleBynum3;
	}
	public Double getSaleBynum3()
	{
		return this.saleBynum3;
	}
	public void setAllzkForeRealPrice(Double allzkForeRealPrice)
	{
		this.allzkForeRealPrice = allzkForeRealPrice;
	}
	public Double getAllzkForeRealPrice()
	{
		return this.allzkForeRealPrice;
	}
	public void setAllzkForeSpecialType(String allzkForeSpecialType)
	{
		this.allzkForeSpecialType = allzkForeSpecialType;
	}
	public String getAllzkForeSpecialType()
	{
		return this.allzkForeSpecialType;
	}
	public void setManageLyRate(Double ManageLyRate)
	{
		this.ManageLyRate = ManageLyRate;
	}
	public Double getManageLyRate()
	{
		return this.ManageLyRate;
	}
	public void setLySupNo(String lySupNo)
	{
		this.lySupNo = lySupNo;
	}
	public String getLySupNo()
	{
		return this.lySupNo;
	}
	public void setInsideTaxAmt(Double insideTaxAmt)
	{
		this.insideTaxAmt = insideTaxAmt;
	}
	public Double getInsideTaxAmt()
	{
		return this.insideTaxAmt;
	}
	public void setIsPackage(String isPackage)
	{
		this.isPackage = isPackage;
	}
	public String getIsPackage()
	{
		return this.isPackage;
	}
	public void setLimitBranch(String limitBranch)
	{
		this.limitBranch = limitBranch;
	}
	public String getLimitBranch()
	{
		return this.limitBranch;
	}
	public void setLimitTimes(String limitTimes)
	{
		this.limitTimes = limitTimes;
	}
	public String getLimitTimes()
	{
		return this.limitTimes;
	}
	public void setLimitDate(String limitDate)
	{
		this.limitDate = limitDate;
	}
	public String getLimitDate()
	{
		return this.limitDate;
	}
	public void setValidBegin(Date validBegin)
	{
		this.validBegin = validBegin;
	}
	public Date getValidBegin()
	{
		return this.validBegin;
	}
	public void setValidEnd(Date validEnd)
	{
		this.validEnd = validEnd;
	}
	public Date getValidEnd()
	{
		return this.validEnd;
	}
}  