package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TProduce Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TProduce extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *商品编码
        */
	protected String itemNo;
        /**
        *英文名称
        */
	protected String itemEname;
        /**
        *商品名称
        */
	protected String name;
        /**
        *商品内码
        */
	protected String itemSubno;
        /**
        *商铺
        */
	protected String storeId;
        /**
        *公司ID
        */
	protected String companyId;
        /**
        *分店
        */
	protected String shopId;
        /**
        *类别
        */
	protected String categoryId;
        /**
        *品牌
        */
	protected String brandId;
        /**
        *型号
        */
	protected String model;
        /**
        *颜色码
        */
	protected String itemColor;
        /**
        *尺码
        */
	protected String itemSize;
        /**
        *产地
        */
	protected String produceArea;
        /**
        *单位
        */
	protected String itemUnit;
        /**
        *售价
        */
	protected String salePrice;
        /**
        *定价商品
        */
	protected String isPrice;
        /**
        *商品属性
        */
	protected String itemAttr;
        /**
        *商品状态
        */
	protected String state;
        /**
        *创建人
        */
	protected String createBy;
        /**
        *创建日期
        */
	protected Date createTime;
        /**
        *最后修改人
        */
	protected String updateBy;
        /**
        *最后修改日期
        */
	protected Date updateTime;
        /**
        *是否有效
        */
	protected String isFlag;
	/**
        * categoryIdObj
        */
	protected TCategory categoryIdObj;
	/**
        * companyIdObj
        */
	protected TCompany companyIdObj;
	/**
        * shopIdObj
        */
	protected TShop shopIdObj;
	/**
        * storeIdObj
        */
	protected TStore storeIdObj;
	/**
        * brandIdObj
        */
	protected TBrand brandIdObj;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setItemNo(String itemNo) 
	{
		this.itemNo = itemNo;
	}
	public String getItemNo() 
	{
		return this.itemNo;
	}
	public void setItemEname(String itemEname) 
	{
		this.itemEname = itemEname;
	}
	public String getItemEname() 
	{
		return this.itemEname;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setItemSubno(String itemSubno) 
	{
		this.itemSubno = itemSubno;
	}
	public String getItemSubno() 
	{
		return this.itemSubno;
	}
	public void setStoreId(String storeId) 
	{
		this.storeId = storeId;
	}
	public String getStoreId() 
	{
		return this.storeId;
	}
	public void setCompanyId(String companyId) 
	{
		this.companyId = companyId;
	}
	public String getCompanyId() 
	{
		return this.companyId;
	}
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
	}
	public void setCategoryId(String categoryId) 
	{
		this.categoryId = categoryId;
	}
	public String getCategoryId() 
	{
		return this.categoryId;
	}
	public void setBrandId(String brandId) 
	{
		this.brandId = brandId;
	}
	public String getBrandId() 
	{
		return this.brandId;
	}
	public void setModel(String model) 
	{
		this.model = model;
	}
	public String getModel() 
	{
		return this.model;
	}
	public void setItemColor(String itemColor) 
	{
		this.itemColor = itemColor;
	}
	public String getItemColor() 
	{
		return this.itemColor;
	}
	public void setItemSize(String itemSize) 
	{
		this.itemSize = itemSize;
	}
	public String getItemSize() 
	{
		return this.itemSize;
	}
	public void setProduceArea(String produceArea) 
	{
		this.produceArea = produceArea;
	}
	public String getProduceArea() 
	{
		return this.produceArea;
	}
	public void setItemUnit(String itemUnit) 
	{
		this.itemUnit = itemUnit;
	}
	public String getItemUnit() 
	{
		return this.itemUnit;
	}
	public void setSalePrice(String salePrice) 
	{
		this.salePrice = salePrice;
	}
	public String getSalePrice() 
	{
		return this.salePrice;
	}
	public void setIsPrice(String isPrice) 
	{
		this.isPrice = isPrice;
	}
	public String getIsPrice() 
	{
		return this.isPrice;
	}
	public void setItemAttr(String itemAttr) 
	{
		this.itemAttr = itemAttr;
	}
	public String getItemAttr() 
	{
		return this.itemAttr;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getState() 
	{
		return this.state;
	}
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}
	public String getCreateBy() 
	{
		return this.createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}
	public Date getCreateTime() 
	{
		return this.createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}
	public String getUpdateBy() 
	{
		return this.updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}
	public Date getUpdateTime() 
	{
		return this.updateTime;
	}
	public void setIsFlag(String isFlag) 
	{
		this.isFlag = isFlag;
	}
	public String getIsFlag() 
	{
		return this.isFlag;
	}
	public void setCategoryIdObj(TCategory categoryIdObj) 
	{
		this.categoryIdObj = categoryIdObj;
	}
	public TCategory getCategoryIdObj() 
	{
		return this.categoryIdObj;
	}
	public void setCompanyIdObj(TCompany companyIdObj) 
	{
		this.companyIdObj = companyIdObj;
	}
	public TCompany getCompanyIdObj() 
	{
		return this.companyIdObj;
	}
	public void setShopIdObj(TShop shopIdObj) 
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj() 
	{
		return this.shopIdObj;
	}
	public void setStoreIdObj(TStore storeIdObj) 
	{
		this.storeIdObj = storeIdObj;
	}
	public TStore getStoreIdObj() 
	{
		return this.storeIdObj;
	}
	public void setBrandIdObj(TBrand brandIdObj) 
	{
		this.brandIdObj = brandIdObj;
	}
	public TBrand getBrandIdObj() 
	{
		return this.brandIdObj;
	}
}