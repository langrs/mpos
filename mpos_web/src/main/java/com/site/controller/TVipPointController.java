package com.site.controller;

import com.site.core.annotation.Myannotation;
import com.site.core.base.BaseController;
import com.site.entity.TVipPoint;
import com.site.service.TVipPointService;
import com.site.util.BeanToMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *<pre>
 * 对象功能:tVipPoint Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tVipPoint/")
public class TVipPointController extends BaseController {

	@Resource
	private TVipPointService tVipPointService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TVipPoint tVipPoint,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TVipPoint> list=tVipPointService.search(BeanToMap.beanToMap(tVipPoint));
		model.addAttribute("list", list);
		model.addAttribute("tVipPoint", tVipPoint);
		model.addAttribute("current", "tVipPoint");
                if (dialog != null && dialog) {
			return "/tVipPoint/dialog";
		} else {
			return "/tVipPoint/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TVipPoint tVipPoint = tVipPointService.get(id);
		model.addAttribute("tVipPoint", tVipPoint);
		model.addAttribute("current", "tVipPoint");
		return "/tVipPoint/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TVipPoint tVipPoint = tVipPointService.get(id);
		model.addAttribute("tVipPoint", tVipPoint);
		model.addAttribute("current", "tVipPoint");
		return "/tVipPoint/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TVipPoint tVipPoint,Model model) {
		tVipPoint.setId("0");
		model.addAttribute("tVipPoint", tVipPoint);
		return "/tVipPoint/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TVipPoint tVipPoint, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tVipPoint.getId())){
			tVipPointService.create(tVipPoint);
		} else {
			tVipPointService.update(tVipPoint);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tVipPoint/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tVipPointService.remove(id);
                tVipPointService.removeByIds(ids);

		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tVipPoint/list.do";

	}
}
