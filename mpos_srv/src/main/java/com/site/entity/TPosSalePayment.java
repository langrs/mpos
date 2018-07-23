package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TPosSalePayment Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TPosSalePayment implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String sheetNo;
	// 
	protected String sheetSort;
	// 
	protected String paymentNo;
	// 
	protected Double paymentAmt;
	// 
	protected String isOrder;
	// 
	protected String coinNo;
	// 
	protected Double coinRate;
	// 
	protected String vipNo;
	// 
	protected String cardNo;
	// 
	protected String bankType;
	// 
	protected String bankNo;
	// 
	protected String otherNo;
	// 
	protected String paymentMemo;
	// 
	protected Double parAmt;
	public void setSheetNo(String sheetNo)
	{
		this.sheetNo = sheetNo;
	}
	public String getSheetNo()
	{
		return this.sheetNo;
	}
	public void setSheetSort(String sheetSort)
	{
		this.sheetSort = sheetSort;
	}
	public String getSheetSort()
	{
		return this.sheetSort;
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
	public void setIsOrder(String isOrder)
	{
		this.isOrder = isOrder;
	}
	public String getIsOrder()
	{
		return this.isOrder;
	}
	public void setCoinNo(String coinNo)
	{
		this.coinNo = coinNo;
	}
	public String getCoinNo()
	{
		return this.coinNo;
	}
	public void setCoinRate(Double coinRate)
	{
		this.coinRate = coinRate;
	}
	public Double getCoinRate()
	{
		return this.coinRate;
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
	public void setBankType(String bankType)
	{
		this.bankType = bankType;
	}
	public String getBankType()
	{
		return this.bankType;
	}
	public void setBankNo(String bankNo)
	{
		this.bankNo = bankNo;
	}
	public String getBankNo()
	{
		return this.bankNo;
	}
	public void setOtherNo(String otherNo)
	{
		this.otherNo = otherNo;
	}
	public String getOtherNo()
	{
		return this.otherNo;
	}
	public void setPaymentMemo(String paymentMemo)
	{
		this.paymentMemo = paymentMemo;
	}
	public String getPaymentMemo()
	{
		return this.paymentMemo;
	}
	public void setParAmt(Double parAmt)
	{
		this.parAmt = parAmt;
	}
	public Double getParAmt()
	{
		return this.parAmt;
	}
}  