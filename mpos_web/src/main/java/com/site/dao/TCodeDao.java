package com.site.dao;

import com.site.core.mybatis.Dao;
import com.site.entity.TCode;

import java.util.List;

/**
 * User Dao 层
 * 
 * @author site
 * 
 */

public interface TCodeDao extends Dao<Long, TCode> {
    //传入codtype项目,如果多个codetype,则通过逗号隔开
    public List<TCode> queryByCodeType(List<String> codeType);
}