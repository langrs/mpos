package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:PlatformStaffs Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class PlatformStaffs implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String opno;
	protected String opname;
	protected String password;
	protected String opgroup;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String powercard;
	protected String counterno;
	public void setOpno(String opno)
	{
		this.opno = opno;
	}
	public String getOpno()
	{
		return this.opno;
	}
	public void setOpname(String opname)
	{
		this.opname = opname;
	}
	public String getOpname()
	{
		return this.opname;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setOpgroup(String opgroup)
	{
		this.opgroup = opgroup;
	}
	public String getOpgroup()
	{
		return this.opgroup;
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
	public void setPowercard(String powercard)
	{
		this.powercard = powercard;
	}
	public String getPowercard()
	{
		return this.powercard;
	}
	public void setCounterno(String counterno)
	{
		this.counterno = counterno;
	}
	public String getCounterno()
	{
		return this.counterno;
	}
}  