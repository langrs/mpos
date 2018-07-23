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
import com.site.entity.TStorePos;
import com.site.service.TStorePosService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tStorePos Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tStorePos/")
public class TStorePosController extends BaseController {

	@Resource
	private TStorePosService tStorePosService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TStorePos tStorePos,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TStorePos> list=tStorePosService.search(BeanToMap.beanToMap(tStorePos));
		model.addAttribute("list", list);
		model.addAttribute("tStorePos", tStorePos);
		model.addAttribute("current", "tStorePos");
                if (dialog != null && dialog) {
			return "/tStorePos/dialog";
		} else {
			return "/tStorePos/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TStorePos tStorePos = tStorePosService.get(id);
		model.addAttribute("tStorePos", tStorePos);
		model.addAttribute("current", "tStorePos");
		return "/tStorePos/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TStorePos tStorePos = tStorePosService.get(id);
		model.addAttribute("tStorePos", tStorePos);
		model.addAttribute("current", "tStorePos");
		return "/tStorePos/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TStorePos tStorePos,Model model) {
		tStorePos.setId("0");
		model.addAttribute("tStorePos", tStorePos);
		return "/tStorePos/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TStorePos tStorePos, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tStorePos.getId())){
			tStorePosService.create(tStorePos);
		} else {
			tStorePosService.update(tStorePos);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tStorePos/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tStorePosService.remove(id);
                tStorePosService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tStorePos/list.do";
	}
}
