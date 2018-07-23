package com.site.core.mybatis;

/**
 * 构建SQL语句中的Where条件组件的SQL片段
 * @author site
 */
public interface WhereClause {
    /**
     * 返回SQL片段
     */
    public String getSql();
}
