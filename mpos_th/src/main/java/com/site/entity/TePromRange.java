package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TePromRange Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TePromRange implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String counterno;
	protected String trantime;
	protected String cnfflg;
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
	public void setPromno(String promno)
	{
		this.promno = promno;
	}
	public String getPromno()
	{
		return this.promno;
	}
	public void setCounterno(String counterno)
	{
		this.counterno = counterno;
	}
	public String getCounterno()
	{
		return this.counterno;
	}
	public void setTrantime(String trantime)
	{
		this.trantime = trantime;
	}
	public String getTrantime()
	{
		return this.trantime;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
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