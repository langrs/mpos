package com.site.core.base;

import java.util.Date;

/**
 * 描述：实体的基础类
 * @author site
 *
 * @param <T>
 */
@SuppressWarnings("serial")
public abstract class AbstractModel<T> implements BaseModel {
	// 创建人
	protected String createBy;
	// 更新人
	protected String updateBy;
	// 创建时间
	protected Date createTime;
	// 创建日期
	protected Date createDate;
	// 更新时间
	protected Date updateTime;
	// 创建人组织ID
	protected String createOrgId;
	// 弹窗标志
	protected String dialog;

	public String getDialog() {
		return dialog;
	}

	public void setDialog(String dialog) {
		this.dialog = dialog;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateOrgId() {
		return createOrgId;
	}

	public void setCreateOrgId(String createOrgId) {
		this.createOrgId = createOrgId;
	}

	/**
	 * 设置主键ID
	 * 
	 * @param id
	 */
	public abstract void setId(T id);

	/**
	 * 获取主键ID
	 * 
	 * @return
	 */
	public abstract T getId();

}
