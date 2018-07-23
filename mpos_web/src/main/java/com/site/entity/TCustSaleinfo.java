package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCustSaleinfo Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCustSaleinfo extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *分店ID
        */
	protected String shopId;
        /**
        *顾客ID
        */
	protected String custId;
        /**
        *小票ID
        */
	protected String saleId;
        /**
        *小票流水
        */
	protected String saleNo;
        /**
        *电子小票类型
        */
	protected String ebillType;
        /**
        *发送日期
        */
	protected Date sendDate;
        /**
        *消费日期
        */
	protected Date saleDate;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
	}
	public void setCustId(String custId) 
	{
		this.custId = custId;
	}
	public String getCustId() 
	{
		return this.custId;
	}
	public void setSaleId(String saleId) 
	{
		this.saleId = saleId;
	}
	public String getSaleId() 
	{
		return this.saleId;
	}
	public void setSaleNo(String saleNo) 
	{
		this.saleNo = saleNo;
	}
	public String getSaleNo() 
	{
		return this.saleNo;
	}
	public void setEbillType(String ebillType) 
	{
		this.ebillType = ebillType;
	}
	public String getEbillType() 
	{
		return this.ebillType;
	}
	public void setSendDate(Date sendDate) 
	{
		this.sendDate = sendDate;
	}
	public Date getSendDate() 
	{
		return this.sendDate;
	}
	public void setSaleDate(Date saleDate) 
	{
		this.saleDate = saleDate;
	}
	public Date getSaleDate() 
	{
		return this.saleDate;
	}
}