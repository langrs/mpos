package com.site.webService.singleCardGet;

import com.site.entity.ResultMap;
import com.site.entity.respon.CardQueryResult;
import com.site.entity.respon.Member;
import com.site.webService.WsUtil;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
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
        Field1E.addAttribute("name", "type");
        Field1E.addAttribute("value", this.getMap().get("type").toString());
        //分店
        Element Field2E = RecordE.addElement("Field");
        Field2E.addAttribute("name", "ooef001");
        Field2E.addAttribute("value", this.getMap().get("shop").toString());
        //卡号
        Element Field3E = RecordE.addElement("Field");
        Field3E.addAttribute("name", "mmaq001");
        Field3E.addAttribute("value", this.getMap().get("code").toString());
        //需要充值金额
        Element Field4E = RecordE.addElement("Field");
        Field4E.addAttribute("name", "mmau009");
        Field4E.addAttribute("value", this.getMap().get("amt").toString());
        //卡密码
        Element Field5E = RecordE.addElement("Field");
        Field5E.addAttribute("name", "mmaq004");
        Field5E.addAttribute("value", this.getMap().get("passwd").toString());
        return RequestE.asXML();
    }

    public void extraResponseContent(String content, ResultMap resultMap) {
        Document document = null;
        try {
            document = DocumentHelper.parseText(content);
            Element root = document.getRootElement();
            CardQueryResult cardQueryResult = new CardQueryResult();
            List<Element> elements = root.element("ResponseContent").element("Document").element("RecordSet").
                    element("Master").element("Record").elements();
            //循环Field
            for (Element filedE : elements) {
                String fieldname = filedE.attributeValue("name");
                String fieldvalue = filedE.attributeValue("value");
                //卡号
                if (fieldname.equals("mmaq001")) {
                    cardQueryResult.setCardno(fieldvalue);
                }
                //卡种
                if (fieldname.equals("mmaq002")) {
                    cardQueryResult.setCtno(fieldvalue);
                }
                //有效期
                if (fieldname.equals("mmaq005")) {
                    cardQueryResult.setValidity(fieldvalue);
                }
                //会员编号
                if (fieldname.equals("mmaq003")) {
                    cardQueryResult.setMemberno(fieldvalue);
                }
                //会员姓名
                if (fieldname.equals("mmaf008")) {
                    cardQueryResult.setMembername(fieldvalue);
                }
                //会员手机
                if (fieldname.equals("mmaf014")) {
                    cardQueryResult.setMobile(fieldvalue);
                }
                //会员积分
                if (fieldname.equals("mmaq018")) {
                    cardQueryResult.setPoints(Double.parseDouble(fieldvalue));
                }
                //余额
                if (fieldname.equals("mmaq009")) {
                    cardQueryResult.setAmt(Double.parseDouble(fieldvalue));
                }
            }
            resultMap.setStatus("0");
            resultMap.setData(cardQueryResult);

        } catch (Exception e) {
            e.getStackTrace();
            resultMap.setStatus("999");
            resultMap.setErrorMsg("解析错误");
        }
    }
}
