package com.site.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.core.base.BaseController;
import com.site.entity.SystemParameters;
import com.site.service.SystemParametersService;
import com.site.util.BeanToMap;

/**
 * <pre>
 * 对象功能:systemParameters Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 * </pre>
 */

@Controller
@RequestMapping(value = "systemParameters/")
public class SystemParametersController extends BaseController {

	@Resource
	private SystemParametersService systemParametersService;

	@RequestMapping(value = "list.do")
	public String list(SystemParameters systemParameters, HttpServletRequest request, HttpServletResponse response, Model model) {
		List<SystemParameters> list = systemParametersService.search(BeanToMap.beanToMap(systemParameters));
		model.addAttribute("list", list);
		model.addAttribute("systemParameters", systemParameters);
		model.addAttribute("current", "systemParameters");
		return "/systemParameters/list";
	}

	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		SystemParameters systemParameters = systemParametersService.get(id);
		model.addAttribute("systemParameters", systemParameters);
		model.addAttribute("current", "systemParameters");
		return "/systemParameters/view";
	}

	@RequestMapping(value = "/edit.do")
	public String edit(Long id, Model model) {
		SystemParameters systemParameters = systemParametersService.get(id);
		model.addAttribute("systemParameters", systemParameters);
		model.addAttribute("current", "systemParameters");
		return "/systemParameters/add";
	}

	@RequestMapping(value = "add.do")
	public String add(SystemParameters systemParameters, Model model) {
		systemParameters.setId(0L);
		model.addAttribute("systemParameters", systemParameters);
		return "/systemParameters/add";
	}

	@RequestMapping(value = "save.do")
	public String save(SystemParameters systemParameters, Model model, RedirectAttributes redirectAttributes) {
		if (systemParameters.getId() == 0) {
			systemParametersService.create(systemParameters);
		} else {
			systemParametersService.update(systemParameters);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/systemParameters/list.do";
	}

	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model, RedirectAttributes redirectAttributes, Long[] ids) {
		systemParametersService.remove(id);
		systemParametersService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/systemParameters/list.do";
	}
}
