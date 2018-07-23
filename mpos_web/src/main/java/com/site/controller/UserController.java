package com.site.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.core.annotation.Myannotation;
import com.site.core.base.BaseController;
import com.site.core.mybatis.QueryMap;
import com.site.entity.User;
import com.site.service.UserService;
import com.site.util.BeanToMap;

/**
 * <pre>
 * 对象功能:user Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 * </pre>
 */

@Controller
@RequestMapping(value = "user/")
public class UserController extends BaseController {

	@Resource
	private UserService userService;

	@Myannotation(description = "用户列表")
	@RequestMapping(value = "list.do")
	public String list(User user, HttpServletRequest request, HttpServletResponse response, Model model, Boolean dialog) {
		List<User> list = userService.search(BeanToMap.beanToMap(user));
		model.addAttribute("list", list);
		model.addAttribute("user", user);
		model.addAttribute("current", "user");
		if (dialog != null && dialog) {
			return "/user/dialog";
		} else {
			return "/user/list";
		}
	}

	@Myannotation(description = "用户详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		User user = userService.get(id);
		model.addAttribute("user", user);
		model.addAttribute("current", "user");
		return "/user/view";
	}

	@Myannotation(description = "用户更新")
	@RequestMapping(value = "/edit.do")
	public String edit(Long id, Model model) {
		User user = userService.get(id);
		model.addAttribute("user", user);
		model.addAttribute("current", "user");
		return "/user/add";
	}

	@Myannotation(description = "用户新增")
	@RequestMapping(value = "add.do")
	public String add(User user, Model model) {
		user.setId(0L);
		model.addAttribute("user", user);
		return "/user/add";
	}

	@Myannotation(description = "用户保存")
	@RequestMapping(value = "save.do")
	public String save(User user, Model model, RedirectAttributes redirectAttributes) {
		if (user.getId() == 0) {
			userService.create(user);
		} else {
			userService.update(user);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/user/list.do";
	}

	@Myannotation(description = "用户删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model, RedirectAttributes redirectAttributes, Long[] ids) {
		userService.remove(id);
		userService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/user/list.do";
	}

	@RequestMapping(value = "userSelect.do")
	public String userSelect(User user, String ids,HttpServletRequest request, HttpServletResponse response, Model model, Boolean dialog) {
		List<User> list = userService.search(BeanToMap.beanToMap(user));
		model.addAttribute("list", list);
		model.addAttribute("ids", ids);
		return "/user/userSelect";
	}
}
