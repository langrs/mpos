package com.site.webService.SingleCouponGet;

import com.site.entity.ResultMap;
import com.site.entity.respon.CouponQueryResult;
import com.site.webService.WsUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
    public void extraResponseContent(JSONObject jsonObject, ResultMap resultMap) {
        JSONArray json = jsonObject.getJSONObject("Response").getJSONObject("ResponseContent").
                getJSONObject("Document").getJSONObject("RecordSet").getJSONObject("Master").getJSONObject("Record").getJSONArray("Field");
        List<SingleCouponGetField> singleCouponGetFields = (List<SingleCouponGetField>) JSONArray.toCollection(json, SingleCouponGetField.class);
        if(singleCouponGetFields != null){
            CouponQueryResult couponQueryResult = new CouponQueryResult();
            for(SingleCouponGetField singleCouponGetField:singleCouponGetFields){
                String name = singleCouponGetField.getName();
                String value = singleCouponGetField.getValue();
                //券种
                if(name.equals("gcao002")){couponQueryResult.setGiftctf(value);}
                //券号
                if(name.equals("gcao001")){couponQueryResult.setCouponno(value);}
                //券名称
                if(name.equals("gcao003")){couponQueryResult.setCouponname(value);}
                //券金额
                if(name.equals("gcao004")){couponQueryResult.setAmt(Double.parseDouble(value));}
                //生效日期
                if(name.equals("gcao008")){couponQueryResult.setStartdate(value);}
                //失效日期
                if(name.equals("gcao009")){couponQueryResult.setEnddate(value);}
            }
            resultMap.setStatus("0");
            resultMap.setData(couponQueryResult);
            return;
        }
        resultMap.setStatus("999");
        resultMap.setErrorMsg("解析返回值出错");

    }
}