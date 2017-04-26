package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardRuleTime Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardRuleTime implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer timeno;
	protected String ruleno;
	protected String ctno;
	protected String lbdate;
	protected String ledate;
	protected String lbtime;
	protected String letime;
	protected String deftime;
	protected String reservedfileld;
	protected String fixeddate;
	protected String week;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
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