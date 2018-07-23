package com.site.entity;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:AuthRes Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class AuthRes extends AbstractModel<Long>
{

	private static final long serialVersionUID = 1L;
        /**
        *id_
        */
	protected Long id;
        /**
        *连接地址
        */
	protected String path;
        /**
        *权限标识
        */
	protected String key;
        /**
        *资源名称
        */
	protected String name;
        /**
        *所属菜单
        */
	protected Long navId;
	/**
	 *所属菜单obj
	 */
	protected Nav navIdObj;
	/**
	 * 是否选中(0,未选中，1,选中)
	 */
	protected int isCheck;
	
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public Nav getNavIdObj() {
		return navIdObj;
	}
	public void setNavIdObj(Nav navIdObj) {
		this.navIdObj = navIdObj;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	public Long getId() 
	{
		return this.id;
	}
	public void setPath(String path) 
	{
		this.path = path;
	}
	public String getPath() 
	{
		return this.path;
	}
	public void setKey(String key) 
	{
		this.key = key;
	}
	public String getKey() 
	{
		return this.key;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setNavId(Long navId) 
	{
		this.navId = navId;
	}
	public Long getNavId() 
	{
		return this.navId;
	}
}