package com.site.entity;  
  
import com.site.core.base.AbstractModel;

import java.util.Date;
 /**
 * 对象功能:TNotice Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TNotice extends AbstractModel<String>
{
	private static final long serialVersionUID = 1L;
	// 
	protected String id;
	// 
	protected String noticeNo;
	// 
	protected String title;
	// 
	protected String memo;
	// 
	protected Date validDate;
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
	public void setNoticeNo(String noticeNo)
	{
		this.noticeNo = noticeNo;
	}
	public String getNoticeNo()
	{
		return this.noticeNo;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setMemo(String memo)
	{
		this.memo = memo;
	}
	public String getMemo()
	{
		return this.memo;
	}
	public void setValidDate(Date validDate)
	{
		this.validDate = validDate;
	}
	public Date getValidDate()
	{
		return this.validDate;
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