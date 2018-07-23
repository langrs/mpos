package com.site.entity;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:RoleUser Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class RoleUser extends AbstractModel<Long>
{

	private static final long serialVersionUID = 1L;
        /**
        *id_
        */
	protected Long id;
        /**
        *用户id
        */
	protected Long userid;
        /**
        *角色id
        */
	protected Long roleId;
	/**
        * useridObj
        */
	protected User useridObj;
	public void setId(Long id) 
	{
		this.id = id;
	}
	public Long getId() 
	{
		return this.id;
	}
	public void setUserid(Long userid) 
	{
		this.userid = userid;
	}
	public Long getUserid() 
	{
		return this.userid;
	}
	public void setRoleId(Long roleId) 
	{
		this.roleId = roleId;
	}
	public Long getRoleId() 
	{
		return this.roleId;
	}
	public void setUseridObj(User useridObj) 
	{
		this.useridObj = useridObj;
	}
	public User getUseridObj() 
	{
		return this.useridObj;
	}
}