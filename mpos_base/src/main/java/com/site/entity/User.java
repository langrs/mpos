package com.site.entity;

import com.site.core.base.AbstractModel;

import java.util.Date;

/**
 * 对象功能:User Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class User extends AbstractModel<Long>
{

	private static final long serialVersionUID = 1L;
        /**
        *id_
        */
	protected Long id;
        /**
        *name_
        */
	protected String name;
        /**
        *用户登录名
        */
	protected String userNo;
        /**
        *pass_wd_
        */
	protected String passWd;
        /**
        *create_date_
        */
	protected Date createDate;
	public void setId(Long id) 
	{
		this.id = id;
	}
	public Long getId() 
	{
		return this.id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setUserNo(String userNo) 
	{
		this.userNo = userNo;
	}
	public String getUserNo() 
	{
		return this.userNo;
	}
	public void setPassWd(String passWd) 
	{
		this.passWd = passWd;
	}
	public String getPassWd() 
	{
		return this.passWd;
	}
	public void setCreateDate(Date createDate) 
	{
		this.createDate = createDate;
	}
	public Date getCreateDate() 
	{
		return this.createDate;
	}
}