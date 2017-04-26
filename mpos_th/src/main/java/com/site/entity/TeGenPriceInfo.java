package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TeGenPriceInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TeGenPriceInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Double lbprice;
	protected Double leprice;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String groupno;
	protected String type;
	protected String code;
	protected String unit;
	protected String trantime;
	protected String cnfflg;
	protected String exclude;
	protected String rarea;
	protected String deftime;
	protected String reservedfileld;
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
	public void setGroupno(String groupno)
	{
		this.groupno = groupno;
	}
	public String getGroupno()
	{
		return this.groupno;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return this.type;
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
	public void setExclude(String exclude)
	{
		this.exclude = exclude;
	}
	public String getExclude()
	{
		return this.exclude;
	}
	public void setRarea(String rarea)
	{
		this.rarea = rarea;
	}
	public String getRarea()
	{
		return this.rarea;
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