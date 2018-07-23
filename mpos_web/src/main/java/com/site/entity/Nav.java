package com.site.entity;

import java.util.List;

import com.site.core.base.AbstractModel;
/**
 * 对象功能:Nav Model对象 开发公司:site 开发人员:huj
 */
public class Nav extends AbstractModel<Long> {

	private static final long serialVersionUID = 1L;
	/**
	 * id_
	 */
	protected Long id;
	/**
	 * 名称
	 */
	protected String name;
	/**
	 * 上级菜单
	 */
	protected Long parent;
	/**
	 * 连接地址
	 */
	protected String url;
	/**
	 * 子节点
	 * 
	 */
	protected List<Nav> chirldList;
	/**
	 * 资源列表
	 * 
	 */
	protected List<AuthRes> authResList;
	/**
	 * 是否选中
	 * 
	 */
	protected int isCheck;

	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public List<AuthRes> getAuthResList() {
		return authResList;
	}
	public void setAuthResList(List<AuthRes> authResList) {
		this.authResList = authResList;
	}
	public List<Nav> getChirldList() {
		return chirldList;
	}
	public void setChirldList(List<Nav> chirldList) {
		this.chirldList = chirldList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setParent(Long parent) {
		this.parent = parent;
	}
	public Long getParent() {
		return this.parent;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return this.url;
	}
}