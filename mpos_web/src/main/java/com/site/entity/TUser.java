package com.site.entity;
    import java.util.Date;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:TUser Model对象
 * 开发公司:site
 * 开发人员:huj
 */
public class TUser extends AbstractModel<String>
{

	private static final long serialVersionUID = 1L;
        /**
        *ID
        */
	protected String id;
        /**
        *用户编码
        */
	protected String userNo;
        /**
        *用户名称
        */
	protected String name;
        /**
        *分店
        */
	protected String shopId;
        /**
        *商铺ID
        */
	protected String storeId;
        /**
        *登录密码
        */
	protected String passwd;
        /**
        *部门
        */
	protected String deptId;
        /**
        *收银员类别
        */
	protected String userType;
        /**
        *证件号码
        */
	protected String idCard;
        /**
        *联系电话
        */
	protected String mobile;
        /**
        *性别
        */
	protected String sex;
        /**
        *状态
        */
	protected String state;
        /**
        *是否修改密码
        */
	protected String isChangepw;
        /**
        *权限级别
        */
	protected String rightLevel;
        /**
        *创建人
        */
	protected String createBy;
        /**
        *创建日期
        */
	protected Date createTime;
        /**
        *最后修改人
        */
	protected String updateBy;
        /**
        *最后修改日期
        */
	protected Date updateTime;
        /**
        *是否有效
        */
	protected String isFlag;
	/**
        * storeIdObj
        */
	protected TStore storeIdObj;
	/**
        * shopIdObj
        */
	protected TShop shopIdObj;
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getId() 
	{
		return this.id;
	}
	public void setUserNo(String userNo) 
	{
		this.userNo = userNo;
	}
	public String getUserNo() 
	{
		return this.userNo;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setShopId(String shopId) 
	{
		this.shopId = shopId;
	}
	public String getShopId() 
	{
		return this.shopId;
	}
	public void setStoreId(String storeId) 
	{
		this.storeId = storeId;
	}
	public String getStoreId() 
	{
		return this.storeId;
	}
	public void setPasswd(String passwd) 
	{
		this.passwd = passwd;
	}
	public String getPasswd() 
	{
		return this.passwd;
	}
	public void setDeptId(String deptId) 
	{
		this.deptId = deptId;
	}
	public String getDeptId() 
	{
		return this.deptId;
	}
	public void setUserType(String userType) 
	{
		this.userType = userType;
	}
	public String getUserType() 
	{
		return this.userType;
	}
	public void setIdCard(String idCard) 
	{
		this.idCard = idCard;
	}
	public String getIdCard() 
	{
		return this.idCard;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	public String getMobile() 
	{
		return this.mobile;
	}
	public void setSex(String sex) 
	{
		this.sex = sex;
	}
	public String getSex() 
	{
		return this.sex;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getState() 
	{
		return this.state;
	}
	public void setIsChangepw(String isChangepw) 
	{
		this.isChangepw = isChangepw;
	}
	public String getIsChangepw() 
	{
		return this.isChangepw;
	}
	public void setRightLevel(String rightLevel) 
	{
		this.rightLevel = rightLevel;
	}
	public String getRightLevel() 
	{
		return this.rightLevel;
	}
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}
	public String getCreateBy() 
	{
		return this.createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}
	public Date getCreateTime() 
	{
		return this.createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}
	public String getUpdateBy() 
	{
		return this.updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}
	public Date getUpdateTime() 
	{
		return this.updateTime;
	}
	public void setIsFlag(String isFlag) 
	{
		this.isFlag = isFlag;
	}
	public String getIsFlag() 
	{
		return this.isFlag;
	}
	public void setStoreIdObj(TStore storeIdObj) 
	{
		this.storeIdObj = storeIdObj;
	}
	public TStore getStoreIdObj() 
	{
		return this.storeIdObj;
	}
	public void setShopIdObj(TShop shopIdObj) 
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj() 
	{
		return this.shopIdObj;
	}

}