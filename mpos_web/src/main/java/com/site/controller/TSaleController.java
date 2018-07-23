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
import com.site.entity.TSale;
import com.site.service.TSaleService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tSale Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tSale/")
public class TSaleController extends BaseController {

	@Resource
	private TSaleService tSaleService;

        @Myannotation(description = "交易类型列表")
	@RequestMapping(value = "list.do")
	public String list(TSale tSale,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TSale> list=tSaleService.search(BeanToMap.beanToMap(tSale));
		model.addAttribute("list", list);
		model.addAttribute("tSale", tSale);
		model.addAttribute("current", "tSale");
                if (dialog != null && dialog) {
			return "/tSale/dialog";
		} else {
			return "/tSale/list";
		}
	}
	
        @Myannotation(description = "交易类型详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TSale tSale = tSaleService.get(id);
		model.addAttribute("tSale", tSale);
		model.addAttribute("current", "tSale");
		return "/tSale/view";
	}
	
        @Myannotation(description = "交易类型更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TSale tSale = tSaleService.get(id);
		model.addAttribute("tSale", tSale);
		model.addAttribute("current", "tSale");
		return "/tSale/add";
	}
	
        @Myannotation(description = "交易类型新增")
	@RequestMapping(value = "add.do")
	public String add(TSale tSale,Model model) {
		tSale.setId("0");
		model.addAttribute("tSale", tSale);
		return "/tSale/add";
	}
	
        @Myannotation(description = "交易类型保存")
	@RequestMapping(value = "save.do")
	public String save(TSale tSale, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tSale.getId())){
			tSaleService.create(tSale);
		} else {
			tSaleService.update(tSale);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tSale/list.do";
	}
	
        @Myannotation(description = "交易类型删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tSaleService.remove(id);
                tSaleService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tSale/list.do";
	}
}
