package com.site.test;

import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by langrs on 2017-03-31.
 * Usage:
 */
public class LzmTest {

    @Test
    public void test1(){
        System.out.println(new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(new Date()));
    }
    @Test
    public void test(){
        String xml = "<response>\n" +
                "    <code>019</code>\n" +
                "    <message>平台返回同步结果</message>\n" +
                "    <reqid>981c4c4f-cfc9-4ea3-98ca-38724e8eccaa</reqid>\n" +
                "    <srvver>1.0</srvver>\n" +
                "    <srvcode>000</srvcode>\n" +
                "    <payload>\n" +
                "        <param key=\"data\" type=\"XML\">\n" +
                "            <Response>\n" +
                "                <Execution>\n" +
                "                    <Status code=\"0\" sqlcode=\"0\" description=\"\"/>\n" +
                "                </Execution>\n" +
                "                <ResponseContent>\n" +
                "                    <Parameter/>\n" +
                "                    <Document>\n" +
                "                        <RecordSet id=\"1\">\n" +
                "                            <Master name=\"rtif_t\" node_id=\"1\">\n" +
                "                                <Record>\n" +
                "                                    <Detail name=\"gcao_q\" node_id=\"1_1\">\n" +
                "                                        <Record>\n" +
                "                                            <Field name=\"gcao005\" value=\"4\"/>\n" +
                "                                            <Field name=\"gcao002\" value=\"2017041901\"/>\n" +
                "                                            <Field name=\"oocql004\" value=\"100元\"/>\n" +
                "                                            <Field name=\"gcao001\" value=\"90000260\"/>\n" +
                "                                            <Field name=\"gcao100\" value=\"a9cf3753-693c-4d0f-a6c8-24f3a41ffaed\"/>\n" +
                "                                        </Record>\n" +
                "                                        <Record>\n" +
                "                                            <Field name=\"gcao005\" value=\"4\"/>\n" +
                "                                            <Field name=\"gcao002\" value=\"2017041901\"/>\n" +
                "                                            <Field name=\"oocql004\" value=\"100元\"/>\n" +
                "                                            <Field name=\"gcao001\" value=\"90000260\"/>\n" +
                "                                            <Field name=\"gcao100\" value=\"a9cf3753-693c-4d0f-a6c8-24f3a41ffaed\"/>\n" +
                "                                        </Record>\n" +
                "                                    </Detail>\n" +
                "                                </Record>\n" +
                "                            </Master>\n" +
                "                        </RecordSet>\n" +
                "                    </Document>\n" +
                "                </ResponseContent>\n" +
                "            </Response>\n" +
                "        </param>\n" +
                "    </payload>\n" +
                "</response>";
        try{
            Document document = DocumentHelper.parseText(xml);
            Element root = document.getRootElement();
            Element srvcodeE = root.element("srvcod1e");
            if(srvcodeE == null){
                System.out.println("null object");
            }else{
                System.out.println("ok");
            }
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}