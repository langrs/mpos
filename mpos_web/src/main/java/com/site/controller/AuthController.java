package com.site.controller;

import com.site.core.base.BaseController;
import com.site.entity.Nav;
import com.site.service.NavService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <pre>
 * 对象功能:auth Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-25 11:15:11
 * </pre>
 */


@Controller
@RequestMapping(value = "auth/")
public class AuthController extends BaseController {
	@Resource
	NavService navService;
	// denied-page表示权限不够时显示的页面
	@RequestMapping(value = "denied.do")
	public String denied(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "/auth/denied";
	}
	
	// index
	@RequestMapping(value = "index.do")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "/index";
	}
	
	// 左边菜单
	@RequestMapping(value = "tree.do")
	public String tree(HttpServletRequest request, HttpServletResponse response, Model model) {
		List<Nav> all = navService.getByParent(0L);
		for (Nav nav : all) {
			List<Nav> chirldList=navService.getByParent(nav.getId());
			nav.setChirldList(chirldList);
		}
		model.addAttribute("navList", all);
		return "/tree";
	}
	
	// 首页右边内容
	@RequestMapping(value = "right.do")
	public String right(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "/right";
	}

	@RequestMapping(value = "login.do")
	public String login(@RequestParam(value = "error", required = false) boolean error, ModelMap model) {
		if (error == true) {
			model.put("error", "用户名或是密码输入错误!");
		} else {
			model.put("error", "");
		}
		return "/auth/login";
	}

}
