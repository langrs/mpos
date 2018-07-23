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
import com.site.entity.TCouponType;
import com.site.service.TCouponTypeService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCouponType Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCouponType/")
public class TCouponTypeController extends BaseController {

	@Resource
	private TCouponTypeService tCouponTypeService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCouponType tCouponType,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCouponType> list=tCouponTypeService.search(BeanToMap.beanToMap(tCouponType));
		model.addAttribute("list", list);
		model.addAttribute("tCouponType", tCouponType);
		model.addAttribute("current", "tCouponType");
                if (dialog != null && dialog) {
			return "/tCouponType/dialog";
		} else {
			return "/tCouponType/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCouponType tCouponType = tCouponTypeService.get(id);
		model.addAttribute("tCouponType", tCouponType);
		model.addAttribute("current", "tCouponType");
		return "/tCouponType/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCouponType tCouponType = tCouponTypeService.get(id);
		model.addAttribute("tCouponType", tCouponType);
		model.addAttribute("current", "tCouponType");
		return "/tCouponType/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCouponType tCouponType,Model model) {
		tCouponType.setId("0");
		model.addAttribute("tCouponType", tCouponType);
		return "/tCouponType/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCouponType tCouponType, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCouponType.getId())){
			tCouponTypeService.create(tCouponType);
		} else {
			tCouponTypeService.update(tCouponType);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCouponType/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCouponTypeService.remove(id);
                tCouponTypeService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCouponType/list.do";
	}
}
