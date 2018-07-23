package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TPosStamptype Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TPosStamptype implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String StampTypeNo;
	// 
	protected String StampTypeName;
	// 
	protected Double stampAmt;
	// 
	protected String stampTypeIsZero;
	// 
	protected String stampTypeMemo;
	// 
	protected String dateUnit;
	// 
	protected String stampTypePeriod;
	// 
	protected String IsSysFlag;
	// 
	protected String createUser;
	// 
	protected Date createDate;
	// 
	protected String modifyUser;
	// 
	protected Date modifyDate;
	// 
	protected String IsFixedValid;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	// 
	protected Double payruleSaleAmt;
	// 
	protected String payruleLimitInt;
	// 
	protected String payruleLimitSp;
	public void setStampTypeNo(String StampTypeNo)
	{
		this.StampTypeNo = StampTypeNo;
	}
	public String getStampTypeNo()
	{
		return this.StampTypeNo;
	}
	public void setStampTypeName(String StampTypeName)
	{
		this.StampTypeName = StampTypeName;
	}
	public String getStampTypeName()
	{
		return this.StampTypeName;
	}
	public void setStampAmt(Double stampAmt)
	{
		this.stampAmt = stampAmt;
	}
	public Double getStampAmt()
	{
		return this.stampAmt;
	}
	public void setStampTypeIsZero(String stampTypeIsZero)
	{
		this.stampTypeIsZero = stampTypeIsZero;
	}
	public String getStampTypeIsZero()
	{
		return this.stampTypeIsZero;
	}
	public void setStampTypeMemo(String stampTypeMemo)
	{
		this.stampTypeMemo = stampTypeMemo;
	}
	public String getStampTypeMemo()
	{
		return this.stampTypeMemo;
	}
	public void setDateUnit(String dateUnit)
	{
		this.dateUnit = dateUnit;
	}
	public String getDateUnit()
	{
		return this.dateUnit;
	}
	public void setStampTypePeriod(String stampTypePeriod)
	{
		this.stampTypePeriod = stampTypePeriod;
	}
	public String getStampTypePeriod()
	{
		return this.stampTypePeriod;
	}
	public void setIsSysFlag(String IsSysFlag)
	{
		this.IsSysFlag = IsSysFlag;
	}
	public String getIsSysFlag()
	{
		return this.IsSysFlag;
	}
	public void setCreateUser(String createUser)
	{
		this.createUser = createUser;
	}
	public String getCreateUser()
	{
		return this.createUser;
	}
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	public Date getCreateDate()
	{
		return this.createDate;
	}
	public void setModifyUser(String modifyUser)
	{
		this.modifyUser = modifyUser;
	}
	public String getModifyUser()
	{
		return this.modifyUser;
	}
	public void setModifyDate(Date modifyDate)
	{
		this.modifyDate = modifyDate;
	}
	public Date getModifyDate()
	{
		return this.modifyDate;
	}
	public void setIsFixedValid(String IsFixedValid)
	{
		this.IsFixedValid = IsFixedValid;
	}
	public String getIsFixedValid()
	{
		return this.IsFixedValid;
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
	public void setPayruleSaleAmt(Double payruleSaleAmt)
	{
		this.payruleSaleAmt = payruleSaleAmt;
	}
	public Double getPayruleSaleAmt()
	{
		return this.payruleSaleAmt;
	}
	public void setPayruleLimitInt(String payruleLimitInt)
	{
		this.payruleLimitInt = payruleLimitInt;
	}
	public String getPayruleLimitInt()
	{
		return this.payruleLimitInt;
	}
	public void setPayruleLimitSp(String payruleLimitSp)
	{
		this.payruleLimitSp = payruleLimitSp;
	}
	public String getPayruleLimitSp()
	{
		return this.payruleLimitSp;
	}
}  