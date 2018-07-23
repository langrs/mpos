package com.site.entity;  
  
import com.site.core.base.AbstractModel;

import java.util.Date;
 /**
 * 对象功能:TStore Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TStore extends AbstractModel<String>
{
	private static final long serialVersionUID = 1L;
	// ID
	protected String id;
	// 商铺编码
	protected String storeNo;
	// 商铺名称
	protected String name;
	// 所属分店
	protected String shopId;
	// 面积
	protected Double area;
	// 楼层
	protected String floor;
	// 收银方式
	protected String collectType;
	// 商铺类型
	protected String storeType;
	// 品牌ID
	protected String brandId;
	// 创建人
	protected String createBy;
	// 创建日期
	protected Date createTime;
	// 最后修改人
	protected String updateBy;
	// 最后修改日期
	protected Date updateTime;
	// 是否有效
	protected String isFlag;
	// 所属分店Obj
	protected TShop shopIdObj;
	
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}
	public void setStoreNo(String storeNo)
	{
		this.storeNo = storeNo;
	}
	public String getStoreNo()
	{
		return this.storeNo;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setShopId(String shopId)
	{
		this.shopId = shopId;
	}
	public String getShopId()
	{
		return this.shopId;
	}
	public void setShopIdObj(TShop shopIdObj)
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj()
	{
		return this.shopIdObj;
	}	
	public void setArea(Double area)
	{
		this.area = area;
	}
	public Double getArea()
	{
		return this.area;
	}
	public void setFloor(String floor)
	{
		this.floor = floor;
	}
	public String getFloor()
	{
		return this.floor;
	}
	public void setCollectType(String collectType)
	{
		this.collectType = collectType;
	}
	public String getCollectType()
	{
		return this.collectType;
	}
	public void setStoreType(String storeType)
	{
		this.storeType = storeType;
	}
	public String getStoreType()
	{
		return this.storeType;
	}
	public void setBrandId(String brandId)
	{
		this.brandId = brandId;
	}
	public String getBrandId()
	{
		return this.brandId;
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

}  