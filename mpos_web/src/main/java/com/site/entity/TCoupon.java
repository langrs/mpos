package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCoupon Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCoupon extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *券号
        */
	protected String couponNo;
        /**
        *发放渠道
        */
	protected String issueType;
        /**
        *发放流水
        */
	protected String issueNo;
        /**
        *发放时间
        */
	protected Date issueTime;
        /**
        *发放人
        */
	protected String issueMan;
        /**
        *发放组织ID
        */
	protected String issueOrg;
        /**
        *券状态
        */
	protected String state;
        /**
        *核销流水
        */
	protected String checkNo;
        /**
        *核销组织ID
        */
	protected String checkOrg;
        /**
        *核销渠道
        */
	protected String checkType;
        /**
        *券类型
        */
	protected String couponType;
        /**
        *券有效期始
        */
	protected Date startDate;
        /**
        *券有效期止
        */
	protected Date endDate;
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
	public void setCouponNo(String couponNo) 
	{
		this.couponNo = couponNo;
	}
	public String getCouponNo() 
	{
		return this.couponNo;
	}
	public void setIssueType(String issueType) 
	{
		this.issueType = issueType;
	}
	public String getIssueType() 
	{
		return this.issueType;
	}
	public void setIssueNo(String issueNo) 
	{
		this.issueNo = issueNo;
	}
	public String getIssueNo() 
	{
		return this.issueNo;
	}
	public void setIssueTime(Date issueTime) 
	{
		this.issueTime = issueTime;
	}
	public Date getIssueTime() 
	{
		return this.issueTime;
	}
	public void setIssueMan(String issueMan) 
	{
		this.issueMan = issueMan;
	}
	public String getIssueMan() 
	{
		return this.issueMan;
	}
	public void setIssueOrg(String issueOrg) 
	{
		this.issueOrg = issueOrg;
	}
	public String getIssueOrg() 
	{
		return this.issueOrg;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getState() 
	{
		return this.state;
	}
	public void setCheckNo(String checkNo) 
	{
		this.checkNo = checkNo;
	}
	public String getCheckNo() 
	{
		return this.checkNo;
	}
	public void setCheckOrg(String checkOrg) 
	{
		this.checkOrg = checkOrg;
	}
	public String getCheckOrg() 
	{
		return this.checkOrg;
	}
	public void setCheckType(String checkType) 
	{
		this.checkType = checkType;
	}
	public String getCheckType() 
	{
		return this.checkType;
	}
	public void setCouponType(String couponType) 
	{
		this.couponType = couponType;
	}
	public String getCouponType() 
	{
		return this.couponType;
	}
	public void setStartDate(Date startDate) 
	{
		this.startDate = startDate;
	}
	public Date getStartDate() 
	{
		return this.startDate;
	}
	public void setEndDate(Date endDate) 
	{
		this.endDate = endDate;
	}
	public Date getEndDate() 
	{
		return this.endDate;
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