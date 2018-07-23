package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:TGiftcoupon Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TGiftcoupon implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String giftcouponno;
	// 
	protected String shopno;
	// 
	protected Integer billstate;
	// 
	protected Integer giftflag;
	// 
	protected Double giftprice;
	// 
	protected String operator;
	// 
	protected Date opdate;
	// 
	protected String reserve1;
	// 
	protected String reserve2;
	// 
	protected String reserve3;
	//
	protected String gifttype;

	public String getGifttype() {
		return gifttype;
	}

	public void setGifttype(String gifttype) {
		this.gifttype = gifttype;
	}

	public void setGiftcouponno(String giftcouponno)
	{
		this.giftcouponno = giftcouponno;
	}
	public String getGiftcouponno()
	{
		return this.giftcouponno;
	}
	public void setShopno(String shopno)
	{
		this.shopno = shopno;
	}
	public String getShopno()
	{
		return this.shopno;
	}
	public void setBillstate(Integer billstate)
	{
		this.billstate = billstate;
	}
	public Integer getBillstate()
	{
		return this.billstate;
	}
	public void setGiftflag(Integer giftflag)
	{
		this.giftflag = giftflag;
	}
	public Integer getGiftflag()
	{
		return this.giftflag;
	}
	public void setGiftprice(Double giftprice)
	{
		this.giftprice = giftprice;
	}
	public Double getGiftprice()
	{
		return this.giftprice;
	}
	public void setOperator(String operator)
	{
		this.operator = operator;
	}
	public String getOperator()
	{
		return this.operator;
	}
	public void setOpdate(Date opdate)
	{
		this.opdate = opdate;
	}
	public Date getOpdate()
	{
		return this.opdate;
	}
	public void setReserve1(String reserve1)
	{
		this.reserve1 = reserve1;
	}
	public String getReserve1()
	{
		return this.reserve1;
	}
	public void setReserve2(String reserve2)
	{
		this.reserve2 = reserve2;
	}
	public String getReserve2()
	{
		return this.reserve2;
	}
	public void setReserve3(String reserve3)
	{
		this.reserve3 = reserve3;
	}
	public String getReserve3()
	{
		return this.reserve3;
	}
}  