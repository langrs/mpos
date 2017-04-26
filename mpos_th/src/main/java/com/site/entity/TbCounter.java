package com.site.entity;  
  
import java.io.Serializable;
 /**
 * FUNCTION:TbCounter Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TbCounter implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer ldisc;
	protected String counterno;
	protected String countername;
	protected String lbdate;
	protected String ledate;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setLdisc(Integer ldisc)
	{
		this.ldisc = ldisc;
	}
	public Integer getLdisc()
	{
		return this.ldisc;
	}
	public void setCounterno(String counterno)
	{
		this.counterno = counterno;
	}
	public String getCounterno()
	{
		return this.counterno;
	}
	public void setCountername(String countername)
	{
		this.countername = countername;
	}
	public String getCountername()
	{
		return this.countername;
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