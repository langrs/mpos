package com.site.entity;  
  
import java.io.Serializable;
import java.util.Date;  

 /**
 * 对象功能:TSale Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TSale implements Serializable //不通过AbstractModel来实现
{
	private static final long serialVersionUID = 1L;
	// ID
	protected String id;
	// 销售流水号
	protected String saleNo;
	// 销售日期
	protected Date saleDate;
	// 收银员ID
	protected String userId;
	// 原流水号
	protected String sSaleNo;
	// 交易序号
	protected String saleNoShort;
	// 收据号
	protected String billNo;
	// 交易类型
	protected String dealType;
	// 销售来源
	protected String saleSource;
	// 销售单类型
	protected String saleType;
	// 公司ID
	protected String companyId;
	// 分店
	protected String shopId;
	// 区域
	protected String regionId;
	// 终端
	protected String posId;
	// 商铺
	protected String storeId;
	// 业务员
	protected String salesId;
	// 会员卡号
	protected String vipNo;
	// 期初积分
	protected Double originalPoints;
	// 销售积分
	protected Double salePoints;
	// 原价金额
	protected Double originalAmt;
	// 应收金额
	protected Double saleAmt;
	// 实收金额
	protected Double payAmt;
	// 折扣金额
	protected Double discAmt;
	// 抹零金额
	protected Double changeAmt;
	// 溢收金额
	protected Double excessAmt;
	// 税金金额
	protected Double saleTaxAmt;
	// 会员折扣金额
	protected Double vipDiscAmt;
	// 培训模式
	protected String isTrain;
	// 退货理由
	protected String reason;
	// 退货金额
	protected Double retAmt = 0D;
	// 领取电子小票
	protected String ebillType;
	// 上传标志
	protected String upFlag;
	// 上传日期
	protected Date upDate;
	
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}
	public void setSaleNo(String saleNo)
	{
		this.saleNo = saleNo;
	}
	public String getSaleNo()
	{
		return this.saleNo;
	}
	public void setSaleDate(Date saleDate)
	{
		this.saleDate = saleDate;
	}
	public Date getSaleDate()
	{
		return this.saleDate;
	}
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	public String getUserId()
	{
		return this.userId;
	}
	public void setSSaleNo(String sSaleNo)
	{
		this.sSaleNo = sSaleNo;
	}
	public String getSSaleNo()
	{
		return this.sSaleNo;
	}
	public void setSaleNoShort(String saleNoShort)
	{
		this.saleNoShort = saleNoShort;
	}
	public String getSaleNoShort()
	{
		return this.saleNoShort;
	}
	public void setBillNo(String billNo)
	{
		this.billNo = billNo;
	}
	public String getBillNo()
	{
		return this.billNo;
	}
	public void setDealType(String dealType)
	{
		this.dealType = dealType;
	}
	public String getDealType()
	{
		return this.dealType;
	}
	public void setSaleSource(String saleSource)
	{
		this.saleSource = saleSource;
	}
	public String getSaleSource()
	{
		return this.saleSource;
	}
	public void setSaleType(String saleType)
	{
		this.saleType = saleType;
	}
	public String getSaleType()
	{
		return this.saleType;
	}
	public void setCompanyId(String companyId)
	{
		this.companyId = companyId;
	}
	public String getCompanyId()
	{
		return this.companyId;
	}
	public void setShopId(String shopId)
	{
		this.shopId = shopId;
	}
	public String getShopId()
	{
		return this.shopId;
	}
	public void setRegionId(String regionId)
	{
		this.regionId = regionId;
	}
	public String getRegionId()
	{
		return this.regionId;
	}
	public void setPosId(String posId)
	{
		this.posId = posId;
	}
	public String getPosId()
	{
		return this.posId;
	}
	public void setStoreId(String storeId)
	{
		this.storeId = storeId;
	}
	public String getStoreId()
	{
		return this.storeId;
	}
	public void setSalesId(String salesId)
	{
		this.salesId = salesId;
	}
	public String getSalesId()
	{
		return this.salesId;
	}
	public void setVipNo(String vipNo)
	{
		this.vipNo = vipNo;
	}
	public String getVipNo()
	{
		return this.vipNo;
	}
	public void setOriginalPoints(Double originalPoints)
	{
		this.originalPoints = originalPoints;
	}
	public Double getOriginalPoints()
	{
		return this.originalPoints;
	}
	public void setSalePoints(Double salePoints)
	{
		this.salePoints = salePoints;
	}
	public Double getSalePoints()
	{
		return this.salePoints;
	}
	public void setOriginalAmt(Double originalAmt)
	{
		this.originalAmt = originalAmt;
	}
	public Double getOriginalAmt()
	{
		return this.originalAmt;
	}
	public void setSaleAmt(Double saleAmt)
	{
		this.saleAmt = saleAmt;
	}
	public Double getSaleAmt()
	{
		return this.saleAmt;
	}
	public void setPayAmt(Double payAmt)
	{
		this.payAmt = payAmt;
	}
	public Double getPayAmt()
	{
		return this.payAmt;
	}
	public void setDiscAmt(Double discAmt)
	{
		this.discAmt = discAmt;
	}
	public Double getDiscAmt()
	{
		return this.discAmt;
	}
	public void setChangeAmt(Double changeAmt)
	{
		this.changeAmt = changeAmt;
	}
	public Double getChangeAmt()
	{
		return this.changeAmt;
	}
	public void setExcessAmt(Double excessAmt)
	{
		this.excessAmt = excessAmt;
	}
	public Double getExcessAmt()
	{
		return this.excessAmt;
	}
	public void setSaleTaxAmt(Double saleTaxAmt)
	{
		this.saleTaxAmt = saleTaxAmt;
	}
	public Double getSaleTaxAmt()
	{
		return this.saleTaxAmt;
	}
	public void setVipDiscAmt(Double vipDiscAmt)
	{
		this.vipDiscAmt = vipDiscAmt;
	}
	public Double getVipDiscAmt()
	{
		return this.vipDiscAmt;
	}
	public void setIsTrain(String isTrain)
	{
		this.isTrain = isTrain;
	}
	public String getIsTrain()
	{
		return this.isTrain;
	}
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public String getReason()
	{
		return this.reason;
	}
	public void setRetAmt(Double retAmt)
	{
		this.retAmt = retAmt;
	}
	public Double getRetAmt()
	{
		return this.retAmt;
	}
	public void setEbillType(String ebillType)
	{
		this.ebillType = ebillType;
	}
	public String getEbillType()
	{
		return this.ebillType;
	}
	public void setUpFlag(String upFlag)
	{
		this.upFlag = upFlag;
	}
	public String getUpFlag()
	{
		return this.upFlag;
	}
	public void setUpDate(Date upDate)
	{
		this.upDate = upDate;
	}
	public Date getUpDate()
	{
		return this.upDate;
	}
	

	
}  