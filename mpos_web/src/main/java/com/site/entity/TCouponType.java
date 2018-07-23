package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCouponType Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCouponType extends AbstractModel<String>
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
        *类别编号
        */
	protected String typeNo;
        /**
        *类别名称
        */
	protected String name;
        /**
        *券面值
        */
	protected String value;
        /**
        *允许找零
        */
	protected String isChange;
        /**
        *有效期值
        */
	protected Integer validNum;
        /**
        *日期单位
        */
	protected String validUnit;
        /**
        *限用买满金额
        */
	protected String limitAmount;
        /**
        *限用张数
        */
	protected Integer limitNum;
        /**
        *特价不参与
        */
	protected String isProm;
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
	/**
        * shopIdObj
        */
	protected TShop shopIdObj;
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
	public void setTypeNo(String typeNo) 
	{
		this.typeNo = typeNo;
	}
	public String getTypeNo() 
	{
		return this.typeNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setValue(String value) 
	{
		this.value = value;
	}
	public String getValue() 
	{
		return this.value;
	}
	public void setIsChange(String isChange) 
	{
		this.isChange = isChange;
	}
	public String getIsChange() 
	{
		return this.isChange;
	}
	public void setValidNum(Integer validNum) 
	{
		this.validNum = validNum;
	}
	public Integer getValidNum() 
	{
		return this.validNum;
	}
	public void setValidUnit(String validUnit) 
	{
		this.validUnit = validUnit;
	}
	public String getValidUnit() 
	{
		return this.validUnit;
	}
	public void setLimitAmount(String limitAmount) 
	{
		this.limitAmount = limitAmount;
	}
	public String getLimitAmount() 
	{
		return this.limitAmount;
	}
	public void setLimitNum(Integer limitNum) 
	{
		this.limitNum = limitNum;
	}
	public Integer getLimitNum() 
	{
		return this.limitNum;
	}
	public void setIsProm(String isProm) 
	{
		this.isProm = isProm;
	}
	public String getIsProm() 
	{
		return this.isProm;
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
	public void setShopIdObj(TShop shopIdObj) 
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj() 
	{
		return this.shopIdObj;
	}
}