package com.site.webService.memberInfoGet;

import com.site.entity.ResultMap;
import com.site.webService.WsUtil;
import net.sf.json.JSONObject;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

/**
 * Created by Administrator on 2017/4/24.
 */
public class MemberInfoGet extends WsUtil {
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
        Field1E.addAttribute("name","ooef001");
        //分店
        Field1E.addAttribute("value",this.getMap().get("shop").toString());
        //卡号或手机号
        Element Field2E = RecordE.addElement("Field");
        Field2E.addAttribute("name","mmaq001");

        Field2E.addAttribute("value",this.getMap().get("code").toString());
        return RequestE.asXML();
    }

    public void extraResponseContent(JSONObject jsonObject, ResultMap resultMap) {

    }
}
