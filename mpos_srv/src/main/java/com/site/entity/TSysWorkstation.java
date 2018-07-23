package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TSysWorkstation Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TSysWorkstation implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String jh;
	// 
	protected String loginPos;
	// 
	protected String loginHt;
	// 
	protected String isBlls;
	// 
	protected String computer;
	// 
	protected String other;
	// 
	protected String computerMac;
	// 
	protected String branchNo;
	// 
	protected String isInit;
	// 
	protected Date initDate;
	// 
	protected String regCode;
	// 
	protected String isLogout;
	// 
	protected Date logoutDate;
	// 
	protected String keyNo;
	// 
	protected String snNo;
	// 
	protected String isRaid;
	//
	protected String counterNo;
	//
	protected String type;

	public void setJh(String jh)
	{
		this.jh = jh;
	}
	public String getJh()
	{
		return this.jh;
	}
	public void setLoginPos(String loginPos)
	{
		this.loginPos = loginPos;
	}
	public String getLoginPos()
	{
		return this.loginPos;
	}
	public void setLoginHt(String loginHt)
	{
		this.loginHt = loginHt;
	}
	public String getLoginHt()
	{
		return this.loginHt;
	}
	public void setIsBlls(String isBlls)
	{
		this.isBlls = isBlls;
	}
	public String getIsBlls()
	{
		return this.isBlls;
	}
	public void setComputer(String computer)
	{
		this.computer = computer;
	}
	public String getComputer()
	{
		return this.computer;
	}
	public void setOther(String other)
	{
		this.other = other;
	}
	public String getOther()
	{
		return this.other;
	}
	public void setComputerMac(String computerMac)
	{
		this.computerMac = computerMac;
	}
	public String getComputerMac()
	{
		return this.computerMac;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setIsInit(String isInit)
	{
		this.isInit = isInit;
	}
	public String getIsInit()
	{
		return this.isInit;
	}
	public void setInitDate(Date initDate)
	{
		this.initDate = initDate;
	}
	public Date getInitDate()
	{
		return this.initDate;
	}
	public void setRegCode(String regCode)
	{
		this.regCode = regCode;
	}
	public String getRegCode()
	{
		return this.regCode;
	}
	public void setIsLogout(String isLogout)
	{
		this.isLogout = isLogout;
	}
	public String getIsLogout()
	{
		return this.isLogout;
	}
	public void setLogoutDate(Date logoutDate)
	{
		this.logoutDate = logoutDate;
	}
	public Date getLogoutDate()
	{
		return this.logoutDate;
	}
	public void setKeyNo(String keyNo)
	{
		this.keyNo = keyNo;
	}
	public String getKeyNo()
	{
		return this.keyNo;
	}
	public void setSnNo(String snNo)
	{
		this.snNo = snNo;
	}
	public String getSnNo()
	{
		return this.snNo;
	}
	public void setIsRaid(String isRaid)
	{
		this.isRaid = isRaid;
	}
	public String getIsRaid()
	{
		return this.isRaid;
	}

	public String getCounterNo() {
		return counterNo;
	}

	public void setCounterNo(String counterNo) {
		this.counterNo = counterNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}