package com.site.entity;  
  
import java.util.Date;  
import com.site.core.base.AbstractModel;

 /**
 * 对象功能:TBrand Model对象
 * 开发公司:
 * 开发人员:
 */
 
public class TBrand extends AbstractModel<String>
{
	private static final long serialVersionUID = 1L;
	// ID
	protected String id;
	// 品牌编码
	protected String brandNo;
	// 品牌名称
	protected String name;
	// 品牌等级
	protected String brandClass;
	// 创建人
	protected String createBy;
	// 创建日期
	protected Date createTime;
	// 最后修改人
	protected String updateBy;
	// 最后修改日期
	protected Date updateTime;
	// 是否有效
	protected String isFlag;
	
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}
	
	public void setBrandNo(String brandNo)
	{
		this.brandNo = brandNo;
	}
	public String getBrandNo()
	{
		return this.brandNo;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setBrandClass(String brandClass)
	{
		this.brandClass = brandClass;
	}
	public String getBrandClass()
	{
		return this.brandClass;
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