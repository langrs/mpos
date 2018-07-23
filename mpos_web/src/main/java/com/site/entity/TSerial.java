package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TSerial Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TSerial extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *编码名称
        */
	protected String name;
        /**
        *系统代号
        */
	protected String serialType;
        /**
        *流水位数
        */
	protected Integer serialLength;
        /**
        *编号长度
        */
	protected Integer serialLong;
        /**
        *机构代码
        */
	protected String isOrg;
        /**
        *日期格式
        */
	protected String dateFormate;
        /**
        *当前流水
        */
	protected Integer serialNum;
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
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setSerialType(String serialType) 
	{
		this.serialType = serialType;
	}
	public String getSerialType() 
	{
		return this.serialType;
	}
	public void setSerialLength(Integer serialLength) 
	{
		this.serialLength = serialLength;
	}
	public Integer getSerialLength() 
	{
		return this.serialLength;
	}
	public void setSerialLong(Integer serialLong) 
	{
		this.serialLong = serialLong;
	}
	public Integer getSerialLong() 
	{
		return this.serialLong;
	}
	public void setIsOrg(String isOrg) 
	{
		this.isOrg = isOrg;
	}
	public String getIsOrg() 
	{
		return this.isOrg;
	}
	public void setDateFormate(String dateFormate) 
	{
		this.dateFormate = dateFormate;
	}
	public String getDateFormate() 
	{
		return this.dateFormate;
	}
	public void setSerialNum(Integer serialNum) 
	{
		this.serialNum = serialNum;
	}
	public Integer getSerialNum() 
	{
		return this.serialNum;
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