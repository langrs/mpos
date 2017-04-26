package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardRule Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardRule implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer collectway;
	protected Double reachamt;
	protected Double recoveramt;
	protected String ruleno;
	protected String ctno;
	protected String lbdate;
	protected String ledate;
	protected String ruleway;
	protected String exclude;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	protected String isfulfil;
	protected String canpaycoupon;
	protected String canpaycard;
	protected String canvipagio;
	protected String cnfflg;
	protected String companyno;
	public void setCollectway(Integer collectway)
	{
		this.collectway = collectway;
	}
	public Integer getCollectway()
	{
		return this.collectway;
	}
	public void setReachamt(Double reachamt)
	{
		this.reachamt = reachamt;
	}
	public Double getReachamt()
	{
		return this.reachamt;
	}
	public void setRecoveramt(Double recoveramt)
	{
		this.recoveramt = recoveramt;
	}
	public Double getRecoveramt()
	{
		return this.recoveramt;
	}
	public void setRuleno(String ruleno)
	{
		this.ruleno = ruleno;
	}
	public String getRuleno()
	{
		return this.ruleno;
	}
	public void setCtno(String ctno)
	{
		this.ctno = ctno;
	}
	public String getCtno()
	{
		return this.ctno;
	}
	public void setLbdate(String lbdate)
	{
		this.lbdate = lbdate;
	}
	public String getLbdate()
	{
		return this.lbdate;
	}
	public void setLedate(String ledate)
	{
		this.ledate = ledate;
	}
	public String getLedate()
	{
		return this.ledate;
	}
	public void setRuleway(String ruleway)
	{
		this.ruleway = ruleway;
	}
	public String getRuleway()
	{
		return this.ruleway;
	}
	public void setExclude(String exclude)
	{
		this.exclude = exclude;
	}
	public String getExclude()
	{
		return this.exclude;
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
	public void setIsfulfil(String isfulfil)
	{
		this.isfulfil = isfulfil;
	}
	public String getIsfulfil()
	{
		return this.isfulfil;
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
}  