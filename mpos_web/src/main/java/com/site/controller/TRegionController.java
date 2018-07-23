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
import com.site.entity.TRegion;
import com.site.service.TRegionService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tRegion Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tRegion/")
public class TRegionController extends BaseController {

	@Resource
	private TRegionService tRegionService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TRegion tRegion,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TRegion> list=tRegionService.search(BeanToMap.beanToMap(tRegion));
		model.addAttribute("list", list);
		model.addAttribute("tRegion", tRegion);
		model.addAttribute("current", "tRegion");
                if (dialog != null && dialog) {
			return "/tRegion/dialog";
		} else {
			return "/tRegion/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TRegion tRegion = tRegionService.get(id);
		model.addAttribute("tRegion", tRegion);
		model.addAttribute("current", "tRegion");
		return "/tRegion/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TRegion tRegion = tRegionService.get(id);
		model.addAttribute("tRegion", tRegion);
		model.addAttribute("current", "tRegion");
		return "/tRegion/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TRegion tRegion,Model model) {
		tRegion.setId("0");
		model.addAttribute("tRegion", tRegion);
		return "/tRegion/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TRegion tRegion, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tRegion.getId())){
			tRegionService.create(tRegion);
		} else {
			tRegionService.update(tRegion);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tRegion/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tRegionService.remove(id);
                tRegionService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tRegion/list.do";
	}
}
