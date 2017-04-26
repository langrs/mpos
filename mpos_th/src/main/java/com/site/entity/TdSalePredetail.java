package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TdSalePredetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 @JsonIgnoreProperties({"item","salepredatailid","saleid","condgroupno","shop","saleno","companyno","organizationno",
		 "pmtno","reservedfileld","trantime","cnfflg","exchangegroupno","plugroupno","deftime"})
 @ApiModel(value = "满额换赠明细",description = "TdSalePredetail")
public class TdSalePredetail implements Serializable
{

	@ApiModelProperty(value = "赠送额度")
	protected Double quota;
	@ApiModelProperty(value = "赠送数量")
	protected Integer qty;
	@ApiModelProperty(value = "赠送类型:5券,6卡")
	protected Integer type;
	@ApiModelProperty(value = "赠送卡种(券种)编码")
	protected String code;
	@ApiModelProperty(value = "赠送卡号(券号)")
	protected String paysernum;
	//////////////////////////////以下隐藏/////////////////////////////

	@ApiModelProperty(hidden = true)
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(hidden = true)
	protected Integer item;
	@ApiModelProperty(hidden = true)
	protected String salepredatailid;
	@ApiModelProperty(hidden = true)
	protected String saleid;
	@ApiModelProperty(hidden = true)
	protected Integer condgroupno;
	@ApiModelProperty(hidden = true)
	protected String shop;
	@ApiModelProperty(hidden = true)
	protected String saleno;
	@ApiModelProperty(hidden = true)
	protected String companyno;
	@ApiModelProperty(hidden = true)
	protected String organizationno;
	@ApiModelProperty(hidden = true)
	protected String pmtno;
	@ApiModelProperty(hidden = true)
	protected String reservedfileld;
	@ApiModelProperty(hidden = true)
	protected String trantime;
	@ApiModelProperty(hidden = true)
	protected String cnfflg;
	@ApiModelProperty(hidden = true)
	protected String exchangegroupno;
	@ApiModelProperty(hidden = true)
	protected String plugroupno;
	@ApiModelProperty(hidden = true)
	protected String deftime;
	public void setSalepredatailid(String salepredatailid)
	{
		this.salepredatailid = salepredatailid;
	}
	public String getSalepredatailid()
	{
		return this.salepredatailid;
	}
	public void setSaleid(String saleid)
	{
		this.saleid = saleid;
	}
	public String getSaleid()
	{
		return this.saleid;
	}
	public void setCondgroupno(Integer condgroupno)
	{
		this.condgroupno = condgroupno;
	}
	public Integer getCondgroupno()
	{
		return this.condgroupno;
	}
	public void setItem(Integer item)
	{
		this.item = item;
	}
	public Integer getItem()
	{
		return this.item;
	}
	public void setType(Integer type)
	{
		this.type = type;
	}
	public Integer getType()
	{
		return this.type;
	}
	public void setQty(Integer qty)
	{
		this.qty = qty;
	}
	public Integer getQty()
	{
		return this.qty;
	}
	public void setQuota(Double quota)
	{
		this.quota = quota;
	}
	public Double getQuota()
	{
		return this.quota;
	}
	public void setShop(String shop)
	{
		this.shop = shop;
	}
	public String getShop()
	{
		return this.shop;
	}
	public void setSaleno(String saleno)
	{
		this.saleno = saleno;
	}
	public String getSaleno()
	{
		return this.saleno;
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
	public void setPmtno(String pmtno)
	{
		this.pmtno = pmtno;
	}
	public String getPmtno()
	{
		return this.pmtno;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getCode()
	{
		return this.code;
	}
	public void setReservedfileld(String reservedfileld)
	{
		this.reservedfileld = reservedfileld;
	}
	public String getReservedfileld()
	{
		return this.reservedfileld;
	}
	public void setPaysernum(String paysernum)
	{
		this.paysernum = paysernum;
	}
	public String getPaysernum()
	{
		return this.paysernum;
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
	public void setExchangegroupno(String exchangegroupno)
	{
		this.exchangegroupno = exchangegroupno;
	}
	public String getExchangegroupno()
	{
		return this.exchangegroupno;
	}
	public void setPlugroupno(String plugroupno)
	{
		this.plugroupno = plugroupno;
	}
	public String getPlugroupno()
	{
		return this.plugroupno;
	}
	public void setDeftime(String deftime)
	{
		this.deftime = deftime;
	}
	public String getDeftime()
	{
		return this.deftime;
	}
}  