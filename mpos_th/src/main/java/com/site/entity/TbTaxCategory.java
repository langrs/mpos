package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TbTaxCategory Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TbTaxCategory implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Double taxrate;
	protected Double fixtax;
	protected String taxcode;
	protected String taxname;
	protected String taxtype;
	protected String incltax;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setTaxrate(Double taxrate)
	{
		this.taxrate = taxrate;
	}
	public Double getTaxrate()
	{
		return this.taxrate;
	}
	public void setFixtax(Double fixtax)
	{
		this.fixtax = fixtax;
	}
	public Double getFixtax()
	{
		return this.fixtax;
	}
	public void setTaxcode(String taxcode)
	{
		this.taxcode = taxcode;
	}
	public String getTaxcode()
	{
		return this.taxcode;
	}
	public void setTaxname(String taxname)
	{
		this.taxname = taxname;
	}
	public String getTaxname()
	{
		return this.taxname;
	}
	public void setTaxtype(String taxtype)
	{
		this.taxtype = taxtype;
	}
	public String getTaxtype()
	{
		return this.taxtype;
	}
	public void setIncltax(String incltax)
	{
		this.incltax = incltax;
	}
	public String getIncltax()
	{
		return this.incltax;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
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