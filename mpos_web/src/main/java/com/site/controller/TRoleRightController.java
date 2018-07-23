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
import com.site.entity.TRoleRight;
import com.site.service.TRoleRightService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tRoleRight Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tRoleRight/")
public class TRoleRightController extends BaseController {

	@Resource
	private TRoleRightService tRoleRightService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TRoleRight tRoleRight,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TRoleRight> list=tRoleRightService.search(BeanToMap.beanToMap(tRoleRight));
		model.addAttribute("list", list);
		model.addAttribute("tRoleRight", tRoleRight);
		model.addAttribute("current", "tRoleRight");
                if (dialog != null && dialog) {
			return "/tRoleRight/dialog";
		} else {
			return "/tRoleRight/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TRoleRight tRoleRight = tRoleRightService.get(id);
		model.addAttribute("tRoleRight", tRoleRight);
		model.addAttribute("current", "tRoleRight");
		return "/tRoleRight/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TRoleRight tRoleRight = tRoleRightService.get(id);
		model.addAttribute("tRoleRight", tRoleRight);
		model.addAttribute("current", "tRoleRight");
		return "/tRoleRight/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TRoleRight tRoleRight,Model model) {
		tRoleRight.setId("0");
		model.addAttribute("tRoleRight", tRoleRight);
		return "/tRoleRight/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TRoleRight tRoleRight, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tRoleRight.getId())){
			tRoleRightService.create(tRoleRight);
		} else {
			tRoleRightService.update(tRoleRight);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tRoleRight/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tRoleRightService.remove(id);
                tRoleRightService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tRoleRight/list.do";
	}
}
