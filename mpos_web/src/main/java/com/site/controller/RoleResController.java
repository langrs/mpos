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
import com.site.entity.RoleRes;
import com.site.service.RoleResService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:roleRes Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "roleRes/")
public class RoleResController extends BaseController {

	@Resource
	private RoleResService roleResService;

        @Myannotation(description = "角色关联资源列表")
	@RequestMapping(value = "list.do")
	public String list(RoleRes roleRes,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<RoleRes> list=roleResService.search(BeanToMap.beanToMap(roleRes));
		model.addAttribute("list", list);
		model.addAttribute("roleRes", roleRes);
		model.addAttribute("current", "roleRes");
                if (dialog != null && dialog) {
			return "/roleRes/dialog";
		} else {
			return "/roleRes/list";
		}
	}
	
        @Myannotation(description = "角色关联资源详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		RoleRes roleRes = roleResService.get(id);
		model.addAttribute("roleRes", roleRes);
		model.addAttribute("current", "roleRes");
		return "/roleRes/view";
	}
	
        @Myannotation(description = "角色关联资源更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		RoleRes roleRes = roleResService.get(id);
		model.addAttribute("roleRes", roleRes);
		model.addAttribute("current", "roleRes");
		return "/roleRes/add";
	}
	
        @Myannotation(description = "角色关联资源新增")
	@RequestMapping(value = "add.do")
	public String add(RoleRes roleRes,Model model) {
		roleRes.setId(0L);
		model.addAttribute("roleRes", roleRes);
		return "/roleRes/add";
	}
	
        @Myannotation(description = "角色关联资源保存")
	@RequestMapping(value = "save.do")
	public String save(RoleRes roleRes, Model model,
			RedirectAttributes redirectAttributes) {
		if (roleRes.getId() == 0) {
			roleResService.create(roleRes);
		} else {
			roleResService.update(roleRes);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/roleRes/list.do";
	}
	
        @Myannotation(description = "角色关联资源删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		roleResService.remove(id);
                roleResService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/roleRes/list.do";
	}
}
