package com.site.controller;

import com.site.dao.*;
import com.site.entity.*;
import com.site.entity.respon.*;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.namespace.QName;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by langrs on 2017-03-25.
 * 基本资料服务
 */

@Controller
@RequestMapping(value = "baseinfo/")
@Api(value = "sale", description = "基本资料相关接口")
public class BaseInfoController {
    private static final QName SERVICE_NAME = new QName("http://entry.serviceengine.cross.digiwin.com", "IntegrationEntry_Service");
    @Resource
    PlatformMachineDao platformMachineDao;
    @Resource
    TbCounterDao tbCounterDao;
    @Resource
    TaPaymentDao taPaymentDao;
    @Resource
    TaShopInfoDao taShopInfoDao;
    @Resource
    TbGoodsDao tbGoodsDao;
    @Resource
    TfCardTypeStatusDao tfCardTypeStatusDao;
    @Resource
    TfMemberDao tfMemberDao;
    @Resource
    PlatformStaffsDao platformStaffsDao;

    ////////////////////////////////////////////////////////////////
    @ApiOperation(value = "用户登录验证",notes = "用户登录验证",httpMethod = "GET",
            produces = "application/json; charset=utf-8",response = VerifyResult.class)
    @RequestMapping(value = "userVerify",method = RequestMethod.GET)
    @ResponseBody
    public VerifyResult userVerify(@ApiParam(value = "用户编码",required = true,defaultValue = "00000") @RequestParam String opno,
                                   @ApiParam(value="用户密码",required = true,defaultValue = "111111") @RequestParam String password,
                                   @ApiParam(value="分店",required = true,defaultValue = "1002") @RequestParam String shop){
        //返回收银机资料
        VerifyResult verifyResult = new VerifyResult();

        QueryMap queryMap = new QueryMap();
        queryMap.put("opno",opno);
        queryMap.put("password",password);
        queryMap.put("shop",shop);
        queryMap.put("cnfflg","Y");
        //校验用户
        PlatformStaffs platformStaffs = platformStaffsDao.getOne(queryMap);
        if(platformStaffs == null){
            verifyResult.setStatus("1");
            verifyResult.setErrmsg("用户名称或密码不正确!");
            return verifyResult;
        }
        //获取门店信息
        queryMap.clear();
        queryMap.put("shop",shop);
        TaShopInfo taShopInfo = taShopInfoDao.getOne(queryMap);
        //获取收银机信息
        queryMap.clear();
        queryMap.put("counterno",platformStaffs.getCounterno());
        queryMap.put("shop",shop);
        queryMap.put("cnfflg","Y");
        PlatformMachine platformMachine = platformMachineDao.getOne(queryMap);
        if(platformMachine == null){
            verifyResult.setStatus("1");
            verifyResult.setErrmsg("收银机没有维护!");
            return verifyResult;
        }
        //获取专柜信息
        queryMap.clear();
        queryMap.put("counterno",platformStaffs.getCounterno());
        queryMap.put("cnfflg","Y");
        queryMap.put("organizationno",shop);
        TbCounter tbCounter = tbCounterDao.getOne(queryMap);
        if(tbCounter == null){
            verifyResult.setStatus("1");
            verifyResult.setErrmsg("专柜信息维护错误!");
            return verifyResult;
        }
        //获取支付列表
        queryMap.clear();
        queryMap.put("cnfflg","Y");
//        queryMap.put("organizationno",shop);
        List<TaPayment> taPayments = taPaymentDao.getList(queryMap);
        if(taPayments == null){
            verifyResult.setStatus("1");
            verifyResult.setErrmsg("无法获取支付方式列表!");
            return verifyResult;
        }
        //设置数据
        verifyResult.setStatus("0");
        VerifyResultPos verifyResultPos = new VerifyResultPos();
        List<VerifyResultPayment> verifyResultPayments = new ArrayList<VerifyResultPayment>();
        verifyResultPos.setShop(shop);
        verifyResultPos.setShopname(taShopInfo.getShopname());
        verifyResultPos.setAddress(taShopInfo.getAddress());
        verifyResultPos.setCounterno(tbCounter.getCounterno());
        verifyResultPos.setCountername(tbCounter.getCountername());
        verifyResultPos.setLdisc(tbCounter.getLdisc());
        verifyResultPos.setMachine(platformMachine.getMachine());
        verifyResultPos.setOpno(opno);
        verifyResultPos.setOpname(platformStaffs.getOpname());
        verifyResultPos.setOpgroup(platformStaffs.getOpgroup());
        verifyResultPos.setTelephone(taShopInfo.getTelephone());
        verifyResultPos.setOrganizationno(taShopInfo.getOrganizationno());
        for(TaPayment taPayment:taPayments){
            VerifyResultPayment verifyResultPayment = new VerifyResultPayment();
            verifyResultPayment.setErppayNo(taPayment.getErppayno());
            verifyResultPayment.setPaych(taPayment.getPaych());
            verifyResultPayment.setPaycode(taPayment.getPaycode());
            verifyResultPayment.setPaycodeerp(taPayment.getPaycodeerp());
            verifyResultPayment.setSpill(taPayment.getSpill());
            verifyResultPayment.setPayname(taPayment.getPayname());
            verifyResultPayments.add(verifyResultPayment);
        }
        verifyResult.setVerifyResultPos(verifyResultPos);
        verifyResult.setVerifyResultPayments(verifyResultPayments);
        return verifyResult;
    }
    ////////////////////////////////////////////////////////////////
    @ApiOperation(value = "获取商品信息",
            notes = "获取商品信息(如果有商品条码,则按条码查询,否则按专柜编码查询,返回商品信息列表",
            produces = "application/json; charset=utf-8",
            httpMethod = "GET",response = TbGoods.class,responseContainer = "List")
    @RequestMapping(value = "queryItem",method = RequestMethod.GET)
    @ResponseBody
    public List<TbGoods> queryItem(@ApiParam(value = "专柜编码",required = false,defaultValue = "10020216") @RequestParam String counterno,
                                                  @ApiParam(value="商品条码",required = false) @RequestParam(required = false) String pluno,
                                                  @ApiParam(value="分店",required= true,defaultValue = "1002") @RequestParam String shop){
        QueryMap queryMap = new QueryMap();
        if(pluno != null){  //如果有编码则检索商品编码,否则按照专柜编码检索
            queryMap.put("pluno",pluno);
        }else{
            queryMap.put("counterno",counterno);
        }
        queryMap.put("organizationno",shop);
        queryMap.put("cnfflg","Y");
        queryMap.put("fsal","Y");
        List<TbGoods> tbGoodses =  tbGoodsDao.getList(queryMap);
        return tbGoodses;
    }

    ////////////////////////////////////////////////////////////////
    @ApiOperation(value = "会员信息查询",notes = "会员信息查询,通过会员卡号或者用户的手机号任意一个条件进行查询," +
            "例如13712171980这个手机号会返回几条记录",httpMethod = "GET",
            produces = "application/json; charset=utf-8",response = VipQueryResult.class)
    @RequestMapping(value = "vipQuery",method = RequestMethod.GET)
    @ResponseBody
    public VipQueryResult vipQuery(@ApiParam(value = "会员卡号",required = false,defaultValue = "00000225") @RequestParam(required = false) String  cardno,
                                   @ApiParam(value="手机号",required = false) @RequestParam(required = false) String mobile,
                                   @ApiParam(value="分店",required= true,defaultValue = "1002") @RequestParam String shop){
        QueryMap queryMap = new QueryMap();
        VipQueryResult vipQueryResult = new VipQueryResult();
        List<Member> members = new ArrayList<Member>();
        String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
        //如果有卡号,直接通过卡号查询
        if(cardno != null){
            queryMap.put("cardno",cardno);
            queryMap.put("cardstatus","2");
            queryMap.put("validity",today);
            queryMap.put("cnfflg","Y");
            TfCardTypeStatus tfCardTypeStatus = tfCardTypeStatusDao.getOne(queryMap);
            if(tfCardTypeStatus == null){
                vipQueryResult.setStatus("1");
                vipQueryResult.setErrmsg("卡号不存在或卡不可用!");
                return vipQueryResult;
            }
            //查询会员基本信息
            queryMap.clear();
            queryMap.put("memberno",tfCardTypeStatus.getMemberno());
            queryMap.put("cnfflg","Y");
            List<TfMember> tfMembers = tfMemberDao.getList(queryMap);
            if(tfMembers == null){
                vipQueryResult.setStatus("1");
                vipQueryResult.setErrmsg("会员卡资料不可用!");
                return vipQueryResult;
            }

            for (TfMember tfMember :tfMembers) {
                Member member = new Member();
                member.setCardstatus(tfCardTypeStatus.getCardstatus());
                member.setValidity(tfCardTypeStatus.getValidity());
                member.setMembergrade(tfMember.getMembergrade());
                member.setBirthday(tfMember.getBirthday());
                member.setYpoint(tfCardTypeStatus.getYpoint());
                member.setCardno(tfCardTypeStatus.getCardno());
                member.setMemberno(tfMember.getMemberno());
                member.setAddress(tfMember.getAddress());
                member.setMobile(tfMember.getMobile());
                member.setCtno(tfCardTypeStatus.getCtno());
                member.setMembername(tfMember.getMembername());
                members.add(member);
            }
            vipQueryResult.setStatus("0");
            vipQueryResult.setMembers(members);
            return vipQueryResult;
        }//如果有卡号,直接通过卡号查询结束
        //********************************
        //通过电话查询,可能查找到多条记录
        if(mobile != null){
            queryMap.put("mobile",mobile);
        }
        queryMap.put("cnfflg","Y");
        List<TfMember> tfMembers = tfMemberDao.getList(queryMap);
        if(tfMembers == null){
            vipQueryResult.setStatus("1");
            vipQueryResult.setErrmsg("无法找到卡信息");
            return vipQueryResult;
        }
        for (TfMember tfMember:tfMembers) {
            //这里查询的时候,是否要增加卡种的限制,因为一个会员允许有多张卡,这样查到的记录也是多个了!!!!!!!!!!!!!1
            queryMap.clear();
            queryMap.put("memberno",tfMember.getMemberno());
            queryMap.put("cnfflg","Y");
            queryMap.put("cardstatus","2");
            queryMap.put("validity",today);
            List<TfCardTypeStatus> tfCardTypeStatuses = tfCardTypeStatusDao.getList(queryMap);
            for (TfCardTypeStatus tfCardTypeStatus :tfCardTypeStatuses) {
                Member member = new Member();
                member.setCardstatus(tfCardTypeStatus.getCardstatus());
                member.setValidity(tfCardTypeStatus.getValidity());
                member.setMembergrade(tfMember.getMembergrade());
                member.setBirthday(tfMember.getBirthday());
                member.setYpoint(tfCardTypeStatus.getYpoint());
                member.setCardno(tfCardTypeStatus.getCardno());
                member.setMemberno(tfMember.getMemberno());
                member.setAddress(tfMember.getAddress());
                member.setMobile(tfMember.getMobile());
                member.setCtno(tfCardTypeStatus.getCtno());
                member.setMembername(tfMember.getMembername());
                members.add(member);
            }
        }
        vipQueryResult.setStatus("0");
        vipQueryResult.setMembers(members);
        return vipQueryResult;
    }
    //////////////////////////////通过webservice接口获取//////////////////////////////////
    @ApiOperation(value = "储值卡查询",notes = "储值卡查询:type的传值如->1.充值前余额查询，2充值时取得充值金额，3.储值卡付款时余额查询,4.退卡查询，5.积分查询，6.积分抵现查询",httpMethod = "GET",
            produces = "application/json; charset=utf-8",response = CardQueryResult.class)
    @RequestMapping(value = "cardQuery",method = RequestMethod.GET)
    @ResponseBody
    public CardQueryResult cardQuery(@ApiParam(value="分店",required= true,defaultValue = "1002") @RequestParam String shop,
            @ApiParam(value = "查询类型",required = true,defaultValue = "3") @RequestParam(required = true) String  type,
            @ApiParam(value = "卡号(通过磁道信息分解等号后面部分的为密码,等号前面部分为卡号)",required = false,defaultValue = "") @RequestParam(required = false) String  cardno,
            @ApiParam(value = "卡密码（类型=3、4时才会使用;通过磁道信息分解等号后面的为密码,等号前面部分为卡号）",required = false,defaultValue = "") @RequestParam(required = false) String  cardpasswd,
                                   @ApiParam(value="需要充值的金额（类型=2时才会使用）",required = false) @RequestParam(required = false) Double amt){
        CardQueryResult cardQueryResult = new CardQueryResult();

        return cardQueryResult;
    }
    ////////////////////////////////////////////////////////////////
    @ApiOperation(value = "券查询",notes = "券查询",httpMethod = "GET",
            produces = "application/json; charset=utf-8",response = CouponQueryResult.class)
    @RequestMapping(value = "couponQuery",method = RequestMethod.GET)
    @ResponseBody
    public CouponQueryResult couponQuery(@ApiParam(value = "券号",required = true) @RequestParam String  couponno,
                                         @ApiParam(value="分店",required = true) @RequestParam String shop,
                                         @ApiParam(value = "查询类型--1销售前查询2销退前查询",required = true) @RequestParam String type){
        CouponQueryResult couponQueryResult =new CouponQueryResult();
        return couponQueryResult;
    }
    ////////////////////////////////////////////////////////////////
    @ApiOperation(value = "获取当前时间",notes = "同步正确的时间",httpMethod = "GET",
            produces = "application/json; charset=utf-8",
            response = String.class)
    @RequestMapping(value = "getDate",method = RequestMethod.GET)
    @ResponseBody
    public String getDate(){
        return new SimpleDateFormat("yyyyMMdd hh:mm:ss").format(new Date());
    }
    ////////////////////////////////////////////////////////////////
    //这里的密码需要根据md5来加密
    @ApiOperation(value = "修改用户密码",notes = "修改用户登录密码",httpMethod = "GET",
            produces = "application/json; charset=utf-8",
            response = ChangePasswdResult.class)
    @RequestMapping(value = "changePasswd",method = RequestMethod.GET)
    @ResponseBody
    public ChangePasswdResult changePasswd(@ApiParam(value = "用户编码",required = true,defaultValue = "00000") @RequestParam String opno,
                               @ApiParam(value = "用户原密码",required = true) @RequestParam String password,
                               @ApiParam(value = "新密码",required = true) @RequestParam String newpassword){
        ChangePasswdResult changePasswdResult = new ChangePasswdResult();
        QueryMap queryMap = new QueryMap();
        queryMap.put("opno",opno);
        queryMap.put("password",password);
        PlatformStaffs platformStaffs = platformStaffsDao.getOne(queryMap);
        if(platformStaffs == null){

            changePasswdResult.setStatus("1");
            changePasswdResult.setErrmsg("原密码错误!");
            return changePasswdResult;
        }
        platformStaffs.setPassword(newpassword);
        platformStaffsDao.update(platformStaffs);
        changePasswdResult.setStatus("0");
        return changePasswdResult;
    }
//    ////////////////////////测试参数为对象///////////////////
//    @ApiOperation(value = "测试参数为对象",notes = "测试参数为对象",httpMethod = "POST")
////    @ApiImplicitParam(name = "TaPayment", value = "TaPayment支付方式", required = true, dataType = "TaPayment")
//    @RequestMapping(value = "testParm",method = RequestMethod.POST)
//    @ResponseBody
//    public Member testParm(@RequestBody PreSaleRequire preSaleRequire){
//
//        Member member = new Member();
//        member.setMobile(preSaleRequire.getCardno());
//        member.setCtno("010");
//        return member;
//    }
}
