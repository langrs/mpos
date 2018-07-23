package com.site.entity;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:RoleRes Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class RoleRes extends AbstractModel<Long>
{

	private static final long serialVersionUID = 1L;
        /**
        *id
        */
	protected Long id;
        /**
        *资源
        */
	protected Long resId;
        /**
        *角色
        */
	protected Long roleId;
	/**
        * resIdObj
        */
	protected AuthRes resIdObj;
	/**
        * roleIdObj
        */
	protected Role roleIdObj;
	public void setId(Long id) 
	{
		this.id = id;
	}
	public Long getId() 
	{
		return this.id;
	}
	public void setResId(Long resId) 
	{
		this.resId = resId;
	}
	public Long getResId() 
	{
		return this.resId;
	}
	public void setRoleId(Long roleId) 
	{
		this.roleId = roleId;
	}
	public Long getRoleId() 
	{
		return this.roleId;
	}
	public void setResIdObj(AuthRes resIdObj) 
	{
		this.resIdObj = resIdObj;
	}
	public AuthRes getResIdObj() 
	{
		return this.resIdObj;
	}
	public void setRoleIdObj(Role roleIdObj) 
	{
		this.roleIdObj = roleIdObj;
	}
	public Role getRoleIdObj() 
	{
		return this.roleIdObj;
	}
}