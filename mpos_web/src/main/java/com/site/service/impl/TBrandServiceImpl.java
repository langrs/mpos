package com.site.service.impl;  
  
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TBrandDao;
import com.site.entity.TBrand;
import com.site.service.TBrandService;

/**
 * 对象功能:TBrand Service Impl 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Service("TBrandService")
public class TBrandServiceImpl extends AbstractManagerImpl<Long, TBrand> implements TBrandService
{
	@Resource
	TBrandDao dao;

	@Override
	protected Dao<Long, TBrand> getDao() {
		return dao;
	}
}
