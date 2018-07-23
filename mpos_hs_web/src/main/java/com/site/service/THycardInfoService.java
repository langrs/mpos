package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.THycardInfo;

import java.util.List;

/**
 * 对象功能:THycardInfo Service 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public interface THycardInfoService extends Manager<Long, THycardInfo>
{
    List<THycardInfo> queryByBillNo(String billNo);
}
