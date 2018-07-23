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
import com.site.entity.TParm;
import com.site.service.TParmService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tParm Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tParm/")
public class TParmController extends BaseController {

	@Resource
	private TParmService tParmService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TParm tParm,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TParm> list=tParmService.search(BeanToMap.beanToMap(tParm));
		model.addAttribute("list", list);
		model.addAttribute("tParm", tParm);
		model.addAttribute("current", "tParm");
                if (dialog != null && dialog) {
			return "/tParm/dialog";
		} else {
			return "/tParm/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TParm tParm = tParmService.get(id);
		model.addAttribute("tParm", tParm);
		model.addAttribute("current", "tParm");
		return "/tParm/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TParm tParm = tParmService.get(id);
		model.addAttribute("tParm", tParm);
		model.addAttribute("current", "tParm");
		return "/tParm/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TParm tParm,Model model) {
		tParm.setId("0");
		model.addAttribute("tParm", tParm);
		return "/tParm/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TParm tParm, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tParm.getId())){
			tParmService.create(tParm);
		} else {
			tParmService.update(tParm);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tParm/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tParmService.remove(id);
                tParmService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tParm/list.do";
	}
}
