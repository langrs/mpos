package com.site.dao;

import com.site.dao.impl.CouponDaoImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by langrs on 2016-09-13.
 */
public class CouponDaoImplTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSessionTemplate sqlSessionTemplate;
    private CouponDaoImpl couponDao;
//    @Before
//    public void init() throws Exception{
//        String resource = "conf/SqlMapConfig.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
//        couponDao = new CouponDaoImpl(sqlSessionTemplate);
//    }
//    @Ignore
//    @Test
//    public void queryDefaparamTest(){
//        Double jfbl = couponDao.queryDefaparam("0207");
//        System.out.print("返回值:");
//        System.out.println(jfbl);
//    }
//    @Ignore
//    @Test
//    public void getCoupon(){
//        Coupon coupon = couponDao.getCoupon("01009210002611");
//        if(coupon != null) {
//            System.out.println(coupon.getCouponValue());
//        }else{
//            System.out.println("无法查到券信息");
//        }
//    }
//    @Ignore
//    @Test
//    public void makeJffl(){
//        String ckcode ="310001190";
//        String cardtype ="01";
//        String userNo ="111111";
//        double cardjf = 700;
//        double kjjf = 100;
//        double flje = 50;
//
//        String no = couponDao.makeJffl(ckcode,cardtype,userNo,cardjf,kjjf,flje);
//        System.out.println(no);
//    }
//    @Ignore
//    @Test
//    public void makeCoupon(){
//        String saleNo = "11201009220002";
//        String userNo = "9999";
//        Coupon coupon = couponDao.makeCoupon(userNo,saleNo);
//        if(coupon != null){
//            System.out.println(coupon.getCouponNo());
//            System.out.println(coupon.getCouponValue());
//        }else
//        {
//            System.out.println("返券失败");
//        }
//    }
//    @Test
//    public void getRtnRight(){
//        String userNo = "9001";
//        String passwd = "1";
//        String right = couponDao.getRtnRight(userNo,passwd);
//        System.out.println(right);
//    }
}
