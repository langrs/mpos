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
import com.site.entity.TSalePay;
import com.site.service.TSalePayService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tSalePay Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tSalePay/")
public class TSalePayController extends BaseController {

	@Resource
	private TSalePayService tSalePayService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TSalePay tSalePay,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TSalePay> list=tSalePayService.search(BeanToMap.beanToMap(tSalePay));
		model.addAttribute("list", list);
		model.addAttribute("tSalePay", tSalePay);
		model.addAttribute("current", "tSalePay");
                if (dialog != null && dialog) {
			return "/tSalePay/dialog";
		} else {
			return "/tSalePay/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TSalePay tSalePay = tSalePayService.get(id);
		model.addAttribute("tSalePay", tSalePay);
		model.addAttribute("current", "tSalePay");
		return "/tSalePay/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TSalePay tSalePay = tSalePayService.get(id);
		model.addAttribute("tSalePay", tSalePay);
		model.addAttribute("current", "tSalePay");
		return "/tSalePay/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TSalePay tSalePay,Model model) {
		tSalePay.setId("0");
		model.addAttribute("tSalePay", tSalePay);
		return "/tSalePay/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TSalePay tSalePay, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tSalePay.getId())){
			tSalePayService.create(tSalePay);
		} else {
			tSalePayService.update(tSalePay);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tSalePay/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tSalePayService.remove(id);
                tSalePayService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tSalePay/list.do";
	}
}
