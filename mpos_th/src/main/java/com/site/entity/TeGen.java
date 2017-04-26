package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TeGen Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TeGen implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer promway;
	protected Integer totlmecount;
	protected Double priority;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String canfullprom;
	protected String canmedisc;
	protected String trantime;
	protected String extent;
	protected String promstack;
	protected String deftime;
	protected String reservedfileld;
	protected String cnfflg;
	protected String isprint;
	protected String printinfo;
	protected String paylimit;
	protected String inputway;
	protected String parobjet;
	public void setPromway(Integer promway)
	{
		this.promway = promway;
	}
	public Integer getPromway()
	{
		return this.promway;
	}
	public void setTotlmecount(Integer totlmecount)
	{
		this.totlmecount = totlmecount;
	}
	public Integer getTotlmecount()
	{
		return this.totlmecount;
	}
	public void setPriority(Double priority)
	{
		this.priority = priority;
	}
	public Double getPriority()
	{
		return this.priority;
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
	public void setCanfullprom(String canfullprom)
	{
		this.canfullprom = canfullprom;
	}
	public String getCanfullprom()
	{
		return this.canfullprom;
	}
	public void setCanmedisc(String canmedisc)
	{
		this.canmedisc = canmedisc;
	}
	public String getCanmedisc()
	{
		return this.canmedisc;
	}
	public void setTrantime(String trantime)
	{
		this.trantime = trantime;
	}
	public String getTrantime()
	{
		return this.trantime;
	}
	public void setExtent(String extent)
	{
		this.extent = extent;
	}
	public String getExtent()
	{
		return this.extent;
	}
	public void setPromstack(String promstack)
	{
		this.promstack = promstack;
	}
	public String getPromstack()
	{
		return this.promstack;
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
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
	}
	public void setIsprint(String isprint)
	{
		this.isprint = isprint;
	}
	public String getIsprint()
	{
		return this.isprint;
	}
	public void setPrintinfo(String printinfo)
	{
		this.printinfo = printinfo;
	}
	public String getPrintinfo()
	{
		return this.printinfo;
	}
	public void setPaylimit(String paylimit)
	{
		this.paylimit = paylimit;
	}
	public String getPaylimit()
	{
		return this.paylimit;
	}
	public void setInputway(String inputway)
	{
		this.inputway = inputway;
	}
	public String getInputway()
	{
		return this.inputway;
	}
	public void setParobjet(String parobjet)
	{
		this.parobjet = parobjet;
	}
	public String getParobjet()
	{
		return this.parobjet;
	}
}  