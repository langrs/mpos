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
import com.site.entity.TCustCoupon;
import com.site.service.TCustCouponService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCustCoupon Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCustCoupon/")
public class TCustCouponController extends BaseController {

	@Resource
	private TCustCouponService tCustCouponService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCustCoupon tCustCoupon,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCustCoupon> list=tCustCouponService.search(BeanToMap.beanToMap(tCustCoupon));
		model.addAttribute("list", list);
		model.addAttribute("tCustCoupon", tCustCoupon);
		model.addAttribute("current", "tCustCoupon");
                if (dialog != null && dialog) {
			return "/tCustCoupon/dialog";
		} else {
			return "/tCustCoupon/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCustCoupon tCustCoupon = tCustCouponService.get(id);
		model.addAttribute("tCustCoupon", tCustCoupon);
		model.addAttribute("current", "tCustCoupon");
		return "/tCustCoupon/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCustCoupon tCustCoupon = tCustCouponService.get(id);
		model.addAttribute("tCustCoupon", tCustCoupon);
		model.addAttribute("current", "tCustCoupon");
		return "/tCustCoupon/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCustCoupon tCustCoupon,Model model) {
		tCustCoupon.setId("0");
		model.addAttribute("tCustCoupon", tCustCoupon);
		return "/tCustCoupon/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCustCoupon tCustCoupon, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCustCoupon.getId())){
			tCustCouponService.create(tCustCoupon);
		} else {
			tCustCouponService.update(tCustCoupon);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCustCoupon/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCustCouponService.remove(id);
                tCustCouponService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCustCoupon/list.do";
	}
}
