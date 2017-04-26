package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TePromObjetDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TePromObjetDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String groupno;
	protected String objectprop;
	protected String code;
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
	public void setGroupno(String groupno)
	{
		this.groupno = groupno;
	}
	public String getGroupno()
	{
		return this.groupno;
	}
	public void setObjectprop(String objectprop)
	{
		this.objectprop = objectprop;
	}
	public String getObjectprop()
	{
		return this.objectprop;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getCode()
	{
		return this.code;
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