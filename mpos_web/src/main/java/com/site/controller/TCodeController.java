package com.site.controller;

import com.site.core.annotation.Myannotation;
import com.site.core.base.BaseController;
import com.site.entity.TCode;
import com.site.service.TCodeService;
import com.site.util.BeanToMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *<pre>
 * 对象功能:tCode Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCode/")
public class TCodeController extends BaseController {

	@Resource
	private TCodeService tCodeService;

	@Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCode tCode,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCode> list=tCodeService.search(BeanToMap.beanToMap(tCode));
		model.addAttribute("list", list);
		model.addAttribute("tCode", tCode);
		model.addAttribute("current", "tCode");
		//下拉数据字典
		List<String> listCodeType = new ArrayList<String>();
		listCodeType.add("0002");
		List<TCode> listTCode = tCodeService.queryByCodeType(listCodeType);
		model.addAttribute("listTCode",listTCode);

		if (dialog != null && dialog) {
			return "/tCode/dialog";
		} else {
			return "/tCode/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCode tCode = tCodeService.get(id);
		model.addAttribute("tCode", tCode);
		model.addAttribute("current", "tCode");
			//下拉数据字典
			List<String> listCodeType = new ArrayList<String>();
			listCodeType.add("0002");
			List<TCode> listTCode = tCodeService.queryByCodeType(listCodeType);
			model.addAttribute("listTCode",listTCode);

		return "/tCode/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCode tCode = tCodeService.get(id);
		model.addAttribute("tCode", tCode);
		model.addAttribute("current", "tCode");
			//下拉数据字典
			List<String> listCodeType = new ArrayList<String>();
			listCodeType.add("0002");
			List<TCode> listTCode = tCodeService.queryByCodeType(listCodeType);
			model.addAttribute("listTCode",listTCode);
		return "/tCode/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCode tCode,Model model) {
		tCode.setId("0");
		model.addAttribute("tCode", tCode);
			//下拉数据字典
			List<String> listCodeType = new ArrayList<String>();
			listCodeType.add("0002");
			List<TCode> listTCode = tCodeService.queryByCodeType(listCodeType);
			model.addAttribute("listTCode",listTCode);

		return "/tCode/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCode tCode, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCode.getId())){
			tCodeService.create(tCode);
		} else {
			tCodeService.update(tCode);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCode/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCodeService.remove(id);
                tCodeService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCode/list.do";
	}
}
