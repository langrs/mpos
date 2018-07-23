package com.site.entity;
    import com.site.core.base.AbstractModel;

import java.util.Date;
/**
 * 对象功能:TCode Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCode extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *参数类别
        */
	protected String codeType;
	/**
	 *参数描述
	 */
	protected String codeDesc;
        /**
        *代码编码
        */

	protected String codeNo;
        /**
        *代码名称
        */
	protected String name;
        /**
        *代码值
        */
	protected String codeValue;
        /**
        *是否系统代码
        */
	protected String isSys;
        /**
        *参数属性
        */
	protected String codeAttr;
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
	public void setCodeType(String codeType) 
	{
		this.codeType = codeType;
	}
	public String getCodeType() 
	{
		return this.codeType;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public void setCodeNo(String codeNo)
	{
		this.codeNo = codeNo;
	}
	public String getCodeNo() 
	{
		return this.codeNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setCodeValue(String codeValue) 
	{
		this.codeValue = codeValue;
	}
	public String getCodeValue() 
	{
		return this.codeValue;
	}
	public void setIsSys(String isSys) 
	{
		this.isSys = isSys;
	}
	public String getIsSys() 
	{
		return this.isSys;
	}
	public void setCodeAttr(String codeAttr) 
	{
		this.codeAttr = codeAttr;
	}
	public String getCodeAttr() 
	{
		return this.codeAttr;
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