package com.site.webService;

import com.site.entity.ResultMap;
import com.site.webService.call.IntegrationEntry;
import com.site.webService.call.IntegrationEntry_Service;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;

/**
 * Created by langrs on 2017-04-22.
 * Usage:工具类来调生成webservice的调用参数和解析返回的xml数据内容
 */
public class XmlUtil {
    private static final QName SERVICE_NAME = new QName("http://entry.serviceengine.cross.digiwin.com", "IntegrationEntry");

    //调用webservice接口
    //传入需要调用的具体接口类,例如需要调用查询券接口,则出入券接口实现类
    public static ResultMap callWebservice(WsUtil wsUtil) {
        URL wsdlURL = IntegrationEntry_Service.WSDL_LOCATION;
        IntegrationEntry_Service ss = new IntegrationEntry_Service(wsdlURL, SERVICE_NAME);
        IntegrationEntry port = ss.getIntegrationEntry();

        String xml = wsUtil.makeRequireParm();
        System.out.println("这个是请求参数:" + xml);
        String responseStr = port.invokeSrv(xml);
        System.out.println("这个是返回值:" + responseStr);
        //返回webservice调用后的解析对象
        ResultMap resultMap = wsUtil.extraResponse(responseStr);
        return resultMap;
    }

    //md5加密
    //MD5加密字符串,返回加密后的32位大写的key值
    public static String makeKey(String xmlStr) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(xmlStr.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            String key = new BigInteger(1, md.digest()).toString(16);
            //md5的key值(大写)
            return key.toUpperCase();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }

    //字符串转为xml的Document对象
    public static Document string2Doc(String xmlStr) {
        try {
            Document doc = DocumentHelper.parseText(xmlStr);
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //xml串转换为json
    public static String xml2json(String xmlStr) {
        JSONObject xmlJSONObj = XML.toJSONObject(xmlStr);
        //设置缩进
        return xmlJSONObj.toString(4);
    }

}
