package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TCounterInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TCounterInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String counterNo;
	// 
	protected String counterName;
	// 
	protected String countypeNo;
	// 
	protected String counterMan;
	// 
	protected String counterAddress;
	// 
	protected String counterTel;
	// 
	protected Double counterArea;
	// 
	protected String outsideFlag;
	// 
	protected String displayFlag;
	// 
	protected String counterMemo;
	// 
	protected String IsSysFlag;
	// 
	protected Double updateFlow;
	// 
	protected String showboxNo;
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
	protected String transUpflag;
	public void setCounterNo(String counterNo)
	{
		this.counterNo = counterNo;
	}
	public String getCounterNo()
	{
		return this.counterNo;
	}
	public void setCounterName(String counterName)
	{
		this.counterName = counterName;
	}
	public String getCounterName()
	{
		return this.counterName;
	}
	public void setCountypeNo(String countypeNo)
	{
		this.countypeNo = countypeNo;
	}
	public String getCountypeNo()
	{
		return this.countypeNo;
	}
	public void setCounterMan(String counterMan)
	{
		this.counterMan = counterMan;
	}
	public String getCounterMan()
	{
		return this.counterMan;
	}
	public void setCounterAddress(String counterAddress)
	{
		this.counterAddress = counterAddress;
	}
	public String getCounterAddress()
	{
		return this.counterAddress;
	}
	public void setCounterTel(String counterTel)
	{
		this.counterTel = counterTel;
	}
	public String getCounterTel()
	{
		return this.counterTel;
	}
	public void setCounterArea(Double counterArea)
	{
		this.counterArea = counterArea;
	}
	public Double getCounterArea()
	{
		return this.counterArea;
	}
	public void setOutsideFlag(String outsideFlag)
	{
		this.outsideFlag = outsideFlag;
	}
	public String getOutsideFlag()
	{
		return this.outsideFlag;
	}
	public void setDisplayFlag(String displayFlag)
	{
		this.displayFlag = displayFlag;
	}
	public String getDisplayFlag()
	{
		return this.displayFlag;
	}
	public void setCounterMemo(String counterMemo)
	{
		this.counterMemo = counterMemo;
	}
	public String getCounterMemo()
	{
		return this.counterMemo;
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
	public void setShowboxNo(String showboxNo)
	{
		this.showboxNo = showboxNo;
	}
	public String getShowboxNo()
	{
		return this.showboxNo;
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
	public void setTransUpflag(String transUpflag)
	{
		this.transUpflag = transUpflag;
	}
	public String getTransUpflag()
	{
		return this.transUpflag;
	}
}  