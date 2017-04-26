package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TePromObjet Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TePromObjet implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer lmecount;
	protected Double promwayamt;
	protected Double timesstd;
	protected Double timesdou;
	protected Double discnum;
	protected Double stdscore;
	protected Double unitscore;
	protected Double presscore;
	protected String companyno;
	protected String organizationno;
	protected String promno;
	protected String groupno;
	protected String objecttype;
	protected String condgroupno;
	protected String trantime;
	protected String cnfflg;
	protected String isbonus;
	protected String deftime;
	protected String reservedfileld;
	public void setLmecount(Integer lmecount)
	{
		this.lmecount = lmecount;
	}
	public Integer getLmecount()
	{
		return this.lmecount;
	}
	public void setPromwayamt(Double promwayamt)
	{
		this.promwayamt = promwayamt;
	}
	public Double getPromwayamt()
	{
		return this.promwayamt;
	}
	public void setTimesstd(Double timesstd)
	{
		this.timesstd = timesstd;
	}
	public Double getTimesstd()
	{
		return this.timesstd;
	}
	public void setTimesdou(Double timesdou)
	{
		this.timesdou = timesdou;
	}
	public Double getTimesdou()
	{
		return this.timesdou;
	}
	public void setDiscnum(Double discnum)
	{
		this.discnum = discnum;
	}
	public Double getDiscnum()
	{
		return this.discnum;
	}
	public void setStdscore(Double stdscore)
	{
		this.stdscore = stdscore;
	}
	public Double getStdscore()
	{
		return this.stdscore;
	}
	public void setUnitscore(Double unitscore)
	{
		this.unitscore = unitscore;
	}
	public Double getUnitscore()
	{
		return this.unitscore;
	}
	public void setPresscore(Double presscore)
	{
		this.presscore = presscore;
	}
	public Double getPresscore()
	{
		return this.presscore;
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
	public void setObjecttype(String objecttype)
	{
		this.objecttype = objecttype;
	}
	public String getObjecttype()
	{
		return this.objecttype;
	}
	public void setCondgroupno(String condgroupno)
	{
		this.condgroupno = condgroupno;
	}
	public String getCondgroupno()
	{
		return this.condgroupno;
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
	public void setIsbonus(String isbonus)
	{
		this.isbonus = isbonus;
	}
	public String getIsbonus()
	{
		return this.isbonus;
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