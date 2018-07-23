package com.site.controller;

import com.site.entity.THycardInfo;
import com.site.service.THycardInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by langrs on 2016-07-01.
 */
@Controller
public class PageController {

    @Resource
//    TShopService tShopService;
            THycardInfoService tHycardInfoService;

    @RequestMapping(value = "show.do")
    public String show(Model model){
        List<THycardInfo> list1 = tHycardInfoService.getAll();
        for(int i =0;i<list1.size();i++){
            THycardInfo tHycardInfo = list1.get(i);
            System.out.println("this is vip info:" + tHycardInfo.getCustName());
        }
        model.addAttribute("list",list1);
        return "/show";
    }
}
