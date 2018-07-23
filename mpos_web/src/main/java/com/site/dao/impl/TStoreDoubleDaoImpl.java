package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TStoreDoubleDao;
import com.site.entity.TStoreDouble;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017-07-03.
 */
@Repository
public class TStoreDoubleDaoImpl extends MyBatisDaoImpl<Long,TStoreDouble> implements TStoreDoubleDao {
    public String getNamespace() {
        return TStoreDouble.class.getName();
    }
}
