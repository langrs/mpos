package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TItemBrand Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TItemBrand implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String itemBrand;
	// 
	protected String brandName;
	// 
	protected String brandMemo;
	// 
	protected String IsSysFlag;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String brandPy;
	// 
	protected String transUpflag;
	public void setItemBrand(String itemBrand)
	{
		this.itemBrand = itemBrand;
	}
	public String getItemBrand()
	{
		return this.itemBrand;
	}
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	public String getBrandName()
	{
		return this.brandName;
	}
	public void setBrandMemo(String brandMemo)
	{
		this.brandMemo = brandMemo;
	}
	public String getBrandMemo()
	{
		return this.brandMemo;
	}
	public void setIsSysFlag(String IsSysFlag)
	{
		this.IsSysFlag = IsSysFlag;
	}
	public String getIsSysFlag()
	{
		return this.IsSysFlag;
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
	public void setBrandPy(String brandPy)
	{
		this.brandPy = brandPy;
	}
	public String getBrandPy()
	{
		return this.brandPy;
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