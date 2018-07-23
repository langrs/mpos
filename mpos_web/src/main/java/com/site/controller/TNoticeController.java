package com.site.controller;  

import com.site.core.annotation.Myannotation;
import com.site.core.base.BaseController;
import com.site.entity.TNotice;
import com.site.service.TNoticeService;
import com.site.util.BeanToMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
/**
 * 对象功能:TNotice controller 对象
 * 开发公司:SZUNIC
 * 开发人员:LZM
 */
@Controller
@RequestMapping(value = "tNotice/")
public class TNoticeController extends BaseController 
{

	@Resource
	private TNoticeService tNoticeService;
	
	@Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TNotice tNotice, HttpServletRequest request, HttpServletResponse response, Model model, Boolean dialog) {
		List<TNotice> list = tNoticeService.search(BeanToMap.beanToMap(tNotice));
		model.addAttribute("list", list);
		model.addAttribute("tNotice", tNotice);
		model.addAttribute("current", "tNotice");
		if (dialog != null && dialog) {
			return "/tNotice/dialog";
		} else {
			return "/tNotice/list";
		}
	}	
	
	@Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TNotice tNotice = tNoticeService.get(id);
		model.addAttribute("tNotice", tNotice);
		model.addAttribute("current", "tNotice");
		return "/tNotice/view";
	}
	
	@Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit(Long id, Model model) {
		TNotice tNotice = tNoticeService.get(id);
		model.addAttribute("tNotice", tNotice);
		model.addAttribute("current", "tNotice");
		return "/tNotice/add";
	}	
	
	@Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TNotice tNotice, Model model) {
		tNotice.setId("0");
		model.addAttribute("tNotice", tNotice);
		return "/tNotice/add";
	}
	
	@Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TNotice tNotice, Model model, RedirectAttributes redirectAttributes) {
		if ("0".equals(tNotice.getId())) {
			tNoticeService.create(tNotice);
		} else {
			tNoticeService.update(tNotice);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tNotice/list.do";
	}
	
	@Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model, RedirectAttributes redirectAttributes, Long[] ids) {
		tNoticeService.remove(id);
		tNoticeService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tNotice/list.do";
	}	
}
