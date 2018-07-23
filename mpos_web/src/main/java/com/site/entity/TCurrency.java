package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCurrency Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCurrency extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *币种编码
        */
	protected String currencyNo;
        /**
        *币种名称
        */
	protected String name;
        /**
        *币种符号
        */
	protected String currencyMark;
        /**
        *是否本币
        */
	protected String isLocalCurrency;
        /**
        *汇率
        */
	protected String exchangeRate;
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
	public void setCurrencyNo(String currencyNo) 
	{
		this.currencyNo = currencyNo;
	}
	public String getCurrencyNo() 
	{
		return this.currencyNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setCurrencyMark(String currencyMark) 
	{
		this.currencyMark = currencyMark;
	}
	public String getCurrencyMark() 
	{
		return this.currencyMark;
	}
	public void setIsLocalCurrency(String isLocalCurrency) 
	{
		this.isLocalCurrency = isLocalCurrency;
	}
	public String getIsLocalCurrency() 
	{
		return this.isLocalCurrency;
	}
	public void setExchangeRate(String exchangeRate) 
	{
		this.exchangeRate = exchangeRate;
	}
	public String getExchangeRate() 
	{
		return this.exchangeRate;
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