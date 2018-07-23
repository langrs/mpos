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
import com.site.entity.TCustInfo;
import com.site.service.TCustInfoService;
import com.site.util.BeanToMap;

/**
 *<pre>
 * 对象功能:tCustInfo Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 *</pre>
 */

@Controller
@RequestMapping(value = "tCustInfo/")
public class TCustInfoController extends BaseController {

	@Resource
	private TCustInfoService tCustInfoService;

        @Myannotation(description = "列表")
	@RequestMapping(value = "list.do")
	public String list(TCustInfo tCustInfo,HttpServletRequest request,
			HttpServletResponse response, Model model,Boolean dialog) {
		List<TCustInfo> list=tCustInfoService.search(BeanToMap.beanToMap(tCustInfo));
		model.addAttribute("list", list);
		model.addAttribute("tCustInfo", tCustInfo);
		model.addAttribute("current", "tCustInfo");
                if (dialog != null && dialog) {
			return "/tCustInfo/dialog";
		} else {
			return "/tCustInfo/list";
		}
	}
	
        @Myannotation(description = "详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		TCustInfo tCustInfo = tCustInfoService.get(id);
		model.addAttribute("tCustInfo", tCustInfo);
		model.addAttribute("current", "tCustInfo");
		return "/tCustInfo/view";
	}
	
        @Myannotation(description = "更新")
	@RequestMapping(value = "/edit.do")
	public String edit( Long id, Model model) {
		TCustInfo tCustInfo = tCustInfoService.get(id);
		model.addAttribute("tCustInfo", tCustInfo);
		model.addAttribute("current", "tCustInfo");
		return "/tCustInfo/add";
	}
	
        @Myannotation(description = "新增")
	@RequestMapping(value = "add.do")
	public String add(TCustInfo tCustInfo,Model model) {
		tCustInfo.setId("0");
		model.addAttribute("tCustInfo", tCustInfo);
		return "/tCustInfo/add";
	}
	
        @Myannotation(description = "保存")
	@RequestMapping(value = "save.do")
	public String save(TCustInfo tCustInfo, Model model,
			RedirectAttributes redirectAttributes) {
                if("0".equals(tCustInfo.getId())){
			tCustInfoService.create(tCustInfo);
		} else {
			tCustInfoService.update(tCustInfo);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/tCustInfo/list.do";
	}
	
        @Myannotation(description = "删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model,
			RedirectAttributes redirectAttributes,Long[] ids) {
		tCustInfoService.remove(id);
                tCustInfoService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/tCustInfo/list.do";
	}
}
