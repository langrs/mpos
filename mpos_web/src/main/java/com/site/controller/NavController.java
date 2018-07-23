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
import com.site.entity.Nav;
import com.site.service.NavService;
import com.site.util.BeanToMap;

/**
 * <pre>
 * 对象功能:nav Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 * </pre>
 */

@Controller
@RequestMapping(value = "nav/")
public class NavController extends BaseController {

	@Resource
	private NavService navService;

	@Myannotation(description = "菜单列表")
	@RequestMapping(value = "list.do")
	public String list(Nav nav, HttpServletRequest request, HttpServletResponse response, Model model, Boolean dialog, Long parentId) {
		List<Nav> list = navService.search(BeanToMap.beanToMap(nav));
		model.addAttribute("list", list);
		model.addAttribute("nav", nav);
		model.addAttribute("current", "nav");
		model.addAttribute("parent", parentId);
		if (dialog != null && dialog) {
			return "/nav/dialog";
		} else {
			return "/nav/list";
		}
	}

	@Myannotation(description = "菜单详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		Nav nav = navService.get(id);
		model.addAttribute("nav", nav);
		model.addAttribute("current", "nav");
		return "/nav/view";
	}

	@Myannotation(description = "菜单更新")
	@RequestMapping(value = "/edit.do")
	public String edit(Long id, Model model) {
		Nav nav = navService.get(id);
		model.addAttribute("nav", nav);
		model.addAttribute("current", "nav");
		return "/nav/add";
	}

	@Myannotation(description = "菜单新增")
	@RequestMapping(value = "add.do")
	public String add(Nav nav, Model model) {
		nav.setId(0L);
		model.addAttribute("nav", nav);
		return "/nav/add";
	}

	@Myannotation(description = "菜单保存")
	@RequestMapping(value = "save.do")
	public String save(Nav nav, Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addAttribute("parentId", nav.getParent());
		if (nav.getId() == 0) {
			boolean save=false;
			Long parent = nav.getParent();
			if(parent.longValue()==0){
				save=true;
			}else{
				if(navService.get(parent).getParent().longValue()==0){
					save=true;
				}
			}
			if(save){
				addMessage(redirectAttributes, "保存数据成功");
				navService.create(nav);
			}else{
				addMessage(redirectAttributes, "保存失败:菜单最多支持两级");
			}
		} else {
			navService.update(nav);
			addMessage(redirectAttributes, "保存数据成功");
		}
		return "redirect:/nav/list.do";
	}

	@Myannotation(description = "菜单删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model, RedirectAttributes redirectAttributes, Long[] ids) {
		// 删除子节点
		removeByParent(id);
		if (ids != null) {
			for (Long id_ : ids) {
				removeByParent(id_);
			}
		}
		navService.remove(id);
		navService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/nav/list.do";
	}

	public void removeByParent(Long id) {
		Long parent = navService.get(id).getParent();
		if (parent.longValue() == 0) {
			// 找到子节点删除
			List<Nav> navList = navService.getByParent(id);
			for (Nav nav : navList) {
				navService.remove(nav.getId());
			}
		}
	}
}
