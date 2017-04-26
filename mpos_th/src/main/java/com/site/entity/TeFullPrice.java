package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TeFullPrice Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TeFullPrice implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer condgroupno;
	protected Double condfull;
	protected Double rebaterate;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String trantime;
	protected String cnfflg;
	protected String plucond;
	protected String isinteger;
	protected String deftime;
	protected String reservedfileld;
	public void setCondgroupno(Integer condgroupno)
	{
		this.condgroupno = condgroupno;
	}
	public Integer getCondgroupno()
	{
		return this.condgroupno;
	}
	public void setCondfull(Double condfull)
	{
		this.condfull = condfull;
	}
	public Double getCondfull()
	{
		return this.condfull;
	}
	public void setRebaterate(Double rebaterate)
	{
		this.rebaterate = rebaterate;
	}
	public Double getRebaterate()
	{
		return this.rebaterate;
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
	public void setPromno(String promno)
	{
		this.promno = promno;
	}
	public String getPromno()
	{
		return this.promno;
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
	public void setPlucond(String plucond)
	{
		this.plucond = plucond;
	}
	public String getPlucond()
	{
		return this.plucond;
	}
	public void setIsinteger(String isinteger)
	{
		this.isinteger = isinteger;
	}
	public String getIsinteger()
	{
		return this.isinteger;
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