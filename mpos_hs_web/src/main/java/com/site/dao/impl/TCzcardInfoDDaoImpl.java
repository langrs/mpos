package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TCzcardInfoDDao;
import com.site.entity.TCzcardInfoD;

/**
 * 对象功能:TCzcardInfoD Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class TCzcardInfoDDaoImpl extends MyBatisDaoImpl<Long, TCzcardInfoD> implements TCzcardInfoDDao
{
	@Override
	public String getNamespace() {
		return TCzcardInfoD.class.getName();
	}
}
