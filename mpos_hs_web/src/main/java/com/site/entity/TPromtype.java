package com.site.entity;

import java.io.Serializable;

/**
 * 对象功能:TPromtype Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TPromtype implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String promtype;
	// 
	protected String promname;
	// 
	protected Double base;
	// 
	protected Double promvalue;
	// 
	protected String promflag;
	// 
	protected String remark;
	
	public void setPromtype(String promtype)
	{
		this.promtype = promtype;
	}
	public String getPromtype()
	{
		return this.promtype;
	}
	public void setPromname(String promname)
	{
		this.promname = promname;
	}
	public String getPromname()
	{
		return this.promname;
	}
	public void setBase(Double base)
	{
		this.base = base;
	}
	public Double getBase()
	{
		return this.base;
	}
	public void setPromvalue(Double promvalue)
	{
		this.promvalue = promvalue;
	}
	public Double getPromvalue()
	{
		return this.promvalue;
	}
	public void setPromflag(String promflag)
	{
		this.promflag = promflag;
	}
	public String getPromflag()
	{
		return this.promflag;
	}
	public void setRemark(String remark)
	{
		this.remark = remark;
	}
	public String getRemark()
	{
		return this.remark;
	}
}  