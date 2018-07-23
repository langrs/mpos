package com.site.service;

import net.sf.json.JSONObject;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by langrs on 2016-10-26.
 */
public class test {
    @Test
    public  void test(){
        Double ak48;
        ak48 = 23.88421;
        Double ak47 = roundVal(ak48);
        System.out.print(ak47);
    }
    private Double roundVal(Double value){
        if(value != null){
            return new BigDecimal(value).setScale(2,RoundingMode.HALF_UP).doubleValue();
        }else{
            return null;
        }
    }
}
