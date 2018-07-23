package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TStoreDoubleDao;
import com.site.entity.TStoreDouble;
import com.site.service.TStoreDoubleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-07-03.
 */
@Service("TStoreDoubleService")
public class TStoreDoubleServiceImpl extends AbstractManagerImpl<Long,TStoreDouble> implements TStoreDoubleService {
    @Resource
    TStoreDoubleDao dao;

    protected Dao<Long, TStoreDouble> getDao() {
        return dao;
    }
}
