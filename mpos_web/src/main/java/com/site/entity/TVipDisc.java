package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TVipDisc Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TVipDisc extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *会员等级
        */
	protected String vipClass;
        /**
        *分店ID
        */
	protected String shopId;
        /**
        *策略类型
        */
	protected String policyType;
        /**
        *策略编码
        */
	protected String policyNo;
        /**
        *策略ID
        */
	protected String policyId;
        /**
        *打折率
        */
	protected String disccount;
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
	public void setVipClass(String vipClass) 
	{
		this.vipClass = vipClass;
	}
	public String getVipClass() 
	{
		return this.vipClass;
	}
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
	}
	public void setPolicyType(String policyType) 
	{
		this.policyType = policyType;
	}
	public String getPolicyType() 
	{
		return this.policyType;
	}
	public void setPolicyNo(String policyNo) 
	{
		this.policyNo = policyNo;
	}
	public String getPolicyNo() 
	{
		return this.policyNo;
	}
	public void setPolicyId(String policyId) 
	{
		this.policyId = policyId;
	}
	public String getPolicyId() 
	{
		return this.policyId;
	}
	public void setDisccount(String disccount) 
	{
		this.disccount = disccount;
	}
	public String getDisccount() 
	{
		return this.disccount;
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