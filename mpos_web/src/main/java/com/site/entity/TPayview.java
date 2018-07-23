package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TPayview Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TPayview extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *父类ID
        */
	protected String parentId;
        /**
        *支付大类编码
        */
	protected String payviewNo;
        /**
        *支付大类名称
        */
	protected String name;
        /**
        *支付方式ID
        */
	protected String paymodeId;
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
        * paymodeIdObj
        */
	protected TPaymode paymodeIdObj;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setParentId(String parentId) 
	{
		this.parentId = parentId;
	}
	public String getParentId() 
	{
		return this.parentId;
	}
	public void setPayviewNo(String payviewNo) 
	{
		this.payviewNo = payviewNo;
	}
	public String getPayviewNo() 
	{
		return this.payviewNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setPaymodeId(String paymodeId) 
	{
		this.paymodeId = paymodeId;
	}
	public String getPaymodeId() 
	{
		return this.paymodeId;
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
	public void setPaymodeIdObj(TPaymode paymodeIdObj) 
	{
		this.paymodeIdObj = paymodeIdObj;
	}
	public TPaymode getPaymodeIdObj() 
	{
		return this.paymodeIdObj;
	}
}