package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:TCzcardInfo Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TCzcardInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String ckcode;
	// 
	protected String mkcode;
	// 
	protected String cardtype;
	// 
	protected String cardstatus;
	// 
	protected Date startdate;
	// 
	protected Date validDate;
	// 
	protected Double cardvalue;
	// 
	protected Double cardvalueTotal;
	// 
	protected Double cardvalueXf;
	// 
	protected Double cardvalueQl;
	// 
	protected Double cardvalueTz;
	// 
	protected Double cardvalueXfLast;
	// 
	protected Date cardvalueXfLastdate;
	// 
	protected String xfcs;
	// 
	protected String promtype;
	
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
	public void setCardstatus(String cardstatus)
	{
		this.cardstatus = cardstatus;
	}
	public String getCardstatus()
	{
		return this.cardstatus;
	}
	public void setStartdate(Date startdate)
	{
		this.startdate = startdate;
	}
	public Date getStartdate()
	{
		return this.startdate;
	}
	public void setValidDate(Date validDate)
	{
		this.validDate = validDate;
	}
	public Date getValidDate()
	{
		return this.validDate;
	}
	public void setCardvalue(Double cardvalue)
	{
		this.cardvalue = cardvalue;
	}
	public Double getCardvalue()
	{
		return this.cardvalue;
	}
	public void setCardvalueTotal(Double cardvalueTotal)
	{
		this.cardvalueTotal = cardvalueTotal;
	}
	public Double getCardvalueTotal()
	{
		return this.cardvalueTotal;
	}
	public void setCardvalueXf(Double cardvalueXf)
	{
		this.cardvalueXf = cardvalueXf;
	}
	public Double getCardvalueXf()
	{
		return this.cardvalueXf;
	}
	public void setCardvalueQl(Double cardvalueQl)
	{
		this.cardvalueQl = cardvalueQl;
	}
	public Double getCardvalueQl()
	{
		return this.cardvalueQl;
	}
	public void setCardvalueTz(Double cardvalueTz)
	{
		this.cardvalueTz = cardvalueTz;
	}
	public Double getCardvalueTz()
	{
		return this.cardvalueTz;
	}
	public void setCardvalueXfLast(Double cardvalueXfLast)
	{
		this.cardvalueXfLast = cardvalueXfLast;
	}
	public Double getCardvalueXfLast()
	{
		return this.cardvalueXfLast;
	}
	public void setCardvalueXfLastdate(Date cardvalueXfLastdate)
	{
		this.cardvalueXfLastdate = cardvalueXfLastdate;
	}
	public Date getCardvalueXfLastdate()
	{
		return this.cardvalueXfLastdate;
	}
	public void setXfcs(String xfcs)
	{
		this.xfcs = xfcs;
	}
	public String getXfcs()
	{
		return this.xfcs;
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