package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TParm Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TParm extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *参数编码
        */
	protected String parmNo;
        /**
        *参数名称
        */
	protected String name;
        /**
        *参数值
        */
	protected String parmVal;
        /**
        *是否系统参数
        */
	protected String isSys;
        /**
        *分店ID
        */
	protected String shopId;
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
	public void setParmNo(String parmNo) 
	{
		this.parmNo = parmNo;
	}
	public String getParmNo() 
	{
		return this.parmNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setParmVal(String parmVal) 
	{
		this.parmVal = parmVal;
	}
	public String getParmVal() 
	{
		return this.parmVal;
	}
	public void setIsSys(String isSys) 
	{
		this.isSys = isSys;
	}
	public String getIsSys() 
	{
		return this.isSys;
	}
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
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