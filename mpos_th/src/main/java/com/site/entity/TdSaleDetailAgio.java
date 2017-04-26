package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TdSaleDetailAgio Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 @JsonIgnoreProperties({"saledetailagioid","saledetailid","saleid","inputdisc","companyno","organizationno","shop",
		 "saleno","trantime","cnfflg","giftctf","giftctfno","deftime","reservedfileld"})
 @ApiModel(value = "折价明细",description = "TdSaleDetailAgio")
public class TdSaleDetailAgio implements Serializable
{

	@ApiModelProperty(value = "主项次(对应了商品明细的item)")
	protected Integer mitem;
	@ApiModelProperty(value = "项次(序号)")
	protected Integer item;
	@ApiModelProperty(value = "折价方式")
	protected Integer dctype;
	@ApiModelProperty(value = "促销单号")
	protected String pmtno;
	@ApiModelProperty(value = "折扣金额")
	protected Double disc;
	@ApiModelProperty(value = "参与数量")
	protected Double qty;
	@ApiModelProperty(value = "参与金额")
	protected Double amt;
	///////////以下隐藏////////////////////////
	@ApiModelProperty(hidden = true)
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(hidden = true)
	protected String saledetailagioid;
	@ApiModelProperty(hidden = true)
	protected String saledetailid;
	@ApiModelProperty(hidden = true)
	protected String saleid;
	@ApiModelProperty(hidden = true)
	protected Double inputdisc;
	@ApiModelProperty(hidden = true)
	protected String companyno;
	@ApiModelProperty(hidden = true)
	protected String organizationno;
	@ApiModelProperty(hidden = true)
	protected String shop;
	@ApiModelProperty(hidden = true)
	protected String saleno;
	@ApiModelProperty(hidden = true)
	protected String trantime;
	@ApiModelProperty(hidden = true)
	protected String cnfflg;
	@ApiModelProperty(hidden = true)
	protected String giftctf;
	@ApiModelProperty(hidden = true)
	protected String giftctfno;
	@ApiModelProperty(hidden = true)
	protected String deftime;
	@ApiModelProperty(hidden = true)
	protected String reservedfileld;
	public void setSaledetailagioid(String saledetailagioid)
	{
		this.saledetailagioid = saledetailagioid;
	}
	public String getSaledetailagioid()
	{
		return this.saledetailagioid;
	}
	public void setSaledetailid(String saledetailid)
	{
		this.saledetailid = saledetailid;
	}
	public String getSaledetailid()
	{
		return this.saledetailid;
	}
	public void setSaleid(String saleid)
	{
		this.saleid = saleid;
	}
	public String getSaleid()
	{
		return this.saleid;
	}
	public void setMitem(Integer mitem)
	{
		this.mitem = mitem;
	}
	public Integer getMitem()
	{
		return this.mitem;
	}
	public void setItem(Integer item)
	{
		this.item = item;
	}
	public Integer getItem()
	{
		return this.item;
	}
	public void setDctype(Integer dctype)
	{
		this.dctype = dctype;
	}
	public Integer getDctype()
	{
		return this.dctype;
	}
	public void setQty(Double qty)
	{
		this.qty = qty;
	}
	public Double getQty()
	{
		return this.qty;
	}
	public void setAmt(Double amt)
	{
		this.amt = amt;
	}
	public Double getAmt()
	{
		return this.amt;
	}
	public void setInputdisc(Double inputdisc)
	{
		this.inputdisc = inputdisc;
	}
	public Double getInputdisc()
	{
		return this.inputdisc;
	}
	public void setDisc(Double disc)
	{
		this.disc = disc;
	}
	public Double getDisc()
	{
		return this.disc;
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
	public void setPmtno(String pmtno)
	{
		this.pmtno = pmtno;
	}
	public String getPmtno()
	{
		return this.pmtno;
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
	public void setGiftctf(String giftctf)
	{
		this.giftctf = giftctf;
	}
	public String getGiftctf()
	{
		return this.giftctf;
	}
	public void setGiftctfno(String giftctfno)
	{
		this.giftctfno = giftctfno;
	}
	public String getGiftctfno()
	{
		return this.giftctfno;
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