package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardRuleRange Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardRuleRange implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String companyno;
	protected String organizationno;
	protected String ruleno;
	protected String ctno;
	protected String rangeshop;
	protected String cnfflg;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
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
	public void setRuleno(String ruleno)
	{
		this.ruleno = ruleno;
	}
	public String getRuleno()
	{
		return this.ruleno;
	}
	public void setCtno(String ctno)
	{
		this.ctno = ctno;
	}
	public String getCtno()
	{
		return this.ctno;
	}
	public void setRangeshop(String rangeshop)
	{
		this.rangeshop = rangeshop;
	}
	public String getRangeshop()
	{
		return this.rangeshop;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
	}
	public void setTrantime(String trantime)
	{
		this.trantime = trantime;
	}
	public String getTrantime()
	{
		return this.trantime;
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
}  