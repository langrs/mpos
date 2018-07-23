package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TRight Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TRight extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *父节点
        */
	protected String parentId;
        /**
        *节点编码
        */
	protected String nodeId;
        /**
        *节点名称
        */
	protected String name;
        /**
        *节点级别
        */
	protected Integer nodeLevel;
        /**
        *末级节点
        */
	protected String isLastNote;
        /**
        *节点属性
        */
	protected String nodeAttr;
        /**
        *节点内容
        */
	protected String nodeTxt;
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
	public void setParentId(String parentId) 
	{
		this.parentId = parentId;
	}
	public String getParentId() 
	{
		return this.parentId;
	}
	public void setNodeId(String nodeId) 
	{
		this.nodeId = nodeId;
	}
	public String getNodeId() 
	{
		return this.nodeId;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setNodeLevel(Integer nodeLevel) 
	{
		this.nodeLevel = nodeLevel;
	}
	public Integer getNodeLevel() 
	{
		return this.nodeLevel;
	}
	public void setIsLastNote(String isLastNote) 
	{
		this.isLastNote = isLastNote;
	}
	public String getIsLastNote() 
	{
		return this.isLastNote;
	}
	public void setNodeAttr(String nodeAttr) 
	{
		this.nodeAttr = nodeAttr;
	}
	public String getNodeAttr() 
	{
		return this.nodeAttr;
	}
	public void setNodeTxt(String nodeTxt) 
	{
		this.nodeTxt = nodeTxt;
	}
	public String getNodeTxt() 
	{
		return this.nodeTxt;
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