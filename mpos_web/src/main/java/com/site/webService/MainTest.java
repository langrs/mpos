package com.site.webService;

//import net.sf.json.JSONObject;

//import com.sun.java.util.jar.pack.Package;

/**
 * Created by langrs on 2016-07-15.
 */
public class MainTest {
    public static void main(String[] args) {

//        String json;
//        json = "{\"status\":\"100\",\"you\":{\"ok\":\"012\",\"yes\":\"0\"}}";
//        Gson gson = new Gson();
//        MainEntity mainEntity = gson.fromJson(json,MainEntity.class);
////        JSONObject json_obj = JSONObject.fromObject(json);
////        JSONObject saleHead_json = json_obj.getJSONObject("me");
////        MainEntity mainEntity = (MainEntity) JSONObjectSONObject.toBean(json_obj, MainEntity.class);
//
//        System.out.print(mainEntity.getMe().getOk());
        test();
    }

    public static void test(){
        String s ="0";
        if(!s.equals("1")){
            System.out.print("ok");
        }
    }

}
