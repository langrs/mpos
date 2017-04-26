package com.site.webService;

import com.site.entity.ResultMap;
import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * Created by langrs on 2017-04-22.
 * Usage:
 */
public abstract class WsUtil {
    private static final String ip1 = "10.20.86.220";
    private static final String ip2 = "172.169.10.76";
    //其中包括了调用的函数名称,分店编号
    Map<String,Object> map;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    //生成请求参数:包括了头部,加密key,实体部分(抽象类,由子类来实现,因为每个接口的调用参数的实体都不一样)
    public String makeRequireParm(){
        //分店
        String shop = map.get("shop").toString();
        //函数名称
        String func = map.get("func").toString();

        //模式
        String mode = null;
        if(map.containsKey("Mode")){
            mode = map.get("Mode").toString();
        }

        //生成实体部分,然后把实体部分包括进去CDATA
        Document document= DocumentHelper.createDocument();//建立document对象，用来操作xml文件
        Element requestElement=document.addElement("request");//建立根节点
        requestElement.addAttribute("type","sync");
        //md5的内容
        Element hostE = requestElement.addElement("host");
        hostE.addAttribute("prod","MOBILEPAY");
        hostE.addAttribute("ver","3.0");
        hostE.addAttribute("ip",ip1);
        hostE.addAttribute("id","");
        hostE.addAttribute("lang","zh_CN");
        hostE.addAttribute("timezone","+8");
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        hostE.addAttribute("timestamp",sf.format(new Date()));
        hostE.addAttribute("acct","tiptop");
        hostE.addAttribute("shop",shop);
        hostE.addAttribute("mach","001");
        //server
        Element serviceE = requestElement.addElement("service");
        serviceE.addAttribute("prod","T100");
        serviceE.addAttribute("name",func);
        serviceE.addAttribute("srvver","1.0");
        serviceE.addAttribute("ip",ip2);
        String md5str = hostE.asXML() + serviceE.asXML();
        //写入请求头的key值,通过MD5加密
        requestElement.addAttribute("key",XmlUtil.makeKey(md5str));
        //datakey
        Element datakeyE = requestElement.addElement("datakey");
        datakeyE.addAttribute("type","FOM");
        //datakey -key1
        Element datakeyKey1E = datakeyE.addElement("key");
        datakeyKey1E.addAttribute("name","EntId");
        datakeyKey1E.addText("10");
        //datakey -key2
        Element datakeyKey2E = datakeyE.addElement("key");
        datakeyKey2E.addAttribute("name","CompanyId");
        datakeyKey2E.addText(shop);
        //datakey -key3
        Element datakeyKey3E = datakeyE.addElement("key");
        datakeyKey3E.addAttribute("name","GUID");
        datakeyKey3E.addText(UUID.randomUUID().toString());
        //datakey -key4
        //如果是交易支付的话,需要增加MODE ,0正常模式1训练模式
        if(func.equals("PaymentProcess") || func.equals("GiftProcess")){
            Element datakeyKey4E = datakeyE.addElement("key");
            datakeyKey4E.addAttribute("name","Mode");
            datakeyKey4E.addText(mode);
        }
        //payload
        Element payloadE = requestElement.addElement("payload");
        //param
        Element paramE = payloadE.addElement("param");
        paramE.addAttribute("key","data");
        paramE.addAttribute("type","XML");
        //////////////////////////生成请求实体部分/////////////////////////////////
        String requestBody = makeBody();
        //最后处理CDATA,注意追加的element位置
        paramE.addCDATA(requestBody);
        return document.asXML();
    }
    //判断返回的参数是否属于有效或返回正确,因为这个部分的判断有共性,所以抽离出来
    public ResultMap extraResponse(String xmlStr){
        ResultMap<String> resultMap = new ResultMap<String>();
        //将xml返回串解析为jison串
        String jsonStr = XmlUtil.xml2json(xmlStr);
        //判断返回的头文件中的srvcode是否为000
        try {
            JSONObject json_obj = JSONObject.fromObject(jsonStr);
            JSONObject response_json = json_obj.getJSONObject("response");
            //分解出来srvcode
            String srvcode = response_json.getString("srvcode");
            if (srvcode == null || !srvcode.equals("000") || srvcode.equals("")){
                resultMap.setStatus("999");
                resultMap.setErrorMsg("返回异常");
                return resultMap;
            }
            //分解出来CDATA中包含的xml
            String xmlExtra = response_json.getJSONObject("payload").getJSONObject("param").get("content").toString();
            //重新把分解出来的xml又转换为json串
            String str = XmlUtil.xml2json(xmlExtra);
            //重新解析json串,
            JSONObject json_body = JSONObject.fromObject(str);
            //分解出code
            JSONObject json_Status = json_body.getJSONObject("Response").getJSONObject("Execution").getJSONObject("Status");
            String code = json_Status.getString("code");
            if(code != null && !code.equals("0")){
                resultMap.setStatus(code);
                resultMap.setErrorMsg(json_Status.getString("description"));
                return resultMap;
            }
            //调用实体部分解析
            extraResponseContent(json_body,resultMap);
        }catch(Exception e){

        }

        return resultMap;
    }
    //生成请求参数的实体部分
    public abstract String makeBody();
    //解析webservice的返回参数,内容部分
    public abstract void extraResponseContent(JSONObject jsonObject, ResultMap resultMap);
}
