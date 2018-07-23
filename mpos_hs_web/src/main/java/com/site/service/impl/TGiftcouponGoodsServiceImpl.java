package com.site.service.impl;

import com.site.core.base.AbstractManagerImpl;
import com.site.core.mybatis.Dao;
import com.site.dao.TGiftcouponGoodsDao;
import com.site.entity.TGiftcouponGoods;
import com.site.service.TGiftcouponGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by langrs on 2016-09-10.
 *
 */
@Service("TGiftcouponGoodsService")
public class TGiftcouponGoodsServiceImpl extends AbstractManagerImpl<Long, TGiftcouponGoods> implements TGiftcouponGoodsService {
    @Resource
    TGiftcouponGoodsDao dao;

    @Override
    protected Dao<Long, TGiftcouponGoods> getDao() {
        return dao;
    }
}
