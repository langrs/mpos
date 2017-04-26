package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TePromPre Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TePromPre implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Double exchangecount;
	protected Double extraamt;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String condgroupno;
	protected String exchangegroupno;
	protected String objectgroupno;
	protected String cnfflg;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setExchangecount(Double exchangecount)
	{
		this.exchangecount = exchangecount;
	}
	public Double getExchangecount()
	{
		return this.exchangecount;
	}
	public void setExtraamt(Double extraamt)
	{
		this.extraamt = extraamt;
	}
	public Double getExtraamt()
	{
		return this.extraamt;
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
	public void setCondgroupno(String condgroupno)
	{
		this.condgroupno = condgroupno;
	}
	public String getCondgroupno()
	{
		return this.condgroupno;
	}
	public void setExchangegroupno(String exchangegroupno)
	{
		this.exchangegroupno = exchangegroupno;
	}
	public String getExchangegroupno()
	{
		return this.exchangegroupno;
	}
	public void setObjectgroupno(String objectgroupno)
	{
		this.objectgroupno = objectgroupno;
	}
	public String getObjectgroupno()
	{
		return this.objectgroupno;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
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