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
import com.site.entity.TCoupon;
import com.site.service.TCouponService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCoupon Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCoupon/")
public class TCouponController extends BaseController {

	@Resource
	private TCouponService tCouponService;

        @Myannotation(description = "券基本信息券状态列表")
	@RequestMapping(value = "list.do")
	public String list(TCoupon tCoupon,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCoupon> list=tCouponService.search(BeanToMap.beanToMap(tCoupon));
		model.addAttribute("list", list);
		model.addAttribute("tCoupon", tCoupon);
		model.addAttribute("current", "tCoupon");
                if (dialog != null && dialog) {
			return "/tCoupon/dialog";
		} else {
			return "/tCoupon/list";
		}
	}
	
        @Myannotation(description = "券基本信息券状态详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCoupon tCoupon = tCouponService.get(id);
		model.addAttribute("tCoupon", tCoupon);
		model.addAttribute("current", "tCoupon");
		return "/tCoupon/view";
	}
	
        @Myannotation(description = "券基本信息券状态更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCoupon tCoupon = tCouponService.get(id);
		model.addAttribute("tCoupon", tCoupon);
		model.addAttribute("current", "tCoupon");
		return "/tCoupon/add";
	}
	
        @Myannotation(description = "券基本信息券状态新增")
	@RequestMapping(value = "add.do")
	public String add(TCoupon tCoupon,Model model) {
		tCoupon.setId("0");
		model.addAttribute("tCoupon", tCoupon);
		return "/tCoupon/add";
	}
	
        @Myannotation(description = "券基本信息券状态保存")
	@RequestMapping(value = "save.do")
	public String save(TCoupon tCoupon, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCoupon.getId())){
			tCouponService.create(tCoupon);
		} else {
			tCouponService.update(tCoupon);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCoupon/list.do";
	}
	
        @Myannotation(description = "券基本信息券状态删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCouponService.remove(id);
                tCouponService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCoupon/list.do";
	}
}
