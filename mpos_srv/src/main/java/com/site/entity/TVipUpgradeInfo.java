package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipUpgradeInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipUpgradeInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String viptypeNo;
	// 
	protected String tViptypeNo;
	// 
	protected Double upgradeIntegral;
	// 
	protected Double upgradeSpareAmt;
	// 
	protected Double upgradeSaleAmt;
	// 
	protected Double upgradeSubIntegral;
	// 
	protected String upgradeMemo;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	// 
	protected Date createDate;
	// 
	protected String createMan;
	// 
	protected Date modifyDate;
	// 
	protected String modifyMan;
	public void setViptypeNo(String viptypeNo)
	{
		this.viptypeNo = viptypeNo;
	}
	public String getViptypeNo()
	{
		return this.viptypeNo;
	}
	public void setTViptypeNo(String tViptypeNo)
	{
		this.tViptypeNo = tViptypeNo;
	}
	public String getTViptypeNo()
	{
		return this.tViptypeNo;
	}
	public void setUpgradeIntegral(Double upgradeIntegral)
	{
		this.upgradeIntegral = upgradeIntegral;
	}
	public Double getUpgradeIntegral()
	{
		return this.upgradeIntegral;
	}
	public void setUpgradeSpareAmt(Double upgradeSpareAmt)
	{
		this.upgradeSpareAmt = upgradeSpareAmt;
	}
	public Double getUpgradeSpareAmt()
	{
		return this.upgradeSpareAmt;
	}
	public void setUpgradeSaleAmt(Double upgradeSaleAmt)
	{
		this.upgradeSaleAmt = upgradeSaleAmt;
	}
	public Double getUpgradeSaleAmt()
	{
		return this.upgradeSaleAmt;
	}
	public void setUpgradeSubIntegral(Double upgradeSubIntegral)
	{
		this.upgradeSubIntegral = upgradeSubIntegral;
	}
	public Double getUpgradeSubIntegral()
	{
		return this.upgradeSubIntegral;
	}
	public void setUpgradeMemo(String upgradeMemo)
	{
		this.upgradeMemo = upgradeMemo;
	}
	public String getUpgradeMemo()
	{
		return this.upgradeMemo;
	}
	public void setUpdateFlow(Double updateFlow)
	{
		this.updateFlow = updateFlow;
	}
	public Double getUpdateFlow()
	{
		return this.updateFlow;
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
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	public Date getCreateDate()
	{
		return this.createDate;
	}
	public void setCreateMan(String createMan)
	{
		this.createMan = createMan;
	}
	public String getCreateMan()
	{
		return this.createMan;
	}
	public void setModifyDate(Date modifyDate)
	{
		this.modifyDate = modifyDate;
	}
	public Date getModifyDate()
	{
		return this.modifyDate;
	}
	public void setModifyMan(String modifyMan)
	{
		this.modifyMan = modifyMan;
	}
	public String getModifyMan()
	{
		return this.modifyMan;
	}
}  