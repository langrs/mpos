package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardTypeRuleNdetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardTypeRuleNdetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer ruletype;
	protected String ctno;
	protected String code;
	protected String cnfflg;
	protected String companyno;
	protected String ruleno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setRuletype(Integer ruletype)
	{
		this.ruletype = ruletype;
	}
	public Integer getRuletype()
	{
		return this.ruletype;
	}
	public void setCtno(String ctno)
	{
		this.ctno = ctno;
	}
	public String getCtno()
	{
		return this.ctno;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getCode()
	{
		return this.code;
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
	public void setRuleno(String ruleno)
	{
		this.ruleno = ruleno;
	}
	public String getRuleno()
	{
		return this.ruleno;
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