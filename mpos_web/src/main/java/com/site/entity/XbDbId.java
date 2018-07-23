package com.site.entity;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:XbDbId Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class XbDbId extends AbstractModel<Long>
{

	private static final long serialVersionUID = 1L;
        /**
        *id_
        */
	protected Long id;
        /**
        *START_
        */
	protected String start;
        /**
        *MAX_
        */
	protected String max;
        /**
        *MAC_NAME_
        */
	protected String macName;
	public void setId(Long id) 
	{
		this.id = id;
	}
	public Long getId() 
	{
		return this.id;
	}
	public void setStart(String start) 
	{
		this.start = start;
	}
	public String getStart() 
	{
		return this.start;
	}
	public void setMax(String max) 
	{
		this.max = max;
	}
	public String getMax() 
	{
		return this.max;
	}
	public void setMacName(String macName) 
	{
		this.macName = macName;
	}
	public String getMacName() 
	{
		return this.macName;
	}
}