package com.site.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by langrs on 2017-04-15.
 * Usage:会员卡,储值卡,券的操作
 */
@Controller
@RequestMapping(value = "card/")
@Api(value = "card", description = "卡券相关接口")
public class CardController {

    @ApiOperation(value = "卡查询", notes = "卡查询", httpMethod = "GET",
            produces = "application/json; charset=utf-8", response = String.class)
    @RequestMapping(value = "cardQuery")
    @ResponseBody
    public void cardQuery(){

    }

}
