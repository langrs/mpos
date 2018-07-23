package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipTypeDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipTypeDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String viptypeNo;
	// 
	protected String itemSn;
	// 
	protected String itemRange;
	// 
	protected String itemNo;
	// 
	protected String unitType;
	// 
	protected String barcode;
	// 
	protected String nowUnit;
	// 
	protected Double nowPack;
	// 
	protected String mxMemo;
	// 
	protected String mxBytxt1;
	// 
	protected String mxBytxt2;
	// 
	protected String mxBytxt3;
	// 
	protected Double mxBynum1;
	// 
	protected Double mxBynum2;
	// 
	protected Double mxBynum3;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	public void setViptypeNo(String viptypeNo)
	{
		this.viptypeNo = viptypeNo;
	}
	public String getViptypeNo()
	{
		return this.viptypeNo;
	}
	public void setItemSn(String itemSn)
	{
		this.itemSn = itemSn;
	}
	public String getItemSn()
	{
		return this.itemSn;
	}
	public void setItemRange(String itemRange)
	{
		this.itemRange = itemRange;
	}
	public String getItemRange()
	{
		return this.itemRange;
	}
	public void setItemNo(String itemNo)
	{
		this.itemNo = itemNo;
	}
	public String getItemNo()
	{
		return this.itemNo;
	}
	public void setUnitType(String unitType)
	{
		this.unitType = unitType;
	}
	public String getUnitType()
	{
		return this.unitType;
	}
	public void setBarcode(String barcode)
	{
		this.barcode = barcode;
	}
	public String getBarcode()
	{
		return this.barcode;
	}
	public void setNowUnit(String nowUnit)
	{
		this.nowUnit = nowUnit;
	}
	public String getNowUnit()
	{
		return this.nowUnit;
	}
	public void setNowPack(Double nowPack)
	{
		this.nowPack = nowPack;
	}
	public Double getNowPack()
	{
		return this.nowPack;
	}
	public void setMxMemo(String mxMemo)
	{
		this.mxMemo = mxMemo;
	}
	public String getMxMemo()
	{
		return this.mxMemo;
	}
	public void setMxBytxt1(String mxBytxt1)
	{
		this.mxBytxt1 = mxBytxt1;
	}
	public String getMxBytxt1()
	{
		return this.mxBytxt1;
	}
	public void setMxBytxt2(String mxBytxt2)
	{
		this.mxBytxt2 = mxBytxt2;
	}
	public String getMxBytxt2()
	{
		return this.mxBytxt2;
	}
	public void setMxBytxt3(String mxBytxt3)
	{
		this.mxBytxt3 = mxBytxt3;
	}
	public String getMxBytxt3()
	{
		return this.mxBytxt3;
	}
	public void setMxBynum1(Double mxBynum1)
	{
		this.mxBynum1 = mxBynum1;
	}
	public Double getMxBynum1()
	{
		return this.mxBynum1;
	}
	public void setMxBynum2(Double mxBynum2)
	{
		this.mxBynum2 = mxBynum2;
	}
	public Double getMxBynum2()
	{
		return this.mxBynum2;
	}
	public void setMxBynum3(Double mxBynum3)
	{
		this.mxBynum3 = mxBynum3;
	}
	public Double getMxBynum3()
	{
		return this.mxBynum3;
	}
	public void setUpdateFlow(Double updateFlow)
	{
		this.updateFlow = updateFlow;
	}
	public Double getUpdateFlow()
	{
		return this.updateFlow;
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
	public void setTransUpflag(String transUpflag)
	{
		this.transUpflag = transUpflag;
	}
	public String getTransUpflag()
	{
		return this.transUpflag;
	}
}  