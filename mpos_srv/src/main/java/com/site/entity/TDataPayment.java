package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TDataPayment Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TDataPayment implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String paymentNo;
	// 
	protected String paymentName;
	// 
	protected String paymentIsPos;
	// 
	protected String paymentIsHt;
	// 
	protected String paymentIsZero;
	// 
	protected String paymentIsMore;
	// 
	protected String paymentIsCash;
	// 
	protected String coinNo;
	// 
	protected String visaNo;
	// 
	protected String posShortcutSys;
	// 
	protected String posShortcutUser;
	// 
	protected String paymentMemo;
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
	protected String paymentIsSn;
	// 
	protected String paymentIsMemo;
	// 
	protected String paymentIsTax;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String touchIndex;
	// 
	protected Double chargeRate;
	// 
	protected Double chargeMaxAmt;
	// 
	protected String paymentIsReal;
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
	public void setPaymentName(String paymentName)
	{
		this.paymentName = paymentName;
	}
	public String getPaymentName()
	{
		return this.paymentName;
	}
	public void setPaymentIsPos(String paymentIsPos)
	{
		this.paymentIsPos = paymentIsPos;
	}
	public String getPaymentIsPos()
	{
		return this.paymentIsPos;
	}
	public void setPaymentIsHt(String paymentIsHt)
	{
		this.paymentIsHt = paymentIsHt;
	}
	public String getPaymentIsHt()
	{
		return this.paymentIsHt;
	}
	public void setPaymentIsZero(String paymentIsZero)
	{
		this.paymentIsZero = paymentIsZero;
	}
	public String getPaymentIsZero()
	{
		return this.paymentIsZero;
	}
	public void setPaymentIsMore(String paymentIsMore)
	{
		this.paymentIsMore = paymentIsMore;
	}
	public String getPaymentIsMore()
	{
		return this.paymentIsMore;
	}
	public void setPaymentIsCash(String paymentIsCash)
	{
		this.paymentIsCash = paymentIsCash;
	}
	public String getPaymentIsCash()
	{
		return this.paymentIsCash;
	}
	public void setCoinNo(String coinNo)
	{
		this.coinNo = coinNo;
	}
	public String getCoinNo()
	{
		return this.coinNo;
	}
	public void setVisaNo(String visaNo)
	{
		this.visaNo = visaNo;
	}
	public String getVisaNo()
	{
		return this.visaNo;
	}
	public void setPosShortcutSys(String posShortcutSys)
	{
		this.posShortcutSys = posShortcutSys;
	}
	public String getPosShortcutSys()
	{
		return this.posShortcutSys;
	}
	public void setPosShortcutUser(String posShortcutUser)
	{
		this.posShortcutUser = posShortcutUser;
	}
	public String getPosShortcutUser()
	{
		return this.posShortcutUser;
	}
	public void setPaymentMemo(String paymentMemo)
	{
		this.paymentMemo = paymentMemo;
	}
	public String getPaymentMemo()
	{
		return this.paymentMemo;
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
	public void setPaymentIsSn(String paymentIsSn)
	{
		this.paymentIsSn = paymentIsSn;
	}
	public String getPaymentIsSn()
	{
		return this.paymentIsSn;
	}
	public void setPaymentIsMemo(String paymentIsMemo)
	{
		this.paymentIsMemo = paymentIsMemo;
	}
	public String getPaymentIsMemo()
	{
		return this.paymentIsMemo;
	}
	public void setPaymentIsTax(String paymentIsTax)
	{
		this.paymentIsTax = paymentIsTax;
	}
	public String getPaymentIsTax()
	{
		return this.paymentIsTax;
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
	public void setTouchIndex(String touchIndex)
	{
		this.touchIndex = touchIndex;
	}
	public String getTouchIndex()
	{
		return this.touchIndex;
	}
	public void setChargeRate(Double chargeRate)
	{
		this.chargeRate = chargeRate;
	}
	public Double getChargeRate()
	{
		return this.chargeRate;
	}
	public void setChargeMaxAmt(Double chargeMaxAmt)
	{
		this.chargeMaxAmt = chargeMaxAmt;
	}
	public Double getChargeMaxAmt()
	{
		return this.chargeMaxAmt;
	}
	public void setPaymentIsReal(String paymentIsReal)
	{
		this.paymentIsReal = paymentIsReal;
	}
	public String getPaymentIsReal()
	{
		return this.paymentIsReal;
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