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
import com.site.entity.TCustSaleinfo;
import com.site.service.TCustSaleinfoService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCustSaleinfo Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCustSaleinfo/")
public class TCustSaleinfoController extends BaseController {

	@Resource
	private TCustSaleinfoService tCustSaleinfoService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCustSaleinfo tCustSaleinfo,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCustSaleinfo> list=tCustSaleinfoService.search(BeanToMap.beanToMap(tCustSaleinfo));
		model.addAttribute("list", list);
		model.addAttribute("tCustSaleinfo", tCustSaleinfo);
		model.addAttribute("current", "tCustSaleinfo");
                if (dialog != null && dialog) {
			return "/tCustSaleinfo/dialog";
		} else {
			return "/tCustSaleinfo/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCustSaleinfo tCustSaleinfo = tCustSaleinfoService.get(id);
		model.addAttribute("tCustSaleinfo", tCustSaleinfo);
		model.addAttribute("current", "tCustSaleinfo");
		return "/tCustSaleinfo/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCustSaleinfo tCustSaleinfo = tCustSaleinfoService.get(id);
		model.addAttribute("tCustSaleinfo", tCustSaleinfo);
		model.addAttribute("current", "tCustSaleinfo");
		return "/tCustSaleinfo/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCustSaleinfo tCustSaleinfo,Model model) {
		tCustSaleinfo.setId("0");
		model.addAttribute("tCustSaleinfo", tCustSaleinfo);
		return "/tCustSaleinfo/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCustSaleinfo tCustSaleinfo, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCustSaleinfo.getId())){
			tCustSaleinfoService.create(tCustSaleinfo);
		} else {
			tCustSaleinfoService.update(tCustSaleinfo);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCustSaleinfo/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCustSaleinfoService.remove(id);
                tCustSaleinfoService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCustSaleinfo/list.do";
	}
}
