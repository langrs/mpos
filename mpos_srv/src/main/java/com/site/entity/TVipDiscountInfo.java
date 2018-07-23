package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipDiscountInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipDiscountInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String discountNo;
	// 
	protected String discountName;
	// 
	protected String discountIsSame;
	// 
	protected String discountType;
	// 
	protected Double discountRate;
	// 
	protected String discountMemo;
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
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	public void setDiscountNo(String discountNo)
	{
		this.discountNo = discountNo;
	}
	public String getDiscountNo()
	{
		return this.discountNo;
	}
	public void setDiscountName(String discountName)
	{
		this.discountName = discountName;
	}
	public String getDiscountName()
	{
		return this.discountName;
	}
	public void setDiscountIsSame(String discountIsSame)
	{
		this.discountIsSame = discountIsSame;
	}
	public String getDiscountIsSame()
	{
		return this.discountIsSame;
	}
	public void setDiscountType(String discountType)
	{
		this.discountType = discountType;
	}
	public String getDiscountType()
	{
		return this.discountType;
	}
	public void setDiscountRate(Double discountRate)
	{
		this.discountRate = discountRate;
	}
	public Double getDiscountRate()
	{
		return this.discountRate;
	}
	public void setDiscountMemo(String discountMemo)
	{
		this.discountMemo = discountMemo;
	}
	public String getDiscountMemo()
	{
		return this.discountMemo;
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