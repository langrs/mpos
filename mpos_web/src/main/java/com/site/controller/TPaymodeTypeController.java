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
import com.site.entity.TPaymodeType;
import com.site.service.TPaymodeTypeService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tPaymodeType Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tPaymodeType/")
public class TPaymodeTypeController extends BaseController {

	@Resource
	private TPaymodeTypeService tPaymodeTypeService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TPaymodeType tPaymodeType,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TPaymodeType> list=tPaymodeTypeService.search(BeanToMap.beanToMap(tPaymodeType));
		model.addAttribute("list", list);
		model.addAttribute("tPaymodeType", tPaymodeType);
		model.addAttribute("current", "tPaymodeType");
                if (dialog != null && dialog) {
			return "/tPaymodeType/dialog";
		} else {
			return "/tPaymodeType/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TPaymodeType tPaymodeType = tPaymodeTypeService.get(id);
		model.addAttribute("tPaymodeType", tPaymodeType);
		model.addAttribute("current", "tPaymodeType");
		return "/tPaymodeType/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TPaymodeType tPaymodeType = tPaymodeTypeService.get(id);
		model.addAttribute("tPaymodeType", tPaymodeType);
		model.addAttribute("current", "tPaymodeType");
		return "/tPaymodeType/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TPaymodeType tPaymodeType,Model model) {
		tPaymodeType.setId("0");
		model.addAttribute("tPaymodeType", tPaymodeType);
		return "/tPaymodeType/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TPaymodeType tPaymodeType, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tPaymodeType.getId())){
			tPaymodeTypeService.create(tPaymodeType);
		} else {
			tPaymodeTypeService.update(tPaymodeType);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tPaymodeType/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tPaymodeTypeService.remove(id);
                tPaymodeTypeService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tPaymodeType/list.do";
	}
}
