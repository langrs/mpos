package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TCustInfo Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TCustInfo extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *微信号
        */
	protected String openId;
        /**
        *实体卡号
        */
	protected String cardNo;
        /**
        *顾客名称
        */
	protected String custName;
        /**
        *顾客电话
        */
	protected String custPhone;
        /**
        *顾客地址
        */
	protected String custAddr;
        /**
        *顾客邮箱
        */
	protected String custEmail;
        /**
        *顾客性别
        */
	protected String custSex;
        /**
        *顾客来源
        */
	protected String custSrc;
        /**
        *顾客区域
        */
	protected String custRegion;
        /**
        *最后消费日期
        */
	protected Date lastDate;
        /**
        *最后消费金额
        */
	protected String lastAmt;
        /**
        *总消费金额
        */
	protected String allAmt;
        /**
        *顾客积分
        */
	protected String custPoints;
        /**
        *顾客生日
        */
	protected Date custBirth;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setOpenId(String openId) 
	{
		this.openId = openId;
	}
	public String getOpenId() 
	{
		return this.openId;
	}
	public void setCardNo(String cardNo) 
	{
		this.cardNo = cardNo;
	}
	public String getCardNo() 
	{
		return this.cardNo;
	}
	public void setCustName(String custName) 
	{
		this.custName = custName;
	}
	public String getCustName() 
	{
		return this.custName;
	}
	public void setCustPhone(String custPhone) 
	{
		this.custPhone = custPhone;
	}
	public String getCustPhone() 
	{
		return this.custPhone;
	}
	public void setCustAddr(String custAddr) 
	{
		this.custAddr = custAddr;
	}
	public String getCustAddr() 
	{
		return this.custAddr;
	}
	public void setCustEmail(String custEmail) 
	{
		this.custEmail = custEmail;
	}
	public String getCustEmail() 
	{
		return this.custEmail;
	}
	public void setCustSex(String custSex) 
	{
		this.custSex = custSex;
	}
	public String getCustSex() 
	{
		return this.custSex;
	}
	public void setCustSrc(String custSrc) 
	{
		this.custSrc = custSrc;
	}
	public String getCustSrc() 
	{
		return this.custSrc;
	}
	public void setCustRegion(String custRegion) 
	{
		this.custRegion = custRegion;
	}
	public String getCustRegion() 
	{
		return this.custRegion;
	}
	public void setLastDate(Date lastDate) 
	{
		this.lastDate = lastDate;
	}
	public Date getLastDate() 
	{
		return this.lastDate;
	}
	public void setLastAmt(String lastAmt) 
	{
		this.lastAmt = lastAmt;
	}
	public String getLastAmt() 
	{
		return this.lastAmt;
	}
	public void setAllAmt(String allAmt) 
	{
		this.allAmt = allAmt;
	}
	public String getAllAmt() 
	{
		return this.allAmt;
	}
	public void setCustPoints(String custPoints) 
	{
		this.custPoints = custPoints;
	}
	public String getCustPoints() 
	{
		return this.custPoints;
	}
	public void setCustBirth(Date custBirth) 
	{
		this.custBirth = custBirth;
	}
	public Date getCustBirth() 
	{
		return this.custBirth;
	}
}