package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TGiftcouponDDao;
import com.site.entity.TGiftcouponD;
import com.site.service.TGiftcouponDService;

/**
 * 对象功能:TGiftcouponD Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("TGiftcouponDService")
public class TGiftcouponDServiceImpl extends AbstractManagerImpl<Long, TGiftcouponD> implements TGiftcouponDService
{
	@Resource
	TGiftcouponDDao dao;

	@Override
	protected Dao<Long, TGiftcouponD> getDao() {
		return dao;
	}
}
