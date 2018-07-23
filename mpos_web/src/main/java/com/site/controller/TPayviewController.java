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
import com.site.entity.TPayview;
import com.site.service.TPayviewService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tPayview Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tPayview/")
public class TPayviewController extends BaseController {

	@Resource
	private TPayviewService tPayviewService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TPayview tPayview,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TPayview> list=tPayviewService.search(BeanToMap.beanToMap(tPayview));
		model.addAttribute("list", list);
		model.addAttribute("tPayview", tPayview);
		model.addAttribute("current", "tPayview");
                if (dialog != null && dialog) {
			return "/tPayview/dialog";
		} else {
			return "/tPayview/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TPayview tPayview = tPayviewService.get(id);
		model.addAttribute("tPayview", tPayview);
		model.addAttribute("current", "tPayview");
		return "/tPayview/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TPayview tPayview = tPayviewService.get(id);
		model.addAttribute("tPayview", tPayview);
		model.addAttribute("current", "tPayview");
		return "/tPayview/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TPayview tPayview,Model model) {
		tPayview.setId("0");
		model.addAttribute("tPayview", tPayview);
		return "/tPayview/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TPayview tPayview, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tPayview.getId())){
			tPayviewService.create(tPayview);
		} else {
			tPayviewService.update(tPayview);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tPayview/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tPayviewService.remove(id);
                tPayviewService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tPayview/list.do";
	}
}
