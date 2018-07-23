package com.site.webService.SingleCouponGet;

import com.site.entity.ResultMap;
import com.site.entity.respon.CouponQueryResult;
import com.site.entity.respon.Member;
import com.site.webService.WsUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

import java.util.List;

/**
 * Created by langrs on 2017-04-22.
 * Usage: */
public class SingleCouponGet extends WsUtil {
    public String makeBody() {
        Element RequestE = new DOMElement("Request");
        //RequestContent
        Element RequestContentE = RequestE.addElement("RequestContent");
        //Parameter
        Element ParameterE = RequestContentE.addElement("Parameter");
        //Record
        Element RecordE = ParameterE.addElement("Record");
        //Record -Field
        Element Field1E = RecordE.addElement("Field");
        Field1E.addAttribute("name","Type");
        //类型:1销售前查询,2销退前查询
        Field1E.addAttribute("value",this.getMap().get("type").toString());
        Element Field2E = RecordE.addElement("Field");
        Field2E.addAttribute("name","ooef001");
        //分店
        Field2E.addAttribute("value",this.getMap().get("shop").toString());
        Element Field3E = RecordE.addElement("Field");
        Field3E.addAttribute("name","gcao001");
        //券号
        Field3E.addAttribute("value",this.getMap().get("couponno").toString());
        return RequestE.asXML();
    }
    //内容部分
    public void extraResponseContent(String content, ResultMap resultMap) {
        Document document = null;
        try {
            document = DocumentHelper.parseText(content);
            Element root = document.getRootElement();
            CouponQueryResult couponQueryResult = new CouponQueryResult();
            List<Element> elements = root.element("ResponseContent").element("Document").element("RecordSet").
                    element("Master").element("Record").elements();
            //循环Field
            for (Element filedE : elements) {
                String fieldname = filedE.attributeValue("name");
                String fieldvalue = filedE.attributeValue("value");
                //券种
                if(fieldname.equals("gcao002")){couponQueryResult.setGiftctf(fieldvalue);}
                //券号
                if(fieldname.equals("gcao001")){couponQueryResult.setCouponno(fieldvalue);}
                //券名称
                if(fieldname.equals("gcao003")){couponQueryResult.setCouponname(fieldvalue);}
                //券金额
                if(fieldname.equals("gcao004")){couponQueryResult.setAmt(Double.parseDouble(fieldvalue));}
                //生效日期
                if(fieldname.equals("gcao008")){couponQueryResult.setStartdate(fieldvalue);}
                //失效日期
                if(fieldname.equals("gcao009")){couponQueryResult.setEnddate(fieldvalue);}
            }
            resultMap.setStatus("0");
            resultMap.setData(couponQueryResult);

        } catch (Exception e) {
            e.getStackTrace();
            resultMap.setStatus("999");
            resultMap.setErrorMsg("解析错误");
        }
    }
}