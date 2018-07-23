package com.site.core.base;

import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryFilter;
import com.site.core.mybatis.QueryMap;

import java.io.Serializable;
import java.util.List;

/**
 * 抽象实体业务管理类实现
 * 
 * @author site
 * 
 * @param <PK>
 * @param <T>
 */
public abstract class AbstractManagerImpl<PK extends Serializable, T extends Serializable> implements Manager<PK, T> {
	// 获取基础类

	protected abstract Dao<PK, T> getDao();
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.site.base.manager.api.Manager#create(java.lang.Object)
	 */
	public void create(T entity) {
		getDao().create(entity);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.site.base.manager.api.Manager#update(java.lang.Object)
	 */
	public void update(T entity) {
		getDao().update(entity);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.site.base.manager.api.Manager#remove(java.io.Serializable)
	 */
	public void remove(PK entityId) {
		getDao().remove(entityId);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.site.base.manager.api.Manager#get(java.io.Serializable)
	 */
	public T get(PK entityId) {
		return getDao().get(entityId);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.site.base.manager.api.Manager#removeByIds(PK[])
	 */
	public void removeByIds(PK... ids) {
		if (ids != null) {
			for (PK pk : ids) {
				remove(pk);
			}
		}
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.site.base.manager.api.Manager#query(com.site.base.api.query.
	 * QueryFilter)
	 */
	public List<T> query(QueryFilter queryFilter) {
		return getDao().query(queryFilter);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.site.base.manager.api.Manager#getAll()
	 */
	public List<T> getAll() {
		return getDao().getAll();
	}
	@Override
	public T getOne(QueryMap map) {

		return getDao().getOne(map);
	}
	@Override
	public List<T> getList(QueryMap map) {
		return getDao().getList(map);
	}
	@Override
	public List<T> search(QueryMap map) {
		return getDao().search(map);
	}
}
