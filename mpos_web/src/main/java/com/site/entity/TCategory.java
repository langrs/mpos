package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCategory Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCategory extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *类别编码
        */
	protected String cateNo;
        /**
        *类别名称
        */
	protected String name;
        /**
        *类别级别
        */
	protected Integer cateLevel;
        /**
        *父类ID
        */
	protected String parentId;
        /**
        *分店
        */
	protected String shopId;
        /**
        *类别属性
        */
	protected String cateType;
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
	public void setCateNo(String cateNo) 
	{
		this.cateNo = cateNo;
	}
	public String getCateNo() 
	{
		return this.cateNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setCateLevel(Integer cateLevel) 
	{
		this.cateLevel = cateLevel;
	}
	public Integer getCateLevel() 
	{
		return this.cateLevel;
	}
	public void setParentId(String parentId) 
	{
		this.parentId = parentId;
	}
	public String getParentId() 
	{
		return this.parentId;
	}
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
	}
	public void setCateType(String cateType) 
	{
		this.cateType = cateType;
	}
	public String getCateType() 
	{
		return this.cateType;
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