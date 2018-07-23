package com.site.core.mybatis;

import com.site.core.page.Page;

import java.util.List;
import java.util.Map;

/**
 * 描述：组合条件查询过滤
 * @author site
 *
 */
public interface QueryFilter {
	/**
	 * 返回分页信息
	 * @return
	 */
	public Page getPage();
	/**
	 * 返回字段组合查询逻辑
	 * @return
	 */
	public FieldLogic getFieldLogic();

	/**
	 * 返回组合的参数映射
	 * @return
	 */
	public Map<String,Object> getParams();
	
	/**
	 * 返回字段排序列表
	 * @return
	 */
	public List<FieldSort> getFieldSortList();

}
