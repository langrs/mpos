package com.site.controller;

import java.util.List;
import com.site.core.annotation.Myannotation;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.core.base.BaseController;
import com.site.entity.RoleUser;
import com.site.service.RoleUserService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:roleUser Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "roleUser/")
public class RoleUserController extends BaseController {

	@Resource
	private RoleUserService roleUserService;

        @Myannotation(description = "用户关联角色列表")
	@RequestMapping(value = "list.do")
	public String list(RoleUser roleUser,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<RoleUser> list=roleUserService.search(BeanToMap.beanToMap(roleUser));
		model.addAttribute("list", list);
		model.addAttribute("roleUser", roleUser);
		model.addAttribute("current", "roleUser");
                if (dialog != null && dialog) {
			return "/roleUser/dialog";
		} else {
			return "/roleUser/list";
		}
	}
	
        @Myannotation(description = "用户关联角色详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		RoleUser roleUser = roleUserService.get(id);
		model.addAttribute("roleUser", roleUser);
		model.addAttribute("current", "roleUser");
		return "/roleUser/view";
	}
	
        @Myannotation(description = "用户关联角色更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		RoleUser roleUser = roleUserService.get(id);
		model.addAttribute("roleUser", roleUser);
		model.addAttribute("current", "roleUser");
		return "/roleUser/add";
	}
	
        @Myannotation(description = "用户关联角色新增")
	@RequestMapping(value = "add.do")
	public String add(RoleUser roleUser,Model model) {
		roleUser.setId(0L);
		model.addAttribute("roleUser", roleUser);
		return "/roleUser/add";
	}
	
        @Myannotation(description = "用户关联角色保存")
	@RequestMapping(value = "save.do")
	public String save(RoleUser roleUser, Model model,
			RedirectAttributes redirectAttributes) {
		if (roleUser.getId() == 0) {
			roleUserService.create(roleUser);
		} else {
			roleUserService.update(roleUser);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/roleUser/list.do";
	}
	
        @Myannotation(description = "用户关联角色删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		roleUserService.remove(id);
                roleUserService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/roleUser/list.do";
	}
}
