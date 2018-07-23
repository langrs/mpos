package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:PosTSaleflow Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class PosTSaleflow implements Serializable
{
	private static final long serialVersionUID = 1L;

	// 
	protected Double flowId;
	// 
	protected String flowNo;
	// 
	protected String branchNo;
	// 
	protected String itemNo;
	// 
	protected Double sourcePrice;
	// 
	protected Double salePrice;
	// 
	protected Double saleQnty;
	// 
	protected Double saleMoney;
	// 
	protected String sellWay;
	// 
	protected String operId;
	// 
	protected String saleMan;
	// 
	protected String counterNo;
	// 
	protected Date operDate;
	// 
	protected String remoteFlag;
	// 
	protected String promtype;
	// 
	protected String presentflag;
	// 
	protected String cashflag;
	// 
	protected Double discount;
	// 
	protected String discounttype;
	// 
	protected String flowNoRet;
	
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
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setItemNo(String itemNo)
	{
		this.itemNo = itemNo;
	}
	public String getItemNo()
	{
		return this.itemNo;
	}
	public void setSourcePrice(Double sourcePrice)
	{
		this.sourcePrice = sourcePrice;
	}
	public Double getSourcePrice()
	{
		return this.sourcePrice;
	}
	public void setSalePrice(Double salePrice)
	{
		this.salePrice = salePrice;
	}
	public Double getSalePrice()
	{
		return this.salePrice;
	}
	public void setSaleQnty(Double saleQnty)
	{
		this.saleQnty = saleQnty;
	}
	public Double getSaleQnty()
	{
		return this.saleQnty;
	}
	public void setSaleMoney(Double saleMoney)
	{
		this.saleMoney = saleMoney;
	}
	public Double getSaleMoney()
	{
		return this.saleMoney;
	}
	public void setSellWay(String sellWay)
	{
		this.sellWay = sellWay;
	}
	public String getSellWay()
	{
		return this.sellWay;
	}
	public void setOperId(String operId)
	{
		this.operId = operId;
	}
	public String getOperId()
	{
		return this.operId;
	}
	public void setSaleMan(String saleMan)
	{
		this.saleMan = saleMan;
	}
	public String getSaleMan()
	{
		return this.saleMan;
	}
	public void setCounterNo(String counterNo)
	{
		this.counterNo = counterNo;
	}
	public String getCounterNo()
	{
		return this.counterNo;
	}
	public void setOperDate(Date operDate)
	{
		this.operDate = operDate;
	}
	public Date getOperDate()
	{
		return this.operDate;
	}
	public void setRemoteFlag(String remoteFlag)
	{
		this.remoteFlag = remoteFlag;
	}
	public String getRemoteFlag()
	{
		return this.remoteFlag;
	}
	public void setPromtype(String promtype)
	{
		this.promtype = promtype;
	}
	public String getPromtype()
	{
		return this.promtype;
	}
	public void setPresentflag(String presentflag)
	{
		this.presentflag = presentflag;
	}
	public String getPresentflag()
	{
		return this.presentflag;
	}
	public void setCashflag(String cashflag)
	{
		this.cashflag = cashflag;
	}
	public String getCashflag()
	{
		return this.cashflag;
	}
	public void setDiscount(Double discount)
	{
		this.discount = discount;
	}
	public Double getDiscount()
	{
		return this.discount;
	}
	public void setDiscounttype(String discounttype)
	{
		this.discounttype = discounttype;
	}
	public String getDiscounttype()
	{
		return this.discounttype;
	}
	public void setFlowNoRet(String flowNoRet)
	{
		this.flowNoRet = flowNoRet;
	}
	public String getFlowNoRet()
	{
		return this.flowNoRet;
	}
}  