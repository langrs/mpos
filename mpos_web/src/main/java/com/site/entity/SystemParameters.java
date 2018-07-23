package com.site.entity;

import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:SystemParameters Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class SystemParameters extends AbstractModel<Long>
{

	private static final long serialVersionUID = 1L;
        /**
        *id_
        */
	protected Long id;
        /**
        *参数类型
        */
	protected String parametersType;
        /**
        *参数值
        */
	protected Integer parametersValue;
        /**
        *参数说明
        */
	protected String parametersInfo;
        /**
        *详细描述
        */
	protected String desc;
	public void setId(Long id) 
	{
		this.id = id;
	}
	public Long getId() 
	{
		return this.id;
	}
	public void setParametersType(String parametersType) 
	{
		this.parametersType = parametersType;
	}
	public String getParametersType() 
	{
		return this.parametersType;
	}
	public void setParametersValue(Integer parametersValue) 
	{
		this.parametersValue = parametersValue;
	}
	public Integer getParametersValue() 
	{
		return this.parametersValue;
	}
	public void setParametersInfo(String parametersInfo) 
	{
		this.parametersInfo = parametersInfo;
	}
	public String getParametersInfo() 
	{
		return this.parametersInfo;
	}
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}
	public String getDesc() 
	{
		return this.desc;
	}
}