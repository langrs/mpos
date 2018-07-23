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
import com.site.entity.TRolePaymode;
import com.site.service.TRolePaymodeService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tRolePaymode Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tRolePaymode/")
public class TRolePaymodeController extends BaseController {

	@Resource
	private TRolePaymodeService tRolePaymodeService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TRolePaymode tRolePaymode,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TRolePaymode> list=tRolePaymodeService.search(BeanToMap.beanToMap(tRolePaymode));
		model.addAttribute("list", list);
		model.addAttribute("tRolePaymode", tRolePaymode);
		model.addAttribute("current", "tRolePaymode");
                if (dialog != null && dialog) {
			return "/tRolePaymode/dialog";
		} else {
			return "/tRolePaymode/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TRolePaymode tRolePaymode = tRolePaymodeService.get(id);
		model.addAttribute("tRolePaymode", tRolePaymode);
		model.addAttribute("current", "tRolePaymode");
		return "/tRolePaymode/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TRolePaymode tRolePaymode = tRolePaymodeService.get(id);
		model.addAttribute("tRolePaymode", tRolePaymode);
		model.addAttribute("current", "tRolePaymode");
		return "/tRolePaymode/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TRolePaymode tRolePaymode,Model model) {
		tRolePaymode.setId("0");
		model.addAttribute("tRolePaymode", tRolePaymode);
		return "/tRolePaymode/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TRolePaymode tRolePaymode, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tRolePaymode.getId())){
			tRolePaymodeService.create(tRolePaymode);
		} else {
			tRolePaymodeService.update(tRolePaymode);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tRolePaymode/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tRolePaymodeService.remove(id);
                tRolePaymodeService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tRolePaymode/list.do";
	}
}
