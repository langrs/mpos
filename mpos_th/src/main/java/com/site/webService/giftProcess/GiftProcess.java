package com.site.webService.giftProcess;

import com.site.entity.ResultMap;
import com.site.entity.respon.Member;
import com.site.webService.SingleCouponGet.SingleCouponGetField;
import com.site.webService.WsUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/26.
 */
public class GiftProcess extends WsUtil {
    public String makeBody() {
        Element RequestE = new DOMElement("Request");
        //RequestContent
        Element RequestContentE = RequestE.addElement("RequestContent");
        //Parameter
        Element ParameterE = RequestContentE.addElement("Parameter");
        //Record
        Element RecordE = ParameterE.addElement("Record");
        //Document
        Element DocumentE = RequestContentE.addElement("Document");
        //RecordSet
        Element RecordSetE = DocumentE.addElement("RecordSet");
        RecordSetE.addAttribute("id", "1");
        //Master
        Element MasterE = RecordSetE.addElement("Master");
        MasterE.addAttribute("name", "rtif_t");
        //Record1
        Element Record1E = MasterE.addElement("Record");
        //设置请求
        //Record -Field
        //单据类型:1、销售单 2.充值
        Element Field1E = Record1E.addElement("Field");
        Field1E.addAttribute("name", "Type");
        Field1E.addAttribute("value", this.getMap().get("Type").toString());
        //分店
        Element Field2E = Record1E.addElement("Field");
        Field2E.addAttribute("name", "ooef001");
        Field2E.addAttribute("value", this.getMap().get("shop").toString());
        //销售单号
        Element Field3E = Record1E.addElement("Field");
        Field3E.addAttribute("name", "rtiadocno");
        Field3E.addAttribute("value", this.getMap().get("saleno").toString());
        //1.判断是否涉及送卡操作
        if (this.getMap().containsKey("mmaq_t")) {
            Element DetailE = Record1E.addElement("Detail");
            DetailE.addAttribute("name", "mmaq_t");
            List<Map<String, String>> list = (List<Map<String, String>>) this.getMap().get("mmaq_t");
            for (int i = 0; i < list.size(); i++) {
                Element Record2E = DetailE.addElement("Record");
                //卡状态
                Element f1 = Record2E.addElement("Field");
                f1.addAttribute("name", "mmaq006");
                f1.addAttribute("value", list.get(i).get("mmaq006"));
                //卡号
                Element f2 = Record2E.addElement("Field");
                f2.addAttribute("name", "mmaq001");
                f2.addAttribute("value", list.get(i).get("mmaq001"));
                //卡种编号
                Element f3 = Record2E.addElement("Field");
                f3.addAttribute("name", "mmaq002");
                f3.addAttribute("value", list.get(i).get("mmaq002"));
                //密码
                Element f4 = Record2E.addElement("Field");
                f4.addAttribute("name", "mmaq004");
                f4.addAttribute("value", list.get(i).get("mmaq004"));
                //校验密码
                Element f10 = Record2E.addElement("Field");
                f10.addAttribute("name", "mmaqua001");
                f10.addAttribute("value", list.get(i).get("mmaqua001"));
                //储值金额
                Element f5 = Record2E.addElement("Field");
                f5.addAttribute("name", "mmau009");
                f5.addAttribute("value", list.get(i).get("mmau009"));
                //实际储值金额
                Element f6 = Record2E.addElement("Field");
                f6.addAttribute("name", "mmau009_1");
                f6.addAttribute("value", list.get(i).get("mmau009_1"));
                //送抵现值
                Element f7 = Record2E.addElement("Field");
                f7.addAttribute("name", "mmau013");
                f7.addAttribute("value", list.get(i).get("mmau013"));
                //储值成本
                Element f8 = Record2E.addElement("Field");
                f8.addAttribute("name", "mmau014");
                f8.addAttribute("value", list.get(i).get("mmau014"));
                //UUDI
                Element f9 = Record2E.addElement("Field");
                f9.addAttribute("name", "mmaq100");
                f9.addAttribute("value", list.get(i).get("mmaq100"));
            }
        }
        //2.赠送券处理
        if (this.getMap().containsKey("gcao_q")) {
            Element DetailE = Record1E.addElement("Detail");
            DetailE.addAttribute("name", "gcao_q");
            List<Map<String, String>> list = (List<Map<String, String>>) this.getMap().get("gcao_q");
            for (int i = 0; i < list.size(); i++) {

                Element Record2E = DetailE.addElement("Record");
                //流转状态:4.发售
                Element f1 = Record2E.addElement("Field");
                f1.addAttribute("name", "gcao005");
                f1.addAttribute("value", list.get(i).get("gcao005"));
                //券种
                Element f2 = Record2E.addElement("Field");
                f2.addAttribute("name", "gcao002");
                f2.addAttribute("value", list.get(i).get("gcao002"));
                //数量
                Element f3 = Record2E.addElement("Field");
                f3.addAttribute("name", "gcbi005");
                f3.addAttribute("value", list.get(i).get("gcbi005"));
                //uuid
                Element f4 = Record2E.addElement("Field");
                f4.addAttribute("name", "gcao100");
                f4.addAttribute("value", list.get(i).get("gcao100"));
            }
        }
        return RequestE.asXML();
    }

    public void extraResponseContent(JSONObject jsonObject, ResultMap resultMap) {
        JSONObject json = jsonObject.getJSONObject("Response").getJSONObject("ResponseContent").
                getJSONObject("Document").getJSONObject("RecordSet").getJSONObject("Master").getJSONObject("Record");
        //尝试看看是否为数组,因为可能返回的只是一个结果,比如赠送卡或者赠送券,那么用getJSONArray就只能抛出异常了
        JSONArray jsonArray = json.optJSONArray("Detail");
        if(jsonArray != null){
//            List<DetailResult> detailResults = (List<DetailResult>) JSONArray.toCollection(jsonArray, DetailResult.class);

        }else{
            JSONObject json1 = json.getJSONObject("Detail");

            //转换成对象
            try {
                DetailResult detailResults = (DetailResult) JSONObject.toBean(json1, DetailResult.class);
            }catch (Exception e){
                e.getStackTrace();
            }
            String ak47;

        }
//        JSONArray json = jsonObject.getJSONObject("Response").getJSONObject("ResponseContent").
//                getJSONObject("Document").getJSONObject("RecordSet").getJSONObject("Master").getJSONArray("Record");
//        List<GiftProcessCard> giftProcessCards = (List<GiftProcessCard>) JSONArray.toCollection(json, GiftProcessCard.class);
//        if(giftProcessCards != null){
//            List<CardResult> cardResults = new ArrayList<CardResult>();
//            for(GiftProcessCard giftProcessCard:giftProcessCards){
//                String name = singleCouponGetField.getName();
//                String value = singleCouponGetField.getValue();
//                //卡号
//                if(name.equals("mmaq001")){member.setCardno(value);}
//                //卡种
//                if(name.equals("mmaq002")){member.setCtno(value);}
//                //有效期
//                if(name.equals("mmaq005")){member.setValidity(value);}
//                //会员编号
//                if(name.equals("mmaq003")){member.setMemberno(value);}
//                //会员姓名
//                if(name.equals("mmaf008")){member.setMembername(value);}
//                //会员手机
//                if(name.equals("mmaf014")){member.setMobile(value);}
//                //会员积分
//                if(name.equals("mmaq018")){member.setYpoint(Double.parseDouble(value));}
//                //余额
//                if(name.equals("mmaq009")){member.setCardvalue(Double.parseDouble(value));}
//            }
//            resultMap.setStatus("0");
//            resultMap.setData(member);
//            return;
//        }
        resultMap.setStatus("999");
        resultMap.setErrorMsg("解析返回值出错");
    }
}
