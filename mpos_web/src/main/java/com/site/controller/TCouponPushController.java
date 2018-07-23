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
import com.site.entity.TCouponPush;
import com.site.service.TCouponPushService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCouponPush Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCouponPush/")
public class TCouponPushController extends BaseController {

	@Resource
	private TCouponPushService tCouponPushService;

        @Myannotation(description = "推送类型列表")
	@RequestMapping(value = "list.do")
	public String list(TCouponPush tCouponPush,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCouponPush> list=tCouponPushService.search(BeanToMap.beanToMap(tCouponPush));
		model.addAttribute("list", list);
		model.addAttribute("tCouponPush", tCouponPush);
		model.addAttribute("current", "tCouponPush");
                if (dialog != null && dialog) {
			return "/tCouponPush/dialog";
		} else {
			return "/tCouponPush/list";
		}
	}
	
        @Myannotation(description = "推送类型详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCouponPush tCouponPush = tCouponPushService.get(id);
		model.addAttribute("tCouponPush", tCouponPush);
		model.addAttribute("current", "tCouponPush");
		return "/tCouponPush/view";
	}
	
        @Myannotation(description = "推送类型更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCouponPush tCouponPush = tCouponPushService.get(id);
		model.addAttribute("tCouponPush", tCouponPush);
		model.addAttribute("current", "tCouponPush");
		return "/tCouponPush/add";
	}
	
        @Myannotation(description = "推送类型新增")
	@RequestMapping(value = "add.do")
	public String add(TCouponPush tCouponPush,Model model) {
		tCouponPush.setId("0");
		model.addAttribute("tCouponPush", tCouponPush);
		return "/tCouponPush/add";
	}
	
        @Myannotation(description = "推送类型保存")
	@RequestMapping(value = "save.do")
	public String save(TCouponPush tCouponPush, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCouponPush.getId())){
			tCouponPushService.create(tCouponPush);
		} else {
			tCouponPushService.update(tCouponPush);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCouponPush/list.do";
	}
	
        @Myannotation(description = "推送类型删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCouponPushService.remove(id);
                tCouponPushService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCouponPush/list.do";
	}
}
