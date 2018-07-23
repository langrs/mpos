package com.site.entity;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:Resource Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class Resource extends AbstractModel<Long>
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
}