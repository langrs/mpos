package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipIntegralDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipIntegralDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String integralNo;
	// 
	protected String integralSn;
	// 
	protected String paymentNo;
	// 
	protected String itemClass;
	// 
	protected Double sectAmt;
	// 
	protected Double integralAmt;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	// 
	protected String itemProperty;
	public void setIntegralNo(String integralNo)
	{
		this.integralNo = integralNo;
	}
	public String getIntegralNo()
	{
		return this.integralNo;
	}
	public void setIntegralSn(String integralSn)
	{
		this.integralSn = integralSn;
	}
	public String getIntegralSn()
	{
		return this.integralSn;
	}
	public void setPaymentNo(String paymentNo)
	{
		this.paymentNo = paymentNo;
	}
	public String getPaymentNo()
	{
		return this.paymentNo;
	}
	public void setItemClass(String itemClass)
	{
		this.itemClass = itemClass;
	}
	public String getItemClass()
	{
		return this.itemClass;
	}
	public void setSectAmt(Double sectAmt)
	{
		this.sectAmt = sectAmt;
	}
	public Double getSectAmt()
	{
		return this.sectAmt;
	}
	public void setIntegralAmt(Double integralAmt)
	{
		this.integralAmt = integralAmt;
	}
	public Double getIntegralAmt()
	{
		return this.integralAmt;
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
	public void setItemProperty(String itemProperty)
	{
		this.itemProperty = itemProperty;
	}
	public String getItemProperty()
	{
		return this.itemProperty;
	}
}  