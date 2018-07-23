package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:PosTPayflow Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class PosTPayflow implements Serializable
{
	private static final long serialVersionUID = 1L;

	// 
	protected Double flowId;
	// 
	protected String flowNo;
	// 
	protected Double saleAmount;
	// 
	protected String branchNo;
	// 
	protected String payWay;
	// 
	protected String sellWay;
	// 
	protected String cardNo;
	// 
	protected String vipNo;
	// 
	protected String coinNo;
	// 
	protected Double coinRate;
	// 
	protected Double payAmount;
	// 
	protected Date operDate;
	// 
	protected String operId;
	// 
	protected String counterNo;
	// 
	protected String saleMan;
	// 
	protected String memo;
	// 
	protected String voucherNo;
	// 
	protected String remoteFlag;
	// 
	protected String exchangeFlag;
	
	public void setFlowId(Double flowId)
	{
		this.flowId = flowId;
	}
	public Double getFlowId()
	{
		return this.flowId;
	}
	public void setFlowNo(String flowNo)
	{
		this.flowNo = flowNo;
	}
	public String getFlowNo()
	{
		return this.flowNo;
	}
	public void setSaleAmount(Double saleAmount)
	{
		this.saleAmount = saleAmount;
	}
	public Double getSaleAmount()
	{
		return this.saleAmount;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setPayWay(String payWay)
	{
		this.payWay = payWay;
	}
	public String getPayWay()
	{
		return this.payWay;
	}
	public void setSellWay(String sellWay)
	{
		this.sellWay = sellWay;
	}
	public String getSellWay()
	{
		return this.sellWay;
	}
	public void setCardNo(String cardNo)
	{
		this.cardNo = cardNo;
	}
	public String getCardNo()
	{
		return this.cardNo;
	}
	public void setVipNo(String vipNo)
	{
		this.vipNo = vipNo;
	}
	public String getVipNo()
	{
		return this.vipNo;
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
	public void setPayAmount(Double payAmount)
	{
		this.payAmount = payAmount;
	}
	public Double getPayAmount()
	{
		return this.payAmount;
	}
	public void setOperDate(Date operDate)
	{
		this.operDate = operDate;
	}
	public Date getOperDate()
	{
		return this.operDate;
	}
	public void setOperId(String operId)
	{
		this.operId = operId;
	}
	public String getOperId()
	{
		return this.operId;
	}
	public void setCounterNo(String counterNo)
	{
		this.counterNo = counterNo;
	}
	public String getCounterNo()
	{
		return this.counterNo;
	}
	public void setSaleMan(String saleMan)
	{
		this.saleMan = saleMan;
	}
	public String getSaleMan()
	{
		return this.saleMan;
	}
	public void setMemo(String memo)
	{
		this.memo = memo;
	}
	public String getMemo()
	{
		return this.memo;
	}
	public void setVoucherNo(String voucherNo)
	{
		this.voucherNo = voucherNo;
	}
	public String getVoucherNo()
	{
		return this.voucherNo;
	}
	public void setRemoteFlag(String remoteFlag)
	{
		this.remoteFlag = remoteFlag;
	}
	public String getRemoteFlag()
	{
		return this.remoteFlag;
	}
	public void setExchangeFlag(String exchangeFlag)
	{
		this.exchangeFlag = exchangeFlag;
	}
	public String getExchangeFlag()
	{
		return this.exchangeFlag;
	}
}  