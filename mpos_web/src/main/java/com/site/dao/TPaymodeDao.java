package com.site.dao;

import com.site.core.mybatis.Dao;
import com.site.entity.TPaymode;

import java.util.List;

/**
 * User Dao 层
 * 
 * @author site
 * 
 */

public interface TPaymodeDao extends Dao<Long, TPaymode> {
    //获取用户支付方式
    List<TPaymode> queryRight(String userNo);
}