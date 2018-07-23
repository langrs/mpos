package com.site.webService.giftProcess;

import com.site.entity.ResultMap;
import com.site.webService.WsUtil;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

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

    public void extraResponseContent(String content, ResultMap resultMap) {
        Document document = null;
        List<CardResult> cardResults = null;
        List<CouponResult> couponResults = null;
        try {
            document = DocumentHelper.parseText(content);
            Element root = document.getRootElement();

            List<Element> elements = root.element("ResponseContent").element("Document").element("RecordSet").
                    element("Master").element("Record").elements();
            //循环Detail
            for (Element detailE : elements) {
                List<Element> element1s = detailE.elements();
                //循环Record
                for (Element recordE:element1s) {
                    List<Element> fields = recordE.elements();
                    String name = detailE.attributeValue("name");

                    if(name.equals("mmaq_t")){//储值卡
                        CardResult cardResult = new CardResult();
                        for (Element filedE:fields){
                            String fieldname = filedE.attributeValue("name");
                            String fieldvalue = filedE.attributeValue("value");
                            if(fieldname.equals("mmaq006")){
                                //卡状态
                                cardResult.setType(fieldvalue);
                            }else if(fieldname.equals("mmaq001")){
                                //卡号
                                cardResult.setCardno(fieldvalue);
                            }else if(fieldname.equals("mmaq043")){
                                //发行方式
                                cardResult.setIssue(fieldvalue);
                            }else if(fieldname.equals("mmaq004")){
                                //密码
                                cardResult.setPasswd(fieldvalue);
                            }else if(fieldname.equals("mmau009")){
                                //异动金额
                                cardResult.setAmt(fieldvalue);
                            }else if(fieldname.equals("mmau011")){
                            }else if(fieldname.equals("mmau012")){

                            }
                            cardResults.add(cardResult);
                        }
                    }else if(name.equals("gcao_q")) {//券处理
                        CouponResult couponResult = new CouponResult();
                        for (Element filedE : fields) {
                            String fieldname = filedE.attributeValue("name");
                            String fieldvalue = filedE.attributeValue("value");
                            if (fieldname.equals("gcao005")) {
                                //流转状态
                                couponResult.setType(fieldvalue);
                            }else if(fieldname.equals("gcao006")){
                                //发行方式
                                couponResult.setIssue(fieldvalue);
                            }else if(fieldname.equals("gcao002")){
                                //券种编号
                                couponResult.setCtno(fieldvalue);
                            }else if(fieldname.equals("oocql004")){
                                //面额
                                couponResult.setAmt(fieldvalue);
                            }else if(fieldname.equals("gcao001")){
                                //券编号
                                couponResult.setCouponno(fieldvalue);
                            }
                            couponResults.add(couponResult);
                        }
                    }

                }
            }
        }catch (Exception e){
            e.getStackTrace();
        }



    }
}
