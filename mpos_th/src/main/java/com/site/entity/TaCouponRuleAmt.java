package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TaCouponRuleAmt Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 @JsonIgnoreProperties({"ruleno","unitamt","companyno","organizationno","trantime","cnfflg"})
 @ApiModel(value = "收券限制规则",description = "TaCouponRuleAmt")
public class TaCouponRuleAmt implements Serializable
{
	@ApiModelProperty(value = "序号")
	protected Integer item;
	@ApiModelProperty(value = "达成消费金额")
	protected Double reachamt;
	@ApiModelProperty(value = "收券金额")
	protected Double recoveramt;
	@ApiModelProperty(value = "收卡金额上限")
	protected Double upperamt;
	@ApiModelProperty(value = "券种")
	protected String giftctf;
	///////////以下隐藏////////////////////////
	@ApiModelProperty(hidden = true)
	protected String ruleno;
	@ApiModelProperty(hidden = true)
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(hidden = true)
	protected String companyno;
	@ApiModelProperty(hidden = true)
	protected Double unitamt;
	@ApiModelProperty(hidden = true)
	protected String organizationno;
	@ApiModelProperty(hidden = true)
	protected String trantime;
	@ApiModelProperty(hidden = true)
	protected String cnfflg;

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
	public void setGiftctf(String giftctf)
	{
		this.giftctf = giftctf;
	}
	public String getGiftctf()
	{
		return this.giftctf;
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
}  