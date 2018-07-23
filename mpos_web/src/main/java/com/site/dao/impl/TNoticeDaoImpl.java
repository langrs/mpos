package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TNoticeDao;
import com.site.entity.TNotice;

/**
 * 对象功能:TNotice Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class TNoticeDaoImpl extends MyBatisDaoImpl<Long, TNotice> implements TNoticeDao
{
	@Override
	public String getNamespace() {
		return TNotice.class.getName();
	}
}
