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
import com.site.entity.TVipDisc;
import com.site.service.TVipDiscService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tVipDisc Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tVipDisc/")
public class TVipDiscController extends BaseController {

	@Resource
	private TVipDiscService tVipDiscService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TVipDisc tVipDisc,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TVipDisc> list=tVipDiscService.search(BeanToMap.beanToMap(tVipDisc));
		model.addAttribute("list", list);
		model.addAttribute("tVipDisc", tVipDisc);
		model.addAttribute("current", "tVipDisc");
                if (dialog != null && dialog) {
			return "/tVipDisc/dialog";
		} else {
			return "/tVipDisc/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TVipDisc tVipDisc = tVipDiscService.get(id);
		model.addAttribute("tVipDisc", tVipDisc);
		model.addAttribute("current", "tVipDisc");
		return "/tVipDisc/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TVipDisc tVipDisc = tVipDiscService.get(id);
		model.addAttribute("tVipDisc", tVipDisc);
		model.addAttribute("current", "tVipDisc");
		return "/tVipDisc/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TVipDisc tVipDisc,Model model) {
		tVipDisc.setId("0");
		model.addAttribute("tVipDisc", tVipDisc);
		return "/tVipDisc/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TVipDisc tVipDisc, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tVipDisc.getId())){
			tVipDiscService.create(tVipDisc);
		} else {
			tVipDiscService.update(tVipDisc);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tVipDisc/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tVipDiscService.remove(id);
                tVipDiscService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tVipDisc/list.do";
	}
}
