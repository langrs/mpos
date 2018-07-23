package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TGiftcouponDDao;
import com.site.entity.TGiftcouponD;

/**
 * 对象功能:TGiftcouponD Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class TGiftcouponDDaoImpl extends MyBatisDaoImpl<Long, TGiftcouponD> implements TGiftcouponDDao
{
	@Override
	public String getNamespace() {
		return TGiftcouponD.class.getName();
	}
}
