package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TaCouponRule Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TaCouponRule implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Double priority;
	protected String giftctf;
	protected String canpaycoupon;
	protected String canpaycard;
	protected String canvipagio;
	protected String cnfflg;
	protected String companyno;
	protected String exclude;
	protected String isfulfil;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	protected String ruleno;
	protected String ruleway;
	public void setPriority(Double priority)
	{
		this.priority = priority;
	}
	public Double getPriority()
	{
		return this.priority;
	}
	public void setGiftctf(String giftctf)
	{
		this.giftctf = giftctf;
	}
	public String getGiftctf()
	{
		return this.giftctf;
	}
	public void setCanpaycoupon(String canpaycoupon)
	{
		this.canpaycoupon = canpaycoupon;
	}
	public String getCanpaycoupon()
	{
		return this.canpaycoupon;
	}
	public void setCanpaycard(String canpaycard)
	{
		this.canpaycard = canpaycard;
	}
	public String getCanpaycard()
	{
		return this.canpaycard;
	}
	public void setCanvipagio(String canvipagio)
	{
		this.canvipagio = canvipagio;
	}
	public String getCanvipagio()
	{
		return this.canvipagio;
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
	public void setExclude(String exclude)
	{
		this.exclude = exclude;
	}
	public String getExclude()
	{
		return this.exclude;
	}
	public void setIsfulfil(String isfulfil)
	{
		this.isfulfil = isfulfil;
	}
	public String getIsfulfil()
	{
		return this.isfulfil;
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
	public void setRuleway(String ruleway)
	{
		this.ruleway = ruleway;
	}
	public String getRuleway()
	{
		return this.ruleway;
	}
}  