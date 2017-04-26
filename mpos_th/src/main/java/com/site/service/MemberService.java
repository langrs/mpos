package com.site.service;

import com.site.dao.TfCardTypeStatusDao;
import com.site.dao.TfMemberDao;
import com.site.entity.QueryMap;
import com.site.entity.TfCardTypeStatus;
import com.site.entity.TfMember;
import com.site.entity.respon.Member;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by langrs on 2017-03-19.
 */
@Service("MemberService")
public class MemberService {
    @Resource
    TfMemberDao tfMemberDao;
    @Resource
    TfCardTypeStatusDao tfCardTypeStatusDao;

    //获取会员的基本信息
    public Member getMember(String type,String code){
        QueryMap queryMap = new QueryMap();
        String memberno = null;
        Member member = new Member();
        //type为参数类型:1卡号,2,电话

        //获取卡明细资料
        if(type == "1"){
            queryMap.clear();
            queryMap.put("cardno",code);
            queryMap.put("cnfflg","Y");
            TfCardTypeStatus tfCardTypeStatus = tfCardTypeStatusDao.getOne(queryMap);
            if(tfCardTypeStatus == null){
                return null;
            }
            //会员编号
            memberno = tfCardTypeStatus.getMemberno();
            //获取会员资料
            queryMap.clear();
            queryMap.put("memberno",memberno);
            TfMember tfMember = tfMemberDao.getOne(queryMap);
            //卡号
            member.setCardno(code);
            member.setMemberno(memberno);
            member.setMembername(tfMember.getMembername());
            member.setAddress(tfMember.getAddress());
            member.setBirthday(tfMember.getBirthday());
            //卡有效期
            member.setValidity(tfCardTypeStatus.getValidity());
            //卡等级
            member.setMembergrade(tfMember.getMembergrade());
            member.setMobile(tfMember.getMobile());
            //卡状态
            member.setCardstatus(tfCardTypeStatus.getCardstatus());
            //卡种
            member.setCtno(tfCardTypeStatus.getCtno());
            member.setYpoint(tfCardTypeStatus.getYpoint());
            }else{
                //这里可以过滤多种不同的查询条件
                if(type == "2"){
                    queryMap.clear();
                    queryMap.put("mobile",code);
                    queryMap.put("cnfflg","Y");
                }
                //可能会检索出多条记录,只取一条
                List<TfMember> tfMemberList = tfMemberDao.getList(queryMap);
                if(tfMemberList == null){
                    return null;
                }
                memberno = tfMemberList.get(0).getMemberno();
                //通过会员编号获取卡种资料
                queryMap.clear();
                queryMap.put("memberno",memberno);
                queryMap.put("cnfflg","Y");
                List<TfCardTypeStatus> tfCardTypeStatusList = tfCardTypeStatusDao.getList(queryMap);
                if(tfCardTypeStatusList == null){
                    return null;
                }
                //这里有问题,没有完全理解通过会员资料获取卡明细是通过什么条件来过滤,因为一个人可能拥有多个卡种
                //测试先按照卡号来作为入参

        }
        return member;
    }
    //获取会员折扣规则
    public void collectMemberDisc(){
    }
}
