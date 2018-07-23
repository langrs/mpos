package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCustCoupon Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCustCoupon extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *顾客ID
        */
	protected String custId;
        /**
        *券ID
        */
	protected String couponId;
        /**
        *发券日期
        */
	protected Date sendDate;
        /**
        *分店ID
        */
	protected String shopId;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setCustId(String custId) 
	{
		this.custId = custId;
	}
	public String getCustId() 
	{
		return this.custId;
	}
	public void setCouponId(String couponId) 
	{
		this.couponId = couponId;
	}
	public String getCouponId() 
	{
		return this.couponId;
	}
	public void setSendDate(Date sendDate) 
	{
		this.sendDate = sendDate;
	}
	public Date getSendDate() 
	{
		return this.sendDate;
	}
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
	}
}