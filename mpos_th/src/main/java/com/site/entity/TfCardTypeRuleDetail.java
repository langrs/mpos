package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TfCardTypeRuleDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TfCardTypeRuleDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected Integer ruletype;
	protected Integer stdscore;
	protected Integer unitscore;
	protected Integer disc;
	protected Integer deffull;
	protected Integer pcexstdscore;
	protected Integer pcexunitscore;
	protected Integer exstdscore;
	protected Integer exunitscore;
	protected String ctno;
	protected String code;
	protected String cnfflg;
	protected String defunit;
	protected String companyno;
	protected String ruleno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	public void setRuletype(Integer ruletype)
	{
		this.ruletype = ruletype;
	}
	public Integer getRuletype()
	{
		return this.ruletype;
	}
	public void setStdscore(Integer stdscore)
	{
		this.stdscore = stdscore;
	}
	public Integer getStdscore()
	{
		return this.stdscore;
	}
	public void setUnitscore(Integer unitscore)
	{
		this.unitscore = unitscore;
	}
	public Integer getUnitscore()
	{
		return this.unitscore;
	}
	public void setDisc(Integer disc)
	{
		this.disc = disc;
	}
	public Integer getDisc()
	{
		return this.disc;
	}
	public void setDeffull(Integer deffull)
	{
		this.deffull = deffull;
	}
	public Integer getDeffull()
	{
		return this.deffull;
	}
	public void setPcexstdscore(Integer pcexstdscore)
	{
		this.pcexstdscore = pcexstdscore;
	}
	public Integer getPcexstdscore()
	{
		return this.pcexstdscore;
	}
	public void setPcexunitscore(Integer pcexunitscore)
	{
		this.pcexunitscore = pcexunitscore;
	}
	public Integer getPcexunitscore()
	{
		return this.pcexunitscore;
	}
	public void setExstdscore(Integer exstdscore)
	{
		this.exstdscore = exstdscore;
	}
	public Integer getExstdscore()
	{
		return this.exstdscore;
	}
	public void setExunitscore(Integer exunitscore)
	{
		this.exunitscore = exunitscore;
	}
	public Integer getExunitscore()
	{
		return this.exunitscore;
	}
	public void setCtno(String ctno)
	{
		this.ctno = ctno;
	}
	public String getCtno()
	{
		return this.ctno;
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
	public void setDefunit(String defunit)
	{
		this.defunit = defunit;
	}
	public String getDefunit()
	{
		return this.defunit;
	}
	public void setCompanyno(String companyno)
	{
		this.companyno = companyno;
	}
	public String getCompanyno()
	{
		return this.companyno;
	}
	public void setRuleno(String ruleno)
	{
		this.ruleno = ruleno;
	}
	public String getRuleno()
	{
		return this.ruleno;
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