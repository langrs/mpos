package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TPosDao;
import com.site.dao.TStorePosDao;
import com.site.entity.TPos;
import com.site.entity.TStore;
import com.site.entity.TStorePos;
import com.site.service.TPosService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TPos Service Impl层
 * 
 * @author site
 * 
 */
@Service("TPosService")
public class TPosServiceImpl extends AbstractManagerImpl<Long, TPos> implements TPosService {

	@Resource
	TPosDao dao;
	
	@Resource
	TStorePosDao tStorePosdao;

	@Override
	protected Dao<Long, TPos> getDao() {
		return dao;
	}

	@Override
	public void registPos(TPos tPos, TStore tStore) {
		//更新tpos的mac地址
		dao.update(tPos);
		TStorePos tStorePos = new TStorePos();
		tStorePos.setShopId(tPos.getShopId());
		tStorePos.setStoreId(tStore.getId());
		tStorePos.setPosId(tPos.getId());
		tStorePos.setIsFlag("0");
		tStorePos.setCreateBy(tPos.getUpdateBy());
		tStorePosdao.create(tStorePos);
	}
}