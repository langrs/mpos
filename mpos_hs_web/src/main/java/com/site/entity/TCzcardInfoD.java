package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:TCzcardInfoD Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TCzcardInfoD implements Serializable
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
	protected String optype;
	// 
	protected String billno;
	// 
	protected Double cardvalue;
	// 
	protected String promtype;
	
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
	public void setCardvalue(Double cardvalue)
	{
		this.cardvalue = cardvalue;
	}
	public Double getCardvalue()
	{
		return this.cardvalue;
	}
	public void setPromtype(String promtype)
	{
		this.promtype = promtype;
	}
	public String getPromtype()
	{
		return this.promtype;
	}
}  