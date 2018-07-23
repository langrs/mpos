package com.site.dao;  
  
import com.site.core.mybatis.Dao;
import com.site.entity.TCzcardInfo;
/**
 * 对象功能:TCzcardInfo Dao 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
 
public interface TCzcardInfoDao extends Dao<Long, TCzcardInfo> 
{
	void updateValue(TCzcardInfo tCzcardInfo);
}
