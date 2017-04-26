package com.site.base;

import com.site.entity.QueryMap;

import java.io.Serializable;
import java.util.List;

/**
 * 数据库访问基础类
 * @author site
 */
public interface Dao<PK extends Serializable,T> {
    /**
     * 创建实体对象
     * @param entity
     * @return 
     */
    public void create(T entity);
    /**
     * 更新实体对象
     * @param entity
     * @return 
     */
    public void update(T entity);
    /**
     * 按实体ID删除对象
     * @param entityId 
     */
    public void remove(PK entityId);    
    
    /**
     * 按实体ID获取实体
     * @param entityId 
     */
    public T get(PK entityId);    
//    /**
//     * 按实体业务主键获取实体
//     * @param entityKey 
//     */
//    public T getByEntityKey(String entityKey);
    /**
     * 按实体IDs删除记录
     * @param ids 
     */
    public void removeByIds(PK... ids);
    /**
     * 查询实体对象
     * @param queryFilter
     * @return 
     */
//    public List<T> query(QueryFilter queryFilter);
    
    /**
     * 取得所有查询对象
     * @return 
     */
    public List<T> getAll();
    /**
	 * 根据条件获得单个对象
	 * 
	 * @param map
	 * @return
	 */
	public T getOne(QueryMap map);
	/**
	 * 根据条件获得对象列表,使用的条件都是精确查询
	 * 
	 * @param map
	 * @return
	 */
	public List<T> getList(QueryMap map);
	/**
	 * 根据条件搜索对象列表,如果条件为字符串，默认使用like来匹配
	 * @param map
	 * @return
	 */
	public List<T> search(QueryMap map);
}
