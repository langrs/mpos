package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TVipPoint Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TVipPoint extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *分店ID
        */
	protected String shopId;
        /**
        *会员等级
        */
	protected String vipClass;
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
        *策略名称
        */
	protected String name;
        /**
        *积分系数
        */
	protected String pointXs;
        /**
        *积分倍数
        */
	protected String pointBs;
        /**
        *多倍积分开始时间
        */
	protected Date startdate;
        /**
        *多倍积分结束时间
        */
	protected Date enddate;
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
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
	}
	public void setVipClass(String vipClass) 
	{
		this.vipClass = vipClass;
	}
	public String getVipClass() 
	{
		return this.vipClass;
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
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setPointXs(String pointXs) 
	{
		this.pointXs = pointXs;
	}
	public String getPointXs() 
	{
		return this.pointXs;
	}
	public void setPointBs(String pointBs) 
	{
		this.pointBs = pointBs;
	}
	public String getPointBs() 
	{
		return this.pointBs;
	}
	public void setStartdate(Date startdate) 
	{
		this.startdate = startdate;
	}
	public Date getStartdate() 
	{
		return this.startdate;
	}
	public void setEnddate(Date enddate) 
	{
		this.enddate = enddate;
	}
	public Date getEnddate() 
	{
		return this.enddate;
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