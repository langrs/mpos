package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipFlow Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipFlow implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String vipFlow;
	// 
	protected String vipNo;
	// 
	protected String cardNo;
	// 
	protected String vipDispno;
	// 
	protected String workMan;
	// 
	protected Date operDate;
	// 
	protected String operUser;
	// 
	protected String branchNo;
	// 
	protected String vipOperType;
	// 
	protected Double salesAmt;
	// 
	protected Double saveAmt;
	// 
	protected Double giveAmt;
	// 
	protected Double retAmt;
	// 
	protected Double integral;
	// 
	protected Double fyAmt;
	// 
	protected String paymentNo;
	// 
	protected Double paymentAmt;
	// 
	protected Double coinRate;
	// 
	protected String voucherNo;
	// 
	protected String operMemo;
	// 
	protected String otherBytxt1;
	// 
	protected String otherBytxt2;
	// 
	protected String otherBytxt3;
	// 
	protected Double otherBynum1;
	// 
	protected Double otherBynum2;
	// 
	protected Double otherBynum3;
	// 
	protected Double zeroAmt;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	public void setVipFlow(String vipFlow)
	{
		this.vipFlow = vipFlow;
	}
	public String getVipFlow()
	{
		return this.vipFlow;
	}
	public void setVipNo(String vipNo)
	{
		this.vipNo = vipNo;
	}
	public String getVipNo()
	{
		return this.vipNo;
	}
	public void setCardNo(String cardNo)
	{
		this.cardNo = cardNo;
	}
	public String getCardNo()
	{
		return this.cardNo;
	}
	public void setVipDispno(String vipDispno)
	{
		this.vipDispno = vipDispno;
	}
	public String getVipDispno()
	{
		return this.vipDispno;
	}
	public void setWorkMan(String workMan)
	{
		this.workMan = workMan;
	}
	public String getWorkMan()
	{
		return this.workMan;
	}
	public void setOperDate(Date operDate)
	{
		this.operDate = operDate;
	}
	public Date getOperDate()
	{
		return this.operDate;
	}
	public void setOperUser(String operUser)
	{
		this.operUser = operUser;
	}
	public String getOperUser()
	{
		return this.operUser;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setVipOperType(String vipOperType)
	{
		this.vipOperType = vipOperType;
	}
	public String getVipOperType()
	{
		return this.vipOperType;
	}
	public void setSalesAmt(Double salesAmt)
	{
		this.salesAmt = salesAmt;
	}
	public Double getSalesAmt()
	{
		return this.salesAmt;
	}
	public void setSaveAmt(Double saveAmt)
	{
		this.saveAmt = saveAmt;
	}
	public Double getSaveAmt()
	{
		return this.saveAmt;
	}
	public void setGiveAmt(Double giveAmt)
	{
		this.giveAmt = giveAmt;
	}
	public Double getGiveAmt()
	{
		return this.giveAmt;
	}
	public void setRetAmt(Double retAmt)
	{
		this.retAmt = retAmt;
	}
	public Double getRetAmt()
	{
		return this.retAmt;
	}
	public void setIntegral(Double integral)
	{
		this.integral = integral;
	}
	public Double getIntegral()
	{
		return this.integral;
	}
	public void setFyAmt(Double fyAmt)
	{
		this.fyAmt = fyAmt;
	}
	public Double getFyAmt()
	{
		return this.fyAmt;
	}
	public void setPaymentNo(String paymentNo)
	{
		this.paymentNo = paymentNo;
	}
	public String getPaymentNo()
	{
		return this.paymentNo;
	}
	public void setPaymentAmt(Double paymentAmt)
	{
		this.paymentAmt = paymentAmt;
	}
	public Double getPaymentAmt()
	{
		return this.paymentAmt;
	}
	public void setCoinRate(Double coinRate)
	{
		this.coinRate = coinRate;
	}
	public Double getCoinRate()
	{
		return this.coinRate;
	}
	public void setVoucherNo(String voucherNo)
	{
		this.voucherNo = voucherNo;
	}
	public String getVoucherNo()
	{
		return this.voucherNo;
	}
	public void setOperMemo(String operMemo)
	{
		this.operMemo = operMemo;
	}
	public String getOperMemo()
	{
		return this.operMemo;
	}
	public void setOtherBytxt1(String otherBytxt1)
	{
		this.otherBytxt1 = otherBytxt1;
	}
	public String getOtherBytxt1()
	{
		return this.otherBytxt1;
	}
	public void setOtherBytxt2(String otherBytxt2)
	{
		this.otherBytxt2 = otherBytxt2;
	}
	public String getOtherBytxt2()
	{
		return this.otherBytxt2;
	}
	public void setOtherBytxt3(String otherBytxt3)
	{
		this.otherBytxt3 = otherBytxt3;
	}
	public String getOtherBytxt3()
	{
		return this.otherBytxt3;
	}
	public void setOtherBynum1(Double otherBynum1)
	{
		this.otherBynum1 = otherBynum1;
	}
	public Double getOtherBynum1()
	{
		return this.otherBynum1;
	}
	public void setOtherBynum2(Double otherBynum2)
	{
		this.otherBynum2 = otherBynum2;
	}
	public Double getOtherBynum2()
	{
		return this.otherBynum2;
	}
	public void setOtherBynum3(Double otherBynum3)
	{
		this.otherBynum3 = otherBynum3;
	}
	public Double getOtherBynum3()
	{
		return this.otherBynum3;
	}
	public void setZeroAmt(Double zeroAmt)
	{
		this.zeroAmt = zeroAmt;
	}
	public Double getZeroAmt()
	{
		return this.zeroAmt;
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