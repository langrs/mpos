package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TSysUser Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TSysUser implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String userId;
	// 
	protected String operType;
	// 
	protected String userName;
	// 
	protected String userPw;
	// 
	protected String userStatus;
	// 
	protected String cashierGrant;
	// 
	protected Double minZk;
	// 
	protected Double maxGd;
	// 
	protected Double maxFree;
	// 
	protected Double updateFlow;
	// 
	protected String userLoginPos;
	// 
	protected String userLoginHT;
	// 
	protected String userEmpNo;
	// 
	protected String userCard;
	// 
	protected String grantPayment;
	// 
	protected String branchNo;
	// 
	protected String userLoginWEB;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	// 
	protected String wxOpenid;
	// 
	protected String wxGrant;
	//
	protected String counterNo;

	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	public String getUserId()
	{
		return this.userId;
	}
	public void setOperType(String operType)
	{
		this.operType = operType;
	}
	public String getOperType()
	{
		return this.operType;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public void setUserPw(String userPw)
	{
		this.userPw = userPw;
	}
	public String getUserPw()
	{
		return this.userPw;
	}
	public void setUserStatus(String userStatus)
	{
		this.userStatus = userStatus;
	}
	public String getUserStatus()
	{
		return this.userStatus;
	}
	public void setCashierGrant(String cashierGrant)
	{
		this.cashierGrant = cashierGrant;
	}
	public String getCashierGrant()
	{
		return this.cashierGrant;
	}
	public void setMinZk(Double minZk)
	{
		this.minZk = minZk;
	}
	public Double getMinZk()
	{
		return this.minZk;
	}
	public void setMaxGd(Double maxGd)
	{
		this.maxGd = maxGd;
	}
	public Double getMaxGd()
	{
		return this.maxGd;
	}
	public void setMaxFree(Double maxFree)
	{
		this.maxFree = maxFree;
	}
	public Double getMaxFree()
	{
		return this.maxFree;
	}
	public void setUpdateFlow(Double updateFlow)
	{
		this.updateFlow = updateFlow;
	}
	public Double getUpdateFlow()
	{
		return this.updateFlow;
	}
	public void setUserLoginPos(String userLoginPos)
	{
		this.userLoginPos = userLoginPos;
	}
	public String getUserLoginPos()
	{
		return this.userLoginPos;
	}
	public void setUserLoginHT(String userLoginHT)
	{
		this.userLoginHT = userLoginHT;
	}
	public String getUserLoginHT()
	{
		return this.userLoginHT;
	}
	public void setUserEmpNo(String userEmpNo)
	{
		this.userEmpNo = userEmpNo;
	}
	public String getUserEmpNo()
	{
		return this.userEmpNo;
	}
	public void setUserCard(String userCard)
	{
		this.userCard = userCard;
	}
	public String getUserCard()
	{
		return this.userCard;
	}
	public void setGrantPayment(String grantPayment)
	{
		this.grantPayment = grantPayment;
	}
	public String getGrantPayment()
	{
		return this.grantPayment;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setUserLoginWEB(String userLoginWEB)
	{
		this.userLoginWEB = userLoginWEB;
	}
	public String getUserLoginWEB()
	{
		return this.userLoginWEB;
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
	public void setTransUpflag(String transUpflag)
	{
		this.transUpflag = transUpflag;
	}
	public String getTransUpflag()
	{
		return this.transUpflag;
	}
	public void setWxOpenid(String wxOpenid)
	{
		this.wxOpenid = wxOpenid;
	}
	public String getWxOpenid()
	{
		return this.wxOpenid;
	}
	public void setWxGrant(String wxGrant)
	{
		this.wxGrant = wxGrant;
	}
	public String getWxGrant()
	{
		return this.wxGrant;
	}

	public String getCounterNo() {
		return counterNo;
	}

	public void setCounterNo(String counterNo) {
		this.counterNo = counterNo;
	}
}