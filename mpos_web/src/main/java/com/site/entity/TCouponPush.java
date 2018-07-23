package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCouponPush Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCouponPush extends AbstractModel<String>
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
        *推送分类
        */
	protected String pushLb;
        /**
        *推送金额
        */
	protected String pushAmt;
        /**
        *推送张数
        */
	protected Integer pushNum;
        /**
        *推送类别
        */
	protected String pushType;
        /**
        *推送内容
        */
	protected String pushContent;
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
	public void setPushLb(String pushLb) 
	{
		this.pushLb = pushLb;
	}
	public String getPushLb() 
	{
		return this.pushLb;
	}
	public void setPushAmt(String pushAmt) 
	{
		this.pushAmt = pushAmt;
	}
	public String getPushAmt() 
	{
		return this.pushAmt;
	}
	public void setPushNum(Integer pushNum) 
	{
		this.pushNum = pushNum;
	}
	public Integer getPushNum() 
	{
		return this.pushNum;
	}
	public void setPushType(String pushType) 
	{
		this.pushType = pushType;
	}
	public String getPushType() 
	{
		return this.pushType;
	}
	public void setPushContent(String pushContent) 
	{
		this.pushContent = pushContent;
	}
	public String getPushContent() 
	{
		return this.pushContent;
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