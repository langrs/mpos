package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TRolePaymode Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TRolePaymode extends AbstractModel<String>
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
        *角色
        */
	protected String roleId;
        /**
        *支付方式
        */
	protected String paymodeId;
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
        * paymodeIdObj
        */
	protected TPaymode paymodeIdObj;
	/**
        * shopIdObj
        */
	protected TShop shopIdObj;
	/**
        * roleIdObj
        */
	protected TRole roleIdObj;
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
	public void setRoleId(String roleId) 
	{
		this.roleId = roleId;
	}
	public String getRoleId() 
	{
		return this.roleId;
	}
	public void setPaymodeId(String paymodeId) 
	{
		this.paymodeId = paymodeId;
	}
	public String getPaymodeId() 
	{
		return this.paymodeId;
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
	public void setPaymodeIdObj(TPaymode paymodeIdObj) 
	{
		this.paymodeIdObj = paymodeIdObj;
	}
	public TPaymode getPaymodeIdObj() 
	{
		return this.paymodeIdObj;
	}
	public void setShopIdObj(TShop shopIdObj) 
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj() 
	{
		return this.shopIdObj;
	}
	public void setRoleIdObj(TRole roleIdObj) 
	{
		this.roleIdObj = roleIdObj;
	}
	public TRole getRoleIdObj() 
	{
		return this.roleIdObj;
	}
}