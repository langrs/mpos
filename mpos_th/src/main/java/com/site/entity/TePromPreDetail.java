package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TePromPreDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TePromPreDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Double quota;
	protected Double lbprice;
	protected Double leprice;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String exchangegroupno;
	protected String plugroupno;
	protected String type;
	protected String rechargetype;
	protected String code;
	protected String unit;
	protected String cnfflg;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setQuota(Double quota)
	{
		this.quota = quota;
	}
	public Double getQuota()
	{
		return this.quota;
	}
	public void setLbprice(Double lbprice)
	{
		this.lbprice = lbprice;
	}
	public Double getLbprice()
	{
		return this.lbprice;
	}
	public void setLeprice(Double leprice)
	{
		this.leprice = leprice;
	}
	public Double getLeprice()
	{
		return this.leprice;
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
	public void setExchangegroupno(String exchangegroupno)
	{
		this.exchangegroupno = exchangegroupno;
	}
	public String getExchangegroupno()
	{
		return this.exchangegroupno;
	}
	public void setPlugroupno(String plugroupno)
	{
		this.plugroupno = plugroupno;
	}
	public String getPlugroupno()
	{
		return this.plugroupno;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return this.type;
	}
	public void setRechargetype(String rechargetype)
	{
		this.rechargetype = rechargetype;
	}
	public String getRechargetype()
	{
		return this.rechargetype;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getCode()
	{
		return this.code;
	}
	public void setUnit(String unit)
	{
		this.unit = unit;
	}
	public String getUnit()
	{
		return this.unit;
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