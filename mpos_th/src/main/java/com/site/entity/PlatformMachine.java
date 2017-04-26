package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:PlatformMachine Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class PlatformMachine implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String mac;
	protected String shop;
	protected String machine;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String counterno;
	protected String typeno;
	public void setMac(String mac)
	{
		this.mac = mac;
	}
	public String getMac()
	{
		return this.mac;
	}
	public void setShop(String shop)
	{
		this.shop = shop;
	}
	public String getShop()
	{
		return this.shop;
	}
	public void setMachine(String machine)
	{
		this.machine = machine;
	}
	public String getMachine()
	{
		return this.machine;
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
	public void setCounterno(String counterno)
	{
		this.counterno = counterno;
	}
	public String getCounterno()
	{
		return this.counterno;
	}
	public void setTypeno(String typeno)
	{
		this.typeno = typeno;
	}
	public String getTypeno()
	{
		return this.typeno;
	}
}  