package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TRole Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TRole extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *角色类型
        */
	protected String roleType;
        /**
        *角色编码
        */
	protected String roleNo;
        /**
        *角色名称
        */
	protected String name;
        /**
        *分店
        */
	protected String shopId;
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
        * shopIdObj
        */
	protected TShop shopIdObj;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setRoleType(String roleType) 
	{
		this.roleType = roleType;
	}
	public String getRoleType() 
	{
		return this.roleType;
	}
	public void setRoleNo(String roleNo) 
	{
		this.roleNo = roleNo;
	}
	public String getRoleNo() 
	{
		return this.roleNo;
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
	public void setShopIdObj(TShop shopIdObj) 
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj() 
	{
		return this.shopIdObj;
	}
}