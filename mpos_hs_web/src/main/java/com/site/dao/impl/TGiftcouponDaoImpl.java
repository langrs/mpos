package com.site.dao.impl;  
  
import org.springframework.stereotype.Repository;
import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TGiftcouponDao;
import com.site.entity.TGiftcoupon;

/**
 * 对象功能:TGiftcoupon Dao Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Repository
public class TGiftcouponDaoImpl extends MyBatisDaoImpl<Long, TGiftcoupon> implements TGiftcouponDao
{
	@Override
	public String getNamespace() {
		return TGiftcoupon.class.getName();
	}
}
