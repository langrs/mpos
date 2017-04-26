package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TdSaleDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 @JsonIgnoreProperties({"saleid","oldid","saledetailid","oitem","pricefactor","price2","price3",
		 "ramt","mqty","unitratio","counteramt","rpointqty","rqty","companyno","organizationno",
		 "shop","saleno","clerkno","accno","trantime","isscan","reservedfileld","attr01","attr02",
		 "rarea","datasource","mno","sdate","stime","cnfflg","memo","deftime","featureno","plubarcode",
		 "scanno","counterno","unit"})
@ApiModel(value = "销售单明细",description = "TdSaleDetail")
public class TdSaleDetail implements Serializable
{
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "项次")
	protected Integer item;
	@ApiModelProperty(value = "销售条码")
	protected String pluno;
	@ApiModelProperty(value = "原价")
	protected Double oldprice;
	@ApiModelProperty(value = "售价")
	protected Double price;
	@ApiModelProperty(value = "销售数量")
	protected Double qty;
	@ApiModelProperty(value = "总折扣金额")
	protected Double disc;
	@ApiModelProperty(value = "小计金额(含税)=原价*数量-总折扣金额")
	protected Double amt;
	@ApiModelProperty(value = "小计金额(不含税)")
	protected Double uamt;
	@ApiModelProperty(value = "积分金额")
	protected Double pointqty;
	@ApiModelProperty(value = "税别编号")
	protected String taxcode;
	@ApiModelProperty(value = "销售单位")
	protected String sunit;
	/////////////////////////以下隐藏///////////////////////////
	@ApiModelProperty(hidden = true)
	protected String saleid;
	@ApiModelProperty(hidden = true)
	protected String oldid;
	@ApiModelProperty(hidden = true)
	protected String saledetailid;
	@ApiModelProperty(hidden = true)
	protected Integer oitem;
	@ApiModelProperty(hidden = true)
	protected Integer pricefactor;
	@ApiModelProperty(hidden = true)
	protected Double price2;
	@ApiModelProperty(hidden = true)
	protected Double price3;
	@ApiModelProperty(hidden = true)
	protected Double ramt;
	@ApiModelProperty(hidden = true)
	protected Double mqty;
	@ApiModelProperty(hidden = true)
	protected Double unitratio;
	@ApiModelProperty(hidden = true)
	protected Double counteramt;
	@ApiModelProperty(hidden = true)
	protected Double rpointqty;
	@ApiModelProperty(hidden = true)
	protected Double rqty;
	@ApiModelProperty(hidden = true)
	protected String companyno;
	@ApiModelProperty(hidden = true)
	protected String organizationno;
	@ApiModelProperty(hidden = true)
	protected String shop;
	@ApiModelProperty(hidden = true)
	protected String saleno;
	@ApiModelProperty(hidden = true)
	protected String clerkno;
	@ApiModelProperty(hidden = true)
	protected String accno;
	@ApiModelProperty(hidden = true)
	protected String trantime;
	@ApiModelProperty(hidden = true)
	protected String isscan;
	@ApiModelProperty(hidden = true)
	protected String reservedfileld;
	@ApiModelProperty(hidden = true)
	protected String attr01;
	@ApiModelProperty(hidden = true)
	protected String attr02;
	@ApiModelProperty(hidden = true)
	protected String rarea;
	@ApiModelProperty(hidden = true)
	protected String datasource;
	@ApiModelProperty(hidden = true)
	protected String mno;
	@ApiModelProperty(hidden = true)
	protected String sdate;
	@ApiModelProperty(hidden = true)
	protected String stime;
	@ApiModelProperty(hidden = true)
	protected String cnfflg;
	@ApiModelProperty(hidden = true)
	protected String memo;
	@ApiModelProperty(hidden = true)
	protected String deftime;
	@ApiModelProperty(hidden = true)
	protected String featureno;
	@ApiModelProperty(hidden = true)
	protected String plubarcode;
	@ApiModelProperty(hidden = true)
	protected String scanno;
	@ApiModelProperty(hidden = true)
	protected String counterno;
	@ApiModelProperty(hidden = true)
	protected String unit;
	public void setSaleid(String saleid)
	{
		this.saleid = saleid;
	}
	public String getSaleid()
	{
		return this.saleid;
	}
	public void setOldid(String oldid)
	{
		this.oldid = oldid;
	}
	public String getOldid()
	{
		return this.oldid;
	}
	public void setSaledetailid(String saledetailid)
	{
		this.saledetailid = saledetailid;
	}
	public String getSaledetailid()
	{
		return this.saledetailid;
	}
	public void setItem(Integer item)
	{
		this.item = item;
	}
	public Integer getItem()
	{
		return this.item;
	}
	public void setOitem(Integer oitem)
	{
		this.oitem = oitem;
	}
	public Integer getOitem()
	{
		return this.oitem;
	}
	public void setPricefactor(Integer pricefactor)
	{
		this.pricefactor = pricefactor;
	}
	public Integer getPricefactor()
	{
		return this.pricefactor;
	}
	public void setOldprice(Double oldprice)
	{
		this.oldprice = oldprice;
	}
	public Double getOldprice()
	{
		return this.oldprice;
	}
	public void setPrice(Double price)
	{
		this.price = price;
	}
	public Double getPrice()
	{
		return this.price;
	}
	public void setPrice2(Double price2)
	{
		this.price2 = price2;
	}
	public Double getPrice2()
	{
		return this.price2;
	}
	public void setPrice3(Double price3)
	{
		this.price3 = price3;
	}
	public Double getPrice3()
	{
		return this.price3;
	}
	public void setQty(Double qty)
	{
		this.qty = qty;
	}
	public Double getQty()
	{
		return this.qty;
	}
	public void setDisc(Double disc)
	{
		this.disc = disc;
	}
	public Double getDisc()
	{
		return this.disc;
	}
	public void setRamt(Double ramt)
	{
		this.ramt = ramt;
	}
	public Double getRamt()
	{
		return this.ramt;
	}
	public void setMqty(Double mqty)
	{
		this.mqty = mqty;
	}
	public Double getMqty()
	{
		return this.mqty;
	}
	public void setUnitratio(Double unitratio)
	{
		this.unitratio = unitratio;
	}
	public Double getUnitratio()
	{
		return this.unitratio;
	}
	public void setAmt(Double amt)
	{
		this.amt = amt;
	}
	public Double getAmt()
	{
		return this.amt;
	}
	public void setUamt(Double uamt)
	{
		this.uamt = uamt;
	}
	public Double getUamt()
	{
		return this.uamt;
	}
	public void setCounteramt(Double counteramt)
	{
		this.counteramt = counteramt;
	}
	public Double getCounteramt()
	{
		return this.counteramt;
	}
	public void setPointqty(Double pointqty)
	{
		this.pointqty = pointqty;
	}
	public Double getPointqty()
	{
		return this.pointqty;
	}
	public void setRpointqty(Double rpointqty)
	{
		this.rpointqty = rpointqty;
	}
	public Double getRpointqty()
	{
		return this.rpointqty;
	}
	public void setRqty(Double rqty)
	{
		this.rqty = rqty;
	}
	public Double getRqty()
	{
		return this.rqty;
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
	public void setClerkno(String clerkno)
	{
		this.clerkno = clerkno;
	}
	public String getClerkno()
	{
		return this.clerkno;
	}
	public void setAccno(String accno)
	{
		this.accno = accno;
	}
	public String getAccno()
	{
		return this.accno;
	}
	public void setTrantime(String trantime)
	{
		this.trantime = trantime;
	}
	public String getTrantime()
	{
		return this.trantime;
	}
	public void setIsscan(String isscan)
	{
		this.isscan = isscan;
	}
	public String getIsscan()
	{
		return this.isscan;
	}
	public void setTaxcode(String taxcode)
	{
		this.taxcode = taxcode;
	}
	public String getTaxcode()
	{
		return this.taxcode;
	}
	public void setReservedfileld(String reservedfileld)
	{
		this.reservedfileld = reservedfileld;
	}
	public String getReservedfileld()
	{
		return this.reservedfileld;
	}
	public void setAttr01(String attr01)
	{
		this.attr01 = attr01;
	}
	public String getAttr01()
	{
		return this.attr01;
	}
	public void setAttr02(String attr02)
	{
		this.attr02 = attr02;
	}
	public String getAttr02()
	{
		return this.attr02;
	}
	public void setRarea(String rarea)
	{
		this.rarea = rarea;
	}
	public String getRarea()
	{
		return this.rarea;
	}
	public void setSunit(String sunit)
	{
		this.sunit = sunit;
	}
	public String getSunit()
	{
		return this.sunit;
	}
	public void setDatasource(String datasource)
	{
		this.datasource = datasource;
	}
	public String getDatasource()
	{
		return this.datasource;
	}
	public void setMno(String mno)
	{
		this.mno = mno;
	}
	public String getMno()
	{
		return this.mno;
	}
	public void setSdate(String sdate)
	{
		this.sdate = sdate;
	}
	public String getSdate()
	{
		return this.sdate;
	}
	public void setStime(String stime)
	{
		this.stime = stime;
	}
	public String getStime()
	{
		return this.stime;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
	}
	public void setMemo(String memo)
	{
		this.memo = memo;
	}
	public String getMemo()
	{
		return this.memo;
	}
	public void setDeftime(String deftime)
	{
		this.deftime = deftime;
	}
	public String getDeftime()
	{
		return this.deftime;
	}
	public void setPluno(String pluno)
	{
		this.pluno = pluno;
	}
	public String getPluno()
	{
		return this.pluno;
	}
	public void setFeatureno(String featureno)
	{
		this.featureno = featureno;
	}
	public String getFeatureno()
	{
		return this.featureno;
	}
	public void setPlubarcode(String plubarcode)
	{
		this.plubarcode = plubarcode;
	}
	public String getPlubarcode()
	{
		return this.plubarcode;
	}
	public void setScanno(String scanno)
	{
		this.scanno = scanno;
	}
	public String getScanno()
	{
		return this.scanno;
	}
	public void setCounterno(String counterno)
	{
		this.counterno = counterno;
	}
	public String getCounterno()
	{
		return this.counterno;
	}
	public void setUnit(String unit)
	{
		this.unit = unit;
	}
	public String getUnit()
	{
		return this.unit;
	}
}  