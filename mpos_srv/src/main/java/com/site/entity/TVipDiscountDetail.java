package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipDiscountDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipDiscountDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String discountNo;
	// 
	protected String discountSn;
	// 
	protected String discountClass;
	// 
	protected Double discountRate;
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
	public void setDiscountSn(String discountSn)
	{
		this.discountSn = discountSn;
	}
	public String getDiscountSn()
	{
		return this.discountSn;
	}
	public void setDiscountClass(String discountClass)
	{
		this.discountClass = discountClass;
	}
	public String getDiscountClass()
	{
		return this.discountClass;
	}
	public void setDiscountRate(Double discountRate)
	{
		this.discountRate = discountRate;
	}
	public Double getDiscountRate()
	{
		return this.discountRate;
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