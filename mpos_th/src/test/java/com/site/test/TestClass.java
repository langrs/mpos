package com.site.test;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Ignore;

import java.io.File;
import java.util.List;

/**
 * Created by langrs on 2017-03-14.
 */
public class TestClass {

    String tmp;
    String xml;

    @Before
    public void setParm() {
        tmp = "ok";
        xml = "";
    }
    //解析xml文件
    @Ignore
    public void extraXml(){
        Document document = null;
        String url = "c:/text.xml";
        try {
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(url));  //读取XML文件,获得document对象
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //
        Element root = document.getRootElement();
        getNodes(root);
//        for (Iterator i = root.elementIterator(); i.hasNext();) {
//            Element el = (Element) i.next();
//            System.out.println("pring:"+el.asXML());
//        }

    }
    /**
     * 从指定节点开始,递归遍历所有子节点
     * @author chenleixing
     */
    public void getNodes(Element node){
        System.out.println("--------------------");

        //当前节点的名称、文本内容和属性
        System.out.println("当前节点名称："+node.getName());//当前节点名称
        System.out.println("当前节点的内容："+node.getTextTrim());//当前节点名称
        List<Attribute> listAttr=node.attributes();//当前节点的所有属性的list
        for(Attribute attr:listAttr){//遍历当前节点的所有属性
            String name=attr.getName();//属性名称
            String value=attr.getValue();//属性的值
            System.out.println("属性名称："+name+"属性值："+value);
        }

        //递归遍历当前节点所有的子节点
        List<Element> listElement=node.elements();//所有一级子节点的list
        for(Element e:listElement){//遍历所有一级子节点
            this.getNodes(e);//递归
        }
    }

    //生成xml
//    @Ignore
//    public void buildXml(){
//
//
//        String fileName="c:/text.xml";
//        String shop = null;
//        String date = null;
//        String name = null;
//        String ip1 = "10.20.86.220";
//        String ip2 = "172.169.10.76";
//        String md5str = null;
//        //赋值
//        shop ="1002";
//        name = "SingleCouponGet";
//
//        Document document= DocumentHelper.createDocument();//建立document对象，用来操作xml文件
//        Element requestElement=document.addElement("request");//建立根节点
//        requestElement.addAttribute("type","sync");
//
//        //md5的内容
//        Element hostE = requestElement.addElement("host");
//        hostE.addAttribute("prod","MOBILEPAY");
//        hostE.addAttribute("ver","3.0");
//        hostE.addAttribute("ip",ip1);
//        hostE.addAttribute("id","");
//        hostE.addAttribute("lang","zh_CN");
//        hostE.addAttribute("timezone","+8");
//        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//        date = sf.format(new Date());
//        hostE.addAttribute("timestamp",date);
//        hostE.addAttribute("acct","tiptop");
//        hostE.addAttribute("shop",shop);
//        hostE.addAttribute("mach","001");
//        //server
//        Element serviceE = requestElement.addElement("service");
//        serviceE.addAttribute("prod","T100");
//        serviceE.addAttribute("name",name);
//        serviceE.addAttribute("srvv","1.0");
//        serviceE.addAttribute("ip",ip2);
//        md5str = hostE.asXML() + serviceE.asXML();
//        try {
//            // 生成一个MD5加密计算摘要
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            // 计算md5函数
//            md.update(md5str.getBytes());
//            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
//            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
//            String key = new BigInteger(1, md.digest()).toString(16);
//            //md5的key值
//            requestElement.addAttribute("key",key);
//        } catch (Exception e) {
//        }
//        //datakey
//        Element datakeyE = requestElement.addElement("datakey");
//        datakeyE.addAttribute("type","FOM");
//        //datakey -key1
//        Element datakeyKey1E = datakeyE.addElement("key");
//        datakeyKey1E.addAttribute("name","EntId");
//        datakeyKey1E.addText("10");
//        //datakey -key2
//        Element datakeyKey2E = datakeyE.addElement("key");
//        datakeyKey2E.addAttribute("name","CompanyId");
//        datakeyKey2E.addText(shop);
//        //payload
//        Element payloadE = requestElement.addElement("payload");
//        //param
//        Element paramE = payloadE.addElement("param");
//        paramE.addAttribute("key","data");
//        paramE.addAttribute("type","XML");
//        //Request
//        Element RequestE = paramE.addElement("Request");
//        //RequestContent
//        Element RequestContentE = RequestE.addElement("Request");
//        //Parameter
//        Element ParameterE = RequestContentE.addElement("RequestContent");
//        //Record
//        Element RecordE = ParameterE.addElement("Record");
//        //Record -Field
//        Element Field1E = RecordE.addElement("Field");
//        Field1E.addAttribute("name","Type");
//        Field1E.addAttribute("value","1");
//        Element Field2E = RecordE.addElement("Field");
//        Field2E.addAttribute("name","ooef001");
//        //分店
//        Field2E.addAttribute("value",shop);
//        Element Field3E = RecordE.addElement("Field");
//        Field3E.addAttribute("name","gcao001");
//        //券号
//        Field3E.addAttribute("value","1");
//
//        System.out.println(requestElement.asXML());

//        booksElement.addComment("This is a test for dom4j ");//加入一行注释
//        Element bookElement=booksElement.addElement("book");//添加一个book节点
//        bookElement.addAttribute("show","yes");//添加属性内容
//        Element titleElement=bookElement.addElement("title");//添加文本节点
//        titleElement.setText("ajax in action");//添加文本内容
//        System.out.println(document.asXML());
//        try {
//            XMLWriter writer = new XMLWriter(new FileWriter(new File(fileName)));
//            writer.write(document);
//            writer.close();
//        }catch (Exception e){
//
//        }
//    }
//    public void parserXml(String fileName) {
//        File inputXml=new File(fileName);
//        SAXReader saxReader = new SAXReader();
//        try {
//            Document document = saxReader.read(inputXml);
//            Element employees=document.getRootElement();
//            for(Iterator i = employees.elementIterator(); i.hasNext();){
//                Element employee = (Element) i.next();
//                for(Iterator j = employee.elementIterator(); j.hasNext();){
//                    Element node=(Element) j.next();
//                    System.out.println(node.getName()+":"+node.getText());
//                }
//            }
//        } catch (DocumentException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("dom4j parserXml");
    }

