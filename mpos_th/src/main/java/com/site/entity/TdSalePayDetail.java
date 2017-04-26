package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TdSalePayDetail Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TdSalePayDetail implements Serializable
{
	private static final long serialVersionUID = 1L;
	protected String salepaydetailid;
	protected String saleid;
	protected String salepayid;
	protected String saledetailid;
	protected Integer mitem;
	protected Integer item;
	protected Double descore;
	protected Double pay;
	protected Double extra;
	protected String companyno;
	protected String organizationno;
	protected String shop;
	protected String saleno;
	protected String paycode;
	protected String paycodeerp;
	protected String trantime;
	protected String cnfflg;
	protected String deftime;
	protected String reservedfileld;
	protected String erppayno;
	protected String cttype;
	protected String paysernum;
	protected String sdate;
	protected String stime;
	protected String isverification;
	public void setSalepaydetailid(String salepaydetailid)
	{
		this.salepaydetailid = salepaydetailid;
	}
	public String getSalepaydetailid()
	{
		return this.salepaydetailid;
	}
	public void setSaleid(String saleid)
	{
		this.saleid = saleid;
	}
	public String getSaleid()
	{
		return this.saleid;
	}
	public void setSalepayid(String salepayid)
	{
		this.salepayid = salepayid;
	}
	public String getSalepayid()
	{
		return this.salepayid;
	}
	public void setSaledetailid(String saledetailid)
	{
		this.saledetailid = saledetailid;
	}
	public String getSaledetailid()
	{
		return this.saledetailid;
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
	public void setIsverification(String isverification)
	{
		this.isverification = isverification;
	}
	public String getIsverification()
	{
		return this.isverification;
	}
}  