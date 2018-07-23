package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TGiftcouponDao;
import com.site.entity.TGiftcoupon;
import com.site.service.TGiftcouponService;

/**
 * 对象功能:TGiftcoupon Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("TGiftcouponService")
public class TGiftcouponServiceImpl extends AbstractManagerImpl<Long, TGiftcoupon> implements TGiftcouponService
{
	@Resource
	TGiftcouponDao dao;

	@Override
	protected Dao<Long, TGiftcoupon> getDao() {
		return dao;
	}
}
