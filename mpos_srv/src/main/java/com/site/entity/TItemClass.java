package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TItemClass Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TItemClass implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String itemClass;
	// 
	protected String className;
	// 
	protected String classData;
	// 
	protected String priceType;
	// 
	protected Double salePriceRate;
	// 
	protected Double pfPriceRate;
	// 
	protected Double vipPriceRate;
	// 
	protected String edibleFlag;
	// 
	protected String IsSysFlag;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected Date createDate;
	// 
	protected String createMan;
	// 
	protected Date modifyDate;
	// 
	protected String modifyMan;
	// 
	protected Double limitMaxQty;
	// 
	protected Double limitMinQty;
	// 
	protected String transUpflag;
	public void setItemClass(String itemClass)
	{
		this.itemClass = itemClass;
	}
	public String getItemClass()
	{
		return this.itemClass;
	}
	public void setClassName(String className)
	{
		this.className = className;
	}
	public String getClassName()
	{
		return this.className;
	}
	public void setClassData(String classData)
	{
		this.classData = classData;
	}
	public String getClassData()
	{
		return this.classData;
	}
	public void setPriceType(String priceType)
	{
		this.priceType = priceType;
	}
	public String getPriceType()
	{
		return this.priceType;
	}
	public void setSalePriceRate(Double salePriceRate)
	{
		this.salePriceRate = salePriceRate;
	}
	public Double getSalePriceRate()
	{
		return this.salePriceRate;
	}
	public void setPfPriceRate(Double pfPriceRate)
	{
		this.pfPriceRate = pfPriceRate;
	}
	public Double getPfPriceRate()
	{
		return this.pfPriceRate;
	}
	public void setVipPriceRate(Double vipPriceRate)
	{
		this.vipPriceRate = vipPriceRate;
	}
	public Double getVipPriceRate()
	{
		return this.vipPriceRate;
	}
	public void setEdibleFlag(String edibleFlag)
	{
		this.edibleFlag = edibleFlag;
	}
	public String getEdibleFlag()
	{
		return this.edibleFlag;
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
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	public Date getCreateDate()
	{
		return this.createDate;
	}
	public void setCreateMan(String createMan)
	{
		this.createMan = createMan;
	}
	public String getCreateMan()
	{
		return this.createMan;
	}
	public void setModifyDate(Date modifyDate)
	{
		this.modifyDate = modifyDate;
	}
	public Date getModifyDate()
	{
		return this.modifyDate;
	}
	public void setModifyMan(String modifyMan)
	{
		this.modifyMan = modifyMan;
	}
	public String getModifyMan()
	{
		return this.modifyMan;
	}
	public void setLimitMaxQty(Double limitMaxQty)
	{
		this.limitMaxQty = limitMaxQty;
	}
	public Double getLimitMaxQty()
	{
		return this.limitMaxQty;
	}
	public void setLimitMinQty(Double limitMinQty)
	{
		this.limitMinQty = limitMinQty;
	}
	public Double getLimitMinQty()
	{
		return this.limitMinQty;
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