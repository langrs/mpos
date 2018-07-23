package com.site.entity;

import java.io.Serializable;
import java.util.Date;
 /**
 * 对象功能:THycardInfo Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class THycardInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String ckcode;
	// 
	protected String mkcode;
	// 
	protected String lmcode;
	// 
	protected String cardtype;
	// 
	protected String cardstatus;
	// 
	protected String custName;
	// 
	protected String custSex;
	// 
	protected String custPhone;
	// 
	protected String custMobile;
	// 
	protected String custAddr;
	// 
	protected Date custBirthday;
	// 
	protected String custEmail;
	// 
	protected String custId;
	// 
	protected Date startdate;
	// 
	protected Date validDate;
	// 
	protected Double cardvalue;
	// 
	protected Double cardjf;
	// 
	protected Double cardjfTotal;
	// 
	protected Double cardjfQl;
	// 
	protected Double cardjfDh;
	// 
	protected Double cardjfTz;
	// 
	protected Double saleamount;
	// 
	protected int xfcs;
	// 
	protected Date cardjfLastdate;
	// 
	protected Double cardjfLast;
	// 
	protected String babyName;
	// 
	protected String remark;
	// 
	protected int giftflag;
	// 
	protected String reg;
	// 
	protected String lmkstatus;
	// 
	protected String bankFlag;
	// 
	protected Double lmkjf;
	// 
	protected Double lmkjfDh;
	
	public void setCkcode(String ckcode)
	{
		this.ckcode = ckcode;
	}
	public String getCkcode()
	{
		return this.ckcode;
	}
	public void setMkcode(String mkcode)
	{
		this.mkcode = mkcode;
	}
	public String getMkcode()
	{
		return this.mkcode;
	}
	public void setLmcode(String lmcode)
	{
		this.lmcode = lmcode;
	}
	public String getLmcode()
	{
		return this.lmcode;
	}
	public void setCardtype(String cardtype)
	{
		this.cardtype = cardtype;
	}
	public String getCardtype()
	{
		return this.cardtype;
	}
	public void setCardstatus(String cardstatus)
	{
		this.cardstatus = cardstatus;
	}
	public String getCardstatus()
	{
		return this.cardstatus;
	}
	public void setCustName(String custName)
	{
		this.custName = custName;
	}
	public String getCustName()
	{
		return this.custName;
	}
	public void setCustSex(String custSex)
	{
		this.custSex = custSex;
	}
	public String getCustSex()
	{
		return this.custSex;
	}
	public void setCustPhone(String custPhone)
	{
		this.custPhone = custPhone;
	}
	public String getCustPhone()
	{
		return this.custPhone;
	}
	public void setCustMobile(String custMobile)
	{
		this.custMobile = custMobile;
	}
	public String getCustMobile()
	{
		return this.custMobile;
	}
	public void setCustAddr(String custAddr)
	{
		this.custAddr = custAddr;
	}
	public String getCustAddr()
	{
		return this.custAddr;
	}
	public void setCustBirthday(Date custBirthday)
	{
		this.custBirthday = custBirthday;
	}
	public Date getCustBirthday()
	{
		return this.custBirthday;
	}
	public void setCustEmail(String custEmail)
	{
		this.custEmail = custEmail;
	}
	public String getCustEmail()
	{
		return this.custEmail;
	}
	public void setCustId(String custId)
	{
		this.custId = custId;
	}
	public String getCustId()
	{
		return this.custId;
	}
	public void setStartdate(Date startdate)
	{
		this.startdate = startdate;
	}
	public Date getStartdate()
	{
		return this.startdate;
	}
	public void setValidDate(Date validDate)
	{
		this.validDate = validDate;
	}
	public Date getValidDate()
	{
		return this.validDate;
	}
	public void setCardvalue(Double cardvalue)
	{
		this.cardvalue = cardvalue;
	}
	public Double getCardvalue()
	{
		if(this.cardvalue == null){
			return 0D;
		}
		return this.cardvalue;
	}
	public void setCardjf(Double cardjf)
	{

		this.cardjf = cardjf;
	}
	public Double getCardjf()
	{
		if(this.cardjf == null){
			return 0D;
		}
		return this.cardjf;
	}
	public void setCardjfTotal(Double cardjfTotal)
	{
		this.cardjfTotal = cardjfTotal;
	}
	public Double getCardjfTotal()
	{
		if(this.cardjfTotal == null){
			return 0D;
		}
		return this.cardjfTotal;
	}
	public void setCardjfQl(Double cardjfQl)
	{
		this.cardjfQl = cardjfQl;
	}
	public Double getCardjfQl()
	{
		if(this.cardjfQl == null){
			return 0D;
		}
		return this.cardjfQl;
	}
	public void setCardjfDh(Double cardjfDh)
	{
		this.cardjfDh = cardjfDh;
	}
	public Double getCardjfDh()
	{
		if(this.cardjfDh == null){
			return 0D;
		}
		return this.cardjfDh;
	}
	public void setCardjfTz(Double cardjfTz)
	{
		this.cardjfTz = cardjfTz;
	}
	public Double getCardjfTz()
	{
		if(this.cardjfTz == null){
			return 0D;
		}
		return this.cardjfTz;
	}
	public void setSaleamount(Double saleamount)
	{
		this.saleamount = saleamount;
	}
	public Double getSaleamount()
	{
		if(this.saleamount == null){
			return 0D;
		}
		return this.saleamount;
	}
	public void setXfcs(int xfcs)
	{
		this.xfcs = xfcs;
	}
	public int getXfcs()
	{
		return this.xfcs;
	}
	public void setCardjfLastdate(Date cardjfLastdate)
	{
		this.cardjfLastdate = cardjfLastdate;
	}
	public Date getCardjfLastdate()
	{
		return this.cardjfLastdate;
	}
	public void setCardjfLast(Double cardjfLast)
	{
		this.cardjfLast = cardjfLast;
	}
	public Double getCardjfLast()
	{
		if(this.cardjfLast == null){
			return 0D;
		}
		return this.cardjfLast;
	}
	public void setBabyName(String babyName)
	{
		this.babyName = babyName;
	}
	public String getBabyName()
	{
		return this.babyName;
	}
	public void setRemark(String remark)
	{
		this.remark = remark;
	}
	public String getRemark()
	{
		return this.remark;
	}
	public void setGiftflag(int giftflag)
	{
		this.giftflag = giftflag;
	}
	public int getGiftflag()
	{
		return this.giftflag;
	}
	public void setReg(String reg)
	{
		this.reg = reg;
	}
	public String getReg()
	{
		return this.reg;
	}
	public void setLmkstatus(String lmkstatus)
	{
		this.lmkstatus = lmkstatus;
	}
	public String getLmkstatus()
	{
		return this.lmkstatus;
	}
	public void setBankFlag(String bankFlag)
	{
		this.bankFlag = bankFlag;
	}
	public String getBankFlag()
	{
		return this.bankFlag;
	}
	public void setLmkjf(Double lmkjf)
	{
		this.lmkjf = lmkjf;
	}
	public Double getLmkjf()
	{
		return this.lmkjf;
	}
	public void setLmkjfDh(Double lmkjfDh)
	{
		this.lmkjfDh = lmkjfDh;
	}
	public Double getLmkjfDh()
	{
		return this.lmkjfDh;
	}
}  