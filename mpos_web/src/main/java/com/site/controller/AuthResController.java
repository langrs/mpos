package com.site.controller;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.core.annotation.Myannotation;
import com.site.core.base.BaseController;
import com.site.core.mybatis.QueryMap;
import com.site.entity.AuthRes;
import com.site.entity.Nav;
import com.site.service.AuthResService;
import com.site.service.NavService;
import com.site.util.BeanToMap;

/**
 * <pre>
 * 对象功能:authRes Controller类
 * 开发公司:ERP
 * 开发人员:huj
 * 创建时间:2015-03-24 14:24:29
 * </pre>
 */

@Controller
@RequestMapping(value = "authRes/")
public class AuthResController extends BaseController {
	@Autowired(required = false)
	private RequestMappingHandlerMapping requestMappingHandlerMapping;
	@Resource
	private AuthResService authResService;
	@Resource
	private NavService navService;
	private ArrayList<AuthRes> resList;// 这里的resList是不改变的，所以可以作为成员变量
	@Myannotation(description = "系统资源列表")
	@RequestMapping(value = "list.do")
	public String list(AuthRes authRes, HttpServletRequest request, HttpServletResponse response, Model model, Boolean dialog) {
		List<AuthRes> list = authResService.search(BeanToMap.beanToMap(authRes));
		model.addAttribute("list", list);
		model.addAttribute("authRes", authRes);
		model.addAttribute("current", "authRes");
		if (dialog != null && dialog) {
			return "/authRes/dialog";
		} else {
			return "/authRes/list";
		}
	}
	@Myannotation(description = "系统资源保存初始化")
	@RequestMapping(value = "saveInitData")
	public String saveInitData(Model mode, RedirectAttributes redirectAttributes) {

		// 生存菜单
		List<Nav> byParent = navService.getByParent(0L);
		Long id = null;
		if (byParent == null || byParent.size() == 0) {
			// 如果没有菜单，就创建
			Nav entity = new Nav();
			entity.setName("业务菜单");
			entity.setParent(0L);
			// 加到业务菜单下
			navService.create(entity);
			id = entity.getId();
		} else {
			Nav nav = byParent.get(0);
			id = nav.getId();
		}
		QueryMap map = new QueryMap();
		for (AuthRes authRe : resList) {
			String path = authRe.getPath();
			if (authRe.getName() != null) {
				if (navService.getByPath(path) == null) {
					String key = authRe.getKey();
					if (key.contains(":list")) {
						Nav entity = new Nav();
						entity.setId(idGenerator.getUId());
						entity.setParent(id);
						entity.setUrl(path);
						entity.setName(authRe.getName().replace("列表", "维护"));
						// 加到业务菜单下
						navService.create(entity);
					}
				}
			}

			// 生成资源
			map.put("key", authRe.getKey());
			AuthRes one = authResService.getOne(map);
			if (one == null) {
				int lastIndexOf = path.lastIndexOf("/");
				Nav nav = navService.getByPath(path.substring(0, lastIndexOf)+"/list.do");
				if (nav != null) {
					authRe.setNavId(nav.getId());
				}
				authRe.setId(idGenerator.getUId());
				authResService.create(authRe);
			}
		}

		addMessage(redirectAttributes, "初始化数据成功");
		return "redirect:/authRes/list.do";
	}

	/**
	 * 初始化资源
	 * 
	 * @param authRes
	 * @param request
	 * @param response
	 * @param model
	 * @param dialog
	 * @return
	 */
	@Myannotation(description = "系统资源初始化")
	@RequestMapping(value = "initRes.do")
	public String initRes(Model model) {
		resList = new ArrayList<AuthRes>();
		Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping.getHandlerMethods();
		for (Map.Entry<RequestMappingInfo, HandlerMethod> m : map.entrySet()) {
			AuthRes authRes = new AuthRes();
			RequestMappingInfo info = m.getKey();
			HandlerMethod method = m.getValue();
			Annotation[] declaredAnnotations = method.getMethod().getDeclaredAnnotations();
			String description = null;
			for (Annotation annotation : declaredAnnotations) {
				if (annotation instanceof Myannotation) {
					Myannotation ma = (Myannotation) annotation;
					description = ma.description();
				}
			}
			if (description != null) {
				authRes.setName(description);
			}
			String patternsCondition = info.getPatternsCondition().toString();
			patternsCondition = patternsCondition.replace("[", "").replace("]", "").replace("//", "/");
			if (!patternsCondition.startsWith("/auth/")) {
				authRes.setPath(patternsCondition);
				String declaringClass = method.getMethod().getDeclaringClass().toString();
				String methodName = method.getMethod().getName();
				declaringClass = declaringClass.replace("class ", "").replace("Controller", "");
				authRes.setKey(declaringClass + ":" + methodName);
				resList.add(authRes);
			}
		}
		model.addAttribute("resList", resList);
		return "/authRes/initRes";
	}
	@Myannotation(description = "系统资源详情")
	@RequestMapping(value = "/view.do")
	public String view(Long id, Model model) {
		AuthRes authRes = authResService.get(id);
		model.addAttribute("authRes", authRes);
		model.addAttribute("current", "authRes");
		return "/authRes/view";
	}
	@Myannotation(description = "系统资源更新")
	@RequestMapping(value = "/edit.do")
	public String edit(Long id, Model model) {
		AuthRes authRes = authResService.get(id);
		model.addAttribute("authRes", authRes);
		model.addAttribute("current", "authRes");
		return "/authRes/add";
	}
	@Myannotation(description = "系统资源新增")
	@RequestMapping(value = "add.do")
	public String add(AuthRes authRes, Model model) {
		authRes.setId(0L);
		model.addAttribute("authRes", authRes);
		return "/authRes/add";
	}
	@Myannotation(description = "系统资源保存")
	@RequestMapping(value = "save.do")
	public String save(AuthRes authRes, Model model, RedirectAttributes redirectAttributes) {
		if (authRes.getId() == 0) {
			authResService.create(authRes);
		} else {
			authResService.update(authRes);
		}
		addMessage(redirectAttributes, "保存数据成功");
		return "redirect:/authRes/list.do";
	}
	@Myannotation(description = "删除系统资源")
	@RequestMapping(value = "delete.do")
	public String delete(Long id, Model model, RedirectAttributes redirectAttributes, Long[] ids) {
		authResService.remove(id);
		authResService.removeByIds(ids);
		addMessage(redirectAttributes, "删除数据成功！");
		return "redirect:/authRes/list.do";
	}
}
