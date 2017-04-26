package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfMemberDay Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfMemberDay implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String memberno;
	protected String memorialno;
	protected String explain;
	protected String mdate;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setMemberno(String memberno)
	{
		this.memberno = memberno;
	}
	public String getMemberno()
	{
		return this.memberno;
	}
	public void setMemorialno(String memorialno)
	{
		this.memorialno = memorialno;
	}
	public String getMemorialno()
	{
		return this.memorialno;
	}
	public void setExplain(String explain)
	{
		this.explain = explain;
	}
	public String getExplain()
	{
		return this.explain;
	}
	public void setMdate(String mdate)
	{
		this.mdate = mdate;
	}
	public String getMdate()
	{
		return this.mdate;
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