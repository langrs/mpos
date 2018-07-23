package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipIntegralInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipIntegralInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String integralNo;
	// 
	protected String integralName;
	// 
	protected String integralType;
	// 
	protected Double oneSaleAmt;
	// 
	protected Double integralBirthdayRate;
	// 
	protected String roundType;
	// 
	protected String integralMemo;
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
	protected Double oneIntegral;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	// 
	protected String integralBirthdayRange;
	// 
	protected String IntegralOnlyRealpay;
	public void setIntegralNo(String integralNo)
	{
		this.integralNo = integralNo;
	}
	public String getIntegralNo()
	{
		return this.integralNo;
	}
	public void setIntegralName(String integralName)
	{
		this.integralName = integralName;
	}
	public String getIntegralName()
	{
		return this.integralName;
	}
	public void setIntegralType(String integralType)
	{
		this.integralType = integralType;
	}
	public String getIntegralType()
	{
		return this.integralType;
	}
	public void setOneSaleAmt(Double oneSaleAmt)
	{
		this.oneSaleAmt = oneSaleAmt;
	}
	public Double getOneSaleAmt()
	{
		return this.oneSaleAmt;
	}
	public void setIntegralBirthdayRate(Double integralBirthdayRate)
	{
		this.integralBirthdayRate = integralBirthdayRate;
	}
	public Double getIntegralBirthdayRate()
	{
		return this.integralBirthdayRate;
	}
	public void setRoundType(String roundType)
	{
		this.roundType = roundType;
	}
	public String getRoundType()
	{
		return this.roundType;
	}
	public void setIntegralMemo(String integralMemo)
	{
		this.integralMemo = integralMemo;
	}
	public String getIntegralMemo()
	{
		return this.integralMemo;
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
	public void setOneIntegral(Double oneIntegral)
	{
		this.oneIntegral = oneIntegral;
	}
	public Double getOneIntegral()
	{
		return this.oneIntegral;
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
	public void setIntegralBirthdayRange(String integralBirthdayRange)
	{
		this.integralBirthdayRange = integralBirthdayRange;
	}
	public String getIntegralBirthdayRange()
	{
		return this.integralBirthdayRange;
	}
	public void setIntegralOnlyRealpay(String IntegralOnlyRealpay)
	{
		this.IntegralOnlyRealpay = IntegralOnlyRealpay;
	}
	public String getIntegralOnlyRealpay()
	{
		return this.IntegralOnlyRealpay;
	}
}  