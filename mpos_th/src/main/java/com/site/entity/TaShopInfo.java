package com.site.entity;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
 /**
 * FUNCTION:TaShopInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 @ApiModel(value = "分店信息表")
 public class TaShopInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String eshopid;
	protected Integer subrate1;
	protected Integer subrate2;
	protected Integer subrate3;
	@ApiModelProperty(value = "分店编码", required = true)
	protected String shop;
	@ApiModelProperty(value = "分店名称", required = true)
	protected String shopname;
	protected String shoptype;
	protected String password;
	protected String legalper;
	protected String sellerguino;
	protected String companyno;
	protected String organizationno;
	protected String trantime;
	protected String deftime;
	protected String reservedfileld;
	protected String einvoicekey;
	protected String alipartner;
	protected String alisign;
	protected String cnfflg;
	protected String telephone;
	protected String address;
	public void setEshopid(String eshopid)
	{
		this.eshopid = eshopid;
	}
	public String getEshopid()
	{
		return this.eshopid;
	}
	public void setSubrate1(Integer subrate1)
	{
		this.subrate1 = subrate1;
	}
	public Integer getSubrate1()
	{
		return this.subrate1;
	}
	public void setSubrate2(Integer subrate2)
	{
		this.subrate2 = subrate2;
	}
	public Integer getSubrate2()
	{
		return this.subrate2;
	}
	public void setSubrate3(Integer subrate3)
	{
		this.subrate3 = subrate3;
	}
	public Integer getSubrate3()
	{
		return this.subrate3;
	}
	public void setShop(String shop)
	{
		this.shop = shop;
	}
	public String getShop()
	{
		return this.shop;
	}
	public void setShopname(String shopname)
	{
		this.shopname = shopname;
	}
	public String getShopname()
	{
		return this.shopname;
	}
	public void setShoptype(String shoptype)
	{
		this.shoptype = shoptype;
	}
	public String getShoptype()
	{
		return this.shoptype;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setLegalper(String legalper)
	{
		this.legalper = legalper;
	}
	public String getLegalper()
	{
		return this.legalper;
	}
	public void setSellerguino(String sellerguino)
	{
		this.sellerguino = sellerguino;
	}
	public String getSellerguino()
	{
		return this.sellerguino;
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
	public void setEinvoicekey(String einvoicekey)
	{
		this.einvoicekey = einvoicekey;
	}
	public String getEinvoicekey()
	{
		return this.einvoicekey;
	}
	public void setAlipartner(String alipartner)
	{
		this.alipartner = alipartner;
	}
	public String getAlipartner()
	{
		return this.alipartner;
	}
	public void setAlisign(String alisign)
	{
		this.alisign = alisign;
	}
	public String getAlisign()
	{
		return this.alisign;
	}
	public void setCnfflg(String cnfflg)
	{
		this.cnfflg = cnfflg;
	}
	public String getCnfflg()
	{
		return this.cnfflg;
	}
	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}
	public String getTelephone()
	{
		return this.telephone;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return this.address;
	}
}  