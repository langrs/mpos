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
import com.site.entity.TSaleD;
import com.site.service.TSaleDService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tSaleD Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tSaleD/")
public class TSaleDController extends BaseController {

	@Resource
	private TSaleDService tSaleDService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TSaleD tSaleD,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TSaleD> list=tSaleDService.search(BeanToMap.beanToMap(tSaleD));
		model.addAttribute("list", list);
		model.addAttribute("tSaleD", tSaleD);
		model.addAttribute("current", "tSaleD");
                if (dialog != null && dialog) {
			return "/tSaleD/dialog";
		} else {
			return "/tSaleD/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TSaleD tSaleD = tSaleDService.get(id);
		model.addAttribute("tSaleD", tSaleD);
		model.addAttribute("current", "tSaleD");
		return "/tSaleD/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TSaleD tSaleD = tSaleDService.get(id);
		model.addAttribute("tSaleD", tSaleD);
		model.addAttribute("current", "tSaleD");
		return "/tSaleD/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TSaleD tSaleD,Model model) {
		tSaleD.setId("0");
		model.addAttribute("tSaleD", tSaleD);
		return "/tSaleD/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TSaleD tSaleD, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tSaleD.getId())){
			tSaleDService.create(tSaleD);
		} else {
			tSaleDService.update(tSaleD);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tSaleD/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tSaleDService.remove(id);
                tSaleDService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tSaleD/list.do";
	}
}
