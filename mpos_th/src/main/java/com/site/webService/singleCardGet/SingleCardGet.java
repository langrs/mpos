package com.site.webService.singleCardGet;

import com.site.entity.ResultMap;
import com.site.entity.respon.CouponQueryResult;
import com.site.entity.respon.Member;
import com.site.webService.SingleCouponGet.SingleCouponGetField;
import com.site.webService.WsUtil;
import net.sf.ezmorph.array.DoubleArrayMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 * 单张卡查询
 */
public class SingleCardGet extends WsUtil {
    public String makeBody() {
        Element RequestE = new DOMElement("Request");
        //RequestContent
        Element RequestContentE = RequestE.addElement("RequestContent");
        //Parameter
        Element ParameterE = RequestContentE.addElement("Parameter");
        //Record
        Element RecordE = ParameterE.addElement("Record");
        //Record -Field
        //type类型:1.充值前余额查询，2充值时取得充值金额，3.储值卡付款时余额查询,4.退卡查询，5.积分查询，6.积分抵现查询
        Element Field1E = RecordE.addElement("Field");
        Field1E.addAttribute("name","type");
        Field1E.addAttribute("value",this.getMap().get("type").toString());
        //分店
        Element Field2E = RecordE.addElement("Field");
        Field2E.addAttribute("name","ooef001");
        Field2E.addAttribute("value",this.getMap().get("shop").toString());
        //卡号
        Element Field3E = RecordE.addElement("Field");
        Field3E.addAttribute("name","mmaq001");
        Field3E.addAttribute("value",this.getMap().get("code").toString());
        //需要充值金额
        Element Field4E = RecordE.addElement("Field");
        Field4E.addAttribute("name","mmau009");
        Field4E.addAttribute("value",this.getMap().get("amt").toString());
        //卡密码
        Element Field5E = RecordE.addElement("Field");
        Field5E.addAttribute("name","mmaq004");
        Field5E.addAttribute("value",this.getMap().get("passwd").toString());
        return RequestE.asXML();
    }

    public void extraResponseContent(JSONObject jsonObject, ResultMap resultMap) {
        JSONArray json = jsonObject.getJSONObject("Response").getJSONObject("ResponseContent").
                getJSONObject("Document").getJSONObject("RecordSet").getJSONObject("Master").getJSONObject("Record").getJSONArray("Field");
        List<SingleCouponGetField> singleCouponGetFields = (List<SingleCouponGetField>) JSONArray.toCollection(json, SingleCouponGetField.class);
        if(singleCouponGetFields != null){
            Member member = new Member();
            for(SingleCouponGetField singleCouponGetField:singleCouponGetFields){
                String name = singleCouponGetField.getName();
                String value = singleCouponGetField.getValue();
                //卡号
                if(name.equals("mmaq001")){member.setCardno(value);}
                //卡种
                if(name.equals("mmaq002")){member.setCtno(value);}
                //有效期
                if(name.equals("mmaq005")){member.setValidity(value);}
                //会员编号
                if(name.equals("mmaq003")){member.setMemberno(value);}
                //会员姓名
                if(name.equals("mmaf008")){member.setMembername(value);}
                //会员手机
                if(name.equals("mmaf014")){member.setMobile(value);}
                //会员积分
                if(name.equals("mmaq018")){member.setYpoint(Double.parseDouble(value));}
                //余额
                if(name.equals("mmaq009")){member.setCardvalue(Double.parseDouble(value));}
            }
            resultMap.setStatus("0");
            resultMap.setData(member);
            return;
        }
        resultMap.setStatus("999");
        resultMap.setErrorMsg("解析返回值出错");

    }
}
