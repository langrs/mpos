package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TaPayment Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TaPayment implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Double mustch;
	protected Double limitamt;
	protected Double exrate;
	protected Double priority;
	protected String funcno;
	protected String paycode;
	protected String paycodeerp;
	protected String payname;
	protected String paych;
	protected String spill;
	protected String deftime;
	protected String reservedfileld;
	protected String cnfflg;
	protected String erppayno;
	protected String ispaydisc;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	public void setMustch(Double mustch)
	{
		this.mustch = mustch;
	}
	public Double getMustch()
	{
		return this.mustch;
	}
	public void setLimitamt(Double limitamt)
	{
		this.limitamt = limitamt;
	}
	public Double getLimitamt()
	{
		return this.limitamt;
	}
	public void setExrate(Double exrate)
	{
		this.exrate = exrate;
	}
	public Double getExrate()
	{
		return this.exrate;
	}
	public void setPriority(Double priority)
	{
		this.priority = priority;
	}
	public Double getPriority()
	{
		return this.priority;
	}
	public void setFuncno(String funcno)
	{
		this.funcno = funcno;
	}
	public String getFuncno()
	{
		return this.funcno;
	}
	public void setPaycode(String paycode)
	{
		this.paycode = paycode;
	}
	public String getPaycode()
	{
		return this.paycode;
	}
	public void setPaycodeerp(String paycodeerp)
	{
		this.paycodeerp = paycodeerp;
	}
	public String getPaycodeerp()
	{
		return this.paycodeerp;
	}
	public void setPayname(String payname)
	{
		this.payname = payname;
	}
	public String getPayname()
	{
		return this.payname;
	}
	public void setPaych(String paych)
	{
		this.paych = paych;
	}
	public String getPaych()
	{
		return this.paych;
	}
	public void setSpill(String spill)
	{
		this.spill = spill;
	}
	public String getSpill()
	{
		return this.spill;
	}
	public void setDeftime(String deftime)
	{
		this.deftime = deftime;
	}
	public String getDeftime()
	{
		return this.deftime;
	}
	public void setReservedfileld(String reservedfileld)
	{
		this.reservedfileld = reservedfileld;
	}
	public String getReservedfileld()
	{
		return this.reservedfileld;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
	}
	public void setErppayno(String erppayno)
	{
		this.erppayno = erppayno;
	}
	public String getErppayno()
	{
		return this.erppayno;
	}
	public void setIspaydisc(String ispaydisc)
	{
		this.ispaydisc = ispaydisc;
	}
	public String getIspaydisc()
	{
		return this.ispaydisc;
	}
	public void setCompanyno(String companyno)
	{
		this.companyno = companyno;
	}
	public String getCompanyno()
	{
		return this.companyno;
	}
	public void setOrganizationno(String organizationno)
	{
		this.organizationno = organizationno;
	}
	public String getOrganizationno()
	{
		return this.organizationno;
	}
	public void setTrantime(String trantime)
	{
		this.trantime = trantime;
	}
	public String getTrantime()
	{
		return this.trantime;
	}
}  