package com.site.entity;  
  
import java.util.Date;  
import com.site.core.base.AbstractModel;
import com.site.entity.TShop;
 /**
 * 对象功能:TPos Entity对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public class TPos extends AbstractModel<String>
{
	private static final long serialVersionUID = 1L;
	// ID
	protected String id;
	// 终端编码
	protected String posNo;
	// 终端名称
	protected String name;
	// 收单机构
	protected String bank;
	// MAC地址
	protected String mac;
	// IP地址
	protected String ipAddr;
	// 服务器ID
	protected String serverAddr;
	// 分店ID
	protected String shopId;
	// 终端类型
	protected String posType;
	// 终端属性
	protected String posAttr;
	// 终端状态
	protected String state;
	// 创建人
	protected String createBy;
	// 创建日期
	protected Date createTime;
	// 最后修改人
	protected String updateBy;
	// 最后修改日期
	protected Date updateTime;
	// 是否有效
	protected String isFlag;
	// 分店IDObj
	protected TShop shopIdObj;
	
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}
	public void setPosNo(String posNo)
	{
		this.posNo = posNo;
	}
	public String getPosNo()
	{
		return this.posNo;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setBank(String bank)
	{
		this.bank = bank;
	}
	public String getBank()
	{
		return this.bank;
	}
	public void setMac(String mac)
	{
		this.mac = mac;
	}
	public String getMac()
	{
		return this.mac;
	}
	public void setIpAddr(String ipAddr)
	{
		this.ipAddr = ipAddr;
	}
	public String getIpAddr()
	{
		return this.ipAddr;
	}
	public void setServerAddr(String serverAddr)
	{
		this.serverAddr = serverAddr;
	}
	public String getServerAddr()
	{
		return this.serverAddr;
	}
	public void setShopId(String shopId)
	{
		this.shopId = shopId;
	}
	public String getShopId()
	{
		return this.shopId;
	}
	public void setShopIdObj(TShop shopIdObj)
	{
		this.shopIdObj = shopIdObj;
	}
	public TShop getShopIdObj()
	{
		return this.shopIdObj;
	}	
	public void setPosType(String posType)
	{
		this.posType = posType;
	}
	public String getPosType()
	{
		return this.posType;
	}
	public void setPosAttr(String posAttr)
	{
		this.posAttr = posAttr;
	}
	public String getPosAttr()
	{
		return this.posAttr;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return this.state;
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
}  