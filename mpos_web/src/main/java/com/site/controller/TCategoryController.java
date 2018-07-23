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
import com.site.entity.TCategory;
import com.site.service.TCategoryService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCategory Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCategory/")
public class TCategoryController extends BaseController {

	@Resource
	private TCategoryService tCategoryService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCategory tCategory,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCategory> list=tCategoryService.search(BeanToMap.beanToMap(tCategory));
		model.addAttribute("list", list);
		model.addAttribute("tCategory", tCategory);
		model.addAttribute("current", "tCategory");
                if (dialog != null && dialog) {
			return "/tCategory/dialog";
		} else {
			return "/tCategory/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCategory tCategory = tCategoryService.get(id);
		model.addAttribute("tCategory", tCategory);
		model.addAttribute("current", "tCategory");
		return "/tCategory/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCategory tCategory = tCategoryService.get(id);
		model.addAttribute("tCategory", tCategory);
		model.addAttribute("current", "tCategory");
		return "/tCategory/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCategory tCategory,Model model) {
		tCategory.setId("0");
		model.addAttribute("tCategory", tCategory);
		return "/tCategory/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCategory tCategory, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCategory.getId())){
			tCategoryService.create(tCategory);
		} else {
			tCategoryService.update(tCategory);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCategory/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCategoryService.remove(id);
                tCategoryService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCategory/list.do";
	}
}
