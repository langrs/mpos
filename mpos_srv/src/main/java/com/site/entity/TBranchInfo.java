package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TBranchInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TBranchInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String branchNo;
	// 
	protected String branchName;
	// 
	protected String branchMan;
	// 
	protected String branchAddress;
	// 
	protected String branchZip;
	// 
	protected String branchEmail;
	// 
	protected String branchTel;
	// 
	protected String branchFax;
	// 
	protected String branchMemo;
	// 
	protected String IsSysFlag;
	// 
	protected Double updateFlow;
	// 
	protected String StoreType;
	// 
	protected String isInit;
	// 
	protected Date initDate;
	// 
	protected String isLogout;
	// 
	protected Date logoutDate;
	// 
	protected String serverIsConnect;
	// 
	protected String serverDomain;
	// 
	protected String serverPort;
	// 
	protected String serverPwd;
	// 
	protected String IsShareSave;
	// 
	protected String IsShareIntegral;
	// 
	protected String IsShareRet;
	// 
	protected String IsShareGive;
	// 
	protected String IsShareZero;
	// 
	protected String branchClass;
	// 
	protected String priceType;
	// 
	protected String IsShareLimit;
	// 
	protected String branchPwd;
	// 
	protected String serverUser;
	// 
	protected String priceMode;
	// 
	protected String zbSupSettle;
	// 
	protected String zbCustSettle;
	// 
	protected String zbPd;
	// 
	protected String IsNewItem;
	// 
	protected String IsNewSup;
	// 
	protected String IsNewCust;
	// 
	protected String dbGuid;
	// 
	protected String branchDb;
	// 
	protected String parentBranch;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected Date createDate;
	// 
	protected String createMan;
	// 
	protected Date modifyDate;
	// 
	protected String modifyMan;
	// 
	protected Double distDiscount;
	// 
	protected String salePriceType;
	// 
	protected String vipPriceType;
	// 
	protected String pfPriceType;
	// 
	protected String branchManage;
	// 
	protected String IsEditItem;
	// 
	protected String IsShareStamp;
	// 
	protected String IsOtherStock;
	// 
	protected String IsEditVip;
	// 
	protected String visaNo;
	// 
	protected String IsSeeInPrice;
	// 
	protected String dbPriceType;
	// 
	protected String dbPriceMode;
	// 
	protected String serverReg;
	// 
	protected String isDealCash;
	// 
	protected String vipShareType;
	// 
	protected String storeMode;
	// 
	protected String storeSheng;
	// 
	protected String storeShi;
	// 
	protected String storeXian;
	// 
	protected String storeGrantNo;
	// 
	protected String pyCode;
	// 
	protected String pdAllow;
	// 
	protected String transUpflag;
	// 
	protected String transVipFlow;
	// 
	protected String vipClassEdit;
	// 
	protected String branchIswx;
	// 
	protected String psSqApp;
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}
	public String getBranchName()
	{
		return this.branchName;
	}
	public void setBranchMan(String branchMan)
	{
		this.branchMan = branchMan;
	}
	public String getBranchMan()
	{
		return this.branchMan;
	}
	public void setBranchAddress(String branchAddress)
	{
		this.branchAddress = branchAddress;
	}
	public String getBranchAddress()
	{
		return this.branchAddress;
	}
	public void setBranchZip(String branchZip)
	{
		this.branchZip = branchZip;
	}
	public String getBranchZip()
	{
		return this.branchZip;
	}
	public void setBranchEmail(String branchEmail)
	{
		this.branchEmail = branchEmail;
	}
	public String getBranchEmail()
	{
		return this.branchEmail;
	}
	public void setBranchTel(String branchTel)
	{
		this.branchTel = branchTel;
	}
	public String getBranchTel()
	{
		return this.branchTel;
	}
	public void setBranchFax(String branchFax)
	{
		this.branchFax = branchFax;
	}
	public String getBranchFax()
	{
		return this.branchFax;
	}
	public void setBranchMemo(String branchMemo)
	{
		this.branchMemo = branchMemo;
	}
	public String getBranchMemo()
	{
		return this.branchMemo;
	}
	public void setIsSysFlag(String IsSysFlag)
	{
		this.IsSysFlag = IsSysFlag;
	}
	public String getIsSysFlag()
	{
		return this.IsSysFlag;
	}
	public void setUpdateFlow(Double updateFlow)
	{
		this.updateFlow = updateFlow;
	}
	public Double getUpdateFlow()
	{
		return this.updateFlow;
	}
	public void setStoreType(String StoreType)
	{
		this.StoreType = StoreType;
	}
	public String getStoreType()
	{
		return this.StoreType;
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
	public void setServerIsConnect(String serverIsConnect)
	{
		this.serverIsConnect = serverIsConnect;
	}
	public String getServerIsConnect()
	{
		return this.serverIsConnect;
	}
	public void setServerDomain(String serverDomain)
	{
		this.serverDomain = serverDomain;
	}
	public String getServerDomain()
	{
		return this.serverDomain;
	}
	public void setServerPort(String serverPort)
	{
		this.serverPort = serverPort;
	}
	public String getServerPort()
	{
		return this.serverPort;
	}
	public void setServerPwd(String serverPwd)
	{
		this.serverPwd = serverPwd;
	}
	public String getServerPwd()
	{
		return this.serverPwd;
	}
	public void setIsShareSave(String IsShareSave)
	{
		this.IsShareSave = IsShareSave;
	}
	public String getIsShareSave()
	{
		return this.IsShareSave;
	}
	public void setIsShareIntegral(String IsShareIntegral)
	{
		this.IsShareIntegral = IsShareIntegral;
	}
	public String getIsShareIntegral()
	{
		return this.IsShareIntegral;
	}
	public void setIsShareRet(String IsShareRet)
	{
		this.IsShareRet = IsShareRet;
	}
	public String getIsShareRet()
	{
		return this.IsShareRet;
	}
	public void setIsShareGive(String IsShareGive)
	{
		this.IsShareGive = IsShareGive;
	}
	public String getIsShareGive()
	{
		return this.IsShareGive;
	}
	public void setIsShareZero(String IsShareZero)
	{
		this.IsShareZero = IsShareZero;
	}
	public String getIsShareZero()
	{
		return this.IsShareZero;
	}
	public void setBranchClass(String branchClass)
	{
		this.branchClass = branchClass;
	}
	public String getBranchClass()
	{
		return this.branchClass;
	}
	public void setPriceType(String priceType)
	{
		this.priceType = priceType;
	}
	public String getPriceType()
	{
		return this.priceType;
	}
	public void setIsShareLimit(String IsShareLimit)
	{
		this.IsShareLimit = IsShareLimit;
	}
	public String getIsShareLimit()
	{
		return this.IsShareLimit;
	}
	public void setBranchPwd(String branchPwd)
	{
		this.branchPwd = branchPwd;
	}
	public String getBranchPwd()
	{
		return this.branchPwd;
	}
	public void setServerUser(String serverUser)
	{
		this.serverUser = serverUser;
	}
	public String getServerUser()
	{
		return this.serverUser;
	}
	public void setPriceMode(String priceMode)
	{
		this.priceMode = priceMode;
	}
	public String getPriceMode()
	{
		return this.priceMode;
	}
	public void setZbSupSettle(String zbSupSettle)
	{
		this.zbSupSettle = zbSupSettle;
	}
	public String getZbSupSettle()
	{
		return this.zbSupSettle;
	}
	public void setZbCustSettle(String zbCustSettle)
	{
		this.zbCustSettle = zbCustSettle;
	}
	public String getZbCustSettle()
	{
		return this.zbCustSettle;
	}
	public void setZbPd(String zbPd)
	{
		this.zbPd = zbPd;
	}
	public String getZbPd()
	{
		return this.zbPd;
	}
	public void setIsNewItem(String IsNewItem)
	{
		this.IsNewItem = IsNewItem;
	}
	public String getIsNewItem()
	{
		return this.IsNewItem;
	}
	public void setIsNewSup(String IsNewSup)
	{
		this.IsNewSup = IsNewSup;
	}
	public String getIsNewSup()
	{
		return this.IsNewSup;
	}
	public void setIsNewCust(String IsNewCust)
	{
		this.IsNewCust = IsNewCust;
	}
	public String getIsNewCust()
	{
		return this.IsNewCust;
	}
	public void setDbGuid(String dbGuid)
	{
		this.dbGuid = dbGuid;
	}
	public String getDbGuid()
	{
		return this.dbGuid;
	}
	public void setBranchDb(String branchDb)
	{
		this.branchDb = branchDb;
	}
	public String getBranchDb()
	{
		return this.branchDb;
	}
	public void setParentBranch(String parentBranch)
	{
		this.parentBranch = parentBranch;
	}
	public String getParentBranch()
	{
		return this.parentBranch;
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
	public void setDistDiscount(Double distDiscount)
	{
		this.distDiscount = distDiscount;
	}
	public Double getDistDiscount()
	{
		return this.distDiscount;
	}
	public void setSalePriceType(String salePriceType)
	{
		this.salePriceType = salePriceType;
	}
	public String getSalePriceType()
	{
		return this.salePriceType;
	}
	public void setVipPriceType(String vipPriceType)
	{
		this.vipPriceType = vipPriceType;
	}
	public String getVipPriceType()
	{
		return this.vipPriceType;
	}
	public void setPfPriceType(String pfPriceType)
	{
		this.pfPriceType = pfPriceType;
	}
	public String getPfPriceType()
	{
		return this.pfPriceType;
	}
	public void setBranchManage(String branchManage)
	{
		this.branchManage = branchManage;
	}
	public String getBranchManage()
	{
		return this.branchManage;
	}
	public void setIsEditItem(String IsEditItem)
	{
		this.IsEditItem = IsEditItem;
	}
	public String getIsEditItem()
	{
		return this.IsEditItem;
	}
	public void setIsShareStamp(String IsShareStamp)
	{
		this.IsShareStamp = IsShareStamp;
	}
	public String getIsShareStamp()
	{
		return this.IsShareStamp;
	}
	public void setIsOtherStock(String IsOtherStock)
	{
		this.IsOtherStock = IsOtherStock;
	}
	public String getIsOtherStock()
	{
		return this.IsOtherStock;
	}
	public void setIsEditVip(String IsEditVip)
	{
		this.IsEditVip = IsEditVip;
	}
	public String getIsEditVip()
	{
		return this.IsEditVip;
	}
	public void setVisaNo(String visaNo)
	{
		this.visaNo = visaNo;
	}
	public String getVisaNo()
	{
		return this.visaNo;
	}
	public void setIsSeeInPrice(String IsSeeInPrice)
	{
		this.IsSeeInPrice = IsSeeInPrice;
	}
	public String getIsSeeInPrice()
	{
		return this.IsSeeInPrice;
	}
	public void setDbPriceType(String dbPriceType)
	{
		this.dbPriceType = dbPriceType;
	}
	public String getDbPriceType()
	{
		return this.dbPriceType;
	}
	public void setDbPriceMode(String dbPriceMode)
	{
		this.dbPriceMode = dbPriceMode;
	}
	public String getDbPriceMode()
	{
		return this.dbPriceMode;
	}
	public void setServerReg(String serverReg)
	{
		this.serverReg = serverReg;
	}
	public String getServerReg()
	{
		return this.serverReg;
	}
	public void setIsDealCash(String isDealCash)
	{
		this.isDealCash = isDealCash;
	}
	public String getIsDealCash()
	{
		return this.isDealCash;
	}
	public void setVipShareType(String vipShareType)
	{
		this.vipShareType = vipShareType;
	}
	public String getVipShareType()
	{
		return this.vipShareType;
	}
	public void setStoreMode(String storeMode)
	{
		this.storeMode = storeMode;
	}
	public String getStoreMode()
	{
		return this.storeMode;
	}
	public void setStoreSheng(String storeSheng)
	{
		this.storeSheng = storeSheng;
	}
	public String getStoreSheng()
	{
		return this.storeSheng;
	}
	public void setStoreShi(String storeShi)
	{
		this.storeShi = storeShi;
	}
	public String getStoreShi()
	{
		return this.storeShi;
	}
	public void setStoreXian(String storeXian)
	{
		this.storeXian = storeXian;
	}
	public String getStoreXian()
	{
		return this.storeXian;
	}
	public void setStoreGrantNo(String storeGrantNo)
	{
		this.storeGrantNo = storeGrantNo;
	}
	public String getStoreGrantNo()
	{
		return this.storeGrantNo;
	}
	public void setPyCode(String pyCode)
	{
		this.pyCode = pyCode;
	}
	public String getPyCode()
	{
		return this.pyCode;
	}
	public void setPdAllow(String pdAllow)
	{
		this.pdAllow = pdAllow;
	}
	public String getPdAllow()
	{
		return this.pdAllow;
	}
	public void setTransUpflag(String transUpflag)
	{
		this.transUpflag = transUpflag;
	}
	public String getTransUpflag()
	{
		return this.transUpflag;
	}
	public void setTransVipFlow(String transVipFlow)
	{
		this.transVipFlow = transVipFlow;
	}
	public String getTransVipFlow()
	{
		return this.transVipFlow;
	}
	public void setVipClassEdit(String vipClassEdit)
	{
		this.vipClassEdit = vipClassEdit;
	}
	public String getVipClassEdit()
	{
		return this.vipClassEdit;
	}
	public void setBranchIswx(String branchIswx)
	{
		this.branchIswx = branchIswx;
	}
	public String getBranchIswx()
	{
		return this.branchIswx;
	}
	public void setPsSqApp(String psSqApp)
	{
		this.psSqApp = psSqApp;
	}
	public String getPsSqApp()
	{
		return this.psSqApp;
	}
}  