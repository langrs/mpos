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
import com.site.entity.TRight;
import com.site.service.TRightService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tRight Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tRight/")
public class TRightController extends BaseController {

	@Resource
	private TRightService tRightService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TRight tRight,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TRight> list=tRightService.search(BeanToMap.beanToMap(tRight));
		model.addAttribute("list", list);
		model.addAttribute("tRight", tRight);
		model.addAttribute("current", "tRight");
                if (dialog != null && dialog) {
			return "/tRight/dialog";
		} else {
			return "/tRight/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TRight tRight = tRightService.get(id);
		model.addAttribute("tRight", tRight);
		model.addAttribute("current", "tRight");
		return "/tRight/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TRight tRight = tRightService.get(id);
		model.addAttribute("tRight", tRight);
		model.addAttribute("current", "tRight");
		return "/tRight/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TRight tRight,Model model) {
		tRight.setId("0");
		model.addAttribute("tRight", tRight);
		return "/tRight/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TRight tRight, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tRight.getId())){
			tRightService.create(tRight);
		} else {
			tRightService.update(tRight);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tRight/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tRightService.remove(id);
                tRightService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tRight/list.do";
	}
}
