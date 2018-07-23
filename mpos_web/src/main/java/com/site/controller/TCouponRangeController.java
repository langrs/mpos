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
import com.site.entity.TCouponRange;
import com.site.service.TCouponRangeService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCouponRange Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCouponRange/")
public class TCouponRangeController extends BaseController {

	@Resource
	private TCouponRangeService tCouponRangeService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCouponRange tCouponRange,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCouponRange> list=tCouponRangeService.search(BeanToMap.beanToMap(tCouponRange));
		model.addAttribute("list", list);
		model.addAttribute("tCouponRange", tCouponRange);
		model.addAttribute("current", "tCouponRange");
                if (dialog != null && dialog) {
			return "/tCouponRange/dialog";
		} else {
			return "/tCouponRange/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCouponRange tCouponRange = tCouponRangeService.get(id);
		model.addAttribute("tCouponRange", tCouponRange);
		model.addAttribute("current", "tCouponRange");
		return "/tCouponRange/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCouponRange tCouponRange = tCouponRangeService.get(id);
		model.addAttribute("tCouponRange", tCouponRange);
		model.addAttribute("current", "tCouponRange");
		return "/tCouponRange/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCouponRange tCouponRange,Model model) {
		tCouponRange.setId("0");
		model.addAttribute("tCouponRange", tCouponRange);
		return "/tCouponRange/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCouponRange tCouponRange, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCouponRange.getId())){
			tCouponRangeService.create(tCouponRange);
		} else {
			tCouponRangeService.update(tCouponRange);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCouponRange/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCouponRangeService.remove(id);
                tCouponRangeService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCouponRange/list.do";
	}
}
