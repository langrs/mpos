package com.site.controller;

import com.site.core.annotation.Myannotation;
import com.site.core.base.BaseController;
import com.site.entity.TCompany;
import com.site.service.TCodeService;
import com.site.service.TCompanyService;
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
 * 对象功能:tCompany Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCompany/")
public class TCompanyController extends BaseController {

	@Resource
	private TCompanyService tCompanyService;
	@Resource
	private TCodeService tCodeService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCompany tCompany,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCompany> list=tCompanyService.search(BeanToMap.beanToMap(tCompany));
		model.addAttribute("list", list);
			//获取数据字典

		model.addAttribute("tCompany", tCompany);
		model.addAttribute("current", "tCompany");
                if (dialog != null && dialog) {
			return "/tCompany/dialog";
		} else {
			return "/tCompany/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCompany tCompany = tCompanyService.get(id);
		model.addAttribute("tCompany", tCompany);
		model.addAttribute("current", "tCompany");
		return "/tCompany/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCompany tCompany = tCompanyService.get(id);
		model.addAttribute("tCompany", tCompany);
		model.addAttribute("current", "tCompany");
		return "/tCompany/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCompany tCompany,Model model) {
		tCompany.setId("0");
		model.addAttribute("tCompany", tCompany);
		return "/tCompany/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCompany tCompany, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCompany.getId())){
			tCompanyService.create(tCompany);
		} else {
			tCompanyService.update(tCompany);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCompany/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCompanyService.remove(id);
                tCompanyService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCompany/list.do";
	}
}
