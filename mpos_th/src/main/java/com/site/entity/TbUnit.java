package com.site.entity;  
  
import java.io.Serializable;
 /**
 * FUNCTION:TbUnit Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TbUnit implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String unit;
	protected String uname;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setUnit(String unit)
	{
		this.unit = unit;
	}
	public String getUnit()
	{
		return this.unit;
	}
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	public String getUname()
	{
		return this.uname;
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