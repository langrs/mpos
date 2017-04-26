package com.site.entity;  
  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardTypeStatus Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardTypeStatus implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Double ypoint;
	protected String memberno;
	protected String ctno;
	protected String cardno;
	protected String cardstatus;
	protected String validity;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setYpoint(Double ypoint)
	{
		this.ypoint = ypoint;
	}
	public Double getYpoint()
	{
		return this.ypoint;
	}
	public void setMemberno(String memberno)
	{
		this.memberno = memberno;
	}
	public String getMemberno()
	{
		return this.memberno;
	}
	public void setCtno(String ctno)
	{
		this.ctno = ctno;
	}
	public String getCtno()
	{
		return this.ctno;
	}
	public void setCardno(String cardno)
	{
		this.cardno = cardno;
	}
	public String getCardno()
	{
		return this.cardno;
	}
	public void setCardstatus(String cardstatus)
	{
		this.cardstatus = cardstatus;
	}
	public String getCardstatus()
	{
		return this.cardstatus;
	}
	public void setValidity(String validity)
	{
		this.validity = validity;
	}
	public String getValidity()
	{
		return this.validity;
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