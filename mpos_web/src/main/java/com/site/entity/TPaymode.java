package com.site.entity;  
  
import java.util.Date;  
import com.site.core.base.AbstractModel;
import com.site.entity.TPaymodeType;
import com.site.entity.TShop;
import com.site.entity.TCurrency;
 /**
 * 对象功能:TPaymode Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TPaymode extends AbstractModel<String>
{
	private static final long serialVersionUID = 1L;
	// ID
	protected String id;
	// 支付编码
	protected String paymodeNo;
	// 支付名称
	protected String name;
	// 企业支付编码
	protected String paymodeQy;
	// 支付类别ID
	protected String paymodeTypeId;
	// 分店ID
	protected String shopId;
	// 是否找零
	protected String isChange;
	// 是否积分
	protected String isPoint;
	// 是否开票
	protected String isInvoice;
	// 是否兑券
	protected String isCoupon;
	// 是否退货
	protected String isRet;
	// 币种ID
	protected String currencyId;
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
	// 支付类别IDObj
	protected TPaymodeType paymodeTypeIdObj;
	// 分店IDObj
	protected TShop shopIdObj;
	// 币种IDObj
	protected TCurrency currencyIdObj;
	
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}
	public void setPaymodeNo(String paymodeNo)
	{
		this.paymodeNo = paymodeNo;
	}
	public String getPaymodeNo()
	{
		return this.paymodeNo;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setPaymodeQy(String paymodeQy)
	{
		this.paymodeQy = paymodeQy;
	}
	public String getPaymodeQy()
	{
		return this.paymodeQy;
	}
	public void setPaymodeTypeId(String paymodeTypeId)
	{
		this.paymodeTypeId = paymodeTypeId;
	}
	public String getPaymodeTypeId()
	{
		return this.paymodeTypeId;
	}
	public void setPaymodeTypeIdObj(TPaymodeType paymodeTypeIdObj)
	{
		this.paymodeTypeIdObj = paymodeTypeIdObj;
	}
	public TPaymodeType getPaymodeTypeIdObj()
	{
		return this.paymodeTypeIdObj;
	}	
	public void setShopId(String shopId)
	{
		this.shopId = shopId;
	}
	public String getShopId()
	{
		return this.shopId;
	}
	public void setShopIdObj(TShop shopIdObj)
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj()
	{
		return this.shopIdObj;
	}	
	public void setIsChange(String isChange)
	{
		this.isChange = isChange;
	}
	public String getIsChange()
	{
		return this.isChange;
	}
	public void setIsPoint(String isPoint)
	{
		this.isPoint = isPoint;
	}
	public String getIsPoint()
	{
		return this.isPoint;
	}
	public void setIsInvoice(String isInvoice)
	{
		this.isInvoice = isInvoice;
	}
	public String getIsInvoice()
	{
		return this.isInvoice;
	}
	public void setIsCoupon(String isCoupon)
	{
		this.isCoupon = isCoupon;
	}
	public String getIsCoupon()
	{
		return this.isCoupon;
	}
	public void setIsRet(String isRet)
	{
		this.isRet = isRet;
	}
	public String getIsRet()
	{
		return this.isRet;
	}
	public void setCurrencyId(String currencyId)
	{
		this.currencyId = currencyId;
	}
	public String getCurrencyId()
	{
		return this.currencyId;
	}
	public void setCurrencyIdObj(TCurrency currencyIdObj)
	{
		this.currencyIdObj = currencyIdObj;
	}
	public TCurrency getCurrencyIdObj()
	{
		return this.currencyIdObj;
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