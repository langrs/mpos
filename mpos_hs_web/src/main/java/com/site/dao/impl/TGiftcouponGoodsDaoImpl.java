package com.site.dao.impl;

import com.site.core.mybatis.MyBatisDaoImpl;
import com.site.dao.TGiftcouponGoodsDao;
import com.site.entity.TGiftcouponGoods;
import org.springframework.stereotype.Repository;

/**
 * Created by langrs on 2016-09-10.
 *
 */
@Repository
public class TGiftcouponGoodsDaoImpl extends MyBatisDaoImpl<Long, TGiftcouponGoods> implements TGiftcouponGoodsDao {
    @Override
    public String getNamespace() {
        return TGiftcouponGoods.class.getName();
    }
}
