package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TfCardRuleAmt Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 @JsonIgnoreProperties({"ruleno","unitamt","companyno","organizationno","trantime","cnfflg","deftime","reservedfileld"})
 @ApiModel(value = "收卡规则",description = "TfCardRuleAmt")
public class TfCardRuleAmt implements Serializable
{

	@ApiModelProperty(value = "序号")
	protected Integer item;
	@ApiModelProperty(value = "达成消费金额")
	protected Double reachamt;
	@ApiModelProperty(value = "收卡金额")
	protected Double recoveramt;
	@ApiModelProperty(value = "收卡金额上限")
	protected Double upperamt;
	@ApiModelProperty(value = "卡种")
	protected String ctno;
	///////////以下隐藏////////////////////////
	@ApiModelProperty(hidden = true)
	protected String ruleno;
	@ApiModelProperty(hidden = true)
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(hidden = true)
	protected Double unitamt;
	@ApiModelProperty(hidden = true)
	protected String companyno;
	@ApiModelProperty(hidden = true)
	protected String organizationno;
	@ApiModelProperty(hidden = true)
	protected String trantime;
	@ApiModelProperty(hidden = true)
	protected String cnfflg;
	@ApiModelProperty(hidden = true)
	protected String deftime;
	@ApiModelProperty(hidden = true)
	protected String reservedfileld;

	public void setItem(Integer item)
	{
		this.item = item;
	}
	public Integer getItem()
	{
		return this.item;
	}
	public void setReachamt(Double reachamt)
	{
		this.reachamt = reachamt;
	}
	public Double getReachamt()
	{
		return this.reachamt;
	}
	public void setUnitamt(Double unitamt)
	{
		this.unitamt = unitamt;
	}
	public Double getUnitamt()
	{
		return this.unitamt;
	}
	public void setRecoveramt(Double recoveramt)
	{
		this.recoveramt = recoveramt;
	}
	public Double getRecoveramt()
	{
		return this.recoveramt;
	}
	public void setUpperamt(Double upperamt)
	{
		this.upperamt = upperamt;
	}
	public Double getUpperamt()
	{
		return this.upperamt;
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
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
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