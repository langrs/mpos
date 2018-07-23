package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:TGiftcouponD Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TGiftcouponD implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String giftcouponno;
	// 
	protected String shopno;
	// 
	protected String saleno;
	// 
	protected String barcode;
	// 
	protected Double saleprice;
	// 
	protected String gifttype;
	// 
	protected Double giftvalue;
	// 
	protected String giftnum;
	// 
	protected Date saledate;
	// 
	protected Date validity;
	// 
	protected String reserve1;
	// 
	protected String reserve2;
	// 
	protected String reserve3;
	
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
	public void setSaleno(String saleno)
	{
		this.saleno = saleno;
	}
	public String getSaleno()
	{
		return this.saleno;
	}
	public void setBarcode(String barcode)
	{
		this.barcode = barcode;
	}
	public String getBarcode()
	{
		return this.barcode;
	}
	public void setSaleprice(Double saleprice)
	{
		this.saleprice = saleprice;
	}
	public Double getSaleprice()
	{
		return this.saleprice;
	}
	public void setGifttype(String gifttype)
	{
		this.gifttype = gifttype;
	}
	public String getGifttype()
	{
		return this.gifttype;
	}
	public void setGiftvalue(Double giftvalue)
	{
		this.giftvalue = giftvalue;
	}
	public Double getGiftvalue()
	{
		return this.giftvalue;
	}
	public void setGiftnum(String giftnum)
	{
		this.giftnum = giftnum;
	}
	public String getGiftnum()
	{
		return this.giftnum;
	}
	public void setSaledate(Date saledate)
	{
		this.saledate = saledate;
	}
	public Date getSaledate()
	{
		return this.saledate;
	}
	public void setValidity(Date validity)
	{
		this.validity = validity;
	}
	public Date getValidity()
	{
		return this.validity;
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