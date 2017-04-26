package com.site.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TdSalePay Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
@JsonIgnoreProperties({"salepayid","saleno","sdate","stime","saleid","cardbalance","companyno","organizationno","shop",
		"paycodeerp","reservedfileld","discprint","trantime","cnfflg","deftime"})
@ApiModel(value = "销售支付明细",description = "TdSalePay")
public class TdSalePay implements Serializable
{
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "项次")
	protected Integer item;
	@ApiModelProperty(value = "ERP款别编号")
	protected String erppayno;
	@ApiModelProperty(value = "终端号")
	protected String temnumber;
	@ApiModelProperty(value = "卡券类型")
	protected String cttype;
	@ApiModelProperty(value = "卡劵号")
	protected String paysernum;
	@ApiModelProperty(value = "找零")
	protected Double changed;
	@ApiModelProperty(value = "溢收金额")
	protected Double exrate;
	@ApiModelProperty(value = "积分抵现扣减")
	protected Double descore;
	@ApiModelProperty(value = "银联卡流水号")
	protected String serialno;
	@ApiModelProperty(value = "转储金额")
	protected Double rechangedamt;
	@ApiModelProperty(value = "转储单据GUID")
	protected String rechargeid;
	@ApiModelProperty(value = "支付方式")
	protected String paycode;
	@ApiModelProperty(value = "劵是否核销:默认Y")
	protected String isverification;
	@ApiModelProperty(value = "是否订金:默认N")
	protected String isorderpay;
	@ApiModelProperty(value = "退货吸收比率")
	protected Integer returnrate;
	@ApiModelProperty(value = "IC卡交易号")
	protected String icbillid;
	@ApiModelProperty(value = "录入金额:等于pay")
	protected Double inputpay;
	@ApiModelProperty(value = "兑换比率")
	protected Double extra;
	@ApiModelProperty(value = "支付金额")
	protected Double pay;
	////////////////////////////////////////////
	@ApiModelProperty(hidden = true)
	protected String salepayid;
	@ApiModelProperty(hidden = true)
	protected String saleno;
	@ApiModelProperty(hidden = true)
	protected String sdate;
	@ApiModelProperty(hidden = true)
	protected String stime;
	@ApiModelProperty(hidden = true)
	protected String saleid;
	@ApiModelProperty(hidden = true)
	protected Double cardbalance;
	@ApiModelProperty(hidden = true)
	protected String companyno;
	@ApiModelProperty(hidden = true)
	protected String organizationno;
	@ApiModelProperty(hidden = true)
	protected String shop;
	@ApiModelProperty(hidden = true)
	protected String paycodeerp;
	@ApiModelProperty(hidden = true)
	protected String reservedfileld;
	@ApiModelProperty(hidden = true)
	protected String discprint;
	@ApiModelProperty(hidden = true)
	protected String trantime;
	@ApiModelProperty(hidden = true)
	protected String cnfflg;
	@ApiModelProperty(hidden = true)
	protected String deftime;

	public void setSalepayid(String salepayid)
	{
		this.salepayid = salepayid;
	}
	public String getSalepayid()
	{
		return this.salepayid;
	}
	public void setSaleid(String saleid)
	{
		this.saleid = saleid;
	}
	public String getSaleid()
	{
		return this.saleid;
	}
	public void setIcbillid(String icbillid)
	{
		this.icbillid = icbillid;
	}
	public String getIcbillid()
	{
		return this.icbillid;
	}
	public void setRechargeid(String rechargeid)
	{
		this.rechargeid = rechargeid;
	}
	public String getRechargeid()
	{
		return this.rechargeid;
	}
	public void setItem(Integer item)
	{
		this.item = item;
	}
	public Integer getItem()
	{
		return this.item;
	}
	public void setReturnrate(Integer returnrate)
	{
		this.returnrate = returnrate;
	}
	public Integer getReturnrate()
	{
		return this.returnrate;
	}
	public void setDescore(Double descore)
	{
		this.descore = descore;
	}
	public Double getDescore()
	{
		return this.descore;
	}
	public void setPay(Double pay)
	{
		this.pay = pay;
	}
	public Double getPay()
	{
		return this.pay;
	}
	public void setExtra(Double extra)
	{
		this.extra = extra;
	}
	public Double getExtra()
	{
		return this.extra;
	}
	public void setChanged(Double changed)
	{
		this.changed = changed;
	}
	public Double getChanged()
	{
		return this.changed;
	}
	public void setCardbalance(Double cardbalance)
	{
		this.cardbalance = cardbalance;
	}
	public Double getCardbalance()
	{
		return this.cardbalance;
	}
	public void setRechangedamt(Double rechangedamt)
	{
		this.rechangedamt = rechangedamt;
	}
	public Double getRechangedamt()
	{
		return this.rechangedamt;
	}
	public void setExrate(Double exrate)
	{
		this.exrate = exrate;
	}
	public Double getExrate()
	{
		return this.exrate;
	}
	public void setInputpay(Double inputpay)
	{
		this.inputpay = inputpay;
	}
	public Double getInputpay()
	{
		return this.inputpay;
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
	public void setPaycode(String paycode)
	{
		this.paycode = paycode;
	}
	public String getPaycode()
	{
		return this.paycode;
	}
	public void setPaycodeerp(String paycodeerp)
	{
		this.paycodeerp = paycodeerp;
	}
	public String getPaycodeerp()
	{
		return this.paycodeerp;
	}
	public void setReservedfileld(String reservedfileld)
	{
		this.reservedfileld = reservedfileld;
	}
	public String getReservedfileld()
	{
		return this.reservedfileld;
	}
	public void setDiscprint(String discprint)
	{
		this.discprint = discprint;
	}
	public String getDiscprint()
	{
		return this.discprint;
	}
	public void setIsverification(String isverification)
	{
		this.isverification = isverification;
	}
	public String getIsverification()
	{
		return this.isverification;
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
	public void setIsorderpay(String isorderpay)
	{
		this.isorderpay = isorderpay;
	}
	public String getIsorderpay()
	{
		return this.isorderpay;
	}
	public void setTemnumber(String temnumber)
	{
		this.temnumber = temnumber;
	}
	public String getTemnumber()
	{
		return this.temnumber;
	}
	public void setDeftime(String deftime)
	{
		this.deftime = deftime;
	}
	public String getDeftime()
	{
		return this.deftime;
	}
	public void setErppayno(String erppayno)
	{
		this.erppayno = erppayno;
	}
	public String getErppayno()
	{
		return this.erppayno;
	}
	public void setCttype(String cttype)
	{
		this.cttype = cttype;
	}
	public String getCttype()
	{
		return this.cttype;
	}
	public void setPaysernum(String paysernum)
	{
		this.paysernum = paysernum;
	}
	public String getPaysernum()
	{
		return this.paysernum;
	}
	public void setSerialno(String serialno)
	{
		this.serialno = serialno;
	}
	public String getSerialno()
	{
		return this.serialno;
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
}  