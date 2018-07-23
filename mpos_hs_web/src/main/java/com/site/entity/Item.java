package com.site.entity;

import java.io.Serializable;

/**
 * 对象功能:Item Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class Item implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String itemNo;
	// 
	protected String itemSubno;
	// 
	protected String itemName;
	// 
	protected String goodstype;
	// 
	protected Double salerate;
	// 
	protected String itemSubname;
	// 
	protected String classNo;
	// 
	protected String productArea;
	// 
	protected Double salePrice;
	// 
	protected String status;
	// 
	protected String displayFlag;
	// 
	protected String supNo;
	//是否允许会员卡打折标志:0禁止1允许
	protected String changepxFlag;
	// 
	protected String counterNo;
	// 
	protected String promtype;
	// 
	protected Double pkzk;
	// 
	protected Double jkzk;
	// 
	protected Double zcjfbl;
	// 
	protected Double cxjfbl;


	public void setItemNo(String itemNo)
	{
		this.itemNo = itemNo;
	}
	public String getItemNo()
	{
		return this.itemNo;
	}
	public void setItemSubno(String itemSubno)
	{
		this.itemSubno = itemSubno;
	}
	public String getItemSubno()
	{
		return this.itemSubno;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public String getItemName()
	{
		return this.itemName;
	}
	public void setGoodstype(String goodstype)
	{
		this.goodstype = goodstype;
	}
	public String getGoodstype()
	{
		return this.goodstype;
	}
	public void setSalerate(Double salerate)
	{
		this.salerate = salerate;
	}
	public Double getSalerate()
	{
		return this.salerate;
	}
	public void setItemSubname(String itemSubname)
	{
		this.itemSubname = itemSubname;
	}
	public String getItemSubname()
	{
		return this.itemSubname;
	}
	public void setClassNo(String classNo)
	{
		this.classNo = classNo;
	}
	public String getClassNo()
	{
		return this.classNo;
	}
	public void setProductArea(String productArea)
	{
		this.productArea = productArea;
	}
	public String getProductArea()
	{
		return this.productArea;
	}
	public void setSalePrice(Double salePrice)
	{
		this.salePrice = salePrice;
	}
	public Double getSalePrice()
	{
		return this.salePrice;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public String getStatus()
	{
		return this.status;
	}
	public void setDisplayFlag(String displayFlag)
	{
		this.displayFlag = displayFlag;
	}
	public String getDisplayFlag()
	{
		return this.displayFlag;
	}
	public void setSupNo(String supNo)
	{
		this.supNo = supNo;
	}
	public String getSupNo()
	{
		return this.supNo;
	}
	public void setChangepxFlag(String changepxFlag)
	{
		this.changepxFlag = changepxFlag;
	}
	public String getChangepxFlag()
	{
		return this.changepxFlag;
	}
	public void setCounterNo(String counterNo)
	{
		this.counterNo = counterNo;
	}
	public String getCounterNo()
	{
		return this.counterNo;
	}
	public void setPromtype(String promtype)
	{
		this.promtype = promtype;
	}
	public String getPromtype()
	{
		return this.promtype;
	}
	public void setPkzk(Double pkzk)
	{
		this.pkzk = pkzk;
	}
	public Double getPkzk()
	{
		return this.pkzk;
	}
	public void setJkzk(Double jkzk)
	{
		this.jkzk = jkzk;
	}
	public Double getJkzk()
	{
		return this.jkzk;
	}
	public void setZcjfbl(Double zcjfbl)
	{
		this.zcjfbl = zcjfbl;
	}
	public Double getZcjfbl()
	{
		return this.zcjfbl;
	}
	public void setCxjfbl(Double cxjfbl)
	{
		this.cxjfbl = cxjfbl;
	}
	public Double getCxjfbl()
	{
		return this.cxjfbl;
	}

}  