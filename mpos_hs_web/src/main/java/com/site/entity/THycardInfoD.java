package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:THycardInfoD Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class THycardInfoD implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected Date opdate;
	// 
	protected String opdatechar;
	// 
	protected String ckcode;
	// 
	protected String mkcode;
	// 
	protected String cardtype;
	// 
	protected String optype;
	// 
	protected String billno;
	// 
	protected Double saleamount;
	// 
	protected Double jf;
	
	public void setOpdate(Date opdate)
	{
		this.opdate = opdate;
	}
	public Date getOpdate()
	{
		return this.opdate;
	}
	public void setOpdatechar(String opdatechar)
	{
		this.opdatechar = opdatechar;
	}
	public String getOpdatechar()
	{
		return this.opdatechar;
	}
	public void setCkcode(String ckcode)
	{
		this.ckcode = ckcode;
	}
	public String getCkcode()
	{
		return this.ckcode;
	}
	public void setMkcode(String mkcode)
	{
		this.mkcode = mkcode;
	}
	public String getMkcode()
	{
		return this.mkcode;
	}
	public void setCardtype(String cardtype)
	{
		this.cardtype = cardtype;
	}
	public String getCardtype()
	{
		return this.cardtype;
	}
	public void setOptype(String optype)
	{
		this.optype = optype;
	}
	public String getOptype()
	{
		return this.optype;
	}
	public void setBillno(String billno)
	{
		this.billno = billno;
	}
	public String getBillno()
	{
		return this.billno;
	}
	public void setSaleamount(Double saleamount)
	{
		this.saleamount = saleamount;
	}
	public Double getSaleamount()
	{
		return this.saleamount;
	}
	public void setJf(Double jf)
	{
		this.jf = jf;
	}
	public Double getJf()
	{
		return this.jf;
	}
}  