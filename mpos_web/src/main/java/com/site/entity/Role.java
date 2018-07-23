package com.site.entity;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:Role Model对象 开发公司:site 开发人员:huj
 */
public class Role extends AbstractModel<Long> {

	private static final long serialVersionUID = 1L;
	/**
	 * id_
	 */
	protected Long id;
	/**
	 * 角色名
	 */
	protected String name;
	/**
	 * 状态
	 */
	protected Integer status;
	/**
	 * 权限id组
	 */
	protected Long[] permIds;
	/**
	 * 角色人员组
	 */
	protected RoleUser[] roleUsers;

	
	
	public RoleUser[] getRoleUsers() {
		return roleUsers;
	}
	public void setRoleUsers(RoleUser[] roleUsers) {
		this.roleUsers = roleUsers;
	}
	public Long[] getPermIds() {
		return permIds;
	}
	public void setPermIds(Long[] permIds) {
		this.permIds = permIds;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return this.status;
	}
}