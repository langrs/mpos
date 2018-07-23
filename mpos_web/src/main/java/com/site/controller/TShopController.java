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
import com.site.entity.TShop;
import com.site.service.TShopService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tShop Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tShop/")
public class TShopController extends BaseController {

	@Resource
	private TShopService tShopService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TShop tShop,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TShop> list=tShopService.search(BeanToMap.beanToMap(tShop));
		model.addAttribute("list", list);
		model.addAttribute("tShop", tShop);
		model.addAttribute("current", "tShop");
                if (dialog != null && dialog) {
			return "/tShop/dialog";
		} else {
			return "/tShop/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TShop tShop = tShopService.get(id);
		model.addAttribute("tShop", tShop);
		model.addAttribute("current", "tShop");
		return "/tShop/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TShop tShop = tShopService.get(id);
		model.addAttribute("tShop", tShop);
		model.addAttribute("current", "tShop");
		return "/tShop/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TShop tShop,Model model) {
		tShop.setId("0");
		model.addAttribute("tShop", tShop);
		return "/tShop/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TShop tShop, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tShop.getId())){
			tShopService.create(tShop);
		} else {
			tShopService.update(tShop);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tShop/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tShopService.remove(id);
                tShopService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tShop/list.do";
	}
}
