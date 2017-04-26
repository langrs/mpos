package com.site.test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by langrs on 2017-03-31.
 * Usage:
 */
public class LzmTest {
    protected Lzm lzm ;
    @Before
    public void bbb(){
        lzm = new Lzm();
        lzm.setAk7("1");
        lzm.setLzm("2");
    }
    @Test
    public void getAk7() throws Exception {
        lzm.getAk7().equals(1);
    }

    @Test
    public void getLzm() throws Exception {

    }

}