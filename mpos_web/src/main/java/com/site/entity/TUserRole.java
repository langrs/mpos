package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TUserRole Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TUserRole extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *用户ID
        */
	protected String userId;
        /**
        *角色ID
        */
	protected String roleId;
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
        * roleIdObj
        */
	protected TRole roleIdObj;
	/**
        * userIdObj
        */
	protected TUser userIdObj;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setUserId(String userId) 
	{
		this.userId = userId;
	}
	public String getUserId() 
	{
		return this.userId;
	}
	public void setRoleId(String roleId) 
	{
		this.roleId = roleId;
	}
	public String getRoleId() 
	{
		return this.roleId;
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
	public void setRoleIdObj(TRole roleIdObj) 
	{
		this.roleIdObj = roleIdObj;
	}
	public TRole getRoleIdObj() 
	{
		return this.roleIdObj;
	}
	public void setUserIdObj(TUser userIdObj) 
	{
		this.userIdObj = userIdObj;
	}
	public TUser getUserIdObj() 
	{
		return this.userIdObj;
	}
}