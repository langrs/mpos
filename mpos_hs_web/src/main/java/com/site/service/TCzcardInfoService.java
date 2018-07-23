package com.site.service;

import com.site.core.base.Manager;
import com.site.entity.TCzcardInfo;
import com.site.entity.TCzcardInfoD;

/**
 * 对象功能:TCzcardInfo Service 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public interface TCzcardInfoService extends Manager<Long, TCzcardInfo>
{
	void updateValue(TCzcardInfo tCzcardInfo, TCzcardInfoD tCzcardInfoD);
}
