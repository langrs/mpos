package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCouponRange Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCouponRange extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *券类别
        */
	protected String couponType;
        /**
        *限制类别
        */
	protected String limitType;
        /**
        *限制内容
        */
	protected String limitContent;
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
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setCouponType(String couponType) 
	{
		this.couponType = couponType;
	}
	public String getCouponType() 
	{
		return this.couponType;
	}
	public void setLimitType(String limitType) 
	{
		this.limitType = limitType;
	}
	public String getLimitType() 
	{
		return this.limitType;
	}
	public void setLimitContent(String limitContent) 
	{
		this.limitContent = limitContent;
	}
	public String getLimitContent() 
	{
		return this.limitContent;
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
}