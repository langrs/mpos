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
import com.site.entity.TStore;
import com.site.service.TStoreService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tStore Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tStore/")
public class TStoreController extends BaseController {

	@Resource
	private TStoreService tStoreService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TStore tStore,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TStore> list=tStoreService.search(BeanToMap.beanToMap(tStore));
		model.addAttribute("list", list);
		model.addAttribute("tStore", tStore);
		model.addAttribute("current", "tStore");
                if (dialog != null && dialog) {
			return "/tStore/dialog";
		} else {
			return "/tStore/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TStore tStore = tStoreService.get(id);
		model.addAttribute("tStore", tStore);
		model.addAttribute("current", "tStore");
		return "/tStore/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TStore tStore = tStoreService.get(id);
		model.addAttribute("tStore", tStore);
		model.addAttribute("current", "tStore");
		return "/tStore/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TStore tStore,Model model) {
		tStore.setId("0");
		model.addAttribute("tStore", tStore);
		return "/tStore/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TStore tStore, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tStore.getId())){
			tStoreService.create(tStore);
		} else {
			tStoreService.update(tStore);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tStore/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tStoreService.remove(id);
                tStoreService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tStore/list.do";
	}
}
