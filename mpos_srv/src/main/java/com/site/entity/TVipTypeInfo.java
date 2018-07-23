package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipTypeInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipTypeInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String viptypeNo;
	// 
	protected String discountNo;
	// 
	protected String saveNo;
	// 
	protected String integralNo;
	// 
	protected String viptypeName;
	// 
	protected String priceType;
	// 
	protected String birthdayDiscountNo;
	// 
	protected String viptypeIsIntegral;
	// 
	protected String viptypeIsSave;
	// 
	protected String viptypeValidValue;
	// 
	protected String dateUnit;
	// 
	protected Double viptypeInitAmt;
	// 
	protected Double vipTypeLeastAmt;
	// 
	protected String IsSysFlag;
	// 
	protected Double viptypeFyAmt;
	// 
	protected Double viptypeReletAmt;
	// 
	protected String createUser;
	// 
	protected Date createDate;
	// 
	protected String modifyUser;
	// 
	protected Date modifyDate;
	// 
	protected Double updateFlow;
	// 
	protected String pfIsIntegral;
	// 
	protected String pfIntegralNo;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String paysaveIsDiscount;
	// 
	protected String level1IntegralNo;
	// 
	protected String level2IntegralNo;
	// 
	protected String level3IntegralNo;
	// 
	protected String pfIntroHaveIntegral;
	// 
	protected String transUpflag;
	// 
	protected String vipHavePwd;
	// 
	protected Double limitAmt;
	// 
	protected Date limitDateBegin;
	// 
	protected Date limitDateEnd;
	public void setViptypeNo(String viptypeNo)
	{
		this.viptypeNo = viptypeNo;
	}
	public String getViptypeNo()
	{
		return this.viptypeNo;
	}
	public void setDiscountNo(String discountNo)
	{
		this.discountNo = discountNo;
	}
	public String getDiscountNo()
	{
		return this.discountNo;
	}
	public void setSaveNo(String saveNo)
	{
		this.saveNo = saveNo;
	}
	public String getSaveNo()
	{
		return this.saveNo;
	}
	public void setIntegralNo(String integralNo)
	{
		this.integralNo = integralNo;
	}
	public String getIntegralNo()
	{
		return this.integralNo;
	}
	public void setViptypeName(String viptypeName)
	{
		this.viptypeName = viptypeName;
	}
	public String getViptypeName()
	{
		return this.viptypeName;
	}
	public void setPriceType(String priceType)
	{
		this.priceType = priceType;
	}
	public String getPriceType()
	{
		return this.priceType;
	}
	public void setBirthdayDiscountNo(String birthdayDiscountNo)
	{
		this.birthdayDiscountNo = birthdayDiscountNo;
	}
	public String getBirthdayDiscountNo()
	{
		return this.birthdayDiscountNo;
	}
	public void setViptypeIsIntegral(String viptypeIsIntegral)
	{
		this.viptypeIsIntegral = viptypeIsIntegral;
	}
	public String getViptypeIsIntegral()
	{
		return this.viptypeIsIntegral;
	}
	public void setViptypeIsSave(String viptypeIsSave)
	{
		this.viptypeIsSave = viptypeIsSave;
	}
	public String getViptypeIsSave()
	{
		return this.viptypeIsSave;
	}
	public void setViptypeValidValue(String viptypeValidValue)
	{
		this.viptypeValidValue = viptypeValidValue;
	}
	public String getViptypeValidValue()
	{
		return this.viptypeValidValue;
	}
	public void setDateUnit(String dateUnit)
	{
		this.dateUnit = dateUnit;
	}
	public String getDateUnit()
	{
		return this.dateUnit;
	}
	public void setViptypeInitAmt(Double viptypeInitAmt)
	{
		this.viptypeInitAmt = viptypeInitAmt;
	}
	public Double getViptypeInitAmt()
	{
		return this.viptypeInitAmt;
	}
	public void setVipTypeLeastAmt(Double vipTypeLeastAmt)
	{
		this.vipTypeLeastAmt = vipTypeLeastAmt;
	}
	public Double getVipTypeLeastAmt()
	{
		return this.vipTypeLeastAmt;
	}
	public void setIsSysFlag(String IsSysFlag)
	{
		this.IsSysFlag = IsSysFlag;
	}
	public String getIsSysFlag()
	{
		return this.IsSysFlag;
	}
	public void setViptypeFyAmt(Double viptypeFyAmt)
	{
		this.viptypeFyAmt = viptypeFyAmt;
	}
	public Double getViptypeFyAmt()
	{
		return this.viptypeFyAmt;
	}
	public void setViptypeReletAmt(Double viptypeReletAmt)
	{
		this.viptypeReletAmt = viptypeReletAmt;
	}
	public Double getViptypeReletAmt()
	{
		return this.viptypeReletAmt;
	}
	public void setCreateUser(String createUser)
	{
		this.createUser = createUser;
	}
	public String getCreateUser()
	{
		return this.createUser;
	}
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	public Date getCreateDate()
	{
		return this.createDate;
	}
	public void setModifyUser(String modifyUser)
	{
		this.modifyUser = modifyUser;
	}
	public String getModifyUser()
	{
		return this.modifyUser;
	}
	public void setModifyDate(Date modifyDate)
	{
		this.modifyDate = modifyDate;
	}
	public Date getModifyDate()
	{
		return this.modifyDate;
	}
	public void setUpdateFlow(Double updateFlow)
	{
		this.updateFlow = updateFlow;
	}
	public Double getUpdateFlow()
	{
		return this.updateFlow;
	}
	public void setPfIsIntegral(String pfIsIntegral)
	{
		this.pfIsIntegral = pfIsIntegral;
	}
	public String getPfIsIntegral()
	{
		return this.pfIsIntegral;
	}
	public void setPfIntegralNo(String pfIntegralNo)
	{
		this.pfIntegralNo = pfIntegralNo;
	}
	public String getPfIntegralNo()
	{
		return this.pfIntegralNo;
	}
	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
	}
	public Date getUpdateTime()
	{
		return this.updateTime;
	}
	public void setUpdateBranch(String updateBranch)
	{
		this.updateBranch = updateBranch;
	}
	public String getUpdateBranch()
	{
		return this.updateBranch;
	}
	public void setPaysaveIsDiscount(String paysaveIsDiscount)
	{
		this.paysaveIsDiscount = paysaveIsDiscount;
	}
	public String getPaysaveIsDiscount()
	{
		return this.paysaveIsDiscount;
	}
	public void setLevel1IntegralNo(String level1IntegralNo)
	{
		this.level1IntegralNo = level1IntegralNo;
	}
	public String getLevel1IntegralNo()
	{
		return this.level1IntegralNo;
	}
	public void setLevel2IntegralNo(String level2IntegralNo)
	{
		this.level2IntegralNo = level2IntegralNo;
	}
	public String getLevel2IntegralNo()
	{
		return this.level2IntegralNo;
	}
	public void setLevel3IntegralNo(String level3IntegralNo)
	{
		this.level3IntegralNo = level3IntegralNo;
	}
	public String getLevel3IntegralNo()
	{
		return this.level3IntegralNo;
	}
	public void setPfIntroHaveIntegral(String pfIntroHaveIntegral)
	{
		this.pfIntroHaveIntegral = pfIntroHaveIntegral;
	}
	public String getPfIntroHaveIntegral()
	{
		return this.pfIntroHaveIntegral;
	}
	public void setTransUpflag(String transUpflag)
	{
		this.transUpflag = transUpflag;
	}
	public String getTransUpflag()
	{
		return this.transUpflag;
	}
	public void setVipHavePwd(String vipHavePwd)
	{
		this.vipHavePwd = vipHavePwd;
	}
	public String getVipHavePwd()
	{
		return this.vipHavePwd;
	}
	public void setLimitAmt(Double limitAmt)
	{
		this.limitAmt = limitAmt;
	}
	public Double getLimitAmt()
	{
		return this.limitAmt;
	}
	public void setLimitDateBegin(Date limitDateBegin)
	{
		this.limitDateBegin = limitDateBegin;
	}
	public Date getLimitDateBegin()
	{
		return this.limitDateBegin;
	}
	public void setLimitDateEnd(Date limitDateEnd)
	{
		this.limitDateEnd = limitDateEnd;
	}
	public Date getLimitDateEnd()
	{
		return this.limitDateEnd;
	}
}  