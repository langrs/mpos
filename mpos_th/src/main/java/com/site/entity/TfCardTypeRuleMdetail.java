package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardTypeRuleMdetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardTypeRuleMdetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer ruletype;
	protected Integer requirement;
	protected Integer basescore;
	protected Integer mulscore;
	protected Integer prescore;
	protected Integer mdisc;
	protected Integer beforeday;
	protected Integer afterday;
	protected Integer prioritem;
	protected String ctno;
	protected String memorialno;
	protected String cnfflg;
	protected String hruletype;
	protected String isexclusion;
	protected String requiretype;
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
	public void setRequirement(Integer requirement)
	{
		this.requirement = requirement;
	}
	public Integer getRequirement()
	{
		return this.requirement;
	}
	public void setBasescore(Integer basescore)
	{
		this.basescore = basescore;
	}
	public Integer getBasescore()
	{
		return this.basescore;
	}
	public void setMulscore(Integer mulscore)
	{
		this.mulscore = mulscore;
	}
	public Integer getMulscore()
	{
		return this.mulscore;
	}
	public void setPrescore(Integer prescore)
	{
		this.prescore = prescore;
	}
	public Integer getPrescore()
	{
		return this.prescore;
	}
	public void setMdisc(Integer mdisc)
	{
		this.mdisc = mdisc;
	}
	public Integer getMdisc()
	{
		return this.mdisc;
	}
	public void setBeforeday(Integer beforeday)
	{
		this.beforeday = beforeday;
	}
	public Integer getBeforeday()
	{
		return this.beforeday;
	}
	public void setAfterday(Integer afterday)
	{
		this.afterday = afterday;
	}
	public Integer getAfterday()
	{
		return this.afterday;
	}
	public void setPrioritem(Integer prioritem)
	{
		this.prioritem = prioritem;
	}
	public Integer getPrioritem()
	{
		return this.prioritem;
	}
	public void setCtno(String ctno)
	{
		this.ctno = ctno;
	}
	public String getCtno()
	{
		return this.ctno;
	}
	public void setMemorialno(String memorialno)
	{
		this.memorialno = memorialno;
	}
	public String getMemorialno()
	{
		return this.memorialno;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
	}
	public void setHruletype(String hruletype)
	{
		this.hruletype = hruletype;
	}
	public String getHruletype()
	{
		return this.hruletype;
	}
	public void setIsexclusion(String isexclusion)
	{
		this.isexclusion = isexclusion;
	}
	public String getIsexclusion()
	{
		return this.isexclusion;
	}
	public void setRequiretype(String requiretype)
	{
		this.requiretype = requiretype;
	}
	public String getRequiretype()
	{
		return this.requiretype;
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