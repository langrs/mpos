package com.site.entity;  
  
import java.util.Date;  
import java.io.Serializable;
 /**
 * FUNCTION:TPosStampInfo Entity
 * COMPANY:SZUNIC
 * AUTHOR:LZM
 */
 
public class TPosStampInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	// 
	protected String stampNo;
	// 
	protected String StampTypeNo;
	// 
	protected String vipNo;
	// 
	protected Double stampAmt;
	// 
	protected String stampStatus;
	// 
	protected Date stampStartDate;
	// 
	protected Date stampEndDate;
	// 
	protected String stampIssueType;
	// 
	protected Date stampIssueDate;
	// 
	protected String stampIssueMan;
	// 
	protected String stampIssueSheet;
	// 
	protected String stampUseSheet;
	// 
	protected Date stampUseDate;
	// 
	protected String stampMemo;
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
	protected Date updateTime;
	// 
	protected String updateBranch;
	// 
	protected String branchNo;
	// 
	protected String transUpflag;
	public void setStampNo(String stampNo)
	{
		this.stampNo = stampNo;
	}
	public String getStampNo()
	{
		return this.stampNo;
	}
	public void setStampTypeNo(String StampTypeNo)
	{
		this.StampTypeNo = StampTypeNo;
	}
	public String getStampTypeNo()
	{
		return this.StampTypeNo;
	}
	public void setVipNo(String vipNo)
	{
		this.vipNo = vipNo;
	}
	public String getVipNo()
	{
		return this.vipNo;
	}
	public void setStampAmt(Double stampAmt)
	{
		this.stampAmt = stampAmt;
	}
	public Double getStampAmt()
	{
		return this.stampAmt;
	}
	public void setStampStatus(String stampStatus)
	{
		this.stampStatus = stampStatus;
	}
	public String getStampStatus()
	{
		return this.stampStatus;
	}
	public void setStampStartDate(Date stampStartDate)
	{
		this.stampStartDate = stampStartDate;
	}
	public Date getStampStartDate()
	{
		return this.stampStartDate;
	}
	public void setStampEndDate(Date stampEndDate)
	{
		this.stampEndDate = stampEndDate;
	}
	public Date getStampEndDate()
	{
		return this.stampEndDate;
	}
	public void setStampIssueType(String stampIssueType)
	{
		this.stampIssueType = stampIssueType;
	}
	public String getStampIssueType()
	{
		return this.stampIssueType;
	}
	public void setStampIssueDate(Date stampIssueDate)
	{
		this.stampIssueDate = stampIssueDate;
	}
	public Date getStampIssueDate()
	{
		return this.stampIssueDate;
	}
	public void setStampIssueMan(String stampIssueMan)
	{
		this.stampIssueMan = stampIssueMan;
	}
	public String getStampIssueMan()
	{
		return this.stampIssueMan;
	}
	public void setStampIssueSheet(String stampIssueSheet)
	{
		this.stampIssueSheet = stampIssueSheet;
	}
	public String getStampIssueSheet()
	{
		return this.stampIssueSheet;
	}
	public void setStampUseSheet(String stampUseSheet)
	{
		this.stampUseSheet = stampUseSheet;
	}
	public String getStampUseSheet()
	{
		return this.stampUseSheet;
	}
	public void setStampUseDate(Date stampUseDate)
	{
		this.stampUseDate = stampUseDate;
	}
	public Date getStampUseDate()
	{
		return this.stampUseDate;
	}
	public void setStampMemo(String stampMemo)
	{
		this.stampMemo = stampMemo;
	}
	public String getStampMemo()
	{
		return this.stampMemo;
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
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchNo()
	{
		return this.branchNo;
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