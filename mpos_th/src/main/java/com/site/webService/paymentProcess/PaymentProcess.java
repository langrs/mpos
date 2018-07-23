package com.site.webService.paymentProcess;

import com.site.entity.ResultMap;
import com.site.webService.WsUtil;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/24.
 */
public class PaymentProcess extends WsUtil {
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
        //应收金额
        Element Field4E = Record1E.addElement("Field");
        Field4E.addAttribute("name", "rtia049");
        Field4E.addAttribute("value", this.getMap().get("amt").toString());
        //1.判断是否涉及储值卡处理
        if (this.getMap().containsKey("mmau_t_8")) {
            Element DetailE = Record1E.addElement("Detail");
            DetailE.addAttribute("name", "mmau_t_8");
            List<Map<String, String>> list = (List<Map<String, String>>) this.getMap().get("mmau_t_8");
            for (int i = 0; i < list.size(); i++) {
                Element Record2E = DetailE.addElement("Record");
                //卡号
                Element f1 = Record2E.addElement("Field");
                f1.addAttribute("name", "mmau001");
                f1.addAttribute("value", list.get(i).get("mmau001"));
                //密码
                Element f2 = Record2E.addElement("Field");
                f2.addAttribute("name", "mmaq004");
                f2.addAttribute("value", list.get(i).get("mmaq004"));
                //校验码
                Element f3 = Record2E.addElement("Field");
                f3.addAttribute("name", "mmaqua001");
                f3.addAttribute("value", list.get(i).get("mmaqua001"));
                //异动金额
                Element f4 = Record2E.addElement("Field");
                f4.addAttribute("name", "mmau009");
                f4.addAttribute("value", list.get(i).get("mmau009"));
                //UUDI
                Element f5 = Record2E.addElement("Field");
                f5.addAttribute("name", "mmau100");
                f5.addAttribute("value", list.get(i).get("mmau100"));
            }
        }
        //2.积分处理
        if (this.getMap().containsKey("mmar_t")) {
            Element DetailE = Record1E.addElement("Detail");
            DetailE.addAttribute("name", "mmar_t");
            Map<String, String> map = (Map<String, String>) this.getMap().get("mmar_t");
            Element Record2E = DetailE.addElement("Record");
            //异动类型:A销售单，B.积点抵现
            Element f1 = Record2E.addElement("Field");
            f1.addAttribute("name", "mmar004");
            f1.addAttribute("value", map.get("mmar004"));
            //卡号
            Element f2 = Record2E.addElement("Field");
            f2.addAttribute("name", "mmar001");
            f2.addAttribute("value", map.get("mmar001"));
            //异动金额
            Element f3 = Record2E.addElement("Field");
            f3.addAttribute("name", "mmar008");
            f3.addAttribute("value", map.get("mmar008"));
            //异动积分
            Element f4 = Record2E.addElement("Field");
            f4.addAttribute("name", "mmar009");
            f4.addAttribute("value", map.get("mmar009"));
            //UUDI
            Element f5 = Record2E.addElement("Field");
            f5.addAttribute("name", "mmar100");
            f5.addAttribute("value", map.get("mmar100"));
        }
        //3.券核销
        if (this.getMap().containsKey("gcao_t")) {
            Element DetailE = Record1E.addElement("Detail");
            DetailE.addAttribute("name", "gcao_t");
            List<Map<String, String>> list = (List<Map<String, String>>) this.getMap().get("gcao_t");
            for (int i = 0; i < list.size(); i++) {
                Element Record2E = DetailE.addElement("Record");
                //流转状态
                Element f1 = Record2E.addElement("Field");
                f1.addAttribute("name", "gcao005");
                f1.addAttribute("value", list.get(i).get("gcao005"));
                //开始券号
                Element f2 = Record2E.addElement("Field");
                f2.addAttribute("name", "gcao001_1");
                f2.addAttribute("value", list.get(i).get("gcao001_1"));
                //结束券号
                Element f3 = Record2E.addElement("Field");
                f3.addAttribute("name", "gcao001_2");
                f3.addAttribute("value", list.get(i).get("gcao001_2"));
                //uuid
                Element f4 = Record2E.addElement("Field");
                f4.addAttribute("name", "gcao100");
                f4.addAttribute("value", list.get(i).get("gcao100"));
            }
        }
        return RequestE.asXML();
    }

    //不做返回值的判断,只是判断code即可
    public void extraResponseContent(String content, ResultMap resultMap) {

        resultMap.setStatus("0");
        return;
    }
}
