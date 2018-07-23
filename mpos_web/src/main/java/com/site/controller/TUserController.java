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
import com.site.entity.TUser;
import com.site.service.TUserService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tUser Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tUser/")
public class TUserController extends BaseController {

	@Resource
	private TUserService tUserService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TUser tUser,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TUser> list=tUserService.search(BeanToMap.beanToMap(tUser));
		model.addAttribute("list", list);
		model.addAttribute("tUser", tUser);
		model.addAttribute("current", "tUser");
                if (dialog != null && dialog) {
			return "/tUser/dialog";
		} else {
			return "/tUser/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TUser tUser = tUserService.get(id);
		model.addAttribute("tUser", tUser);
		model.addAttribute("current", "tUser");
		return "/tUser/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TUser tUser = tUserService.get(id);
		model.addAttribute("tUser", tUser);
		model.addAttribute("current", "tUser");
		return "/tUser/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TUser tUser,Model model) {
		tUser.setId("0");
		model.addAttribute("tUser", tUser);
		return "/tUser/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TUser tUser, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tUser.getId())){
			tUserService.create(tUser);
		} else {
			tUserService.update(tUser);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tUser/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tUserService.remove(id);
                tUserService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tUser/list.do";
	}
}
