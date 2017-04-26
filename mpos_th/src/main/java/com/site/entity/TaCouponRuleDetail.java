package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TaCouponRuleDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TaCouponRuleDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String giftctf;
	protected String code;
	protected String cnfflg;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	protected String ruleno;
	public void setGiftctf(String giftctf)
	{
		this.giftctf = giftctf;
	}
	public String getGiftctf()
	{
		return this.giftctf;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getCode()
	{
		return this.code;
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
	public void setRuleno(String ruleno)
	{
		this.ruleno = ruleno;
	}
	public String getRuleno()
	{
		return this.ruleno;
	}
}  