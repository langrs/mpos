package com.site.core.mybatis;

import java.util.List;

/**
 * 字段条件组合查询
 * 
 * @author site
 * 
 */
public interface FieldLogic extends WhereClause {
	public List<WhereClause> getWhereClauses();
}
