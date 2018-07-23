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
import com.site.entity.TPos;
import com.site.service.TPosService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tPos Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tPos/")
public class TPosController extends BaseController {

	@Resource
	private TPosService tPosService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TPos tPos,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TPos> list=tPosService.search(BeanToMap.beanToMap(tPos));
		model.addAttribute("list", list);
		model.addAttribute("tPos", tPos);
		model.addAttribute("current", "tPos");
                if (dialog != null && dialog) {
			return "/tPos/dialog";
		} else {
			return "/tPos/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TPos tPos = tPosService.get(id);
		model.addAttribute("tPos", tPos);
		model.addAttribute("current", "tPos");
		return "/tPos/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TPos tPos = tPosService.get(id);
		model.addAttribute("tPos", tPos);
		model.addAttribute("current", "tPos");
		return "/tPos/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TPos tPos,Model model) {
		tPos.setId("0");
		model.addAttribute("tPos", tPos);
		return "/tPos/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TPos tPos, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tPos.getId())){
			tPosService.create(tPos);
		} else {
			tPosService.update(tPos);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tPos/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tPosService.remove(id);
                tPosService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tPos/list.do";
	}
}
