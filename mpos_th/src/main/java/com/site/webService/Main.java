package com.site.webService;


import com.site.entity.ResultMap;
import com.site.entity.respon.CouponQueryResult;
import com.site.entity.respon.Member;
import com.site.webService.SingleCouponGet.SingleCouponGet;
import com.site.webService.giftProcess.GiftProcess;
import com.site.webService.memberInfoGet.MemberInfoGet;
import com.site.webService.paymentProcess.PaymentProcess;
import com.site.webService.singleCardGet.SingleCardGet;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String shop = "1002";
        String type = "2";
        String couponno = "90000202";
//        SingleCouponGet(shop,type,couponno);
//        //会员查询
//        //卡号
//        String code = "120000080354";
//        MemberInfoGet(shop,code);
//        //单张卡查询
//        String code = "120000080354";
//        type = "1";
//        String passwd = "0314712";
//        String amt = "10.0";
//        SingleCardGet(shop,type,code,passwd,amt);

        //销售付款
//        PaymentProcess();
        //赠送
        GiftProcess();
    }
    //赠送
    static void GiftProcess(){
        Map<String,Object> map = new HashMap<String, Object>();
        String shop = "1002";
        String type = "0";
        String cardType ="2";
        String ctno = "2017041901";
        map.put("func", "GiftProcess");
        map.put("shop", shop);
        map.put("Mode","0");
        map.put("Type", type);
        SimpleDateFormat sf = new SimpleDateFormat("yyMMddHHmmss");
        map.put("saleno", shop + sf.format(new Date()));
        //赠卡
        List<Map<String,String>> cardList = new ArrayList<Map<String,String>>();
        Map<String,String> cardMap = new HashMap<String, String>();
        //卡状态:2.发卡，7.注销
        cardMap.put("mmaq006",cardType);
        //卡号
        cardMap.put("mmaq001","120000080354");
        //卡种编号
        cardMap.put("mmaq002","17");
        //密码
        cardMap.put("mmaq004","");
        //校验码
        cardMap.put("mmaqua001","");
        //储值金额
        cardMap.put("mmau009","1.0");
        //实际储值金额
        cardMap.put("mmau009_1","1.0");
        //送抵现值
        cardMap.put("mmau013","0");
        //储值成本
        cardMap.put("mmau014","0");
        //uuid
        cardMap.put("mmaq100",UUID.randomUUID().toString());
        ///////////
        cardList.add(cardMap);
        if(cardList!=null) {
//            map.put("mmaq_t", cardList);
        }
        //赠券
        List<Map<String,String>> couponList = new ArrayList<Map<String, String>>();
        Map<String,String> couponMap = new HashMap<String, String>();
        //流转状态:4.发售
        couponMap.put("gcao005","4");
        //券种
        couponMap.put("gcao002",ctno);
        //数量
        couponMap.put("gcbi005","2");
        //uuid
        couponMap.put("gcao100",UUID.randomUUID().toString());
        couponList.add(couponMap);
        if(couponList !=null){
            map.put("gcao_q",couponList);
        }
        WsUtil wsUtil = new GiftProcess();
        wsUtil.setMap(map);
        XmlUtil.callWebservice(wsUtil);
//        ResultMap<CouponQueryResult> resultMap = (ResultMap<CouponQueryResult>) XmlUtil.callWebservice(wsUtil);
    }

    //调用获取单张券
    static void SingleCouponGet(String shop, String type, String couponno) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("func", "SingleCouponGet");
        map.put("shop", shop);
        map.put("type", type);
        map.put("couponno", couponno);
        WsUtil wsUtil = new SingleCouponGet();
        wsUtil.setMap(map);
        //调用接口
        ResultMap<CouponQueryResult> resultMap = (ResultMap<CouponQueryResult>) XmlUtil.callWebservice(wsUtil);
    }

    static void MemberInfoGet(String shop, String code) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("shop", shop);
        map.put("code", code);
        WsUtil wsUtil = new MemberInfoGet();
        wsUtil.setMap(map);
        //调用接口
        ResultMap<CouponQueryResult> resultMap = (ResultMap<CouponQueryResult>) XmlUtil.callWebservice(wsUtil);

    }

    static void SingleCardGet(String shop, String type, String code, String passwd, String amt) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("shop", shop);
        map.put("func", "SingleCardGet");
        map.put("code", code);
        map.put("passwd", passwd);
        map.put("type", type);
        map.put("amt", amt);
        WsUtil wsUtil = new SingleCardGet();
        wsUtil.setMap(map);
        //调用接口
        ResultMap<Member> resultMap = (ResultMap<Member>) XmlUtil.callWebservice(wsUtil);
        //看看返回值
        System.out.println(resultMap.getStatus());
        System.out.println(resultMap.getErrorMsg());
        System.out.println(resultMap.getData().getCardno());
        System.out.println(resultMap.getData().getMembername());
        System.out.println(resultMap.getData().getMobile());
        System.out.println(resultMap.getData().getYpoint());
        System.out.println(resultMap.getData().getCardvalue());


    }

    static void PaymentProcess() {
        String shop = "1002";
        Map<String, Object> map = new HashMap<String, Object>();
        //储值卡数组
        List<Map> cardList = new ArrayList<Map>();
        //券核销数组
        List<Map> couponList = new ArrayList<Map>();

        map.put("shop", shop);
        map.put("func", "PaymentProcess");
        //模式0正常1训练模式
        map.put("Mode","0");
        map.put("Type", "1");
        SimpleDateFormat sf = new SimpleDateFormat("yyMMddHHmmss");
        map.put("saleno", shop + sf.format(new Date()));
        map.put("amt", "100.0");
        //1.卡处理
        //多张卡信息放入卡的列表中
        Map<String, String> cardMap = new HashMap<String, String>();
        //卡号
        cardMap.put("mmau001", "120000080354");
        //密码
        cardMap.put("mmaq004", "0314712");
        cardMap.put("mmaqua001", "0314712");
        //金额
        cardMap.put("mmau009", "1");
        //
        cardMap.put("mmau100", UUID.randomUUID().toString());
        cardList.add(cardMap);
        map.put("mmau_t_8", cardList);  //放入卡的处理操作

        //2.积分处理
        Map<String, String> pointMap = new HashMap<String, String>();
        //异动类型A销售单B积分抵现
        pointMap.put("mmar004", "A");
        //卡号
        pointMap.put("mmar001", "120000080354");
        //异动金额
        pointMap.put("mmar008", "100");
        //异动积分
        pointMap.put("mmar009", "1");
        //UUID
        pointMap.put("mmar100", UUID.randomUUID().toString());
        map.put("mmar_t", pointMap);  //放入积分的处理操作
        //3.券核销操作
        //多张券信息放入券列表中
        Map<String,String> couponMap = new HashMap<String, String>();
        //券流转状态:4.发售，5.发售退回，6.已使用?????????????????????????????????要根据实际情况设置
        couponMap.put("gcao005","4");
        //开始券号
        couponMap.put("gcao001_1","001");
        //结束券号
        couponMap.put("gcao001_2","001");
        //UUID
        couponMap.put("gcao100",UUID.randomUUID().toString());

        couponList.add(couponMap);
        map.put("gcao_t",couponList); //放入券核销的处理操作

        WsUtil wsUtil = new PaymentProcess();
        wsUtil.setMap(map);
        XmlUtil.callWebservice(wsUtil);
    }
}
