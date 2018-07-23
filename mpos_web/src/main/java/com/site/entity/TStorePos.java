package com.site.entity;
    import com.site.core.base.AbstractModel;

import java.util.Date;
/**
 * 对象功能:TStorePos Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TStorePos extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *分店
        */
	protected String shopId;
        /**
        *商铺
        */
	protected String storeId;
        /**
        *终端
        */
	protected String posId;
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
        * posIdObj
        */
	protected TPos posIdObj;
	/**
        * storeIdObj
        */
	protected TStore storeIdObj;
	protected TShop shopIdObj;

	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setShopId(String shopId)
	{
		this.shopId = shopId;
	}
	public String getShopId()
	{
		return this.shopId;
	}
	public void setStoreId(String storeId) 
	{
		this.storeId = storeId;
	}
	public String getStoreId() 
	{
		return this.storeId;
	}
	public void setPosId(String posId) 
	{
		this.posId = posId;
	}
	public String getPosId() 
	{
		return this.posId;
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
	public void setPosIdObj(TPos posIdObj) 
	{
		this.posIdObj = posIdObj;
	}
	public TPos getPosIdObj() 
	{
		return this.posIdObj;
	}
	public void setStoreIdObj(TStore storeIdObj) 
	{
		this.storeIdObj = storeIdObj;
	}
	public TStore getStoreIdObj() 
	{
		return this.storeIdObj;
	}

	public TShop getShopIdObj() {
		return shopIdObj;
	}

	public void setShopIdObj(TShop shopIdObj) {
		this.shopIdObj = shopIdObj;
	}
}