package com.site.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.ResolverUtil.IsA;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.core.annotation.Myannotation;
import com.site.core.base.BaseController;
import com.site.entity.AuthRes;
import com.site.entity.Nav;
import com.site.entity.Role;
import com.site.entity.RoleRes;
import com.site.service.AuthResService;
import com.site.service.NavService;
import com.site.service.RoleResService;
import com.site.service.RoleService;
import com.site.util.BeanToMap;

/**
 * <pre>
 * 对象功能:role Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 * </pre>
 */

@Controller
@RequestMapping(value = "role/")
public class RoleController extends BaseController {

	@Resource
	private RoleService roleService;
	@Resource
	private AuthResService authResService;
	@Resource
	private NavService navService;
	@Resource
	private RoleResService roleResService;
	@Myannotation(description = "角色列表")
	@RequestMapping(value = "list.do")
	public String list(Role role, HttpServletRequest request, HttpServletResponse response, Model model, Boolean dialog) {
		List<Role> list = roleService.search(BeanToMap.beanToMap(role));
		model.addAttribute("list", list);
		model.addAttribute("role", role);
		model.addAttribute("current", "role");
		if (dialog != null && dialog) {
			return "/role/dialog";
		} else {
			return "/role/list";
		}
	}

	@Myannotation(description = "角色详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		Role role = roleService.get(id);
		List<Nav> list = getRoleList(id);
		model.addAttribute("list", list);
		model.addAttribute("role", role);
		model.addAttribute("current", "role");
		return "/role/view";
	}

	@Myannotation(description = "角色更新")
	@RequestMapping(value = "/edit.do")
	public String edit(Long id, Model model) {
		Role role = roleService.get(id);
		model.addAttribute("role", role);
		List<Nav> list = getRoleList(id);
		model.addAttribute("list", list);
		model.addAttribute("current", "role");
		return "/role/add";
	}

	@Myannotation(description = "角色新增")
	@RequestMapping(value = "add.do")
	public String add(Role role, Model model) {
		role.setId(0L);
		model.addAttribute("role", role);
		List<Nav> list = getRoleList(null);
		model.addAttribute("list", list);
		return "/role/add";
	}

	public List<Nav> getRoleList(Long roleId) {
		List<Nav> list = navService.getByParent(0L);
		StringBuffer resString = new StringBuffer();
		List<RoleRes> byRoleId = null;
		if (roleId != null) {
			byRoleId = roleResService.getByRoleId(roleId);
		}
		for (Nav nav : list) {
			List<Nav> chirldList = navService.getByParent(nav.getId());
			boolean isNavCheck = true;
			for (Nav ch : chirldList) {
				List<AuthRes> authResList = authResService.getByNavId(ch.getId());
				if (roleId != null) {
					for (RoleRes roleRes : byRoleId) {
						resString.append(roleRes.getResId() + ",");
					}
					boolean isAll = setAuthResList(authResList, resString);
					if (isAll) {
						ch.setIsCheck(1);
					} else {
						isNavCheck = false;
					}
				}
				ch.setAuthResList(authResList);
			}
			if (isNavCheck && roleId != null) {
				nav.setIsCheck(1);
			}
			nav.setChirldList(chirldList);
		}
		return list;
	}

	/**
	 * 设置资源列表，是否被选中
	 * 
	 * @param authResList
	 * @param hashMap
	 */
	private boolean setAuthResList(List<AuthRes> authResList, StringBuffer resString) {
		boolean isAll = true;
		for (AuthRes authRes : authResList) {
			if (resString.indexOf(authRes.getId().toString()) > -1) {
				authRes.setIsCheck(1);
			} else {
				isAll = false;
			}
		}
		return isAll;
	}

	@Myannotation(description = "角色保存")
	@RequestMapping(value = "save.do")
	public String save(Role role, Model model, RedirectAttributes redirectAttributes) {
		if (role.getStatus() == null) {
			role.setStatus(1);
		}
		Long[] permIds = role.getPermIds();
		if (role.getId() == 0) {
			roleService.createRoleRes(role, permIds);
		} else {
			roleService.updateRoleRes(role, permIds);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/role/list.do";
	}

	@Myannotation(description = "角色删除")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model, RedirectAttributes redirectAttributes, Long[] ids) {
		roleService.removeRoleAndRoleRes(id, ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/role/list.do";
	}
}
