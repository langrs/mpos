package com.site.dao;

import com.site.core.mybatis.Dao;
import com.site.entity.THycardInfo;

import java.util.List;

/**
 * 对象功能:THycardInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public interface THycardInfoDao extends Dao<Long, THycardInfo> 
{
	List<THycardInfo> queryByBillNo(String billNo);
}
