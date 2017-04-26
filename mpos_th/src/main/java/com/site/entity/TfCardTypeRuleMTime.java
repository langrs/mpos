package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardTypeRuleMTime Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardTypeRuleMTime implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer ruletype;
	protected Integer timeno;
	protected String ruleno;
	protected String ctno;
	protected String memorialno;
	protected String hruletype;
	protected String begindate;
	protected String enddate;
	protected String organizationno;
	protected String trantime;
	protected String lbtime;
	protected String letime;
	protected String fixeddate;
	protected String week;
	protected String cnfflg;
	protected String companyno;
	public void setRuletype(Integer ruletype)
	{
		this.ruletype = ruletype;
	}
	public Integer getRuletype()
	{
		return this.ruletype;
	}
	public void setTimeno(Integer timeno)
	{
		this.timeno = timeno;
	}
	public Integer getTimeno()
	{
		return this.timeno;
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
	public void setMemorialno(String memorialno)
	{
		this.memorialno = memorialno;
	}
	public String getMemorialno()
	{
		return this.memorialno;
	}
	public void setHruletype(String hruletype)
	{
		this.hruletype = hruletype;
	}
	public String getHruletype()
	{
		return this.hruletype;
	}
	public void setBegindate(String begindate)
	{
		this.begindate = begindate;
	}
	public String getBegindate()
	{
		return this.begindate;
	}
	public void setEnddate(String enddate)
	{
		this.enddate = enddate;
	}
	public String getEnddate()
	{
		return this.enddate;
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
	public void setLbtime(String lbtime)
	{
		this.lbtime = lbtime;
	}
	public String getLbtime()
	{
		return this.lbtime;
	}
	public void setLetime(String letime)
	{
		this.letime = letime;
	}
	public String getLetime()
	{
		return this.letime;
	}
	public void setFixeddate(String fixeddate)
	{
		this.fixeddate = fixeddate;
	}
	public String getFixeddate()
	{
		return this.fixeddate;
	}
	public void setWeek(String week)
	{
		this.week = week;
	}
	public String getWeek()
	{
		return this.week;
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
}  