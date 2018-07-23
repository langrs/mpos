package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TDataPaymentBranch Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TDataPaymentBranch implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String paymentNo;
	// 
	protected String branchNo;
	// 
	protected String visaNo;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	public void setPaymentNo(String paymentNo)
	{
		this.paymentNo = paymentNo;
	}
	public String getPaymentNo()
	{
		return this.paymentNo;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setVisaNo(String visaNo)
	{
		this.visaNo = visaNo;
	}
	public String getVisaNo()
	{
		return this.visaNo;
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