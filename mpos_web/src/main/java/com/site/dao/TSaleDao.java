package com.site.dao;

import com.site.core.mybatis.Dao;
import com.site.core.mybatis.QueryMap;
import com.site.entity.TSale;

import java.util.List;

/**
 * User Dao 层
 * 
 * @author site
 * 
 */

public interface TSaleDao extends Dao<Long, TSale> {
    List<TSale> querySaleByTime(QueryMap map);
}