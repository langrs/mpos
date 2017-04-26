package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardTypeRule Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardTypeRule implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer ruletype;
	protected Double priority;
	protected String ctno;
	protected String ruleway;
	protected String exclude;
	protected String lbdate;
	protected String ledate;
	protected String cnfflg;
	protected String deftime;
	protected String reservedfileld;
	protected String discway;
	protected String companyno;
	protected String ruleno;
	protected String ctnotype;
	protected String organizationno;
	protected String trantime;
	public void setRuletype(Integer ruletype)
	{
		this.ruletype = ruletype;
	}
	public Integer getRuletype()
	{
		return this.ruletype;
	}
	public void setPriority(Double priority)
	{
		this.priority = priority;
	}
	public Double getPriority()
	{
		return this.priority;
	}
	public void setCtno(String ctno)
	{
		this.ctno = ctno;
	}
	public String getCtno()
	{
		return this.ctno;
	}
	public void setRuleway(String ruleway)
	{
		this.ruleway = ruleway;
	}
	public String getRuleway()
	{
		return this.ruleway;
	}
	public void setExclude(String exclude)
	{
		this.exclude = exclude;
	}
	public String getExclude()
	{
		return this.exclude;
	}
	public void setLbdate(String lbdate)
	{
		this.lbdate = lbdate;
	}
	public String getLbdate()
	{
		return this.lbdate;
	}
	public void setLedate(String ledate)
	{
		this.ledate = ledate;
	}
	public String getLedate()
	{
		return this.ledate;
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
	public void setDiscway(String discway)
	{
		this.discway = discway;
	}
	public String getDiscway()
	{
		return this.discway;
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
	public void setCtnotype(String ctnotype)
	{
		this.ctnotype = ctnotype;
	}
	public String getCtnotype()
	{
		return this.ctnotype;
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