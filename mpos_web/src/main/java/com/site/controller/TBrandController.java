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
import com.site.core.mybatis.QueryMap;
import com.site.util.BeanToMap;
import com.site.entity.TBrand;
import com.site.service.TBrandService;

import com.site.entity.TBrand;
/**
 * 对象功能:TBrand controller 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Controller
@RequestMapping(value = "tBrand/")
public class TBrandController extends BaseController 
{

	@Resource
	private TBrandService tBrandService;
	
	@Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TBrand tBrand, HttpServletRequest request, HttpServletResponse response, Model model, Boolean dialog) {
		List<TBrand> list = tBrandService.search(BeanToMap.beanToMap(tBrand));
		model.addAttribute("list", list);
		model.addAttribute("tBrand", tBrand);
		model.addAttribute("current", "tBrand");
		if (dialog != null && dialog) {
			return "/tBrand/dialog";
		} else {
			return "/tBrand/list";
		}
	}	
	
	@Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TBrand tBrand = tBrandService.get(id);
		model.addAttribute("tBrand", tBrand);
		model.addAttribute("current", "tBrand");
		return "/tBrand/view";
	}
	
	@Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit(Long id, Model model) {
		TBrand tBrand = tBrandService.get(id);
		model.addAttribute("tBrand", tBrand);
		model.addAttribute("current", "tBrand");
		return "/tBrand/add";
	}	
	
	@Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TBrand tBrand, Model model) {
		tBrand.setId("0");
		model.addAttribute("tBrand", tBrand);
		return "/tBrand/add";
	}
	
	@Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TBrand tBrand, Model model, RedirectAttributes redirectAttributes) {
		if ("0".equals(tBrand.getId())) {
			tBrandService.create(tBrand);
		} else {
			tBrandService.update(tBrand);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tBrand/list.do";
	}
	
	@Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model, RedirectAttributes redirectAttributes, Long[] ids) {
		tBrandService.remove(id);
		tBrandService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tBrand/list.do";
	}	
}
