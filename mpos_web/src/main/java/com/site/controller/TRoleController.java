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
import com.site.entity.TRole;
import com.site.service.TRoleService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tRole Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tRole/")
public class TRoleController extends BaseController {

	@Resource
	private TRoleService tRoleService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TRole tRole,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TRole> list=tRoleService.search(BeanToMap.beanToMap(tRole));
		model.addAttribute("list", list);
		model.addAttribute("tRole", tRole);
		model.addAttribute("current", "tRole");
                if (dialog != null && dialog) {
			return "/tRole/dialog";
		} else {
			return "/tRole/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TRole tRole = tRoleService.get(id);
		model.addAttribute("tRole", tRole);
		model.addAttribute("current", "tRole");
		return "/tRole/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TRole tRole = tRoleService.get(id);
		model.addAttribute("tRole", tRole);
		model.addAttribute("current", "tRole");
		return "/tRole/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TRole tRole,Model model) {
		tRole.setId("0");
		model.addAttribute("tRole", tRole);
		return "/tRole/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TRole tRole, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tRole.getId())){
			tRoleService.create(tRole);
		} else {
			tRoleService.update(tRole);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tRole/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tRoleService.remove(id);
                tRoleService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tRole/list.do";
	}
}
