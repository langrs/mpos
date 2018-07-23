package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TDataCoin Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TDataCoin implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String coinNo;
	// 
	protected String coinName;
	// 
	protected Double coinRate;
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
	protected String coinCode;
	// 
	protected String transUpflag;
	public void setCoinNo(String coinNo)
	{
		this.coinNo = coinNo;
	}
	public String getCoinNo()
	{
		return this.coinNo;
	}
	public void setCoinName(String coinName)
	{
		this.coinName = coinName;
	}
	public String getCoinName()
	{
		return this.coinName;
	}
	public void setCoinRate(Double coinRate)
	{
		this.coinRate = coinRate;
	}
	public Double getCoinRate()
	{
		return this.coinRate;
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
	public void setCoinCode(String coinCode)
	{
		this.coinCode = coinCode;
	}
	public String getCoinCode()
	{
		return this.coinCode;
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