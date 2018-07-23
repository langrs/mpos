package com.site.service.impl;

import com.site.core.mybatis.QueryMap;
import com.site.dao.THycardInfoDao;
import com.site.dao.impl.CouponDaoImpl;
import com.site.entity.Coupon;
import com.site.entity.JfflResult;
import com.site.entity.THycardInfo;
import com.site.service.CouponService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by langrs on 2016-09-12.
 *
 */
@Service("CouponService")
class CouponServiceImpl implements CouponService {
    @Resource
    THycardInfoDao tHycardInfoDao;

    @Resource
    CouponDaoImpl couponDao;

    //销售返券
    public Coupon makeCoupon(String userNo, String saleNo) {
        Coupon coupon = couponDao.makeCoupon(userNo,saleNo);
        if(coupon != null){
            //兑换成功以后,更新销售单
            couponDao.updateSaleflow(saleNo);
            return coupon;
        }else{
            return null;
        }
    }
    //积分返券
    public Coupon makeJffl(String ckcode, String cardtype, String userNo, double cardjf, double kjjf, double flje) {
        String couponNo = couponDao.makeJffl(ckcode, cardtype, userNo, cardjf, kjjf, flje);
        if(couponNo != null && couponNo.length() > 0){
            return couponDao.getCoupon(couponNo);
        }else{
            return null;
        }
    }
    //预查询积分返利
    public JfflResult queryJffl(String cdinfo, String billno, String shopId) {
        //查询卡信息
        QueryMap queryMap = new QueryMap();
        if(cdinfo != null && cdinfo.length() > 1){
            queryMap.put("mkcode",cdinfo);
        }else if(billno != null && billno.length() >1 ){
            queryMap.put("ckcode",billno);
        }else{
            return null;
        }
        THycardInfo tHycardInfo = tHycardInfoDao.getOne(queryMap);
        if(tHycardInfo == null){
            return null;
        }else{
            //返利倍率
            Double flbl = couponDao.queryDefaparam("0207");
            if (flbl == null){
                return null;
            }
//          每次最多兑换金额
            Double mcflje = couponDao.queryDefaparam("0210");
            if (mcflje == null){
                return null;
            }

            Double cardjf = tHycardInfo.getCardjf();
            if(cardjf == null || cardjf <= 0){
                return null;
            }
            //计算返利金额
            Double flje = Math.floor(cardjf/flbl);
//            如果返利金额大于定义的每次最多返利金额,则最大只能返利预定义金额
            if (flje > mcflje){
                flje = mcflje;
            }
            //计算扣减积分
            Double kjjf = flje * flbl;
//
            JfflResult jfflResult = new JfflResult();
            jfflResult.setCardstatus(tHycardInfo.getCardstatus());
            jfflResult.setCardtype(tHycardInfo.getCardtype());
            jfflResult.setCkcode(tHycardInfo.getCkcode());
            jfflResult.setCust_mobile(tHycardInfo.getCustMobile());
            jfflResult.setCust_name(tHycardInfo.getCustName());
            jfflResult.setCardjf(cardjf);
            jfflResult.setFlje(flje);
            jfflResult.setKjjf(kjjf);
            jfflResult.setLmcode(tHycardInfo.getLmcode());
            return jfflResult;
        }
    }
    //返回是否有退货权限,0否1是
    public String getRtnRight(String userNo, String passwd) {
        String rights = couponDao.getRtnRight(userNo,passwd);
        if(rights != null){
            return rights.substring(0,1);
        }
        return null;
    }
}
