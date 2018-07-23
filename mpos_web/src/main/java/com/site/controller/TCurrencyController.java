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
import com.site.entity.TCurrency;
import com.site.service.TCurrencyService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCurrency Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCurrency/")
public class TCurrencyController extends BaseController {

	@Resource
	private TCurrencyService tCurrencyService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCurrency tCurrency,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCurrency> list=tCurrencyService.search(BeanToMap.beanToMap(tCurrency));
		model.addAttribute("list", list);
		model.addAttribute("tCurrency", tCurrency);
		model.addAttribute("current", "tCurrency");
                if (dialog != null && dialog) {
			return "/tCurrency/dialog";
		} else {
			return "/tCurrency/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCurrency tCurrency = tCurrencyService.get(id);
		model.addAttribute("tCurrency", tCurrency);
		model.addAttribute("current", "tCurrency");
		return "/tCurrency/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCurrency tCurrency = tCurrencyService.get(id);
		model.addAttribute("tCurrency", tCurrency);
		model.addAttribute("current", "tCurrency");
		return "/tCurrency/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCurrency tCurrency,Model model) {
		tCurrency.setId("0");
		model.addAttribute("tCurrency", tCurrency);
		return "/tCurrency/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCurrency tCurrency, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCurrency.getId())){
			tCurrencyService.create(tCurrency);
		} else {
			tCurrencyService.update(tCurrency);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCurrency/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCurrencyService.remove(id);
                tCurrencyService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCurrency/list.do";
	}
}
