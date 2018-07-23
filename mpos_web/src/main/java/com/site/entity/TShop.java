package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TShop Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TShop extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *公司ID
        */
	protected String companyId;
        /**
        *分店编码
        */
	protected String shopNo;
        /**
        *分店名称
        */
	protected String name;
        /**
        *区域
        */
	protected String regionId;
        /**
        *分店描述
        */
	protected String descr;
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
        * regionIdObj
        */
	protected TRegion regionIdObj;
	/**
        * companyIdObj
        */
	protected TCompany companyIdObj;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setCompanyId(String companyId) 
	{
		this.companyId = companyId;
	}
	public String getCompanyId() 
	{
		return this.companyId;
	}
	public void setShopNo(String shopNo) 
	{
		this.shopNo = shopNo;
	}
	public String getShopNo() 
	{
		return this.shopNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setRegionId(String regionId) 
	{
		this.regionId = regionId;
	}
	public String getRegionId() 
	{
		return this.regionId;
	}
	public void setDescr(String descr) 
	{
		this.descr = descr;
	}
	public String getDescr() 
	{
		return this.descr;
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
	public void setRegionIdObj(TRegion regionIdObj) 
	{
		this.regionIdObj = regionIdObj;
	}
	public TRegion getRegionIdObj() 
	{
		return this.regionIdObj;
	}
	public void setCompanyIdObj(TCompany companyIdObj) 
	{
		this.companyIdObj = companyIdObj;
	}
	public TCompany getCompanyIdObj() 
	{
		return this.companyIdObj;
	}
}