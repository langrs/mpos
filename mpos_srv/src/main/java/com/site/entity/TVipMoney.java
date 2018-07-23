package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TVipMoney Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TVipMoney implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String vipNo;
	// 
	protected String branchNo;
	// 
	protected String moneyType;
	// 
	protected Double vipSort;
	// 
	protected Double valueAmt;
	// 
	protected Double useAmt;
	// 
	protected String ctrlValid;
	// 
	protected Date validSdate;
	// 
	protected Date validEdate;
	// 
	protected String fromBranch;
	// 
	protected String voucherNo;
	// 
	protected String memo;
	// 
	protected String createUser;
	// 
	protected Date createDate;
	// 
	protected Double updateFlow;
	// 
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String transUpflag;
	public void setVipNo(String vipNo)
	{
		this.vipNo = vipNo;
	}
	public String getVipNo()
	{
		return this.vipNo;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
	}
	public void setMoneyType(String moneyType)
	{
		this.moneyType = moneyType;
	}
	public String getMoneyType()
	{
		return this.moneyType;
	}
	public void setVipSort(Double vipSort)
	{
		this.vipSort = vipSort;
	}
	public Double getVipSort()
	{
		return this.vipSort;
	}
	public void setValueAmt(Double valueAmt)
	{
		this.valueAmt = valueAmt;
	}
	public Double getValueAmt()
	{
		return this.valueAmt;
	}
	public void setUseAmt(Double useAmt)
	{
		this.useAmt = useAmt;
	}
	public Double getUseAmt()
	{
		return this.useAmt;
	}
	public void setCtrlValid(String ctrlValid)
	{
		this.ctrlValid = ctrlValid;
	}
	public String getCtrlValid()
	{
		return this.ctrlValid;
	}
	public void setValidSdate(Date validSdate)
	{
		this.validSdate = validSdate;
	}
	public Date getValidSdate()
	{
		return this.validSdate;
	}
	public void setValidEdate(Date validEdate)
	{
		this.validEdate = validEdate;
	}
	public Date getValidEdate()
	{
		return this.validEdate;
	}
	public void setFromBranch(String fromBranch)
	{
		this.fromBranch = fromBranch;
	}
	public String getFromBranch()
	{
		return this.fromBranch;
	}
	public void setVoucherNo(String voucherNo)
	{
		this.voucherNo = voucherNo;
	}
	public String getVoucherNo()
	{
		return this.voucherNo;
	}
	public void setMemo(String memo)
	{
		this.memo = memo;
	}
	public String getMemo()
	{
		return this.memo;
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
}  