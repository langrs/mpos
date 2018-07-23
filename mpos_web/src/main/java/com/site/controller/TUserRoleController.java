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
import com.site.entity.TUserRole;
import com.site.service.TUserRoleService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tUserRole Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tUserRole/")
public class TUserRoleController extends BaseController {

	@Resource
	private TUserRoleService tUserRoleService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TUserRole tUserRole,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TUserRole> list=tUserRoleService.search(BeanToMap.beanToMap(tUserRole));
		model.addAttribute("list", list);
		model.addAttribute("tUserRole", tUserRole);
		model.addAttribute("current", "tUserRole");
                if (dialog != null && dialog) {
			return "/tUserRole/dialog";
		} else {
			return "/tUserRole/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TUserRole tUserRole = tUserRoleService.get(id);
		model.addAttribute("tUserRole", tUserRole);
		model.addAttribute("current", "tUserRole");
		return "/tUserRole/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TUserRole tUserRole = tUserRoleService.get(id);
		model.addAttribute("tUserRole", tUserRole);
		model.addAttribute("current", "tUserRole");
		return "/tUserRole/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TUserRole tUserRole,Model model) {
		tUserRole.setId("0");
		model.addAttribute("tUserRole", tUserRole);
		return "/tUserRole/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TUserRole tUserRole, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tUserRole.getId())){
			tUserRoleService.create(tUserRole);
		} else {
			tUserRoleService.update(tUserRole);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tUserRole/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tUserRoleService.remove(id);
                tUserRoleService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tUserRole/list.do";
	}
}
