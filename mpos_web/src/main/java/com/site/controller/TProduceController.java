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
import com.site.entity.TProduce;
import com.site.service.TProduceService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tProduce Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tProduce/")
public class TProduceController extends BaseController {

	@Resource
	private TProduceService tProduceService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TProduce tProduce,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TProduce> list=tProduceService.search(BeanToMap.beanToMap(tProduce));
		model.addAttribute("list", list);
		model.addAttribute("tProduce", tProduce);
		model.addAttribute("current", "tProduce");
                if (dialog != null && dialog) {
			return "/tProduce/dialog";
		} else {
			return "/tProduce/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TProduce tProduce = tProduceService.get(id);
		model.addAttribute("tProduce", tProduce);
		model.addAttribute("current", "tProduce");
		return "/tProduce/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TProduce tProduce = tProduceService.get(id);
		model.addAttribute("tProduce", tProduce);
		model.addAttribute("current", "tProduce");
		return "/tProduce/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TProduce tProduce,Model model) {
		tProduce.setId("0");
		model.addAttribute("tProduce", tProduce);
		return "/tProduce/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TProduce tProduce, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tProduce.getId())){
			tProduceService.create(tProduce);
		} else {
			tProduceService.update(tProduce);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tProduce/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tProduceService.remove(id);
                tProduceService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tProduce/list.do";
	}
}
