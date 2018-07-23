package com.site.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-07-03.
 */
public class testList {
    @Test
    public void test(){
        List<UserClass> userClasses = new ArrayList<UserClass>();
        UserClass userClass = new UserClass();
        userClass.setUserName("lzm");
        userClass.setUserno("1001");
        userClasses.add(userClass);

    }
}
