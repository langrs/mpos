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
import com.site.entity.TSerial;
import com.site.service.TSerialService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tSerial Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tSerial/")
public class TSerialController extends BaseController {

	@Resource
	private TSerialService tSerialService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TSerial tSerial,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TSerial> list=tSerialService.search(BeanToMap.beanToMap(tSerial));
		model.addAttribute("list", list);
		model.addAttribute("tSerial", tSerial);
		model.addAttribute("current", "tSerial");
                if (dialog != null && dialog) {
			return "/tSerial/dialog";
		} else {
			return "/tSerial/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TSerial tSerial = tSerialService.get(id);
		model.addAttribute("tSerial", tSerial);
		model.addAttribute("current", "tSerial");
		return "/tSerial/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TSerial tSerial = tSerialService.get(id);
		model.addAttribute("tSerial", tSerial);
		model.addAttribute("current", "tSerial");
		return "/tSerial/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TSerial tSerial,Model model) {
		tSerial.setId("0");
		model.addAttribute("tSerial", tSerial);
		return "/tSerial/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TSerial tSerial, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tSerial.getId())){
			tSerialService.create(tSerial);
		} else {
			tSerialService.update(tSerial);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tSerial/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tSerialService.remove(id);
                tSerialService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tSerial/list.do";
	}
}
