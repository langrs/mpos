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
import com.site.entity.TPaymode;
import com.site.service.TPaymodeService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tPaymode Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tPaymode/")
public class TPaymodeController extends BaseController {

	@Resource
	private TPaymodeService tPaymodeService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TPaymode tPaymode,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TPaymode> list=tPaymodeService.search(BeanToMap.beanToMap(tPaymode));
		model.addAttribute("list", list);
		model.addAttribute("tPaymode", tPaymode);
		model.addAttribute("current", "tPaymode");
                if (dialog != null && dialog) {
			return "/tPaymode/dialog";
		} else {
			return "/tPaymode/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TPaymode tPaymode = tPaymodeService.get(id);
		model.addAttribute("tPaymode", tPaymode);
		model.addAttribute("current", "tPaymode");
		return "/tPaymode/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TPaymode tPaymode = tPaymodeService.get(id);
		model.addAttribute("tPaymode", tPaymode);
		model.addAttribute("current", "tPaymode");
		return "/tPaymode/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TPaymode tPaymode,Model model) {
		tPaymode.setId("0");
		model.addAttribute("tPaymode", tPaymode);
		return "/tPaymode/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TPaymode tPaymode, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tPaymode.getId())){
			tPaymodeService.create(tPaymode);
		} else {
			tPaymodeService.update(tPaymode);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tPaymode/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tPaymodeService.remove(id);
                tPaymodeService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tPaymode/list.do";
	}
}
