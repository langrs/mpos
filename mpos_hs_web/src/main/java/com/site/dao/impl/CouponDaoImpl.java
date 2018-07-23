package com.site.dao.impl;

import com.site.core.mybatis.QueryMap;
import com.site.entity.Coupon;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by langrs on 2016-09-12.
 *
 */
@Repository
public class CouponDaoImpl {
    @Resource
    protected SqlSessionTemplate sqlSessionTemplate;
    //测试使用
//    private SqlSessionTemplate sqlSessionTemplate;


    public String getNamespace() {
        return Coupon.class.getName();
    }

    //获取积分返利的比例,例如多少积分兑换对少钱
    public Double queryDefaparam(String paramno){
        String parm = sqlSessionTemplate.selectOne(getNamespace() + ".queryDefaparm",paramno);
        if(parm != null){
            return Double.parseDouble(parm);
        }else{
            return null;
        }
    }
    //返回积分兑换后的券号
    public String makeJffl(String ckcode, String cardtype, String userNo, double cardjf, double kjjf, double flje ){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("ckcode",ckcode);
        map.put("cardtype",cardtype);
        map.put("cardjf",cardjf);
        map.put("kjjf",kjjf);
        map.put("flje",flje);
        map.put("userNo",userNo);
        sqlSessionTemplate.selectList(getNamespace() + ".makeJfflProc",map);
        return (String) map.get("giftcouponno");
    }
    //查询券信息
    public Coupon getCoupon(String couponNo){
        return sqlSessionTemplate.selectOne(getNamespace() + ".getCoupon",couponNo);
    }
    //销售单兑换券
    public Coupon makeCoupon(String userNo, String saleNo){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userNo",userNo);
        map.put("saleno1",saleNo);
        map.put("saleno2","");
        map.put("saleno3","");
        map.put("saleno4","");
        map.put("saleno5","");
        map.put("saleno6","");
        map.put("saleno7","");
        map.put("saleno8","");
        map.put("saleno9","");
        map.put("saleno10","");
        map.put("saleno11","");
        map.put("saleno12","");
        map.put("saleno13","");
        map.put("saleno14","");
        map.put("saleno15","");
        map.put("saleno16","");
        map.put("saleno17","");
        map.put("saleno18","");
        map.put("saleno19","");
        map.put("saleno20","");
        sqlSessionTemplate.selectList(getNamespace() + ".makeCouponProc",map);
        String giftcouponno = (String) map.get("giftcouponno");
        Object object =  map.get("promsale");
        Double promsale = Double.parseDouble(object.toString());
        if(giftcouponno != null  && promsale > 0 ){
            return sqlSessionTemplate.selectOne(getNamespace() + ".getCouponByGiftNo",giftcouponno);
        }else{
            return null;
        }
    }
//    更新原来的销售单状态
        public void updateSaleflow(String saleNo){
            sqlSessionTemplate.update(getNamespace()+".updateSaleflow",saleNo);
        }
    //获取退货权限
    public String getRtnRight(String userNo,String passwd){
        QueryMap queryMap = new QueryMap();
        queryMap.put("userNo",userNo);
        queryMap.put("passwd",passwd);
        return sqlSessionTemplate.selectOne(getNamespace() + ".getRtnRight",queryMap);
    }
}
